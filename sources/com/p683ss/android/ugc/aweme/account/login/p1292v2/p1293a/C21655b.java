package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.b */
public final class C21655b extends BaseResponse {
    @C17952c(mo34828a = "is_valid")

    /* renamed from: a */
    public final Boolean f58682a = null;
    @C17952c(mo34828a = "recommended_unique_ids")

    /* renamed from: b */
    public final List<String> f58683b = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58683b, (java.lang.Object) r3.f58683b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21655b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.a.b r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21655b) r3
            java.lang.Boolean r0 = r2.f58682a
            java.lang.Boolean r1 = r3.f58682a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.lang.String> r0 = r2.f58683b
            java.util.List<java.lang.String> r3 = r3.f58683b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21655b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Boolean bool = this.f58682a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        List<String> list = this.f58683b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckUserNameResponse(is_valid=");
        sb.append(this.f58682a);
        sb.append(", recommended_unique_ids=");
        sb.append(this.f58683b);
        sb.append(")");
        return sb.toString();
    }

    public C21655b(Boolean bool, List<String> list) {
    }
}
