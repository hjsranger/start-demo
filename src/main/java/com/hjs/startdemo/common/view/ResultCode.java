package com.hjs.startdemo.common.view;

/**
 * 异常枚举类
 */
public enum ResultCode{
    SUCCESS(true,200,"操作成功！"),
    NO_PAGE(false,404,"没有信息"),
    FAIL(false,500,"操作失败！"),
    UNKNOWNERROR(false,999,"未知异常");

    boolean success;
    long code;
    String message;

    ResultCode(boolean success, long code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}