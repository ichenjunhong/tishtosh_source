package com.google.android.gms.internal.ads;

final class bhz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f42462a;

    /* renamed from: b */
    private final /* synthetic */ int f42463b;

    /* renamed from: c */
    private final /* synthetic */ float f42464c;

    /* renamed from: d */
    private final /* synthetic */ bhy f42465d;

    bhz(bhy bhy, int i, int i2, float f) {
        this.f42465d = bhy;
        this.f42462a = i;
        this.f42463b = i2;
        this.f42464c = f;
    }

    public final void run() {
        this.f42465d.f42446f.mo28979a(this.f42462a, this.f42463b, this.f42464c);
    }
}
