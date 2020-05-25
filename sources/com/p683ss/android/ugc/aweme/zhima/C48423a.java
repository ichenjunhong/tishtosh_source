package com.p683ss.android.ugc.aweme.zhima;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.zhima.a */
public final class C48423a extends C37716a<CommonResponse> {
    /* renamed from: a */
    public final void mo95901a() {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return VerifyApi.m104777a();
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        super.handleData((CommonResponse) obj);
        if (((CommonResponse) this.mData).statusCode == 0) {
            C10691a.m21552c(C11010c.m22280a(), "清除成功~ 可以去重新走认证流程了", 0).mo19066a();
        } else {
            C10691a.m21546b(C11010c.m22280a(), "清除失败@_@", 0).mo19066a();
        }
    }
}
