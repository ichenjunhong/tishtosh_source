package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface FollowApi {
    @C12718t(mo23886a = "/webcast/user/relation/update/")
    @C12705g
    C2201v<C4177d<C8328c>> follow(@C12703e(mo23873a = "follow_type") int i, @C12703e(mo23873a = "to_user_id") long j, @C12703e(mo23873a = "current_room_id") long j2, @C12703e(mo23873a = "sec_user_id") String str, @C12703e(mo23873a = "sec_to_user_id") String str2);

    @C12718t(mo23886a = "/webcast/user/relation/update/")
    @C12705g
    C2201v<C4177d<C8328c>> unfollow(@C12703e(mo23873a = "follow_type") int i, @C12703e(mo23873a = "sec_user_id") String str, @C12703e(mo23873a = "to_user_id") long j, @C12703e(mo23873a = "sec_to_user_id") String str2, @C12703e(mo23873a = "current_room_id") long j2);
}
