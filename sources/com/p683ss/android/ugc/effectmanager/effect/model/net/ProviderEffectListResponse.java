package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse */
public class ProviderEffectListResponse extends BaseNetResponse {
    private ProviderEffectModel data;

    public ProviderEffectModel getData() {
        return this.data;
    }

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }
}
