package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.bytedance.sdk.account.p861f.p862a.C13112k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.g */
public final class C21661g extends C13112k {

    /* renamed from: a */
    public final String f58691a;

    /* renamed from: b */
    public final String f58692b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58692b, (java.lang.Object) r3.f58692b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.a.g r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g) r3
            java.lang.String r0 = r2.f58691a
            java.lang.String r1 = r3.f58691a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f58692b
            java.lang.String r3 = r3.f58692b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21661g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f58691a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f58692b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailBindQueryObj(email=");
        sb.append(this.f58691a);
        sb.append(", code=");
        sb.append(this.f58692b);
        sb.append(")");
        return sb.toString();
    }

    public C21661g(String str, String str2) {
        C52711k.m112240b(str, "email");
        C52711k.m112240b(str2, "code");
        super(8);
        this.f58691a = str;
        this.f58692b = str2;
    }
}
