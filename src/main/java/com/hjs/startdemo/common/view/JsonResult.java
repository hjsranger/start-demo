package com.hjs.startdemo.common.view;

import lombok.Data;

@Data
public class JsonResult<T> {

    private ReturnCode code;

    private String returnMessage;

    private T data;

    private Long count;

    public JsonResult(){}

    public JsonResult(ReturnCode code, T data, Long count) {
        this.code = code;
        this.data = data;
        this.count = count;
    }

}
