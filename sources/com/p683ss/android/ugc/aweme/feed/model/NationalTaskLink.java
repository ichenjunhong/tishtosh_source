package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NationalTaskLink */
public final class NationalTaskLink implements Serializable {
    @C17952c(mo34828a = "avatar_icon")
    public UrlModel avatarIcon;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79729id;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "sub_title")
    public String subTitle;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "web_url")
    public String webUrl;

    public final UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getId() {
        return this.f79729id;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public final void setId(String str) {
        this.f79729id = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
