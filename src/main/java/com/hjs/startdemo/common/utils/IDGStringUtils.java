package com.hjs.startdemo.common.utils;

import org.springframework.util.StringUtils;

public class IDGStringUtils {

    /**
     * 文件类型
     * @param fileName
     * @return
     */
    public static String getFileType(String fileName){
        if(StringUtils.isEmpty(fileName)){
            return "";
        }
        return fileName.substring(fileName.lastIndexOf(".")+1);
    }

}
