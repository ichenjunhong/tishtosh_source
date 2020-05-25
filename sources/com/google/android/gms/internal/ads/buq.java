package com.google.android.gms.internal.ads;

final class buq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f43976a;

    /* renamed from: b */
    private final /* synthetic */ int f43977b;

    /* renamed from: c */
    private final /* synthetic */ int f43978c;

    /* renamed from: d */
    private final /* synthetic */ float f43979d;

    /* renamed from: e */
    private final /* synthetic */ bul f43980e;

    buq(bul bul, int i, int i2, int i3, float f) {
        this.f43980e = bul;
        this.f43976a = i;
        this.f43977b = i2;
        this.f43978c = i3;
        this.f43979d = f;
    }

    public final void run() {
        this.f43980e.f43964b.mo29050a(this.f43976a, this.f43977b, this.f43978c, this.f43979d);
    }
}
