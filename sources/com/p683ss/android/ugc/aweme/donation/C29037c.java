package com.p683ss.android.ugc.aweme.donation;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.donation.c */
public final class C29037c extends BaseResponse {
    @C17952c(mo34828a = "ngo_struct")

    /* renamed from: a */
    public final C29049j f75977a;
    @C17952c(mo34828a = "donor_list")

    /* renamed from: b */
    public final List<C29048i> f75978b;
    @C17952c(mo34828a = "cursor")

    /* renamed from: c */
    public final Integer f75979c;
    @C17952c(mo34828a = "has_more")

    /* renamed from: d */
    public final Boolean f75980d;
    @C17952c(mo34828a = "banner")

    /* renamed from: e */
    public final C29019a f75981e;
    @C17952c(mo34828a = "donation_summary")

    /* renamed from: f */
    public final String f75982f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f75982f, (java.lang.Object) r3.f75982f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.donation.C29037c
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.donation.c r3 = (com.p683ss.android.ugc.aweme.donation.C29037c) r3
            com.ss.android.ugc.aweme.donation.j r0 = r2.f75977a
            com.ss.android.ugc.aweme.donation.j r1 = r3.f75977a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<com.ss.android.ugc.aweme.donation.i> r0 = r2.f75978b
            java.util.List<com.ss.android.ugc.aweme.donation.i> r1 = r3.f75978b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.f75979c
            java.lang.Integer r1 = r3.f75979c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = r2.f75980d
            java.lang.Boolean r1 = r3.f75980d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.donation.a r0 = r2.f75981e
            com.ss.android.ugc.aweme.donation.a r1 = r3.f75981e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f75982f
            java.lang.String r3 = r3.f75982f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.donation.C29037c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C29049j jVar = this.f75977a;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        List<C29048i> list = this.f75978b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f75979c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f75980d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        C29019a aVar = this.f75981e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f75982f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonateResponse(ngo=");
        sb.append(this.f75977a);
        sb.append(", donorList=");
        sb.append(this.f75978b);
        sb.append(", cursor=");
        sb.append(this.f75979c);
        sb.append(", hasMore=");
        sb.append(this.f75980d);
        sb.append(", banner=");
        sb.append(this.f75981e);
        sb.append(", donationSummary=");
        sb.append(this.f75982f);
        sb.append(")");
        return sb.toString();
    }

    public C29037c(C29049j jVar, List<C29048i> list, Integer num, Boolean bool, C29019a aVar, String str) {
        this.f75977a = jVar;
        this.f75978b = list;
        this.f75979c = num;
        this.f75980d = bool;
        this.f75981e = aVar;
        this.f75982f = str;
    }
}
