package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.C18082l;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel */
public final class AbTestCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C18082l abTestResponse;

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, C18082l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(lVar);
    }

    public final C18082l component1() {
        return this.abTestResponse;
    }

    public final AbTestCombineModel copy(C18082l lVar) {
        C52711k.m112240b(lVar, "abTestResponse");
        return new AbTestCombineModel(lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.abTestResponse, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel) r2).abTestResponse) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel) r2
            com.google.gson.l r0 = r1.abTestResponse
            com.google.gson.l r2 = r2.abTestResponse
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel.equals(java.lang.Object):boolean");
    }

    public final C18082l getAbTestResponse() {
        return this.abTestResponse;
    }

    public final int hashCode() {
        C18082l lVar = this.abTestResponse;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbTestCombineModel(abTestResponse=");
        sb.append(this.abTestResponse);
        sb.append(")");
        return sb.toString();
    }

    public final void setAbTestResponse(C18082l lVar) {
        C52711k.m112240b(lVar, "<set-?>");
        this.abTestResponse = lVar;
    }

    public AbTestCombineModel(C18082l lVar) {
        C52711k.m112240b(lVar, "abTestResponse");
        this.abTestResponse = lVar;
    }
}
