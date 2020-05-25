package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.f */
public final class C47602f {

    /* renamed from: a */
    public final String f120067a;

    /* renamed from: b */
    public final String f120068b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f120068b, (java.lang.Object) r3.f120068b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47602f
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.userservice.jedi.a.f r3 = (com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47602f) r3
            java.lang.String r0 = r2.f120067a
            java.lang.String r1 = r3.f120067a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f120068b
            java.lang.String r3 = r3.f120068b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47602f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f120067a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f120068b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoveFollowerReqParams(uid=");
        sb.append(this.f120067a);
        sb.append(", secUserId=");
        sb.append(this.f120068b);
        sb.append(")");
        return sb.toString();
    }

    public C47602f(String str, String str2) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUserId");
        this.f120067a = str;
        this.f120068b = str2;
    }
}
