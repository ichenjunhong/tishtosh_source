package com.bytedance.p702im.core.internal.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.bytedance.im.core.internal.utils.h */
public final class C11471h {
    /* renamed from: a */
    public static NetworkInfo m23482a(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
