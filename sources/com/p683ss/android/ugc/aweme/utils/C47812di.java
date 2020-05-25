package com.p683ss.android.ugc.aweme.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.ss.android.ugc.aweme.utils.di */
final class C47812di {
    /* renamed from: a */
    static NetworkInfo m103454a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
