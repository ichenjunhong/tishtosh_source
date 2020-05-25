package com.p683ss.android.ugc.aweme.feed.api;

/* renamed from: com.ss.android.ugc.aweme.feed.api.l */
public final class C30154l {

    /* renamed from: a */
    public final String f78703a;

    /* renamed from: b */
    public Integer f78704b;

    /* renamed from: c */
    public String f78705c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f78705c, (java.lang.Object) r3.f78705c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.api.C30154l
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.api.l r3 = (com.p683ss.android.ugc.aweme.feed.api.C30154l) r3
            java.lang.String r0 = r2.f78703a
            java.lang.String r1 = r3.f78703a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f78704b
            java.lang.Integer r1 = r3.f78704b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f78705c
            java.lang.String r3 = r3.f78705c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.api.C30154l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f78703a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f78704b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f78705c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExtraInfo(requestLog=");
        sb.append(this.f78703a);
        sb.append(", retryTimes=");
        sb.append(this.f78704b);
        sb.append(", url=");
        sb.append(this.f78705c);
        sb.append(")");
        return sb.toString();
    }

    public C30154l(String str, Integer num, String str2) {
        this.f78703a = str;
        this.f78704b = num;
        this.f78705c = str2;
    }
}
