package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface StartLiveBannerApi {
    @C12706h(mo23876a = "/webcast/room/live_page_banner/")
    C2201v<C4177d<C5744a>> queryStartLiveBanner(@C12724z(mo23894a = "live_page_type") String str, @C12724z(mo23894a = "user_type") int i);
}
