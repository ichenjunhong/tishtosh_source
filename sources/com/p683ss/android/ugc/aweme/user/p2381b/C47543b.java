package com.p683ss.android.ugc.aweme.user.p2381b;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.user.b.b */
public final class C47543b {
    @C17952c(mo34828a = "message")

    /* renamed from: a */
    public final String f119957a;
    @C17952c(mo34828a = "data")

    /* renamed from: b */
    public final C47542a f119958b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f119958b, (java.lang.Object) r3.f119958b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.user.p2381b.C47543b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.user.b.b r3 = (com.p683ss.android.ugc.aweme.user.p2381b.C47543b) r3
            java.lang.String r0 = r2.f119957a
            java.lang.String r1 = r3.f119957a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.user.b.a r0 = r2.f119958b
            com.ss.android.ugc.aweme.user.b.a r3 = r3.f119958b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.p2381b.C47543b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f119957a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C47542a aVar = this.f119958b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryUserPasswordSetStatusResponse(message=");
        sb.append(this.f119957a);
        sb.append(", data=");
        sb.append(this.f119958b);
        sb.append(")");
        return sb.toString();
    }
}
