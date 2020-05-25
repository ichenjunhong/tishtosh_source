package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.a */
public final class C39087a {
    @C17952c(mo34828a = "poi_class_code")

    /* renamed from: a */
    public final String f99682a;
    @C17952c(mo34828a = "class_option_type")

    /* renamed from: b */
    public final String f99683b;
    @C17952c(mo34828a = "poi_rank_banner")

    /* renamed from: c */
    public final C39092f f99684c;
    @C17952c(mo34828a = "rank_poi_list")

    /* renamed from: d */
    public final List<Object> f99685d;
    @C17952c(mo34828a = "poi_city_option")

    /* renamed from: e */
    public final C39094h f99686e;
    @C17952c(mo34828a = "backend_type_code")

    /* renamed from: f */
    public final String f99687f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99687f, (java.lang.Object) r3.f99687f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.p2062a.C39087a
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.a.a r3 = (com.p683ss.android.ugc.aweme.poi.model.p2062a.C39087a) r3
            java.lang.String r0 = r2.f99682a
            java.lang.String r1 = r3.f99682a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f99683b
            java.lang.String r1 = r3.f99683b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.a.f r0 = r2.f99684c
            com.ss.android.ugc.aweme.poi.model.a.f r1 = r3.f99684c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.Object> r0 = r2.f99685d
            java.util.List<java.lang.Object> r1 = r3.f99685d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.a.h r0 = r2.f99686e
            com.ss.android.ugc.aweme.poi.model.a.h r1 = r3.f99686e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f99687f
            java.lang.String r3 = r3.f99687f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.p2062a.C39087a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f99682a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99683b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C39092f fVar = this.f99684c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        List<Object> list = this.f99685d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        C39094h hVar = this.f99686e;
        int hashCode5 = (hashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str3 = this.f99687f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiAwemeRankStruct(poiClassCode=");
        sb.append(this.f99682a);
        sb.append(", classOptionType=");
        sb.append(this.f99683b);
        sb.append(", rankBanner=");
        sb.append(this.f99684c);
        sb.append(", rankPoiInfoStruct=");
        sb.append(this.f99685d);
        sb.append(", poiRankCityOptionStruct=");
        sb.append(this.f99686e);
        sb.append(", backendTypeCode=");
        sb.append(this.f99687f);
        sb.append(")");
        return sb.toString();
    }
}
