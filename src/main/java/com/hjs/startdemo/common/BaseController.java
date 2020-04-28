package com.hjs.startdemo.common;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hjs.startdemo.common.view.JsonResult;
import com.hjs.startdemo.common.view.LoginUser;
import com.hjs.startdemo.common.view.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BaseController {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;
    @Autowired
    protected HttpSession session;

    public BaseController() {
    }

    public LoginUser getLoginUser(){

        LoginUser loginUser = new LoginUser();

        return loginUser;
    }


    public ResponseEntity<JsonResult> returnJsonResult(JsonResult result){
        return new ResponseEntity(result, HttpStatus.OK);
    }

    public ResponseEntity<JsonResult> wrapperJsonResult(Object result) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(ReturnCode.SUCCESS);
        jsonResult.setReturnMessage("SUCCESS");
        jsonResult.setData(result);
        return new ResponseEntity(jsonResult, HttpStatus.OK);
    }

    public ResponseEntity<JsonResult> wrapperPageResult(IPage page) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(ReturnCode.SUCCESS);
        jsonResult.setReturnMessage("SUCCESS");
        jsonResult.setData(page.getRecords());
        jsonResult.setCount(page.getTotal());
        return new ResponseEntity(jsonResult, HttpStatus.OK);
    }

    public ResponseEntity<JsonResult> returnSuccessJson(String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(ReturnCode.SUCCESS);
        jsonResult.setReturnMessage(message);
        return new ResponseEntity(jsonResult, HttpStatus.OK);
    }

    public ResponseEntity<JsonResult> returnSuccessJson() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(ReturnCode.SUCCESS);
        jsonResult.setReturnMessage("SUCCESS");
        return new ResponseEntity(jsonResult, HttpStatus.OK);
    }

    public ResponseEntity<JsonResult> returnErrorJson(String message) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(ReturnCode.ERROR);
        jsonResult.setReturnMessage(message);
        return new ResponseEntity(jsonResult, HttpStatus.OK);
    }


}