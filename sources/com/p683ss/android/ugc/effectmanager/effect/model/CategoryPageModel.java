package com.p683ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel */
public class CategoryPageModel {
    private CategoryEffectModel category_effects;
    private List<String> url_prefix;

    public CategoryEffectModel getCategoryEffects() {
        return this.category_effects;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }
}
