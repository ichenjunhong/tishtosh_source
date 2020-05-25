package com.p683ss.android.ugc.aweme.familiar.p1699a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.f */
public final class C29640f {

    /* renamed from: a */
    public final String f77498a;

    /* renamed from: b */
    public final String f77499b;

    /* renamed from: c */
    public final String f77500c;

    /* renamed from: d */
    public final String f77501d;

    /* renamed from: e */
    public final String f77502e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f77502e, (java.lang.Object) r3.f77502e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.familiar.p1699a.C29640f
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.familiar.a.f r3 = (com.p683ss.android.ugc.aweme.familiar.p1699a.C29640f) r3
            java.lang.String r0 = r2.f77498a
            java.lang.String r1 = r3.f77498a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f77499b
            java.lang.String r1 = r3.f77499b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f77500c
            java.lang.String r1 = r3.f77500c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f77501d
            java.lang.String r1 = r3.f77501d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f77502e
            java.lang.String r3 = r3.f77502e
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.familiar.p1699a.C29640f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f77498a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77499b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77500c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f77501d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77502e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushNotificationParams(eventType=");
        sb.append(this.f77498a);
        sb.append(", accountType=");
        sb.append(this.f77499b);
        sb.append(", groupId=");
        sb.append(this.f77500c);
        sb.append(", authorId=");
        sb.append(this.f77501d);
        sb.append(", toUserId=");
        sb.append(this.f77502e);
        sb.append(")");
        return sb.toString();
    }

    public C29640f(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(str2, "accountType");
        C52711k.m112240b(str3, "groupId");
        C52711k.m112240b(str4, "authorId");
        C52711k.m112240b(str5, "toUserId");
        this.f77498a = str;
        this.f77499b = str2;
        this.f77500c = str3;
        this.f77501d = str4;
        this.f77502e = str5;
    }
}
