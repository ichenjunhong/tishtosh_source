package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5381b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5384d;
import com.bytedance.android.livesdk.chatroom.model.C5689a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5690a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5692b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5698g;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5699h;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5700i;
import com.bytedance.android.livesdk.chatroom.model.p323a.p324a.C5691a;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.Map;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;

public interface LinkApi {
    @C12718t(mo23886a = "/webcast/linkmic_audience/apply/")
    @C12705g
    C1680ad<C4177d<C5689a>> apply(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "anchor_id") long j2, @C12704f Map<String, String> map);

    @C12706h(mo23876a = "/webcast/linkmic/cancel/")
    C2201v<C4177d<Void>> cancel(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12724z(mo23894a = "to_room_id") long j3, @C12724z(mo23894a = "to_user_id") long j4);

    @C12706h(mo23876a = "/webcast/linkmic_audience/check_permission/")
    C1680ad<C4175b<Void, C5690a>> checkPermissionV1(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "anchor_id") long j2, @C12724z(mo23894a = "linkmic_layout") int i);

    @C12706h(mo23876a = "/webcast/linkmic/check_permission/")
    C2201v<C4177d<C5379a>> checkPermissionV3(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/check_permission/")
    C2201v<C4177d<C5379a>> checkPermissionV3(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "type") int i);

    @C12706h(mo23876a = "/webcast/linkmic_audience/contributors/")
    C1680ad<C4177d<C5700i>> contributorRank(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2, @C12724z(mo23894a = "sec_user_id") String str, @C12724z(mo23894a = "offset") int i);

    @C12706h(mo23876a = "/webcast/linkmic_audience/finish/")
    C1680ad<C4177d<Void>> finishV1(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/finish/")
    C2201v<C4177d<Void>> finishV3(@C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic_audience/list/")
    C1680ad<C4177d<C5699h>> getList(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "link_status") int i);

    @C12706h(mo23876a = "/webcast/linkmic_audience/init/")
    C1680ad<C4177d<C5692b>> init(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "linkmic_vendor") int i, @C12724z(mo23894a = "linkmic_layout") int i2);

    @C12706h(mo23876a = "/webcast/linkmic/invite/")
    C2201v<C4177d<C5381b>> invite(@C12724z(mo23894a = "vendor") int i, @C12724z(mo23894a = "to_room_id") long j, @C12724z(mo23894a = "to_user_id") long j2, @C12724z(mo23894a = "room_id") long j3, @C12724z(mo23894a = "invite_type") int i2, @C12724z(mo23894a = "match_type") int i3);

    @C12706h(mo23876a = "/webcast/linkmic/invite/")
    C2201v<C4177d<C5381b>> inviteWithBattleOn(@C12724z(mo23894a = "layout") int i, @C12724z(mo23894a = "vendor") int i2, @C12724z(mo23894a = "to_room_id") long j, @C12724z(mo23894a = "to_user_id") long j2, @C12724z(mo23894a = "room_id") long j3, @C12724z(mo23894a = "theme") String str, @C12724z(mo23894a = "duration") int i3, @C12724z(mo23894a = "match_type") int i4);

    @C12706h(mo23876a = "/webcast/linkmic/invite/")
    C2201v<C4177d<C5381b>> inviteWithBattleOn(@C12724z(mo23894a = "layout") int i, @C12724z(mo23894a = "vendor") int i2, @C12724z(mo23894a = "to_room_id") long j, @C12724z(mo23894a = "to_user_id") long j2, @C12724z(mo23894a = "room_id") long j3, @C12724z(mo23894a = "theme") String str, @C12724z(mo23894a = "duration") int i3, @C12724z(mo23894a = "match_type") int i4, @C12724z(mo23894a = "invite_type") int i5, @C12724z(mo23894a = "sub_type") int i6);

    @C12706h(mo23876a = "/webcast/linkmic_audience/join_channel/")
    C1680ad<C4177d<Void>> joinChannelV1(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/join_channel/")
    C2201v<C4177d<Void>> joinChannelV3(@C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic_audience/kick_out/")
    C1680ad<C4177d<Void>> kickOut(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "to_user_id") long j2, @C12724z(mo23894a = "sec_to_user_id") String str);

    @C12706h(mo23876a = "/webcast/linkmic_audience/leave/")
    C1680ad<C4177d<Void>> leave(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic/notify_join/")
    C2201v<C4177d<Void>> notifyJoin(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "to_user_id") long j2);

    @C12706h(mo23876a = "/webcast/linkmic_audience/permit/")
    C1680ad<C4177d<C5691a>> permit(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "to_user_id") long j2, @C12724z(mo23894a = "sec_to_user_id") String str);

    @C12706h(mo23876a = "/webcast/linkmic/reply/")
    C2201v<C4177d<C5698g>> reply(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12724z(mo23894a = "reply_status") int i, @C12724z(mo23894a = "invite_user_id") long j3);

    @C12718t(mo23886a = "/webcast/linkmic/monitor/vendor/")
    @C12705g
    C2201v<C4177d<Void>> reportStartLinkStatus(@C12703e(mo23873a = "vendor") String str, @C12703e(mo23873a = "status") int i, @C12703e(mo23873a = "err_code") int i2);

    @C12706h(mo23876a = "/webcast/linkmic/rivals/")
    C2201v<C4177d<C5384d>> rivalsList(@C12724z(mo23894a = "rivals_type") int i);

    @C12718t(mo23886a = "/webcast/linkmic_audience/send_signaling/")
    @C12705g
    C1680ad<C4177d<Void>> sendSignalV1(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "content") String str, @C12703e(mo23873a = "to_user_ids") long[] jArr);

    @C12706h(mo23876a = "/webcast/linkmic/send_signal/")
    C2201v<C4177d<Void>> sendSignalV3(@C12724z(mo23894a = "channel_id") long j, @C12724z(mo23894a = "content") String str, @C12724z(mo23894a = "to_user_ids") long[] jArr);

    @C12706h(mo23876a = "/webcast/linkmic/settings/")
    C2201v<C4177d<Void>> settings(@C12724z(mo23894a = "link_mic_stats") int i);

    @C12706h(mo23876a = "/webcast/linkmic_audience/silence/")
    C1680ad<C4177d<Void>> silence(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "to_user_id") long j2);

    @C12706h(mo23876a = "/webcast/linkmic_audience/turn_on/")
    C1680ad<C4177d<Void>> turnOnV1(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "linkmic_layout") int i);

    @C12706h(mo23876a = "/webcast/linkmic/turn_on/")
    C2201v<C4177d<Object>> turnOnV3(@C12724z(mo23894a = "channel_id") long j);

    @C12706h(mo23876a = "/webcast/linkmic_audience/unsilence/")
    C1680ad<C4177d<Void>> unSilence(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "to_user_id") long j2);
}
