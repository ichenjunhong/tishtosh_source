package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.b */
public final class C31489b {

    /* renamed from: a */
    public final C31493f f82392a;

    /* renamed from: b */
    public final boolean f82393b;

    /* renamed from: c */
    public final boolean f82394c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31489b) {
                C31489b bVar = (C31489b) obj;
                if (C52711k.m112239a((Object) this.f82392a, (Object) bVar.f82392a)) {
                    if (this.f82393b == bVar.f82393b) {
                        if (this.f82394c == bVar.f82394c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C31493f fVar = this.f82392a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        boolean z = this.f82393b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.f82394c;
        if (z2) {
            z2 = true;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterBoxMeta(filterMeta=");
        sb.append(this.f82392a);
        sb.append(", checked=");
        sb.append(this.f82393b);
        sb.append(", builtin=");
        sb.append(this.f82394c);
        sb.append(")");
        return sb.toString();
    }

    public C31489b(C31493f fVar, boolean z, boolean z2) {
        C52711k.m112240b(fVar, "filterMeta");
        this.f82392a = fVar;
        this.f82393b = z;
        this.f82394c = z2;
    }
}
