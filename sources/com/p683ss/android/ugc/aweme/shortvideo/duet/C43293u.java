package com.p683ss.android.ugc.aweme.shortvideo.duet;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.u */
final /* synthetic */ class C43293u extends C52720t {

    /* renamed from: a */
    public static final C52771j f109470a = new C43293u();

    C43293u() {
    }

    public final String getName() {
        return "touchGesture";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(DuetLayoutModeState.class);
    }

    public final String getSignature() {
        return "getTouchGesture()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((DuetLayoutModeState) obj).getTouchGesture());
    }
}
