package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.q */
public final class C26136q implements Serializable {
    @C17952c(mo34828a = "open_url")

    /* renamed from: a */
    String f69014a;
    @C17952c(mo34828a = "web_url")

    /* renamed from: b */
    String f69015b;
    @C17952c(mo34828a = "web_title")

    /* renamed from: c */
    String f69016c;
    @C17952c(mo34828a = "source_type")

    /* renamed from: d */
    String f69017d;
    @C17952c(mo34828a = "source_url")

    /* renamed from: e */
    UrlModel f69018e;
    @C17952c(mo34828a = "is_h5")

    /* renamed from: f */
    boolean f69019f;
    @C17952c(mo34828a = "easter_egg_id")

    /* renamed from: g */
    String f69020g;
    @C17952c(mo34828a = "easter_egg_name")

    /* renamed from: h */
    String f69021h;

    public final String getId() {
        return this.f69020g;
    }

    public final String getName() {
        return this.f69021h;
    }

    public final String getOpenUrl() {
        return this.f69014a;
    }

    public final String getSourceType() {
        return this.f69017d;
    }

    public final UrlModel getSourceUrl() {
        return this.f69018e;
    }

    public final String getWebTitle() {
        return this.f69016c;
    }

    public final String getWebUrl() {
        return this.f69015b;
    }

    public final boolean isH5() {
        return this.f69019f;
    }

    public final void setId(String str) {
        this.f69020g = str;
    }

    public final void setName(String str) {
        this.f69021h = str;
    }

    public final void setOpenUrl(String str) {
        this.f69014a = str;
    }

    public final void setSourceType(String str) {
        this.f69017d = str;
    }

    public final void setSourceUrl(UrlModel urlModel) {
        this.f69018e = urlModel;
    }

    public final void setWebTitle(String str) {
        this.f69016c = str;
    }

    public final void setWebUrl(String str) {
        this.f69015b = str;
    }
}
