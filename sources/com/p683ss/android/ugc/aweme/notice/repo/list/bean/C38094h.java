package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.h */
public final class C38094h {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    public String f96910a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f96911b;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: c */
    public String f96912c;

    public C38094h() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f96912c, (java.lang.Object) r3.f96912c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38094h
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.notice.repo.list.bean.h r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38094h) r3
            java.lang.String r0 = r2.f96910a
            java.lang.String r1 = r3.f96910a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f96911b
            java.lang.String r1 = r3.f96911b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f96912c
            java.lang.String r3 = r3.f96912c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38094h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f96910a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96911b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96912c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkProfitNotice(title=");
        sb.append(this.f96910a);
        sb.append(", content=");
        sb.append(this.f96911b);
        sb.append(", schemaUrl=");
        sb.append(this.f96912c);
        sb.append(")");
        return sb.toString();
    }

    private C38094h(String str, String str2, String str3) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, C42311c.f106865i);
        C52711k.m112240b(str3, "schemaUrl");
        this.f96910a = str;
        this.f96911b = str2;
        this.f96912c = str3;
    }

    private /* synthetic */ C38094h(String str, String str2, String str3, int i, C52707g gVar) {
        this("", "", "");
    }
}
