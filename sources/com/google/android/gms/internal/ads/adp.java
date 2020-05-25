package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15462p;
import leakcanary.internal.LeakCanaryFileProvider;

public final class adp {

    /* renamed from: a */
    public final String f40321a;

    /* renamed from: b */
    public final double f40322b;

    /* renamed from: c */
    public final int f40323c;

    /* renamed from: d */
    private final double f40324d;

    /* renamed from: e */
    private final double f40325e;

    public adp(String str, double d, double d2, double d3, int i) {
        this.f40321a = str;
        this.f40325e = d;
        this.f40324d = d2;
        this.f40322b = d3;
        this.f40323c = i;
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a(LeakCanaryFileProvider.f132049i, this.f40321a).mo28449a("minBound", Double.valueOf(this.f40325e)).mo28449a("maxBound", Double.valueOf(this.f40324d)).mo28449a("percent", Double.valueOf(this.f40322b)).mo28449a("count", Integer.valueOf(this.f40323c)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adp)) {
            return false;
        }
        adp adp = (adp) obj;
        if (C15462p.m32120a(this.f40321a, adp.f40321a) && this.f40324d == adp.f40324d && this.f40325e == adp.f40325e && this.f40323c == adp.f40323c && Double.compare(this.f40322b, adp.f40322b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f40321a, Double.valueOf(this.f40324d), Double.valueOf(this.f40325e), Double.valueOf(this.f40322b), Integer.valueOf(this.f40323c));
    }
}
