package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C15006c;

final /* synthetic */ class ans implements Runnable {

    /* renamed from: a */
    private final anq f41094a;

    ans(anq anq) {
        this.f41094a = anq;
    }

    public final void run() {
        anq anq = this.f41094a;
        anq.f41068a.mo29144H();
        C15006c s = anq.f41068a.mo29187s();
        if (s != null) {
            s.mo27688m();
        }
        if (anq.f41077j != null) {
            anq.f41077j.mo27576a();
            anq.f41077j = null;
        }
    }
}
