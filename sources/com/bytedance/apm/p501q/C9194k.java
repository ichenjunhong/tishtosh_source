package com.bytedance.apm.p501q;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.bytedance.apm.q.k */
final class C9194k {
    /* renamed from: a */
    static NetworkInfo m18262a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
