package com.google.android.gms.internal.ads;

public final class boi implements bor {

    /* renamed from: a */
    private final int f43185a;

    /* renamed from: b */
    private final int[] f43186b;

    /* renamed from: c */
    private final long[] f43187c;

    /* renamed from: d */
    private final long[] f43188d;

    /* renamed from: e */
    private final long[] f43189e;

    /* renamed from: f */
    private final long f43190f;

    public boi(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f43186b = iArr;
        this.f43187c = jArr;
        this.f43188d = jArr2;
        this.f43189e = jArr3;
        this.f43185a = iArr.length;
        if (this.f43185a > 0) {
            this.f43190f = jArr2[this.f43185a - 1] + jArr3[this.f43185a - 1];
        } else {
            this.f43190f = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo30494a() {
        return true;
    }

    /* renamed from: b */
    public final long mo30495b() {
        return this.f43190f;
    }

    /* renamed from: a */
    public final long mo30493a(long j) {
        return this.f43187c[btw.m36757a(this.f43189e, j, true, true)];
    }
}
