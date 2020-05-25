package com.p683ss.android.ugc.aweme.requestcombine;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel;
import com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel;
import com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.ColdLaunchRequestCombiner$onCombineSuccess$2 */
public final class ColdLaunchRequestCombiner$onCombineSuccess$2 implements LegoTask {
    final /* synthetic */ SettingCombineModel $settingCombineModel;

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    ColdLaunchRequestCombiner$onCombineSuccess$2(SettingCombineModel settingCombineModel) {
        this.$settingCombineModel = settingCombineModel;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        SettingCombineModel settingCombineModel = this.$settingCombineModel;
        if (settingCombineModel != null) {
            SettingCombineDataModel data = settingCombineModel.getData();
            if (data != null) {
                AwemeSettingCombineModel awemeSetting = data.getAwemeSetting();
                if (awemeSetting != null) {
                    awemeSetting.getAwemeSetting();
                }
            }
        }
    }
}
