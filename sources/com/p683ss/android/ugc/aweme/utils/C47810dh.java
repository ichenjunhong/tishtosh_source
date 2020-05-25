package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.dh */
public final class C47810dh {

    /* renamed from: a */
    public static final C47810dh f120360a = new C47810dh();

    /* renamed from: com.ss.android.ugc.aweme.utils.dh$a */
    public enum C47811a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: b */
        private final int f120362b;

        public final int getValue() {
            return this.f120362b;
        }

        private C47811a(int i) {
            this.f120362b = i;
        }
    }

    private C47810dh() {
    }

    /* renamed from: a */
    public static final boolean m103451a(Context context) {
        C52711k.m112240b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo a = C47812di.m103454a((ConnectivityManager) systemService);
                if (a == null || !a.isAvailable()) {
                    return false;
                }
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m103453c(Context context) {
        C52711k.m112240b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo a = C47812di.m103454a((ConnectivityManager) systemService);
                if (a != null) {
                    if (a.isAvailable()) {
                        if (1 == a.getType()) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final C47811a m103452b(Context context) {
        C52711k.m112240b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo a = C47812di.m103454a((ConnectivityManager) systemService);
                if (a != null) {
                    if (a.isAvailable()) {
                        int type = a.getType();
                        if (1 == type) {
                            return C47811a.WIFI;
                        }
                        if (type != 0) {
                            return C47811a.MOBILE;
                        }
                        Object systemService2 = context.getSystemService("phone");
                        if (systemService2 != null) {
                            switch (((TelephonyManager) systemService2).getNetworkType()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    return C47811a.MOBILE_2G;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    return C47811a.MOBILE_3G;
                                case 13:
                                    return C47811a.MOBILE_4G;
                                default:
                                    return C47811a.MOBILE;
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
                        }
                    }
                }
                return C47811a.NONE;
            }
            throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return C47811a.MOBILE;
        }
    }
}
