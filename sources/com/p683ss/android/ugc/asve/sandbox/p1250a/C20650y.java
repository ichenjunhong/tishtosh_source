package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20673e.C20674a;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.y */
public final class C20650y extends C20674a {

    /* renamed from: a */
    private final WeakReference<C50542f> f56502a;

    public C20650y(C50542f fVar) {
        C52711k.m112240b(fVar, "listener");
        this.f56502a = new WeakReference<>(fVar);
    }

    /* renamed from: a */
    public final void mo43784a(int i, String str) {
        C50542f fVar = (C50542f) this.f56502a.get();
        if (fVar != null) {
            fVar.mo43336a(i);
        }
    }
}
