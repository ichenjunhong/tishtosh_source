package com.p683ss.android.ugc.aweme.share.p2152d.p2153a;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.d.a.a */
public final class C42002a extends C26832a<String> {
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
                return C41922a.m91868a().dislikeAweme((Aweme) objArr[0]);
            }
        }, 0);
        return true;
    }
}
