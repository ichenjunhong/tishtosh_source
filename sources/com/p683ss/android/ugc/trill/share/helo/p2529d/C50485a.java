package com.p683ss.android.ugc.trill.share.helo.p2529d;

/* renamed from: com.ss.android.ugc.trill.share.helo.d.a */
public final class C50485a {

    /* renamed from: a */
    public final String f126555a;

    /* renamed from: b */
    public final String f126556b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f126556b, (java.lang.Object) r3.f126556b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.trill.share.helo.d.a r3 = (com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a) r3
            java.lang.String r0 = r2.f126555a
            java.lang.String r1 = r3.f126555a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f126556b
            java.lang.String r3 = r3.f126556b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f126555a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126556b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeloAuthParam(_userName=");
        sb.append(this.f126555a);
        sb.append(", _userAvatar=");
        sb.append(this.f126556b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo98386a() {
        String str = this.f126555a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo98387b() {
        String str = this.f126556b;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C50485a(String str, String str2) {
        this.f126555a = str;
        this.f126556b = str2;
    }
}
