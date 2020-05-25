package com.p683ss.android.ugc.aweme.account.security;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.security.b */
public final class C22147b {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public final String f59717a;
    @C17952c(mo34828a = "scheme")

    /* renamed from: b */
    public final String f59718b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f59718b, (java.lang.Object) r3.f59718b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.security.C22147b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.security.b r3 = (com.p683ss.android.ugc.aweme.account.security.C22147b) r3
            java.lang.String r0 = r2.f59717a
            java.lang.String r1 = r3.f59717a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f59718b
            java.lang.String r3 = r3.f59718b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.security.C22147b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f59717a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59718b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeMsgHighlight(content=");
        sb.append(this.f59717a);
        sb.append(", scheme=");
        sb.append(this.f59718b);
        sb.append(")");
        return sb.toString();
    }
}
