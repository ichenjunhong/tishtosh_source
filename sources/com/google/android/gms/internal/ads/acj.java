package com.google.android.gms.internal.ads;

import android.content.Context;

final class acj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f40260a;

    /* renamed from: b */
    private final /* synthetic */ acd f40261b;

    acj(acd acd, Context context) {
        this.f40261b = acd;
        this.f40260a = context;
    }

    public final void run() {
        synchronized (this.f40261b.f40251g) {
            this.f40261b.f40246b = acd.m32601c(this.f40260a);
            this.f40261b.f40251g.notifyAll();
        }
    }
}
