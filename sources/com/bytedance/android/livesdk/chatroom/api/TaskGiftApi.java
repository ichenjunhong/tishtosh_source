package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7515n;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C18085o;
import p064c.p065a.C2201v;

public interface TaskGiftApi {
    @C12706h(mo23876a = "/hotsoon/wallet/info/")
    C2201v<C4177d<Object>> getHotsoonTaskGift();

    @C12706h(mo23876a = "/hotsoon/taskgift/?type=7")
    C2201v<C18085o> getHotsoonTaskGiftEvent();

    @C12718t(mo23886a = "/hotsoon/taskgift/{gift_id}/send/")
    @C12705g
    C2201v<C4177d<C7515n>> sendHotsoonTaskGift(@C12722x(mo23891a = "gift_id") long j, @C12703e(mo23873a = "count") long j2, @C12724z(mo23894a = "room_id") long j3);

    @C12718t(mo23886a = "/webcast/gift/send_task_gift/")
    @C12705g
    C2201v<C4177d<C7515n>> sendTaskGift(@C12703e(mo23873a = "task_gift_id") long j, @C12703e(mo23873a = "count") long j2, @C12724z(mo23894a = "room_id") long j3);
}
