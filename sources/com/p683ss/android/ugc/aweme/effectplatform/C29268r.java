package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.r */
public abstract class C29268r implements C48696a {

    /* renamed from: b */
    public final C48696a f76636b;

    /* renamed from: a */
    public abstract void mo59185a();

    public C29268r(C48696a aVar) {
        C52711k.m112240b(aVar, "checkListener");
        this.f76636b = aVar;
    }

    /* renamed from: a */
    public final void mo8639a(C48649d dVar) {
        this.f76636b.mo8639a(dVar);
        mo59185a();
    }

    /* renamed from: a */
    public final void mo8640a(boolean z) {
        this.f76636b.mo8640a(z);
        mo59185a();
    }
}
