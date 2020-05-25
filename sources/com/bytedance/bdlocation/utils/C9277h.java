package com.bytedance.bdlocation.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.bytedance.bdlocation.utils.h */
final class C9277h {
    /* renamed from: a */
    static NetworkInfo m18396a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static NetworkInfo m18397a(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
