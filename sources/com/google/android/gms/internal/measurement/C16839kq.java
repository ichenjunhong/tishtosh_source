package com.google.android.gms.internal.measurement;

import com.C2240a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.kq */
public final class C16839kq {

    /* renamed from: a */
    final byte[] f47263a;

    /* renamed from: b */
    final int f47264b;

    /* renamed from: c */
    int f47265c;

    /* renamed from: d */
    int f47266d = 64;

    /* renamed from: e */
    private final int f47267e;

    /* renamed from: f */
    private int f47268f;

    /* renamed from: g */
    private int f47269g;

    /* renamed from: h */
    private int f47270h;

    /* renamed from: i */
    private int f47271i;

    /* renamed from: j */
    private int f47272j = Integer.MAX_VALUE;

    /* renamed from: k */
    private int f47273k = 67108864;

    /* renamed from: l */
    private C16704ge f47274l;

    /* renamed from: a */
    public static C16839kq m40831a(byte[] bArr) {
        return m40832a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C16839kq m40832a(byte[] bArr, int i, int i2) {
        return new C16839kq(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int mo32421a() throws IOException {
        if (this.f47270h == this.f47268f) {
            this.f47271i = 0;
            return 0;
        }
        this.f47271i = mo32430d();
        if (this.f47271i != 0) {
            return this.f47271i;
        }
        throw new C16848kz("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo32423a(int i) throws C16848kz {
        if (this.f47271i != i) {
            throw new C16848kz("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean mo32427b(int i) throws IOException {
        int a;
        switch (i & 7) {
            case 0:
                mo32430d();
                return true;
            case 1:
                mo32435g();
                return true;
            case 2:
                m40833f(mo32430d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo32434f();
                return true;
            default:
                throw new C16848kz("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo32421a();
            if (a != 0) {
            }
            mo32423a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo32427b(a));
        mo32423a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final boolean mo32426b() throws IOException {
        return mo32430d() != 0;
    }

    /* renamed from: c */
    public final String mo32429c() throws IOException {
        int d = mo32430d();
        if (d < 0) {
            throw C16848kz.m40905b();
        } else if (d <= this.f47268f - this.f47270h) {
            String str = new String(this.f47263a, this.f47270h, d, C16847ky.f47300a);
            this.f47270h += d;
            return str;
        } else {
            throw C16848kz.m40904a();
        }
    }

    /* renamed from: a */
    public final void mo32425a(C16850la laVar) throws IOException {
        int d = mo32430d();
        if (this.f47265c < this.f47266d) {
            int c = mo32428c(d);
            this.f47265c++;
            laVar.mo31923a(this);
            mo32423a(0);
            this.f47265c--;
            mo32431d(c);
            return;
        }
        throw C16848kz.m40907d();
    }

    /* renamed from: d */
    public final int mo32430d() throws IOException {
        byte b;
        byte k = m40835k();
        if (k >= 0) {
            return k;
        }
        byte b2 = k & Byte.MAX_VALUE;
        byte k2 = m40835k();
        if (k2 >= 0) {
            b = b2 | (k2 << 7);
        } else {
            byte b3 = b2 | ((k2 & Byte.MAX_VALUE) << 7);
            byte k3 = m40835k();
            if (k3 >= 0) {
                b = b3 | (k3 << 14);
            } else {
                byte b4 = b3 | ((k3 & Byte.MAX_VALUE) << 14);
                byte k4 = m40835k();
                if (k4 >= 0) {
                    b = b4 | (k4 << 21);
                } else {
                    byte b5 = b4 | ((k4 & Byte.MAX_VALUE) << 21);
                    byte k5 = m40835k();
                    b = b5 | (k5 << 28);
                    if (k5 < 0) {
                        for (int i = 0; i < 5; i++) {
                            if (m40835k() >= 0) {
                                return b;
                            }
                        }
                        throw C16848kz.m40906c();
                    }
                }
            }
        }
        return b;
    }

    /* renamed from: e */
    public final long mo32432e() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte k = m40835k();
            j |= ((long) (k & Byte.MAX_VALUE)) << i;
            if ((k & 128) == 0) {
                return j;
            }
        }
        throw C16848kz.m40906c();
    }

    /* renamed from: f */
    public final int mo32434f() throws IOException {
        return (m40835k() & 255) | ((m40835k() & 255) << 8) | ((m40835k() & 255) << 16) | ((m40835k() & 255) << 24);
    }

    /* renamed from: g */
    public final long mo32435g() throws IOException {
        byte k = m40835k();
        byte k2 = m40835k();
        return ((((long) k2) & 255) << 8) | (((long) k) & 255) | ((((long) m40835k()) & 255) << 16) | ((((long) m40835k()) & 255) << 24) | ((((long) m40835k()) & 255) << 32) | ((((long) m40835k()) & 255) << 40) | ((((long) m40835k()) & 255) << 48) | ((((long) m40835k()) & 255) << 56);
    }

    private C16839kq(byte[] bArr, int i, int i2) {
        this.f47263a = bArr;
        this.f47264b = 0;
        int i3 = i2 + 0;
        this.f47268f = i3;
        this.f47267e = i3;
        this.f47270h = 0;
    }

    /* renamed from: c */
    public final int mo32428c(int i) throws C16848kz {
        if (i >= 0) {
            int i2 = i + this.f47270h;
            int i3 = this.f47272j;
            if (i2 <= i3) {
                this.f47272j = i2;
                m40834j();
                return i3;
            }
            throw C16848kz.m40904a();
        }
        throw C16848kz.m40905b();
    }

    /* renamed from: j */
    private final void m40834j() {
        this.f47268f += this.f47269g;
        int i = this.f47268f;
        if (i > this.f47272j) {
            this.f47269g = i - this.f47272j;
            this.f47268f -= this.f47269g;
            return;
        }
        this.f47269g = 0;
    }

    /* renamed from: d */
    public final void mo32431d(int i) {
        this.f47272j = i;
        m40834j();
    }

    /* renamed from: h */
    public final int mo32436h() {
        if (this.f47272j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f47272j - this.f47270h;
    }

    /* renamed from: i */
    public final int mo32437i() {
        return this.f47270h - this.f47264b;
    }

    /* renamed from: e */
    public final void mo32433e(int i) {
        mo32424a(i, this.f47271i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32424a(int i, int i2) {
        if (i > this.f47270h - this.f47264b) {
            int i3 = this.f47270h - this.f47264b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f47270h = this.f47264b + i;
            this.f47271i = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: k */
    private final byte m40835k() throws IOException {
        if (this.f47270h != this.f47268f) {
            byte[] bArr = this.f47263a;
            int i = this.f47270h;
            this.f47270h = i + 1;
            return bArr[i];
        }
        throw C16848kz.m40904a();
    }

    /* renamed from: f */
    private final void m40833f(int i) throws IOException {
        if (i < 0) {
            throw C16848kz.m40905b();
        } else if (this.f47270h + i > this.f47272j) {
            m40833f(this.f47272j - this.f47270h);
            throw C16848kz.m40904a();
        } else if (i <= this.f47268f - this.f47270h) {
            this.f47270h += i;
        } else {
            throw C16848kz.m40904a();
        }
    }

    /* renamed from: a */
    public final <T extends C16736hd<T, ?>> T mo32422a(C16786iv<T> ivVar) throws IOException {
        try {
            if (this.f47274l == null) {
                this.f47274l = C16704ge.m39889a(this.f47263a, this.f47264b, this.f47267e, false);
            }
            int u = this.f47274l.mo32064u();
            int i = this.f47270h - this.f47264b;
            if (u <= i) {
                this.f47274l.mo32048e(i - u);
                C16704ge geVar = this.f47274l;
                int i2 = this.f47266d - this.f47265c;
                if (i2 >= 0) {
                    int i3 = geVar.f46954b;
                    geVar.f46954b = i2;
                    T t = (C16736hd) this.f47274l.mo32039a(ivVar, C16721gq.m40217b());
                    mo32427b(this.f47271i);
                    return t;
                }
                StringBuilder sb = new StringBuilder(47);
                sb.append("Recursion limit cannot be negative: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IOException(C2240a.m6772a("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        } catch (C16748hk e) {
            throw new C16848kz("", e);
        }
    }
}
