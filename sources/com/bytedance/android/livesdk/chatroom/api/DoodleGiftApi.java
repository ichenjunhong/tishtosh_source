package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface DoodleGiftApi {
    @C12718t(mo23886a = "/webcast/gift/send/")
    @C12705g
    C2201v<C4177d<C7514m>> sendDoodleGift(@C12703e(mo23873a = "gift_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12703e(mo23873a = "compose") String str, @C12703e(mo23873a = "to_user_id") long j3);
}
