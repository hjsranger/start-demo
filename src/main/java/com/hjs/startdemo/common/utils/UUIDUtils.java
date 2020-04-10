package com.hjs.startdemo.common.utils;

import java.util.UUID;

public class UUIDUtils {


    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }


}
