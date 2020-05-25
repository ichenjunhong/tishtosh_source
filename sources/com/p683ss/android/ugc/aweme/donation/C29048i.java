package com.p683ss.android.ugc.aweme.donation;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.donation.i */
public final class C29048i {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public final User f75999a;
    @C17952c(mo34828a = "timestamp")

    /* renamed from: b */
    public final Long f76000b;
    @C17952c(mo34828a = "user_amount")

    /* renamed from: c */
    public final String f76001c;
    @C17952c(mo34828a = "tiktok_amount")

    /* renamed from: d */
    public final String f76002d;
    @C17952c(mo34828a = "anonymous")

    /* renamed from: e */
    public final Boolean f76003e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f76003e, (java.lang.Object) r3.f76003e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.donation.C29048i
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.donation.i r3 = (com.p683ss.android.ugc.aweme.donation.C29048i) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.f75999a
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.f75999a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Long r0 = r2.f76000b
            java.lang.Long r1 = r3.f76000b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f76001c
            java.lang.String r1 = r3.f76001c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f76002d
            java.lang.String r1 = r3.f76002d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.f76003e
            java.lang.Boolean r3 = r3.f76003e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29048i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        User user = this.f75999a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Long l = this.f76000b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f76001c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76002d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f76003e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonorStruct(user=");
        sb.append(this.f75999a);
        sb.append(", timestamp=");
        sb.append(this.f76000b);
        sb.append(", amount=");
        sb.append(this.f76001c);
        sb.append(", tiktokAmount=");
        sb.append(this.f76002d);
        sb.append(", anonymous=");
        sb.append(this.f76003e);
        sb.append(")");
        return sb.toString();
    }
}
