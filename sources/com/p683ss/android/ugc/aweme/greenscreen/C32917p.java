package com.p683ss.android.ugc.aweme.greenscreen;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.p */
final /* synthetic */ class C32917p extends C52720t {

    /* renamed from: a */
    public static final C52771j f85572a = new C32917p();

    C32917p() {
    }

    public final String getName() {
        return "load";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(GreenScreenViewState.class);
    }

    public final String getSignature() {
        return "getLoad()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((GreenScreenViewState) obj).getLoad();
    }
}