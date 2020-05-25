package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3453b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import p064c.p065a.C2201v;

public interface BanUserInfoApi {
    @C12706h(mo23876a = "/webcast/user/ban_detail/")
    C2201v<C4177d<C3453b>> getBanUserInfo();
}
