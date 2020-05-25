package com.p683ss.android.ugc.aweme.filter.repository.internal;

import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a */
public final class C31502a {

    /* renamed from: a */
    public final C31490c f82411a;

    /* renamed from: b */
    public final boolean f82412b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31502a) {
                C31502a aVar = (C31502a) obj;
                if (C52711k.m112239a((Object) this.f82411a, (Object) aVar.f82411a)) {
                    if (this.f82412b == aVar.f82412b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C31490c cVar = this.f82411a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f82412b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterDataResponse(data=");
        sb.append(this.f82411a);
        sb.append(", brokenData=");
        sb.append(this.f82412b);
        sb.append(")");
        return sb.toString();
    }

    public C31502a(C31490c cVar, boolean z) {
        C52711k.m112240b(cVar, "data");
        this.f82411a = cVar;
        this.f82412b = z;
    }

    public /* synthetic */ C31502a(C31490c cVar, boolean z, int i, C52707g gVar) {
        this(cVar, false);
    }
}
