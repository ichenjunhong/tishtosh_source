package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse */
public class EffectCheckUpdateResponse extends BaseNetResponse {
    private boolean updated;

    public boolean isUpdated() {
        return this.updated;
    }

    public boolean checkValue() {
        return super.checkValue();
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }
}
