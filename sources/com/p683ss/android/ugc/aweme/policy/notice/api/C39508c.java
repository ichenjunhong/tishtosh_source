package com.p683ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.c */
public final class C39508c extends BaseResponse {
    @C17952c(mo34828a = "policy_notices")

    /* renamed from: a */
    public final List<C39506a> f101072a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f101072a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.policy.notice.api.C39508c) r2).f101072a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.policy.notice.api.C39508c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.policy.notice.api.c r2 = (com.p683ss.android.ugc.aweme.policy.notice.api.C39508c) r2
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.a> r0 = r1.f101072a
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.a> r2 = r2.f101072a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.policy.notice.api.C39508c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C39506a> list = this.f101072a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNoticeResponse(policyNotices=");
        sb.append(this.f101072a);
        sb.append(")");
        return sb.toString();
    }
}
