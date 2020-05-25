package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.h */
public final class C39094h {
    @C17952c(mo34828a = "code")

    /* renamed from: a */
    public final String f99720a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public final String f99721b;
    @C17952c(mo34828a = "district_options")

    /* renamed from: c */
    public final List<Object> f99722c;

    public C39094h() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99722c, (java.lang.Object) r3.f99722c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.p2062a.C39094h
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.model.a.h r3 = (com.p683ss.android.ugc.aweme.poi.model.p2062a.C39094h) r3
            java.lang.String r0 = r2.f99720a
            java.lang.String r1 = r3.f99720a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f99721b
            java.lang.String r1 = r3.f99721b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<java.lang.Object> r0 = r2.f99722c
            java.util.List<java.lang.Object> r3 = r3.f99722c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.p2062a.C39094h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f99720a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99721b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.f99722c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRankCityOptionStruct(code=");
        sb.append(this.f99720a);
        sb.append(", name=");
        sb.append(this.f99721b);
        sb.append(", districtOptions=");
        sb.append(this.f99722c);
        sb.append(")");
        return sb.toString();
    }

    private C39094h(String str, String str2, List<Object> list) {
        C52711k.m112240b(str, "code");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        this.f99720a = str;
        this.f99721b = str2;
        this.f99722c = list;
    }

    private /* synthetic */ C39094h(String str, String str2, List list, int i, C52707g gVar) {
        this("", "", null);
    }
}
