package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.adapter.C27869bh;
import com.p683ss.android.ugc.aweme.discover.adapter.C27918o;
import com.p683ss.android.ugc.aweme.discover.adapter.C27924r;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g;
import com.p683ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28377e;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SugExtraInfo;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28075d;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28076e;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f.C28079b;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28104l;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28121e.C28122a;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28153w;
import com.p683ss.android.ugc.aweme.discover.p1651i.p1652a.C28238a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.lego.p1913a.C35880a.C35881a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.search.C41419f;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bm */
public abstract class C28572bm<SuggestType> extends C23526a implements C28122a, C28238a, C28524b, C35881a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75071a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28572bm.class), "mSearchSquareAdapter", "getMSearchSquareAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28572bm.class), "mSearchSugAdapter", "getMSearchSugAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28572bm.class), "mHistoryManager", "getMHistoryManager()Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28572bm.class), "mSearchHistories", "getMSearchHistories()Ljava/util/concurrent/CopyOnWriteArrayList;"))};

    /* renamed from: k */
    public static final C28573a f75072k = new C28573a(null);

    /* renamed from: b */
    public C27718c f75073b;

    /* renamed from: c */
    public RecyclerView f75074c;

    /* renamed from: d */
    protected SearchIntermediateViewModel f75075d;

    /* renamed from: e */
    public String f75076e;

    /* renamed from: j */
    public SearchSugMobHelper f75077j;

    /* renamed from: l */
    private final C52668f f75078l = C28586bn.m67816a(new C28582i(this));

    /* renamed from: m */
    private final C52668f f75079m = C28586bn.m67816a(new C28583j(this));

    /* renamed from: n */
    private final C52668f f75080n = C28586bn.m67816a(new C28580g(this));

    /* renamed from: o */
    private final C52668f f75081o = C28586bn.m67816a(C28581h.f75097a);

    /* renamed from: p */
    private C28153w f75082p;

    /* renamed from: q */
    private int f75083q;

    /* renamed from: r */
    private Fragment f75084r;

    /* renamed from: s */
    private HashMap f75085s;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$a */
    public static final class C28573a {
        private C28573a() {
        }

        public /* synthetic */ C28573a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$b */
    public static final class C28574b extends C1331h {

        /* renamed from: a */
        public static final C28575a f75086a = new C28575a(null);

        /* renamed from: b */
        private final Drawable f75087b;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$b$a */
        public static final class C28575a {
            private C28575a() {
            }

            public /* synthetic */ C28575a(C52707g gVar) {
                this();
            }
        }

        public C28574b(Drawable drawable) {
            C52711k.m112240b(drawable, "drawable");
            this.f75087b = drawable;
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(canvas, "c");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            if (recyclerView.getChildCount() >= 2) {
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int l = linearLayoutManager.mo4751l();
                    C1352v f = recyclerView.mo4847f(l);
                    if ((f instanceof C27924r) || (f instanceof C27918o) || (f instanceof C28014g)) {
                        int j = (l - linearLayoutManager.mo4749j()) - 1;
                        if (j >= 0) {
                            recyclerView.getPaddingLeft();
                            C9432q.m18687b(recyclerView.getContext(), 16.0f);
                            recyclerView.getWidth();
                            recyclerView.getPaddingRight();
                            C9432q.m18687b(recyclerView.getContext(), 16.0f);
                            View childAt = recyclerView.getChildAt(j);
                            C52711k.m112236a((Object) childAt, "target");
                            LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams != null) {
                                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                                childAt.getBottom();
                                int i = layoutParams2.bottomMargin;
                                this.f75087b.getIntrinsicHeight();
                                this.f75087b.draw(canvas);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
                        }
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            rect.set(0, 0, 0, this.f75087b.getIntrinsicHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$c */
    static final class C28576c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75088a;

        /* renamed from: b */
        final /* synthetic */ SearchHistory f75089b;

        /* renamed from: c */
        final /* synthetic */ int f75090c;

        C28576c(C28572bm bmVar, SearchHistory searchHistory, int i) {
            this.f75088a = bmVar;
            this.f75089b = searchHistory;
            this.f75090c = i;
        }

        public final void run() {
            C41440e openNewSearchContainer = new C41440e().setKeyword(this.f75089b.keyword).setSearchFrom(1).setEnterFrom("search_history").setOpenNewSearchContainer(false);
            C52711k.m112236a((Object) openNewSearchContainer, "param");
            C28116e.m66922a(4, openNewSearchContainer);
            this.f75088a.mo58263a(openNewSearchContainer);
            C23794bh.m58379E().mo58332a("search_transfer_history_words_click");
            C28572bm bmVar = this.f75088a;
            SearchHistory searchHistory = this.f75089b;
            C23089d a = C23089d.m56640a().mo47829a("action_type", "click").mo47826a("order", this.f75090c).mo47829a("search_keyword", searchHistory.keyword);
            C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
            C26890h.m65011a("search_history", bmVar.mo58262a(a).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$d */
    static final class C28577d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75091a;

        /* renamed from: b */
        final /* synthetic */ SearchSugEntity f75092b;

        /* renamed from: c */
        final /* synthetic */ String f75093c;

        /* renamed from: d */
        final /* synthetic */ int f75094d;

        C28577d(C28572bm bmVar, SearchSugEntity searchSugEntity, String str, int i) {
            this.f75091a = bmVar;
            this.f75092b = searchSugEntity;
            this.f75093c = str;
            this.f75094d = i;
        }

        public final void run() {
            String str;
            String str2;
            C41440e searchFrom = new C41440e().setKeyword(this.f75092b.content).setEnterFrom("search_sug").setSearchFrom(3);
            if (this.f75091a.mo58264a(this.f75092b)) {
                str = "enrich_sug";
            } else {
                str = "normal_sug";
            }
            C41440e sugType = searchFrom.setSugType(str);
            C52711k.m112236a((Object) sugType, "param");
            C28116e.m66922a(1, sugType);
            this.f75091a.mo58263a(sugType);
            C28572bm bmVar = this.f75091a;
            SearchSugEntity searchSugEntity = this.f75092b;
            String str3 = this.f75093c;
            int i = this.f75094d;
            String str4 = "search_sug";
            C23089d a = C23089d.m56640a().mo47829a("action_type", "click").mo47826a("order", i).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str3)).mo47829a("sug_keyword", bmVar.f75076e).mo47829a("search_keyword", searchSugEntity.content);
            String str5 = "sug_type";
            if (bmVar.mo58264a(searchSugEntity)) {
                str2 = "enrich_sug";
            } else {
                str2 = "normal_sug";
            }
            C23089d a2 = a.mo47829a(str5, str2);
            C52711k.m112236a((Object) a2, "EventMapBuilder.newBuild…AL_SUG\n                })");
            C26890h.m65011a(str4, bmVar.mo58262a(a2).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$e */
    public static final class C28578e implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75095a;

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f75095a.mo58273o());
        }

        C28578e(C28572bm bmVar) {
            this.f75095a = bmVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$f */
    public static final class C28579f extends C1340m {
        C28579f() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            KeyboardUtils.m58184c(recyclerView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$g */
    static final class C28580g extends C52712l implements C52670a<SearchHistoryManager> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75096a;

        C28580g(C28572bm bmVar) {
            this.f75096a = bmVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return SearchHistoryManager.inst();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$h */
    static final class C28581h extends C52712l implements C52670a<CopyOnWriteArrayList<SearchHistory>> {

        /* renamed from: a */
        public static final C28581h f75097a = new C28581h();

        C28581h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$i */
    static final class C28582i extends C52712l implements C52670a<C27859bf<SuggestType>> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75098a;

        C28582i(C28572bm bmVar) {
            this.f75098a = bmVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C28572bm bmVar = this.f75098a;
            C27859bf bfVar = new C27859bf(bmVar, null, 2, null);
            bmVar.f75073b = new C27718c(bfVar);
            return bfVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$j */
    static final class C28583j extends C52712l implements C52670a<C27869bh> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75099a;

        C28583j(C28572bm bmVar) {
            this.f75099a = bmVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f75099a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            return new C27869bh(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$k */
    static final class C28584k<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75100a;

        C28584k(C28572bm bmVar) {
            this.f75100a = bmVar;
        }

        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            this.f75100a.f75076e = str;
            SearchSugMobHelper searchSugMobHelper = this.f75100a.f75077j;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.f74609b = str;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bm$l */
    static final class C28585l<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28572bm f75101a;

        C28585l(C28572bm bmVar) {
            this.f75101a = bmVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            this.f75101a.mo58269j();
        }
    }

    /* renamed from: k */
    public static boolean m67784k() {
        return false;
    }

    /* renamed from: q */
    private final C27869bh m67785q() {
        return (C27869bh) this.f75079m.getValue();
    }

    /* renamed from: r */
    private final SearchHistoryManager m67786r() {
        return (SearchHistoryManager) this.f75080n.getValue();
    }

    /* renamed from: s */
    private final CopyOnWriteArrayList<SearchHistory> m67787s() {
        return (CopyOnWriteArrayList) this.f75081o.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C27859bf<SuggestType> mo58265f() {
        return (C27859bf) this.f75078l.getValue();
    }

    /* renamed from: n */
    public abstract String mo58272n();

    /* renamed from: o */
    public abstract int mo58273o();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58275p();
    }

    /* renamed from: p */
    public void mo58275p() {
        if (this.f75085s != null) {
            this.f75085s.clear();
        }
    }

    /* renamed from: c */
    public final int mo56660c() {
        return m67791w();
    }

    /* renamed from: t */
    private final boolean m67788t() {
        RecyclerView recyclerView = this.f75074c;
        if (recyclerView == null) {
            C52711k.m112237a("mListView");
        }
        return recyclerView.getAdapter() instanceof C27718c;
    }

    /* renamed from: w */
    private final int m67791w() {
        int o = mo58273o();
        if (this instanceof C28635cg) {
            o = DynamicTabYellowPointVersion.DEFAULT;
        }
        return SearchHistory.toHistoryType(o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final SearchIntermediateViewModel mo58266g() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f75075d;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("mIntermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* renamed from: v */
    private final List<SearchHistory> m67790v() {
        List<SearchHistory> searchHistoryByType = m67786r().getSearchHistoryByType(m67791w());
        C52711k.m112236a((Object) searchHistoryByType, "mHistoryManager.getSearc…yByType(getHistoryType())");
        return searchHistoryByType;
    }

    /* renamed from: x */
    private final void m67792x() {
        C23089d a = C23089d.m56640a().mo47829a("action_type", "show");
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…ION_TYPE, Mob.Value.SHOW)");
        C26890h.m65011a("search_history", mo58262a(a).f61491a);
    }

    /* renamed from: i */
    public void mo58268i() {
        this.f75082p = new C28153w();
        C28153w wVar = this.f75082p;
        if (wVar == null) {
            C52711k.m112237a("mSugPresenter");
        }
        wVar.mo54800a(this);
    }

    /* renamed from: u */
    private final String m67789u() {
        C41434a aVar = C28950a.m68268a(getActivity()).f75785a;
        String str = "";
        if (aVar == null || TextUtils.isEmpty(aVar.getEnterSearchFrom())) {
            return str;
        }
        String enterSearchFrom = aVar.getEnterSearchFrom();
        if (enterSearchFrom == null) {
            enterSearchFrom = "";
        }
        return enterSearchFrom;
    }

    /* renamed from: y */
    private final void m67793y() {
        C23089d a = C23089d.m56640a().mo47829a("action_type", "show").mo47829a("sug_keyword", this.f75076e).mo47829a("log_pb", C29981aa.m70153a().mo60161a(m67785q().f73220b));
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…am(Mob.Key.LOG_PB, logPb)");
        C26890h.m65011a("search_sug", mo58262a(a).f61491a);
    }

    /* renamed from: a */
    public final void mo56529a() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            if (!activity.isFinishing()) {
                Context context = getContext();
                Context context2 = getContext();
                if (context2 == null) {
                    C52711k.m112234a();
                }
                C10691a.m21545b(context, context2.getString(R.string.c28)).mo19066a();
            }
        }
    }

    /* renamed from: e */
    public final void mo58191e() {
        C23089d a = C23089d.m56640a().mo47829a("action_type", "clear_all");
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…YPE, Mob.Value.CLEAR_ALL)");
        C26890h.m65011a("search_history", mo58262a(a).f61491a);
        if (C41424g.m91240a()) {
            m67786r().clearSearchHistory(SearchHistory.toHistoryType(mo58273o()));
        } else {
            m67786r().clearSearchHistory();
        }
    }

    /* renamed from: h */
    public void mo58267h() {
        C27859bf f = mo58265f();
        C28524b bVar = this;
        C52711k.m112240b(bVar, "handler");
        C28076e eVar = f.f73196c;
        C52711k.m112240b(bVar, "handler");
        eVar.f73758a = bVar;
        C28075d dVar = f.f73195b;
        C52711k.m112240b(bVar, "handler");
        dVar.f73757a = bVar;
        C28077f fVar = f.f73200g;
        C52711k.m112240b(bVar, "handler");
        fVar.f73761b = bVar;
        m67785q().f73221c = this;
    }

    /* renamed from: d */
    public final void mo58190d() {
        C23089d a = C23089d.m56640a().mo47829a("action_type", "show_all");
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…TYPE, Mob.Value.SHOW_ALL)");
        C26890h.m65011a("search_history", mo58262a(a).f61491a);
        C27859bf f = mo58265f();
        List s = m67787s();
        C28079b bVar = C28079b.TYPE_CLEAR_ALL;
        C52711k.m112240b(s, "rawHistoryList");
        C52711k.m112240b(bVar, "last");
        ArrayList arrayList = new ArrayList();
        f.f73200g.mo56495a(s, arrayList, bVar);
        f.mo56280a().mo56286a((List<? extends SearchHistory>) arrayList);
        f.mo56280a().mo56285a(bVar);
    }

    /* renamed from: l */
    public void mo58270l() {
        C23794bh.m58379E().mo58331a().put("search_transfer", Long.valueOf(System.currentTimeMillis()));
        boolean k = m67784k();
        if (k) {
            mo58271m();
        } else {
            m67787s().clear();
            m67787s().addAll(m67790v());
            mo58265f().mo56282a(m67787s(), true);
            RecyclerView recyclerView = this.f75074c;
            if (recyclerView == null) {
                C52711k.m112237a("mListView");
            }
            C27718c cVar = this.f75073b;
            if (cVar == null) {
                C52711k.m112237a("mHeaderAndFooterWrapper");
            }
            recyclerView.setAdapter(cVar);
            if (!m67787s().isEmpty()) {
                m67792x();
            }
        }
        C23794bh.m58379E().mo58335b(k);
        this.f75083q = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo58271m() {
        Fragment fragment;
        C0679r rVar;
        C0654k fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragment = fragmentManager.mo2224a("RNtag_intermediate");
        } else {
            fragment = null;
        }
        this.f75084r = fragment;
        if (this.f75084r == null) {
            this.f75084r = C41428h.f105000a.createRNSingleIntermediateFragment();
            C0654k fragmentManager2 = getFragmentManager();
            if (fragmentManager2 != null) {
                rVar = fragmentManager2.mo2225a();
            } else {
                rVar = null;
            }
            if (rVar != null) {
                Fragment fragment2 = this.f75084r;
                if (fragment2 == null) {
                    C52711k.m112234a();
                }
                rVar.mo2192b(R.id.ceb, fragment2, "RNtag_intermediate").mo2195c();
            }
        }
        C0654k fragmentManager3 = getFragmentManager();
        if (fragmentManager3 != null) {
            C0679r a = fragmentManager3.mo2225a();
            Fragment fragment3 = this.f75084r;
            if (fragment3 == null) {
                C52711k.m112234a();
            }
            a.mo2196c(fragment3).mo2189b();
        }
        RecyclerView recyclerView = this.f75074c;
        if (recyclerView == null) {
            C52711k.m112237a("mListView");
        }
        recyclerView.setAdapter(null);
    }

    public void onResume() {
        super.onResume();
        if (this.f75083q != 0) {
            if (m67788t() && m67787s().size() > 0) {
                m67792x();
            }
            RecyclerView recyclerView = this.f75074c;
            if (recyclerView == null) {
                C52711k.m112237a("mListView");
            }
            if (recyclerView.getAdapter() instanceof C27869bh) {
                RecyclerView recyclerView2 = this.f75074c;
                if (recyclerView2 == null) {
                    C52711k.m112237a("mListView");
                }
                C1322a adapter = recyclerView2.getAdapter();
                if (adapter == null) {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchSugAdapter");
                } else if (((C27869bh) adapter).getItemCount() > 0) {
                    m67793y();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b6, code lost:
        if (r5 == null) goto L_0x00b8;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo58269j() {
        /*
            r9 = this;
            boolean r0 = r9.isViewValid()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            boolean r0 = r9.getUserVisibleHint()
            if (r0 != 0) goto L_0x000f
            goto L_0x0110
        L_0x000f:
            com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel r0 = r9.f75075d
            if (r0 != 0) goto L_0x0018
            java.lang.String r2 = "mIntermediateViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0018:
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.getIntermediateState()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0025
            return r1
        L_0x0025:
            int r2 = r0.intValue()
            r3 = 1
            if (r2 != r3) goto L_0x0031
            r9.mo58270l()
            goto L_0x010f
        L_0x0031:
            int r2 = r0.intValue()
            r4 = 2
            if (r2 != r4) goto L_0x0107
            android.support.v7.widget.RecyclerView r0 = r9.f75074c
            if (r0 != 0) goto L_0x0041
            java.lang.String r1 = "mListView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0041:
            com.ss.android.ugc.aweme.discover.adapter.bh r1 = r9.m67785q()
            android.support.v7.widget.RecyclerView$a r1 = (android.support.p043v7.widget.RecyclerView.C1322a) r1
            r0.setAdapter(r1)
            com.ss.android.ugc.aweme.discover.g.w r0 = r9.f75082p
            if (r0 != 0) goto L_0x0053
            java.lang.String r1 = "mSugPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0053:
            com.ss.android.ugc.aweme.discover.helper.d r0 = r0.f73939i
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.m67787s()
            java.util.List r1 = (java.util.List) r1
            r0.f74022a = r1
            com.ss.android.ugc.aweme.discover.g.w r0 = r9.f75082p
            if (r0 != 0) goto L_0x0066
            java.lang.String r1 = "mSugPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0066:
            java.lang.String r1 = r9.f75076e
            int r2 = r9.mo58273o()
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75134b
            r6 = 0
            if (r2 != r5) goto L_0x0074
            java.lang.String r2 = "general"
            goto L_0x00a6
        L_0x0074:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75135c
            if (r2 != r5) goto L_0x007b
            java.lang.String r2 = "aweme_video"
            goto L_0x00a6
        L_0x007b:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75136d
            if (r2 != r5) goto L_0x0082
            java.lang.String r2 = "user"
            goto L_0x00a6
        L_0x0082:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75138f
            if (r2 != r5) goto L_0x0089
            java.lang.String r2 = "music"
            goto L_0x00a6
        L_0x0089:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75139g
            if (r2 != r5) goto L_0x0090
            java.lang.String r2 = "challenge"
            goto L_0x00a6
        L_0x0090:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75137e
            if (r2 != r5) goto L_0x0097
            java.lang.String r2 = "poi"
            goto L_0x00a6
        L_0x0097:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75140h
            if (r2 != r5) goto L_0x009e
            java.lang.String r2 = "goods"
            goto L_0x00a6
        L_0x009e:
            int r5 = com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca.f75141i
            if (r2 != r5) goto L_0x00a5
            java.lang.String r2 = "live"
            goto L_0x00a6
        L_0x00a5:
            r2 = r6
        L_0x00a6:
            android.support.v4.app.FragmentActivity r5 = r9.getActivity()
            com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel r5 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a.m68268a(r5)
            com.ss.android.ugc.aweme.search.model.a r5 = r5.f75785a
            if (r5 == 0) goto L_0x00b8
            java.lang.String r5 = r5.getGroupId()
            if (r5 != 0) goto L_0x00ba
        L_0x00b8:
            java.lang.String r5 = ""
        L_0x00ba:
            r0.f73935c = r1
            r0.f73936d = r2
            r0.f73937e = r5
            android.os.Handler r1 = r0.f73934b
            java.lang.Runnable r2 = r0.f73938h
            r1.removeCallbacks(r2)
            android.os.Handler r1 = r0.f73934b
            java.lang.Runnable r0 = r0.f73938h
            r7 = 150(0x96, double:7.4E-322)
            r1.postDelayed(r0, r7)
            r9.f75083q = r4
            boolean r0 = m67784k()
            if (r0 == 0) goto L_0x010f
            android.support.v4.app.Fragment r0 = r9.f75084r
            if (r0 != 0) goto L_0x00ea
            android.support.v4.app.k r0 = r9.getFragmentManager()
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = "RNtag_intermediate"
            android.support.v4.app.Fragment r6 = r0.mo2224a(r1)
        L_0x00e8:
            r9.f75084r = r6
        L_0x00ea:
            android.support.v4.app.Fragment r0 = r9.f75084r
            if (r0 == 0) goto L_0x010f
            android.support.v4.app.k r0 = r9.getFragmentManager()
            if (r0 == 0) goto L_0x010f
            android.support.v4.app.r r0 = r0.mo2225a()
            android.support.v4.app.Fragment r1 = r9.f75084r
            if (r1 != 0) goto L_0x00ff
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ff:
            android.support.v4.app.r r0 = r0.mo2193b(r1)
            r0.mo2189b()
            goto L_0x010f
        L_0x0107:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x010f
            r9.f75083q = r1
        L_0x010f:
            return r3
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28572bm.mo58269j():boolean");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo58269j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C23089d mo58262a(C23089d dVar) {
        if (!TextUtils.isEmpty(mo58272n())) {
            dVar.mo47829a("search_type", mo58272n());
        }
        return dVar;
    }

    @C53771m(mo112976b = true)
    public final void onSearchHistoryChangedEvent(C28104l lVar) {
        C52711k.m112240b(lVar, "event");
        m67787s().clear();
        m67787s().addAll(m67790v());
        if (isViewValid() && m67788t()) {
            mo58265f().mo56282a(m67787s(), false);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C0209x a = C0214z.m440a(activity).mo359a(SearchIntermediateViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f75075d = (SearchIntermediateViewModel) a;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f75075d;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("mIntermediateViewModel");
        }
        this.f75076e = (String) searchIntermediateViewModel.getSearchKeyword().getValue();
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f75075d;
        if (searchIntermediateViewModel2 == null) {
            C52711k.m112237a("mIntermediateViewModel");
        }
        C0184k kVar = this;
        searchIntermediateViewModel2.getSearchKeyword().observe(kVar, new C28584k(this));
        SearchIntermediateViewModel searchIntermediateViewModel3 = this.f75075d;
        if (searchIntermediateViewModel3 == null) {
            C52711k.m112237a("mIntermediateViewModel");
        }
        searchIntermediateViewModel3.getIntermediateState().observe(kVar, new C28585l(this));
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            this.f75077j = (SearchSugMobHelper) C0214z.m440a(activity2).mo359a(SearchSugMobHelper.class);
        }
        SearchSugMobHelper searchSugMobHelper = this.f75077j;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.f74609b = this.f75076e;
            C41434a aVar = C28950a.m68268a(getActivity()).f75785a;
            if (aVar != null) {
                str = aVar.getEnterSearchFrom();
            } else {
                str = null;
            }
            searchSugMobHelper.f74610c = str;
            searchSugMobHelper.f74611d = new C28578e(this);
        }
        C23794bh.m58379E().mo58332a("search_transfer_enter_search");
    }

    /* renamed from: a */
    public final void mo56530a(SearchSugResponse searchSugResponse) {
        String str;
        String str2;
        String str3;
        Integer num;
        C52711k.m112240b(searchSugResponse, "response");
        if (isViewValid()) {
            RecyclerView recyclerView = this.f75074c;
            if (recyclerView == null) {
                C52711k.m112237a("mListView");
            }
            if (recyclerView.getAdapter() instanceof C27869bh) {
                m67785q().f73220b = searchSugResponse.requestId;
                C27869bh q = m67785q();
                Collection collection = searchSugResponse.sugList;
                if (collection == null) {
                    collection = new ArrayList();
                }
                if (q.f73219a == null) {
                    q.f73219a = new ArrayList();
                }
                q.f73219a.clear();
                q.f73219a.addAll(collection);
                m67785q().notifyDataSetChanged();
                if (!C9376b.m18558a((Collection<T>) searchSugResponse.sugList)) {
                    m67793y();
                    String a = C29981aa.m70153a().mo60161a(m67785q().f73220b);
                    C23089d a2 = C23089d.m56640a().mo47829a("raw_query", this.f75076e);
                    String str4 = "info";
                    RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
                    String str5 = null;
                    if (recommendWordMob != null) {
                        str = recommendWordMob.getInfo();
                    } else {
                        str = null;
                    }
                    C23089d a3 = a2.mo47829a(str4, str).mo47829a("sug_session_id", "");
                    String str6 = "impr_id";
                    LogPbBean logPbBean = searchSugResponse.logPb;
                    if (logPbBean != null) {
                        str2 = logPbBean.getImprId();
                    } else {
                        str2 = null;
                    }
                    C23089d a4 = a3.mo47829a(str6, str2).mo47829a("log_pb", a);
                    String str7 = "search_position";
                    C52711k.m112240b(this, "fragment");
                    if (C41431k.f105004a.isSearchResultActivity(getActivity())) {
                        int o = mo58273o();
                        if (o == C28608ca.f75134b) {
                            str3 = "general";
                        } else if (o == C28608ca.f75135c) {
                            str3 = "video";
                        } else if (o == C28608ca.f75136d) {
                            str3 = "user";
                        } else if (o == C28608ca.f75138f) {
                            str3 = "music";
                        } else if (o == C28608ca.f75139g) {
                            str3 = "challenge";
                        } else if (o == C28608ca.f75137e) {
                            str3 = "poi";
                        } else if (o == C28608ca.f75140h) {
                            str3 = "goods";
                        } else if (o == C28608ca.f75141i) {
                            str3 = CustomActionPushReceiver.f104061f;
                        } else {
                            str3 = null;
                        }
                    } else {
                        str3 = "discovery";
                    }
                    Map<String, String> map = a4.mo47829a(str7, str3).f61491a;
                    C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
                    int size = searchSugResponse.sugList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = searchSugResponse.sugList.get(i);
                        C52711k.m112236a(obj, "response.sugList[i]");
                        ((SearchSugEntity) obj).extraParam = map;
                    }
                    C28377e eVar = new C28377e();
                    List<SearchSugEntity> list = searchSugResponse.sugList;
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    } else {
                        num = null;
                    }
                    C28377e a5 = eVar.mo56797a(num);
                    RecommendWordMob recommendWordMob2 = searchSugResponse.recommendWordMob;
                    if (recommendWordMob2 != null) {
                        str5 = recommendWordMob2.getWordsSource();
                    }
                    ((C28377e) a5.mo56798a(str5).mo48070a(map)).mo48076e();
                }
                SearchSugMobHelper searchSugMobHelper = this.f75077j;
                if (searchSugMobHelper != null) {
                    searchSugMobHelper.f74608a = searchSugResponse.logPb;
                }
                SearchSugMobHelper searchSugMobHelper2 = this.f75077j;
                if (searchSugMobHelper2 != null) {
                    searchSugMobHelper2.mo56835a(searchSugResponse.sugList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58263a(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        SearchIntermediateViewModel searchIntermediateViewModel = this.f75075d;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.openSearch(eVar);
    }

    /* renamed from: a */
    public final boolean mo58264a(SearchSugEntity searchSugEntity) {
        if (m67785q().f73223e != 0) {
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo != null && sugExtraInfo.isRichSug()) {
                return true;
            }
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo58268i();
        mo58269j();
    }

    /* renamed from: a */
    public final void mo58188a(SearchHistory searchHistory, int i) {
        C52711k.m112240b(searchHistory, "history");
        Runnable cVar = new C28576c(this, searchHistory, i);
        C41419f fVar = C41419f.f104984a;
        Fragment fragment = this;
        String u = m67789u();
        String str = "search_history";
        String str2 = searchHistory.keyword;
        C52711k.m112236a((Object) str2, "history.keyword");
        String n = mo58272n();
        if (n == null) {
            n = "";
        }
        fVar.mo84097a(fragment, u, str, cVar, false, str2, n, Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo58189b(SearchHistory searchHistory, int i) {
        C52711k.m112240b(searchHistory, "history");
        if (i >= 0 && i < m67787s().size()) {
            C23089d a = C23089d.m56640a().mo47829a("action_type", "clear").mo47826a("order", i).mo47829a("search_keyword", searchHistory.keyword);
            C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
            C26890h.m65011a("search_history", mo58262a(a).f61491a);
            m67786r().deleteSearchHistory(searchHistory);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.brx, viewGroup, false);
        C52711k.m112236a((Object) inflate, "root");
        C52711k.m112240b(inflate, "view");
        View findViewById = inflate.findViewById(R.id.caf);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.recycler_view)");
        this.f75074c = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f75074c;
        if (recyclerView == null) {
            C52711k.m112237a("mListView");
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f75074c;
        if (recyclerView2 == null) {
            C52711k.m112237a("mListView");
        }
        Drawable drawable = getResources().getDrawable(R.drawable.dtb);
        C52711k.m112236a((Object) drawable, "resources.getDrawable(R.…tion_search_intermediate)");
        recyclerView2.mo4798a((C1331h) new C28574b(drawable));
        RecyclerView recyclerView3 = this.f75074c;
        if (recyclerView3 == null) {
            C52711k.m112237a("mListView");
        }
        recyclerView3.mo4801a((C1340m) new C28579f());
        mo58267h();
        return inflate;
    }

    /* renamed from: a */
    public final void mo56659a(SearchSugEntity searchSugEntity, String str, int i) {
        C52711k.m112240b(searchSugEntity, "entity");
        C52711k.m112240b(str, "requestId");
        Runnable dVar = new C28577d(this, searchSugEntity, str, i);
        C41419f fVar = C41419f.f104984a;
        Fragment fragment = this;
        String u = m67789u();
        String str2 = "search_sug";
        String str3 = searchSugEntity.content;
        C52711k.m112236a((Object) str3, "entity.content");
        String n = mo58272n();
        if (n == null) {
            n = "";
        }
        fVar.mo84097a(fragment, u, str2, dVar, false, str3, n, Boolean.valueOf(true));
    }
}
