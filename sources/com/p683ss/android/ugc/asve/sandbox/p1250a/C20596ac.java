package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x.C20731a;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ac */
public final class C20596ac extends C20731a {

    /* renamed from: a */
    private final WeakReference<C50627o> f56441a;

    public C20596ac(C50627o oVar) {
        C52711k.m112240b(oVar, "listener");
        this.f56441a = new WeakReference<>(oVar);
    }

    /* renamed from: a */
    public final void mo43745a(boolean z) {
        C50627o oVar = (C50627o) this.f56441a.get();
        if (oVar != null) {
            oVar.mo43756a(z);
        }
    }
}
