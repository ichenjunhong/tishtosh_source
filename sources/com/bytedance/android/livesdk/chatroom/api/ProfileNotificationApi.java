package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5711ad;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface ProfileNotificationApi {
    @C12718t(mo23886a = "/webcast/user/relation/live_push_status/update/")
    @C12705g
    C2201v<C4177d<C5711ad>> sendNewSetting(@C12703e(mo23873a = "push_status") int i, @C12703e(mo23873a = "sec_to_user_id") String str);
}
