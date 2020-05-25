package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.broadcast.model.C3452a;
import com.bytedance.android.live.broadcast.model.C3457d;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface CoverApi {
    @C12706h(mo23876a = "/webcast/room/anchor_cover_status/")
    C2201v<C4177d<C3452a>> anchorCoverStatus();

    @C12706h(mo23876a = "/webcast/room/anchor_cover_quality/")
    C2201v<C4177d<C3457d>> getCoverQuality(@C12724z(mo23894a = "uri") String str);
}
