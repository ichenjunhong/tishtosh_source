package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class axc extends axa {

    /* renamed from: d */
    private final byte[] f41482d;

    /* renamed from: e */
    private final boolean f41483e;

    /* renamed from: f */
    private int f41484f;

    /* renamed from: g */
    private int f41485g;

    /* renamed from: h */
    private int f41486h;

    /* renamed from: i */
    private int f41487i;

    /* renamed from: j */
    private int f41488j;

    /* renamed from: k */
    private int f41489k;

    private axc(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f41489k = Integer.MAX_VALUE;
        this.f41482d = bArr;
        this.f41484f = i2 + i;
        this.f41486h = i;
        this.f41487i = this.f41486h;
        this.f41483e = z;
    }

    /* renamed from: a */
    public final int mo29634a() throws IOException {
        if (mo29657t()) {
            this.f41488j = 0;
            return 0;
        }
        this.f41488j = m34347v();
        if ((this.f41488j >>> 3) != 0) {
            return this.f41488j;
        }
        throw ayi.m34781d();
    }

    /* renamed from: a */
    public final void mo29635a(int i) throws ayi {
        if (this.f41488j != i) {
            throw ayi.m34782e();
        }
    }

    /* renamed from: b */
    public final boolean mo29637b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f41484f - this.f41486h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f41482d;
                        int i3 = this.f41486h;
                        this.f41486h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw ayi.m34780c();
                }
                while (i2 < 10) {
                    if (m34345A() < 0) {
                        i2++;
                    }
                }
                throw ayi.m34780c();
                return true;
            case 1:
                m34346f(8);
                return true;
            case 2:
                m34346f(m34347v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m34346f(4);
                return true;
            default:
                throw ayi.m34783f();
        }
        do {
            a = mo29634a();
            if (a != 0) {
            }
            mo29635a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo29637b(a));
        mo29635a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo29636b() throws IOException {
        return Double.longBitsToDouble(m34350y());
    }

    /* renamed from: c */
    public final float mo29638c() throws IOException {
        return Float.intBitsToFloat(m34349x());
    }

    /* renamed from: d */
    public final long mo29640d() throws IOException {
        return m34348w();
    }

    /* renamed from: e */
    public final long mo29642e() throws IOException {
        return m34348w();
    }

    /* renamed from: f */
    public final int mo29643f() throws IOException {
        return m34347v();
    }

    /* renamed from: g */
    public final long mo29644g() throws IOException {
        return m34350y();
    }

    /* renamed from: h */
    public final int mo29645h() throws IOException {
        return m34349x();
    }

    /* renamed from: i */
    public final boolean mo29646i() throws IOException {
        return m34348w() != 0;
    }

    /* renamed from: j */
    public final String mo29647j() throws IOException {
        int v = m34347v();
        if (v > 0 && v <= this.f41484f - this.f41486h) {
            String str = new String(this.f41482d, this.f41486h, v, ayb.f41627a);
            this.f41486h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw ayi.m34779b();
            }
            throw ayi.m34778a();
        }
    }

    /* renamed from: k */
    public final String mo29648k() throws IOException {
        int v = m34347v();
        if (v > 0 && v <= this.f41484f - this.f41486h) {
            String b = bbc.m35237b(this.f41482d, this.f41486h, v);
            this.f41486h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw ayi.m34779b();
            }
            throw ayi.m34778a();
        }
    }

    /* renamed from: l */
    public final awo mo29649l() throws IOException {
        byte[] bArr;
        int v = m34347v();
        if (v > 0 && v <= this.f41484f - this.f41486h) {
            awo zzi = awo.zzi(this.f41482d, this.f41486h, v);
            this.f41486h += v;
            return zzi;
        } else if (v == 0) {
            return awo.zzfuo;
        } else {
            if (v > 0 && v <= this.f41484f - this.f41486h) {
                int i = this.f41486h;
                this.f41486h += v;
                bArr = Arrays.copyOfRange(this.f41482d, i, this.f41486h);
            } else if (v > 0) {
                throw ayi.m34778a();
            } else if (v == 0) {
                bArr = ayb.f41628b;
            } else {
                throw ayi.m34779b();
            }
            return new awy(bArr);
        }
    }

    /* renamed from: m */
    public final int mo29650m() throws IOException {
        return m34347v();
    }

    /* renamed from: n */
    public final int mo29651n() throws IOException {
        return m34347v();
    }

    /* renamed from: o */
    public final int mo29652o() throws IOException {
        return m34349x();
    }

    /* renamed from: p */
    public final long mo29653p() throws IOException {
        return m34350y();
    }

    /* renamed from: q */
    public final int mo29654q() throws IOException {
        return m34319e(m34347v());
    }

    /* renamed from: r */
    public final long mo29655r() throws IOException {
        return m34317a(m34348w());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m34347v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f41486h
            int r1 = r5.f41484f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f41482d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f41486h = r2
            return r0
        L_0x0011:
            int r3 = r5.f41484f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.f41486h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo29656s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axc.m34347v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m34348w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f41486h
            int r1 = r11.f41484f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f41482d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f41486h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f41484f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x00bb
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0025:
            r9 = r0
            r0 = r3
        L_0x0027:
            r2 = r9
            goto L_0x00b8
        L_0x002a:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0039
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r0 = r2
            goto L_0x0027
        L_0x0039:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0048
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0025
        L_0x0048:
            long r4 = (long) r0
            int r0 = r3 + 1
            byte r2 = r1[r3]
            long r2 = (long) r2
            r6 = 28
            long r2 = r2 << r6
            long r2 = r2 ^ r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x005d
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x005d:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r2
        L_0x0070:
            r2 = r0
        L_0x0071:
            r0 = r6
            goto L_0x00b8
        L_0x0073:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x0087:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r2
            goto L_0x0070
        L_0x009b:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b8
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r0 = (long) r0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00bb
            goto L_0x0071
        L_0x00b8:
            r11.f41486h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo29656s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axc.m34348w():long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo29656s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m34345A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw ayi.m34780c();
    }

    /* renamed from: x */
    private final int m34349x() throws IOException {
        int i = this.f41486h;
        if (this.f41484f - i >= 4) {
            byte[] bArr = this.f41482d;
            this.f41486h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw ayi.m34778a();
    }

    /* renamed from: y */
    private final long m34350y() throws IOException {
        int i = this.f41486h;
        if (this.f41484f - i >= 8) {
            byte[] bArr = this.f41482d;
            this.f41486h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw ayi.m34778a();
    }

    /* renamed from: c */
    public final int mo29639c(int i) throws ayi {
        if (i >= 0) {
            int u = i + mo29658u();
            int i2 = this.f41489k;
            if (u <= i2) {
                this.f41489k = u;
                m34351z();
                return i2;
            }
            throw ayi.m34778a();
        }
        throw ayi.m34779b();
    }

    /* renamed from: z */
    private final void m34351z() {
        this.f41484f += this.f41485g;
        int i = this.f41484f - this.f41487i;
        if (i > this.f41489k) {
            this.f41485g = i - this.f41489k;
            this.f41484f -= this.f41485g;
            return;
        }
        this.f41485g = 0;
    }

    /* renamed from: d */
    public final void mo29641d(int i) {
        this.f41489k = i;
        m34351z();
    }

    /* renamed from: t */
    public final boolean mo29657t() throws IOException {
        return this.f41486h == this.f41484f;
    }

    /* renamed from: u */
    public final int mo29658u() {
        return this.f41486h - this.f41487i;
    }

    /* renamed from: A */
    private final byte m34345A() throws IOException {
        if (this.f41486h != this.f41484f) {
            byte[] bArr = this.f41482d;
            int i = this.f41486h;
            this.f41486h = i + 1;
            return bArr[i];
        }
        throw ayi.m34778a();
    }

    /* renamed from: f */
    private final void m34346f(int i) throws IOException {
        if (i >= 0 && i <= this.f41484f - this.f41486h) {
            this.f41486h += i;
        } else if (i < 0) {
            throw ayi.m34779b();
        } else {
            throw ayi.m34778a();
        }
    }
}
