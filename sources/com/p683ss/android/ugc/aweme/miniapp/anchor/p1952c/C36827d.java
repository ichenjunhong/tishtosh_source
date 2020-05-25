package com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36833c;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.d */
public final class C36827d extends C36824b<C36831b, C36833c> {

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.d$a */
    static final class C36828a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f94130a;

        /* renamed from: b */
        final /* synthetic */ int f94131b;

        C36828a(Object[] objArr, int i) {
            this.f94130a = objArr;
            this.f94131b = i;
        }

        public final /* synthetic */ Object call() {
            return AnchorApi.m82817a(String.valueOf(this.f94130a[1]), 20, this.f94131b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76017a(int i, Object... objArr) {
        C52711k.m112240b(objArr, "params");
        C23566n.m57766a().mo48750a(this.mHandler, new C36828a(objArr, i), 0);
    }
}
