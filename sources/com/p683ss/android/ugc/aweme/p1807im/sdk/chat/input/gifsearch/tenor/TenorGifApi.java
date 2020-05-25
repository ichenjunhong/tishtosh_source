package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.tenor;

import java.util.Map;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53090u;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor.TenorGifApi */
public interface TenorGifApi {
    @C53075f(mo110603a = "anonid")
    C0013i<Object> getAnonId(@C53089t(mo110619a = "key") String str);

    @C53075f(mo110603a = "search")
    C0013i<Object> getSearchGifs(@C53090u Map<String, String> map);

    @C53075f(mo110603a = "trending")
    C0013i<Object> getTrendingGifs(@C53090u Map<String, String> map);

    @C53075f(mo110603a = "registershare")
    C0013i<Object> registerShareGif(@C53090u Map<String, String> map);
}
