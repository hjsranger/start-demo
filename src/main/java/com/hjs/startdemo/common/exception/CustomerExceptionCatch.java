package com.hjs.startdemo.common.exception;

import com.hjs.startdemo.common.view.JsonResult;
import com.hjs.startdemo.common.view.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常统一处理
 */
@Slf4j
@ControllerAdvice
public class CustomerExceptionCatch {

    /**
     * 处理自定义异常
     * @param exception
     * @return
     */
    @ExceptionHandler(CustomerException.class)
    @ResponseBody
    public JsonResult customerExceptionHanlder(CustomerException exception){
        ResultCode code = exception.getResultCode();
        return new JsonResult(code);
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult exceptionHanlder(Exception e){
        log.error("异常：" + e.getMessage());
        return new JsonResult(ResultCode.UNKNOWNERROR);
    }

}
