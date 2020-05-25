package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.media.C2992f;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface EndPageRecommendRetrofitApi {
    @C12706h(mo23876a = "/webcast/room/recommend_live/")
    C2201v<C4172a<Room, C2974a>> getLive(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/room/recommend_item/")
    C2201v<C4176c<C2992f>> getVideos(@C12724z(mo23894a = "room_id") long j);
}
