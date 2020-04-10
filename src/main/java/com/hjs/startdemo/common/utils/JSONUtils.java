package com.hjs.startdemo.common.utils;

import org.json.JSONObject;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONUtils {

    /**
     * 获取String
     * @param obj
     * @param key
     * @return
     */
    public static String getString(JSONObject obj, String key){
        if(obj.isNull(key) || StringUtils.isEmpty(obj.getString(key))){
            return null;
        }
        return obj.getString(key);
    }


    /**
     * 获取日期类型
     * @param obj
     * @param key
     * @param sdf
     * @return
     */
    public static Date getDate(JSONObject obj, String key, SimpleDateFormat sdf){
        if(obj.isNull(key) || StringUtils.isEmpty(obj.getString(key))){
            return null;
        }
        try {
            return sdf.parse(obj.getString(key));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取int类型
     * @param obj
     * @param key
     * @return
     */
    public static Integer getInt(JSONObject obj, String key){
        if(obj.isNull(key)){
            return null;
        }
        return obj.getInt(key);
    }


    public static Double getDouble(JSONObject obj, String key){
        if(obj.isNull(key)){
            return null;
        }
        return obj.getDouble(key);
    }

}
