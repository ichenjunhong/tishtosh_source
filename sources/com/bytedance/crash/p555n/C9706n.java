package com.bytedance.crash.p555n;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.crash.p554m.C9668b.C9670b;

/* renamed from: com.bytedance.crash.n.n */
public final class C9706n {
    /* renamed from: b */
    public static boolean m19412b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo a = C9708o.m19413a(connectivityManager);
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m19411a(C9670b bVar) {
        String str = "";
        try {
            switch (bVar) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE:
                    str = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public static C9670b m19410a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return C9670b.NONE;
            }
            NetworkInfo a = C9708o.m19413a(connectivityManager);
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9670b.WIFI;
                    }
                    if (type != 0) {
                        return C9670b.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return C9670b.MOBILE_3G;
                        case 13:
                            return C9670b.MOBILE_4G;
                        default:
                            return C9670b.MOBILE;
                    }
                }
            }
            return C9670b.NONE;
        } catch (Throwable unused) {
            return C9670b.MOBILE;
        }
    }
}
