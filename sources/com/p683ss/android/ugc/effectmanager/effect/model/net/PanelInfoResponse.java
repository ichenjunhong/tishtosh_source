package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse */
public class PanelInfoResponse extends BaseNetResponse {
    private PanelInfoModel data;

    public PanelInfoModel getData() {
        return this.data;
    }

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }
}
