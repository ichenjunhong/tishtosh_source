package com.p683ss.android.ugc.aweme.donation;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.donation.j */
public final class C29049j {
    @C17952c(mo34828a = "ngo_name")

    /* renamed from: a */
    public final String f76004a;
    @C17952c(mo34828a = "ngo_donation_link")

    /* renamed from: b */
    public final String f76005b;
    @C17952c(mo34828a = "ngo_icon_url")

    /* renamed from: c */
    public final String f76006c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f76006c, (java.lang.Object) r3.f76006c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.donation.C29049j
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.donation.j r3 = (com.p683ss.android.ugc.aweme.donation.C29049j) r3
            java.lang.String r0 = r2.f76004a
            java.lang.String r1 = r3.f76004a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f76005b
            java.lang.String r1 = r3.f76005b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f76006c
            java.lang.String r3 = r3.f76006c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29049j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f76004a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76005b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76006c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NgoStruct(ngoName=");
        sb.append(this.f76004a);
        sb.append(", donationLink=");
        sb.append(this.f76005b);
        sb.append(", url=");
        sb.append(this.f76006c);
        sb.append(")");
        return sb.toString();
    }
}
