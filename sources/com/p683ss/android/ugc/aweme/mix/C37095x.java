package com.p683ss.android.ugc.aweme.mix;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.x */
public final class C37095x {

    /* renamed from: a */
    public final String f94747a;

    /* renamed from: b */
    public final long f94748b;

    /* renamed from: c */
    public final int f94749c;

    /* renamed from: d */
    public final int f94750d;

    public C37095x() {
        this(null, 0, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37095x) {
                C37095x xVar = (C37095x) obj;
                if (C52711k.m112239a((Object) this.f94747a, (Object) xVar.f94747a)) {
                    if (this.f94748b == xVar.f94748b) {
                        if (this.f94749c == xVar.f94749c) {
                            if (this.f94750d == xVar.f94750d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f94747a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f94748b)) * 31) + Integer.hashCode(this.f94749c)) * 31) + Integer.hashCode(this.f94750d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixListRequestParams(mixId=");
        sb.append(this.f94747a);
        sb.append(", cursor=");
        sb.append(this.f94748b);
        sb.append(", count=");
        sb.append(this.f94749c);
        sb.append(", pullType=");
        sb.append(this.f94750d);
        sb.append(")");
        return sb.toString();
    }

    public C37095x(String str, long j, int i, int i2) {
        this.f94747a = str;
        this.f94748b = j;
        this.f94749c = i;
        this.f94750d = i2;
    }

    private /* synthetic */ C37095x(String str, long j, int i, int i2, int i3, C52707g gVar) {
        this(null, 0, 15, 2);
    }
}
