package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface LogReportApi {
    @C12718t(mo23886a = "/webcast/stats/")
    C2201v<C4177d<Object>> logReport(@C12724z(mo23894a = "ssmix") String str, @C12700b Object obj);
}
