package com.p683ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.m */
public final class C26132m implements Serializable {
    @C17952c(mo34828a = "commerce_sticker_id")
    public long commerceStickerId;
    @C17952c(mo34828a = "icon_url")
    public UrlModel iconUrl;
    @C17952c(mo34828a = "letters")
    public String letters;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "web_url")
    public String webUrl;
    @C17952c(mo34828a = "web_url_title")
    public String webUrlTitle;

    public final long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getLetters() {
        return this.letters;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public final boolean enable() {
        if (this.iconUrl == null || TextUtils.isEmpty(this.letters) || (TextUtils.isEmpty(this.webUrl) && TextUtils.isEmpty(this.openUrl))) {
            return false;
        }
        return true;
    }

    public final void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setLetters(String str) {
        this.letters = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public final void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
