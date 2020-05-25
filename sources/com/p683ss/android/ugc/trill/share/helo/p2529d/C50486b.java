package com.p683ss.android.ugc.trill.share.helo.p2529d;

/* renamed from: com.ss.android.ugc.trill.share.helo.d.b */
public final class C50486b {

    /* renamed from: a */
    public final String f126557a;

    /* renamed from: b */
    public final String f126558b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f126558b, (java.lang.Object) r3.f126558b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.trill.share.helo.d.b r3 = (com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b) r3
            java.lang.String r0 = r2.f126557a
            java.lang.String r1 = r3.f126557a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f126558b
            java.lang.String r3 = r3.f126558b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f126557a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126558b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeloOpenApiParam(_hostAuthTicketDomain=");
        sb.append(this.f126557a);
        sb.append(", _hostAuthCodeDomain=");
        sb.append(this.f126558b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo98391a() {
        String str = this.f126557a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo98392b() {
        String str = this.f126558b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C50486b(String str, String str2) {
        this.f126557a = str;
        this.f126558b = str2;
    }
}
