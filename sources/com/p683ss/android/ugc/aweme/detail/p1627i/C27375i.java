package com.p683ss.android.ugc.aweme.detail.p1627i;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.detail.api.DetailApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.detail.i.i */
public final class C27375i extends C26832a<Aweme> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str = objArr[0];
        final String str2 = "";
        if (objArr.length > 1 && objArr[1] != null) {
            str2 = (String) objArr[1];
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return DetailApi.m65845a(str, str2);
            }
        }, 0);
        return true;
    }
}
