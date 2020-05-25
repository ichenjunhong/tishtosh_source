package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel */
public final class RateSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private RateSettingsResponse rateSetting;

    public static /* synthetic */ RateSettingCombineModel copy$default(RateSettingCombineModel rateSettingCombineModel, RateSettingsResponse rateSettingsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            rateSettingsResponse = rateSettingCombineModel.rateSetting;
        }
        return rateSettingCombineModel.copy(rateSettingsResponse);
    }

    public final RateSettingsResponse component1() {
        return this.rateSetting;
    }

    public final RateSettingCombineModel copy(RateSettingsResponse rateSettingsResponse) {
        C52711k.m112240b(rateSettingsResponse, "rateSetting");
        return new RateSettingCombineModel(rateSettingsResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.rateSetting, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel) r2).rateSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel) r2
            com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse r0 = r1.rateSetting
            com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse r2 = r2.rateSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final RateSettingsResponse getRateSetting() {
        return this.rateSetting;
    }

    public final int hashCode() {
        RateSettingsResponse rateSettingsResponse = this.rateSetting;
        if (rateSettingsResponse != null) {
            return rateSettingsResponse.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateSettingCombineModel(rateSetting=");
        sb.append(this.rateSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setRateSetting(RateSettingsResponse rateSettingsResponse) {
        C52711k.m112240b(rateSettingsResponse, "<set-?>");
        this.rateSetting = rateSettingsResponse;
    }

    public RateSettingCombineModel(RateSettingsResponse rateSettingsResponse) {
        C52711k.m112240b(rateSettingsResponse, "rateSetting");
        this.rateSetting = rateSettingsResponse;
    }
}
