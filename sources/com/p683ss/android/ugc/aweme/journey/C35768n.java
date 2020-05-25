package com.p683ss.android.ugc.aweme.journey;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.journey.n */
public final class C35768n extends BaseResponse {
    @C17952c(mo34828a = "new_user_interest_page")

    /* renamed from: a */
    public final C35776p f91864a;
    @C17952c(mo34828a = "new_user_content_language_page")

    /* renamed from: b */
    public final C35767m f91865b = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f91865b, (java.lang.Object) r3.f91865b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.journey.C35768n
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.n r3 = (com.p683ss.android.ugc.aweme.journey.C35768n) r3
            com.ss.android.ugc.aweme.journey.p r0 = r2.f91864a
            com.ss.android.ugc.aweme.journey.p r1 = r3.f91864a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.m r0 = r2.f91865b
            com.ss.android.ugc.aweme.journey.m r3 = r3.f91865b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35768n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C35776p pVar = this.f91864a;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C35767m mVar = this.f91865b;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyResponse(new_user_interest_page=");
        sb.append(this.f91864a);
        sb.append(", new_user_content_language_page=");
        sb.append(this.f91865b);
        sb.append(")");
        return sb.toString();
    }

    public C35768n(C35776p pVar, C35767m mVar) {
        this.f91864a = pVar;
    }
}
