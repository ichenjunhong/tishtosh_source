package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import com.bytedance.common.utility.p522b.C9376b;
import com.p2615tt.appbrandimpl.MicroAppApi;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a */
public final class C36842a extends C26875a<C36966e, C36845b> {

    /* renamed from: a */
    public static final C36843a f94169a = new C36843a(null);

    /* renamed from: b */
    private int f94170b;

    /* renamed from: c */
    private final ArrayList<C36966e> f94171c = new ArrayList<>();

    /* renamed from: d */
    private boolean f94172d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a$a */
    public static final class C36843a {
        private C36843a() {
        }

        public /* synthetic */ C36843a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.a$b */
    static final class C36844b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f94173a;

        C36844b(int i) {
            this.f94173a = i;
        }

        public final /* synthetic */ Object call() {
            return MicroAppApi.m111315a(this.f94173a, 20);
        }
    }

    public final boolean isHasMore() {
        return this.f94172d;
    }

    public final List<C36966e> getItems() {
        return this.f94171c;
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m82917a(this.f94170b);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m82917a(0);
    }

    /* renamed from: a */
    private final void m82917a(int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new C36844b(i), 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C36845b bVar = (C36845b) obj;
        int i = 0;
        if (bVar == null || C9376b.m18558a((Collection<T>) bVar.f94176c)) {
            this.f94172d = false;
            return;
        }
        Boolean bool = bVar.f94175b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.f94172d = z;
        Integer num = bVar.f94174a;
        if (num != null) {
            i = num.intValue();
        }
        this.f94170b = i;
        if (this.mListQueryType == 1) {
            this.f94171c.clear();
        }
        ArrayList<C36966e> arrayList = this.f94171c;
        Collection collection = bVar.f94176c;
        if (collection == null) {
            collection = new ArrayList();
        }
        arrayList.addAll(collection);
    }
}
