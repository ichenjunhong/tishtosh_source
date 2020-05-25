package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.model.C3459f;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.C4178e;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdkapi.depend.model.live.C8693aa;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.HashMap;
import p064c.p065a.C2201v;

public interface BroadcastRoomApi {
    @C12718t(mo23886a = "/webcast/room/create/")
    @C12705g
    C2201v<C4178e<Room>> createRoom(@C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/webcast/room/get_latest_room/")
    C2201v<C4177d<Room>> getLatestRoom();

    @C12706h(mo23876a = "/webcast/room/game_list/")
    C2201v<C4176c<Game>> getLiveGameList(@C12724z(mo23894a = "game_icon") int i);

    @C12706h(mo23876a = "/webcast/room/create_info/")
    C2201v<C4177d<C3458e>> getPreviewRoomCreateInfo();

    @C12706h(mo23876a = "/webcast/room/auditing/info/")
    C2201v<C4177d<WaitingReviewInfo>> getReviewInfo(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/room/tag_list/")
    C2201v<C4176c<C5728aq>> getRoomTags();

    @C12706h(mo23876a = "/webcast/anchor/health_score/total/")
    C2201v<C4177d<C8693aa>> getTotalHealthInfo();

    @C12706h(mo23876a = "/webcast/anchor/cover/neednotice/")
    C2201v<C4177d<Object>> shouldShowCoverNotice();

    @C12718t(mo23886a = "/webcast/room/video/capture/")
    C2201v<C4177d<Object>> updateCaptureVideo(@C12700b TypedOutput typedOutput);

    @C12718t(mo23886a = "/webcast/room/update_room_info/")
    @C12705g
    C2201v<C4177d<C3459f>> updateRoomInfo(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "cover_uri") String str);

    @C12718t(mo23886a = "/webcast/room/internal_ci_info/")
    @C12705g
    C2201v<C4177d<Void>> uploadBeautyParams(@C12703e(mo23873a = "room_id") long j, @C12703e(mo23873a = "filter_name") String str, @C12703e(mo23873a = "whitening") int i, @C12703e(mo23873a = "beauty_skin") int i2, @C12703e(mo23873a = "big_eyes") int i3, @C12703e(mo23873a = "face_lift") int i4, @C12703e(mo23873a = "use_filter") boolean z);
}
