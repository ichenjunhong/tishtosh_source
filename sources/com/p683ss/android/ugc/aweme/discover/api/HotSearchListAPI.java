package com.p683ss.android.ugc.aweme.discover.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p683ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchListAPI */
public final class HotSearchListAPI {

    /* renamed from: a */
    private static IRetrofitService f73697a;

    /* renamed from: b */
    private static API f73698b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchListAPI$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/hot/search/list/")
        C17832m<HotSearchListResponse> getHotSearchList(@C53089t(mo110619a = "detail_list") int i);

        @C53075f(mo110603a = "/aweme/v1/hot/search/list/")
        C17832m<HotSearchListResponse> getHotSearchList(@C53089t(mo110619a = "detail_list") int i, @C53089t(mo110619a = "source") int i2);

        @C53075f(mo110603a = "/aweme/v1/hotsearch/music/billboard/")
        C17832m<HotSearchMusicListResponse> getHotSearchMusicList();

        @C53075f(mo110603a = "/aweme/v1/hotsearch/aweme/billboard/")
        C17832m<HotVideoListResponse> getHotSearchVideoList();

        @C53075f(mo110603a = "aweme/v1/hotsearch/positive_energy/billboard/")
        C17832m<HotVideoListResponse> getPositiveEnergyList();

        @C53075f(mo110603a = "/aweme/v1/branch/billboard/entrance/")
        C17832m<RankingListCover> getRankingListCover();
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        f73697a = createIRetrofitServicebyMonsterPlugin;
        f73698b = (API) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(Api.f61282b).create(API.class);
    }

    /* renamed from: a */
    public static HotVideoListResponse m66822a() throws Exception {
        try {
            return (HotVideoListResponse) f73698b.getHotSearchVideoList().get();
        } catch (ExecutionException e) {
            throw f73697a.propagateCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static HotVideoListResponse m66823b() throws Exception {
        try {
            return (HotVideoListResponse) f73698b.getPositiveEnergyList().get();
        } catch (ExecutionException e) {
            throw f73697a.propagateCompatibleException(e);
        }
    }
}
