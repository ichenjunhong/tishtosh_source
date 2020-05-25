package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel */
public final class SettingCombineModel extends BaseResponse {
    @C17952c(mo34828a = "data")
    private SettingCombineDataModel data;

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        C52711k.m112240b(settingCombineDataModel, "<set-?>");
        this.data = settingCombineDataModel;
    }

    public SettingCombineModel(SettingCombineDataModel settingCombineDataModel) {
        C52711k.m112240b(settingCombineDataModel, "data");
        this.data = settingCombineDataModel;
    }
}
