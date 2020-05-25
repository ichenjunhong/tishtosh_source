package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20694l.C20695a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.m */
public final class C20638m extends C20695a {

    /* renamed from: a */
    private final WeakReference<C19233b> f56490a;

    public C20638m(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f56490a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo43770a(int i) {
        C19233b bVar = (C19233b) this.f56490a.get();
        if (bVar != null) {
            bVar.mo39624a(i);
        }
    }

    /* renamed from: a */
    public final void mo43771a(int i, int i2) {
        C19233b bVar = (C19233b) this.f56490a.get();
        if (bVar != null) {
            bVar.mo39625a(i, i2);
        }
    }
}
