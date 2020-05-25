package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27923q;
import com.p683ss.android.ugc.aweme.discover.adapter.C27924r;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g.C28015a;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g.C28021c;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.ISearchLegacyService;
import com.p683ss.android.ugc.aweme.search.SearchLegacyServiceImpl;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.b */
public final class C28071b extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73750a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28071b.class), "mSearchLegacyService", "getMSearchLegacyService()Lcom/ss/android/ugc/aweme/search/ISearchLegacyService;"))};

    /* renamed from: d */
    public static final C28072a f73751d = new C28072a(null);

    /* renamed from: b */
    public C28482ak f73752b;

    /* renamed from: c */
    public boolean f73753c;

    /* renamed from: e */
    private C0184k f73754e;

    /* renamed from: f */
    private final C52668f f73755f;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.b$a */
    public static final class C28072a {
        private C28072a() {
        }

        public /* synthetic */ C28072a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.b$b */
    static final class C28073b extends C52712l implements C52670a<ISearchLegacyService> {

        /* renamed from: a */
        public static final C28073b f73756a = new C28073b();

        C28073b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return SearchLegacyServiceImpl.createISearchLegacyServicebyMonsterPlugin();
        }
    }

    /* renamed from: a */
    private final ISearchLegacyService m66850a() {
        return (ISearchLegacyService) this.f73755f.getValue();
    }

    public C28071b() {
        this.f73755f = C52732g.m112285a(C28073b.f73756a);
    }

    public C28071b(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        this();
        this.f73754e = kVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        boolean z;
        C52711k.m112240b(viewGroup, "parent");
        if (C41424g.m91246f()) {
            C1352v createHotSearchImageViewHolder = m66850a().createHotSearchImageViewHolder(viewGroup, "hot_search_section_search", this.f73752b, this.f73754e);
            C52711k.m112236a((Object) createHotSearchImageViewHolder, "mSearchLegacyService.cre…mHotSearchHandler, owner)");
            return createHotSearchImageViewHolder;
        }
        if (C41424g.m91248h() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C28015a aVar = C28014g.f73599d;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bss, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            C28014g gVar = new C28014g(inflate, true);
            gVar.f73600a.f73619a = this.f73752b;
            return gVar;
        }
        C28482ak akVar = this.f73752b;
        C27924r rVar = new C27924r(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bs2, viewGroup, false), "hot_search_section_search", akVar);
        C52711k.m112236a((Object) rVar, "HotSearchWordViewHolder.…EARCH, mHotSearchHandler)");
        return rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null && !C9376b.m18558a((Collection<T>) list2) && (list2.get(0) instanceof HotSearchItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        int i2;
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (this.f73753c) {
            this.f73753c = false;
            List list3 = null;
            if (vVar instanceof C27924r) {
                C27924r rVar = (C27924r) vVar;
                Object obj2 = list2.get(i);
                if (!(obj2 instanceof List)) {
                    obj2 = null;
                }
                rVar.mo56312a((List) obj2);
            } else if (vVar instanceof C28014g) {
                C28014g gVar = (C28014g) vVar;
                Object obj3 = list2.get(i);
                if (!(obj3 instanceof List)) {
                    obj3 = null;
                }
                List list4 = (List) obj3;
                if (!C52711k.m112239a((Object) list4, (Object) C27923q.f73340a)) {
                    if (list4 != null) {
                        i2 = list4.size();
                    } else {
                        i2 = 0;
                    }
                    int min = Math.min(i2, C28014g.f73598c);
                    C28021c cVar = gVar.f73600a;
                    if (list4 != null) {
                        list3 = list4.subList(0, min);
                    }
                    cVar.mo56396a(list3);
                }
            } else if (m66850a().isHotSearchImageViewHolder(vVar)) {
                ISearchLegacyService a = m66850a();
                Object obj4 = list2.get(i);
                if (!(obj4 instanceof List)) {
                    obj4 = null;
                }
                a.bindHotSearchImageViewHolder(vVar, (List) obj4);
            }
        }
    }
}
