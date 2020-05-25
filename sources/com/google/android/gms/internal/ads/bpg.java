package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bpg {

    /* renamed from: b */
    private static final long[] f43315b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f43316a;

    /* renamed from: c */
    private final byte[] f43317c = new byte[8];

    /* renamed from: d */
    private int f43318d;

    /* renamed from: a */
    public final void mo30538a() {
        this.f43318d = 0;
        this.f43316a = 0;
    }

    /* renamed from: a */
    public final long mo30537a(bol bol, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f43318d == 0) {
            if (!bol.mo30499a(this.f43317c, 0, 1, z)) {
                return -1;
            }
            this.f43316a = m36388a(this.f43317c[0] & 255);
            if (this.f43316a != -1) {
                this.f43318d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if (this.f43316a > i) {
            this.f43318d = 0;
            return -2;
        }
        if (this.f43316a != 1) {
            bol.mo30502b(this.f43317c, 1, this.f43316a - 1);
        }
        this.f43318d = 0;
        return m36389a(this.f43317c, this.f43316a, z2);
    }

    /* renamed from: a */
    public static int m36388a(int i) {
        for (int i2 = 0; i2 < f43315b.length; i2++) {
            if ((f43315b[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m36389a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f43315b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
