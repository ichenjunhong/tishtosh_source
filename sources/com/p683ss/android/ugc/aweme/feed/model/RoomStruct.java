package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RoomStruct */
public class RoomStruct implements Serializable {
    @C17952c(mo34828a = "height")
    public int height;
    @C17952c(mo34828a = "live_type_audio")
    public boolean liveTypeAudio;
    @C17952c(mo34828a = "room_id")
    public long roomId;
    @C17952c(mo34828a = "tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    @C17952c(mo34828a = "user_count")
    private int userCount;
    @C17952c(mo34828a = "width")
    public int width;
    @C17952c(mo34828a = "with_linkmic")
    public boolean withLinkmic;

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
