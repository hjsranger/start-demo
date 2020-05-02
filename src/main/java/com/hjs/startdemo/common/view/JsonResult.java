package com.hjs.startdemo.common.view;

import lombok.Data;

@Data
public class JsonResult<T> {

    private boolean success;

    private long code;

    private String returnMessage;

    private T data;

    private Long count;

    public JsonResult(){}

    public JsonResult(ResultCode resultCode){
        this.success = resultCode.success;
        this.code = resultCode.code;
        this.returnMessage = resultCode.message;
    }

    public JsonResult(Integer code, T data, Long count) {
        this.code = code;
        this.data = data;
        this.count = count;
    }

}
