package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryContent */
public final class StoryContent implements Serializable {
    @C17952c(mo34828a = "cover")
    private UrlModel storyCover;
    @C17952c(mo34828a = "item_id")
    private String storyId;
    @C17952c(mo34828a = "sync_aweme")
    private int syncAweme;
    @C17952c(mo34828a = "video_height")
    private int videoHeight;
    @C17952c(mo34828a = "video_width")
    private int videoWidth;

    public final UrlModel getStoryCover() {
        return this.storyCover;
    }

    public final String getStoryId() {
        return this.storyId;
    }

    public final int getSyncAweme() {
        return this.syncAweme;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setStoryCover(UrlModel urlModel) {
        this.storyCover = urlModel;
    }

    public final void setStoryId(String str) {
        this.storyId = str;
    }

    public final void setSyncAweme(int i) {
        this.syncAweme = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
