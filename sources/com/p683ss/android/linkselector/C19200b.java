package com.p683ss.android.linkselector;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import com.p683ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;

/* renamed from: com.ss.android.linkselector.b */
final class C19200b {
    /* renamed from: a */
    static NetworkInfo m46809a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static boolean m46810a(LinkSelector linkSelector) {
        if (C10181b.m20511a().mo18168a(LinkSelectorTypeExperiment.class, true, "link_selector_type", 31744, 1) == 1) {
            return false;
        }
        return linkSelector.f52900a;
    }
}
