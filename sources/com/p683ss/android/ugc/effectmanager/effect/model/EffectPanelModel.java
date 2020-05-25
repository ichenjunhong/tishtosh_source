package com.p683ss.android.ugc.effectmanager.effect.model;

import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel */
public class EffectPanelModel {
    private UrlModel icon;

    /* renamed from: id */
    private String f122942id;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f122942id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public EffectPanelModel() {
        if (this.icon == null) {
            this.icon = new UrlModel();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public boolean checkValued() {
        if (this.icon == null) {
            this.icon = new UrlModel();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        return true;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.f122942id = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public EffectPanelModel(String str, UrlModel urlModel, List<String> list, String str2) {
        this.text = str;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str2;
    }
}
