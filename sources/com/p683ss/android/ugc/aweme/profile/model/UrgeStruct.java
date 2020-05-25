package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UrgeStruct */
public class UrgeStruct implements Serializable {
    @C17952c(mo34828a = "block_urge_setting")
    private int blockUrgeSetting;
    @C17952c(mo34828a = "latest_aweme_time")
    private long latestAwemeTime;
    @C17952c(mo34828a = "latest_room_time")
    private long latestRoomTime;
    @C17952c(mo34828a = "urge_unread_count")
    private long urgeUnreadCount;
    @C17952c(mo34828a = "user_urged")
    private int userUrged;

    public int getBlockUrgeSetting() {
        return this.blockUrgeSetting;
    }

    public long getLatestAwemeTime() {
        return this.latestAwemeTime;
    }

    public long getLatestRoomTime() {
        return this.latestRoomTime;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public int getUserUrged() {
        return this.userUrged;
    }

    public boolean shouldHostShowTip() {
        if (this.blockUrgeSetting != 0 || this.urgeUnreadCount <= 0) {
            return false;
        }
        return true;
    }

    public void setBlockUrgeSetting(int i) {
        this.blockUrgeSetting = i;
    }

    public void setLatestAwemeTime(long j) {
        this.latestAwemeTime = j;
    }

    public void setLatestRoomTime(long j) {
        this.latestRoomTime = j;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }

    public void setUserUrged(int i) {
        this.userUrged = i;
    }
}
