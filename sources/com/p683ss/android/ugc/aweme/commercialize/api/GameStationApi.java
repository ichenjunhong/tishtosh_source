package com.p683ss.android.ugc.aweme.commercialize.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.GameStationApi */
public final class GameStationApi {

    /* renamed from: a */
    private static final IRetrofit f67863a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f67864b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.GameStationApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/aweme/")
        C17832m<FeedItemList> getVideoList(@C53089t(mo110619a = "micro_app_id") String str, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "count") long j, @C53089t(mo110619a = "cursor") long j2);
    }

    /* renamed from: a */
    public static FeedItemList m62164a(String str, String str2, long j, long j2) throws Exception {
        try {
            return (FeedItemList) ((RealApi) f67863a.create(RealApi.class)).getVideoList(str, str2, j, j2).get();
        } catch (ExecutionException e) {
            throw f67864b.propagateCompatibleException(e);
        }
    }
}
