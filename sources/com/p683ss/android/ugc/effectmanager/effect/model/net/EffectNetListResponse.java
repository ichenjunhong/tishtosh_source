package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse */
public class EffectNetListResponse extends BaseNetResponse {
    private EffectChannelModel data;

    public EffectChannelModel getData() {
        return this.data;
    }

    public boolean checkValue() {
        if (this.data == null || !this.data.checkValued()) {
            return false;
        }
        return true;
    }

    public void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }
}
