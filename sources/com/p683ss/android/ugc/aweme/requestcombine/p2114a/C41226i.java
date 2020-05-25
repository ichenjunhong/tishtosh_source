package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel;
import com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel;
import com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.i */
public final class C41226i extends C41216a {

    /* renamed from: a */
    private VideoBitRateABManager f104672a;

    /* renamed from: b */
    private BaseCombineMode f104673b;

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104673b;
    }

    public C41226i() {
        if (mo83708a() != null) {
            this.f104672a = VideoBitRateABManager.m103801c();
        }
    }

    /* renamed from: a */
    public final String mo83708a() {
        if (C48017a.m103961c()) {
            return "/aweme/v1/rate/settings/";
        }
        return null;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        this.f104672a = null;
    }

    /* renamed from: a */
    public final boolean mo83711a(SettingCombineModel settingCombineModel) {
        RateSettingCombineModel rateSettingCombineModel = null;
        this.f104672a = null;
        if (settingCombineModel != null) {
            SettingCombineDataModel data = settingCombineModel.getData();
            if (data != null) {
                rateSettingCombineModel = data.getRateSettingCombineModel();
            }
        }
        boolean z = false;
        if (rateSettingCombineModel != null) {
            RateSettingsResponse rateSetting = rateSettingCombineModel.getRateSetting();
            if (rateSetting != null && rateSetting.status_code == 0) {
                this.f104673b = rateSettingCombineModel;
                if (rateSettingCombineModel.getHttpCode() == 200) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }
}
