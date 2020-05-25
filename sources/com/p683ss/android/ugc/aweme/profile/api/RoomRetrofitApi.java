package com.p683ss.android.ugc.aweme.profile.api;

import com.p683ss.android.ugc.aweme.profile.model.RoomResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.RoomRetrofitApi */
public interface RoomRetrofitApi {
    @C53075f(mo110603a = "/webcast/room/info/")
    C2201v<RoomResponse> roomInfo(@C53089t(mo110619a = "room_id") long j, @C53089t(mo110619a = "pack_level") int i);
}
