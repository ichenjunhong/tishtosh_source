package com.google.android.gms.internal.ads;

final class bpl {

    /* renamed from: a */
    public final int f43425a;

    /* renamed from: b */
    public int f43426b;

    /* renamed from: c */
    public int f43427c;

    /* renamed from: d */
    public long f43428d;

    /* renamed from: e */
    private final boolean f43429e;

    /* renamed from: f */
    private final btr f43430f;

    /* renamed from: g */
    private final btr f43431g;

    /* renamed from: h */
    private int f43432h;

    /* renamed from: i */
    private int f43433i;

    public bpl(btr btr, btr btr2, boolean z) {
        this.f43431g = btr;
        this.f43430f = btr2;
        this.f43429e = z;
        btr2.mo30697c(12);
        this.f43425a = btr2.mo30705i();
        btr.mo30697c(12);
        this.f43433i = btr.mo30705i();
        boolean z2 = true;
        if (btr.mo30703g() != 1) {
            z2 = false;
        }
        bti.m36702b(z2, "first_chunk must be 1");
        this.f43426b = -1;
    }

    /* renamed from: a */
    public final boolean mo30542a() {
        long j;
        int i = this.f43426b + 1;
        this.f43426b = i;
        if (i == this.f43425a) {
            return false;
        }
        if (this.f43429e) {
            j = this.f43430f.mo30706j();
        } else {
            j = this.f43430f.mo30702f();
        }
        this.f43428d = j;
        if (this.f43426b == this.f43432h) {
            this.f43427c = this.f43431g.mo30705i();
            this.f43431g.mo30699d(4);
            int i2 = this.f43433i - 1;
            this.f43433i = i2;
            this.f43432h = i2 > 0 ? this.f43431g.mo30705i() - 1 : -1;
        }
        return true;
    }
}
