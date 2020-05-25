package com.p683ss.android.ugc.aweme.mix;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.mix.l */
final /* synthetic */ class C37071l extends C52720t {

    /* renamed from: a */
    public static final C52771j f94676a = new C37071l();

    C37071l() {
    }

    public final String getName() {
        return "mixInfo";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(MixDetailState.class);
    }

    public final String getSignature() {
        return "getMixInfo()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((MixDetailState) obj).getMixInfo();
    }
}
