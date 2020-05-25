package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.m.x */
public final class C30505x extends C26832a<String> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
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
                String str = (String) objArr[0];
                FeedActionApi.f78670a.deleteItem(str).get();
                return str;
            }
        }, 0);
        return true;
    }
}
