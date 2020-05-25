package com.p683ss.android.ugc.aweme.feed.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi */
public final class FeedActionApi {

    /* renamed from: a */
    public static final RetrofitApi f78670a = ((RetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi$RetrofitApi */
    public interface RetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/aweme/delete/")
        C17832m<BaseResponse> deleteItem(@C53089t(mo110619a = "aweme_id") String str);

        @C53075f(mo110603a = "/aweme/v1/commit/item/digg/")
        C17832m<BaseResponse> diggItem(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "channel_id") int i2);

        @C53075f(mo110603a = "/aweme/v1/commit/item/digg/")
        C17832m<BaseResponse> diggItem(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "origin_aweme_id") String str2, @C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "channel_id") int i2);
    }
}
