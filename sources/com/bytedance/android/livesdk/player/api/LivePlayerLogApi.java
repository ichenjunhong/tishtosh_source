package com.bytedance.android.livesdk.player.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

public interface LivePlayerLogApi {
    @C12718t(mo23886a = "/webcast/stats/")
    C2201v<C4177d<Void>> sendLiveLog(@C12700b TypedOutput typedOutput);
}
