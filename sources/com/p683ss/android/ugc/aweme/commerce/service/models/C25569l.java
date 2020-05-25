package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.l */
public final class C25569l implements Serializable {
    @C17952c(mo34828a = "coupon")

    /* renamed from: a */
    private C25570m f67670a;

    public static /* synthetic */ C25569l copy$default(C25569l lVar, C25570m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mVar = lVar.f67670a;
        }
        return lVar.copy(mVar);
    }

    public final C25570m component1() {
        return this.f67670a;
    }

    public final C25569l copy(C25570m mVar) {
        return new C25569l(mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f67670a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.commerce.service.models.C25569l) r2).f67670a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.commerce.service.models.C25569l
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.commerce.service.models.l r2 = (com.p683ss.android.ugc.aweme.commerce.service.models.C25569l) r2
            com.ss.android.ugc.aweme.commerce.service.models.m r0 = r1.f67670a
            com.ss.android.ugc.aweme.commerce.service.models.m r2 = r2.f67670a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.service.models.C25569l.equals(java.lang.Object):boolean");
    }

    public final C25570m getCoupon() {
        return this.f67670a;
    }

    public final int hashCode() {
        C25570m mVar = this.f67670a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaoBao(coupon=");
        sb.append(this.f67670a);
        sb.append(")");
        return sb.toString();
    }

    public final void setCoupon(C25570m mVar) {
        this.f67670a = mVar;
    }

    public C25569l(C25570m mVar) {
        this.f67670a = mVar;
    }
}
