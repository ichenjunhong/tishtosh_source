package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

final class bpp implements bpm {

    /* renamed from: a */
    private final btr f43441a;

    /* renamed from: b */
    private final int f43442b = this.f43441a.mo30705i();

    /* renamed from: c */
    private final int f43443c = (this.f43441a.mo30705i() & NormalGiftView.ALPHA_255);

    /* renamed from: d */
    private int f43444d;

    /* renamed from: e */
    private int f43445e;

    public bpp(bpj bpj) {
        this.f43441a = bpj.f43416az;
        this.f43441a.mo30697c(12);
    }

    /* renamed from: c */
    public final boolean mo30545c() {
        return false;
    }

    /* renamed from: a */
    public final int mo30543a() {
        return this.f43442b;
    }

    /* renamed from: b */
    public final int mo30544b() {
        if (this.f43443c == 8) {
            return this.f43441a.mo30698d();
        }
        if (this.f43443c == 16) {
            return this.f43441a.mo30700e();
        }
        int i = this.f43444d;
        this.f43444d = i + 1;
        if (i % 2 != 0) {
            return this.f43445e & 15;
        }
        this.f43445e = this.f43441a.mo30698d();
        return (this.f43445e & 240) >> 4;
    }
}
