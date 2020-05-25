package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.gg */
final class C16706gg extends C16704ge {

    /* renamed from: d */
    private final byte[] f46957d;

    /* renamed from: e */
    private final boolean f46958e;

    /* renamed from: f */
    private int f46959f;

    /* renamed from: g */
    private int f46960g;

    /* renamed from: h */
    private int f46961h;

    /* renamed from: i */
    private int f46962i;

    /* renamed from: j */
    private int f46963j;

    /* renamed from: k */
    private int f46964k;

    private C16706gg(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f46964k = Integer.MAX_VALUE;
        this.f46957d = bArr;
        this.f46959f = i2 + i;
        this.f46961h = i;
        this.f46962i = this.f46961h;
        this.f46958e = z;
    }

    /* renamed from: a */
    public final int mo32038a() throws IOException {
        if (mo32063t()) {
            this.f46963j = 0;
            return 0;
        }
        this.f46963j = m39918v();
        if ((this.f46963j >>> 3) != 0) {
            return this.f46963j;
        }
        throw new C16748hk("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo32040a(int i) throws C16748hk {
        if (this.f46963j != i) {
            throw C16748hk.m40325d();
        }
    }

    /* renamed from: b */
    public final boolean mo32042b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f46959f - this.f46961h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f46957d;
                        int i3 = this.f46961h;
                        this.f46961h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw C16748hk.m40324c();
                }
                while (i2 < 10) {
                    if (m39917A() < 0) {
                        i2++;
                    }
                }
                throw C16748hk.m40324c();
                return true;
            case 1:
                mo32048e(8);
                return true;
            case 2:
                mo32048e(m39918v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo32048e(4);
                return true;
            default:
                throw C16748hk.m40326e();
        }
        do {
            a = mo32038a();
            if (a != 0) {
            }
            mo32040a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo32042b(a));
        mo32040a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo32041b() throws IOException {
        return Double.longBitsToDouble(m39921y());
    }

    /* renamed from: c */
    public final float mo32043c() throws IOException {
        return Float.intBitsToFloat(m39920x());
    }

    /* renamed from: d */
    public final long mo32045d() throws IOException {
        return m39919w();
    }

    /* renamed from: e */
    public final long mo32047e() throws IOException {
        return m39919w();
    }

    /* renamed from: f */
    public final int mo32049f() throws IOException {
        return m39918v();
    }

    /* renamed from: g */
    public final long mo32050g() throws IOException {
        return m39921y();
    }

    /* renamed from: h */
    public final int mo32051h() throws IOException {
        return m39920x();
    }

    /* renamed from: i */
    public final boolean mo32052i() throws IOException {
        return m39919w() != 0;
    }

