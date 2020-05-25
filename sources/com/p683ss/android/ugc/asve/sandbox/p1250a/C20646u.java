package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i.C20686a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.u */
public final class C20646u extends C20686a {

    /* renamed from: a */
    private final WeakReference<C52671b<Integer, C52860x>> f56498a;

    public C20646u(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f56498a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo43780a(int i) {
        C52671b bVar = (C52671b) this.f56498a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
