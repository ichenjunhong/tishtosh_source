package com.p683ss.android.ugc.aweme.legoImp.task;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SafeModeSettingModel */
public final class SafeModeSettingModel {
    @C17952c(mo34828a = "enable")
    public boolean enable;
    @C17952c(mo34828a = "freeze_api")
    public String[] freezeApi = {"tfe/api/request_combine/v1/"};
    @C17952c(mo34828a = "freeze_duration")
    public long freezeDuration = 600000;

    public final boolean getEnable() {
        return this.enable;
    }

    public final String[] getFreezeApi() {
        return this.freezeApi;
    }

    public final long getFreezeDuration() {
        return this.freezeDuration;
    }

    public SafeModeSettingModel() {
        if (C35990q.m81169c()) {
            this.enable = true;
        }
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFreezeDuration(long j) {
        this.freezeDuration = j;
    }

    public final void setFreezeApi(String[] strArr) {
        C52711k.m112240b(strArr, "<set-?>");
        this.freezeApi = strArr;
    }
}
