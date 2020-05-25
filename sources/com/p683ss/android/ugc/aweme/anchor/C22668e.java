package com.p683ss.android.ugc.aweme.anchor;

import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi.RealApi;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22593b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.e */
public final class C22668e extends C26875a<AnchorCell, C22593b> {

    /* renamed from: a */
    public final int f60843a;

    /* renamed from: b */
    private List<AnchorCell> f60844b = new ArrayList();

    /* renamed from: c */
    private int f60845c;

    /* renamed from: d */
    private boolean f60846d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.e$a */
    static final class C22669a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C22668e f60847a;

        /* renamed from: b */
        final /* synthetic */ Object[] f60848b;

        C22669a(C22668e eVar, Object[] objArr) {
            this.f60847a = eVar;
            this.f60848b = objArr;
        }

        public final /* synthetic */ Object call() {
            int i = this.f60847a.f60843a;
            Object obj = this.f60848b[1];
            if (obj != null) {
                String str = (String) obj;
                C52711k.m112240b(str, "keyword");
                Object obj2 = ((RealApi) AnchorApi.f60731a.mo19930a(RealApi.class)).getAnchorSearchResponse(i, str).get();
                C52711k.m112236a(obj2, "RETROFIT\n               …d)\n                .get()");
                return (C22593b) obj2;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.String");
        }
    }

    public final List<AnchorCell> getItems() {
        return this.f60844b;
    }

    public final boolean isHasMore() {
        return this.f60846d;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
    }

    public C22668e(int i) {
        this.f60843a = i;
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        C23566n.m57766a().mo48750a(this.mHandler, new C22669a(this, objArr), 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C22593b bVar = (C22593b) obj;
        if (bVar != null) {
            this.f60844b.clear();
            Collection collection = bVar.f60733a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f60846d = false;
                List<AnchorCell> list = this.f60844b;
                List<AnchorCell> list2 = bVar.f60733a;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                list.addAll(list2);
            } else {
                this.f60846d = false;
                this.f60845c = 0;
                this.f60844b.clear();
            }
        }
    }
}
