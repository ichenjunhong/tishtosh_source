package com.p683ss.ttvideoengine.utils;

import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.ttvideoengine.utils.TTVideoEngineLog */
public class TTVideoEngineLog {
    public static int LogNotifyLevel = 116;
    public static int LogTurnOn = 112;
    public static TTVideoEngineLogListener mListener;

    /* renamed from: d */
    public static void m110645d(Throwable th) {
    }

    public static final void setListener(TTVideoEngineLogListener tTVideoEngineLogListener) {
        mListener = tTVideoEngineLogListener;
    }

    /* renamed from: d */
    public static final void m110644d(String str, String str2) {
        if (((LogNotifyLevel >> 1) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    /* renamed from: e */
    public static void m110646e(String str, String str2) {
        if (((LogNotifyLevel >> 6) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    /* renamed from: i */
    public static final void m110647i(String str, String str2) {
        if (((LogNotifyLevel >> 2) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    /* renamed from: k */
    public static final void m110648k(String str, String str2) {
        if (((LogNotifyLevel >> 4) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    public static final void setLogNotifyLevel(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogNotifyLevel;
        LogNotifyLevel = i3;
        LogNotifyLevel = (i2 << i) | i3;
    }

    /* renamed from: t */
    public static final void m110649t(String str, String str2) {
        if (((LogNotifyLevel >> 3) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    /* renamed from: w */
    public static final void m110650w(String str, String str2) {
        if (((LogNotifyLevel >> 5) & 1) == 1) {
            _notifyListener(str, str2);
        }
    }

    private static void _notifyListener(String str, String str2) {
        if (mListener != null && !TextUtils.isEmpty(str2)) {
            TTVideoEngineLogListener tTVideoEngineLogListener = mListener;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("TTVideoEngine: tag = ");
                sb.append(str);
                sb.append(";  ");
                sb.append(str2);
                sb.append("\n");
                str2 = sb.toString();
            }
            tTVideoEngineLogListener.consoleLog(str2);
        }
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = i3 | (i2 << i);
        if (i == 1 && i2 == 1) {
            int i4 = LogTurnOn & -5;
            LogTurnOn = i4;
            LogTurnOn = i4 | (i2 << 2);
            ABRConfig.setLoglevel(1);
        }
    }
}
