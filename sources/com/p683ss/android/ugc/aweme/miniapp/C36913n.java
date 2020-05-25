package com.p683ss.android.ugc.aweme.miniapp;

import com.bytedance.common.utility.p522b.C9376b;
import com.p2615tt.appbrandimpl.MicroAppApi;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.n */
public final class C36913n extends C26875a<C36966e, C36967f> {

    /* renamed from: a */
    private int f94298a;

    /* renamed from: b */
    private List<C36966e> f94299b = new ArrayList();

    /* renamed from: c */
    private boolean f94300c = false;

    public final List<C36966e> getItems() {
        return this.f94299b;
    }

    public final boolean isHasMore() {
        return this.f94300c;
    }

    public final void loadMoreList(Object... objArr) {
        m83050a(this.f94298a);
    }

    public final void refreshList(Object... objArr) {
        m83050a(0);
    }

    /* renamed from: a */
    private void m83050a(final int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return MicroAppApi.m111318a(i, 30, 0);
            }
        }, 0);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        C36967f fVar = (C36967f) obj;
        if (fVar == null || C9376b.m18558a((Collection<T>) fVar.f94389a)) {
            this.f94300c = false;
            this.f94298a = 0;
            this.f94299b.clear();
            return;
        }
        this.f94300c = fVar.f94390b;
        this.f94298a = fVar.f94391c;
        if (this.mListQueryType == 1) {
            this.f94299b.clear();
        }
        this.f94299b.addAll(fVar.f94389a);
    }
}
