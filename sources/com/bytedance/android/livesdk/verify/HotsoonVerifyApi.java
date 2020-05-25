package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface HotsoonVerifyApi {
    @C12718t(mo23886a = "https://hotsoon.snssdk.com/hotsoon/user/realname_reset/")
    @C12705g
    C2201v<C4177d<Void>> unbindOldWithdrawAccount(@C12703e(mo23873a = "set_uniq_realname") String str);
}
