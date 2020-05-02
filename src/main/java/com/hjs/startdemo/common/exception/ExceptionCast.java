package com.hjs.startdemo.common.exception;

import com.hjs.startdemo.common.view.ResultCode;

public class ExceptionCast {
    
    public static void cast(ResultCode resultCode){
        throw new CustomerException(resultCode);
    }
}
