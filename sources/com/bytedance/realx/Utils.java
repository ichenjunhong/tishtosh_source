package com.bytedance.realx;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.RXLogging.Severity;

public class Utils {
    private static Context mContext;

    public static String getAppPath() {
        RXLogging.enableLogToDebugOutput(Severity.LS_INFO);
        RXLogging.m25467d("Utils", "this is jni logging test");
        return mContext.getExternalFilesDir("").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }
}
