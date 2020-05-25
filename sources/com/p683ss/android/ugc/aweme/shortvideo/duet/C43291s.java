package com.p683ss.android.ugc.aweme.shortvideo.duet;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.s */
final /* synthetic */ class C43291s extends C52720t {

    /* renamed from: a */
    public static final C52771j f109468a = new C43291s();

    C43291s() {
    }

    public final String getName() {
        return "changeDirectionMode";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(DuetLayoutModeState.class);
    }

    public final String getSignature() {
        return "getChangeDirectionMode()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((DuetLayoutModeState) obj).getChangeDirectionMode());
    }
}
