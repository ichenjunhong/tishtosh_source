package com.zego.zegoliveroom.utils;

import android.os.Build;
import android.os.Build.VERSION;

public class ZegoCommonUtils {
    public static boolean isDeviceInBlackList() {
        return isMeizu_M5_Note_70_mt6755();
    }

    private static boolean isMeizu_M5_Note_70_mt6755() {
        if (!"meizu_M5 Note".equals(Build.PRODUCT) || !"7.0".equals(VERSION.RELEASE) || !"mt6755".equals(Build.HARDWARE)) {
            return false;
        }
        return true;
    }
}
