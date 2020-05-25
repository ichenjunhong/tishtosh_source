package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface BanTalkApi {
    @C12706h(mo23876a = "/webcast/room/silence/")
    C2201v<C4177d<Object>> silence(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2, @C12724z(mo23894a = "sec_user_id") String str);

    @C12706h(mo23876a = "/webcast/room/unsilence/")
    C2201v<C4177d<Object>> unsilence(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2, @C12724z(mo23894a = "sec_user_id") String str);
}
