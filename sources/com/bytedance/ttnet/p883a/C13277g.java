package com.bytedance.ttnet.p883a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.bytedance.ttnet.a.g */
final class C13277g {
    /* renamed from: a */
    static NetworkInfo m26736a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static boolean m26737a(Context context) {
        try {
            return C23718g.m58207b().mo49153d();
        } catch (Exception unused) {
            return false;
        }
    }
}
