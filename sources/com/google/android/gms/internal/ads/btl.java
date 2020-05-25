package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class btl {

    /* renamed from: a */
    public int f43847a;

    /* renamed from: b */
    private long[] f43848b;

    public btl() {
        this(32);
    }

    private btl(int i) {
        this.f43848b = new long[32];
    }

    /* renamed from: a */
    public final void mo30688a(long j) {
        if (this.f43847a == this.f43848b.length) {
            this.f43848b = Arrays.copyOf(this.f43848b, this.f43847a << 1);
        }
        long[] jArr = this.f43848b;
        int i = this.f43847a;
        this.f43847a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public final long mo30687a(int i) {
        if (i >= 0 && i < this.f43847a) {
            return this.f43848b[i];
        }
        int i2 = this.f43847a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
