package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bko implements bki {

    /* renamed from: a */
    private final int f42792a = 262144;

    /* renamed from: b */
    private int f42793b;

    /* renamed from: c */
    private int f42794c;

    /* renamed from: d */
    private bkh[] f42795d = new bkh[100];

    public bko(int i) {
        blg.m35999a(true);
    }

    /* renamed from: a */
    public final synchronized bkh mo30309a() {
        this.f42793b++;
        if (this.f42794c > 0) {
            bkh[] bkhArr = this.f42795d;
            int i = this.f42794c - 1;
            this.f42794c = i;
            return bkhArr[i];
        }
        return new bkh(new byte[this.f42792a], 0);
    }

    /* renamed from: a */
    public final synchronized void mo30310a(bkh bkh) {
        blg.m35999a(bkh.f42776a.length == this.f42792a);
        this.f42793b--;
        if (this.f42794c == this.f42795d.length) {
            this.f42795d = (bkh[]) Arrays.copyOf(this.f42795d, this.f42795d.length << 1);
        }
        bkh[] bkhArr = this.f42795d;
        int i = this.f42794c;
        this.f42794c = i + 1;
        bkhArr[i] = bkh;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void mo30313a(int i) {
        int i2 = this.f42792a;
        int max = Math.max(0, (((i2 + 0) - 1) / i2) - this.f42793b);
        if (max < this.f42794c) {
            Arrays.fill(this.f42795d, max, this.f42794c, null);
            this.f42794c = max;
        }
    }

    /* renamed from: c */
    private final synchronized int m35958c() {
        return this.f42793b * this.f42792a;
    }

    /* renamed from: b */
    public final int mo30311b() {
        return this.f42792a;
    }

    /* renamed from: b */
    public final synchronized void mo30314b(int i) throws InterruptedException {
        while (m35958c() > i) {
            wait();
        }
    }
}
