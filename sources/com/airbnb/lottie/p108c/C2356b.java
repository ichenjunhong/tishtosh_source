package com.airbnb.lottie.p108c;

/* renamed from: com.airbnb.lottie.c.b */
public final class C2356b {

    /* renamed from: a */
    public final String f7315a;

    /* renamed from: b */
    public final String f7316b;

    /* renamed from: c */
    public final double f7317c;

    /* renamed from: d */
    final int f7318d;

    /* renamed from: e */
    public final int f7319e;

    /* renamed from: f */
    final double f7320f;

    /* renamed from: g */
    public final double f7321g;

    /* renamed from: h */
    public final int f7322h;

    /* renamed from: i */
    public final int f7323i;

    /* renamed from: j */
    public final int f7324j;

    /* renamed from: k */
    public final boolean f7325k;

    public final int hashCode() {
        double hashCode = (double) (((this.f7315a.hashCode() * 31) + this.f7316b.hashCode()) * 31);
        double d = this.f7317c;
        Double.isNaN(hashCode);
        int i = (((((int) (hashCode + d)) * 31) + this.f7318d) * 31) + this.f7319e;
        long doubleToLongBits = Double.doubleToLongBits(this.f7320f);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f7322h;
    }

    public C2356b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, int i5, boolean z) {
        this.f7315a = str;
        this.f7316b = str2;
        this.f7317c = d;
        this.f7318d = i;
        this.f7319e = i2;
        this.f7320f = d2;
        this.f7321g = d3;
        this.f7322h = i3;
        this.f7323i = i4;
        this.f7324j = i5;
        this.f7325k = z;
    }
}
