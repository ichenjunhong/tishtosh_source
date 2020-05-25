package com.p683ss.android.ugc.aweme.journey;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.m */
public final class C35767m {
    @C17952c(mo34828a = "content_languages")

    /* renamed from: a */
    public final List<C35765k> f91862a;
    @C17952c(mo34828a = "content_lang_dialog")

    /* renamed from: b */
    public final C35766l f91863b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f91863b, (java.lang.Object) r3.f91863b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.journey.C35767m
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.m r3 = (com.p683ss.android.ugc.aweme.journey.C35767m) r3
            java.util.List<com.ss.android.ugc.aweme.journey.k> r0 = r2.f91862a
            java.util.List<com.ss.android.ugc.aweme.journey.k> r1 = r3.f91862a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.l r0 = r2.f91863b
            com.ss.android.ugc.aweme.journey.l r3 = r3.f91863b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35767m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C35765k> list = this.f91862a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C35766l lVar = this.f91863b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyContentLanguageWrapper(content_languages=");
        sb.append(this.f91862a);
        sb.append(", content_lang_dialog=");
        sb.append(this.f91863b);
        sb.append(")");
        return sb.toString();
    }
}
