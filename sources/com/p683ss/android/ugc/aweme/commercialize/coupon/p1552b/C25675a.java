package com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25688c;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.b.a */
public final class C25675a extends C37716a<C25688c> {
    /* renamed from: a */
    public final void mo52824a(final int i, final String str) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CouponApi.m62228a(i, str);
            }
        }, 0);
    }
}
