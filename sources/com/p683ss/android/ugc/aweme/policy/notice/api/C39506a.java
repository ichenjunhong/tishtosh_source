package com.p683ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.a */
public final class C39506a {
    @C17952c(mo34828a = "business")

    /* renamed from: a */
    public final String f101058a;
    @C17952c(mo34828a = "policy_version")

    /* renamed from: b */
    public final String f101059b;
    @C17952c(mo34828a = "style")

    /* renamed from: c */
    public final String f101060c;
    @C17952c(mo34828a = "title")

    /* renamed from: d */
    public final String f101061d;
    @C17952c(mo34828a = "body")

    /* renamed from: e */
    public final String f101062e;
    @C17952c(mo34828a = "actions")

    /* renamed from: f */
    public final List<C39507b> f101063f;
    @C17952c(mo34828a = "icon_url")

    /* renamed from: g */
    public final String f101064g;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f101064g, (java.lang.Object) r3.f101064g) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.policy.notice.api.C39506a
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.policy.notice.api.a r3 = (com.p683ss.android.ugc.aweme.policy.notice.api.C39506a) r3
            java.lang.String r0 = r2.f101058a
            java.lang.String r1 = r3.f101058a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f101059b
            java.lang.String r1 = r3.f101059b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f101060c
            java.lang.String r1 = r3.f101060c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f101061d
            java.lang.String r1 = r3.f101061d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f101062e
            java.lang.String r1 = r3.f101062e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.b> r0 = r2.f101063f
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.b> r1 = r3.f101063f
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f101064g
            java.lang.String r3 = r3.f101064g
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.policy.notice.api.C39506a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f101058a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101059b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101060c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f101061d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f101062e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<C39507b> list = this.f101063f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.f101064g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNotice(business=");
        sb.append(this.f101058a);
        sb.append(", policyVersion=");
        sb.append(this.f101059b);
        sb.append(", style=");
        sb.append(this.f101060c);
        sb.append(", title=");
        sb.append(this.f101061d);
        sb.append(", body=");
        sb.append(this.f101062e);
        sb.append(", actions=");
        sb.append(this.f101063f);
        sb.append(", icon_url=");
        sb.append(this.f101064g);
        sb.append(")");
        return sb.toString();
    }
}
