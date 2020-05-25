package com.google.android.gms.internal.ads;

@C16299uq
public final class anp {

    /* renamed from: a */
    public final int f41063a;

    /* renamed from: b */
    public final int f41064b;

    /* renamed from: c */
    private final int f41065c;

    /* renamed from: a */
    public static anp m33673a(zzyz zzyz) {
        if (zzyz.f46341d) {
            return new anp(3, 0, 0);
        }
        if (zzyz.f46346i) {
            return new anp(2, 0, 0);
        }
        if (zzyz.f46345h) {
            return m33671a();
        }
        return m33672a(zzyz.f46343f, zzyz.f46340c);
    }

    /* renamed from: a */
    public static anp m33671a() {
        return new anp(0, 0, 0);
    }

    /* renamed from: a */
    public static anp m33672a(int i, int i2) {
        return new anp(1, i, i2);
    }

    /* renamed from: b */
    public static anp m33674b() {
        return new anp(4, 0, 0);
    }

    /* renamed from: c */
    public static anp m33675c() {
        return new anp(5, 0, 0);
    }

    private anp(int i, int i2, int i3) {
        this.f41065c = i;
        this.f41064b = i2;
        this.f41063a = i3;
    }

    /* renamed from: d */
    public final boolean mo29365d() {
        return this.f41065c == 2;
    }

    /* renamed from: e */
    public final boolean mo29366e() {
        return this.f41065c == 3;
    }

    /* renamed from: f */
    public final boolean mo29367f() {
        return this.f41065c == 0;
    }

    /* renamed from: g */
    public final boolean mo29368g() {
        return this.f41065c == 4;
    }

    /* renamed from: h */
    public final boolean mo29369h() {
        return this.f41065c == 5;
    }
}
