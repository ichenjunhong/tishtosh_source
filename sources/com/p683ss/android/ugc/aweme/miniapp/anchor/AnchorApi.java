package com.p683ss.android.ugc.aweme.miniapp.anchor;

import com.bytedance.retrofit2.p831b.C12713o;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36832b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36833c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.AnchorApi */
public final class AnchorApi {

    /* renamed from: a */
    private static final IRetrofit f94046a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f94047b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.AnchorApi$RealApi */
    public interface RealApi {
        @C53075f
        C17832m<String> executeGet(@C12713o int i, @C53093x String str);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/anchor/recommend/")
        C17832m<Object> fetchRecommendAnchorList(@C53089t(mo110619a = "zip_uri") String str);

        @C53075f(mo110603a = "https://aweme.snssdk.com/web/api/medium/hot/list/")
        C17832m<C36832b> getMediumRecommendList(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "offset") int i2);

        @C53075f(mo110603a = "https://aweme.snssdk.com/web/api/medium/search/")
        C17832m<C36833c> getMediumSearchList(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "offset") int i2);
    }

    /* renamed from: a */
    public static C36832b m82816a(int i, int i2) throws Exception {
        try {
            return (C36832b) ((RealApi) f94046a.create(RealApi.class)).getMediumRecommendList(i, 20).get();
        } catch (ExecutionException e) {
            throw f94047b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C36833c m82817a(String str, int i, int i2) throws Exception {
        try {
            return (C36833c) ((RealApi) f94046a.create(RealApi.class)).getMediumSearchList(str, 20, i2).get();
        } catch (ExecutionException e) {
            throw f94047b.propagateCompatibleException(e);
        }
    }
}
