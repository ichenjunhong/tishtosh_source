package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20697m.C20698a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.s */
public final class C20644s extends C20698a {

    /* renamed from: a */
    private final WeakReference<C52671b<Integer, C52860x>> f56496a;

    public C20644s(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f56496a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo43778a(int i) {
        C52671b bVar = (C52671b) this.f56496a.get();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
