package com.airbnb.lottie.p108c;

import com.airbnb.lottie.p108c.p110b.C2373n;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.d */
public final class C2397d {

    /* renamed from: a */
    public final List<C2373n> f7496a;

    /* renamed from: b */
    public final double f7497b;

    /* renamed from: c */
    public final double f7498c;

    /* renamed from: d */
    public final String f7499d;

    /* renamed from: e */
    private final char f7500e;

    /* renamed from: f */
    private final String f7501f;

    public final int hashCode() {
        return m7043a(this.f7500e, this.f7501f, this.f7499d);
    }

    /* renamed from: a */
    public static int m7043a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C2397d(List<C2373n> list, char c, double d, double d2, String str, String str2) {
        this.f7496a = list;
        this.f7500e = c;
        this.f7497b = d;
        this.f7498c = d2;
        this.f7499d = str;
        this.f7501f = str2;
    }
}
