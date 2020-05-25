package com.google.android.gms.internal.ads;

public final class bhv implements C15565ac {

    /* renamed from: a */
    private int f42440a;

    /* renamed from: b */
    private int f42441b;

    /* renamed from: c */
    private final int f42442c;

    /* renamed from: d */
    private final float f42443d;

    public bhv() {
        this(2500, 1, 1.0f);
    }

    private bhv(int i, int i2, float f) {
        this.f42440a = 2500;
        this.f42442c = 1;
        this.f42443d = 1.0f;
    }

    /* renamed from: a */
    public final int mo28658a() {
        return this.f42440a;
    }

    /* renamed from: b */
    public final int mo28660b() {
        return this.f42441b;
    }

    /* renamed from: a */
    public final void mo28659a(C15812cq cqVar) throws C15812cq {
        boolean z = true;
        this.f42441b++;
        this.f42440a += (int) (((float) this.f42440a) * this.f42443d);
        if (this.f42441b > this.f42442c) {
            z = false;
        }
        if (!z) {
            throw cqVar;
        }
    }
}
