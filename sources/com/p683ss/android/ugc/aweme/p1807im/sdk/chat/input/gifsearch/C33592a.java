package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a */
public final class C33592a {

    /* renamed from: a */
    private static GifApi f87072a = ((GifApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C35268h.f90601b).mo19926b(false).mo19927c(false).mo19924a(true).mo19925a().mo19930a(GifApi.class));

    /* renamed from: a */
    public static void m76986a(String str) {
        f87072a.giphyAnalytics(str);
    }
}
