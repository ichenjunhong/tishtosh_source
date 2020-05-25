package com.p683ss.android.ugc.aweme.commercialize.egg;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a */
public final class C25743a {

    /* renamed from: a */
    public final String f68078a;

    /* renamed from: b */
    public final String f68079b;

    /* renamed from: c */
    public final String f68080c;

    /* renamed from: d */
    public final String f68081d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68081d, (java.lang.Object) r3.f68081d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.egg.C25743a
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.egg.a r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.C25743a) r3
            java.lang.String r0 = r2.f68078a
            java.lang.String r1 = r3.f68078a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68079b
            java.lang.String r1 = r3.f68079b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68080c
            java.lang.String r1 = r3.f68080c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68081d
            java.lang.String r3 = r3.f68081d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.C25743a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68078a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68079b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68080c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f68081d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentEggExtParam(eggId=");
        sb.append(this.f68078a);
        sb.append(", regex=");
        sb.append(this.f68079b);
        sb.append(", webUrl=");
        sb.append(this.f68080c);
        sb.append(", openUrl=");
        sb.append(this.f68081d);
        sb.append(")");
        return sb.toString();
    }

    public C25743a(String str, String str2, String str3, String str4) {
        this.f68078a = str;
        this.f68079b = str2;
        this.f68080c = str3;
        this.f68081d = str4;
    }
}
