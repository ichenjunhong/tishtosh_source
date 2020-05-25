package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j.C20689a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.w */
public final class C20648w extends C20689a {

    /* renamed from: a */
    private final WeakReference<C52671b<Integer, C52860x>> f56500a;

    public C20648w(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f56500a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo43782a(int i) {
        C52671b bVar = (C52671b) this.f56500a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
