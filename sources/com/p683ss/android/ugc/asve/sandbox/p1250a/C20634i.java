package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f.C20677a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.i */
public final class C20634i extends C20677a {

    /* renamed from: a */
    private final WeakReference<C19358a> f56486a;

    public C20634i(C19358a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f56486a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo43766a(int i, int i2) {
        C19358a aVar = (C19358a) this.f56486a.get();
        if (aVar != null) {
            aVar.mo40235b(i, i2);
        }
    }
}
