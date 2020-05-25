package com.p683ss.android.ugc.aweme.account.bean;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.bean.b */
public final class C20935b {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public final Integer f56964a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public final String f56965b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f56965b, (java.lang.Object) r3.f56965b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.bean.C20935b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.bean.b r3 = (com.p683ss.android.ugc.aweme.account.bean.C20935b) r3
            java.lang.Integer r0 = r2.f56964a
            java.lang.Integer r1 = r3.f56964a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f56965b
            java.lang.String r3 = r3.f56965b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.bean.C20935b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f56964a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f56965b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppBindResponse(statusCode=");
        sb.append(this.f56964a);
        sb.append(", statusMessage=");
        sb.append(this.f56965b);
        sb.append(")");
        return sb.toString();
    }
}
