package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.vq */
public final class C16326vq extends C16333vx {

    /* renamed from: a */
    private final WeakReference<C16315vf> f45786a;

    public C16326vq(C16315vf vfVar) {
        this.f45786a = new WeakReference<>(vfVar);
    }

    /* renamed from: a */
    public final void mo31439a(zzaxi zzaxi) {
        C16315vf vfVar = (C16315vf) this.f45786a.get();
        if (vfVar != null) {
            vfVar.mo31428a(zzaxi);
        }
    }
}
