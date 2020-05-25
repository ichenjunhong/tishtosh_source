package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.live.model.C7759c;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface RoomStatApi {
    @C12718t(mo23886a = "/webcast/room/check_alive/")
    @C12705g
    C2201v<C4176c<C7759c>> checkRoom(@C12703e(mo23873a = "room_ids") String str);
}
