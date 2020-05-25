package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup */
public final class AwemeStatisticsBackup implements Serializable {
    @C17952c(mo34828a = "aweme_id")
    private String aid = "";
    @C17952c(mo34828a = "comment_count")
    private Long commentCount = Long.valueOf(0);
    @C17952c(mo34828a = "digg_count")
    private Long diggCount = Long.valueOf(0);
    @C17952c(mo34828a = "download_count")
    private Long downloadCount = Long.valueOf(0);
    @C17952c(mo34828a = "forward_count")
    private Long forwardCount = Long.valueOf(0);
    @C17952c(mo34828a = "play_count")
    private Long playCount = Long.valueOf(0);
    @C17952c(mo34828a = "share_count")
    private Long shareCount = Long.valueOf(0);

    public final String getAid() {
        return this.aid;
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final Long getDiggCount() {
        return this.diggCount;
    }

    public final Long getDownloadCount() {
        return this.downloadCount;
    }

    public final Long getForwardCount() {
        return this.forwardCount;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Long getShareCount() {
        return this.shareCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeStatistics{aid='");
        sb.append(this.aid);
        sb.append("', comemntCount=");
        sb.append(this.commentCount);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", playCount=");
        sb.append(this.playCount);
        sb.append(", shareCount=");
        sb.append(this.shareCount);
        sb.append(", forwardCount=");
        sb.append(this.forwardCount);
        sb.append("}");
        return sb.toString();
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setDiggCount(Long l) {
        this.diggCount = l;
    }

    public final void setDownloadCount$common_feed_tiktokI18nRelease(Long l) {
        this.downloadCount = l;
    }

    public final void setForwardCount(Long l) {
        this.forwardCount = l;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShareCount(Long l) {
        this.shareCount = l;
    }
}
