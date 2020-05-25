package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5764s;
import com.bytedance.android.livesdk.chatroom.model.C5765t;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface LotteryApi {
    @C12706h(mo23876a = "/webcast/lottery/melon/check_user_right/")
    C2201v<C4177d<C5764s>> checkUserRight(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "lottery_id") long j2);

    @C12706h(mo23876a = "/webcast/lottery/melon/check_user_right/")
    C2201v<C4177d<C5764s>> checkUserRightWithRoomId(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/lottery/melon/lottery_config/")
    C2201v<C4177d<C5765t>> getConfig(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "anchor_id") long j2);
}
