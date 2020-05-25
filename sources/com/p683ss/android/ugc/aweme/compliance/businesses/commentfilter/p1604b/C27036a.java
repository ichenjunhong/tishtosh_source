package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.b.a */
public final class C27036a {
    @C17952c(mo34828a = "words")

    /* renamed from: a */
    public final List<String> f71356a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f71356a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a) r2).f71356a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.compliance.businesses.commentfilter.b.a r2 = (com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a) r2
            java.util.List<java.lang.String> r0 = r1.f71356a
            java.util.List<java.lang.String> r2 = r2.f71356a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<String> list = this.f71356a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Words(words=");
        sb.append(this.f71356a);
        sb.append(")");
        return sb.toString();
    }
}
