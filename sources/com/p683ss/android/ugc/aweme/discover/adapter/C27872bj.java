package com.p683ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchRichSugExperiment;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.p1651i.p1652a.C28238a;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj */
public final class C27872bj extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73227a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27872bj.class), "mSearchMusicDepentService", "getMSearchMusicDepentService()Lcom/ss/android/ugc/aweme/music/service/ISearchMusicDepentService;"))};

    /* renamed from: f */
    public static final C27873a f73228f = new C27873a(null);

    /* renamed from: b */
    public SearchSugMobHelper f73229b;

    /* renamed from: c */
    final int f73230c = C10181b.m20511a().mo18168a(SearchRichSugExperiment.class, true, "search_rich_sug_type", 31744, 0);

    /* renamed from: d */
    final C52668f f73231d = C52732g.m112285a(C27877e.f73241a);

    /* renamed from: e */
    public final C28238a f73232e;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj$a */
    public static final class C27873a {
        private C27873a() {
        }

        public /* synthetic */ C27873a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj$b */
    public interface C27874b {
        /* renamed from: a */
        void mo56295a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj$c */
    static final class C27875c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27872bj f73233a;

        /* renamed from: b */
        final /* synthetic */ SearchSugEntity f73234b;

        /* renamed from: c */
        final /* synthetic */ String f73235c;

        /* renamed from: d */
        final /* synthetic */ int f73236d;

        C27875c(C27872bj bjVar, SearchSugEntity searchSugEntity, String str, int i) {
            this.f73233a = bjVar;
            this.f73234b = searchSugEntity;
            this.f73235c = str;
            this.f73236d = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73233a.f73232e.mo56659a(this.f73234b, this.f73235c, this.f73236d);
            SearchSugMobHelper searchSugMobHelper = this.f73233a.f73229b;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.mo56834a("history", Integer.valueOf(this.f73236d), "search", this.f73234b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj$d */
    static final class C27876d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27872bj f73237a;

        /* renamed from: b */
        final /* synthetic */ C27874b f73238b;

        /* renamed from: c */
        final /* synthetic */ SearchSugEntity f73239c;

        /* renamed from: d */
        final /* synthetic */ int f73240d;

        C27876d(C27872bj bjVar, C27874b bVar, SearchSugEntity searchSugEntity, int i) {
            this.f73237a = bjVar;
            this.f73238b = bVar;
            this.f73239c = searchSugEntity;
            this.f73240d = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73238b.mo56295a(this.f73237a.getAdapterPosition());
            SearchHistoryManager.inst().deleteSearchHistory(new SearchHistory(this.f73239c.content, this.f73237a.f73232e.mo56660c()));
            SearchSugMobHelper searchSugMobHelper = this.f73237a.f73229b;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.mo56834a("history", Integer.valueOf(this.f73240d), "clear", this.f73239c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bj$e */
    static final class C27877e extends C52712l implements C52670a<ISearchMusicDepentService> {

        /* renamed from: a */
        public static final C27877e f73241a = new C27877e();

        C27877e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin();
        }
    }

    public C27872bj(View view, C28238a aVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(aVar, "mSearchSugHandler");
        super(view);
        this.f73232e = aVar;
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        Context context = view2.getContext();
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            this.f73229b = (SearchSugMobHelper) C0214z.m440a(fragmentActivity).mo359a(SearchSugMobHelper.class);
        }
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.d8j);
        C52711k.m112236a((Object) dmtTextView, "itemView.tv_content");
        dmtTextView.setMaxLines(2);
    }
}
