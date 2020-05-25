package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7489a;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface StickerGiftApi {
    @C12706h(mo23876a = "/webcast/gift/user_name/check/")
    C2201v<C4177d<C7489a>> checkUserNameLegality(@C12724z(mo23894a = "name") String str);
}
