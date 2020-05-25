package com.bytedance.sdk.account.p878m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.sdk.account.C13072c;
import com.p683ss.android.C18962e;
import com.p683ss.android.C18963f;
import com.p683ss.android.account.C18495c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.account.m.e */
public final class C13212e {

    /* renamed from: com.bytedance.sdk.account.m.e$a */
    public enum C13213a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f34485a;

        public final int getValue() {
            return this.f34485a;
        }

        private C13213a(int i) {
            this.f34485a = i;
        }
    }

    /* renamed from: a */
    public static C13213a m26595a(Context context) {
        try {
            NetworkInfo a = C13214f.m26597a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    int type = a.getType();
                    if (1 == type) {
                        return C13213a.WIFI;
                    }
                    if (type != 0) {
                        return C13213a.MOBILE;
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
                            return C13213a.MOBILE_3G;
                        case 13:
                            return C13213a.MOBILE_4G;
                        default:
                            return C13213a.MOBILE;
                    }
                }
            }
            return C13213a.NONE;
        } catch (Throwable unused) {
            return C13213a.MOBILE;
        }
    }

    /* renamed from: a */
    public static C18963f m26596a(int i, String str, Map<String, String> map, List<C18962e> list) throws Exception {
        C13072c c = C18495c.m44742a().mo38463c();
        if (c != null) {
            return c.mo24749a(Integer.MAX_VALUE, str, map, list);
        }
        return null;
    }
}
