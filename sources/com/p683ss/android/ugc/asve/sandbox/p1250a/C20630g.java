package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n.C20701a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.g */
public final class C20630g extends C20701a {

    /* renamed from: a */
    private final WeakReference<C19269a> f56478a;

    /* renamed from: a */
    public final void mo43763a() {
        C19269a aVar = (C19269a) this.f56478a.get();
        if (aVar != null) {
            aVar.mo39714a();
        }
    }

    public C20630g(C19269a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f56478a = new WeakReference<>(aVar);
    }
}
