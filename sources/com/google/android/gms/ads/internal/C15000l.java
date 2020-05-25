package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzyv;

/* renamed from: com.google.android.gms.ads.internal.l */
final class C15000l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzyv f38736a;

    /* renamed from: b */
    private final /* synthetic */ int f38737b;

    /* renamed from: c */
    private final /* synthetic */ C14998j f38738c;

    C15000l(C14998j jVar, zzyv zzyv, int i) {
        this.f38738c = jVar;
        this.f38736a = zzyv;
        this.f38737b = i;
    }

    public final void run() {
        synchronized (this.f38738c.f38733t) {
            C14998j.m30977a(this.f38738c, this.f38736a, this.f38737b);
        }
    }
}
