package com.p683ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel */
public class CategoryEffectModel {
    private List<Effect> bind_effects;
    private String category_key;
    private List<Effect> collection;
    private int cursor;
    private List<Effect> effects;
    private boolean has_more;
    private int sorting_position;
    private String version;

    public List<Effect> getBindEffects() {
        return this.bind_effects;
    }

    public String getCategoryKey() {
        return this.category_key;
    }

    public List<Effect> getCollectEffects() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public int getSortingPosition() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean hasMore() {
        return this.has_more;
    }

    public void setBindEffects(List<Effect> list) {
        this.bind_effects = list;
    }

    public void setCategoryKey(String str) {
        this.category_key = str;
    }

    public void setCollectEffects(List<Effect> list) {
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

    public void setSortingPosition(int i) {
        this.sorting_position = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
