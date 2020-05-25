package com.google.android.gms.internal.ads;

final class bqx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bra f43630a;

    /* renamed from: b */
    private final /* synthetic */ bqt f43631b;

    bqx(bqt bqt, bra bra) {
        this.f43631b = bqt;
        this.f43630a = bra;
    }

    public final void run() {
        bra bra = this.f43630a;
        if (bra.f43644a != null) {
            bra.f43644a = null;
        }
        int size = this.f43631b.f43611j.size();
        for (int i = 0; i < size; i++) {
            ((bro) this.f43631b.f43611j.valueAt(i)).mo30619b();
        }
    }
}
