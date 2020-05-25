package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.design.widget.AppBarLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10725e;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28382ac;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.mob.C28395am;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y.C28422b;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p683ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28102j;
import com.p683ss.android.ugc.aweme.discover.p1643e.C28109a;
import com.p683ss.android.ugc.aweme.discover.p1643e.C28109a.C28110a;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28114c;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28525az.C28526a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28531a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28532b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28532b.C28533a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28534c;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a;
import com.p683ss.android.ugc.aweme.discover.widget.C28980c;
import com.p683ss.android.ugc.aweme.discover.widget.C28981d;
import com.p683ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import com.p683ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.search.C41419f;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.aweme.search.performance.C41443a;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47728bo;
import com.p683ss.android.ugc.aweme.utils.C47729bp.C47730a;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bj */
public abstract class C28550bj<D> extends C28525az implements C26846a, C26877c<D>, C28483al, C28980c {

    /* renamed from: y */
    static final /* synthetic */ C52767h[] f75023y = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "mDoubleBallLoadingView", "getMDoubleBallLoadingView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "mAppBarLayout", "getMAppBarLayout()Landroid/support/design/widget/AppBarLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "mGuideSearchBarView", "getMGuideSearchBarView()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "mSearchFilterView", "getMSearchFilterView()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "searchFilterViewHolder", "getSearchFilterViewHolder()Lcom/ss/android/ugc/aweme/discover/filter/SearchFilterViewHolder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "mCorrectContainer", "getMCorrectContainer()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28550bj.class), "statusViewFactory", "getStatusViewFactory()Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;"))};

    /* renamed from: A */
    protected DmtStatusView f75024A;

    /* renamed from: B */
    protected DoubleBallSwipeRefreshLayout f75025B;

    /* renamed from: C */
    protected FrameLayout f75026C;

    /* renamed from: D */
    protected final C52668f f75027D = C28571bl.m67783a(new C28557g(this));

    /* renamed from: E */
    public C28719z f75028E;

    /* renamed from: F */
    final C52668f f75029F = C28571bl.m67783a(new C28558h(this));

    /* renamed from: G */
    public C41440e f75030G;

    /* renamed from: H */
    public C26840g<D> f75031H;

    /* renamed from: I */
    public C27718c f75032I;

    /* renamed from: J */
    public boolean f75033J = true;

    /* renamed from: K */
    public boolean f75034K = true;

    /* renamed from: L */
    long f75035L;

    /* renamed from: M */
    public boolean f75036M;

    /* renamed from: O */
    private final C52668f f75037O = C28571bl.m67783a(new C28555e(this));

    /* renamed from: P */
    private SearchCorrectHeadView f75038P;

    /* renamed from: Q */
    private SearchStateViewModel f75039Q;

    /* renamed from: R */
    private QueryCorrectInfo f75040R;

    /* renamed from: S */
    private long f75041S;

    /* renamed from: T */
    private MusicPlayHelper f75042T;

    /* renamed from: U */
    private SearchEnterViewModel f75043U;

    /* renamed from: V */
    private final C52668f f75044V = C28571bl.m67783a(new C28568q(this));

    /* renamed from: W */
    private HashMap f75045W;

    /* renamed from: a */
    private final C52668f f75046a = C28571bl.m67783a(new C28556f(this));

    /* renamed from: b */
    private final C52668f f75047b = C28571bl.m67783a(new C28554d(this));

    /* renamed from: c */
    private String f75048c = "";

    /* renamed from: d */
    private final C52668f f75049d = C52732g.m112285a(new C28566p(this));

    /* renamed from: z */
    protected RecyclerView f75050z;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$a */
    static final class C28551a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75051a;

        C28551a(C28550bj bjVar) {
            this.f75051a = bjVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f75051a.isViewValid()) {
                return;
            }
            if (this.f75051a.mo58246t().mo19217k() || this.f75051a.mo58246t().mo19218l() || this.f75051a.mo58246t().mo19219m()) {
                this.f75051a.f75033J = true;
                this.f75051a.m67729a(false, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$b */
    static final class C28552b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75052a;

        C28552b(C28550bj bjVar) {
            this.f75052a = bjVar;
        }

        public final void run() {
            if (this.f75052a.isViewValid()) {
                this.f75052a.mo58247u().setRefreshing(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$c */
    static final class C28553c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75053a;

        C28553c(C28550bj bjVar) {
            this.f75053a = bjVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75053a.mo56552a(0, (C41412a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$d */
    static final class C28554d extends C52712l implements C52670a<AppBarLayout> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75054a;

        C28554d(C28550bj bjVar) {
            this.f75054a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AppBarLayout) this.f75054a.mo56545a((int) R.id.cin);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$e */
    static final class C28555e extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75055a;

        C28555e(C28550bj bjVar) {
            this.f75055a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f75055a.mo56545a((int) R.id.a0x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$f */
    static final class C28556f extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75056a;

        C28556f(C28550bj bjVar) {
            this.f75056a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewStub viewStub = (ViewStub) this.f75056a.getView().findViewById(R.id.e61);
            C52711k.m112236a((Object) viewStub, "double_ball_loading_view_stub");
            viewStub.setLayoutInflater(new C41443a(this.f75056a.getContext()));
            return ((ViewStub) this.f75056a.getView().findViewById(R.id.e61)).inflate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$g */
    static final class C28557g extends C52712l implements C52670a<GuideSearchHeadView> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75057a;

        C28557g(C28550bj bjVar) {
            this.f75057a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            GuideSearchHeadView guideSearchHeadView = (GuideSearchHeadView) this.f75057a.mo56545a((int) R.id.an6);
            guideSearchHeadView.setItemClickListener(this.f75057a);
            return guideSearchHeadView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$h */
    static final class C28558h extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75058a;

        C28558h(C28550bj bjVar) {
            this.f75058a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f75058a.mo56545a((int) R.id.afn);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$i */
    public static final class C28559i extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75059a;

        C28559i(C28550bj bjVar) {
            this.f75059a = bjVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            this.f75059a.mo58237a(recyclerView, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$j */
    public static final class C28560j implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75060a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f75061b;

        public final void onGlobalLayout() {
            if (this.f75060a.aa_() && this.f75060a.mo58243a(this.f75061b)) {
                this.f75061b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        C28560j(C28550bj bjVar, RecyclerView recyclerView) {
            this.f75060a = bjVar;
            this.f75061b = recyclerView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$k */
    static final class C28561k<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75062a;

        C28561k(C28550bj bjVar) {
            this.f75062a = bjVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (!this.f75062a.f75034K && num.intValue() == 2) {
                    this.f75062a.f75034K = true;
                    if (this.f75062a.f75033J) {
                        this.f75062a.m67729a(false, false);
                    }
                } else if (num.intValue() != 2) {
                    this.f75062a.f75034K = false;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$l */
    static final class C28562l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75063a;

        C28562l(C28550bj bjVar) {
            this.f75063a = bjVar;
        }

        public final void run() {
            if (this.f75063a.f75036M) {
                this.f75063a.mo58231C();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$m */
    static final class C28563m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75064a;

        C28563m(C28550bj bjVar) {
            this.f75064a = bjVar;
        }

        public final void run() {
            C28116e.f73841c.mo56523b(this.f75064a.f74958j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$n */
    static final class C28564n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75065a;

        C28564n(C28550bj bjVar) {
            this.f75065a = bjVar;
        }

        public final void run() {
            if (this.f75065a.isViewValid()) {
                this.f75065a.mo58248v().setExpanded(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$o */
    static final class C28565o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75066a;

        C28565o(C28550bj bjVar) {
            this.f75066a = bjVar;
        }

        public final void run() {
            String str;
            String str2;
            C28550bj bjVar = this.f75066a;
            long currentTimeMillis = System.currentTimeMillis() - bjVar.f75035L;
            if (currentTimeMillis > 0 && currentTimeMillis <= 15000) {
                if (C52711k.m112239a((Object) bjVar.mo56549l(), (Object) "general_search")) {
                    str2 = "general_search";
                    str = "general";
                } else {
                    str2 = "search_result";
                    str = bjVar.mo56549l();
                }
                C26890h.m65011a("search_duration", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("enter_method", bjVar.f74964p).mo47829a("search_keyword", bjVar.f74960l).mo47827a("duration", currentTimeMillis).mo47829a("search_type", str).mo47829a("search_id", bjVar.f74959k.mo56236c()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(bjVar.f74959k.mo56236c())).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$p */
    static final class C28566p extends C52712l implements C52670a<C28109a> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75067a;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$p$a */
        public static final class C28567a implements C28110a {

            /* renamed from: a */
            final /* synthetic */ C28566p f75068a;

            C28567a(C28566p pVar) {
                this.f75068a = pVar;
            }
        }

        C28566p(C28550bj bjVar) {
            this.f75067a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C28109a aVar = new C28109a((FrameLayout) this.f75067a.f75029F.getValue(), new C28567a(this));
            aVar.mo56506a(false);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$q */
    static final class C28568q extends C52712l implements C52670a<C28534c> {

        /* renamed from: a */
        final /* synthetic */ C28550bj f75069a;

        C28568q(C28550bj bjVar) {
            this.f75069a = bjVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f75069a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "context!!");
            C28550bj bjVar = this.f75069a;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(bjVar, "searchFragment");
            return new C28534c(context, bjVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bj$r */
    static final class C28569r implements Runnable {

        /* renamed from: a */
        public static final C28569r f75070a = new C28569r();

        C28569r() {
        }

        public final void run() {
        }
    }

    /* renamed from: k */
    private final FrameLayout mo56557k() {
        return (FrameLayout) this.f75037O.getValue();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        m67724K();
    }

    /* renamed from: a */
    public View mo56545a(int i) {
        if (this.f75045W == null) {
            this.f75045W = new HashMap();
        }
        View view = (View) this.f75045W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75045W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56546a(String str);

    /* renamed from: a */
    public void mo56555a(List<GuideSearchWord> list) {
    }

    public final void aS_() {
        m67724K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo56664b(boolean z);

    /* renamed from: b_ */
    public abstract boolean mo56547b_(boolean z);

    /* renamed from: c */
    public void mo47029c(List<? extends D> list, boolean z) {
        C52711k.m112240b(list, "list");
    }

    /* renamed from: j */
    public void mo56548j() {
        if (this.f75045W != null) {
            this.f75045W.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo56568m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo56550n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo56551o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo56558p() {
        return true;
    }

    /* renamed from: r */
    public final C41440e mo58148r() {
        return this.f74958j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final AppBarLayout mo58248v() {
        return (AppBarLayout) this.f75047b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C28109a mo58249w() {
        return (C28109a) this.f75049d.getValue();
    }

    /* renamed from: z */
    public final C28534c mo58252z() {
        return (C28534c) this.f75044V.getValue();
    }

    /* renamed from: a */
    public final void mo58239a(C26840g<D> gVar) {
        C52711k.m112240b(gVar, "<set-?>");
        this.f75031H = gVar;
    }

    /* renamed from: a */
    public final void mo58240a(C27718c cVar) {
        C52711k.m112240b(cVar, "<set-?>");
        this.f75032I = cVar;
    }

    /* renamed from: a */
    public void mo56554a(C41440e eVar) {
        String str;
        C52711k.m112240b(eVar, "param");
        this.f74957e = eVar.copy();
        this.f74959k.f73039b = this.f74957e;
        C41440e eVar2 = this.f74957e;
        if (eVar2 != null) {
            eVar2.setIndex(this.f74966r);
        }
        String keyword = eVar.getKeyword();
        C52711k.m112236a((Object) keyword, "param.keyword");
        C52711k.m112240b(keyword, "<set-?>");
        this.f74960l = keyword;
        this.f74963o = eVar.getSearchFrom();
        boolean z = true;
        if (8 == this.f74963o) {
            this.f74967s = 0;
        } else {
            this.f74967s = 1;
        }
        CharSequence enterMethod = eVar.getEnterMethod();
        if (!(enterMethod == null || enterMethod.length() == 0)) {
            z = false;
        }
        if (!z) {
            str = eVar.getEnterMethod();
            C52711k.m112236a((Object) str, "param.enterMethod");
        } else {
            str = eVar.getEnterFrom();
            C52711k.m112236a((Object) str, "param.enterFrom");
        }
        mo58193b(str);
        if (this.f74963o == 2 || this.f74963o == 5) {
            String keyword2 = eVar.getKeyword();
            C52711k.m112236a((Object) keyword2, "param.keyword");
            C52711k.m112240b(keyword2, "<set-?>");
            this.f74961m = keyword2;
            return;
        }
        if (this.f74963o == 3) {
            this.f75048c = eVar.getSugType();
        }
    }

    /* renamed from: a */
    public final boolean mo58243a(RecyclerView recyclerView) {
        C0794k a = C47849eh.m103495a(recyclerView);
        if (!(a.f2711a == null || a.f2712b == null)) {
            Integer num = (Integer) a.f2711a;
            if (num == null || num.intValue() != -1) {
                Integer num2 = (Integer) a.f2712b;
                if (num2 == null || num2.intValue() != -1) {
                    F f = a.f2711a;
                    if (f == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) f, "range.first!!");
                    int intValue = ((Number) f).intValue();
                    S s = a.f2712b;
                    if (s == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) s, "range.second!!");
                    m67726a(intValue, ((Number) s).intValue());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58242a(String str, String str2, String str3, boolean z, C26112af afVar) {
        C52711k.m112240b(str, "labelName");
        C52711k.m112240b(str3, "keyword");
        if (this.f74962n != C28608ca.f75134b) {
            C28395am.m67395b(this.f74962n);
        }
        C28382ac acVar = new C28382ac();
        if (C52711k.m112239a((Object) str, (Object) "general_search")) {
            str = "general";
        }
        acVar.f74522a = str;
        acVar.f74523b = str3;
        acVar.f74525d = this.f74961m;
        acVar.f74524c = this.f74963o;
        acVar.f74534m = this.f74964p;
        C41440e eVar = this.f74958j;
        C41434a aVar = null;
        acVar.f74535n = eVar != null ? eVar.getEnterMethod() : null;
        acVar.f74526e = str2;
        acVar.f74528g = z;
        acVar.f74529h = afVar;
        SearchEnterViewModel searchEnterViewModel = this.f75043U;
        if (searchEnterViewModel != null) {
            aVar = searchEnterViewModel.f75785a;
        }
        acVar.f74527f = aVar;
        acVar.f74531j = C28381ab.m67360e();
        acVar.f74530i = this.f74966r;
        acVar.f74532k = this.f75048c;
        acVar.f74536o = C28381ab.m67353a();
        acVar.f74538q = this.f74958j;
        acVar.f74533l = C28395am.m67393a();
        acVar.f74537p = C28395am.m67396c(this.f74962n);
        C28390aj.m67372a(acVar);
        C28395am.m67392a(false);
        C28381ab.m67352a(false);
        C28381ab.m67355b(this.f74966r);
    }

    /* renamed from: a */
    public void mo47018a(List<? extends D> list, boolean z) {
        C52711k.m112240b(list, "list");
        if (isViewValid()) {
            mo56559q();
            mo58250x().mo54798c(true);
            if (!z) {
                mo58250x().an_();
            } else {
                mo58250x().ao_();
            }
            DmtStatusView dmtStatusView = this.f75024A;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19209d();
            mo58250x().mo50303a(list);
            mo58236I();
            View view = getView();
            if (view == null) {
                C52711k.m112234a();
            }
            view.requestLayout();
            mo56664b(true);
        }
    }

    /* renamed from: a */
    public final void mo58147a(SearchPreventSuicide searchPreventSuicide) {
        if (searchPreventSuicide != null) {
            C47718bf.m103288a(searchPreventSuicide);
        }
    }

    /* renamed from: a */
    public final void mo58146a(SearchApiResult searchApiResult) {
        View view = getView();
        if (view != null) {
            C52711k.m112236a((Object) view, "it");
            C28387a.m67364a(view, this.f74959k);
            C41440e eVar = this.f74959k.f73039b;
            if (eVar != null) {
                C41440e eVar2 = this.f74959k.f73039b;
                eVar.setCurrentSearchKeyword(eVar2 != null ? eVar2.getKeyword() : null);
            }
        }
        this.f74959k.f73040c = searchApiResult;
    }

    /* renamed from: a */
    public final void mo58145a(QueryCorrectInfo queryCorrectInfo) {
        if (isViewValid()) {
            this.f75040R = queryCorrectInfo;
            if (queryCorrectInfo == null) {
                SearchCorrectHeadView searchCorrectHeadView = this.f75038P;
                if (searchCorrectHeadView != null) {
                    searchCorrectHeadView.setVisibility(8);
                }
                return;
            }
            if (this.f75038P == null) {
                Context context = getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "context!!");
                this.f75038P = new SearchCorrectHeadView(context);
                FrameLayout k = mo56557k();
                SearchCorrectHeadView searchCorrectHeadView2 = this.f75038P;
                if (searchCorrectHeadView2 == null) {
                    C52711k.m112234a();
                }
                k.addView(searchCorrectHeadView2);
            }
            SearchCorrectHeadView searchCorrectHeadView3 = this.f75038P;
            if (searchCorrectHeadView3 == null) {
                C52711k.m112234a();
            }
            searchCorrectHeadView3.mo58547a(queryCorrectInfo, this.f74960l);
        }
    }

    /* renamed from: a */
    public final void mo58144a(C26112af afVar) {
        if (!(afVar == null || afVar.getEasterEggInfo() == null)) {
            if (mo56547b_(true)) {
                C26136q easterEggInfo = afVar.getEasterEggInfo();
                C52711k.m112236a((Object) easterEggInfo, "searchAdInfo.easterEggInfo");
                if (easterEggInfo.isH5()) {
                    C23794bh.m58407u().mo46885a(getContext(), afVar);
                    return;
                }
            }
            C25930g gVar = new C25930g();
            gVar.setEasterEggInfo(afVar.getEasterEggInfo());
            gVar.setKeyWords(this.f74960l);
            gVar.setEnterFrom(this.f74965q);
            gVar.setEnterMethod(this.f74964p);
            C23794bh.m58407u().mo46884a((Context) getActivity(), gVar, -1);
        }
    }

    /* renamed from: a */
    public final void mo58241a(GuideSearchWord guideSearchWord) {
        C52711k.m112240b(guideSearchWord, "guideSearchWord");
        if (this.f74957e != null) {
            C41440e eVar = this.f74957e;
            if (eVar == null) {
                C52711k.m112234a();
            }
            String guideSearchBaseWord = eVar.getGuideSearchBaseWord();
            if (TextUtils.isEmpty(guideSearchBaseWord)) {
                guideSearchBaseWord = guideSearchWord.getWord();
            } else if (!guideSearchWord.isAllTab()) {
                StringBuilder sb = new StringBuilder();
                sb.append(guideSearchBaseWord);
                sb.append(' ');
                sb.append(guideSearchWord);
                guideSearchBaseWord = sb.toString();
            }
            C41440e keyword = new C41440e().setKeyword(guideSearchBaseWord);
            C41440e eVar2 = this.f74957e;
            if (eVar2 == null) {
                C52711k.m112234a();
            }
            C41440e searchFrom = keyword.setGuideSearchBaseWord(eVar2.getGuideSearchBaseWord()).setSearchFrom(9);
            C52711k.m112236a((Object) searchFrom, "param");
            searchFrom.setIndex(this.f74966r);
            C28116e.m66922a(2, searchFrom);
            mo58192b(searchFrom);
        }
    }

    /* renamed from: J */
    private void mo58297J() {
        mo58250x().mo50303a(null);
    }

    /* renamed from: L */
    private final void m67725L() {
        new Handler().post(new C28565o(this));
    }

    /* renamed from: F */
    public final void mo58233F() {
        mo58238a(mo58252z().mo58213a());
        mo58236I();
    }

    /* renamed from: H */
    public final void mo58235H() {
        mo58249w().mo56506a(true);
        m67725L();
    }

    public void aJ_() {
        if (isViewValid()) {
            mo58233F();
            mo58236I();
        }
    }

    public final void ar_() {
        if (isViewValid()) {
            mo56568m();
        }
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            mo58250x().am_();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        C47718bf.m103291d(this);
        mo56548j();
    }

    public void onResume() {
        super.onResume();
        this.f75041S = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final RecyclerView mo58245s() {
        RecyclerView recyclerView = this.f75050z;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final DmtStatusView mo58246t() {
        DmtStatusView dmtStatusView = this.f75024A;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        return dmtStatusView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final DoubleBallSwipeRefreshLayout mo58247u() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f75025B;
        if (doubleBallSwipeRefreshLayout == null) {
            C52711k.m112237a("mRefreshLayout");
        }
        return doubleBallSwipeRefreshLayout;
    }

    /* renamed from: x */
    public final C26840g<D> mo58250x() {
        C26840g<D> gVar = this.f75031H;
        if (gVar == null) {
            C52711k.m112237a("mSearchAdapter");
        }
        return gVar;
    }

    /* renamed from: D */
    public static void m67722D() {
        C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
        C26890h.m65011a("search_freq_control_show", C23089d.m56640a().mo47826a("is_login", C47549c.m102978c() ? 1 : 0).f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo58234G() {
        QueryCorrectInfo queryCorrectInfo = this.f75040R;
        if (queryCorrectInfo == null || queryCorrectInfo.getCorrectedLevel() != 2) {
            return this.f74960l;
        }
        QueryCorrectInfo queryCorrectInfo2 = this.f75040R;
        if (queryCorrectInfo2 == null) {
            C52711k.m112234a();
        }
        String correctedKeyword = queryCorrectInfo2.getCorrectedKeyword();
        C52711k.m112236a((Object) correctedKeyword, "mQueryCorrectInfo!!.correctedKeyword");
        return correctedKeyword;
    }

    /* renamed from: I */
    public final void mo58236I() {
        View view = getView();
        if (view != null) {
            view.post(new C28563m(this));
        }
    }

    public void onPause() {
        super.onPause();
        new Handler().postDelayed(new C28562l(this), 500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo56559q() {
        m67725L();
        new Handler().postDelayed(new C28552b(this), 500);
    }

    /* renamed from: y */
    public final int mo58251y() {
        if ((this.f74963o == 2 || this.f74963o == 5) && TextUtils.equals(this.f74961m, this.f74960l)) {
            return C28526a.m67668a();
        }
        return 0;
    }

    /* renamed from: K */
    private void m67724K() {
        RecyclerView recyclerView = this.f75050z;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        if (recyclerView.getChildCount() > 0) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f75025B;
            if (doubleBallSwipeRefreshLayout == null) {
                C52711k.m112237a("mRefreshLayout");
            }
            doubleBallSwipeRefreshLayout.setRefreshing(true);
            return;
        }
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout2 = this.f75025B;
        if (doubleBallSwipeRefreshLayout2 == null) {
            C52711k.m112237a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout2.setRefreshing(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo58230A() {
        C10719a a = C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C28553c(this));
        MtEmptyView a2 = MtEmptyView.m21697a(getContext());
        C52711k.m112236a((Object) a2, "MtEmptyView.newInstance(context)");
        a.mo19231b((View) a2);
        DmtStatusView dmtStatusView = this.f75024A;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.setBuilder(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo58232E() {
        if (mo58250x().f70699x) {
            mo58250x().mo54798c(false);
            mo58250x().notifyDataSetChanged();
        }
        mo58297J();
        DmtStatusView dmtStatusView = this.f75024A;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.mo19214h();
        C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
    }

    /* renamed from: C */
    public final void mo58231C() {
        Integer num;
        String str;
        long uptimeMillis = SystemClock.uptimeMillis() - this.f75041S;
        C41440e eVar = this.f74957e;
        if (eVar != null) {
            num = Integer.valueOf(eVar.getIndex());
        } else {
            num = null;
        }
        if (num != null) {
            int i = this.f74966r;
            C41440e eVar2 = this.f74957e;
            if (eVar2 == null || i != eVar2.getIndex()) {
                str = C28608ca.m67855a(num.intValue());
                C26890h.m65011a("search_session_finish", C23089d.m56640a().mo47827a("duration", uptimeMillis).mo47829a("search_type", C28608ca.m67855a(this.f74966r)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(this.f74959k.mo56236c())).mo47829a("impr_id", this.f74959k.mo56236c()).mo47829a("next_tab", str).f61491a);
            }
        }
        str = "";
        C26890h.m65011a("search_session_finish", C23089d.m56640a().mo47827a("duration", uptimeMillis).mo47829a("search_type", C28608ca.m67855a(this.f74966r)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(this.f74959k.mo56236c())).mo47829a("impr_id", this.f74959k.mo56236c()).mo47829a("next_tab", str).f61491a);
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
        C52711k.m112240b(exc, "e");
        m67730d(exc);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (isViewValid()) {
            m67730d(exc);
            mo58236I();
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (isViewValid()) {
            mo56559q();
            mo58250x().co_();
        }
    }

    /* renamed from: d */
    private void m67730d(Exception exc) {
        C52711k.m112240b(exc, "e");
        C10722c a = C28534c.m67702a(mo58252z(), null, exc, 1, null);
        if (a != null) {
            mo58238a(a);
            return;
        }
        C22971a.m56493a(getContext(), (Throwable) exc);
        mo58233F();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        m67729a(true, false);
        if (z) {
            C28381ab.f74517h = this.f74966r;
            C28381ab.m67358c(false);
        }
        if (z) {
            this.f75041S = SystemClock.uptimeMillis();
        }
        if (this.f75036M && !z) {
            mo58231C();
        }
        this.f75036M = z;
    }

    /* renamed from: b */
    public final void mo58192b(C41440e eVar) {
        C52711k.m112240b(eVar, "searchResultParam");
        this.f75030G = eVar;
        super.mo58192b(eVar);
        this.f75033J = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable(C28525az.f74952u, eVar);
                return;
            }
            return;
        }
        mo56554a(eVar);
        mo56546a(this.f74960l);
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context, "context!!");
        C41433a.m91253a(context, eVar);
        m67729a(false, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(C28525az.f74952u);
            if (serializable != null) {
                mo56554a((C41440e) serializable);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            }
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C0209x a = C0214z.m440a(activity).mo359a(SearchStateViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f75039Q = (SearchStateViewModel) a;
        SearchStateViewModel searchStateViewModel = this.f75039Q;
        if (searchStateViewModel == null) {
            C52711k.m112237a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new C28561k(this));
    }

    @C53771m
    public void onSearchAfterLogin(C28102j jVar) {
        C52711k.m112240b(jVar, "searchAfterLoginEvent");
        if (jVar.f73793a && isViewValid()) {
            DmtStatusView dmtStatusView = this.f75024A;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            if (!dmtStatusView.mo19217k()) {
                DmtStatusView dmtStatusView2 = this.f75024A;
                if (dmtStatusView2 == null) {
                    C52711k.m112237a("mStatusView");
                }
                if (!dmtStatusView2.mo19218l()) {
                    DmtStatusView dmtStatusView3 = this.f75024A;
                    if (dmtStatusView3 == null) {
                        C52711k.m112237a("mStatusView");
                    }
                    if (!dmtStatusView3.mo19219m()) {
                        return;
                    }
                }
            }
            DmtStatusView dmtStatusView4 = this.f75024A;
            if (dmtStatusView4 == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView4.mo19209d();
            this.f75033J = true;
            m67729a(false, false);
        }
    }

    /* renamed from: a */
    public final void mo58238a(C10722c cVar) {
        boolean z;
        C52711k.m112240b(cVar, "status");
        mo56559q();
        if (mo58250x().f70699x) {
            mo58250x().mo54798c(false);
            mo58250x().notifyDataSetChanged();
        }
        mo58297J();
        C28533a aVar = C28532b.f74988a;
        DmtStatusView dmtStatusView = this.f75024A;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        C52711k.m112240b(dmtStatusView, "statusView");
        C52711k.m112240b(cVar, "status");
        C52711k.m112240b(cVar, "status");
        if (cVar.f28710r == C28531a.EMPTY.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (z || !cVar.f28707o) {
            View b = dmtStatusView.mo19205b(1);
            if (b instanceof C10725e) {
                ((C10725e) b).setStatus(cVar);
            }
            if (b instanceof C28981d) {
                ((C28981d) b).setSearchStatusName(null);
            }
            dmtStatusView.mo19213g();
        } else {
            View b2 = dmtStatusView.mo19205b(2);
            if (b2 != null) {
                ((C10725e) b2).setStatus(cVar);
                dmtStatusView.mo19214h();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
            }
        }
        mo56664b(false);
    }

    /* renamed from: a */
    public final void mo58237a(RecyclerView recyclerView, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        if (i == 0) {
            mo58243a(recyclerView);
        }
    }

    /* renamed from: a */
    private void m67726a(int i, int i2) {
        if (i <= i2 && i >= 0) {
            try {
                if (i2 <= mo58250x().mo50673a().size()) {
                    C28390aj.m67375a(mo58250x().mo50673a().subList(i, i2));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo47026b(List<? extends D> list, boolean z) {
        if (isViewValid()) {
            if (list == null || list.isEmpty()) {
                z = false;
            }
            mo56559q();
            if (!z) {
                mo58250x().an_();
            } else {
                mo58250x().ao_();
            }
            mo58250x().mo50304b(list);
        }
    }

    /* renamed from: a */
    public void mo56552a(int i, C41412a aVar) {
        Object obj;
        this.f74958j = this.f74957e;
        C28390aj.f74551a.mo56822a(mo56549l(), this.f74960l);
        RecyclerView recyclerView = this.f75050z;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        boolean z = false;
        recyclerView.mo4814b(0);
        mo58248v().postDelayed(new C28564n(this), 400);
        MusicPlayHelper musicPlayHelper = this.f75042T;
        if (musicPlayHelper != null) {
            if (!(musicPlayHelper.f73986c == null || musicPlayHelper.f73984a.getValue() == null)) {
                C52847n nVar = (C52847n) musicPlayHelper.f73984a.getValue();
                if (nVar != null && ((Number) nVar.getFirst()).intValue() == 2) {
                    C52847n nVar2 = (C52847n) musicPlayHelper.f73984a.getValue();
                    Long l = null;
                    if (nVar2 != null) {
                        obj = (Long) nVar2.getSecond();
                    } else {
                        obj = null;
                    }
                    Music music = musicPlayHelper.f73986c;
                    if (music != null) {
                        l = Long.valueOf(music.getId());
                    }
                    if (C52711k.m112239a(obj, (Object) l)) {
                        z = true;
                    }
                }
            }
            if (z) {
                MusicPlayHelper musicPlayHelper2 = this.f75042T;
                if (musicPlayHelper2 != null) {
                    musicPlayHelper2.mo56585a();
                }
            }
        }
        C41440e eVar = this.f74957e;
        if (eVar != null) {
            eVar.setFilterOption(aVar);
        }
        this.f75035L = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo56553a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        mo58230A();
        RecyclerView recyclerView = this.f75050z;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        mo56551o();
        mo58240a(new C27718c(mo58250x()));
        mo58250x().f70682s = getResources().getColor(R.color.a1a);
        mo58250x().f70682s = getResources().getColor(R.color.a0_);
        mo58250x().mo54788a((C26846a) this);
        RecyclerView recyclerView2 = this.f75050z;
        if (recyclerView2 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C27718c cVar = this.f75032I;
        if (cVar == null) {
            C52711k.m112237a("mSearchAdapterWrapper");
        }
        recyclerView2.setAdapter(cVar);
        RecyclerView recyclerView3 = this.f75050z;
        if (recyclerView3 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        recyclerView3.setOverScrollMode(2);
        RecyclerView recyclerView4 = this.f75050z;
        if (recyclerView4 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C1327f itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) itemAnimator, "mRecyclerView.itemAnimator!!");
        itemAnimator.f4731l = 0;
        if (VERSION.SDK_INT <= 17) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f75025B;
            if (doubleBallSwipeRefreshLayout == null) {
                C52711k.m112237a("mRefreshLayout");
            }
            doubleBallSwipeRefreshLayout.setDoNotCatchException(true);
        }
        RecyclerView recyclerView5 = this.f75050z;
        if (recyclerView5 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C52711k.m112240b(recyclerView5, "recyclerView");
        recyclerView5.mo4801a((C1340m) new C28559i(this));
        recyclerView5.getViewTreeObserver().addOnGlobalLayoutListener(new C28560j(this, recyclerView5));
        if (mo56558p()) {
            RecyclerView recyclerView6 = this.f75050z;
            if (recyclerView6 == null) {
                C52711k.m112237a("mRecyclerView");
            }
            RecyclerView recyclerView7 = this.f75050z;
            if (recyclerView7 == null) {
                C52711k.m112237a("mRecyclerView");
            }
            recyclerView6.setPadding(0, (int) C9432q.m18687b(recyclerView7.getContext(), 8.0f), 0, 0);
            RecyclerView recyclerView8 = this.f75050z;
            if (recyclerView8 == null) {
                C52711k.m112237a("mRecyclerView");
            }
            recyclerView8.setClipToPadding(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C52711k.m112240b(view, "view");
        View findViewById = view.findViewById(R.id.bc2);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.list_view)");
        this.f75050z = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.csk);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.status)");
        this.f75024A = (DmtStatusView) findViewById2;
        DmtStatusView dmtStatusView = this.f75024A;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.setOnClickListener(new C28551a(this));
        View findViewById3 = view.findViewById(R.id.caw);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.refresh_layout)");
        this.f75025B = (DoubleBallSwipeRefreshLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.a01);
        C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.content_top_container)");
        this.f75026C = (FrameLayout) findViewById4;
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f75025B;
        if (doubleBallSwipeRefreshLayout == null) {
            C52711k.m112237a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setEnabled(false);
        mo56553a(view, bundle);
        mo56550n();
        if (this.f74957e != null) {
            C41440e eVar = this.f74957e;
            if (eVar == null) {
                C52711k.m112234a();
            }
            mo58192b(eVar);
        }
        C47718bf.m103290c(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f75043U = (SearchEnterViewModel) C0214z.m440a(activity).mo359a(SearchEnterViewModel.class);
            this.f75042T = (MusicPlayHelper) C0214z.m440a(activity).mo359a(MusicPlayHelper.class);
        }
        int i = this.f74966r;
        if (i == C28608ca.f75136d) {
            str = "search_user_list";
        } else if (i == C28608ca.f75135c) {
            str = "search_video_list";
        } else if (i == C28608ca.f75137e) {
            str = "search_poi_list";
        } else if (i == C28608ca.f75138f) {
            str = "search_music_list";
        } else if (i == C28608ca.f75139g) {
            str = "search_challenge_list";
        } else {
            String name = getClass().getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1205859379) {
                    if (hashCode != -795130379) {
                        if (hashCode != -48079428) {
                            if (hashCode == 280079325 && name.equals("com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment")) {
                                str = "search_mix_feed_list";
                            }
                        } else if (name.equals("com.ss.android.ugc.aweme.discover.ui.SearchCommodityFragment")) {
                            str = "search_commodity_list";
                        }
                    } else if (name.equals("com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment")) {
                        str = "search_mix_feed_list";
                    }
                } else if (name.equals("com.ss.android.ugc.aweme.discover.commodity.SearchGridCommodityFragment")) {
                    str = "search_commodity_grid";
                }
            }
            str = "";
        }
        if (!C52711k.m112239a((Object) str, (Object) "")) {
            C47728bo a = C47730a.m103327a(str);
            RecyclerView recyclerView = this.f75050z;
            if (recyclerView == null) {
                C52711k.m112237a("mRecyclerView");
            }
            a.mo95020a(recyclerView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m67729a(boolean z, boolean z2) {
        String str;
        String str2;
        C28422b bVar;
        boolean z3;
        boolean z4 = z;
        if (isViewValid() && getUserVisibleHint() && this.f75034K) {
            if (TextUtils.isEmpty(this.f74960l)) {
                mo58233F();
            } else if (this.f75033J) {
                C28116e eVar = C28116e.f73841c;
                int i = this.f74966r;
                C41440e eVar2 = this.f74957e;
                if (eVar2 != null) {
                    C28114c cVar = (C28114c) C28116e.f73839a.get(Integer.valueOf(eVar2.getId()));
                    if (cVar == null) {
                        if (C28116e.f73840b != null) {
                            C28114c cVar2 = C28116e.f73840b;
                            if (cVar2 == null) {
                                C52711k.m112234a();
                            }
                            if (cVar2.f73821b > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                String keyword = eVar2.getKeyword();
                                C28114c cVar3 = C28116e.f73840b;
                                if (cVar3 == null) {
                                    C52711k.m112234a();
                                }
                                if (C52711k.m112239a((Object) keyword, (Object) cVar3.f73837r.getKeyword())) {
                                    cVar = C28116e.f73840b;
                                    Map<Integer, C28114c> map = C28116e.f73839a;
                                    C28114c cVar4 = C28116e.f73840b;
                                    if (cVar4 == null) {
                                        C52711k.m112234a();
                                    }
                                    map.remove(Integer.valueOf(cVar4.f73837r.getId()));
                                    C28114c cVar5 = C28116e.f73840b;
                                    if (cVar5 == null) {
                                        C52711k.m112234a();
                                    }
                                    cVar5.mo56513a(i);
                                    C28114c cVar6 = C28116e.f73840b;
                                    if (cVar6 == null) {
                                        C52711k.m112234a();
                                    }
                                    cVar6.mo56513a(i);
                                    Map<Integer, C28114c> map2 = C28116e.f73839a;
                                    C28114c cVar7 = C28116e.f73840b;
                                    if (cVar7 == null) {
                                        C52711k.m112234a();
                                    }
                                    Integer valueOf = Integer.valueOf(cVar7.f73837r.getId());
                                    C28114c cVar8 = C28116e.f73840b;
                                    if (cVar8 == null) {
                                        C52711k.m112234a();
                                    }
                                    map2.put(valueOf, cVar8);
                                }
                            }
                        }
                        if (cVar == null) {
                            C28114c a = C28116e.m66922a(6, eVar2);
                            if (a != null) {
                                a.mo56513a(i);
                            }
                        }
                    } else {
                        cVar.mo56513a(i);
                    }
                    C28116e.f73840b = null;
                }
                if (C28381ab.f74513d) {
                    mo58193b("click_more_general_list");
                    C41440e eVar3 = this.f74957e;
                    if (eVar3 != null) {
                        eVar3.setEnterMethod("click_more_general_list");
                    }
                } else if (C28381ab.f74517h != this.f74966r) {
                    mo58193b("switch_tab");
                    C41440e eVar4 = this.f74957e;
                    if (eVar4 != null) {
                        eVar4.setEnterMethod("switch_tab");
                    }
                }
                mo56552a(z4 ? 1 : 0, (C41412a) null);
                this.f75033J = false;
                if (C28381ab.f74512c) {
                    this.f74959k.mo56234a(C28422b.FROM_GENERAL_SEARCH);
                    C28381ab.m67356b(false);
                } else {
                    C27797ad adVar = this.f74959k;
                    if (z4) {
                        bVar = C28422b.FROM_OTHERS;
                    } else {
                        bVar = C28422b.FROM_SEARCH_RESULT;
                    }
                    adVar.mo56234a(bVar);
                }
                if (C41424g.m91240a()) {
                    SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(this.f74960l, SearchHistory.toHistoryType(this.f74962n)));
                }
                if (this.f74962n != C28608ca.f75134b) {
                    C28395am.m67391a(this.f74962n);
                }
                C41419f fVar = C41419f.f104984a;
                Fragment fragment = this;
                C41434a aVar = C28950a.m68268a(getActivity()).f75785a;
                String str3 = "";
                if (aVar == null || TextUtils.isEmpty(aVar.getEnterSearchFrom())) {
                    str = str3;
                } else {
                    String enterSearchFrom = aVar.getEnterSearchFrom();
                    if (enterSearchFrom == null) {
                        enterSearchFrom = "";
                    }
                    str = enterSearchFrom;
                }
                if (C28381ab.m67360e() != this.f74966r) {
                    str2 = "switch_tab";
                } else if (this.f74963o == 2) {
                    if (TextUtils.equals(this.f74960l, this.f74961m)) {
                        str2 = this.f74964p;
                    } else {
                        str2 = "normal_search";
                    }
                } else if (this.f74963o == 7 || this.f74963o == 6) {
                    str2 = this.f74964p;
                } else if (this.f74963o == C41440e.FROM_CLICK_BUBBLE) {
                    str2 = "click_bubble";
                } else if (this.f74963o == C41440e.FROM_CLICK_CAPTION) {
                    str2 = "click_caption";
                } else if (this.f74963o == C41440e.FROM_NEARBY) {
                    str2 = "homepage_fresh";
                } else if (C28381ab.m67353a()) {
                    str2 = "click_more_general_list";
                } else if (this.f74963o == 1) {
                    str2 = "search_history";
                } else if (this.f74963o == 3) {
                    str2 = "search_sug";
                } else if (this.f74963o == 4) {
                    str2 = "related_search_keywords";
                } else if (this.f74963o == 5) {
                    str2 = "default_search_keyword";
                } else if (this.f74963o == 9) {
                    str2 = "search_guide";
                } else if (this.f74963o == 16) {
                    str2 = "recom_search";
                } else if (this.f74963o == 21) {
                    str2 = "click_recom";
                } else if (this.f74963o == C41440e.FROM_FILTER) {
                    str2 = "tab_search";
                } else {
                    str2 = "normal_search";
                }
                String str4 = str2;
                fVar.mo84097a(fragment, str, str4, C28569r.f75070a, true, this.f74960l, mo56549l(), Boolean.valueOf(false));
            } else {
                C28381ab.m67355b(this.f74966r);
            }
            if (!TextUtils.isEmpty(this.f74960l)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("key_word", this.f74960l);
                    if (this.f74963o == 2) {
                        if (TextUtils.equals(this.f74960l, this.f74961m)) {
                            jSONObject.put("enter_from", "hot_search");
                            jSONObject.put("enter_method", this.f74964p);
                        } else {
                            jSONObject.put("enter_from", "normal_search");
                        }
                        jSONObject.put("key_word_type", "general_word");
                    } else {
                        if (this.f74963o == 1) {
                            mo58194c("search_history");
                        } else if (this.f74963o == 3) {
                            mo58194c("search_sug");
                        } else {
                            mo58194c("normal_search");
                        }
                        jSONObject.put("enter_from", this.f74965q);
                    }
                } catch (JSONException unused) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("search").setLabelName(mo56549l()).setJsonObject(jSONObject));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.brv, viewGroup, false);
    }
}
