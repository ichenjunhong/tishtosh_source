package com.google.android.gms.internal.ads;

import android.os.Handler;

final class bns implements bnm {

    /* renamed from: a */
    private final /* synthetic */ bnq f43114a;

    private bns(bnq bnq) {
        this.f43114a = bnq;
    }

    /* renamed from: a */
    public final void mo30461a(int i) {
        bmy a = this.f43114a.f43106k;
        if (a.f43004b != null) {
            a.f43003a.post(new bnf(a, i));
        }
    }

    /* renamed from: a */
    public final void mo30460a() {
        this.f43114a.f43105g = true;
    }

    /* renamed from: a */
    public final void mo30462a(int i, long j, long j2) {
        bmy a = this.f43114a.f43106k;
        if (a.f43004b != null) {
            Handler handler = a.f43003a;
            bnd bnd = new bnd(a, i, j, j2);
            handler.post(bnd);
        }
    }
}
