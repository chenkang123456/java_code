package com.yq.common;

import java.util.UUID;

/**
 * 各种ID工具类
 */
public class IDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");

    }
}
