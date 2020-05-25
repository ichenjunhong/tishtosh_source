package com.p683ss.android.ugc.aweme.profile.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.c */
final /* synthetic */ class C40615c extends C52720t {

    /* renamed from: a */
    public static final C52771j f103573a = new C40615c();

    C40615c() {
    }

    public final String getName() {
        return "onHiddenChanged";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ProfileState.class);
    }

    public final String getSignature() {
        return "getOnHiddenChanged()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
    }
}
