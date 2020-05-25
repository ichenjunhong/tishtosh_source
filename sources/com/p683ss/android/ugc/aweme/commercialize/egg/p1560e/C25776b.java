package com.p683ss.android.ugc.aweme.commercialize.egg.p1560e;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e.b */
public final class C25776b {

    /* renamed from: a */
    public final String f68178a;

    /* renamed from: b */
    public final String f68179b;

    /* renamed from: c */
    public final String f68180c;

    /* renamed from: d */
    public final String f68181d;

    /* renamed from: e */
    public final String f68182e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68182e, (java.lang.Object) r3.f68182e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25776b
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commercialize.egg.e.b r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25776b) r3
            java.lang.String r0 = r2.f68178a
            java.lang.String r1 = r3.f68178a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68179b
            java.lang.String r1 = r3.f68179b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68180c
            java.lang.String r1 = r3.f68180c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68181d
            java.lang.String r1 = r3.f68181d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68182e
            java.lang.String r3 = r3.f68182e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25776b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68178a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68179b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68180c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f68181d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f68182e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceEggLogParam(eggType=");
        sb.append(this.f68178a);
        sb.append(", creativeId=");
        sb.append(this.f68179b);
        sb.append(", logExtra=");
        sb.append(this.f68180c);
        sb.append(", groupId=");
        sb.append(this.f68181d);
        sb.append(", eggId=");
        sb.append(this.f68182e);
        sb.append(")");
        return sb.toString();
    }

    public C25776b(String str, String str2, String str3, String str4, String str5) {
        this.f68178a = str;
        this.f68179b = str2;
        this.f68180c = str3;
        this.f68181d = str4;
        this.f68182e = str5;
    }

    public /* synthetic */ C25776b(String str, String str2, String str3, String str4, String str5, int i, C52707g gVar) {
        this(str, str2, str3, str4, null);
    }
}
