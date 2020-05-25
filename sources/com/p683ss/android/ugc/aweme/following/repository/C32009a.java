package com.p683ss.android.ugc.aweme.following.repository;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.repository.a */
public final class C32009a {

    /* renamed from: a */
    public final String f83579a;

    /* renamed from: b */
    public final String f83580b;

    /* renamed from: c */
    public final Integer f83581c;

    /* renamed from: d */
    public final Integer f83582d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f83582d, (java.lang.Object) r3.f83582d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.following.repository.C32009a
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.following.repository.a r3 = (com.p683ss.android.ugc.aweme.following.repository.C32009a) r3
            java.lang.String r0 = r2.f83579a
            java.lang.String r1 = r3.f83579a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f83580b
            java.lang.String r1 = r3.f83580b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f83581c
            java.lang.Integer r1 = r3.f83581c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f83582d
            java.lang.Integer r3 = r3.f83582d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.repository.C32009a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f83579a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83580b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f83581c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f83582d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectedRelationQueryParam(uid=");
        sb.append(this.f83579a);
        sb.append(", secUid=");
        sb.append(this.f83580b);
        sb.append(", cursor=");
        sb.append(this.f83581c);
        sb.append(", count=");
        sb.append(this.f83582d);
        sb.append(")");
        return sb.toString();
    }

    public C32009a(String str, String str2, Integer num, Integer num2) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUid");
        this.f83579a = str;
        this.f83580b = str2;
        this.f83581c = num;
        this.f83582d = num2;
    }
}
