package com.p683ss.android.ugc.aweme.shortvideo.duet;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.v */
final /* synthetic */ class C43294v extends C52720t {

    /* renamed from: a */
    public static final C52771j f109471a = new C43294v();

    C43294v() {
    }

    public final String getName() {
        return "chosenPosition";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(DuetLayoutModeState.class);
    }

    public final String getSignature() {
        return "getChosenPosition()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((DuetLayoutModeState) obj).getChosenPosition());
    }
}
