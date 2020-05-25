package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.h */
public final class C28082h extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    public final C27859bf<?> f73766a;

    /* renamed from: b */
    private C28083a f73767b;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.h$a */
    public static abstract class C28083a {

        /* renamed from: b */
        public static final String f73768b;

        /* renamed from: c */
        public static final C28084a f73769c;

        /* renamed from: a */
        public final C27859bf<?> f73770a;

        /* renamed from: com.ss.android.ugc.aweme.discover.c.a.h$a$a */
        public static final class C28084a {
            private C28084a() {
            }

            public /* synthetic */ C28084a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public abstract C1352v mo56493a(ViewGroup viewGroup);

        /* renamed from: a */
        public abstract void mo56494a(List<? extends Object> list, int i, C1352v vVar, List<Object> list2);

        static {
            C28084a aVar = new C28084a(null);
            f73769c = aVar;
            String simpleName = aVar.getClass().getSimpleName();
            if (simpleName == null) {
                C52711k.m112234a();
            }
            f73768b = simpleName;
        }

        public C28083a(C27859bf<?> bfVar) {
            C52711k.m112240b(bfVar, "adapter");
            this.f73770a = bfVar;
        }

        /* renamed from: a */
        public final int mo56496a(Object obj) {
            C52711k.m112240b(obj, "item");
            ArrayList b = this.f73770a.mo56283b();
            Collection collection = b;
            if (C9376b.m18558a(collection)) {
                return -1;
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                if (C52711k.m112239a(obj, b.get(i))) {
                    return i;
                }
            }
            return -1;
        }
    }

    public C28082h(C27859bf<?> bfVar) {
        C52711k.m112240b(bfVar, "adapter");
        this.f73766a = bfVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C28083a aVar = this.f73767b;
        if (aVar == null) {
            C52711k.m112237a("mSubDelegate");
        }
        return aVar.mo56493a(viewGroup);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        Object obj2 = list.get(i);
        if (obj2 instanceof SuggestUser) {
            this.f73767b = new C28087j(this.f73766a);
            return true;
        } else if (obj2 instanceof SuggestMusic) {
            this.f73767b = new C28081g(this.f73766a);
            return true;
        } else if (!(obj2 instanceof SuggestChallenge)) {
            return false;
        } else {
            this.f73767b = new C28074c(this.f73766a);
            return true;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        C28083a aVar = this.f73767b;
        if (aVar == null) {
            C52711k.m112237a("mSubDelegate");
        }
        aVar.mo56494a(list2, i, vVar, list);
    }
}
