package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5749g;
import com.bytedance.android.livesdk.chatroom.model.C5750h;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface FansClubApi {
    @C12718t(mo23886a = "/live/fansclub/auto_renewal/{anchor_id}/edit/")
    @C12705g
    C2201v<C4177d<Object>> editAutoLight(@C12722x(mo23891a = "anchor_id") long j, @C12703e(mo23873a = "open") int i);

    @C12706h(mo23876a = "/live/fansclub/prefer/candidate_list/")
    C2201v<C4177d<C5750h>> get(@C12724z(mo23894a = "offset") int i, @C12724z(mo23894a = "count") int i2);

    @C12706h(mo23876a = "/live/fansclub/auto_renewal/list/")
    C2201v<C4175b<C5749g, C2974a>> getAutoLightList(@C12724z(mo23894a = "offset") int i, @C12724z(mo23894a = "count") int i2);

    @C12718t(mo23886a = "/live/fansclub/prefer/set/")
    @C12705g
    C2201v<C4177d<Object>> setPreferFansClub(@C12703e(mo23873a = "anchor_id") String str);
}
