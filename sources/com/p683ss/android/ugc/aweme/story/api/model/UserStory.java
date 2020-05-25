package com.p683ss.android.ugc.aweme.story.api.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.UserStory */
public class UserStory extends C46633b implements Serializable {
    @C17952c(mo34828a = "all_story_list")
    List<IdWithScoreStruct> allStoryList;
    @C17952c(mo34828a = "story_list")
    List<Object> awemeList;
    @C17952c(mo34828a = "cur_pos")
    long curPos;
    @C17952c(mo34828a = "friend_type")
    int friendType;
    @C17952c(mo34828a = "has_more")
    int hasMore;
    private boolean isAllStoriesLoaded;
    @C17952c(mo34828a = "label_large")
    UrlModel labelLarge;
    long lastPos;
    @C17952c(mo34828a = "log_pb")
    LogPbBean logPb;
    @C17952c(mo34828a = "max_cursor")
    long maxCursor;
    @C17952c(mo34828a = "min_cursor")
    long minCursor;
    @C17952c(mo34828a = "read_flag")
    int readFlag;
    @C17952c(mo34828a = "total_count")
    long totalCount;
    @C17952c(mo34828a = "user")
    User user;

    public List<IdWithScoreStruct> getAllStoryList() {
        return this.allStoryList;
    }

    public List<Object> getAwemeList() {
        return this.awemeList;
    }

    public long getCurPos() {
        return this.curPos;
    }

    public int getFriendType() {
        return this.friendType;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public long getLastPos() {
        return this.lastPos;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getReadFlag() {
        return this.readFlag;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public int getType() {
        return 0;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isAllStoriesLoaded() {
        return this.isAllStoriesLoaded;
    }

    public void setAllStoriesLoaded(boolean z) {
        this.isAllStoriesLoaded = z;
    }

    public void setAllStoryList(List<IdWithScoreStruct> list) {
        this.allStoryList = list;
    }

    public void setAwemeList(List<Object> list) {
        this.awemeList = list;
    }

    public void setCurPos(long j) {
        this.curPos = j;
    }

    public void setFriendType(int i) {
        this.friendType = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLastPos(long j) {
        this.lastPos = j;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setReadFlag(int i) {
        this.readFlag = i;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
