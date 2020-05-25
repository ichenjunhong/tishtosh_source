package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.l */
public final class C45308l {
    @C17952c(mo34828a = "faceu_product")

    /* renamed from: a */
    public final String f114560a;
    @C17952c(mo34828a = "faceu_stickerIds")

    /* renamed from: b */
    public final List<Integer> f114561b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f114561b, (java.lang.Object) r3.f114561b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.upload.C45308l
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.l r3 = (com.p683ss.android.ugc.aweme.shortvideo.upload.C45308l) r3
            java.lang.String r0 = r2.f114560a
            java.lang.String r1 = r3.f114560a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.lang.Integer> r0 = r2.f114561b
            java.util.List<java.lang.Integer> r3 = r3.f114561b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.upload.C45308l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f114560a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Integer> list = this.f114561b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExemptionReportData(faceu_product=");
        sb.append(this.f114560a);
        sb.append(", faceu_stickerIds=");
        sb.append(this.f114561b);
        sb.append(")");
        return sb.toString();
    }

    public C45308l(String str, List<Integer> list) {
        C52711k.m112240b(str, "faceu_product");
        C52711k.m112240b(list, "faceu_stickerIds");
        this.f114560a = str;
        this.f114561b = list;
    }
}
