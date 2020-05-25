package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7508g;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.C7516o;
import com.bytedance.android.livesdk.gift.relay.p381a.C7630b;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface GiftRetrofitApi {
    @C12706h(mo23876a = "/webcast/gift/free_cell_stats/")
    C2201v<C4177d<C7630b>> checkFreeCellStatus(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "anchor_id") long j2, @C12724z(mo23894a = "gift_id") long j3);

    @C12718t(mo23886a = "/webcast/gift/live_gift_guidance/")
    @C12705g
    C2201v<C4177d<Object>> getGiftGuidance(@C12703e(mo23873a = "room_id") String str);

    @C12718t(mo23886a = "/webcast/gift/game_gift/monkey/")
    @C12705g
    C2201v<C4177d> reportMonkeyGiftResult(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "anchor_id") long j2, @C12703e(mo23873a = "click_point") int i, @C12703e(mo23873a = "seed") long j3, @C12703e(mo23873a = "token") String str, @C12703e(mo23873a = "gift_id") long j4);

    @C12718t(mo23886a = "/webcast/gift/send/")
    @C12705g
    C2201v<C4177d<C7514m>> send(@C12703e(mo23873a = "gift_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12703e(mo23873a = "to_user_id") long j3, @C12703e(mo23873a = "count") int i);

    @C12718t(mo23886a = "/webcast/gift/send/")
    @C12705g
    C2201v<C4177d<C7514m>> send(@C12703e(mo23873a = "gift_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12703e(mo23873a = "to_user_id") long j3, @C12703e(mo23873a = "count") int i, @C12703e(mo23873a = "gift_source") int i2);

    @C12718t(mo23886a = "/webcast/gift/golden_beans_send/")
    @C12705g
    C2201v<C4177d<C7514m>> sendGoldenGift(@C12703e(mo23873a = "gift_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12703e(mo23873a = "to_user_id") long j3, @C12703e(mo23873a = "count") int i);

    @C12706h(mo23876a = "/webcast/gift/list/")
    C2201v<C4177d<C7508g>> syncGiftList(@C12724z(mo23894a = "room_id") String str, @C12724z(mo23894a = "fetch_giftlist_from") int i);

    @C12706h(mo23876a = "/webcast/freegift/get_watermelon_seeds/")
    C2201v<C4177d<C7516o>> syncXgCoin();
}
