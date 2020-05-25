package com.p683ss.android.ugc.aweme.favorites.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.favorites.model.C29707b;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29665f;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi */
public final class UserFavoritesApi {

    /* renamed from: a */
    public static final RetrofitApi f77586a = ((RetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi$RetrofitApi */
    public interface RetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/aweme/collect/")
        C0013i<BaseResponse> collectAweme(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/challenge/collect/")
        C0013i<BaseResponse> collectChallenge(@C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/mix/collect/")
        C0013i<BaseResponse> collectMix(@C53089t(mo110619a = "mix_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/music/collect/")
        C0013i<BaseResponse> collectMusic(@C53089t(mo110619a = "music_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/poi/collect/")
        C0013i<BaseResponse> collectPoi(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v2/shop/seeding/collect/")
        C0013i<BaseResponse> collectSeeding(@C53089t(mo110619a = "seed_id") String str, @C53089t(mo110619a = "operate_type") int i);

        @C53075f(mo110603a = "/aweme/v1/aweme/listcollection/")
        C0013i<BaseResponse> fetchCollectAwemeList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/challenge/listcollection/")
        C0013i<C29707b> fetchCollectChallengeList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/music/listcollection/")
        C0013i<BaseResponse> fetchCollectMusicList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/poi/listcollection/")
        C0013i<Object> fetchCollectPoiList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2);

        @C53075f(mo110603a = "/aweme/v1/sticker/listcollection/")
        C0013i<C29665f> fetchStickerList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);
    }

    /* renamed from: a */
    public static C29707b m69719a(int i, int i2) {
        C0013i fetchCollectChallengeList = f77586a.fetchCollectChallengeList(i, i2);
        try {
            fetchCollectChallengeList.mo36g();
        } catch (InterruptedException unused) {
        }
        if (fetchCollectChallengeList.mo33d()) {
            try {
                throw fetchCollectChallengeList.mo35f();
            } catch (Exception unused2) {
            }
        }
        return (C29707b) fetchCollectChallengeList.mo34e();
    }

    /* renamed from: b */
    public static C29665f m69720b(int i, int i2) {
        C0013i fetchStickerList = f77586a.fetchStickerList(i, i2);
        try {
            fetchStickerList.mo36g();
        } catch (InterruptedException unused) {
        }
        if (fetchStickerList.mo33d()) {
            try {
                throw fetchStickerList.mo35f();
            } catch (Exception unused2) {
            }
        }
        return (C29665f) fetchStickerList.mo34e();
    }
}
