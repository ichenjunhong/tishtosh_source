package com.bytedance.jirafast.p751d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.bytedance.jirafast.d.j */
public final class C12040j {
    /* renamed from: c */
    private static boolean m24496c(Context context) {
        try {
            NetworkInfo a = C12041k.m24497a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m24494a(Context context) {
        if (!m24496c(context)) {
            return "无网络";
        }
        switch (m24495b(context)) {
            case 1:
                return "wifi";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
            default:
                return "未知网络";
        }
    }

    /* renamed from: b */
    private static int m24495b(Context context) {
        NetworkInfo a = C12041k.m24497a((ConnectivityManager) context.getSystemService("connectivity"));
        if (a == null || !a.isConnected()) {
            return 0;
        }
        int type = a.getType();
        if (type == 1) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }
}
