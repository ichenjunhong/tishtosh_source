package com.google.android.gms.internal.ads;

final class bsy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f43822a;

    /* renamed from: b */
    private final /* synthetic */ long f43823b;

    /* renamed from: c */
    private final /* synthetic */ brw f43824c;

    bsy(brw brw, String str, long j) {
        this.f43824c = brw;
        this.f43822a = str;
        this.f43823b = j;
    }

    public final void run() {
        this.f43824c.f43735k.mo31043a(this.f43822a, this.f43823b);
        this.f43824c.f43735k.mo31042a(this.f43824c.toString());
    }
}
