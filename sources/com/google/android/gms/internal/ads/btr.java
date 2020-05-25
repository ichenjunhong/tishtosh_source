package com.google.android.gms.internal.ads;

public final class btr {

    /* renamed from: a */
    public byte[] f43867a;

    /* renamed from: b */
    public int f43868b;

    /* renamed from: c */
    public int f43869c;

    public btr() {
    }

    public btr(int i) {
        this.f43867a = new byte[i];
        this.f43869c = i;
    }

    public btr(byte[] bArr) {
        this.f43867a = bArr;
        this.f43869c = bArr.length;
    }

    /* renamed from: a */
    public final void mo30691a(int i) {
        mo30692a(mo30696c() < i ? new byte[i] : this.f43867a, i);
    }

    /* renamed from: a */
    public final void mo30692a(byte[] bArr, int i) {
        this.f43867a = bArr;
        this.f43869c = i;
        this.f43868b = 0;
    }

    /* renamed from: a */
    public final void mo30690a() {
        this.f43868b = 0;
        this.f43869c = 0;
    }

    /* renamed from: b */
    public final int mo30694b() {
        return this.f43869c - this.f43868b;
    }

    /* renamed from: b */
    public final void mo30695b(int i) {
        bti.m36699a(i >= 0 && i <= this.f43867a.length);
        this.f43869c = i;
    }

    /* renamed from: c */
    public final int mo30696c() {
        if (this.f43867a == null) {
            return 0;
        }
        return this.f43867a.length;
    }

    /* renamed from: c */
    public final void mo30697c(int i) {
        bti.m36699a(i >= 0 && i <= this.f43869c);
        this.f43868b = i;
    }

    /* renamed from: d */
    public final void mo30699d(int i) {
        mo30697c(this.f43868b + i);
    }

    /* renamed from: a */
    public final void mo30693a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f43867a, this.f43868b, bArr, i, i2);
        this.f43868b += i2;
    }

    /* renamed from: d */
    public final int mo30698d() {
        byte[] bArr = this.f43867a;
        int i = this.f43868b;
        this.f43868b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: e */
    public final int mo30700e() {
        byte[] bArr = this.f43867a;
        int i = this.f43868b;
        this.f43868b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f43867a;
        int i3 = this.f43868b;
        this.f43868b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: f */
    public final long mo30702f() {
        byte[] bArr = this.f43867a;
        int i = this.f43868b;
        this.f43868b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f43867a;
        int i2 = this.f43868b;
        this.f43868b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.f43867a;
        int i3 = this.f43868b;
        this.f43868b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.f43867a;
        int i4 = this.f43868b;
        this.f43868b = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    /* renamed from: g */
    public final int mo30703g() {
        byte[] bArr = this.f43867a;
        int i = this.f43868b;
        this.f43868b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f43867a;
        int i3 = this.f43868b;
        this.f43868b = i3 + 1;
        byte b = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f43867a;
        int i4 = this.f43868b;
        this.f43868b = i4 + 1;
        byte b2 = b | ((bArr3[i4] & 255) << 8);
        byte[] bArr4 = this.f43867a;
        int i5 = this.f43868b;
        this.f43868b = i5 + 1;
        return b2 | (bArr4[i5] & 255);
    }

    /* renamed from: h */
    public final long mo30704h() {
        byte[] bArr = this.f43867a;
        int i = this.f43868b;
        this.f43868b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f43867a;
        int i2 = this.f43868b;
        this.f43868b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.f43867a;
        int i3 = this.f43868b;
        this.f43868b = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.f43867a;
        int i4 = this.f43868b;
        this.f43868b = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.f43867a;
        int i5 = this.f43868b;
        this.f43868b = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.f43867a;
        int i6 = this.f43868b;
        this.f43868b = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.f43867a;
        int i7 = this.f43868b;
        this.f43868b = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.f43867a;
        int i8 = this.f43868b;
        this.f43868b = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    /* renamed from: i */
    public final int mo30705i() {
        int g = mo30703g();
        if (g >= 0) {
            return g;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(g);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final long mo30706j() {
        long h = mo30704h();
        if (h >= 0) {
            return h;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(h);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final String mo30701e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f43868b + i) - 1;
        String str = new String(this.f43867a, this.f43868b, (i2 >= this.f43869c || this.f43867a[i2] != 0) ? i : i - 1);
        this.f43868b += i;
        return str;
    }
}
