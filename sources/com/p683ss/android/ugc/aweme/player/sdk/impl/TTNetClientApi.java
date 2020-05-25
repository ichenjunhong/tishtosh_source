package com.p683ss.android.ugc.aweme.player.sdk.impl;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12710l;
import java.util.List;
import org.json.JSONObject;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.TTNetClientApi */
public interface TTNetClientApi {
    @C53075f
    C12690b<String> get(@C53093x String str, @C12710l List<C12685b> list);

    @C53084o
    C12690b<String> post(@C53093x String str, @C12710l List<C12685b> list, @C53070a JSONObject jSONObject);
}
