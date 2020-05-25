package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class axa {

    /* renamed from: a */
    int f41478a;

    /* renamed from: b */
    int f41479b;

    /* renamed from: c */
    axd f41480c = this;

    /* renamed from: d */
    private int f41481d;

    /* renamed from: a */
    public static long m34317a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static axa m34318a(byte[] bArr, int i, int i2, boolean z) {
        axc axc = new axc(bArr, i, i2, z);
        try {
            axc.mo29639c(i2);
            return axc;
        } catch (ayi e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m34319e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo29634a() throws IOException;

    /* renamed from: a */
    public abstract void mo29635a(int i) throws ayi;

    /* renamed from: b */
    public abstract double mo29636b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo29637b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo29638c() throws IOException;

    /* renamed from: c */
    public abstract int mo29639c(int i) throws ayi;

    /* renamed from: d */
    public abstract long mo29640d() throws IOException;

    /* renamed from: d */
    public abstract void mo29641d(int i);

    /* renamed from: e */
    public abstract long mo29642e() throws IOException;

    /* renamed from: f */
    public abstract int mo29643f() throws IOException;

    /* renamed from: g */
    public abstract long mo29644g() throws IOException;

    /* renamed from: h */
    public abstract int mo29645h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo29646i() throws IOException;

    /* renamed from: j */
    public abstract String mo29647j() throws IOException;

    /* renamed from: k */
    public abstract String mo29648k() throws IOException;

    /* renamed from: l */
    public abstract awo mo29649l() throws IOException;

    /* renamed from: m */
    public abstract int mo29650m() throws IOException;

    /* renamed from: n */
    public abstract int mo29651n() throws IOException;

    /* renamed from: o */
    public abstract int mo29652o() throws IOException;

    /* renamed from: p */
    public abstract long mo29653p() throws IOException;

    /* renamed from: q */
    public abstract int mo29654q() throws IOException;

    /* renamed from: r */
    public abstract long mo29655r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo29656s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo29657t() throws IOException;

    /* renamed from: u */
    public abstract int mo29658u();

    private axa() {
        this.f41479b = 100;
        this.f41481d = Integer.MAX_VALUE;
    }
}
