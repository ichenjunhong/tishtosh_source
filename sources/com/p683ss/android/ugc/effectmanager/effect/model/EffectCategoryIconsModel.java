package com.p683ss.android.ugc.effectmanager.effect.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel */
public class EffectCategoryIconsModel {
    private String uri;
    private List<String> url_list;

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public EffectCategoryIconsModel() {
        this.url_list = new ArrayList();
        this.uri = "";
    }

    public boolean checkValued() {
        if (this.url_list == null) {
            this.url_list = new ArrayList();
        }
        return true;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        this.url_list = list;
    }

    public EffectCategoryIconsModel(List<String> list, String str) {
        this.url_list = list;
        this.uri = str;
    }
}
