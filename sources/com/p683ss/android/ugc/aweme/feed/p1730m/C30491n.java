package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.p683ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.m.n */
public final class C30491n extends C26832a<PrivateUrlModel> {

    /* renamed from: a */
    public static final FeedStatsApi f79699a = ((FeedStatsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FeedStatsApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C30491n.f79699a.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
            }
        }, 0);
        return true;
    }
}
