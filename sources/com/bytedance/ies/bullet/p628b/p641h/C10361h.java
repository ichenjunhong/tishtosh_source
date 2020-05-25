package com.bytedance.ies.bullet.p628b.p641h;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.h */
public final class C10361h {

    /* renamed from: a */
    public final String f27799a;

    /* renamed from: b */
    public final long f27800b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10361h) {
                C10361h hVar = (C10361h) obj;
                if (C52711k.m112239a((Object) this.f27799a, (Object) hVar.f27799a)) {
                    if (this.f27800b == hVar.f27800b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f27799a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f27800b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntervalMetric(intervalName=");
        sb.append(this.f27799a);
        sb.append(", interval=");
        sb.append(this.f27800b);
        sb.append(")");
        return sb.toString();
    }

    public C10361h(String str, long j) {
        C52711k.m112240b(str, "intervalName");
        this.f27799a = str;
        this.f27800b = j;
    }
}
