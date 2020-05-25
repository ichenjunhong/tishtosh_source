package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy;

import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.GiphyGifApi */
public interface GiphyGifApi {
    @C53075f(mo110603a = "im/resources/gifs/search/")
    C0013i<C33605c> getSearchingGiphy(@C53089t(mo110619a = "offset") int i, @C53089t(mo110619a = "q") String str);

    @C53075f(mo110603a = "im/resources/gifs/trending/")
    C0013i<C33605c> getTrendingGiphy(@C53089t(mo110619a = "offset") int i);
}
