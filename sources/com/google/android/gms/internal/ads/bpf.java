package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bpf {

    /* renamed from: a */
    final btr f43313a = new btr(8);

    /* renamed from: b */
    int f43314b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo30536a(bol bol) throws IOException, InterruptedException {
        int i = 0;
        bol.mo30505c(this.f43313a.f43867a, 0, 1);
        byte b = this.f43313a.f43867a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        bol.mo30505c(this.f43313a.f43867a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f43313a.f43867a[i] & 255) + (i4 << 8);
        }
        this.f43314b += i3 + 1;
        return (long) i4;
    }
}
