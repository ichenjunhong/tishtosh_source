package com.google.android.gms.common.api.internal;

import android.support.p030v4.p038f.C0779b;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.u */
public class C15352u extends C15310ci {

    /* renamed from: b */
    public final C0779b<C15306cf<?>> f39636b = new C0779b<>();

    /* renamed from: c */
    public C15328d f39637c;

    public C15352u(C15335g gVar) {
        super(gVar);
        this.f39334a.mo28248a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public final void mo28143b() {
        super.mo28143b();
        m31909g();
    }

    /* renamed from: c */
    public final void mo28145c() {
        super.mo28145c();
        m31909g();
    }

    /* renamed from: d */
    public final void mo28146d() {
        super.mo28146d();
        C15328d dVar = this.f39637c;
        synchronized (C15328d.f39569c) {
            if (dVar.f39574g == this) {
                dVar.f39574g = null;
                dVar.f39575h.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28237a(ConnectionResult connectionResult, int i) {
        this.f39637c.mo28262b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo28238e() {
        this.f39637c.mo28264d();
    }

    /* renamed from: g */
    private final void m31909g() {
        if (!this.f39636b.isEmpty()) {
            this.f39637c.mo28260a(this);
        }
    }
}
