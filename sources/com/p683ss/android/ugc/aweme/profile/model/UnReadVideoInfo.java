package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo */
public final class UnReadVideoInfo implements Serializable {
    @C17952c(mo34828a = "latest_unread_video_created_time")
    public long latestUnreadVideoCreatedTime;
    @C17952c(mo34828a = "unread_count")
    public int unReadCount;

    public UnReadVideoInfo() {
    }

    public static /* synthetic */ UnReadVideoInfo copy$default(UnReadVideoInfo unReadVideoInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unReadVideoInfo.unReadCount;
        }
        if ((i2 & 2) != 0) {
            j = unReadVideoInfo.latestUnreadVideoCreatedTime;
        }
        return unReadVideoInfo.copy(i, j);
    }

    public final int component1() {
        return this.unReadCount;
    }

    public final long component2() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final UnReadVideoInfo copy(int i, long j) {
        return new UnReadVideoInfo(i, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnReadVideoInfo) {
                UnReadVideoInfo unReadVideoInfo = (UnReadVideoInfo) obj;
                if (this.unReadCount == unReadVideoInfo.unReadCount) {
                    if (this.latestUnreadVideoCreatedTime == unReadVideoInfo.latestUnreadVideoCreatedTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getLatestUnreadVideoCreatedTime() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final int hashCode() {
        int i = this.unReadCount * 31;
        long j = this.latestUnreadVideoCreatedTime;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnReadVideoInfo(unReadCount=");
        sb.append(this.unReadCount);
        sb.append(", latestUnreadVideoCreatedTime=");
        sb.append(this.latestUnreadVideoCreatedTime);
        sb.append(")");
        return sb.toString();
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public UnReadVideoInfo(int i, long j) {
        this.unReadCount = i;
        this.latestUnreadVideoCreatedTime = j;
    }
}
