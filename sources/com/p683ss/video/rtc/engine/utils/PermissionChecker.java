package com.p683ss.video.rtc.engine.utils;

import android.support.p030v4.content.C0726c;
import com.p683ss.video.rtc.base.utils.RtcContextUtils;

/* renamed from: com.ss.video.rtc.engine.utils.PermissionChecker */
public class PermissionChecker {
    public static boolean checkAudioPermission() {
        if (C0726c.m2090a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (C0726c.m2090a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
