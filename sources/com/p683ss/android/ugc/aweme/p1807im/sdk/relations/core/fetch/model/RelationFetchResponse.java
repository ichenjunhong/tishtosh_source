package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.RelationFetchResponse */
public class RelationFetchResponse extends BaseResponse {
    @C17952c(mo34828a = "followings")
    List<IMUser> followings;
    @C17952c(mo34828a = "has_more")
    int hasMore;
    @C17952c(mo34828a = "hotsoon_hide_text")
    String hotSoonNotice;
    @C17952c(mo34828a = "hotsoon_hide_en_text")
    String hotSoonNoticeEn;
    @C17952c(mo34828a = "max_time")
    long maxTime;
    @C17952c(mo34828a = "min_time")
    long minTime;
    @C17952c(mo34828a = "next_req_count")
    int nextReqCount;

    public List<IMUser> getFollowings() {
        return this.followings;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public String getHotSoonNotice() {
        return this.hotSoonNotice;
    }

    public String getHotSoonNoticeEn() {
        return this.hotSoonNoticeEn;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getNextReqCount() {
        return this.nextReqCount;
    }

    public void setFollowings(List<IMUser> list) {
        this.followings = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setHotSoonNotice(String str) {
        this.hotSoonNotice = str;
    }

    public void setHotSoonNoticeEn(String str) {
        this.hotSoonNoticeEn = str;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setNextReqCount(int i) {
        this.nextReqCount = i;
    }
}
