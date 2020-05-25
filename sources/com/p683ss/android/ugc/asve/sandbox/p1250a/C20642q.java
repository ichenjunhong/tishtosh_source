package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t.C20719a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.q */
public final class C20642q extends C20719a {

    /* renamed from: a */
    private final WeakReference<C19279a> f56494a;

    /* renamed from: a */
    public final void mo43776a() {
        C19279a aVar = (C19279a) this.f56494a.get();
        if (aVar != null) {
            aVar.mo39748a();
        }
    }

    public C20642q(C19279a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f56494a = new WeakReference<>(aVar);
    }
}
