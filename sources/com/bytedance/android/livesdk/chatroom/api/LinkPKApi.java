package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.data.C5353a;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.List;
import p064c.p065a.C2201v;

public interface LinkPKApi {
    @C12706h(mo23876a = "/webcast/linkmic/battle/auto_match/")
    C2201v<C4177d<LinkAutoMatchModel>> autoMatch(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "is_first") int i, @C12724z(mo23894a = "match_type") int i2, @C12724z(mo23894a = "sub_type") int i3);

    @C12706h(mo23876a = "/webcast/linkmic/battle/invite/")
    C2201v<C4177d<Void>> battleInvite(@C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/battle/reject/")
    C2201v<C4177d<Void>> battleReject(@C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/battle/stats/")
    C2201v<C4177d<C8722v>> battleStats(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "anchor_id") long j2);

    @C12706h(mo23876a = "/webcast/linkmic/battle/cancel_match/")
    C2201v<C4177d<Void>> cancleMatch();

    @C12706h(mo23876a = "/webcast/linkmic/battle/cut_short_count/")
    C2201v<C4177d<Object>> cutShortCount();

    @C12706h(mo23876a = "/webcast/linkmic/battle/finish/")
    C2201v<C4177d<Void>> finish(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "battle_source") int i, @C12724z(mo23894a = "is_cut_short") int i2, @C12724z(mo23894a = "sub_type") long j2);

    @C12706h(mo23876a = "/hotsoon/linkmic/v3/battle/mode_finish/")
    C2201v<C4177d<C5353a>> finishMode(@C12724z(mo23894a = "mode") int i, @C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/hotsoon/linkmic/v3/battle/mode_get/")
    C2201v<C4177d<List<Object>>> getMode(@C12724z(mo23894a = "mode") int i);

    @C12706h(mo23876a = "/webcast/linkmic/battle/open/")
    C2201v<C4177d<Void>> openBattle(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "duration") int i, @C12724z(mo23894a = "match_type") int i2, @C12724z(mo23894a = "theme") String str);

    @C12706h(mo23876a = "/hotsoon/linkmic/v3/battle/mode_set/")
    C2201v<C4177d<Void>> setMode(@C12724z(mo23894a = "mode") int i, @C12724z(mo23894a = "open") int i2);

    @C12706h(mo23876a = "/hotsoon/linkmic/v3/battle/mode_start/")
    C2201v<C4177d<Void>> startMode(@C12724z(mo23894a = "mode") int i, @C12724z(mo23894a = "channel_id") long j);
}
