package com.bytedance.android.live.base.model.user;

import com.google.gson.p1076a.C17952c;

public class FollowInfo {
    @C17952c(mo34828a = "follow_status")
    long followStatus;
    @C17952c(mo34828a = "follower_count")
    long followerCount;
    @C17952c(mo34828a = "following_count")
    long followingCount;
    @C17952c(mo34828a = "push_status")
    long pushStatus;

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public int hashCode() {
        return (((((int) (this.followingCount ^ (this.followingCount >>> 32))) * 31) + ((int) (this.followerCount ^ (this.followerCount >>> 32)))) * 31) + ((int) (this.followStatus ^ (this.followStatus >>> 32)));
    }

    public void setFollowStatus(long j) {
        this.followStatus = j;
    }

    public void setFollowerCount(long j) {
        this.followerCount = j;
    }

    public void setFollowingCount(long j) {
        this.followingCount = j;
    }

    public void setPushStatus(long j) {
        this.pushStatus = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FollowInfo followInfo = (FollowInfo) obj;
        if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
            return true;
        }
        return false;
    }
}
