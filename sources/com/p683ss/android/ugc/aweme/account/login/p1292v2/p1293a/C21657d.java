package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.d */
public final class C21657d {
    @C17952c(mo34828a = "message")

    /* renamed from: a */
    public final String f58687a;
    @C17952c(mo34828a = "data")

    /* renamed from: b */
    public final C21656c f58688b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58688b, (java.lang.Object) r3.f58688b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.a.d r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d) r3
            java.lang.String r0 = r2.f58687a
            java.lang.String r1 = r3.f58687a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.v2.a.c r0 = r2.f58688b
            com.ss.android.ugc.aweme.account.login.v2.a.c r3 = r3.f58688b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f58687a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C21656c cVar = this.f58688b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitUserNameResponse(message=");
        sb.append(this.f58687a);
        sb.append(", data=");
        sb.append(this.f58688b);
        sb.append(")");
        return sb.toString();
    }
}
