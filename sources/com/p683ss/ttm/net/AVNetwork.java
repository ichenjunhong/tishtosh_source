package com.p683ss.ttm.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.ss.ttm.net.AVNetwork */
public final class AVNetwork {

    /* renamed from: com.ss.ttm.net.AVNetwork$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110624xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public static final int getNetworkType(Context context) {
        try {
            NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110624xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
            if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo == null) {
                return 0;
            }
            int type = com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.getType();
            if (type == 1) {
                return 1;
            }
            if (type == 0) {
                return 2;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
