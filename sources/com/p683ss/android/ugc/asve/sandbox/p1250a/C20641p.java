package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d.C20671a;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.p */
public final class C20641p extends C20671a {

    /* renamed from: a */
    private final WeakReference<C50616e> f56493a;

    /* renamed from: a */
    public final boolean mo43775a() {
        C50616e eVar = (C50616e) this.f56493a.get();
        if (eVar != null) {
            return eVar.mo43762a();
        }
        return false;
    }

    public C20641p(C50616e eVar) {
        this.f56493a = new WeakReference<>(eVar);
    }

    /* renamed from: a */
    public final void mo43774a(int i, int i2, int i3, int i4, long j) {
        C50616e eVar = (C50616e) this.f56493a.get();
        if (eVar != null) {
            eVar.mo43761a(null, i, i2, i3, i4, j);
        }
    }
}
