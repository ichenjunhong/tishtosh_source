package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bsv implements bsp {

    /* renamed from: a */
    private final boolean f43796a;

    /* renamed from: b */
    private final int f43797b;

    /* renamed from: c */
    private final byte[] f43798c;

    /* renamed from: d */
    private final bso[] f43799d;

    /* renamed from: e */
    private int f43800e;

    /* renamed from: f */
    private int f43801f;

    /* renamed from: g */
    private int f43802g;

    /* renamed from: h */
    private bso[] f43803h;

    public bsv(boolean z, int i) {
        this(true, 65536, 0);
    }

    private bsv(boolean z, int i, int i2) {
        bti.m36699a(true);
        bti.m36699a(true);
        this.f43796a = true;
        this.f43797b = 65536;
        this.f43802g = 0;
        this.f43803h = new bso[100];
        this.f43798c = null;
        this.f43799d = new bso[1];
    }

    /* renamed from: d */
    public final synchronized void mo30673d() {
        if (this.f43796a) {
            mo30672a(0);
        }
    }

    /* renamed from: a */
    public final synchronized void mo30672a(int i) {
        boolean z = i < this.f43800e;
        this.f43800e = i;
        if (z) {
            mo30668b();
        }
    }

    /* renamed from: a */
    public final synchronized bso mo30665a() {
        bso bso;
        this.f43801f++;
        if (this.f43802g > 0) {
            bso[] bsoArr = this.f43803h;
            int i = this.f43802g - 1;
            this.f43802g = i;
            bso = bsoArr[i];
            this.f43803h[this.f43802g] = null;
        } else {
            bso = new bso(new byte[this.f43797b], 0);
        }
        return bso;
    }

    /* renamed from: a */
    public final synchronized void mo30666a(bso bso) {
        this.f43799d[0] = bso;
        mo30667a(this.f43799d);
    }

    /* renamed from: a */
    public final synchronized void mo30667a(bso[] bsoArr) {
        boolean z;
        if (this.f43802g + bsoArr.length >= this.f43803h.length) {
            this.f43803h = (bso[]) Arrays.copyOf(this.f43803h, Math.max(this.f43803h.length << 1, this.f43802g + bsoArr.length));
        }
        for (bso bso : bsoArr) {
            if (bso.f43783a != null) {
                if (bso.f43783a.length != this.f43797b) {
                    z = false;
                    bti.m36699a(z);
                    bso[] bsoArr2 = this.f43803h;
                    int i = this.f43802g;
                    this.f43802g = i + 1;
                    bsoArr2[i] = bso;
                }
            }
            z = true;
            bti.m36699a(z);
            bso[] bsoArr22 = this.f43803h;
            int i2 = this.f43802g;
            this.f43802g = i2 + 1;
            bsoArr22[i2] = bso;
        }
        this.f43801f -= bsoArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo30668b() {
        int max = Math.max(0, btw.m36755a(this.f43800e, this.f43797b) - this.f43801f);
        if (max < this.f43802g) {
            Arrays.fill(this.f43803h, max, this.f43802g, null);
            this.f43802g = max;
        }
    }

    /* renamed from: e */
    public final synchronized int mo30674e() {
        return this.f43801f * this.f43797b;
    }

    /* renamed from: c */
    public final int mo30669c() {
        return this.f43797b;
    }
}
