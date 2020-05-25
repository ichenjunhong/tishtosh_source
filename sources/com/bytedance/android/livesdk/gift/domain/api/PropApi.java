package com.bytedance.android.livesdk.gift.domain.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7513l;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface PropApi {
    @C12718t(mo23886a = "/webcast/props/mine/")
    C2201v<C4177d<C7513l>> getPropList(@C12724z(mo23894a = "room_id") long j);

    @C12718t(mo23886a = "/webcast/props/consume/")
    @C12705g
    C2201v<C4177d<C7514m>> sendProp(@C12703e(mo23873a = "prop_def_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12703e(mo23873a = "count") int i, @C12703e(mo23873a = "to_user_id") long j3, @C12703e(mo23873a = "is_aweme_free_gift") int i2);
}
