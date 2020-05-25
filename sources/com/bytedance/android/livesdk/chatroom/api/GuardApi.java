package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface GuardApi {
    @C12706h(mo23876a = "/hotsoon/ward/")
    C2201v<C4177d<C5754k>> getGuardInfo(@C12724z(mo23894a = "room_id") long j);
}
