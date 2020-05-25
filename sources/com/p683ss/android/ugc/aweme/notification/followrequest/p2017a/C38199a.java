package com.p683ss.android.ugc.aweme.notification.followrequest.p2017a;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.a.a */
public final class C38199a extends C26832a<FollowRequestResponse> {

    /* renamed from: a */
    public long f97264a;

    /* renamed from: b */
    public long f97265b = 1;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C38199a.this.f97264a = System.currentTimeMillis() / 1000;
                return FollowRequestApiManager.m85373a(C38199a.this.f97264a, C38199a.this.f97265b, 0);
            }
        }, 0);
        return true;
    }
}