    /* renamed from: j */
    public final String mo32053j() throws IOException {
        int v = m39918v();
        if (v > 0 && v <= this.f46959f - this.f46961h) {
            String str = new String(this.f46957d, this.f46961h, v, C16743hf.f47107a);
            this.f46961h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw C16748hk.m40323b();
            }
            throw C16748hk.m40322a();
        }
    }

    /* renamed from: k */
    public final String mo32054k() throws IOException {
        int v = m39918v();
        if (v > 0 && v <= this.f46959f - this.f46961h) {
            String b = C16825kc.f47256a.mo32418b(this.f46957d, this.f46961h, v);
            this.f46961h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw C16748hk.m40323b();
            }
            throw C16748hk.m40322a();
        }
    }

    /* renamed from: a */
    public final <T extends C16775ik> T mo32039a(C16786iv<T> ivVar, C16721gq gqVar) throws IOException {
        int v = m39918v();
        if (this.f46953a < this.f46954b) {
            int c = mo32044c(v);
            this.f46953a++;
            T t = (C16775ik) ivVar.mo32240a(this, gqVar);
            mo32040a(0);
            this.f46953a--;
            mo32046d(c);
            return t;
        }
        throw C16748hk.m40327f();
    }

    /* renamed from: l */
    public final C16691fs mo32055l() throws IOException {
        byte[] bArr;
        int v = m39918v();
        if (v > 0 && v <= this.f46959f - this.f46961h) {
            C16691fs zzb = C16691fs.zzb(this.f46957d, this.f46961h, v);
            this.f46961h += v;
            return zzb;
        } else if (v == 0) {
            return C16691fs.zzbtq;
        } else {
            if (v > 0 && v <= this.f46959f - this.f46961h) {
                int i = this.f46961h;
                this.f46961h += v;
                bArr = Arrays.copyOfRange(this.f46957d, i, this.f46961h);
            } else if (v > 0) {
                throw C16748hk.m40322a();
            } else if (v == 0) {
                bArr = C16743hf.f47108b;
            } else {
                throw C16748hk.m40323b();
            }
            return new C16702gc(bArr);
        }
    }

    /* renamed from: m */
    public final int mo32056m() throws IOException {
        return m39918v();
    }

    /* renamed from: n */
    public final int mo32057n() throws IOException {
        return m39918v();
    }

    /* renamed from: o */
    public final int mo32058o() throws IOException {
        return m39920x();
    }

    /* renamed from: p */
    public final long mo32059p() throws IOException {
        return m39921y();
    }

    /* renamed from: q */
    public final int mo32060q() throws IOException {
        int v = m39918v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo32061r() throws IOException {
        long w = m39919w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m39918v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f46961h
            int r1 = r5.f46959f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f46957d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f46961h = r2
            return r0
        L_0x0011:
            int r3 = r5.f46959f
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
            r5.f46961h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo32062s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16706gg.m39918v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m39919w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f46961h
            int r1 = r11.f46959f
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.f46957d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.f46961h = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.f46959f
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
            r11.f46961h = r0
            return r2
        L_0x00bb:
            long r0 = r11.mo32062s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16706gg.m39919w():long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo32062s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m39917A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw C16748hk.m40324c();
    }

    /* renamed from: x */
    private final int m39920x() throws IOException {
        int i = this.f46961h;
        if (this.f46959f - i >= 4) {
            byte[] bArr = this.f46957d;
            this.f46961h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C16748hk.m40322a();
    }

    /* renamed from: y */
    private final long m39921y() throws IOException {
        int i = this.f46961h;
        if (this.f46959f - i >= 8) {
            byte[] bArr = this.f46957d;
            this.f46961h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C16748hk.m40322a();
    }

    /* renamed from: c */
    public final int mo32044c(int i) throws C16748hk {
        if (i >= 0) {
            int u = i + mo32064u();
            int i2 = this.f46964k;
            if (u <= i2) {
                this.f46964k = u;
                m39922z();
                return i2;
            }
            throw C16748hk.m40322a();
        }
        throw C16748hk.m40323b();
    }

    /* renamed from: z */
    private final void m39922z() {
        this.f46959f += this.f46960g;
        int i = this.f46959f - this.f46962i;
        if (i > this.f46964k) {
            this.f46960g = i - this.f46964k;
            this.f46959f -= this.f46960g;
            return;
        }
        this.f46960g = 0;
    }

    /* renamed from: d */
    public final void mo32046d(int i) {
        this.f46964k = i;
        m39922z();
    }

    /* renamed from: t */
    public final boolean mo32063t() throws IOException {
        return this.f46961h == this.f46959f;
    }

    /* renamed from: u */
    public final int mo32064u() {
        return this.f46961h - this.f46962i;
    }

    /* renamed from: A */
    private final byte m39917A() throws IOException {
        if (this.f46961h != this.f46959f) {
            byte[] bArr = this.f46957d;
            int i = this.f46961h;
            this.f46961h = i + 1;
            return bArr[i];
        }
        throw C16748hk.m40322a();
    }

    /* renamed from: e */
    public final void mo32048e(int i) throws IOException {
        if (i >= 0 && i <= this.f46959f - this.f46961h) {
            this.f46961h += i;
        } else if (i < 0) {
            throw C16748hk.m40323b();
        } else {
            throw C16748hk.m40322a();
        }
    }
}
