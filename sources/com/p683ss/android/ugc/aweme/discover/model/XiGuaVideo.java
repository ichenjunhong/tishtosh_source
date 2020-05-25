package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.XiGuaVideo */
public final class XiGuaVideo implements Serializable {
    @C17952c(mo34828a = "cover")
    private UrlModel cover;
    @C17952c(mo34828a = "create_time")
    private long createTime;
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "duration")
    private long duration;
    @C17952c(mo34828a = "play_count")
    private long playCount;
    @C17952c(mo34828a = "group_id")
    private String videoId;

    public final UrlModel getCover() {
        return this.cover;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setPlayCount(long j) {
        this.playCount = j;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
