package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.c */
public final class C21656c {
    @C17952c(mo34828a = "error_code")

    /* renamed from: a */
    public final Integer f58684a;
    @C17952c(mo34828a = "description")

    /* renamed from: b */
    public final String f58685b;
    @C17952c(mo34828a = "login_name")

    /* renamed from: c */
    public final String f58686c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58686c, (java.lang.Object) r3.f58686c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21656c
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.account.login.v2.a.c r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21656c) r3
            java.lang.Integer r0 = r2.f58684a
            java.lang.Integer r1 = r3.f58684a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58685b
            java.lang.String r1 = r3.f58685b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f58686c
            java.lang.String r3 = r3.f58686c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21656c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f58684a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f58685b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f58686c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitUserNameData(error_code=");
        sb.append(this.f58684a);
        sb.append(", description=");
        sb.append(this.f58685b);
        sb.append(", login_name=");
        sb.append(this.f58686c);
        sb.append(")");
        return sb.toString();
    }
}
