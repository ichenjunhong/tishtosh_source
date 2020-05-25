package com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ad.e.d.c */
public final class C22403c {
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")

    /* renamed from: a */
    public final C22401a f60340a;
    @C17952c(mo34828a = "ad_card_list")

    /* renamed from: b */
    public final List<String> f60341b;
    @C17952c(mo34828a = "card_top_title")

    /* renamed from: c */
    public final String f60342c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f60342c, (java.lang.Object) r3.f60342c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.ad.e.d.c r3 = (com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c) r3
            com.ss.android.ugc.aweme.ad.e.d.a r0 = r2.f60340a
            com.ss.android.ugc.aweme.ad.e.d.a r1 = r3.f60340a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<java.lang.String> r0 = r2.f60341b
            java.util.List<java.lang.String> r1 = r3.f60341b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f60342c
            java.lang.String r3 = r3.f60342c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C22401a aVar = this.f60340a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<String> list = this.f60341b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f60342c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAdModule(adItem=");
        sb.append(this.f60340a);
        sb.append(", adItemGroup=");
        sb.append(this.f60341b);
        sb.append(", topTitle=");
        sb.append(this.f60342c);
        sb.append(")");
        return sb.toString();
    }
}
