package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse */
public class ResourceListResponse extends BaseNetResponse {
    private ResourceListModel data;

    public ResourceListModel getData() {
        return this.data;
    }

    public boolean checkValue() {
        if (this.data == null || this.data.getResourceList() == null) {
            return false;
        }
        return true;
    }

    public void setData(ResourceListModel resourceListModel) {
        this.data = resourceListModel;
    }
}
