package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.d */
public final class C25559d implements Serializable {
    @C17952c(mo34828a = "text")

    /* renamed from: a */
    private List<String> f67563a;
    @C17952c(mo34828a = "open_app_url")

    /* renamed from: b */
    private String f67564b;
    @C17952c(mo34828a = "small_app_url")

    /* renamed from: c */
    private String f67565c;
    @C17952c(mo34828a = "h5_url")

    /* renamed from: d */
    private String f67566d;
    @C17952c(mo34828a = "toast")

    /* renamed from: e */
    private String f67567e;

    public final String getOpenAppUrl() {
        return this.f67564b;
    }

    public final String getSmallAppUrl() {
        return this.f67565c;
    }

    public final List<String> getText() {
        return this.f67563a;
    }

    public final String getToast() {
        return this.f67567e;
    }

    public final String getWebUrl() {
        return this.f67566d;
    }

    public final void setOpenAppUrl(String str) {
        this.f67564b = str;
    }

    public final void setSmallAppUrl(String str) {
        this.f67565c = str;
    }

    public final void setText(List<String> list) {
        this.f67563a = list;
    }

    public final void setToast(String str) {
        this.f67567e = str;
    }

    public final void setWebUrl(String str) {
        this.f67566d = str;
    }
}
