package com.google.android.gms.internal.ads;

final /* synthetic */ class ajs implements Runnable {

    /* renamed from: a */
    private final ajh f40705a;

    /* renamed from: b */
    private final boolean f40706b;

    /* renamed from: c */
    private final long f40707c;

    ajs(ajh ajh, boolean z, long j) {
        this.f40705a = ajh;
        this.f40706b = z;
        this.f40707c = j;
    }

    public final void run() {
        ajh ajh = this.f40705a;
        ajh.f40667a.mo28935a(this.f40706b, this.f40707c);
    }
}
