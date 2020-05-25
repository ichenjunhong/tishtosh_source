package com.p683ss.android.ugc.aweme.setting.model;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.setting.api.RestrictApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.model.RestrictUserModel */
public class RestrictUserModel extends C37716a<CommonResponse> {
    public void restricUser(final String str) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                return RestrictApi.m91377c(str);
            }
        }, 0);
    }
}
