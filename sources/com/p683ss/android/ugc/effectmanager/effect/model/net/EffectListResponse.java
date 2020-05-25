package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse */
public class EffectListResponse extends BaseNetResponse {
    private List<Effect> collection = new ArrayList();
    private List<Effect> data;
    private List<String> url_prefix;

    public List<Effect> getCollection() {
        return this.collection;
    }

    public List<Effect> getData() {
        return this.data;
    }

    public List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public void setCollection(List<Effect> list) {
        this.collection = list;
    }

    public void setData(List<Effect> list) {
        this.data = list;
    }

    public void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }
}
