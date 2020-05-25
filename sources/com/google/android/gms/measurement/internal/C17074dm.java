package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.measurement.internal.C17079dr;

/* renamed from: com.google.android.gms.measurement.internal.dm */
public final class C17074dm<T extends Context & C17079dr> {

    /* renamed from: a */
    public final T f48199a;

    public C17074dm(T t) {
        C15464q.m32123a(t);
        this.f48199a = t;
    }

    /* renamed from: a */
    public final void mo33060a() {
        C17005ay.m41256a((Context) this.f48199a, (C17128m) null).mo32854q().f48453j.mo33376a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo33063b() {
        C17005ay.m41256a((Context) this.f48199a, (C17128m) null).mo32854q().f48453j.mo33376a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: a */
    public final void mo33061a(Runnable runnable) {
        C17092ed a = C17092ed.m41559a((Context) this.f48199a);
        a.mo32853p().mo32912a((Runnable) new C17078dq(this, a, runnable));
    }

    /* renamed from: a */
    public final boolean mo33062a(Intent intent) {
        if (intent == null) {
            mo33065c().f48445b.mo33376a("onUnbind called with null intent");
            return true;
        }
        mo33065c().f48453j.mo33377a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: b */
    public final void mo33064b(Intent intent) {
        if (intent == null) {
            mo33065c().f48445b.mo33376a("onRebind called with null intent");
            return;
        }
        mo33065c().f48453j.mo33377a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    public final C17133r mo33065c() {
        return C17005ay.m41256a((Context) this.f48199a, (C17128m) null).mo32854q();
    }
}
