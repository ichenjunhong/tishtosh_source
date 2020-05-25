package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15430b;

final class bxl implements C15430b {

    /* renamed from: a */
    private final /* synthetic */ bxh f44519a;

    bxl(bxh bxh) {
        this.f44519a = bxh;
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        synchronized (this.f44519a.f44512b) {
            this.f44519a.f44515e = null;
            if (this.f44519a.f44513c != null) {
                this.f44519a.f44513c = null;
            }
            this.f44519a.f44512b.notifyAll();
        }
    }
}
