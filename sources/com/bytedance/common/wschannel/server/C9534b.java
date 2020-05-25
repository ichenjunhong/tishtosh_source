package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.bytedance.common.wschannel.server.b */
public final class C9534b {

    /* renamed from: com.bytedance.common.wschannel.server.b$a */
    public enum C9535a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f25996a;

        public final int getValue() {
            return this.f25996a;
        }

        private C9535a(int i) {
            this.f25996a = i;
        }
    }

    /* renamed from: a */
    public static boolean m18929a(Context context) {
        try {
            NetworkInfo a = C9536c.m18931a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static C9535a m18930b(Context context) {
        try {
            NetworkInfo a = C9536c.m18931a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9535a.WIFI;
                    }
                    if (type != 0) {
                        return C9535a.MOBILE;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return C9535a.MOBILE;
                    }
                    if (!(telephonyManager.getNetworkType() == 3 || telephonyManager.getNetworkType() == 5 || telephonyManager.getNetworkType() == 6 || telephonyManager.getNetworkType() == 8 || telephonyManager.getNetworkType() == 9 || telephonyManager.getNetworkType() == 10 || telephonyManager.getNetworkType() == 12 || telephonyManager.getNetworkType() == 14)) {
                        if (telephonyManager.getNetworkType() != 15) {
                            if (telephonyManager.getNetworkType() == 13) {
                                return C9535a.MOBILE_4G;
                            }
                            return C9535a.MOBILE;
                        }
                    }
                    return C9535a.MOBILE_3G;
                }
            }
            return C9535a.NONE;
        } catch (Throwable unused) {
            return C9535a.MOBILE;
        }
    }
}
