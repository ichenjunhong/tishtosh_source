package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.C4178e;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.CheckAnchorMemorialResult;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.model.C8218e;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdkapi.depend.model.live.C8693aa;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C2201v;

public interface RoomRetrofitApi {
    @C12706h(mo23876a = "/webcast/anchor/memorial/check_memorial/")
    C2201v<C4177d<CheckAnchorMemorialResult>> checkAnchorMemorial(@C12724z(mo23894a = "anchor_id") long j);

    @C12706h(mo23876a = "/webcast/room/collect_unread/")
    C2201v<C4177d<Object>> collectUnreadRequest(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "anchor_id") long j2, @C12724z(mo23894a = "unread_extra") String str, @C12724z(mo23894a = "room_ids") String str2);

    @C12718t(mo23886a = "/webcast/room/create/")
    @C12705g
    C2201v<C4178e<Room>> createRoom(@C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/hotsoon/room/{roomId}/_deblock_mosaic/")
    C2201v<C4177d<Object>> deblockMosaic(@C12722x(mo23891a = "roomId") long j);

    @C12718t(mo23886a = "/webcast/room/digg/")
    @C12705g
    C2201v<C4177d<Object>> digg(@C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/enter/")
    @C12705g
    C2201v<C4175b<Room, EnterRoomExtra>> enterRoom(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "hold_living_room") long j2, @C12703e(mo23873a = "is_login") long j3, @C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/info/")
    C2201v<C4177d<Room>> fetchRoom(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/info_by_user/")
    C2201v<C4177d<Room>> fetchUserRoom(@C12724z(mo23894a = "user_id") long j, @C12724z(mo23894a = "sec_user_id") String str);

    @C12706h(mo23876a = "/webcast/room/finish_abnormal/")
    C2201v<C4177d<Object>> finishRoomAbnormal();

    @C12706h(mo23876a = "/webcast/ranklist/hour/")
    C2201v<C4175b<C8214a, Extra>> getDailyRankContent(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/hotsoon/room/follow/ids/")
    C12690b<C4176c<Long>> getLivingRoomIds();

    @C12718t(mo23886a = "/webcast/room/mget_info/")
    @C12705g
    C2201v<C4177d<Map<String, Room>>> getMultipleRoomInfo(@C12703e(mo23873a = "room_ids") String str);

    @C12706h(mo23876a = "/webcast/ranklist/noble/")
    C2201v<C4177d<C8218e>> getNobleUserRank(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/ranklist/contributor/")
    C2201v<C4175b<CurrentRankListResponse, PeriodRankExtra>> getPeriodUserRank(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/user/report/reason/")
    C2201v<C4176c<ReportReason>> getReportReasons();

    @C12706h(mo23876a = "/webcast/room/chat/guidance/")
    C2201v<C4177d<ChatGuidanceResult>> getRoomChatGuidance(@C12694aa HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/info/")
    C12690b<C4177d<Room>> getRoomStats(@C12724z(mo23894a = "is_anchor") boolean z, @C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "pack_level") int i);

    @C12706h(mo23876a = "/webcast/room/info/")
    C12690b<C4177d<Room>> getRoomStats(@C12724z(mo23894a = "is_anchor") boolean z, @C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "pack_level") int i, @C12724z(mo23894a = "need_health_score_info") boolean z2, @C12724z(mo23894a = "from_type") int i2);

    @C12706h(mo23876a = "/webcast/anchor/health_score/total/")
    C2201v<C4177d<C8693aa>> getTotalHealthInfo();

    @C12706h(mo23876a = "/webcast/ranklist/room/{room_id}/contributor/")
    C2201v<C4175b<CurrentRankListResponse, UserRankExtra>> getUserRankContent(@C12722x(mo23891a = "room_id") long j, @C12694aa HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/leave/")
    @C12705g
    C2201v<C4177d<Object>> leaveRoom(@C12703e(mo23873a = "room_id") long j);

    @C12718t(mo23886a = "/webcast/user/report/commit/")
    @C12705g
    C2201v<C4177d<ReportCommitData>> postReportReasons(@C12703e(mo23873a = "target_room_id") long j, @C12703e(mo23873a = "target_anchor_id") long j2, @C12703e(mo23873a = "reason") long j3, @C12703e(mo23873a = "report_record_extra") String str);

    @C12706h(mo23876a = "/webcast/room/background_img/delete/")
    C2201v<C4177d<Void>> removeRoomBackgroundImg(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2);

    @C12718t(mo23886a = "/webcast/screen_chat/")
    @C12705g
    C2201v<C4177d<Barrage>> sendBarrage(@C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/decoration/audit_text/")
    @C12705g
    C2201v<C4177d<DecorationTextAuditResult>> sendDecorationText(@C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/ping/audience/")
    C2201v<C4177d<PingResult>> sendPlayingPing(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "only_status") int i);

    @C12718t(mo23886a = "/webcast/room/share/")
    @C12705g
    C2201v<C4177d<ShareReportResult>> sendShare(@C12703e(mo23873a = "room_id") long j, @C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/chat/")
    @C12705g
    C2201v<C4177d<ChatResult>> sendTextMessage(@C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/decoration/set/")
    @C12705g
    C2201v<C4177d<Object>> setDecoration(@C12703e(mo23873a = "room_id") long j, @C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/room/auditing/apply/")
    C2201v<C4177d<Object>> unblockRoom(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/anchor/memorial/memorial_reported/")
    C2201v<C4177d<Void>> updateAnchorMemorial(@C12724z(mo23894a = "anchor_id") long j);

    @C12706h(mo23876a = "/hotsoon/room/{room_id}/_update_status/")
    C2201v<C4177d<Void>> updateRoomStatus(@C12722x(mo23891a = "room_id") long j, @C12694aa Map<String, String> map);
}
