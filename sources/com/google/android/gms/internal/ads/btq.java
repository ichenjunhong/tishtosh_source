package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class btq {

    /* renamed from: a */
    private byte[] f43863a;

    /* renamed from: b */
    private int f43864b;

    /* renamed from: c */
    private int f43865c;

    /* renamed from: d */
    private int f43866d;

    public btq() {
    }

    public btq(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private btq(byte[] bArr, int i) {
        this.f43863a = bArr;
        this.f43866d = i;
    }

    /* renamed from: a */
    public final int mo30689a(int i) {
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        int i3 = i;
        byte b3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.f43865c != 0) {
                b2 = ((this.f43863a[this.f43864b + 1] & 255) >>> (8 - this.f43865c)) | ((this.f43863a[this.f43864b] & 255) << this.f43865c);
            } else {
                b2 = this.f43863a[this.f43864b];
            }
            i3 -= 8;
            b3 |= (255 & b2) << i3;
            this.f43864b++;
        }
        if (i3 > 0) {
            int i5 = this.f43865c + i3;
            byte b4 = (byte) (NormalGiftView.ALPHA_255 >> (8 - i3));
            if (i5 > 8) {
                b = (b4 & (((this.f43863a[this.f43864b] & 255) << (i5 - 8)) | ((255 & this.f43863a[this.f43864b + 1]) >> (16 - i5)))) | b3;
                this.f43864b++;
            } else {
                b = (b4 & ((this.f43863a[this.f43864b] & 255) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.f43864b++;
                }
            }
            b3 = b;
            this.f43865c = i5 % 8;
        }
        if (this.f43864b >= 0 && this.f43865c >= 0 && this.f43865c < 8 && (this.f43864b < this.f43866d || (this.f43864b == this.f43866d && this.f43865c == 0))) {
            z = true;
        }
        bti.m36701b(z);
        return b3;
    }
}
