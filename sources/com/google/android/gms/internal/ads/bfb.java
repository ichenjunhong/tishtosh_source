package com.google.android.gms.internal.ads;

final class bfb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ brw f42239a;

    /* renamed from: b */
    private final /* synthetic */ beb f42240b;

    bfb(beb beb, brw brw) {
        this.f42240b = beb;
        this.f42239a = brw;
    }

    public final void run() {
        try {
            this.f42240b.f42155d.put(this.f42239a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
