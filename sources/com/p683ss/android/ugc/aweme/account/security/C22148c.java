package com.p683ss.android.ugc.aweme.account.security;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.account.security.c */
public final class C22148c extends BaseResponse {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public final C22146a f59719a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f59719a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.account.security.C22148c) r2).f59719a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.account.security.C22148c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.account.security.c r2 = (com.p683ss.android.ugc.aweme.account.security.C22148c) r2
            com.ss.android.ugc.aweme.account.security.a r0 = r1.f59719a
            com.ss.android.ugc.aweme.account.security.a r2 = r2.f59719a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.security.C22148c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C22146a aVar = this.f59719a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgResponse(data=");
        sb.append(this.f59719a);
        sb.append(")");
        return sb.toString();
    }
}
