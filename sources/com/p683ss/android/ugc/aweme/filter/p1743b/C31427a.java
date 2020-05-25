package com.p683ss.android.ugc.aweme.filter.p1743b;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.b.a */
public final class C31427a {

    /* renamed from: a */
    public final boolean f82285a;

    /* renamed from: b */
    public final C31459g f82286b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31427a) {
                C31427a aVar = (C31427a) obj;
                if (!(this.f82285a == aVar.f82285a) || !C52711k.m112239a((Object) this.f82286b, (Object) aVar.f82286b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f82285a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C31459g gVar = this.f82286b;
        return i + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterBeanOp(isAutoUse=");
        sb.append(this.f82285a);
        sb.append(", filter=");
        sb.append(this.f82286b);
        sb.append(")");
        return sb.toString();
    }

    public C31427a(boolean z, C31459g gVar) {
        this.f82285a = z;
        this.f82286b = gVar;
    }
}
