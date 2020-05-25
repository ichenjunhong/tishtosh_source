package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.C8705k;
import com.bytedance.android.livesdkapi.depend.model.live.C8720t;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import java.util.Map;
import p064c.p065a.C2201v;

public interface StickerDonationRetrofitApi {
    @C12718t(mo23886a = "/webcast/room/token_create/")
    @C12705g
    C2201v<C4177d<C8705k>> createDonateToken(@C12704f Map<String, Object> map);

    @C12706h
    C2201v<C8720t> fetchStickerDonation(@C12699af String str, @C12694aa Map<String, String> map);
}
