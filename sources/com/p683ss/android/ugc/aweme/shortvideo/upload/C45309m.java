package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.m */
public final class C45309m {
    @C17952c(mo34828a = "type")

    /* renamed from: a */
    public final String f114562a;
    @C17952c(mo34828a = "data")

    /* renamed from: b */
    public final C45308l f114563b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f114563b, (java.lang.Object) r3.f114563b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.shortvideo.upload.C45309m
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.m r3 = (com.p683ss.android.ugc.aweme.shortvideo.upload.C45309m) r3
            java.lang.String r0 = r2.f114562a
            java.lang.String r1 = r3.f114562a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.l r0 = r2.f114563b
            com.ss.android.ugc.aweme.shortvideo.upload.l r3 = r3.f114563b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.upload.C45309m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f114562a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C45308l lVar = this.f114563b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExemptionReportParam(type=");
        sb.append(this.f114562a);
        sb.append(", data=");
        sb.append(this.f114563b);
        sb.append(")");
        return sb.toString();
    }

    private C45309m(String str, C45308l lVar) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(lVar, "data");
        this.f114562a = str;
        this.f114563b = lVar;
    }

    public /* synthetic */ C45309m(String str, C45308l lVar, int i, C52707g gVar) {
        this("faceu_sticker", lVar);
    }
}
