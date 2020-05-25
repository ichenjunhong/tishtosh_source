package com.p683ss.android.ugc.aweme.favorites.api.notice;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi */
public final class CollectionNoticeApi {

    /* renamed from: a */
    static final IRetrofit f77589a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    private static IRetrofitService f77590b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNoticeApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/collection/notice/")
        C17832m<CollectionNotice> getCollectionNotice();
    }

    /* renamed from: a */
    public static CollectionNotice m69721a() throws Exception {
        try {
            return (CollectionNotice) ((RealApi) f77589a.create(RealApi.class)).getCollectionNotice().get();
        } catch (ExecutionException e) {
            throw f77590b.propagateCompatibleException(e);
        }
    }
}
