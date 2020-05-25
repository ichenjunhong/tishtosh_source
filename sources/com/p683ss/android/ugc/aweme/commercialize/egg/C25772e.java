package com.p683ss.android.ugc.aweme.commercialize.egg;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.e */
public final class C25772e {

    /* renamed from: a */
    public final String f68148a;

    /* renamed from: b */
    public final String f68149b;

    /* renamed from: c */
    public final String f68150c;

    /* renamed from: d */
    public final String f68151d;

    /* renamed from: e */
    public final String f68152e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68152e, (java.lang.Object) r3.f68152e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.egg.C25772e
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commercialize.egg.e r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.C25772e) r3
            java.lang.String r0 = r2.f68148a
            java.lang.String r1 = r3.f68148a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68149b
            java.lang.String r1 = r3.f68149b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68150c
            java.lang.String r1 = r3.f68150c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68151d
            java.lang.String r1 = r3.f68151d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f68152e
            java.lang.String r3 = r3.f68152e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.C25772e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68148a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68149b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68150c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f68151d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f68152e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceEggLogParam(eggType=");
        sb.append(this.f68148a);
        sb.append(", creativeId=");
        sb.append(this.f68149b);
        sb.append(", logExtra=");
        sb.append(this.f68150c);
        sb.append(", groupId=");
        sb.append(this.f68151d);
        sb.append(", eggId=");
        sb.append(this.f68152e);
        sb.append(")");
        return sb.toString();
    }

    public C25772e(String str, String str2, String str3, String str4, String str5) {
        this.f68148a = str;
        this.f68149b = str2;
        this.f68150c = str3;
        this.f68151d = str4;
        this.f68152e = str5;
    }

    public /* synthetic */ C25772e(String str, String str2, String str3, String str4, String str5, int i, C52707g gVar) {
        this(str, str2, str3, str4, null);
    }
}
