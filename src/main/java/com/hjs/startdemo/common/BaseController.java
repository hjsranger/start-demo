package com.hjs.startdemo.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hjs.startdemo.common.view.JsonResult;
import com.hjs.startdemo.common.view.LoginUser;
import com.hjs.startdemo.common.view.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
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


    public JsonResult returnJsonResult(JsonResult result){
        return result;
    }

    public JsonResult wrapperJsonResult(Object result) {
        JsonResult jsonResult = new JsonResult(ResultCode.SUCCESS);
        jsonResult.setData(result);
        return jsonResult;
    }

    public JsonResult wrapperPageResult(IPage page) {
        JsonResult jsonResult = new JsonResult(ResultCode.SUCCESS);
        jsonResult.setData(page.getRecords());
        jsonResult.setCount(page.getTotal());
        return jsonResult;
    }

    public JsonResult returnSuccessJson(String message) {
        JsonResult jsonResult = new JsonResult(ResultCode.SUCCESS);
        jsonResult.setReturnMessage(message);
        return jsonResult;
    }

    public JsonResult returnSuccessJson() {
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    public JsonResult returnErrorJson(String message) {
        JsonResult jsonResult = new JsonResult(ResultCode.FAIL);
        jsonResult.setReturnMessage(message);
        return jsonResult;
    }


}