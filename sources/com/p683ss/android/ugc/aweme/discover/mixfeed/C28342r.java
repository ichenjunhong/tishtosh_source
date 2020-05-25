package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew.RealApi;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.r */
public final class C28342r {
    /* renamed from: a */
    public static final C0013i<C28334m> m67285a(C28338q qVar) {
        String str;
        C52711k.m112240b(qVar, "request");
        RealApi b = SearchApiNew.m66835b();
        String str2 = qVar.f74393b;
        int i = qVar.f74394c;
        int i2 = qVar.f74395d;
        int i3 = qVar.f74396e;
        String str3 = null;
        if (!TextUtils.isEmpty(qVar.f74402k)) {
            str = qVar.f74402k;
        } else {
            str = null;
        }
        int i4 = qVar.f74403l;
        double d = qVar.f74397f;
        double d2 = qVar.f74398g;
        if (!TextUtils.isEmpty(qVar.f74399h)) {
            str3 = qVar.f74399h;
        }
        return b.searchMTMixFeedList(str2, i, i2, i3, str, i4, d, d2, str3, qVar.f74400i);
    }
}
