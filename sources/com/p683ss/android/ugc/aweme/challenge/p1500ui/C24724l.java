package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11791ad;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailProvicer;
import com.p683ss.android.ugc.aweme.challenge.experiment.HashtagBiColAwemeListExperiment;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24685g;
import com.p683ss.android.ugc.aweme.challenge.service.C24599a;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C24785a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p683ss.android.ugc.aweme.detail.C27311a;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.detail.C27388l;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.movie.view.C37195c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShareService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.l */
public class C24724l extends C24637c implements C11791ad<C23473i>, C11872h {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f65469d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mStatusBar", "getMStatusBar()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mTitleBar", "getMTitleBar()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mRecordView", "getMRecordView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mRefreshLayout", "getMRefreshLayout()Lcom/ss/android/ugc/aweme/challenge/ui/ChallengeSwipeRefreshLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mShareButton", "getMShareButton()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mHeaderPlaceHolder", "getMHeaderPlaceHolder()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mHeaderContainer", "getMHeaderContainer()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mJediViewModel", "getMJediViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailJediViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24724l.class), "mTabViews", "getMTabViews()Ljava/util/HashMap;"))};

    /* renamed from: r */
    public static final C24729d f65470r = new C24729d(null);

    /* renamed from: J */
    private final C52668f f65471J = C24753n.m60283a(new C24742p(this));

    /* renamed from: K */
    private final C52668f f65472K = C24753n.m60283a(new C24745s(this));

    /* renamed from: L */
    private final C52668f f65473L = C24753n.m60283a(new C24739m(this));

    /* renamed from: M */
    private final C52668f f65474M = C24753n.m60283a(new C24740n(this));

    /* renamed from: O */
    private final C52668f f65475O = C24753n.m60283a(new C24743q(this));

    /* renamed from: P */
    private final C52668f f65476P = C24753n.m60283a(new C24741o(this));

    /* renamed from: Q */
    private final C52668f f65477Q = C24753n.m60283a(new C24738l(this));

    /* renamed from: R */
    private final C52668f f65478R = C24753n.m60283a(new C24737k(this));

    /* renamed from: S */
    private C24664a f65479S;

    /* renamed from: T */
    private C24685g f65480T;

    /* renamed from: U */
    private C24638d f65481U;

    /* renamed from: V */
    private ChallengeDetail f65482V;

    /* renamed from: W */
    private int f65483W = -1;

    /* renamed from: X */
    private DetailAwemeListFragment f65484X;

    /* renamed from: Y */
    private final lifecycleAwareLazy f65485Y;

    /* renamed from: Z */
    private final C52668f f65486Z;

    /* renamed from: aa */
    private final C52668f f65487aa;

    /* renamed from: ab */
    private float f65488ab;

    /* renamed from: ac */
    private float f65489ac;

    /* renamed from: ad */
    private int f65490ad;

    /* renamed from: ae */
    private HashMap f65491ae;

    /* renamed from: e */
    public C24599a f65492e;

    /* renamed from: j */
    public DetailAwemeListFragment f65493j;

    /* renamed from: k */
    public ChallengeDetailParam f65494k;

    /* renamed from: l */
    public String f65495l;

    /* renamed from: m */
    public Challenge f65496m;

    /* renamed from: n */
    public String f65497n;

    /* renamed from: o */
    public String f65498o = "";

    /* renamed from: p */
    public String f65499p = "";

    /* renamed from: q */
    public C23473i f65500q = new C23473i();

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$a */
    public static final class C24725a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f65501a;

        public C24725a(C52760c cVar) {
            this.f65501a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f65501a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$b */
    public static final class C24726b extends C52712l implements C52682m<ChallengeDetailState, Bundle, ChallengeDetailState> {
        public static final C24726b INSTANCE = new C24726b();

        public C24726b() {
            super(2);
        }

        public final ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, Bundle bundle) {
            C52711k.m112240b(challengeDetailState, "$receiver");
            return challengeDetailState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$c */
    public static final class C24727c extends C52712l implements C52670a<ChallengeDetailJediViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f65502a;

        /* renamed from: b */
        final /* synthetic */ C52670a f65503b;

        /* renamed from: c */
        final /* synthetic */ C52760c f65504c;

        /* renamed from: d */
        final /* synthetic */ C52682m f65505d;

        public C24727c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f65502a = fragment;
            this.f65503b = aVar;
            this.f65504c = cVar;
            this.f65505d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel, java.lang.Object]
          mth insns count: 23
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f65502a
                android.support.v4.app.Fragment r1 = r3.f65502a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f65503b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f65504c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel> r2 = com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.challenge.ui.l$c$1 r1 = new com.ss.android.ugc.aweme.challenge.ui.l$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.C24727c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$d */
    public static final class C24729d {
        private C24729d() {
        }

        public /* synthetic */ C24729d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$e */
    static final class C24730e implements C27388l {

        /* renamed from: a */
        final /* synthetic */ C24724l f65507a;

        C24730e(C24724l lVar) {
            this.f65507a = lVar;
        }

        /* renamed from: a */
        public final void mo50629a(boolean z, int i) {
            if (z && !TextUtils.isEmpty(C24724l.m60240a(this.f65507a).getFromToken())) {
                C23250t v = new C23250t().mo48154t(C24724l.m60242b(this.f65507a)).mo48156v(C24724l.m60243c(this.f65507a).mo50468f());
                String fromToken = C24724l.m60240a(this.f65507a).getFromToken();
                if (fromToken == null) {
                    C52711k.m112234a();
                }
                v.mo48150f(fromToken).mo48076e();
                C24724l lVar = this.f65507a;
                String jSONObject = C24724l.m60243c(this.f65507a).mo50467e().toString();
                C52711k.m112236a((Object) jSONObject, "mHotFragment.requestId.toString()");
                lVar.f65499p = jSONObject;
            }
            if (!z && this.f65507a.mo50614j().mo48780a()) {
                this.f65507a.mo50614j().setRefreshing(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$f */
    static final class C24731f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24724l f65508a;

        /* renamed from: b */
        final /* synthetic */ C52671b f65509b;

        C24731f(C24724l lVar, C52671b bVar) {
            this.f65508a = lVar;
            this.f65509b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                C24599a aVar = this.f65508a.f65492e;
                if (aVar == null) {
                    C52711k.m112237a("mCommerceDelegate");
                }
                C52711k.m112236a((Object) view, "it");
                if (!aVar.mo50421a(view.getId())) {
                    this.f65509b.invoke(view);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$g */
    static final class C24732g implements C23596b {

        /* renamed from: a */
        final /* synthetic */ C24724l f65510a;

        C24732g(C24724l lVar) {
            this.f65510a = lVar;
        }

        /* renamed from: a */
        public final void mo47048a() {
            this.f65510a.mo50611a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$h */
    static final class C24733h extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65511a;

        C24733h(C24724l lVar) {
            this.f65511a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            if (this.f65511a.f65496m != null) {
                C24724l lVar = this.f65511a;
                Context context = lVar.getContext();
                String str = "click_share_button";
                String str2 = "challenge_hot";
                Challenge challenge = lVar.f65496m;
                if (challenge == null) {
                    C52711k.m112234a();
                }
                C26890h.m65005a(context, str, str2, challenge.getCid(), 0);
                C23238h d = new C23238h().mo48086d("challenge_hot");
                String awemeId = C24724l.m60240a(this.f65511a).getAwemeId();
                if (awemeId == null) {
                    awemeId = "";
                }
                d.mo48090g(awemeId).mo48076e();
                C26890h.m65011a("share_challenge", C23089d.m56640a().mo47829a("enter_from", "challenge").mo47829a("group_id", C24724l.m60240a(this.f65511a).getAwemeId()).mo47829a("challenge_id", C24724l.m60242b(this.f65511a)).mo47829a("process_id", this.f65511a.f65498o).f61491a);
                ShareService a = C41979aq.m91946a();
                FragmentActivity activity = this.f65511a.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                a.shareChallenge(activity, this.f65511a.f65496m, this.f65511a.mo50623p(), C24724l.m60242b(this.f65511a), C24724l.m60240a(this.f65511a).isHashTag(), this.f65511a.f65499p, this.f65511a.f65498o);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$i */
    static final class C24734i extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65512a;

        C24734i(C24724l lVar) {
            this.f65512a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            if (C23794bh.m58390d().mo47103a()) {
                C10691a.m21551c((Context) this.f65512a.getActivity(), this.f65512a.getString(R.string.dw2)).mo19066a();
            } else {
                this.f65512a.f65497n = UUID.randomUUID().toString();
                this.f65512a.mo50626s();
                if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().checkIsAlreadyPublished(this.f65512a.getContext())) {
                    final Challenge challenge = this.f65512a.f65496m;
                    if (challenge != null) {
                        FragmentActivity activity = this.f65512a.getActivity();
                        if (!(activity instanceof AmeActivity)) {
                            activity = null;
                        }
                        final AmeActivity ameActivity = (AmeActivity) activity;
                        if (ameActivity != null) {
                            Builder shootWay = new Builder().shootWay("challenge");
                            String str = this.f65512a.f65497n;
                            if (str == null) {
                                C52711k.m112234a();
                            }
                            final Builder musicType = shootWay.creationId(str).challenge(challenge).translationType(3).musicType(1);
                            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader(this) {

                                /* renamed from: a */
                                final /* synthetic */ C24734i f65513a;

                                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
                                    if (r1.isStrongMusic() != false) goto L_0x00e0;
                                 */
                                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
                                    if (r1.isStrongMusic() == false) goto L_0x00df;
                                 */
                                /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0  */
                                /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
                                /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void onLoad(com.p683ss.android.ugc.aweme.services.AsyncAVService r8, long r9) {
                                    /*
                                        r7 = this;
                                        java.lang.String r9 = "service"
                                        p2628d.p2639f.p2641b.C52711k.m112240b(r8, r9)
                                        com.ss.android.ugc.aweme.services.external.IUIService r8 = r8.uiService()
                                        com.ss.android.ugc.aweme.services.external.ui.IRecordService r8 = r8.recordService()
                                        com.ss.android.ugc.aweme.base.AmeActivity r9 = r0
                                        android.content.Context r9 = (android.content.Context) r9
                                        com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r10 = r1
                                        com.ss.android.ugc.aweme.services.external.ui.RecordConfig r10 = r10.build()
                                        com.ss.android.ugc.aweme.discover.model.Challenge r0 = r5
                                        com.ss.android.ugc.aweme.challenge.ui.l$i r1 = r7.f65513a
                                        com.ss.android.ugc.aweme.challenge.ui.l r1 = r1.f65512a
                                        com.ss.android.ugc.aweme.discover.model.Challenge r1 = r5
                                        android.os.Bundle r2 = new android.os.Bundle
                                        r2.<init>()
                                        com.ss.android.ugc.aweme.services.IExternalService r3 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
                                        com.ss.android.ugc.aweme.services.IExternalService r3 = (com.p683ss.android.ugc.aweme.services.IExternalService) r3
                                        com.ss.android.ugc.aweme.services.external.IConfigService r3 = r3.configService()
                                        com.ss.android.ugc.aweme.services.settings.IAVSettingsService r3 = r3.avsettingsConfig()
                                        boolean r3 = r3.enableStatusMode()
                                        int r4 = r1.getStatus()
                                        r5 = 1
                                        r6 = 0
                                        if (r4 != r5) goto L_0x0042
                                        if (r3 == 0) goto L_0x0042
                                        r3 = 1
                                        goto L_0x0043
                                    L_0x0042:
                                        r3 = 0
                                    L_0x0043:
                                        java.lang.String r4 = "extra_to_status"
                                        r2.putBoolean(r4, r3)
                                        if (r3 != 0) goto L_0x005f
                                        java.lang.String r3 = r1.getMvId()
                                        java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                                        if (r3 != 0) goto L_0x005f
                                        java.lang.String r3 = "extra_bind_mv_id"
                                        java.lang.String r4 = r1.getMvId()
                                        r2.putString(r3, r4)
                                    L_0x005f:
                                        java.lang.String r3 = r1.getCid()
                                        java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                                        boolean r3 = android.text.TextUtils.isEmpty(r3)
                                        if (r3 != 0) goto L_0x0074
                                        java.lang.String r3 = "tag_id"
                                        java.lang.String r4 = r1.getCid()
                                        r2.putString(r3, r4)
                                    L_0x0074:
                                        java.util.List r3 = r1.getConnectMusics()
                                        java.util.Collection r3 = (java.util.Collection) r3
                                        boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
                                        if (r3 != 0) goto L_0x00df
                                        java.util.List r3 = r1.getConnectMusics()
                                        java.lang.Object r3 = r3.get(r6)
                                        if (r3 != 0) goto L_0x008b
                                        goto L_0x00df
                                    L_0x008b:
                                        com.ss.android.ugc.aweme.framework.services.IUserService r3 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
                                        com.ss.android.ugc.aweme.framework.services.IUserService r3 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r3
                                        if (r3 == 0) goto L_0x00ad
                                        com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurrentUser()
                                        if (r3 != 0) goto L_0x009a
                                        goto L_0x00ad
                                    L_0x009a:
                                        int r4 = r3.getCommerceUserLevel()
                                        if (r4 <= 0) goto L_0x00a2
                                    L_0x00a0:
                                        r3 = 1
                                        goto L_0x00ae
                                    L_0x00a2:
                                        java.lang.String r3 = r3.getEnterpriseVerifyReason()
                                        boolean r3 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r3)
                                        if (r3 == 0) goto L_0x00ad
                                        goto L_0x00a0
                                    L_0x00ad:
                                        r3 = 0
                                    L_0x00ae:
                                        if (r3 == 0) goto L_0x00d2
                                        java.util.List r3 = r1.getConnectMusics()
                                        java.lang.Object r3 = r3.get(r6)
                                        java.lang.String r4 = "challenge.connectMusics[0]"
                                        p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                        com.ss.android.ugc.aweme.music.model.Music r3 = (com.p683ss.android.ugc.aweme.music.model.Music) r3
                                        boolean r3 = r3.isCommercialMusic()
                                        if (r3 == 0) goto L_0x00df
                                        boolean r3 = r1.isCommerce()
                                        if (r3 != 0) goto L_0x00e0
                                        boolean r3 = r1.isStrongMusic()
                                        if (r3 == 0) goto L_0x00df
                                        goto L_0x00e0
                                    L_0x00d2:
                                        boolean r3 = r1.isCommerce()
                                        if (r3 != 0) goto L_0x00e0
                                        boolean r3 = r1.isStrongMusic()
                                        if (r3 == 0) goto L_0x00df
                                        goto L_0x00e0
                                    L_0x00df:
                                        r5 = 0
                                    L_0x00e0:
                                        if (r5 == 0) goto L_0x00f9
                                        java.lang.String r3 = "music_id"
                                        java.util.List r1 = r1.getConnectMusics()
                                        java.lang.Object r1 = r1.get(r6)
                                        com.ss.android.ugc.aweme.music.model.Music r1 = (com.p683ss.android.ugc.aweme.music.model.Music) r1
                                        if (r1 == 0) goto L_0x00f5
                                        java.lang.String r1 = r1.getMid()
                                        goto L_0x00f6
                                    L_0x00f5:
                                        r1 = 0
                                    L_0x00f6:
                                        r2.putString(r3, r1)
                                    L_0x00f9:
                                        r8.startRecord(r9, r10, r0, r2)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.C24734i.C247351.onLoad(com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
                                }

                                {
                                    this.f65513a = r1;
                                }
                            });
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$j */
    static final class C24736j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24724l f65517a;

        C24736j(C24724l lVar) {
            this.f65517a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65517a.mo50611a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$k */
    static final class C24737k extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65518a;

        C24737k(C24724l lVar) {
            this.f65518a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f65518a.mo50612b((int) R.id.ao4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$l */
    static final class C24738l extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65519a;

        C24738l(C24724l lVar) {
            this.f65519a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f65519a.mo50612b((int) R.id.eam);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$m */
    static final class C24739m extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65520a;

        C24739m(C24724l lVar) {
            this.f65520a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f65520a.mo50612b((int) R.id.csb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$n */
    static final class C24740n extends C52712l implements C52670a<ChallengeSwipeRefreshLayout> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65521a;

        C24740n(C24724l lVar) {
            this.f65521a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ChallengeSwipeRefreshLayout) this.f65521a.mo50612b((int) R.id.b98);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$o */
    static final class C24741o extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65522a;

        C24741o(C24724l lVar) {
            this.f65522a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f65522a.mo50612b((int) R.id.cmr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$p */
    static final class C24742p extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65523a;

        C24742p(C24724l lVar) {
            this.f65523a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f65523a.mo50612b((int) R.id.csm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$q */
    static final class C24743q extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65524a;

        C24743q(C24724l lVar) {
            this.f65524a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f65524a.mo50612b((int) R.id.csv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$r */
    static final class C24744r extends C52712l implements C52670a<HashMap<Integer, View>> {

        /* renamed from: a */
        public static final C24744r f65525a = new C24744r();

        C24744r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$s */
    static final class C24745s extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65526a;

        C24745s(C24724l lVar) {
            this.f65526a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f65526a.mo50612b((int) R.id.d1b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$t */
    static final class C24746t extends C52712l implements C52670a<ChallengeDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65527a;

        C24746t(C24724l lVar) {
            this.f65527a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f65527a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return C24785a.m60319a(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$u */
    static final class C24747u extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65528a;

        C24747u(C24724l lVar) {
            this.f65528a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            FragmentActivity activity = this.f65528a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$v */
    static final class C24748v extends C52712l implements C52682m<C11866f, ChallengeDetail, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65529a;

        C24748v(C24724l lVar) {
            this.f65529a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ChallengeDetail challengeDetail = (ChallengeDetail) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(challengeDetail, "it");
            this.f65529a.mo50610a(challengeDetail);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$w */
    static final class C24749w extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65530a;

        C24749w(C24724l lVar) {
            this.f65530a = lVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f65530a.mo50615k().mo19210d(true);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$x */
    static final class C24750x extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24724l f65531a;

        C24750x(C24724l lVar) {
            this.f65531a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C24724l lVar = this.f65531a;
            if (lVar.isViewValid()) {
                lVar.mo50616l().setVisibility(8);
                lVar.mo50614j().setRefreshing(false);
                lVar.mo50615k().mo19204a(true);
                FragmentActivity activity = lVar.getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C22971a.m56493a((Context) activity, th);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.l$y */
    static final class C24751y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24724l f65532a;

        C24751y(C24724l lVar) {
            this.f65532a = lVar;
        }

        public final void run() {
            ScrollableLayout scrollableLayout = this.f65532a.f72046u;
            if (scrollableLayout != null) {
                scrollableLayout.setMaxScrollHeight(Integer.MAX_VALUE);
            }
        }
    }

    /* renamed from: A */
    private final LinearLayout m60238A() {
        return (LinearLayout) this.f65478R.getValue();
    }

    /* renamed from: C */
    private final ChallengeDetailJediViewModel m60239C() {
        return (ChallengeDetailJediViewModel) this.f65485Y.getValue();
    }

    /* renamed from: w */
    private final View m60244w() {
        return (View) this.f65471J.getValue();
    }

    /* renamed from: x */
    private final View m60245x() {
        return (View) this.f65472K.getValue();
    }

    /* renamed from: y */
    private final View m60246y() {
        return (View) this.f65473L.getValue();
    }

    /* renamed from: z */
    private final ImageView m60247z() {
        return (ImageView) this.f65476P.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final String mo50606a(int i) {
        switch (i) {
            case 0:
                return "challenge";
            case 1:
                return "challenge_fresh";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final View mo50612b(int i) {
        if (this.f65491ae == null) {
            this.f65491ae = new HashMap();
        }
        View view = (View) this.f65491ae.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f65491ae.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50499g() {
        return "challenge";
    }

    /* renamed from: j */
    public final ChallengeSwipeRefreshLayout mo50614j() {
        return (ChallengeSwipeRefreshLayout) this.f65474M.getValue();
    }

    /* renamed from: k */
    public final DmtStatusView mo50615k() {
        return (DmtStatusView) this.f65475O.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final View mo50616l() {
        return (View) this.f65477Q.getValue();
    }

    /* renamed from: n */
    public final int mo50618n() {
        return R.layout.b54;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo50609a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Serializable serializable = bundle2 != null ? bundle2.getSerializable("challenge_detail_param") : null;
        this.f65494k = serializable instanceof ChallengeDetailParam ? (ChallengeDetailParam) serializable : new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, false, false, null, 4095, null);
        ChallengeDetailParam challengeDetailParam = this.f65494k;
        if (challengeDetailParam == null) {
            C52711k.m112237a("mDetailParam");
        }
        String cid = challengeDetailParam.getCid();
        if (cid == null) {
            cid = "";
        }
        this.f65495l = cid;
        ChallengeDetailParam challengeDetailParam2 = this.f65494k;
        if (challengeDetailParam2 == null) {
            C52711k.m112237a("mDetailParam");
        }
        this.f65483W = challengeDetailParam2.getShowTabIndex();
        ChallengeDetailParam challengeDetailParam3 = this.f65494k;
        if (challengeDetailParam3 == null) {
            C52711k.m112237a("mDetailParam");
        }
        String processId = challengeDetailParam3.getProcessId();
        if (processId == null) {
            processId = "";
        }
        this.f65498o = processId;
    }

    /* renamed from: a */
    public final void mo50611a(boolean z) {
        if (mo50615k().mo19210d(true)) {
            ChallengeDetailJediViewModel C = m60239C();
            ChallengeDetailParam challengeDetailParam = this.f65494k;
            if (challengeDetailParam == null) {
                C52711k.m112237a("mDetailParam");
            }
            String cid = challengeDetailParam.getCid();
            ChallengeDetailParam challengeDetailParam2 = this.f65494k;
            if (challengeDetailParam2 == null) {
                C52711k.m112237a("mDetailParam");
            }
            int clickReason = challengeDetailParam2.getClickReason();
            ChallengeDetailParam challengeDetailParam3 = this.f65494k;
            if (challengeDetailParam3 == null) {
                C52711k.m112237a("mDetailParam");
            }
            C.mo50657a(cid, clickReason, challengeDetailParam3.isHashTag());
            List<C27336g> list = this.f72039E;
            if (!z) {
                list = null;
            }
            if (list != null) {
                for (C27336g n : list) {
                    n.mo50473n();
                }
            }
        } else {
            mo50614j().setRefreshing(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0223  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50610a(com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail r14) {
        /*
            r13 = this;
            boolean r0 = r13.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.view.View r0 = r13.mo50616l()
            r1 = 8
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.challenge.ui.ChallengeSwipeRefreshLayout r0 = r13.mo50614j()
            r1 = 0
            r0.setRefreshing(r1)
            if (r14 == 0) goto L_0x0306
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.challenge
            if (r0 != 0) goto L_0x0020
            goto L_0x0306
        L_0x0020:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.challenge
            r13.f65482V = r14
            r13.f65496m = r0
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r2 = r13.f65484X
            if (r2 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r13.f65496m
            r2.mo50459a(r3)
        L_0x002f:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r2 = r13.mo50615k()
            r3 = 1
            r2.mo19208c(r3)
            android.view.View r2 = r13.m60244w()
            r4 = 0
            r2.setAlpha(r4)
            android.view.View r2 = r13.f72048w
            java.lang.String r5 = "mTitleColorCtrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            r2.setAlpha(r4)
            android.widget.TextView r2 = r13.f72047v
            r2.setVisibility(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "#"
            r4.<init>(r5)
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r13.f65496m
            if (r5 != 0) goto L_0x005c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005c:
            java.lang.String r5 = r5.getChallengeName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            android.content.res.Resources r4 = r2.getResources()
            r5 = 2131821815(0x7f1104f7, float:1.9276384E38)
            int r4 = r4.getColor(r5)
            r2.setTextColor(r4)
            if (r2 == 0) goto L_0x02fe
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            r2.setFontType(r4)
            android.view.View r2 = r13.m60246y()
            r2.setEnabled(r3)
            com.ss.android.ugc.aweme.challenge.ui.ChallengeSwipeRefreshLayout r2 = r13.mo50614j()
            r2.setEnabled(r3)
            com.ss.android.ugc.aweme.challenge.ui.header.l r2 = new com.ss.android.ugc.aweme.challenge.ui.header.l
            r5 = 0
            r6 = 0
            r7 = 0
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r13.f65494k
            if (r4 != 0) goto L_0x009f
            java.lang.String r8 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x009f:
            java.lang.String r8 = r4.getEnterFrom()
            java.lang.String r9 = r13.f65498o
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r10 = r13.f65494k
            if (r10 != 0) goto L_0x00ae
            java.lang.String r4 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00ae:
            r11 = 7
            r12 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.challenge.ui.header.g r10 = r13.f65480T
            if (r10 != 0) goto L_0x00bd
            java.lang.String r4 = "mHeaderFactory"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00bd:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r11 = r13.f65482V
            if (r11 != 0) goto L_0x00c4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c4:
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r4)
            java.lang.String r4 = "headerParam"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r11.challenge
            if (r4 == 0) goto L_0x00db
            int r5 = r4.getModuleType()
            if (r5 != r3) goto L_0x00db
            com.ss.android.ugc.aweme.challenge.ui.header.m r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24707m.TYPE_LARGE
            goto L_0x00dd
        L_0x00db:
            com.ss.android.ugc.aweme.challenge.ui.header.m r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24707m.TYPE_NORMAL
        L_0x00dd:
            java.lang.String r6 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            r2.f65421a = r5
            java.lang.String r5 = "challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getModuleType()
            if (r4 != r3) goto L_0x00f2
            com.ss.android.ugc.aweme.challenge.ui.header.c r4 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24679c.TYPE_NO_LINK
            goto L_0x00f4
        L_0x00f2:
            com.ss.android.ugc.aweme.challenge.ui.header.c r4 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24679c.TYPE_LINK
        L_0x00f4:
            java.lang.String r5 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            r2.f65422b = r4
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r11.challenge
            if (r4 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.discover.model.RelatedMediaSourceStruct r4 = r4.getMediaSource()
            goto L_0x0105
        L_0x0104:
            r4 = 0
        L_0x0105:
            if (r4 == 0) goto L_0x0109
            r4 = 1
            goto L_0x010a
        L_0x0109:
            r4 = 0
        L_0x010a:
            if (r4 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.challenge.ui.header.d r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24680d.TYPE_TRANSFORM
            goto L_0x0147
        L_0x010f:
            boolean r4 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a.C24665a.m60178a(r11)
            if (r4 == 0) goto L_0x0118
            com.ss.android.ugc.aweme.challenge.ui.header.d r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24680d.TYPE_TRANSFORM
            goto L_0x0147
        L_0x0118:
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r11.challenge
            if (r4 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.discover.model.InquiryStruct r4 = r4.inquiryStruct
            if (r4 != 0) goto L_0x0121
            goto L_0x0140
        L_0x0121:
            java.lang.String r5 = r4.getOpenUrl()
            boolean r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r5)
            if (r5 != 0) goto L_0x0135
            java.lang.String r5 = r4.getWebUrl()
            boolean r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r5)
            if (r5 == 0) goto L_0x0140
        L_0x0135:
            java.lang.String r4 = r4.getDesc()
            boolean r4 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r4)
            if (r4 == 0) goto L_0x0140
            r1 = 1
        L_0x0140:
            if (r1 == 0) goto L_0x0145
            com.ss.android.ugc.aweme.challenge.ui.header.d r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24680d.TYPE_TRANSFORM
            goto L_0x0147
        L_0x0145:
            com.ss.android.ugc.aweme.challenge.ui.header.d r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24680d.TYPE_NORMAL
        L_0x0147:
            java.lang.String r4 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            r2.f65423c = r1
            d.n<com.ss.android.ugc.aweme.challenge.ui.header.l, ? extends com.ss.android.ugc.aweme.challenge.ui.header.a> r1 = r10.f65337a
            if (r1 == 0) goto L_0x0173
            d.n<com.ss.android.ugc.aweme.challenge.ui.header.l, ? extends com.ss.android.ugc.aweme.challenge.ui.header.a> r1 = r10.f65337a
            if (r1 != 0) goto L_0x0159
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0159:
            java.lang.Object r1 = r1.getFirst()
            com.ss.android.ugc.aweme.challenge.ui.header.l r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24706l) r1
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x0173
            d.n<com.ss.android.ugc.aweme.challenge.ui.header.l, ? extends com.ss.android.ugc.aweme.challenge.ui.header.a> r1 = r10.f65337a
            if (r1 != 0) goto L_0x016c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x016c:
            java.lang.Object r1 = r1.getSecond()
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a) r1
            goto L_0x01d4
        L_0x0173:
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r11.challenge
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r2.f65426f
            boolean r4 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.m59939a(r4)
            if (r4 == 0) goto L_0x0196
            android.content.Context r5 = r10.f65338b
            java.lang.String r1 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r1)
            java.lang.String r1 = "headerParam"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            com.ss.android.ugc.aweme.challenge.ui.header.q r1 = new com.ss.android.ugc.aweme.challenge.ui.header.q
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a) r1
            goto L_0x01cd
        L_0x0196:
            com.ss.android.ugc.aweme.challenge.ab.a r4 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.f64953a
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r2.f65426f
            r4.mo50297a(r1, r5)
            com.ss.android.ugc.aweme.challenge.ui.header.m r1 = r2.f65421a
            int[] r4 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24687h.f65339a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            switch(r1) {
                case 1: goto L_0x01bf;
                case 2: goto L_0x01b0;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            d.l r14 = new d.l
            r14.<init>()
            throw r14
        L_0x01b0:
            com.ss.android.ugc.aweme.challenge.ui.header.o r1 = new com.ss.android.ugc.aweme.challenge.ui.header.o
            android.content.Context r5 = r10.f65338b
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a) r1
            goto L_0x01cd
        L_0x01bf:
            com.ss.android.ugc.aweme.challenge.ui.header.q r1 = new com.ss.android.ugc.aweme.challenge.ui.header.q
            android.content.Context r5 = r10.f65338b
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a) r1
        L_0x01cd:
            d.n r4 = new d.n
            r4.<init>(r2, r1)
            r10.f65337a = r4
        L_0x01d4:
            r1.mo50509a(r11)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = -1
            r2.<init>(r5, r4)
            com.ss.android.ugc.aweme.challenge.ui.header.a r4 = r13.f65479S
            if (r4 == 0) goto L_0x0203
            com.ss.android.ugc.aweme.challenge.ui.header.a r4 = r13.f65479S
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r1)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0203
            android.widget.LinearLayout r3 = r13.m60238A()
            com.ss.android.ugc.aweme.challenge.ui.header.a r4 = r13.f65479S
            android.view.View r4 = (android.view.View) r4
            r3.removeView(r4)
            android.widget.LinearLayout r3 = r13.m60238A()
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r3.addView(r4, r2)
            goto L_0x021d
        L_0x0203:
            com.ss.android.ugc.aweme.challenge.ui.header.a r3 = r13.f65479S
            if (r3 != 0) goto L_0x021d
            android.widget.LinearLayout r3 = r13.m60238A()
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r3.addView(r4, r2)
            com.ss.android.ugc.aweme.challenge.ui.l$y r2 = new com.ss.android.ugc.aweme.challenge.ui.l$y
            r2.<init>(r13)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
        L_0x021d:
            r13.f65479S = r1
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = r13.f65479S
            if (r1 == 0) goto L_0x024e
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r13.f72050y
            if (r1 == 0) goto L_0x022d
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0237
        L_0x022d:
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = r13.f65479S
            if (r1 != 0) goto L_0x0234
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0234:
            r1.mo50515d()
        L_0x0237:
            com.ss.android.ugc.aweme.challenge.ui.header.a r1 = r13.f65479S
            if (r1 != 0) goto L_0x023e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x023e:
            boolean r1 = r1.getHasBgCoverMask()
            if (r1 == 0) goto L_0x024e
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r1 = r13.f72050y
            if (r1 == 0) goto L_0x024e
            r2 = 2131820848(0x7f110130, float:1.9274423E38)
            r1.setBackgroundResource(r2)
        L_0x024e:
            java.lang.String r1 = r13.f65495l
            if (r1 != 0) goto L_0x0257
            java.lang.String r2 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0257:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = r0.getCid()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x02bb
            java.lang.String r1 = r0.getCid()
            java.lang.String r2 = "challenge.cid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r13.f65495l = r1
            android.support.v4.app.FragmentActivity r1 = r13.getActivity()
            if (r1 == 0) goto L_0x02b3
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity) r1
            java.lang.String r2 = r13.f65495l
            if (r2 != 0) goto L_0x0286
            java.lang.String r3 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0286:
            java.lang.String r3 = "challengeId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            r1.f65106b = r2
            java.util.List r1 = r13.f72039E
            java.lang.String r2 = "mFragments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x029a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02bb
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.detail.g r2 = (com.p683ss.android.ugc.aweme.detail.C27336g) r2
            java.lang.String r3 = r13.f65495l
            if (r3 != 0) goto L_0x02af
            java.lang.String r4 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02af:
            r2.mo50460a(r3)
            goto L_0x029a
        L_0x02b3:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity"
            r14.<init>(r0)
            throw r14
        L_0x02bb:
            java.lang.String r1 = r0.getChallengeName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02e1
            boolean r1 = com.p683ss.android.ugc.aweme.challenge.experiment.HashtagBiColAwemeListExperiment.m60028a()
            if (r1 == 0) goto L_0x02e1
            com.ss.android.ugc.aweme.challenge.ui.d r1 = r13.f65481U
            if (r1 == 0) goto L_0x02e1
            java.lang.String r0 = r0.getChallengeName()
            java.lang.String r2 = "challenge.challengeName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "challengeName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r1.f65212l = r0
        L_0x02e1:
            com.ss.android.ugc.aweme.challenge.service.a r0 = r13.f65492e
            if (r0 != 0) goto L_0x02ea
            java.lang.String r1 = "mCommerceDelegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02ea:
            r0.mo50417a()
            com.ss.android.ugc.aweme.challenge.service.a r0 = r13.f65492e
            if (r0 != 0) goto L_0x02f6
            java.lang.String r1 = "mCommerceDelegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02f6:
            int r1 = r13.f65483W
            r0.mo50420a(r14, r1)
            r13.f65483W = r5
            return
        L_0x02fe:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView"
            r14.<init>(r0)
            throw r14
        L_0x0306:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r14 = r13.mo50615k()
            r14.mo19208c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.mo50610a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* renamed from: a */
    public final void mo50608a(int i, int i2) {
        super.mo50608a(i, i2);
        Set<Entry> entrySet = ((HashMap) this.f65487aa.getValue()).entrySet();
        if (entrySet != null) {
            for (Entry entry : entrySet) {
                Object value = entry.getValue();
                C52711k.m112236a(value, "it.value");
                Integer num = (Integer) entry.getKey();
                ((View) value).setSelected(num != null && num.intValue() == i);
            }
        }
        if (this.f72039E != null) {
            Object obj = this.f72039E.get(i);
            C27336g gVar = (C27336g) obj;
            C52711k.m112236a((Object) gVar, "it");
            if (!gVar.mo50474o()) {
                obj = null;
            }
            C27336g gVar2 = (C27336g) obj;
            if (gVar2 != null) {
                gVar2.mo50473n();
            }
        }
    }

    /* renamed from: a */
    public final void mo50607a(float f, float f2) {
        super.mo50607a(f, f2);
        C24599a aVar = this.f65492e;
        if (aVar == null) {
            C52711k.m112237a("mCommerceDelegate");
        }
        aVar.mo50418a(f, f2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f65500q;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    /* renamed from: m */
    public final List<C27336g> mo50617m() {
        List<C27336g> list = this.f72039E;
        C52711k.m112236a((Object) list, "mFragments");
        return list;
    }

    /* renamed from: o */
    public final String mo50619o() {
        String str = this.f65495l;
        if (str == null) {
            C52711k.m112237a("mChallengeId");
        }
        return str;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f65491ae != null) {
            this.f65491ae.clear();
        }
    }

    /* renamed from: q */
    public final void mo50624q() {
        super.mo50624q();
        DmtTabLayout dmtTabLayout = this.f72050y;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackgroundResource(R.color.ce);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 == null) goto L_0x0027;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> mo50623p() {
        /*
            r2 = this;
            java.util.List r0 = r2.f72039E
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r2.f72039E
            int r1 = r2.f72037C
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r2.f72039E
            int r1 = r2.f72037C
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment
            if (r1 != 0) goto L_0x001d
            r0 = 0
        L_0x001d:
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r0 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment) r0
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.mo50480p()
            if (r0 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
        L_0x002b:
            return r0
        L_0x002c:
            java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.mo50623p():java.util.List");
    }

    public C24724l() {
        C52760c a = C52728w.m112245a(ChallengeDetailJediViewModel.class);
        C52670a aVar = new C24725a(a);
        this.f65485Y = new lifecycleAwareLazy(this, aVar, new C24727c(this, aVar, a, C24726b.INSTANCE));
        this.f65486Z = C24753n.m60283a(new C24746t(this));
        this.f65487aa = C24753n.m60283a(C24744r.f65525a);
        this.f65490ad = -1;
    }

    /* renamed from: r */
    public final C0677p mo50625r() {
        String str;
        String str2;
        this.f72039E = new ArrayList();
        this.f72040F = new ArrayList();
        this.f65201a = new ArrayList();
        boolean z = false;
        if (HashtagBiColAwemeListExperiment.m60028a()) {
            String str3 = this.f65495l;
            if (str3 == null) {
                C52711k.m112237a("mChallengeId");
            }
            if (!C26403au.m63867b(str3)) {
                C0654k childFragmentManager = getChildFragmentManager();
                StringBuilder sb = new StringBuilder();
                sb.append(C27311a.f72034s);
                sb.append(0);
                Fragment a = childFragmentManager.mo2224a(sb.toString());
                if (!(a instanceof C24638d)) {
                    String str4 = "challenge";
                    String str5 = this.f65495l;
                    if (str5 == null) {
                        C52711k.m112237a("mChallengeId");
                    }
                    ChallengeDetailParam challengeDetailParam = this.f65494k;
                    if (challengeDetailParam == null) {
                        C52711k.m112237a("mDetailParam");
                    }
                    boolean isHashTag = challengeDetailParam.isHashTag();
                    ChallengeDetailParam challengeDetailParam2 = this.f65494k;
                    if (challengeDetailParam2 == null) {
                        C52711k.m112237a("mDetailParam");
                    }
                    if (challengeDetailParam2.isHashTag()) {
                        str2 = this.f65495l;
                        if (str2 == null) {
                            C52711k.m112237a("mChallengeId");
                        }
                    } else {
                        str2 = "";
                    }
                    ChallengeDetailParam challengeDetailParam3 = this.f65494k;
                    if (challengeDetailParam3 == null) {
                        C52711k.m112237a("mDetailParam");
                    }
                    String enterFrom = challengeDetailParam3.getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    String str6 = this.f65498o;
                    C24622b jVar = new C24720j(null, 1, null);
                    C52711k.m112240b(str4, "eventLabel");
                    C52711k.m112240b(str5, "id");
                    C52711k.m112240b(str2, "hashTagName");
                    C52711k.m112240b(enterFrom, "from");
                    C52711k.m112240b(str6, "processId");
                    C24638d dVar = new C24638d();
                    Bundle bundle = new Bundle();
                    bundle.putString(C37195c.f94957y, str4);
                    bundle.putString(C37195c.f94958z, str5);
                    bundle.putBoolean("extra_challenge_is_hashtag", isHashTag);
                    bundle.putString("extra_challenge_hashtag_name", str2);
                    bundle.putString(C37195c.f94954A, enterFrom);
                    bundle.putString("process_id", str6);
                    dVar.setArguments(bundle);
                    dVar.f65207c = jVar;
                    a = dVar;
                }
                this.f65481U = (C24638d) a;
                this.f72040F.add(this.f65481U);
                this.f65201a.add(Integer.valueOf(2));
                this.f72039E.add(this.f65481U);
                return new C40320dc(getChildFragmentManager(), this.f72040F, this.f65201a);
            }
        }
        C0654k childFragmentManager2 = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C27311a.f72034s);
        sb2.append(0);
        Fragment a2 = childFragmentManager2.mo2224a(sb2.toString());
        if (!(a2 instanceof DetailAwemeListFragment)) {
            String str7 = "challenge";
            String str8 = this.f65495l;
            if (str8 == null) {
                C52711k.m112237a("mChallengeId");
            }
            ChallengeDetailParam challengeDetailParam4 = this.f65494k;
            if (challengeDetailParam4 == null) {
                C52711k.m112237a("mDetailParam");
            }
            boolean isHashTag2 = challengeDetailParam4.isHashTag();
            ChallengeDetailParam challengeDetailParam5 = this.f65494k;
            if (challengeDetailParam5 == null) {
                C52711k.m112237a("mDetailParam");
            }
            if (challengeDetailParam5.isHashTag()) {
                str = this.f65495l;
                if (str == null) {
                    C52711k.m112237a("mChallengeId");
                }
            } else {
                str = "";
            }
            String str9 = str;
            ChallengeDetailParam challengeDetailParam6 = this.f65494k;
            if (challengeDetailParam6 == null) {
                C52711k.m112237a("mDetailParam");
            }
            a2 = DetailAwemeListFragment.m60072a(null, 2, str7, str8, isHashTag2, str9, challengeDetailParam6.getEnterFrom(), this.f65498o, new C24720j(null, 1, null));
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a2;
            detailAwemeListFragment.mo50458a((C27388l) new C24730e(this));
            if (this.f72037C == 0) {
                z = true;
            }
            detailAwemeListFragment.f65150o = z;
            detailAwemeListFragment.f65151p = true;
            this.f65484X = detailAwemeListFragment;
        }
        if (a2 != null) {
            this.f65493j = (DetailAwemeListFragment) a2;
            List list = this.f72039E;
            DetailAwemeListFragment detailAwemeListFragment2 = this.f65493j;
            if (detailAwemeListFragment2 == null) {
                C52711k.m112237a("mHotFragment");
            }
            list.add(detailAwemeListFragment2);
            List list2 = this.f72040F;
            DetailAwemeListFragment detailAwemeListFragment3 = this.f65493j;
            if (detailAwemeListFragment3 == null) {
                C52711k.m112237a("mHotFragment");
            }
            list2.add(detailAwemeListFragment3);
            this.f65201a.add(Integer.valueOf(2));
            return new C40320dc(getChildFragmentManager(), this.f72040F, this.f65201a);
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r3 == null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0212  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50626s() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r8.f65494k
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "from_message"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "click_join_button"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "click_tag_publish"
        L_0x001e:
            com.p683ss.android.ugc.aweme.p1382aq.C23208an.m56935b(r0)
            java.lang.String r0 = r8.mo50499g()
            com.p683ss.android.ugc.aweme.p1382aq.C23208an.m56934a(r0)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r8.f65496m
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00a1
            boolean r3 = r0.isCommerce()
            r4 = 1
            if (r3 == r4) goto L_0x0036
            goto L_0x00a1
        L_0x0036:
            java.util.List r3 = r0.getConnectMusics()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r3)
            com.ss.android.ugc.aweme.music.model.Music r3 = (com.p683ss.android.ugc.aweme.music.model.Music) r3
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            java.lang.String r4 = "shoot_monitor"
            com.ss.android.ugc.aweme.app.f.c r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r6 = "shoot_way"
            java.lang.String r7 = "challenge"
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r7)
            java.lang.String r6 = "challenge_id"
            java.lang.String r7 = r0.getCid()
            if (r7 != 0) goto L_0x005c
            java.lang.String r7 = ""
        L_0x005c:
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r7)
            java.lang.String r6 = "challenge_name"
            java.lang.String r7 = r0.getChallengeName()
            if (r7 != 0) goto L_0x006a
            java.lang.String r7 = ""
        L_0x006a:
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r7)
            java.lang.String r6 = "music_id_to_bind"
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = r3.getMid()
            if (r3 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r3 = ""
        L_0x007a:
            com.ss.android.ugc.aweme.app.f.c r3 = r5.mo47824a(r6, r3)
            java.lang.String r5 = "sticker_id_to_bind"
            java.lang.String r6 = r0.getStickerId()
            if (r6 != 0) goto L_0x0088
            java.lang.String r6 = ""
        L_0x0088:
            com.ss.android.ugc.aweme.app.f.c r3 = r3.mo47824a(r5, r6)
            java.lang.String r5 = "mv_id_to_bind"
            java.lang.String r0 = r0.getMvId()
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = ""
        L_0x0096:
            com.ss.android.ugc.aweme.app.f.c r0 = r3.mo47824a(r5, r0)
            org.json.JSONObject r0 = r0.mo47825b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r4, r1, r0)
        L_0x00a1:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = "route"
            java.lang.String r4 = "1"
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)     // Catch:{ JSONException -> 0x032e }
        L_0x00b8:
            java.lang.String r4 = r4.getAwemeId()     // Catch:{ JSONException -> 0x032e }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
            java.lang.String r3 = "impr_type"
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r4     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r5 != 0) goto L_0x00d0
            java.lang.String r6 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)     // Catch:{ JSONException -> 0x032e }
        L_0x00d0:
            java.lang.String r5 = r5.getAwemeId()     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAwemeById(r5)     // Catch:{ JSONException -> 0x032e }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r4)     // Catch:{ JSONException -> 0x032e }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r3 != 0) goto L_0x00e8
            java.lang.String r4 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)     // Catch:{ JSONException -> 0x032e }
        L_0x00e8:
            java.lang.String r3 = r3.getEnterFrom()     // Catch:{ JSONException -> 0x032e }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ JSONException -> 0x032e }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x032e }
            if (r3 != 0) goto L_0x0106
            java.lang.String r3 = "challenge_from"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r4 != 0) goto L_0x00ff
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)     // Catch:{ JSONException -> 0x032e }
        L_0x00ff:
            java.lang.String r4 = r4.getEnterFrom()     // Catch:{ JSONException -> 0x032e }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
        L_0x0106:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r3 != 0) goto L_0x010f
            java.lang.String r4 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)     // Catch:{ JSONException -> 0x032e }
        L_0x010f:
            java.lang.String r3 = r3.getEnterpriseUid()     // Catch:{ JSONException -> 0x032e }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ JSONException -> 0x032e }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x032e }
            if (r3 != 0) goto L_0x012d
            java.lang.String r3 = "page_uid"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r4 != 0) goto L_0x0126
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)     // Catch:{ JSONException -> 0x032e }
        L_0x0126:
            java.lang.String r4 = r4.getEnterpriseUid()     // Catch:{ JSONException -> 0x032e }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
        L_0x012d:
            java.lang.String r3 = "impr_type"
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r4     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r8.f65494k     // Catch:{ JSONException -> 0x032e }
            if (r5 != 0) goto L_0x013e
            java.lang.String r6 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)     // Catch:{ JSONException -> 0x032e }
        L_0x013e:
            java.lang.String r5 = r5.getAwemeId()     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAwemeById(r5)     // Catch:{ JSONException -> 0x032e }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r4)     // Catch:{ JSONException -> 0x032e }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x032e }
            com.ss.android.ugc.aweme.common.MobClick r3 = new com.ss.android.ugc.aweme.common.MobClick
            r3.<init>()
            java.lang.String r4 = "shoot"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setEventName(r4)
            java.lang.String r4 = "challenge"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setLabelName(r4)
            java.lang.String r4 = r8.f65495l
            if (r4 != 0) goto L_0x0167
            java.lang.String r5 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0167:
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setValue(r4)
            com.ss.android.ugc.aweme.common.MobClick r0 = r3.setJsonObject(r0)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "creation_id"
            java.lang.String r4 = r8.f65497n
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.lang.String r3 = "shoot_way"
            java.lang.String r4 = "challenge"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.lang.String r3 = "tag_id"
            java.lang.String r4 = r8.f65495l
            if (r4 != 0) goto L_0x0191
            java.lang.String r5 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0191:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.lang.String r3 = "impr_type"
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r4 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r4
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r8.f65494k
            if (r5 != 0) goto L_0x01a6
            java.lang.String r6 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01a6:
            java.lang.String r5 = r5.getAwemeId()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAwemeById(r5)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r4)
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k
            if (r4 != 0) goto L_0x01c1
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01c1:
            java.lang.String r4 = r4.getAwemeId()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r8.f65494k
            if (r3 != 0) goto L_0x01d2
            java.lang.String r4 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01d2:
            java.lang.String r3 = r3.getEnterFrom()
            boolean r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56870i(r3)
            if (r3 == 0) goto L_0x01fa
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r8.f65494k
            if (r5 != 0) goto L_0x01eb
            java.lang.String r6 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01eb:
            java.lang.String r5 = r5.getAwemeId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56872j(r5)
            java.lang.String r4 = r4.mo60161a(r5)
            r0.mo47829a(r3, r4)
        L_0x01fa:
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r8.f65496m
            if (r3 == 0) goto L_0x0209
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r3 = r3.getCommerceChallengeTask()
            if (r3 == 0) goto L_0x0209
            java.lang.String r3 = r3.getId()
            goto L_0x020a
        L_0x0209:
            r3 = r2
        L_0x020a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0225
            java.lang.String r3 = "task_id"
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r8.f65496m
            if (r4 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r4 = r4.getCommerceChallengeTask()
            if (r4 == 0) goto L_0x0222
            java.lang.String r2 = r4.getId()
        L_0x0222:
            r0.mo47829a(r3, r2)
        L_0x0225:
            java.lang.String r2 = "process_id"
            java.lang.String r3 = r8.f65498o
            r0.mo47829a(r2, r3)
            java.lang.String r2 = "shoot"
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
            java.lang.String r0 = "general_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r8.f65494k
            if (r2 != 0) goto L_0x0240
            java.lang.String r3 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0240:
            java.lang.String r2 = r2.getEnterFrom()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            java.lang.String r2 = "search_result"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r8.f65494k
            if (r3 != 0) goto L_0x0257
            java.lang.String r4 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0257:
            java.lang.String r3 = r3.getEnterFrom()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            java.lang.String r3 = "search_for_you_list"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k
            if (r4 != 0) goto L_0x026e
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x026e:
            java.lang.String r4 = r4.getEnterFrom()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r0 != 0) goto L_0x027e
            if (r2 != 0) goto L_0x027e
            if (r3 == 0) goto L_0x02cd
        L_0x027e:
            java.lang.String r2 = "search_shoot"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "creation_id"
            java.lang.String r5 = r8.f65497n
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "shoot_way"
            java.lang.String r5 = "challenge"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "tag_id"
            java.lang.String r5 = r8.f65495l
            if (r5 != 0) goto L_0x029f
            java.lang.String r6 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x029f:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "search_type"
            if (r0 == 0) goto L_0x02aa
            java.lang.String r5 = "general"
            goto L_0x02ac
        L_0x02aa:
            java.lang.String r5 = "tag"
        L_0x02ac:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "previous_page"
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = "search_result"
            goto L_0x02c4
        L_0x02b7:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r8.f65494k
            if (r0 != 0) goto L_0x02c0
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x02c0:
            java.lang.String r0 = r0.getEnterFrom()
        L_0x02c4:
            com.ss.android.ugc.aweme.app.f.d r0 = r3.mo47829a(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
        L_0x02cd:
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x032d
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x02da
            goto L_0x032d
        L_0x02da:
            java.lang.String r2 = "from_notification"
            boolean r1 = r0.getBooleanExtra(r2, r1)
            if (r1 == 0) goto L_0x032c
            java.lang.String r1 = "rule_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x032c
            java.lang.String r1 = "shoot_from_push"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "tag_id"
            java.lang.String r4 = r8.f65495l
            if (r4 != 0) goto L_0x0302
            java.lang.String r5 = "mChallengeId"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0302:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "route"
            java.lang.String r4 = "1"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r4 = r8.f65494k
            if (r4 != 0) goto L_0x0319
            java.lang.String r5 = "mDetailParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0319:
            java.lang.String r4 = r4.getAwemeId()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "rule_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r0)
        L_0x032c:
            return
        L_0x032d:
            return
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.mo50626s():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ ChallengeDetailParam m60240a(C24724l lVar) {
        ChallengeDetailParam challengeDetailParam = lVar.f65494k;
        if (challengeDetailParam == null) {
            C52711k.m112237a("mDetailParam");
        }
        return challengeDetailParam;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m60242b(C24724l lVar) {
        String str = lVar.f65495l;
        if (str == null) {
            C52711k.m112237a("mChallengeId");
        }
        return str;
    }

    /* renamed from: c */
    public static final /* synthetic */ DetailAwemeListFragment m60243c(C24724l lVar) {
        DetailAwemeListFragment detailAwemeListFragment = lVar.f65493j;
        if (detailAwemeListFragment == null) {
            C52711k.m112237a("mHotFragment");
        }
        return detailAwemeListFragment;
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        C52711k.m112240b(aVar, "event");
        String str = aVar.f62554a;
        if (str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "/aweme/v1/challenge/detail/?", false, 2, (Object) null)) {
            C47718bf.m103293f(aVar);
            mo50611a(true);
        }
    }

    @C53771m
    public final void onMusicCollectEvent(C37351d dVar) {
        Object obj;
        C52711k.m112240b(dVar, "event");
        if (isViewValid()) {
            MusicModel musicModel = dVar.f95312b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i = dVar.f95311a;
                    music.setCollectStatus(i);
                    if (this.f65496m != null) {
                        Challenge challenge = this.f65496m;
                        if (challenge == null) {
                            C52711k.m112234a();
                        }
                        if (challenge.getConnectMusics() != null) {
                            Challenge challenge2 = this.f65496m;
                            if (challenge2 == null) {
                                C52711k.m112234a();
                            }
                            List connectMusics = challenge2.getConnectMusics();
                            C52711k.m112236a((Object) connectMusics, "mChallenge!!.connectMusics");
                            Iterator it = connectMusics.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                Music music2 = (Music) obj;
                                C52711k.m112236a((Object) music2, "it");
                                if (C52711k.m112239a((Object) music2.getMid(), (Object) music.getMid())) {
                                    break;
                                }
                            }
                            Music music3 = (Music) obj;
                            if (music3 != null) {
                                music3.setCollectStatus(i);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r2 == null) goto L_0x00c6;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVideoEvent(com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            int r0 = r9.f79228a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x0092
            boolean r0 = r8.isViewValid()
            if (r0 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r8.f65496m
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r9.f79229b
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x001c
            r0 = r1
        L_0x001c:
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0028
            return
        L_0x0028:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r2 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAwemeById(r0)
            if (r0 == 0) goto L_0x0091
            java.util.List r0 = r0.getChallengeList()
            if (r0 != 0) goto L_0x003b
            goto L_0x0091
        L_0x003b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = (com.p683ss.android.ugc.aweme.discover.model.Challenge) r2
            java.lang.String r3 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getCid()
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r8.f65496m
            if (r3 != 0) goto L_0x005d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005d:
            java.lang.String r3 = r3.getCid()
            boolean r2 = com.bytedance.common.utility.C9431p.m18665a(r2, r3)
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r8.f65496m
            if (r2 != 0) goto L_0x006e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006e:
            int r2 = r2.getUserCount()
            if (r2 <= 0) goto L_0x0041
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r8.f65496m
            if (r2 != 0) goto L_0x007b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007b:
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r8.f65496m
            if (r3 != 0) goto L_0x0082
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0082:
            int r3 = r3.getUserCount()
            int r3 = r3 + -1
            r2.setUserCount(r3)
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r2 = r8.f65482V
            r8.mo50610a(r2)
            goto L_0x0041
        L_0x0091:
            return
        L_0x0092:
            int r0 = r9.f79228a
            r2 = 21
            if (r0 != r2) goto L_0x0148
            boolean r0 = r8.f29771h
            if (r0 != 0) goto L_0x0148
            com.ss.android.ugc.aweme.challenge.ui.d r0 = r8.f65481U
            if (r0 == 0) goto L_0x0148
            com.ss.android.ugc.aweme.challenge.ui.d r0 = r8.f65481U
            if (r0 == 0) goto L_0x0147
            r2 = 2132019001(0x7f140739, float:1.9676325E38)
            android.view.View r0 = r0.mo48632a(r2)
            android.support.v7.widget.RecyclerView r0 = (android.support.p043v7.widget.RecyclerView) r0
            java.lang.String r2 = "feed_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            if (r0 != 0) goto L_0x00b6
            goto L_0x0147
        L_0x00b6:
            java.lang.Object r9 = r9.f79229b
            if (r9 == 0) goto L_0x013f
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r9
            com.ss.android.ugc.aweme.challenge.ui.d r2 = r8.f65481U
            if (r2 == 0) goto L_0x00c6
            java.util.List r2 = r2.mo50501j()
            if (r2 != 0) goto L_0x00ca
        L_0x00c6:
            java.util.List r2 = p2628d.p2629a.C52575l.m112097a()
        L_0x00ca:
            if (r0 == 0) goto L_0x00d1
            android.support.v7.widget.RecyclerView$i r3 = r0.getLayoutManager()
            goto L_0x00d2
        L_0x00d1:
            r3 = r1
        L_0x00d2:
            if (r3 == 0) goto L_0x0137
            android.support.v7.widget.GridLayoutManager r3 = (android.support.p043v7.widget.GridLayoutManager) r3
            int r3 = r3.mo4750k()
            if (r0 == 0) goto L_0x00e0
            android.support.v7.widget.RecyclerView$i r1 = r0.getLayoutManager()
        L_0x00e0:
            if (r1 == 0) goto L_0x012f
            android.support.v7.widget.GridLayoutManager r1 = (android.support.p043v7.widget.GridLayoutManager) r1
            int r1 = r1.mo4752m()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r5 = 0
        L_0x00f0:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0148
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r6
            java.lang.String r6 = r6.getAid()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = r9.getAid()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x012c
            if (r5 < r3) goto L_0x0112
            if (r5 <= r1) goto L_0x012c
        L_0x0112:
            r0.mo4833d(r5)
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r9 = r8.f72046u
            if (r9 == 0) goto L_0x012b
            boolean r9 = r9.mo55118b()
            if (r9 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r9 = r8.f72046u
            if (r9 == 0) goto L_0x012a
            float r0 = r8.f65488ab
            int r0 = (int) r0
            r9.scrollTo(r4, r0)
            return
        L_0x012a:
            return
        L_0x012b:
            return
        L_0x012c:
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x012f:
            d.u r9 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager"
            r9.<init>(r0)
            throw r9
        L_0x0137:
            d.u r9 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager"
            r9.<init>(r0)
            throw r9
        L_0x013f:
            d.u r9 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme"
            r9.<init>(r0)
            throw r9
        L_0x0147:
            return
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l.onVideoEvent(com.ss.android.ugc.aweme.feed.h.aw):void");
    }

    /* renamed from: a */
    private final void m60241a(View view, C52671b<? super View, C52860x> bVar) {
        view.setOnClickListener(new C24731f(this, bVar));
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        int i3;
        super.mo50613b(i, i2);
        C24599a aVar = this.f65492e;
        if (aVar == null) {
            C52711k.m112237a("mCommerceDelegate");
        }
        aVar.mo50419a(i, i2);
        mo50614j().setChildScrollY(i);
        if (this.f65479S != null) {
            if (this.f65490ad != m60238A().getBottom()) {
                int bottom = m60238A().getBottom();
                View view = this.f72048w;
                C52711k.m112236a((Object) view, "mTitleColorCtrl");
                this.f65488ab = (float) ((bottom - view.getBottom()) - m60244w().getHeight());
                this.f65489ac = this.f65488ab - C9432q.m18687b(getContext(), 20.0f);
                if (this.f65489ac < 0.0f) {
                    this.f65489ac = 0.0f;
                }
                this.f65490ad = m60238A().getBottom();
            }
            if (i == 0) {
                m60245x().setBackground(new ColorDrawable(getResources().getColor(R.color.a8w)));
            } else {
                m60245x().setBackground(new ColorDrawable(getResources().getColor(R.color.au2)));
            }
            C24664a aVar2 = this.f65479S;
            if (aVar2 != null) {
                i3 = aVar2.getAvatarContainerHight();
            } else {
                i3 = 1;
            }
            float f = ((float) i) / ((float) i3);
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            TextView textView = this.f72047v;
            C52711k.m112236a((Object) textView, "mTitle");
            textView.setAlpha(f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ChallengeDetailParam challengeDetailParam = this.f65494k;
        if (challengeDetailParam == null) {
            C52711k.m112237a("mDetailParam");
        }
        if (TextUtils.isEmpty(challengeDetailParam.getCid())) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (HashtagBiColAwemeListExperiment.m60028a()) {
            String str = this.f65495l;
            if (str == null) {
                C52711k.m112237a("mChallengeId");
            }
            if (!C26403au.m63867b(str)) {
                mo50616l().setVisibility(0);
            }
        }
        DmtTabLayout dmtTabLayout = this.f72050y;
        C52711k.m112236a((Object) dmtTabLayout, "mTabLayout");
        dmtTabLayout.setVisibility(8);
        TextView textView = this.f72047v;
        C52711k.m112236a((Object) textView, "mTitle");
        textView.setVisibility(0);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo50612b((int) R.id.ik);
        C52711k.m112236a((Object) autoRTLImageView, "back_btn");
        m60241a((View) autoRTLImageView, (C52671b<? super View, C52860x>) new C24747u<Object,C52860x>(this));
        if (VERSION.SDK_INT >= 19) {
            int a = C11065a.m22390a((Context) getActivity());
            float dimension = getResources().getDimension(R.dimen.vn);
            m60244w().getLayoutParams().height = a;
            m60244w().setAlpha(1.0f);
            ScrollableLayout scrollableLayout = this.f72046u;
            if (scrollableLayout != null) {
                scrollableLayout.setTabsMarginTop((int) (((float) a) + dimension));
            }
            LayoutParams layoutParams = mo50615k().getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = (int) (((float) a) + dimension);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        m60241a((View) m60247z(), (C52671b<? super View, C52860x>) new C24733h<Object,C52860x>(this));
        C23794bh.m58382H().mo46911a(m60247z());
        mo50615k().setBuilder(C10719a.m21676a(getContext()).mo19232b(C48190g.m104428a(getContext(), new C24736j(this))));
        m60246y().setEnabled(false);
        m60241a(m60246y(), (C52671b<? super View, C52860x>) new C24734i<Object,C52860x>(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cw);
        mo50614j().setEnabled(false);
        mo50614j().mo48779a(true, dimensionPixelSize * 2, dimensionPixelSize * 4);
        mo50614j().setOnRefreshListener(new C24732g(this));
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context, "context!!");
        C52711k.m112240b(context, "context");
        this.f65480T = new C24685g(context);
        C24599a createCommerceDelegate = ChallengeDetailProvicer.createIChallengeDetailProviderbyMonsterPlugin().createCommerceDelegate(view, this);
        C52711k.m112236a((Object) createCommerceDelegate, "ServiceManager.get().get…merceDelegate(view, this)");
        this.f65492e = createCommerceDelegate;
        JediViewModel C = m60239C();
        C52771j jVar = C24752m.f65533a;
        C52682m vVar = new C24748v(this);
        C11798a.m24151a(this, C, jVar, null, new C24750x(this), new C24749w(this), vVar, 2, null);
        mo50611a(false);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
