package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z.C20737a;
import com.p683ss.android.vesdk.C50790w;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.aa */
public final class C20594aa extends C20737a {

    /* renamed from: a */
    private final WeakReference<C50790w> f56439a;

    public C20594aa(C50790w wVar) {
        C52711k.m112240b(wVar, "listener");
        this.f56439a = new WeakReference<>(wVar);
    }

    /* renamed from: a */
    public final void mo43743a(boolean z, boolean z2) {
        C50790w wVar = (C50790w) this.f56439a.get();
        if (wVar != null) {
            wVar.mo43759a(z, z2);
        }
    }
}
