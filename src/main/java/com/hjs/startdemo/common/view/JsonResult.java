package com.hjs.startdemo.common.view;


import com.fasterxml.jackson.annotation.JsonView;

public class JsonResult<T> {

    @JsonView({AppView.BaseResult.class})
    private ReturnCode code;

    @JsonView({AppView.BaseResult.class})
    private String returnMessage;

    @JsonView({AppView.BaseResult.class})
    private T data;

    @JsonView({AppView.Page.class})
    private Long count;

    public JsonResult(){}

    public JsonResult(ReturnCode code, T data, Long count) {
        this.code = code;
        this.data = data;
        this.count = count;
    }

    public ReturnCode getCode() {
        return code;
    }

    public void setCode(ReturnCode code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
