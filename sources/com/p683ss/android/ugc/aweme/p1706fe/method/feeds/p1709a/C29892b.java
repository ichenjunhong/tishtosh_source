package com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1709a;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27403a;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.b */
public final class C29892b extends C27403a<C29896b, C26876b<C29896b>> {

    /* renamed from: a */
    public static final C29893a f78023a = new C29893a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.b$a */
    public static final class C29893a {
        private C29893a() {
        }

        public /* synthetic */ C29893a(C52707g gVar) {
            this();
        }
    }

    public C29892b(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C29896b)) {
            aVar = null;
        }
        this.mModel = (C29896b) aVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i));
    }
}
