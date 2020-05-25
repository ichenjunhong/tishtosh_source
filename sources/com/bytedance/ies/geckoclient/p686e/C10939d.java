package com.bytedance.ies.geckoclient.p686e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.bytedance.ies.geckoclient.e.d */
public final class C10939d {
    /* renamed from: a */
    public static String m22197a() {
        return Build.BRAND;
    }

    /* renamed from: c */
    public static int m22200c(Context context) {
        try {
            return ((Integer) m22196a(context, "GECKO_VERSION_CODE")).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m22198a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo a = C10940e.m22201a(packageManager, context.getPackageName(), 0);
            if (a == null) {
                return "";
            }
            return a.loadLabel(packageManager).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m22199b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "unknow";
            }
            NetworkInfo a = C10940e.m22202a(connectivityManager);
            if (a != null) {
                if (a.isAvailable()) {
                    NetworkInfo a2 = C10940e.m22203a(connectivityManager, 1);
                    if (a2 != null) {
                        State state = a2.getState();
                        if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                            return "WIFI";
                        }
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "unknow";
                    }
                }
            }
            return "unknow";
        } catch (Throwable unused) {
            return "unknow";
        }
    }

    /* renamed from: a */
    private static Object m22196a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return C10940e.m22201a(context.getPackageManager(), context.getPackageName(), 128).metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
