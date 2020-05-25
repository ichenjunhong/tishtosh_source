package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fk */
public final class C43838fk implements Serializable {
    @C17952c(mo34828a = "type")

    /* renamed from: a */
    int f111000a = -1;
    @C17952c(mo34828a = "id")

    /* renamed from: b */
    String f111001b;
    @C17952c(mo34828a = "content")

    /* renamed from: c */
    String f111002c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    UrlModel f111003d;
    @C17952c(mo34828a = "title")

    /* renamed from: e */
    String f111004e;
    @C17952c(mo34828a = "open_url")

    /* renamed from: f */
    String f111005f;
    @C17952c(mo34828a = "mp_url")

    /* renamed from: g */
    String f111006g;
    @C17952c(mo34828a = "web_url")

    /* renamed from: h */
    String f111007h;

    public final String getContent() {
        return this.f111002c;
    }

    public final UrlModel getIcon() {
        return this.f111003d;
    }

    public final String getId() {
        return this.f111001b;
    }

    public final String getMpUrl() {
        return this.f111006g;
    }

    public final String getOpenUrl() {
        return this.f111005f;
    }

    public final String getTitle() {
        return this.f111004e;
    }

    public final int getType() {
        return this.f111000a;
    }

    public final String getWebUrl() {
        return this.f111007h;
    }

    public final void setContent(String str) {
        this.f111002c = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.f111003d = urlModel;
    }

    public final void setId(String str) {
        this.f111001b = str;
    }

    public final void setMpUrl(String str) {
        this.f111006g = str;
    }

    public final void setOpenUrl(String str) {
        this.f111005f = str;
    }

    public final void setTitle(String str) {
        this.f111004e = str;
    }

    public final void setType(int i) {
        this.f111000a = i;
    }

    public final void setWebUrl(String str) {
        this.f111007h = str;
    }
}
