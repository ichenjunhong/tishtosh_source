package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent */
public class VideoUpdateTipsContent extends BaseContent {
    @C17952c(mo34828a = "tip_aid")
    String aid;
    @C17952c(mo34828a = "tip_content")
    String content;
    @C17952c(mo34828a = "tip_cover")
    UrlModel cover;
    @C17952c(mo34828a = "is_photo")
    boolean isPhoto;
    @C17952c(mo34828a = "tip_title")
    String title;
    @C17952c(mo34828a = "tip_uid")
    String uid;

    public String getAid() {
        return this.aid;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
