package com.bytedance.android.livesdk.kickout.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.kickout.p390b.C7723a;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface BannedApiV2 {
    @C12706h(mo23876a = "/webcast/room/silence/list/")
    C2201v<C7723a> getBannedTalkList(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "offset") int i2, @C12724z(mo23894a = "sec_user_id") String str);

    @C12706h(mo23876a = "/webcast/room/kick/list/")
    C2201v<C7723a> getKickedOutList(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "offset") int i2, @C12724z(mo23894a = "sec_user_id") String str);

    @C12706h(mo23876a = "/webcast/room/kick/user/")
    C2201v<C4177d<Void>> kickOut(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "kick_uid") long j2);

    @C12706h(mo23876a = "/webcast/room/unkick/user/")
    C2201v<C4177d<Void>> unKickOut(@C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "kick_uid") long j2);
}
