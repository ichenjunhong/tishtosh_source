package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28010e;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.f */
public final class C28077f extends C26835b<List<? extends Object>> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73759a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28077f.class), "mtSearchFoldCount", "getMtSearchFoldCount()I"))};

    /* renamed from: c */
    public static final C28078a f73760c = new C28078a(null);

    /* renamed from: b */
    public C28524b f73761b;

    /* renamed from: d */
    private final C52668f f73762d;

    /* renamed from: e */
    private final boolean f73763e;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.f$a */
    public static final class C28078a {
        private C28078a() {
        }

        public /* synthetic */ C28078a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.f$b */
    public enum C28079b {
        TYPE_NULL,
        TYPE_NONE,
        TYPE_SHOW_MORE,
        TYPE_CLEAR_ALL
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.f$c */
    static final class C28080c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C28080c f73765a = new C28080c();

        C28080c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m66871a();
        }

        /* renamed from: a */
        private static Integer m66871a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                return b.getMtSearchHistoryFoldCount();
            } catch (Exception unused) {
                return Integer.valueOf(3);
            }
        }
    }

    public C28077f() {
        this(false, 1, null);
    }

    /* renamed from: a */
    private int m66863a() {
        return ((Number) this.f73762d.getValue()).intValue();
    }

    private C28077f(boolean z) {
        this.f73763e = z;
        this.f73762d = C52732g.m112285a(C28080c.f73765a);
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C28524b bVar = this.f73761b;
        boolean z = this.f73763e;
        SearchHistoryLastItemHolder searchHistoryLastItemHolder = new SearchHistoryLastItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bse, viewGroup, false), bVar);
        searchHistoryLastItemHolder.f72968b = z;
        C52711k.m112236a((Object) searchHistoryLastItemHolder, "SearchHistoryLastItemHol…nt, mHandler, fromNearby)");
        return searchHistoryLastItemHolder;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        return list.get(i) instanceof C28079b;
    }

    public /* synthetic */ C28077f(boolean z, int i, C52707g gVar) {
        this(false);
    }

    /* renamed from: c */
    private static C28079b m66865c(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, C28079b bVar) {
        arrayList.addAll(list);
        if (list.size() <= 2) {
            return C28079b.TYPE_NONE;
        }
        return C28079b.TYPE_CLEAR_ALL;
    }

    /* renamed from: b */
    private final C28079b m66864b(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, C28079b bVar) {
        int a = m66863a();
        if (list.size() <= a) {
            arrayList.addAll(list);
            return C28079b.TYPE_NONE;
        } else if (bVar == C28079b.TYPE_NONE || bVar == C28079b.TYPE_SHOW_MORE) {
            arrayList.addAll(list.subList(0, a));
            return C28079b.TYPE_SHOW_MORE;
        } else {
            arrayList.addAll(list);
            return C28079b.TYPE_CLEAR_ALL;
        }
    }

    /* renamed from: d */
    private static C28079b m66866d(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, C28079b bVar) {
        if (list.size() <= 3) {
            arrayList.addAll(list);
            return C28079b.TYPE_CLEAR_ALL;
        } else if (bVar == C28079b.TYPE_NONE || bVar == C28079b.TYPE_SHOW_MORE) {
            arrayList.addAll(list.subList(0, 3));
            return C28079b.TYPE_SHOW_MORE;
        } else {
            arrayList.addAll(list);
            return C28079b.TYPE_CLEAR_ALL;
        }
    }

    /* renamed from: a */
    public final C28079b mo56495a(List<? extends SearchHistory> list, ArrayList<SearchHistory> arrayList, C28079b bVar) {
        C52711k.m112240b(arrayList, "resultList");
        C52711k.m112240b(bVar, "defLast");
        if (C9376b.m18558a((Collection<T>) list)) {
            return C28079b.TYPE_NONE;
        }
        if (C41424g.m91242c() && !C41424g.m91243d()) {
            if (list == null) {
                C52711k.m112234a();
            }
            return m66864b(list, arrayList, bVar);
        } else if (C41424g.m91240a()) {
            if (list == null) {
                C52711k.m112234a();
            }
            return m66866d(list, arrayList, bVar);
        } else {
            if (list == null) {
                C52711k.m112234a();
            }
            return m66865c(list, arrayList, bVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        Object obj2 = list2.get(i);
        if (obj2 != null) {
            C28079b bVar = (C28079b) obj2;
            SearchHistoryLastItemHolder searchHistoryLastItemHolder = (SearchHistoryLastItemHolder) vVar;
            searchHistoryLastItemHolder.f72970d = bVar;
            if (!C41424g.m91242c() || C41424g.m91243d() || !C28010e.m66766a()) {
                searchHistoryLastItemHolder.mLineView.setVisibility(8);
            } else {
                searchHistoryLastItemHolder.mLineView.setVisibility(0);
            }
            if (searchHistoryLastItemHolder.f72968b) {
                searchHistoryLastItemHolder.mLineView.setVisibility(8);
            }
            switch (bVar) {
                case TYPE_NONE:
                    searchHistoryLastItemHolder.mTipView.setVisibility(8);
                    return;
                case TYPE_SHOW_MORE:
                    searchHistoryLastItemHolder.mTipView.setVisibility(0);
                    searchHistoryLastItemHolder.mTipView.setText(searchHistoryLastItemHolder.itemView.getResources().getString(R.string.aqs));
                    return;
                case TYPE_CLEAR_ALL:
                    searchHistoryLastItemHolder.mTipView.setVisibility(0);
                    searchHistoryLastItemHolder.mTipView.setText(searchHistoryLastItemHolder.itemView.getResources().getString(R.string.aqi));
                    return;
                default:
                    searchHistoryLastItemHolder.itemView.setVisibility(8);
                    return;
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast");
        }
    }
}
