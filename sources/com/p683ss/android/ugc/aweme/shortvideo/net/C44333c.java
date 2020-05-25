package com.p683ss.android.ugc.aweme.shortvideo.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.net.c */
final class C44333c {
    /* renamed from: a */
    static NetworkInfo m97109a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static NetworkInfo m97110a(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
