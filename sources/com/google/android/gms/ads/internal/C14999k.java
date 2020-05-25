package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzyv;

/* renamed from: com.google.android.gms.ads.internal.k */
final class C14999k implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzyv f38734a;

    /* renamed from: b */
    private final /* synthetic */ C14998j f38735b;

    C14999k(C14998j jVar, zzyv zzyv) {
        this.f38735b = jVar;
        this.f38734a = zzyv;
    }

    public final void run() {
        synchronized (this.f38735b.f38733t) {
            C14998j jVar = this.f38735b;
            if (jVar.f38714a == null && jVar.f38715b != null) {
                C14998j.m30976a(this.f38735b, this.f38734a);
            } else {
                C14998j.m30977a(this.f38735b, this.f38734a, 1);
            }
        }
    }
}
