package com.p683ss.android.ugc.aweme.journey;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.p */
public final class C35776p {
    @C17952c(mo34828a = "interest_list")

    /* renamed from: a */
    public final List<C35777q> f91885a;

    /* renamed from: b */
    public final boolean f91886b = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35776p) {
                C35776p pVar = (C35776p) obj;
                if (C52711k.m112239a((Object) this.f91885a, (Object) pVar.f91885a)) {
                    if (this.f91886b == pVar.f91886b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C35777q> list = this.f91885a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f91886b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewUserInterestPageStruct(interest_list=");
        sb.append(this.f91885a);
        sb.append(", isDefault=");
        sb.append(this.f91886b);
        sb.append(")");
        return sb.toString();
    }

    public C35776p(List<C35777q> list, boolean z) {
        this.f91885a = list;
    }
}
