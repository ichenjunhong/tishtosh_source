package com.google.android.gms.internal.ads;

public final class bll {

    /* renamed from: a */
    public byte[] f42850a;

    /* renamed from: b */
    public int f42851b;

    /* renamed from: c */
    public int f42852c;

    public bll() {
    }

    public bll(int i) {
        this.f42850a = new byte[i];
        this.f42852c = this.f42850a.length;
    }

    public bll(byte[] bArr) {
        this.f42850a = bArr;
        this.f42852c = bArr.length;
    }

    /* renamed from: a */
    public final void mo30328a(int i) {
        blg.m35999a(i >= 0 && i <= this.f42852c);
        this.f42851b = i;
    }

    /* renamed from: b */
    public final void mo30331b(int i) {
        mo30328a(this.f42851b + i);
    }

    /* renamed from: a */
    public final void mo30329a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f42850a, this.f42851b, bArr, i, i2);
        this.f42851b += i2;
    }

    /* renamed from: a */
    public final int mo30327a() {
        byte[] bArr = this.f42850a;
        int i = this.f42851b;
        this.f42851b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: b */
    public final int mo30330b() {
        byte[] bArr = this.f42850a;
        int i = this.f42851b;
        this.f42851b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f42850a;
        int i3 = this.f42851b;
        this.f42851b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: c */
    public final long mo30332c() {
        byte[] bArr = this.f42850a;
        int i = this.f42851b;
        this.f42851b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f42850a;
        int i2 = this.f42851b;
        this.f42851b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f42850a;
        int i3 = this.f42851b;
        this.f42851b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f42850a;
        int i4 = this.f42851b;
        this.f42851b = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: d */
    public final int mo30333d() {
        byte[] bArr = this.f42850a;
        int i = this.f42851b;
        this.f42851b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f42850a;
        int i3 = this.f42851b;
        this.f42851b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f42850a;
        int i4 = this.f42851b;
        this.f42851b = i4 + 1;
        byte b2 = b | ((bArr3[i4] & 255) << 8);
        byte[] bArr4 = this.f42850a;
        int i5 = this.f42851b;
        this.f42851b = i5 + 1;
        return b2 | (bArr4[i5] & 255);
    }

    /* renamed from: e */
    public final long mo30334e() {
        byte[] bArr = this.f42850a;
        int i = this.f42851b;
        this.f42851b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f42850a;
        int i2 = this.f42851b;
        this.f42851b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f42850a;
        int i3 = this.f42851b;
        this.f42851b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f42850a;
        int i4 = this.f42851b;
        this.f42851b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f42850a;
        int i5 = this.f42851b;
        this.f42851b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f42850a;
        int i6 = this.f42851b;
        this.f42851b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f42850a;
        int i7 = this.f42851b;
        this.f42851b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f42850a;
        int i8 = this.f42851b;
        this.f42851b = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: f */
    public final int mo30335f() {
        int d = mo30333d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public final long mo30336g() {
        long e = mo30334e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
}
