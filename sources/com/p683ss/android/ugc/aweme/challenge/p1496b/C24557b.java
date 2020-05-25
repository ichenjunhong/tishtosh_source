package com.p683ss.android.ugc.aweme.challenge.p1496b;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.challenge.b.b */
public final class C24557b {

    /* renamed from: a */
    public final Integer f65014a;

    /* renamed from: b */
    public final Integer f65015b;

    /* renamed from: c */
    public final Integer f65016c;

    public C24557b() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f65016c, (java.lang.Object) r3.f65016c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.challenge.p1496b.C24557b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.challenge.b.b r3 = (com.p683ss.android.ugc.aweme.challenge.p1496b.C24557b) r3
            java.lang.Integer r0 = r2.f65014a
            java.lang.Integer r1 = r3.f65014a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f65015b
            java.lang.Integer r1 = r3.f65015b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f65016c
            java.lang.Integer r3 = r3.f65016c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1496b.C24557b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.f65014a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f65015b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f65016c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextProperty(width=");
        sb.append(this.f65014a);
        sb.append(", height=");
        sb.append(this.f65015b);
        sb.append(", lineCount=");
        sb.append(this.f65016c);
        sb.append(")");
        return sb.toString();
    }

    public C24557b(Integer num, Integer num2, Integer num3) {
        this.f65014a = num;
        this.f65015b = num2;
        this.f65016c = num3;
    }

    public /* synthetic */ C24557b(Integer num, Integer num2, Integer num3, int i, C52707g gVar) {
        this(Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1));
    }
}
