package com.bytedance.android.live.base.model.media;

import com.google.gson.p1076a.C17952c;

public class MediaItemStats {
    @C17952c(mo34828a = "comment_count")
    private int commentCount;
    @C17952c(mo34828a = "digg_count")
    private int diggCount;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private long f8747id;
    @C17952c(mo34828a = "play_count")
    private int playCount;
    @C17952c(mo34828a = "share_count")
    private int shareCount;

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.f8747id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setId(long j) {
        this.f8747id = j;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
