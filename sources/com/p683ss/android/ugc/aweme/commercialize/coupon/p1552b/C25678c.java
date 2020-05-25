package com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25689d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.b.c */
public final class C25678c extends C26875a<C25687b, C25689d> {

    /* renamed from: a */
    public boolean f67916a;

    /* renamed from: b */
    public int f67917b;

    /* renamed from: c */
    private List<C25687b> f67918c = new ArrayList();

    /* renamed from: d */
    private boolean f67919d = false;

    /* renamed from: e */
    private int f67920e;

    public final List<C25687b> getItems() {
        return this.f67918c;
    }

    public final boolean isHasMore() {
        return this.f67919d;
    }

    public final void loadMoreList(Object... objArr) {
        m62234a(this.f67920e);
    }

    public final void refreshList(Object... objArr) {
        m62234a(1);
    }

    /* renamed from: a */
    private void m62234a(final int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CouponApi.m62229a(i, 10, C25678c.this.f67917b);
            }
        }, 0);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public C25678c(boolean z) {
        int i = 1;
        this.f67920e = 1;
        this.f67916a = false;
        if (!z) {
            i = 4;
        }
        this.f67917b = i;
    }

    /* renamed from: a */
    private void m62235a(boolean z) {
        if (z) {
            this.f67916a = false;
        }
        this.mIsNewDataEmpty = true;
        this.f67919d = false;
        this.f67920e = 1;
    }

    public final /* synthetic */ void handleData(Object obj) {
        C25689d dVar = (C25689d) obj;
        if (dVar == null) {
            m62235a(true);
            return;
        }
        this.f67919d = dVar.f67960d;
        this.f67916a = dVar.f67959c;
        if (C9376b.m18558a((Collection<T>) dVar.f67957a)) {
            m62235a(false);
            return;
        }
        if (this.mListQueryType == 1) {
            this.f67918c.clear();
            this.f67920e = 1;
        }
        this.f67920e++;
        this.f67918c.addAll(dVar.f67957a);
    }
}
