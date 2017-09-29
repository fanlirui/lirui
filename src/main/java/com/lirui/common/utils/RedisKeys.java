package com.lirui.common.utils;

/**
 * Redis所有Keys
 *
 * @date 2017-09-29
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
