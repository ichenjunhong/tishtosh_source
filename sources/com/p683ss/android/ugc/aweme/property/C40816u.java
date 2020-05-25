package com.p683ss.android.ugc.aweme.property;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.u */
public final class C40816u {

    /* renamed from: a */
    public final String f103946a;

    /* renamed from: b */
    public final String f103947b;

    /* renamed from: c */
    public final String f103948c;

    /* renamed from: d */
    public final String f103949d;

    /* renamed from: e */
    public final String f103950e;

    /* renamed from: f */
    public final String f103951f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f103951f, (java.lang.Object) r3.f103951f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.property.C40816u
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.property.u r3 = (com.p683ss.android.ugc.aweme.property.C40816u) r3
            java.lang.String r0 = r2.f103946a
            java.lang.String r1 = r3.f103946a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f103947b
            java.lang.String r1 = r3.f103947b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f103948c
            java.lang.String r1 = r3.f103948c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f103949d
            java.lang.String r1 = r3.f103949d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f103950e
            java.lang.String r1 = r3.f103950e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f103951f
            java.lang.String r3 = r3.f103951f
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.property.C40816u.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f103946a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f103947b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f103948c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f103949d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f103950e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f103951f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemMoreMessage(owner=");
        sb.append(this.f103946a);
        sb.append(", chineseKey=");
        sb.append(this.f103947b);
        sb.append(", paraMeaning=");
        sb.append(this.f103948c);
        sb.append(", time=");
        sb.append(this.f103949d);
        sb.append(", wiki=");
        sb.append(this.f103950e);
        sb.append(", others=");
        sb.append(this.f103951f);
        sb.append(")");
        return sb.toString();
    }

    public C40816u(String str, String str2, String str3, String str4, String str5, String str6) {
        C52711k.m112240b(str, "owner");
        C52711k.m112240b(str2, "chineseKey");
        C52711k.m112240b(str3, "paraMeaning");
        C52711k.m112240b(str4, "time");
        C52711k.m112240b(str5, "wiki");
        C52711k.m112240b(str6, "others");
        this.f103946a = str;
        this.f103947b = str2;
        this.f103948c = str3;
        this.f103949d = str4;
        this.f103950e = str5;
        this.f103951f = str6;
    }
}
