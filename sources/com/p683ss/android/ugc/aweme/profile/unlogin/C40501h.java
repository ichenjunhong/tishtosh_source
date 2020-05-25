package com.p683ss.android.ugc.aweme.profile.unlogin;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.h */
final /* synthetic */ class C40501h extends C52720t {

    /* renamed from: a */
    public static final C52771j f103372a = new C40501h();

    C40501h() {
    }

    public final String getName() {
        return "statusViewState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(UnloginProfileState.class);
    }

    public final String getSignature() {
        return "getStatusViewState()Lcom/ss/android/ugc/aweme/profile/unlogin/UnloginHintState;";
    }

    public final Object get(Object obj) {
        return ((UnloginProfileState) obj).getStatusViewState();
    }
}
