package com.p683ss.android.ugc.aweme.discover.alading;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.l */
public final class C28047l {
    @C17952c(mo34828a = "hotspot_items")

    /* renamed from: a */
    public List<? extends Aweme> f73677a;
    @C17952c(mo34828a = "hotspot")

    /* renamed from: b */
    public final C28048m f73678b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f73678b, (java.lang.Object) r3.f73678b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.alading.C28047l
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.alading.l r3 = (com.p683ss.android.ugc.aweme.discover.alading.C28047l) r3
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.f73677a
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r3.f73677a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.alading.m r0 = r2.f73678b
            com.ss.android.ugc.aweme.discover.alading.m r3 = r3.f73678b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.alading.C28047l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<? extends Aweme> list = this.f73677a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C28048m mVar = this.f73678b;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpot(awemeCards=");
        sb.append(this.f73677a);
        sb.append(", searchSpotInfo=");
        sb.append(this.f73678b);
        sb.append(")");
        return sb.toString();
    }
}
