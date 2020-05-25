package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20682h.C20683a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.r */
public final class C20643r extends C20683a {

    /* renamed from: a */
    private final WeakReference<C52686q<Integer, Integer, String, C52860x>> f56495a;

    public C20643r(C52686q<? super Integer, ? super Integer, ? super String, C52860x> qVar) {
        C52711k.m112240b(qVar, "listener");
        this.f56495a = new WeakReference<>(qVar);
    }

    /* renamed from: a */
    public final void mo43777a(int i, int i2, String str) {
        C52686q qVar = (C52686q) this.f56495a.get();
        if (qVar != null) {
            qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }
}
