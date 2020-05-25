package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel */
public final class ComplianceSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private ComplianceSetting complianceSetting;

    public static /* synthetic */ ComplianceSettingCombineModel copy$default(ComplianceSettingCombineModel complianceSettingCombineModel, ComplianceSetting complianceSetting2, int i, Object obj) {
        if ((i & 1) != 0) {
            complianceSetting2 = complianceSettingCombineModel.complianceSetting;
        }
        return complianceSettingCombineModel.copy(complianceSetting2);
    }

    public final ComplianceSetting component1() {
        return this.complianceSetting;
    }

    public final ComplianceSettingCombineModel copy(ComplianceSetting complianceSetting2) {
        C52711k.m112240b(complianceSetting2, "complianceSetting");
        return new ComplianceSettingCombineModel(complianceSetting2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.complianceSetting, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel) r2).complianceSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel) r2
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r1.complianceSetting
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r2 = r2.complianceSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final ComplianceSetting getComplianceSetting() {
        return this.complianceSetting;
    }

    public final int hashCode() {
        ComplianceSetting complianceSetting2 = this.complianceSetting;
        if (complianceSetting2 != null) {
            return complianceSetting2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceSettingCombineModel(complianceSetting=");
        sb.append(this.complianceSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setComplianceSetting(ComplianceSetting complianceSetting2) {
        C52711k.m112240b(complianceSetting2, "<set-?>");
        this.complianceSetting = complianceSetting2;
    }

    public ComplianceSettingCombineModel(ComplianceSetting complianceSetting2) {
        C52711k.m112240b(complianceSetting2, "complianceSetting");
        this.complianceSetting = complianceSetting2;
    }
}
