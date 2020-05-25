package com.p683ss.android.ugc.aweme.follow.presenter;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.follow.api.FollowingAwemeCountApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.h */
public final class C31886h extends C26832a<C31885g> {

    /* renamed from: a */
    public static final FollowingAwemeCountApi f83325a = ((FollowingAwemeCountApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FollowingAwemeCountApi.class));

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C31886h.f83325a.getFollowingsLatestAwemePublishCount(((Integer) objArr[0]).intValue()).get();
            }
        }, 0);
        return super.sendRequest(objArr);
    }
}
