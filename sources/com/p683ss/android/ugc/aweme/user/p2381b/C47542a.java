package com.p683ss.android.ugc.aweme.user.p2381b;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.user.b.a */
public final class C47542a {
    @C17952c(mo34828a = "has_set")

    /* renamed from: a */
    public final Boolean f119954a;
    @C17952c(mo34828a = "description")

    /* renamed from: b */
    public final String f119955b;
    @C17952c(mo34828a = "error_code")

    /* renamed from: c */
    public int f119956c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47542a) {
                C47542a aVar = (C47542a) obj;
                if (C52711k.m112239a((Object) this.f119954a, (Object) aVar.f119954a) && C52711k.m112239a((Object) this.f119955b, (Object) aVar.f119955b)) {
                    if (this.f119956c == aVar.f119956c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.f119954a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f119955b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f119956c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryUserPasswordSetStatusData(hasSet=");
        sb.append(this.f119954a);
        sb.append(", description=");
        sb.append(this.f119955b);
        sb.append(", errorCode=");
        sb.append(this.f119956c);
        sb.append(")");
        return sb.toString();
    }
}
