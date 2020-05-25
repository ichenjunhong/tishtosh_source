package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatus */
public class AwemeStatus implements Serializable, Cloneable {
    @C17952c(mo34828a = "aid")
    public String aid;
    @C17952c(mo34828a = "allow_comment")
    public boolean allowComment;
    @C17952c(mo34828a = "allow_share")
    public boolean allowShare;
    @C17952c(mo34828a = "download_status")
    public int downloadStatus;
    @C17952c(mo34828a = "in_reviewing")
    public boolean inReviewing;
    @C17952c(mo34828a = "is_delete")
    public boolean isDelete;
    @C17952c(mo34828a = "is_prohibited")
    public boolean isProhibited;
    @C17952c(mo34828a = "private_status")
    public int privateStatus;
    @C17952c(mo34828a = "review_result")
    public ReviewResult reviewResult;
    @C17952c(mo34828a = "reviewed")
    public int reviewed;
    @C17952c(mo34828a = "self_see")
    public boolean selfSee;
    @C17952c(mo34828a = "show_good_delay_time")
    public int showGoodDelayTime = 2000;
    @C17952c(mo34828a = "with_fusion_goods")
    public boolean withFusionGoods;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatus$DownloadStatus */
    public @interface DownloadStatus {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatus$ReviewResult */
    class ReviewResult implements Serializable {
        @C17952c(mo34828a = "detail_url")
        String detailUrl;
        @C17952c(mo34828a = "review_status")
        int reviewStatus;
        @C17952c(mo34828a = "should_tell")
        boolean shouldTell;

        public String getDetailUrl() {
            return this.detailUrl;
        }

        public int getReviewStatus() {
            return this.reviewStatus;
        }

        public boolean getShouldTell() {
            return this.shouldTell;
        }

        public int hashCode() {
            return C23722i.m58214a(AwemeStatus.this.reviewResult, Boolean.valueOf(this.shouldTell), this.detailUrl);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("review_result{review_status=");
            sb.append(this.reviewStatus);
            sb.append("should_tell=");
            sb.append(this.shouldTell);
            sb.append("detail_url=");
            sb.append(this.detailUrl);
            sb.append("}");
            return sb.toString();
        }

        public void setDetailUrl(String str) {
            this.detailUrl = str;
        }

        public void setReviewStatus(int i) {
            this.reviewStatus = i;
        }

        public void setShouldTell(boolean z) {
            this.shouldTell = z;
        }

