package com.p683ss.android.ugc.aweme.setting.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.model.BlackList;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager */
public final class BlackApiManager {

    /* renamed from: a */
    static BlackApi f105237a = ((BlackApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(BlackApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager$BlackApi */
    interface BlackApi {
        @C53075f(mo110603a = "/aweme/v1/user/block/list/")
        C17832m<BlackList> fetchBlackList(@C53089t(mo110619a = "index") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "/aweme/v1/im/set/chatpriv/")
        C17832m<BaseResponse> setChatAuthority(@C53089t(mo110619a = "val") int i);
    }

    /* renamed from: a */
    public static BlackList m91374a(int i, int i2) throws Exception {
        try {
            return (BlackList) f105237a.fetchBlackList(i, i2).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
