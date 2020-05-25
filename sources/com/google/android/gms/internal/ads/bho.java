package com.google.android.gms.internal.ads;

final class bho implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f42431a;

    /* renamed from: b */
    private final /* synthetic */ long f42432b;

    /* renamed from: c */
    private final /* synthetic */ long f42433c;

    /* renamed from: d */
    private final /* synthetic */ bhl f42434d;

    bho(bhl bhl, String str, long j, long j2) {
        this.f42434d = bhl;
        this.f42431a = str;
        this.f42432b = j;
        this.f42433c = j2;
    }

    public final void run() {
        this.f42434d.f42413m.mo28974a(this.f42431a, this.f42432b, this.f42433c);
    }
}
