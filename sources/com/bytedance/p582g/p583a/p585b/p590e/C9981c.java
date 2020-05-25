package com.bytedance.p582g.p583a.p585b.p590e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.bytedance.g.a.b.e.c */
public final class C9981c {

    /* renamed from: a */
    private static C9982a f27104a = C9982a.UNKNOWN;

    /* renamed from: com.bytedance.g.a.b.e.c$a */
    public enum C9982a {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f27106a;

        public final int getValue() {
            return this.f27106a;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private C9982a(int i) {
            this.f27106a = i;
        }
    }

    /* renamed from: a */
    public static C9982a m20070a(Context context) {
        try {
            NetworkInfo a = C9983d.m20071a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C9982a.WIFI;
                    }
                    if (type != 0) {
                        return C9982a.MOBILE;
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
                            return C9982a.MOBILE_3G;
                        case 13:
                            return C9982a.MOBILE_4G;
                        default:
                            return C9982a.MOBILE;
                    }
                }
            }
            return C9982a.NONE;
        } catch (Throwable unused) {
            return C9982a.MOBILE;
        }
    }
}
