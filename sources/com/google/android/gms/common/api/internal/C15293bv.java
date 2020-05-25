package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15358j;

/* renamed from: com.google.android.gms.common.api.internal.bv */
final class C15293bv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15358j f39470a;

    /* renamed from: b */
    private final /* synthetic */ C15292bu f39471b;

    C15293bv(C15292bu buVar, C15358j jVar) {
        this.f39471b = buVar;
        this.f39470a = jVar;
    }

    public final void run() {
        try {
            BasePendingResult.f39317c.set(Boolean.valueOf(true));
            this.f39471b.f39469i.sendMessage(this.f39471b.f39469i.obtainMessage(0, this.f39471b.f39461a.mo28300a(this.f39470a)));
            BasePendingResult.f39317c.set(Boolean.valueOf(false));
            C15292bu.m31694b(this.f39470a);
            C15233f fVar = (C15233f) this.f39471b.f39466f.get();
            if (fVar != null) {
                fVar.mo28106b(this.f39471b);
            }
        } catch (RuntimeException e) {
            this.f39471b.f39469i.sendMessage(this.f39471b.f39469i.obtainMessage(1, e));
            BasePendingResult.f39317c.set(Boolean.valueOf(false));
            C15292bu.m31694b(this.f39470a);
            C15233f fVar2 = (C15233f) this.f39471b.f39466f.get();
            if (fVar2 != null) {
                fVar2.mo28106b(this.f39471b);
            }
        } catch (Throwable th) {
            BasePendingResult.f39317c.set(Boolean.valueOf(false));
            C15292bu.m31694b(this.f39470a);
            C15233f fVar3 = (C15233f) this.f39471b.f39466f.get();
            if (fVar3 != null) {
                fVar3.mo28106b(this.f39471b);
            }
            throw th;
        }
    }
}
