package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class aij implements bhb {

    /* renamed from: a */
    WeakReference<bhb> f40598a;

    /* renamed from: b */
    private final /* synthetic */ aig f40599b;

    private aij(aig aig) {
        this.f40599b = aig;
        this.f40598a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo28977a(boolean z, int i) {
        bhb bhb = (bhb) this.f40598a.get();
        if (bhb != null) {
            bhb.mo28977a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo28975a() {
        bhb bhb = (bhb) this.f40598a.get();
        if (bhb != null) {
            bhb.mo28975a();
        }
    }

    /* renamed from: a */
    public final void mo28976a(bgy bgy) {
        this.f40599b.m32998a("PlayerError", bgy.getMessage());
        bhb bhb = (bhb) this.f40598a.get();
        if (bhb != null) {
            bhb.mo28976a(bgy);
        }
    }
}
