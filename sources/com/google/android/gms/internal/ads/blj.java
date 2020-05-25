package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class blj {

    /* renamed from: a */
    public int f42848a;

    /* renamed from: b */
    private long[] f42849b;

    public blj() {
        this(32);
    }

    private blj(int i) {
        this.f42849b = new long[32];
    }

    /* renamed from: a */
    public final void mo30326a(long j) {
        if (this.f42848a == this.f42849b.length) {
            this.f42849b = Arrays.copyOf(this.f42849b, this.f42848a << 1);
        }
        long[] jArr = this.f42849b;
        int i = this.f42848a;
        this.f42848a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public final long mo30325a(int i) {
        if (i >= 0 && i < this.f42848a) {
            return this.f42849b[i];
        }
        int i2 = this.f42848a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Invalid size ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
