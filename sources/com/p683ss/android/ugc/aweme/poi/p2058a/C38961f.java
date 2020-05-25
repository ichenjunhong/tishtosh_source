package com.p683ss.android.ugc.aweme.poi.p2058a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.poi.model.C39100af;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;
import com.p683ss.android.ugc.aweme.poi.model.C39134r;
import com.p683ss.android.ugc.aweme.poi.model.C39139w;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.a.f */
public final class C38961f {
    @C17952c(mo34828a = "poi_data")

    /* renamed from: a */
    public final PoiStruct f99229a;
    @C17952c(mo34828a = "poi_ext")

    /* renamed from: b */
    public final C39139w f99230b;
    @C17952c(mo34828a = "product_info")

    /* renamed from: c */
    public final C39103ai f99231c;
    @C17952c(mo34828a = "commodity")

    /* renamed from: d */
    public final C39134r f99232d;
    @C17952c(mo34828a = "poi_owner")

    /* renamed from: e */
    public final C39100af f99233e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99233e, (java.lang.Object) r3.f99233e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.p2058a.C38961f
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.a.f r3 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38961f) r3
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r2.f99229a
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r3.f99229a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.w r0 = r2.f99230b
            com.ss.android.ugc.aweme.poi.model.w r1 = r3.f99230b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.ai r0 = r2.f99231c
            com.ss.android.ugc.aweme.poi.model.ai r1 = r3.f99231c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.r r0 = r2.f99232d
            com.ss.android.ugc.aweme.poi.model.r r1 = r3.f99232d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.af r0 = r2.f99233e
            com.ss.android.ugc.aweme.poi.model.af r3 = r3.f99233e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2058a.C38961f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        PoiStruct poiStruct = this.f99229a;
        int i = 0;
        int hashCode = (poiStruct != null ? poiStruct.hashCode() : 0) * 31;
        C39139w wVar = this.f99230b;
        int hashCode2 = (hashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        C39103ai aiVar = this.f99231c;
        int hashCode3 = (hashCode2 + (aiVar != null ? aiVar.hashCode() : 0)) * 31;
        C39134r rVar = this.f99232d;
        int hashCode4 = (hashCode3 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C39100af afVar = this.f99233e;
        if (afVar != null) {
            i = afVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiDetailCommonStruct(poiStruct=");
        sb.append(this.f99229a);
        sb.append(", poiExtension=");
        sb.append(this.f99230b);
        sb.append(", productInfo=");
        sb.append(this.f99231c);
        sb.append(", poiCommodity=");
        sb.append(this.f99232d);
        sb.append(", poiOwner=");
        sb.append(this.f99233e);
        sb.append(")");
        return sb.toString();
    }
}
