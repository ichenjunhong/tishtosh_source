package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.b.d */
public final class C22499d {

    /* renamed from: a */
    public final String f60619a;

    /* renamed from: b */
    public final long f60620b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22499d) {
                C22499d dVar = (C22499d) obj;
                if (C52711k.m112239a((Object) this.f60619a, (Object) dVar.f60619a)) {
                    if (this.f60620b == dVar.f60620b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f60619a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f60620b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntervalMetric(intervalName=");
        sb.append(this.f60619a);
        sb.append(", interval=");
        sb.append(this.f60620b);
        sb.append(")");
        return sb.toString();
    }

    public C22499d(String str, long j) {
        C52711k.m112240b(str, "intervalName");
        this.f60619a = str;
        this.f60620b = j;
    }
}
