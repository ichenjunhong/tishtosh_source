package com.p683ss.android.ugc.aweme.checkprofile;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.checkprofile.api.CheckProfileManager;
import com.p683ss.android.ugc.aweme.checkprofile.api.CheckProfileManager.Response;
import com.p683ss.android.ugc.aweme.common.C26832a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.d */
public final class C24793d extends C26832a<Response> {
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CheckProfileManager.m60327a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
            }
        }, 0);
        return true;
    }
}
