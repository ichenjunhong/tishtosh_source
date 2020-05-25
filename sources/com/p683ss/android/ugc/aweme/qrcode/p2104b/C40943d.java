package com.p683ss.android.ugc.aweme.qrcode.p2104b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.qrcode.api.RiskApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.d */
public final class C40943d extends C37716a<C40942c> {
    public final /* bridge */ /* synthetic */ void handleData(Object obj) {
        C40942c cVar = (C40942c) obj;
        super.handleData(cVar);
        this.mData = cVar;
    }

    /* renamed from: a */
    public final void mo83432a(final String str) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return RiskApi.m90527a(str);
            }
        }, 0);
    }
}
