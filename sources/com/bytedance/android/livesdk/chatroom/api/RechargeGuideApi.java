package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12722x;
import p064c.p065a.C2201v;

public interface RechargeGuideApi {
    @C12706h(mo23876a = "/live/room/{room_id}/notify_first_charge/")
    C2201v<C4177d<Object>> notifyAnchor(@C12722x(mo23891a = "room_id") long j);
}
