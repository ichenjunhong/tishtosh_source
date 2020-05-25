package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.e */
public final class C39121e implements Serializable {
    @C17952c(mo34828a = "activity_id")

    /* renamed from: a */
    private String f99801a;
    @C17952c(mo34828a = "title")

    /* renamed from: b */
    private String f99802b;
    @C17952c(mo34828a = "description")

    /* renamed from: c */
    private String f99803c;
    @C17952c(mo34828a = "activity_url")

    /* renamed from: d */
    private UrlModel f99804d;
    @C17952c(mo34828a = "schema")

    /* renamed from: e */
    private String f99805e;

    public final String getActivityId() {
        return this.f99801a;
    }

    public final UrlModel getActivityUrl() {
        return this.f99804d;
    }

    public final String getDescription() {
        return this.f99803c;
    }

    public final String getSchema() {
        return this.f99805e;
    }

    public final String getTitle() {
        return this.f99802b;
    }

    public final void setActivityId(String str) {
        this.f99801a = str;
    }

    public final void setActivityUrl(UrlModel urlModel) {
        this.f99804d = urlModel;
    }

    public final void setDescription(String str) {
        this.f99803c = str;
    }

    public final void setSchema(String str) {
        this.f99805e = str;
    }

    public final void setTitle(String str) {
        this.f99802b = str;
    }
}
