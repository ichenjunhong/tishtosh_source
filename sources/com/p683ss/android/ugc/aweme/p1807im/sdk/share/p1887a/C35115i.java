package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.i */
public final class C35115i {

    /* renamed from: a */
    public final String f90307a;

    /* renamed from: b */
    public final Map<String, Boolean> f90308b;

    /* renamed from: c */
    public final SharePackage f90309c;

    /* renamed from: d */
    public final List<IMContact> f90310d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f90310d, (java.lang.Object) r3.f90310d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35115i
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.im.sdk.share.a.i r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35115i) r3
            java.lang.String r0 = r2.f90307a
            java.lang.String r1 = r3.f90307a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r2.f90308b
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r3.f90308b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r2.f90309c
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r3.f90309c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r0 = r2.f90310d
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r3 = r3.f90310d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35115i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f90307a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Boolean> map = this.f90308b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        SharePackage sharePackage = this.f90309c;
        int hashCode3 = (hashCode2 + (sharePackage != null ? sharePackage.hashCode() : 0)) * 31;
        List<IMContact> list = this.f90310d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareState(type=");
        sb.append(this.f90307a);
        sb.append(", conversationMap=");
        sb.append(this.f90308b);
        sb.append(", sharePackage=");
        sb.append(this.f90309c);
        sb.append(", list=");
        sb.append(this.f90310d);
        sb.append(")");
        return sb.toString();
    }

    public C35115i(String str, Map<String, Boolean> map, SharePackage sharePackage, List<IMContact> list) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(map, "conversationMap");
        C52711k.m112240b(sharePackage, "sharePackage");
        C52711k.m112240b(list, "list");
        this.f90307a = str;
        this.f90308b = map;
        this.f90309c = sharePackage;
        this.f90310d = list;
    }
}
