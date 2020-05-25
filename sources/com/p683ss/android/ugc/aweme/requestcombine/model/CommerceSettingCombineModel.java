package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel */
public final class CommerceSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C26131l combineModel;

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, C26131l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(lVar);
    }

    public final C26131l component1() {
        return this.combineModel;
    }

    public final CommerceSettingCombineModel copy(C26131l lVar) {
        C52711k.m112240b(lVar, "combineModel");
        return new CommerceSettingCombineModel(lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.combineModel, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel) r2).combineModel) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel) r2
            com.ss.android.ugc.aweme.commercialize.model.l r0 = r1.combineModel
            com.ss.android.ugc.aweme.commercialize.model.l r2 = r2.combineModel
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C26131l getCombineModel() {
        return this.combineModel;
    }

    public final int hashCode() {
        C26131l lVar = this.combineModel;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceSettingCombineModel(combineModel=");
        sb.append(this.combineModel);
        sb.append(")");
        return sb.toString();
    }

    public final void setCombineModel(C26131l lVar) {
        C52711k.m112240b(lVar, "<set-?>");
        this.combineModel = lVar;
    }

    public CommerceSettingCombineModel(C26131l lVar) {
        C52711k.m112240b(lVar, "combineModel");
        this.combineModel = lVar;
    }
}
