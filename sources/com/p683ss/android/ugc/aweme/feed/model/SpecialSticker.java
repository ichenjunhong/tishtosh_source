package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.SpecialSticker */
public class SpecialSticker implements Serializable {
    @C17952c(mo34828a = "icon_url")
    public UrlModel iconUrl;
    @C17952c(mo34828a = "link")
    public String linkUrl;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "sticker_id")
    public String stickerId;
    @C17952c(mo34828a = "sticker_type")
    public int stickerType;
    @C17952c(mo34828a = "title")
    public String title;

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
