package com.p683ss.android.ugc.aweme.poi.p2059b;

/* renamed from: com.ss.android.ugc.aweme.poi.b.f */
public final class C39046f {

    /* renamed from: a */
    public final Boolean f99540a;

    /* renamed from: b */
    public final String f99541b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99541b, (java.lang.Object) r3.f99541b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.p2059b.C39046f
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.b.f r3 = (com.p683ss.android.ugc.aweme.poi.p2059b.C39046f) r3
            java.lang.Boolean r0 = r2.f99540a
            java.lang.Boolean r1 = r3.f99540a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f99541b
            java.lang.String r3 = r3.f99541b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2059b.C39046f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Boolean bool = this.f99540a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f99541b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiPageStateEvent(visible=");
        sb.append(this.f99540a);
        sb.append(", poiId=");
        sb.append(this.f99541b);
        sb.append(")");
        return sb.toString();
    }

    public C39046f(Boolean bool, String str) {
        this.f99540a = bool;
        this.f99541b = str;
    }
}
