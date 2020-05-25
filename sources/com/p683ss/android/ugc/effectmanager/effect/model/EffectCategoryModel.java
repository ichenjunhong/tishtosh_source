package com.p683ss.android.ugc.effectmanager.effect.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel */
public class EffectCategoryModel {
    private List<String> effects = new ArrayList();
    private String extra;
    private EffectCategoryIconsModel icon;
    private EffectCategoryIconsModel icon_selected;

    /* renamed from: id */
    private String f122940id;
    private boolean is_default;
    private String key;
    private String name;
    private List<String> tags;
    private String tags_updated_at;

    public List<String> getEffects() {
        return this.effects;
    }

    public String getExtra() {
        return this.extra;
    }

    public EffectCategoryIconsModel getIcon() {
        return this.icon;
    }

    public EffectCategoryIconsModel getIcon_selected() {
        return this.icon_selected;
    }

    public String getId() {
        return this.f122940id;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTagsUpdateTime() {
        return this.tags_updated_at;
    }

    public String getTagsUpdatedAt() {
        return this.tags_updated_at;
    }

    public boolean isDefault() {
        return this.is_default;
    }

    public boolean checkValued() {
        if (this.icon == null) {
            this.icon = new EffectCategoryIconsModel();
        }
        if (this.icon_selected == null) {
            this.icon_selected = new EffectCategoryIconsModel();
        }
        if (this.effects == null) {
            this.effects = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (TextUtils.isEmpty(this.f122940id) || !this.icon.checkValued() || !this.icon_selected.checkValued()) {
            return false;
        }
        return true;
    }

    public void setEffects(List<String> list) {
        this.effects = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(EffectCategoryIconsModel effectCategoryIconsModel) {
        this.icon = effectCategoryIconsModel;
    }

    public void setIcon_selected(EffectCategoryIconsModel effectCategoryIconsModel) {
        this.icon_selected = effectCategoryIconsModel;
    }

    public void setId(String str) {
        this.f122940id = str;
    }

    public void setIsDefault(boolean z) {
        this.is_default = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTagsUpdatedAt(String str) {
        this.tags_updated_at = str;
    }
}
