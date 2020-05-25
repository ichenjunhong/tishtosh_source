package com.bytedance.apm.p501q;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.p030v4.content.C0726c;
import android.telephony.TelephonyManager;
import com.bytedance.apm.C8976c;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9425l.C9427b;

/* renamed from: com.bytedance.apm.q.j */
public final class C9193j {

    /* renamed from: a */
    private static C9427b f25162a;

    /* renamed from: b */
    private static C9426a f25163b = C9426a.UNKNOWN;

    /* renamed from: b */
    public static boolean m18259b(Context context) {
        try {
            NetworkInfo a = C9194k.m18262a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m18258a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (C0726c.m2090a(C8976c.m17736a(), "android.permission.ACCESS_NETWORK_STATE") == 0) {
                networkInfo = C9194k.m18262a(connectivityManager);
            }
            if (networkInfo != null) {
                if (networkInfo.isAvailable()) {
                    if (networkInfo.getType() == 0) {
                        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    }
                    return -10000;
                }
            }
            return -10000;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static boolean m18261d(Context context) {
        try {
            NetworkInfo a = C9194k.m18262a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    if (f25162a == null || f25162a.mo17067a() == C9426a.NONE) {
                        if (1 == a.getType()) {
                            return true;
                        }
                        return false;
                    } else if (f25162a.mo17067a() == C9426a.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static C9426a m18260c(Context context) {
        try {
            NetworkInfo a = C9194k.m18262a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9426a.WIFI;
                    }
                    if (type != 0) {
                        return C9426a.MOBILE;
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
                            return C9426a.MOBILE_3G;
                        case 13:
                            return C9426a.MOBILE_4G;
                        default:
                            return C9426a.MOBILE;
                    }
                }
            }
            return C9426a.NONE;
        } catch (Throwable unused) {
            return C9426a.MOBILE;
        }
    }
}
