package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.C18082l;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel */
public final class AwemeSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C18082l awemeSetting;

    public static /* synthetic */ AwemeSettingCombineModel copy$default(AwemeSettingCombineModel awemeSettingCombineModel, C18082l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = awemeSettingCombineModel.awemeSetting;
        }
        return awemeSettingCombineModel.copy(lVar);
    }

    public final C18082l component1() {
        return this.awemeSetting;
    }

    public final AwemeSettingCombineModel copy(C18082l lVar) {
        C52711k.m112240b(lVar, "awemeSetting");
        return new AwemeSettingCombineModel(lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.awemeSetting, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel) r2).awemeSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel) r2
            com.google.gson.l r0 = r1.awemeSetting
            com.google.gson.l r2 = r2.awemeSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C18082l getAwemeSetting() {
        return this.awemeSetting;
    }

    public final int hashCode() {
        C18082l lVar = this.awemeSetting;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeSettingCombineModel(awemeSetting=");
        sb.append(this.awemeSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setAwemeSetting(C18082l lVar) {
        C52711k.m112240b(lVar, "<set-?>");
        this.awemeSetting = lVar;
    }

    public AwemeSettingCombineModel(C18082l lVar) {
        C52711k.m112240b(lVar, "awemeSetting");
        this.awemeSetting = lVar;
    }
}
