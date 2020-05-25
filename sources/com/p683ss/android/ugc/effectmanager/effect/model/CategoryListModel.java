package com.p683ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.CategoryListModel */
public class CategoryListModel {
    private EffectCategoryIconsModel icon;
    private EffectCategoryIconsModel icon_selected;

    /* renamed from: id */
    private String f122938id;
    private String key;
    private String name;
    private List<String> tags;
    private String tags_updated_at;

    public String getId() {
        return this.f122938id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.f122938id = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
