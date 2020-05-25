package com.p683ss.android.ugc.effectmanager.effect.model;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse */
public class SearchEffectResponse extends BaseNetResponse {
    private List<Effect> bind_effects;
    private List<Effect> collection;
    private int cursor;
    private List<Effect> effects;
    private boolean has_more;

    public List<Effect> getBindEffects() {
        return this.bind_effects;
    }

    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public boolean isHasMore() {
        return this.has_more;
    }

    public boolean checkValid() {
        if (this.effects != null) {
            return true;
        }
        return false;
    }

    public void setBindEffects(List<Effect> list) {
        this.bind_effects = list;
    }

    public void setCollection(List<Effect> list) {
        this.collection = list;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setEffects(List<Effect> list) {
        this.effects = list;
    }

    public void setHasMore(boolean z) {
        this.has_more = z;
    }
}
