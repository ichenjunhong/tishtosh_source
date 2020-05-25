package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface AssetsApi {
    @C12706h(mo23876a = "/webcast/assets/{panel}/")
    C2201v<C4177d<C7202b>> getAssets(@C12722x(mo23891a = "panel") String str, @C12724z(mo23894a = "download_assets_from") int i);
}
