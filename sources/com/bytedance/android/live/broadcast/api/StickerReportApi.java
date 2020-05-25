package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface StickerReportApi {
    @C12718t(mo23886a = "/webcast/gift/set_room_supported/")
    @C12705g
    C2201v<C4177d<Object>> reportFaceGift(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "gift_ids") String str);
}
