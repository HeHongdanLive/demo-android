package com.demo.demo_android.is_pad;

import android.content.Context;
import android.content.res.Configuration;

/**
 * 根据屏幕属性判断是否为平板电脑的工具类
 *
 * @author HHD
 * @date 2018/04/17
 */
public class Util {

    /**
     * 判断当前设备是手机还是平板，代码来自 Google I/O App for Android
     *
     * @param context   上下文
     * @return          平板返回true，手机返回false
     */
    public static boolean isPad(Context context) {
        return (context.getResources().getConfiguration().screenLayout//screenLayout 屏幕整体编码
                & Configuration.SCREENLAYOUT_SIZE_MASK)//SCREENLAYOUT_SIZE_MASK 屏幕大小编码
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;//SCREENLAYOUT_SIZE_LARGE 约为480x640dp单位，对应于大资源限定符
    }
}
