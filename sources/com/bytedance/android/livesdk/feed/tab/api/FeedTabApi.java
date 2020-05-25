package com.bytedance.android.livesdk.feed.tab.api;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.C6946g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface FeedTabApi {
    @C12706h(mo23876a = "/webcast/tab/")
    C2201v<C4172a<C6945f, C6946g>> queryTab(@C12724z(mo23894a = "show_location") int i);
}
