package com.p683ss.mediakit.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.ss.mediakit.net.NetUtils */
public class NetUtils {

    /* renamed from: com.ss.mediakit.net.NetUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110478xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        try {
            return _lancet.m110478xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return null;
            }
            return networkInfo.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return -1;
            }
            return networkInfo.getType();
        } catch (Throwable unused) {
            return -1;
        }
    }
}
