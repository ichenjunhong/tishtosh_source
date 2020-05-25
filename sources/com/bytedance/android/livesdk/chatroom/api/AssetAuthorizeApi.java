package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface AssetAuthorizeApi {
    @C12718t(mo23886a = "/hotsoon/misc/authorize_assets")
    C2201v<C4177d<Object>> agreeAuthorize(@C12724z(mo23894a = "authorize") int i);

    @C12706h(mo23876a = "/hotsoon/misc/assets_authorize_tips")
    C2201v<C4177d<Object>> isShowAuthorizeTips();
}
