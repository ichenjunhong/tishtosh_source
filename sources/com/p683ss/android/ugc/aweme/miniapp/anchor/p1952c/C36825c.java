package com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.C36832b;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.c */
public final class C36825c extends C36823a<C36831b, C36832b> {

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c.c$a */
    static final class C36826a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f94129a;

        C36826a(int i) {
            this.f94129a = i;
        }

        public final /* synthetic */ Object call() {
            return AnchorApi.m82816a(this.f94129a, 20);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76016a(int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new C36826a(i), 0);
    }
}
