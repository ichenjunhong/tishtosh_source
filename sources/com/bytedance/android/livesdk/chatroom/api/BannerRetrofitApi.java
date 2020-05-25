package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.model.C5759o;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface BannerRetrofitApi {
    @C12706h(mo23876a = "/webcast/room/live_end_page_banner/")
    C2201v<C4177d<C5759o>> queryLiveEndPageBanner();

    @C12706h(mo23876a = "/webcast/room/in_room_banner/")
    C2201v<C4177d<C5743c>> queryLiveRoomBanner(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_type") int i);
}
