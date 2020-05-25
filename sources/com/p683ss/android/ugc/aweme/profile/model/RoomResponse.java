package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RoomResponse */
public final class RoomResponse extends BaseResponse {
    @C17952c(mo34828a = "data")
    public final LiveRoomStruct data;

    public RoomResponse() {
        this(null, 1, null);
    }

    public RoomResponse(LiveRoomStruct liveRoomStruct) {
        this.data = liveRoomStruct;
    }

    public /* synthetic */ RoomResponse(LiveRoomStruct liveRoomStruct, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            liveRoomStruct = null;
        }
        this(liveRoomStruct);
    }
}
