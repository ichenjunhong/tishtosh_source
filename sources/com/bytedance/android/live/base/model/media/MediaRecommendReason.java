package com.bytedance.android.live.base.model.media;

import com.google.gson.p1076a.C17952c;

public class MediaRecommendReason {
    public static final int TYPE_FRIENDSHIP = 2;
    public static final int TYPE_LOCATION = 1;
    @C17952c(mo34828a = "city")
    private String city;
    @C17952c(mo34828a = "friend_name")
    private String friendName;
    @C17952c(mo34828a = "reason")
    private String reason;
    @C17952c(mo34828a = "type")
    private int type;

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
