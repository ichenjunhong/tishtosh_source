package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class bts {

    /* renamed from: a */
    private byte[] f43870a;

    /* renamed from: b */
    private int f43871b;

    /* renamed from: c */
    private int f43872c;

    /* renamed from: d */
    private int f43873d = 0;

    public bts(byte[] bArr, int i, int i2) {
        this.f43870a = bArr;
        this.f43872c = i;
        this.f43871b = i2;
        m36738e();
    }

    /* renamed from: a */
    public final void mo30707a(int i) {
        int i2 = this.f43872c;
        this.f43872c += i / 8;
        this.f43873d += i % 8;
        if (this.f43873d > 7) {
            this.f43872c++;
            this.f43873d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f43872c) {
                m36738e();
                return;
            } else if (m36736c(i2)) {
                this.f43872c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo30708a() {
        return mo30710b(1) == 1;
    }

    /* renamed from: b */
    public final int mo30710b(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = m36736c(this.f43872c + 1) ? this.f43872c + 2 : this.f43872c + 1;
            if (this.f43873d != 0) {
                b2 = ((this.f43870a[i4] & 255) >>> (8 - this.f43873d)) | ((this.f43870a[this.f43872c] & 255) << this.f43873d);
            } else {
                b2 = this.f43870a[this.f43872c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f43872c = i4;
        }
        if (i > 0) {
            int i5 = this.f43873d + i;
            byte b4 = (byte) (NormalGiftView.ALPHA_255 >> (8 - i));
            int i6 = m36736c(this.f43872c + 1) ? this.f43872c + 2 : this.f43872c + 1;
            if (i5 > 8) {
                b = (b4 & (((255 & this.f43870a[i6]) >> (16 - i5)) | ((this.f43870a[this.f43872c] & 255) << (i5 - 8)))) | b3;
                this.f43872c = i6;
            } else {
                b = (b4 & ((255 & this.f43870a[this.f43872c]) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f43872c = i6;
                }
            }
            b3 = b;
            this.f43873d = i5 % 8;
        }
        m36738e();
        return b3;
    }

    /* renamed from: b */
    public final int mo30709b() {
        return m36737d();
    }

    /* renamed from: c */
    public final int mo30711c() {
        int d = m36737d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: d */
    private final int m36737d() {
        int i = 0;
        int i2 = 0;
        while (!mo30708a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo30710b(i2);
        }
        return i3 + i;
    }

    /* renamed from: c */
    private final boolean m36736c(int i) {
        return 2 <= i && i < this.f43871b && this.f43870a[i] == 3 && this.f43870a[i + -2] == 0 && this.f43870a[i - 1] == 0;
    }

    /* renamed from: e */
    private final void m36738e() {
        bti.m36701b(this.f43872c >= 0 && this.f43873d >= 0 && this.f43873d < 8 && (this.f43872c < this.f43871b || (this.f43872c == this.f43871b && this.f43873d == 0)));
    }
}
