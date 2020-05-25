package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa.C20662a;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ab */
public final class C20595ab extends C20662a {

    /* renamed from: a */
    private final WeakReference<C50625m> f56440a;

    public C20595ab(C50625m mVar) {
        C52711k.m112240b(mVar, "listener");
        this.f56440a = new WeakReference<>(mVar);
    }

    /* renamed from: a */
    public final void mo43744a(int i, float f) {
        C50625m mVar = (C50625m) this.f56440a.get();
        if (mVar != null) {
            mVar.mo43397a(i, f);
        }
    }
}
