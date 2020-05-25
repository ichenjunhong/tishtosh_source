package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C1680ad;

public interface BroadcastUserApi {
    @C12718t(mo23886a = "/webcast/room/upload/image/")
    C1680ad<C4177d<C3007g>> uploadAvatar(@C12700b TypedOutput typedOutput);
}