        ReviewResult() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewResult)) {
                return false;
            }
            ReviewResult reviewResult = (ReviewResult) obj;
            if (this.reviewStatus == reviewResult.reviewStatus && this.shouldTell == reviewResult.shouldTell && C23722i.m58215a(this.detailUrl, reviewResult.detailUrl)) {
                return true;
            }
            return false;
        }
    }

    public String getAid() {
        return this.aid;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public int getPrivateStatus() {
        return this.privateStatus;
    }

    public ReviewResult getReviewResult() {
        return this.reviewResult;
    }

    public int getShowGoodDelayTime() {
        return this.showGoodDelayTime;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isInReviewing() {
        return this.inReviewing;
    }

    public boolean isProhibited() {
        return this.isProhibited;
    }

    public boolean isSelfSee() {
        return this.selfSee;
    }

    public boolean isWithGoods() {
        return this.withFusionGoods;
    }

    public boolean isPrivate() {
        if (this.privateStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isReviewed() {
        if (this.reviewed == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        if (this.reviewResult == null || this.reviewResult.reviewStatus == 0) {
            return false;
        }
        return true;
    }

    public String getReviewDetailUrl() {
        if (this.reviewResult == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.reviewResult.detailUrl)) {
            return "";
        }
        return this.reviewResult.detailUrl;
    }

    public boolean isProhibitedAndShouldTell() {
        if (this.reviewResult == null || this.reviewResult.reviewStatus != 1 || !this.reviewResult.shouldTell) {
            return false;
        }
        return true;
    }

    public boolean isSelfSeeAndShouldTell() {
        if (this.reviewResult == null || this.reviewResult.reviewStatus != 2 || !this.reviewResult.shouldTell) {
            return false;
        }
        return true;
    }

    public AwemeStatus clone() {
        AwemeStatus awemeStatus = new AwemeStatus();
        awemeStatus.aid = this.aid;
        awemeStatus.isDelete = this.isDelete;
        awemeStatus.allowShare = this.allowShare;
        awemeStatus.allowComment = this.allowComment;
        awemeStatus.privateStatus = this.privateStatus;
        awemeStatus.withFusionGoods = this.withFusionGoods;
        awemeStatus.showGoodDelayTime = this.showGoodDelayTime;
        awemeStatus.inReviewing = this.inReviewing;
        awemeStatus.reviewed = this.reviewed;
        awemeStatus.selfSee = this.selfSee;
        awemeStatus.isProhibited = this.isProhibited;
        awemeStatus.downloadStatus = this.downloadStatus;
        awemeStatus.reviewResult = this.reviewResult;
        return awemeStatus;
    }

    public int hashCode() {
        return C23722i.m58214a(this.aid, Boolean.valueOf(this.isDelete), Boolean.valueOf(this.allowShare), Boolean.valueOf(this.allowComment), Integer.valueOf(this.privateStatus), Boolean.valueOf(this.withFusionGoods), Integer.valueOf(this.showGoodDelayTime), Boolean.valueOf(this.inReviewing), Integer.valueOf(this.reviewed), Boolean.valueOf(this.selfSee), Boolean.valueOf(this.isProhibited), Integer.valueOf(this.downloadStatus), this.reviewResult);
    }

    public String toString() {
        String str = "";
        if (this.reviewResult != null) {
            str = this.reviewResult.toString();
        }
        StringBuilder sb = new StringBuilder("AwemeStatus{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", isDelete=");
        sb.append(this.isDelete);
        sb.append(", allowShare=");
        sb.append(this.allowShare);
        sb.append(", allowComment=");
        sb.append(this.allowComment);
        sb.append(", privateStatus=");
        sb.append(this.privateStatus);
        sb.append(", withFusionGoods=");
        sb.append(this.withFusionGoods);
        sb.append(", showGoodDelayTime=");
        sb.append(this.showGoodDelayTime);
        sb.append(", inReviewing=");
        sb.append(this.inReviewing);
        sb.append(", reviewed=");
        sb.append(this.reviewed);
        sb.append(", selfSee=");
        sb.append(this.selfSee);
        sb.append(", isProhibited=");
        sb.append(this.isProhibited);
        sb.append(", downloadStatus=");
        sb.append(this.downloadStatus);
        sb.append(", reviewStatus=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setInReviewing(boolean z) {
        this.inReviewing = z;
    }

    public void setPrivateStatus(int i) {
        this.privateStatus = i;
    }

    public void setProhibited(boolean z) {
        this.isProhibited = z;
    }

    public void setReviewResult(ReviewResult reviewResult2) {
        this.reviewResult = reviewResult2;
    }

    public void setSelfSee(boolean z) {
        this.selfSee = z;
    }

    public void setWithGoods(boolean z) {
        this.withFusionGoods = z;
    }

    public void setPrivate(boolean z) {
        if (z) {
            this.privateStatus = 1;
        } else {
            this.privateStatus = 0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatus)) {
            return false;
        }
        AwemeStatus awemeStatus = (AwemeStatus) obj;
        if (this.isDelete == awemeStatus.isDelete && this.allowShare == awemeStatus.allowShare && this.allowComment == awemeStatus.allowComment && this.privateStatus == awemeStatus.privateStatus && this.withFusionGoods == awemeStatus.withFusionGoods && this.showGoodDelayTime == awemeStatus.showGoodDelayTime && this.inReviewing == awemeStatus.inReviewing && this.reviewed == awemeStatus.reviewed && this.selfSee == awemeStatus.selfSee && this.isProhibited == awemeStatus.isProhibited && this.downloadStatus == awemeStatus.downloadStatus && C23722i.m58215a(this.aid, awemeStatus.aid) && C23722i.m58215a(this.reviewResult, awemeStatus.reviewResult)) {
            return true;
        }
        return false;
    }
}
