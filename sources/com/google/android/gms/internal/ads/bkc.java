package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bkc {

    /* renamed from: b */
    private static final int[] f42726b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f42727a;

    /* renamed from: c */
    private final byte[] f42728c = new byte[8];

    /* renamed from: d */
    private int f42729d;

    /* renamed from: a */
    public final void mo30305a() {
        this.f42729d = 0;
        this.f42727a = 0;
    }

    /* renamed from: a */
    public final long mo30304a(bja bja, boolean z, boolean z2) throws IOException, InterruptedException {
        if (this.f42729d == 0) {
            if (!bja.mo30258a(this.f42728c, 0, 1, z)) {
                return -1;
            }
            byte b = this.f42728c[0] & 255;
            this.f42727a = -1;
            int i = 0;
            while (true) {
                if (i >= f42726b.length) {
                    break;
                } else if ((f42726b[i] & b) != 0) {
                    this.f42727a = i + 1;
                    break;
                } else {
                    i++;
                }
            }
            if (this.f42727a != -1) {
                this.f42729d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        bja.mo30257a(this.f42728c, 1, this.f42727a - 1);
        if (z2) {
            byte[] bArr = this.f42728c;
            bArr[0] = (byte) (bArr[0] & (f42726b[this.f42727a - 1] ^ -1));
        }
        long j = 0;
        for (int i2 = 0; i2 < this.f42727a; i2++) {
            j = (j << 8) | ((long) (this.f42728c[i2] & 255));
        }
        this.f42729d = 0;
        return j;
    }
}
