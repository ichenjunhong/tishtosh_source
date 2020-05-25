package com.p683ss.android.ugc.aweme.account.p1275h;

/* renamed from: com.ss.android.ugc.aweme.account.h.b */
public final class C20980b {

    /* renamed from: a */
    public final String f57089a;

    /* renamed from: b */
    public final String f57090b;

    /* renamed from: c */
    public final Integer f57091c;

    /* renamed from: d */
    public final String f57092d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f57092d, (java.lang.Object) r3.f57092d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.p1275h.C20980b
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.account.h.b r3 = (com.p683ss.android.ugc.aweme.account.p1275h.C20980b) r3
            java.lang.String r0 = r2.f57089a
            java.lang.String r1 = r3.f57089a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f57090b
            java.lang.String r1 = r3.f57090b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f57091c
            java.lang.Integer r1 = r3.f57091c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f57092d
            java.lang.String r3 = r3.f57092d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1275h.C20980b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f57089a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57090b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f57091c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f57092d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoStepAuthResponse(successTicket=");
        sb.append(this.f57089a);
        sb.append(", profileKey=");
        sb.append(this.f57090b);
        sb.append(", errorCode=");
        sb.append(this.f57091c);
        sb.append(", errorMessage=");
        sb.append(this.f57092d);
        sb.append(")");
        return sb.toString();
    }

    public C20980b(String str, String str2, Integer num, String str3) {
        this.f57089a = str;
        this.f57090b = str2;
        this.f57091c = num;
        this.f57092d = str3;
    }
}
