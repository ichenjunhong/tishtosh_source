package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38967k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel */
public final class SameCityCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C38967k sameCityModel;

    public static /* synthetic */ SameCityCombineModel copy$default(SameCityCombineModel sameCityCombineModel, C38967k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = sameCityCombineModel.sameCityModel;
        }
        return sameCityCombineModel.copy(kVar);
    }

    public final C38967k component1() {
        return this.sameCityModel;
    }

    public final SameCityCombineModel copy(C38967k kVar) {
        C52711k.m112240b(kVar, "sameCityModel");
        return new SameCityCombineModel(kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.sameCityModel, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel) r2).sameCityModel) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel) r2
            com.ss.android.ugc.aweme.poi.a.k r0 = r1.sameCityModel
            com.ss.android.ugc.aweme.poi.a.k r2 = r2.sameCityModel
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel.equals(java.lang.Object):boolean");
    }

    public final C38967k getSameCityModel() {
        return this.sameCityModel;
    }

    public final int hashCode() {
        C38967k kVar = this.sameCityModel;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SameCityCombineModel(sameCityModel=");
        sb.append(this.sameCityModel);
        sb.append(")");
        return sb.toString();
    }

    public final void setSameCityModel(C38967k kVar) {
        C52711k.m112240b(kVar, "<set-?>");
        this.sameCityModel = kVar;
    }

    public SameCityCombineModel(C38967k kVar) {
        C52711k.m112240b(kVar, "sameCityModel");
        this.sameCityModel = kVar;
    }
}
