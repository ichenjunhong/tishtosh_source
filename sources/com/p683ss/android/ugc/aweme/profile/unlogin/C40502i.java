package com.p683ss.android.ugc.aweme.profile.unlogin;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.i */
final /* synthetic */ class C40502i extends C52720t {

    /* renamed from: a */
    public static final C52771j f103373a = new C40502i();

    C40502i() {
    }

    public final String getName() {
        return "awemeList";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(UnloginProfileState.class);
    }

    public final String getSignature() {
        return "getAwemeList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((UnloginProfileState) obj).getAwemeList();
    }
}
