package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatistics */
public class AwemeStatistics implements Serializable, Cloneable {
    @C17952c(mo34828a = "aid")
    public String aid;
    @C17952c(mo34828a = "comment_count")
    public long commentCount;
    @C17952c(mo34828a = "digg_count")
    public long diggCount;
    @C17952c(mo34828a = "download_count")
    public long downloadCount;
    @C17952c(mo34828a = "forward_count")
    public long forwardCount;
    @C17952c(mo34828a = "lose_comment_count")
    public int loseCommentCount;
    @C17952c(mo34828a = "lose_count")
    public int loseCount;
    @C17952c(mo34828a = "play_count")
    public long playCount;
    @C17952c(mo34828a = "share_count")
    public long shareCount;

    public String getAid() {
        return this.aid;
    }

    public long getCommentCount() {
        return this.commentCount;
    }

    public long getDiggCount() {
        return this.diggCount;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getShareCount() {
        return this.shareCount;
    }

    public AwemeStatistics clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return C23722i.m58214a(this.aid, Long.valueOf(this.commentCount), Long.valueOf(this.diggCount), Long.valueOf(this.playCount), Long.valueOf(this.shareCount), Long.valueOf(this.forwardCount), Long.valueOf(this.downloadCount));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AwemeStatistics{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", commentCount=");
        sb.append(this.commentCount);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", playCount=");
        sb.append(this.playCount);
        sb.append(", shareCount=");
        sb.append(this.shareCount);
        sb.append(", forwardCount=");
        sb.append(this.forwardCount);
        sb.append(", downloadCount=");
        sb.append(this.downloadCount);
        sb.append('}');
        return sb.toString();
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCommentCount(long j) {
        this.commentCount = j;
    }

    public void setDiggCount(long j) {
        this.diggCount = j;
    }

    public void setDownloadCount(long j) {
        this.downloadCount = j;
    }

    public void setForwardCount(long j) {
        this.forwardCount = j;
    }

    public void setLoseCommentCount(int i) {
        this.loseCommentCount = i;
    }

    public void setLoseCount(int i) {
        this.loseCount = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setShareCount(long j) {
        this.shareCount = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && C23722i.m58215a(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }
}
