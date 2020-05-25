package com.p683ss.android.ugc.aweme.similarvideo.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.similarvideo.p2268a.C45643a;
import com.p683ss.android.ugc.aweme.similarvideo.p2268a.C45644b;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi */
public final class SimilarVideoSearchApi {

    /* renamed from: a */
    static final IRetrofit f115427a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e);

    /* renamed from: com.ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/ug/similar/entry/")
        C17832m<C45643a> hasSimilarVideo(@C53089t(mo110619a = "aweme_id") String str);

        @C53084o(mo110612a = "/aweme/v1/ug/similar/feed/")
        C17832m<C45644b> searchSimilarVideoList(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "offset") long j, @C53089t(mo110619a = "count") int i);
    }

    /* renamed from: a */
    public static C45644b m99390a(String str, long j, int i) throws Exception {
        try {
            return (C45644b) ((RealApi) f115427a.create(RealApi.class)).searchSimilarVideoList(str, j, i).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }
}
