package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.g */
public final class C25563g implements Serializable {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    private String f67597a;
    @C17952c(mo34828a = "category")

    /* renamed from: b */
    private String f67598b;
    @C17952c(mo34828a = "promotion_image")

    /* renamed from: c */
    private UrlModel f67599c;
    @C17952c(mo34828a = "promotion_title")

    /* renamed from: d */
    private String f67600d;
    @C17952c(mo34828a = "h5_url")

    /* renamed from: e */
    private String f67601e;

    public final String getCategory() {
        return this.f67598b;
    }

    public final String getH5Url() {
        return this.f67601e;
    }

    public final UrlModel getPromotionImage() {
        return this.f67599c;
    }

    public final String getPromotionTitle() {
        return this.f67600d;
    }

    public final String getTitle() {
        return this.f67597a;
    }

    public final void setCategory(String str) {
        this.f67598b = str;
    }

    public final void setH5Url(String str) {
        this.f67601e = str;
    }

    public final void setPromotionImage(UrlModel urlModel) {
        this.f67599c = urlModel;
    }

    public final void setPromotionTitle(String str) {
        this.f67600d = str;
    }

    public final void setTitle(String str) {
        this.f67597a = str;
    }
}
