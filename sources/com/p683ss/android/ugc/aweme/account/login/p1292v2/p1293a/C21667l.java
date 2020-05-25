package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.bytedance.sdk.account.p861f.p862a.C13112k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.l */
public final class C21667l extends C13112k {

    /* renamed from: a */
    public final String f58697a;

    /* renamed from: b */
    public final String f58698b;

    /* renamed from: c */
    public final String f58699c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58699c, (java.lang.Object) r3.f58699c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.account.login.v2.a.l r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l) r3
            java.lang.String r0 = r2.f58697a
            java.lang.String r1 = r3.f58697a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58698b
            java.lang.String r1 = r3.f58698b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58699c
            java.lang.String r3 = r3.f58699c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21667l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f58697a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f58698b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f58699c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailChangeQueryObj(code=");
        sb.append(this.f58697a);
        sb.append(", email=");
        sb.append(this.f58698b);
        sb.append(", ticket=");
        sb.append(this.f58699c);
        sb.append(")");
        return sb.toString();
    }

    public C21667l(String str, String str2, String str3) {
        C52711k.m112240b(str, "code");
        C52711k.m112240b(str2, "email");
        C52711k.m112240b(str3, "ticket");
        super(22);
        this.f58697a = str;
        this.f58698b = str2;
        this.f58699c = str3;
    }
}
