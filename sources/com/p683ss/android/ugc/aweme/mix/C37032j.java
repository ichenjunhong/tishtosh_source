package com.p683ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
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
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.detail.DetailViewModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.feed.utils.C31214w;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShareService;
import com.p683ss.android.ugc.aweme.utils.C47843ee;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.video.preload.C48106i;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
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
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.mix.j */
public final class C37032j extends C23526a implements OnClickListener, C11791ad<C37085p>, C11872h, C26846a, C30462o, C37022d {

    /* renamed from: O */
    public static final C37039c f94578O = new C37039c(null);

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f94579a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37032j.class), "mMixDetailModel", "getMMixDetailModel()Lcom/ss/android/ugc/aweme/mix/MixDetailViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37032j.class), "mMixListAdapter", "getMMixListAdapter()Lcom/ss/android/ugc/aweme/mix/MixListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37032j.class), "smoothScroller", "getSmoothScroller()Landroid/support/v7/widget/RecyclerView$SmoothScroller;"))};

    /* renamed from: A */
    int f94580A;

    /* renamed from: B */
    public MixStruct f94581B;

    /* renamed from: C */
    public DetailViewModel f94582C;

    /* renamed from: D */
    public View f94583D;

    /* renamed from: E */
    public long f94584E;

    /* renamed from: F */
    public final C37085p f94585F = new C37085p();

    /* renamed from: G */
    public final C37046i f94586G;

    /* renamed from: H */
    public C10660a f94587H;

    /* renamed from: I */
    public boolean f94588I;

    /* renamed from: J */
    public MixInfo f94589J;

    /* renamed from: K */
    boolean f94590K;

    /* renamed from: L */
    public volatile boolean f94591L;

    /* renamed from: M */
    public final C37007aa f94592M;

    /* renamed from: P */
    private View f94593P;

    /* renamed from: Q */
    private CheckableImageView f94594Q;

    /* renamed from: R */
    private DmtTextView f94595R;

    /* renamed from: S */
    private final lifecycleAwareLazy f94596S;

    /* renamed from: T */
    private final C52668f f94597T;

    /* renamed from: U */
    private long f94598U;

    /* renamed from: V */
    private boolean f94599V;

    /* renamed from: W */
    private final C52668f f94600W;

    /* renamed from: X */
    private HashMap f94601X;

    /* renamed from: b */
    public boolean f94602b = true;

    /* renamed from: c */
    public Long f94603c;

    /* renamed from: d */
    public String f94604d;

    /* renamed from: e */
    String f94605e;

    /* renamed from: j */
    public String f94606j;

    /* renamed from: k */
    public String f94607k;

    /* renamed from: l */
    public String f94608l;

    /* renamed from: m */
    public String f94609m;

    /* renamed from: n */
    public String f94610n;

    /* renamed from: o */
    public String f94611o;

    /* renamed from: p */
    public MixRefreshLayout f94612p;

    /* renamed from: q */
    public RecyclerView f94613q;

    /* renamed from: r */
    public C37072m f94614r;

    /* renamed from: s */
    public DmtStatusView f94615s;

    /* renamed from: t */
    View f94616t;

    /* renamed from: u */
    public DmtTextView f94617u;

    /* renamed from: v */
    public RelativeLayout f94618v;

    /* renamed from: w */
    public C37024f f94619w;

    /* renamed from: x */
    public int f94620x;

    /* renamed from: y */
    public String f94621y = "";

    /* renamed from: z */
    int f94622z;

    /* renamed from: com.ss.android.ugc.aweme.mix.j$a */
    public static final class C37033a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f94623a;

        public C37033a(C52760c cVar) {
            this.f94623a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f94623a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$aa */
    static final class C37034aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f94624a;

        /* renamed from: b */
        final /* synthetic */ C37032j f94625b;

        C37034aa(FragmentActivity fragmentActivity, C37032j jVar) {
            this.f94624a = fragmentActivity;
            this.f94625b = jVar;
        }

        public final void run() {
            C37032j jVar = this.f94625b;
            FragmentActivity fragmentActivity = this.f94624a;
            C52711k.m112236a((Object) fragmentActivity, "it");
            C10661a aVar = new C10661a(fragmentActivity);
            aVar.f28406k = 500;
            jVar.f94587H = aVar.mo19010a(6000).mo19017c(false).mo19016b(true).mo19013a(false).mo19012a("点击标题快速回到合集顶部").mo19014a();
            C10660a aVar2 = this.f94625b.f94587H;
            if (aVar2 != null) {
                aVar2.mo18999a(this.f94625b.f94618v, 80, true);
            }
            C31214w.m72899a("mix_show_top_bubble_flag", true);
            this.f94625b.f94588I = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$ab */
    static final class C37035ab extends C52712l implements C52670a<C370361> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94626a;

        C37035ab(C37032j jVar) {
            this.f94626a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1415af(this, this.f94626a.getContext()) {

                /* renamed from: f */
                final /* synthetic */ C37035ab f94627f;

                /* renamed from: a */
                public final void mo5106a() {
                    super.mo5106a();
                    C32458a.m75141a(4, "MixDetailFragment", "smoothScroller onStop called!");
                }

                {
                    this.f94627f = r1;
                }

                /* renamed from: a */
                public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                    return super.mo5492a(i, i2, i3, i4, -1);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$b */
    public static final class C37037b extends C52712l implements C52670a<MixDetailViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f94628a;

        /* renamed from: b */
        final /* synthetic */ C52670a f94629b;

        /* renamed from: c */
        final /* synthetic */ C52760c f94630c;

        /* renamed from: d */
        final /* synthetic */ C52682m f94631d;

        public C37037b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f94628a = fragment;
            this.f94629b = aVar;
            this.f94630c = cVar;
            this.f94631d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.mix.MixDetailViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.mix.MixDetailViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.mix.MixDetailViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.mix.MixDetailViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f94628a
                android.support.v4.app.Fragment r1 = r3.f94628a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f94629b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f94630c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.mix.MixDetailViewModel> r2 = com.p683ss.android.ugc.aweme.mix.MixDetailViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.mix.j$b$1 r1 = new com.ss.android.ugc.aweme.mix.j$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37037b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$c */
    public static final class C37039c {
        private C37039c() {
        }

        public /* synthetic */ C37039c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$d */
    static final class C37040d extends C52712l implements C52682m<View, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94633a;

        /* renamed from: com.ss.android.ugc.aweme.mix.j$d$a */
        static final class C37041a extends C52712l implements C52671b<MixDetailState, Boolean> {

            /* renamed from: a */
            final /* synthetic */ List f94634a;

            /* renamed from: b */
            final /* synthetic */ int f94635b;

            C37041a(List list, int i) {
                this.f94634a = list;
                this.f94635b = i;
                super(1);
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.mix.MixDetailState r5 = (com.p683ss.android.ugc.aweme.mix.MixDetailState) r5
                    java.lang.String r0 = "state"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                    java.util.List r0 = r4.f94634a
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    if (r0 != 0) goto L_0x0032
                    java.util.List r0 = r4.f94634a
                    java.util.List r2 = r4.f94634a
                    int r2 = r2.size()
                    int r2 = r2 - r1
                    java.lang.Object r0 = r0.get(r2)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
                    com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r0.getMixInfo()
                    if (r0 == 0) goto L_0x0032
                    com.ss.android.ugc.aweme.feed.model.MixStatisStruct r0 = r0.statis
                    if (r0 == 0) goto L_0x0032
                    long r2 = r0.currentEpisode
                    int r0 = (int) r2
                    int r0 = r0 - r1
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    goto L_0x0033
                L_0x0032:
                    r0 = 0
                L_0x0033:
                    if (r0 != 0) goto L_0x0045
                    com.bytedance.jedi.arch.ext.list.ListState r5 = r5.getListState()
                    com.bytedance.jedi.arch.ext.list.l r5 = r5.getPayload()
                    com.ss.android.ugc.aweme.mix.w r5 = (com.p683ss.android.ugc.aweme.mix.C37094w) r5
                    int r5 = r5.f31450b
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L_0x0045:
                    int r5 = r4.f94635b
                    r2 = -1
                    if (r5 == r2) goto L_0x0053
                    int r5 = r0.intValue()
                    int r0 = r4.f94635b
                    if (r5 < r0) goto L_0x0053
                    goto L_0x0054
                L_0x0053:
                    r1 = 0
                L_0x0054:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37040d.C37041a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        C37040d(C37032j jVar) {
            this.f94633a = jVar;
            super(2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[LOOP:0: B:1:0x001d->B:12:0x0040, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0044 A[EDGE_INSN: B:31:0x0044->B:14:0x0044 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            /*
                r8 = this;
                android.view.View r9 = (android.view.View) r9
                java.lang.Number r10 = (java.lang.Number) r10
                long r0 = r10.longValue()
                java.lang.String r10 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r10)
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                com.ss.android.ugc.aweme.mix.u r9 = r9.mo76347g()
                java.util.List r9 = r9.mo48640d()
                java.util.Iterator r10 = r9.iterator()
                r2 = 0
                r3 = 0
            L_0x001d:
                boolean r4 = r10.hasNext()
                r5 = 1
                if (r4 == 0) goto L_0x0043
                java.lang.Object r4 = r10.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r4.getMixInfo()
                if (r4 == 0) goto L_0x003c
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r4 = r4.statis
                if (r4 == 0) goto L_0x003c
                long r6 = r4.currentEpisode
                int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x003c
                r4 = 1
                goto L_0x003d
            L_0x003c:
                r4 = 0
            L_0x003d:
                if (r4 == 0) goto L_0x0040
                goto L_0x0044
            L_0x0040:
                int r3 = r3 + 1
                goto L_0x001d
            L_0x0043:
                r3 = -1
            L_0x0044:
                com.ss.android.ugc.aweme.mix.j r10 = r8.f94633a
                com.ss.android.ugc.aweme.mix.j r4 = r8.f94633a
                com.ss.android.ugc.aweme.mix.MixDetailViewModel r4 = r4.mo76346e()
                com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4
                com.ss.android.ugc.aweme.mix.j$d$a r6 = new com.ss.android.ugc.aweme.mix.j$d$a
                r6.<init>(r9, r3)
                d.f.a.b r6 = (p2628d.p2639f.p2640a.C52671b) r6
                java.lang.Object r9 = r10.mo22552a(r4, r6)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                com.ss.android.ugc.aweme.mix.j r10 = r8.f94633a
                com.ss.android.ugc.aweme.mix.u r10 = r10.mo76347g()
                r10.f94735e = r0
                com.ss.android.ugc.aweme.mix.j r10 = r8.f94633a
                com.ss.android.ugc.aweme.mix.u r10 = r10.mo76347g()
                r10.f94736f = r0
                java.lang.String r10 = "compilation_detail"
                com.ss.android.ugc.aweme.mix.j r4 = r8.f94633a
                java.lang.String r4 = r4.f94606j
                com.ss.android.ugc.aweme.mix.j r6 = r8.f94633a
                java.lang.String r6 = r6.f94604d
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                com.p683ss.android.ugc.aweme.feed.utils.C31216x.m72905a(r10, r4, r6, r7)
                if (r9 == 0) goto L_0x00c1
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a     // Catch:{ Exception -> 0x008c }
                com.ss.android.ugc.aweme.mix.u r9 = r9.mo76347g()     // Catch:{ Exception -> 0x008c }
                r9.notifyDataSetChanged()     // Catch:{ Exception -> 0x008c }
                goto L_0x0090
            L_0x008c:
                r9 = move-exception
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r9)
            L_0x0090:
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                r10 = 4
                java.lang.String r0 = "MixDetailFragment"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "scrollToPosition:"
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r10, r0, r1)
                if (r3 < 0) goto L_0x00df
                android.support.v7.widget.RecyclerView$r r10 = r9.mo76350l()
                int r3 = r3 + r5
                r10.f4778g = r3
                android.support.v7.widget.RecyclerView r10 = r9.f94613q
                if (r10 == 0) goto L_0x00df
                android.support.v7.widget.RecyclerView$i r10 = r10.getLayoutManager()
                if (r10 == 0) goto L_0x00df
                android.support.v7.widget.RecyclerView$r r9 = r9.mo76350l()
                r10.mo5022a(r9)
                goto L_0x00df
            L_0x00c1:
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                com.ss.android.ugc.aweme.mix.MixDetailViewModel r9 = r9.mo76346e()
                int r10 = (int) r0
                int r10 = r10 - r5
                r9.mo76321b(r10)
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                r9.mo76345b(r2)
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                r9.mo76351m()
                com.ss.android.ugc.aweme.mix.j r9 = r8.f94633a
                com.ss.android.ugc.aweme.mix.j r10 = r8.f94633a
                com.ss.android.ugc.aweme.mix.MixInfo r10 = r10.f94589J
                r9.mo76344a(r10)
            L_0x00df:
                d.x r9 = p2628d.C52860x.f131107a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37040d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$e */
    static final class C37042e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37032j f94636a;

        C37042e(C37032j jVar) {
            this.f94636a = jVar;
        }

        public final void run() {
            this.f94636a.mo76347g().an_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$f */
    static final class C37043f extends C52712l implements C52671b<MixDetailState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52723a f94637a;

        C37043f(C52723a aVar) {
            this.f94637a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "it");
            this.f94637a.element = ((C37094w) mixDetailState.getListState().getPayload()).f31449a.f31440a;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$g */
    static final class C37044g extends C52712l implements C52682m<MixDetailState, Bundle, MixDetailState> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94638a;

        C37044g(C37032j jVar) {
            this.f94638a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MixDetailState mixDetailState = (MixDetailState) obj;
            Bundle bundle = (Bundle) obj2;
            C52711k.m112240b(mixDetailState, "$receiver");
            C37032j jVar = this.f94638a;
            Bundle arguments = jVar.getArguments();
            if (arguments != null) {
                jVar.f94604d = arguments.getString("mix_id");
                jVar.f94605e = arguments.getString("uid");
                jVar.f94606j = arguments.getString("event_type");
                jVar.f94607k = arguments.getString("mix_from_order");
                jVar.f94608l = arguments.getString("extra_search_result_id");
                jVar.f94609m = arguments.getString("extra_list_item_id");
                jVar.f94610n = arguments.getString("impr_id");
                jVar.f94611o = arguments.getString("feed_aweme_id");
                long j = arguments.getLong("mix_enter_episode_num", 0);
                if (j > 0) {
                    jVar.f94603c = Long.valueOf(j);
                }
            }
            return MixDetailState.copy$default(mixDetailState, this.f94638a.f94604d, null, null, this.f94638a.f94603c, 0, 22, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$h */
    static final class C37045h extends C52712l implements C52670a<C37090u> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94639a;

        C37045h(C37032j jVar) {
            this.f94639a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C37090u uVar = new C37090u(this.f94639a, this.f94639a.f94586G, this.f94639a, null, 8, null);
            Long l = this.f94639a.f94603c;
            if (l != null) {
                uVar.f94735e = l.longValue();
            }
            uVar.mo54792d(R.string.an1);
            return uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$i */
    public static final class C37046i implements C24579d {

        /* renamed from: a */
        final /* synthetic */ C37032j f94640a;

        C37046i(C37032j jVar) {
            this.f94640a = jVar;
        }

        /* renamed from: a */
        public final void mo50347a(View view, Aweme aweme, String str) {
            boolean z;
            boolean z2;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(aweme, "aweme");
            C31213v.m72895a((JediViewModel) this.f94640a.mo76346e());
            this.f94640a.mo76347g();
            this.f94640a.mo76347g().f94735e = 0;
            MixStruct mixInfo = aweme.getMixInfo();
            boolean z3 = true;
            if (mixInfo != null) {
                MixStatusStruct mixStatusStruct = mixInfo.status;
                if (mixStatusStruct != null) {
                    mixStatusStruct.setViewedInMix(1);
                }
            }
            C41302w a = C41302w.m91042a();
            Activity activity = this.f94640a.getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            C41311y a2 = C41311y.m91065a(sb.toString()).mo83870a("refer", "compilation_detail").mo83870a("video_from", "from_mix_detail").mo83868a("profile_enterprise_type", aweme.getEnterpriseType()).mo83868a("page_type", 19).mo83870a("previous_page", this.f94640a.f94606j).mo83870a("mix_from_order", this.f94640a.f94607k);
            CharSequence charSequence = this.f94640a.f94608l;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a2.mo83870a("extra_search_result_id", this.f94640a.f94608l);
            }
            CharSequence charSequence2 = this.f94640a.f94609m;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                a2.mo83870a("extra_list_item_id", this.f94640a.f94609m);
            }
            CharSequence charSequence3 = this.f94640a.f94610n;
            if (!(charSequence3 == null || charSequence3.length() == 0)) {
                z3 = false;
            }
            if (!z3) {
                a2.mo83870a("impr_id", this.f94640a.f94610n);
            }
            if (!TextUtils.isEmpty(this.f94640a.f94611o)) {
                a2.mo83870a("feed_group_id", this.f94640a.f94611o);
            }
            a.mo83860a(activity, a2.mo83871a(), view);
            C48106i.m104189a(aweme);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$j */
    static final class C37047j extends C52712l implements C52671b<MixDetailState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94641a;

        C37047j(C37032j jVar) {
            this.f94641a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String valueOf;
            MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "state");
            if (TextUtils.isEmpty(this.f94641a.f94606j)) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.f94641a.f94606j);
            }
            String str = valueOf;
            ShareService a = C41979aq.m91946a();
            FragmentActivity requireActivity = this.f94641a.requireActivity();
            C52711k.m112236a((Object) requireActivity, "requireActivity()");
            a.shareMix(requireActivity, this.f94641a.f94581B, mixDetailState.getListState().getList(), "enter_compilation_detail", str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$k */
    static final class C37048k implements C23596b {

        /* renamed from: a */
        final /* synthetic */ C37032j f94642a;

        C37048k(C37032j jVar) {
            this.f94642a = jVar;
        }

        /* renamed from: a */
        public final void mo47048a() {
            if (!C37070k.m83300a(this.f94642a.getActivity())) {
                C10691a.m21542b((Context) this.f94642a.getActivity(), (int) R.string.cg1).mo19066a();
                MixRefreshLayout mixRefreshLayout = this.f94642a.f94612p;
                if (mixRefreshLayout != null) {
                    mixRefreshLayout.setRefreshing(false);
                    return;
                }
                return;
            }
            this.f94642a.mo76346e().mo76319a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$l */
    public static final class C37049l implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C37032j f94643a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f94644b;

        public final void onGlobalLayout() {
            LayoutParams layoutParams;
            int i;
            C37032j jVar = this.f94643a;
            DmtStatusView dmtStatusView = jVar.f94615s;
            if (dmtStatusView != null) {
                layoutParams = dmtStatusView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C37072m mVar = jVar.f94614r;
                if (mVar != null) {
                    i = mVar.f94680a.getHeight();
                    if (i == 0) {
                        i = mVar.f94699t;
                    }
                } else {
                    i = C23728o.m58241a(40.0d) + 300;
                }
                layoutParams2.topMargin = i;
                DmtStatusView dmtStatusView2 = jVar.f94615s;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.setLayoutParams(layoutParams2);
                }
                DmtStatusView dmtStatusView3 = jVar.f94615s;
                if (dmtStatusView3 != null) {
                    dmtStatusView3.setPadding(0, C23728o.m58241a(40.0d), 0, 0);
                }
                ViewTreeObserver viewTreeObserver = this.f94644b.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        C37049l(C37032j jVar, FrameLayout frameLayout) {
            this.f94643a = jVar;
            this.f94644b = frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$m */
    public static final class C37050m implements C11854c<Aweme, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f94645a;

        /* renamed from: b */
        final /* synthetic */ C52682m f94646b;

        /* renamed from: c */
        final /* synthetic */ C52682m f94647c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f94648d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f94649e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Aweme>, C52860x> f94650f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f94648d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f94649e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Aweme>, C52860x> mo22603c() {
            return this.f94650f;
        }

        public C37050m(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f94645a = bVar;
            this.f94646b = mVar;
            this.f94647c = mVar2;
            this.f94648d = bVar;
            this.f94649e = mVar;
            this.f94650f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$n */
    public static final class C37051n implements C11854c<Aweme, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f94651a;

        /* renamed from: b */
        final /* synthetic */ C52682m f94652b;

        /* renamed from: c */
        final /* synthetic */ C52682m f94653c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f94654d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f94655e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Aweme>, C52860x> f94656f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f94654d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f94655e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Aweme>, C52860x> mo22603c() {
            return this.f94656f;
        }

        public C37051n(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f94651a = bVar;
            this.f94652b = mVar;
            this.f94653c = mVar2;
            this.f94654d = bVar;
            this.f94655e = mVar;
            this.f94656f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$o */
    public static final class C37052o extends C1340m {

        /* renamed from: a */
        final /* synthetic */ int f94657a;

        /* renamed from: b */
        final /* synthetic */ C37032j f94658b;

        C37052o(int i, C37032j jVar) {
            this.f94657a = i;
            this.f94658b = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onScrollStateChanged(android.support.p043v7.widget.RecyclerView r5, int r6) {
            /*
                r4 = this;
                java.lang.String r0 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                super.onScrollStateChanged(r5, r6)
                r5 = 1
                if (r6 != r5) goto L_0x0034
                com.ss.android.ugc.aweme.mix.j r5 = r4.f94658b
                r0 = 4634204016564240384(0x4050000000000000, double:64.0)
                int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r0)
                com.ss.android.ugc.aweme.mix.m r0 = r5.f94614r
                r1 = 0
                if (r0 == 0) goto L_0x0021
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f94682c
                if (r0 == 0) goto L_0x0021
                int r0 = r0.getHeight()
                goto L_0x0022
            L_0x0021:
                r0 = 0
            L_0x0022:
                int r6 = r6 + r0
                r5.f94622z = r6
                com.ss.android.ugc.aweme.mix.m r6 = r5.f94614r
                if (r6 == 0) goto L_0x0031
                android.view.View r6 = r6.f94680a
                if (r6 == 0) goto L_0x0031
                int r1 = r6.getHeight()
            L_0x0031:
                r5.f94580A = r1
                return
            L_0x0034:
                if (r6 != 0) goto L_0x006a
                com.ss.android.ugc.aweme.mix.j r5 = r4.f94658b
                java.lang.String r5 = r5.f94604d
                java.lang.String r6 = "compilation_detail"
                com.ss.android.ugc.aweme.mix.j r0 = r4.f94658b
                java.lang.String r0 = r0.f94621y
                java.lang.String r1 = "status"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                java.lang.String r1 = "slide_video_list"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "enter_from"
                com.ss.android.ugc.aweme.app.f.d r6 = r2.mo47829a(r3, r6)
                java.lang.String r2 = "page_type"
                java.lang.String r3 = "complete"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r2, r3)
                java.lang.String r2 = "compilation_id"
                com.ss.android.ugc.aweme.app.f.d r5 = r6.mo47829a(r2, r5)
                java.lang.String r6 = "direction"
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r0)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r5)
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37052o.onScrollStateChanged(android.support.v7.widget.RecyclerView, int):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onScrolled(android.support.p043v7.widget.RecyclerView r8, int r9, int r10) {
            /*
                r7 = this;
                java.lang.String r0 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                super.onScrolled(r8, r9, r10)
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                com.ss.android.ugc.aweme.detail.DetailViewModel r8 = r8.f94582C
                if (r8 == 0) goto L_0x0011
                r8.mo55745a()
            L_0x0011:
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                com.ss.android.ugc.aweme.mix.j r9 = r7.f94658b
                int r9 = r9.f94620x
                int r9 = r9 + r10
                r8.f94620x = r9
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                int r8 = r8.f94620x
                int r9 = r7.f94657a
                int r9 = r9 / 2
                if (r8 <= r9) goto L_0x0029
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                r8.mo76348j()
            L_0x0029:
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                boolean r9 = r8.f94590K
                if (r9 == 0) goto L_0x00e6
                int r9 = r8.f94622z
                r0 = 4634204016564240384(0x4050000000000000, double:64.0)
                int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r0)
                if (r9 <= r0) goto L_0x00e6
                int r9 = r8.f94580A
                if (r9 > 0) goto L_0x003f
                goto L_0x00e6
            L_0x003f:
                int r9 = r8.f94620x
                float r9 = (float) r9
                r0 = 4627448617123184640(0x4038000000000000, double:24.0)
                int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r0)
                float r0 = (float) r0
                float r9 = r9 - r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1 = 0
                r2 = 4631389266797133824(0x4046000000000000, double:44.0)
                r4 = 0
                int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x0072
                int r5 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r2)
                float r5 = (float) r5
                com.ss.android.ugc.aweme.mix.m r6 = r8.f94614r
                if (r6 == 0) goto L_0x0066
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r6.f94682c
                if (r6 == 0) goto L_0x0066
                int r6 = r6.getHeight()
                goto L_0x0067
            L_0x0066:
                r6 = 0
            L_0x0067:
                float r6 = (float) r6
                float r5 = r5 + r6
                float r9 = r9 / r5
                int r5 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r5 >= 0) goto L_0x006f
                goto L_0x0073
            L_0x006f:
                r9 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0073
            L_0x0072:
                r9 = 0
            L_0x0073:
                com.ss.android.ugc.aweme.mix.aa r0 = r8.f94592M
                r0.f94521a = r9
                r8.mo76352n()
                int r9 = r8.f94620x
                float r9 = (float) r9
                int r0 = r8.f94580A
                float r0 = (float) r0
                int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r2)
                float r2 = (float) r2
                float r0 = r0 - r2
                float r9 = r9 - r0
                android.view.View r0 = r8.f94616t
                if (r0 == 0) goto L_0x0090
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                goto L_0x0091
            L_0x0090:
                r0 = 0
            L_0x0091:
                if (r0 == 0) goto L_0x00de
                android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
                com.ss.android.ugc.aweme.mix.f r2 = r8.f94619w
                r5 = 4634766966517661696(0x4052000000000000, double:72.0)
                if (r2 == 0) goto L_0x009f
                boolean r2 = r2.f94555a
                if (r2 == 0) goto L_0x00ab
            L_0x009f:
                if (r0 == 0) goto L_0x00ab
                int r0 = r0.bottomMargin
                int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r5)
                int r2 = -r2
                if (r0 != r2) goto L_0x00ab
                goto L_0x00e6
            L_0x00ab:
                int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x00da
                int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r5)
                float r0 = (float) r0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x00c5
                com.ss.android.ugc.aweme.mix.aa r9 = r8.f94592M
                r9.f94522b = r1
                com.ss.android.ugc.aweme.mix.aa r9 = r8.f94592M
                int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r5)
                r9.f94523c = r0
                goto L_0x00d6
            L_0x00c5:
                com.ss.android.ugc.aweme.mix.aa r0 = r8.f94592M
                int r1 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r5)
                float r1 = (float) r1
                float r1 = r1 - r9
                int r1 = (int) r1
                int r1 = -r1
                r0.f94522b = r1
                com.ss.android.ugc.aweme.mix.aa r0 = r8.f94592M
                int r9 = (int) r9
                r0.f94523c = r9
            L_0x00d6:
                r8.mo76353o()
                goto L_0x00e6
            L_0x00da:
                r8.mo76349k()
                goto L_0x00e6
            L_0x00de:
                d.u r8 = new d.u
                java.lang.String r9 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
                r8.<init>(r9)
                throw r8
            L_0x00e6:
                com.ss.android.ugc.aweme.mix.j r8 = r7.f94658b
                if (r10 <= 0) goto L_0x00ed
                java.lang.String r9 = "up"
                goto L_0x00ef
            L_0x00ed:
                java.lang.String r9 = "down"
            L_0x00ef:
                r8.f94621y = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37052o.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$p */
    static final class C37053p extends C52712l implements C52682m<C11866f, MixInfo, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94659a;

        C37053p(C37032j jVar) {
            this.f94659a = jVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0393, code lost:
            if (r2 != null) goto L_0x0398;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
            if (r5 == null) goto L_0x00bd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0375  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x037e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x038d  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x03a3  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x03b3  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0237  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                com.bytedance.jedi.arch.f r1 = (com.bytedance.jedi.arch.C11866f) r1
                r2 = r27
                com.ss.android.ugc.aweme.mix.MixInfo r2 = (com.p683ss.android.ugc.aweme.mix.MixInfo) r2
                java.lang.String r3 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
                java.lang.String r1 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                r1.f94589J = r2
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.ss.android.ugc.aweme.feed.model.MixStruct r3 = r2.mixInfo
                r1.f94581B = r3
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.ss.android.ugc.aweme.feed.model.MixStruct r3 = r2.mixInfo
                r4 = 0
                if (r3 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r3 = r3.statis
                if (r3 == 0) goto L_0x002d
                long r6 = r3.lastReadEpisode
                goto L_0x002e
            L_0x002d:
                r6 = r4
            L_0x002e:
                r1.f94584E = r6
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.ss.android.ugc.aweme.mix.m r1 = r1.f94614r
                r3 = 8
                r14 = 1
                r15 = 0
                if (r1 == 0) goto L_0x0375
                com.ss.android.ugc.aweme.feed.model.MixStruct r13 = r2.mixInfo
                r1.f94698s = r13
                com.ss.android.ugc.aweme.mix.f r6 = r1.f94695p
                java.lang.String r7 = r1.f94705z
                r6.mo76338a(r13, r7)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r1.f94681b
                r16 = 0
                if (r13 == 0) goto L_0x004e
                com.ss.android.ugc.aweme.base.model.UrlModel r7 = r13.cover
                goto L_0x0050
            L_0x004e:
                r7 = r16
            L_0x0050:
                com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r6, r7)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r1.f94685f
                android.app.Activity r7 = r1.f94700u
                r8 = 2132546542(0x7f1c13ee, float:2.0746305E38)
                java.lang.Object[] r9 = new java.lang.Object[r14]
                if (r13 == 0) goto L_0x0069
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r10 = r13.statis
                if (r10 == 0) goto L_0x0069
                long r10 = r10.updatedToEpisode
                java.lang.Long r10 = java.lang.Long.valueOf(r10)
                goto L_0x006b
            L_0x0069:
                r10 = r16
            L_0x006b:
                r9[r15] = r10
                java.lang.String r7 = r7.getString(r8, r9)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r6.setText(r7)
                android.app.Activity r6 = r1.f94700u
                r7 = 2132547352(0x7f1c1718, float:2.0747948E38)
                java.lang.Object[] r8 = new java.lang.Object[r14]
                if (r13 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r9 = r13.statis
                if (r9 == 0) goto L_0x0085
                long r4 = r9.playVV
            L_0x0085:
                java.lang.String r4 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r4)
                r8[r15] = r4
                java.lang.String r4 = r6.getString(r7, r8)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f94693n
                r6 = r4
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r5.setText(r6)
                if (r13 == 0) goto L_0x009c
                java.lang.String r5 = r13.desc
                goto L_0x009e
            L_0x009c:
                r5 = r16
            L_0x009e:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r11 = 17
                if (r5 == 0) goto L_0x00b2
                android.view.View r5 = r1.f94687h
                r5.setVisibility(r3)
            L_0x00ad:
                r15 = r13
            L_0x00ae:
                r5 = 17
                goto L_0x0229
            L_0x00b2:
                android.view.View r5 = r1.f94687h
                r5.setVisibility(r15)
                if (r13 == 0) goto L_0x00bd
                java.lang.String r5 = r13.desc
                if (r5 != 0) goto L_0x00bf
            L_0x00bd:
                java.lang.String r5 = ""
            L_0x00bf:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r1.f94688i
                r10 = r6
                android.widget.TextView r10 = (android.widget.TextView) r10
                android.widget.LinearLayout r6 = r1.f94689j
                r9 = r6
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r1.f94691l
                r8 = r6
                android.widget.TextView r8 = (android.widget.TextView) r8
                android.widget.ImageView r7 = r1.f94692m
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L_0x00ad
                r6 = r10
                android.view.View r6 = (android.view.View) r6
                android.content.Context r6 = r6.getContext()
                boolean r6 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r6)
                if (r6 == 0) goto L_0x00e8
                r6 = -1
                goto L_0x00e9
            L_0x00e8:
                r6 = -2
            L_0x00e9:
                java.text.Bidi r14 = new java.text.Bidi
                r14.<init>(r5, r6)
                boolean r6 = r14.baseIsLeftToRight()
                android.content.Context r14 = r9.getContext()
                boolean r14 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r14)
                android.view.ViewParent r17 = r10.getParent()
                if (r17 == 0) goto L_0x0221
                android.view.ViewGroup r17 = (android.view.ViewGroup) r17
                r3 = r17
                android.view.View r3 = (android.view.View) r3
                r12 = r6 ^ 1
                android.support.p030v4.view.C1056u.m3049c(r3, r12)
                r12 = 3
                if (r6 == 0) goto L_0x0110
                r3 = 3
                goto L_0x0111
            L_0x0110:
                r3 = 5
            L_0x0111:
                r10.setGravity(r3)
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r11) goto L_0x0122
                if (r6 == 0) goto L_0x011b
                goto L_0x011c
            L_0x011b:
                r12 = 2
            L_0x011c:
                r10.setTextDirection(r12)
                r9.setLayoutDirection(r14)
            L_0x0122:
                r3 = r6 ^ 1
                android.support.v4.e.a r3 = android.support.p030v4.p037e.C0761a.m2156a(r3)
                java.lang.String r3 = r3.mo2428b(r5)
                java.lang.String r5 = "BidiFormatter.getInstanc…!isLTR).unicodeWrap(text)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                if (r6 == 0) goto L_0x0147
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "‭"
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r3 = "‭"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x0156
            L_0x0147:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r5 = "(?<!^)(#)([a-zA-Z0-9])"
                d.m.l r6 = new d.m.l
                r6.<init>(r5)
                java.lang.String r5 = "‎$1‎$2"
                java.lang.String r3 = r6.replace(r3, r5)
            L_0x0156:
                java.lang.CharSequence r5 = r10.getText()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r5 = android.text.TextUtils.equals(r5, r3)
                if (r5 != 0) goto L_0x00ad
                java.lang.CharSequence r5 = r10.getText()
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x01ac
                r7.setSelected(r15)
                if (r8 == 0) goto L_0x017d
                r5 = 2132544501(0x7f1c0bf5, float:2.0742165E38)
                java.lang.String r5 = com.p683ss.android.ugc.aweme.base.utils.C23723j.m58219b(r5)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r8.setText(r5)
            L_0x017d:
                r5 = 0
                r7.setRotation(r5)
                android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
                r6 = -2
                r5.height = r6
                android.content.res.Resources r5 = r7.getResources()
                r6 = 2131886447(0x7f12016f, float:1.9407473E38)
                float r5 = r5.getDimension(r6)
                int r5 = (int) r5
                android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
                if (r6 == 0) goto L_0x01a4
                android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
                r6.topMargin = r5
                android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
                r9.setLayoutParams(r6)
                goto L_0x01ac
            L_0x01a4:
                d.u r1 = new d.u
                java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
                r1.<init>(r2)
                throw r1
            L_0x01ac:
                android.content.Context r5 = r10.getContext()
                int r5 = com.bytedance.common.utility.C9432q.m18670a(r5)
                float r5 = (float) r5
                android.content.Context r6 = r10.getContext()
                r12 = 1107296256(0x42000000, float:32.0)
                float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r12)
                float r5 = r5 - r6
                int r5 = (int) r5
                android.text.SpannableString r12 = new android.text.SpannableString
                r12.<init>(r3)
                java.lang.CharSequence r3 = r8.getText()
                java.lang.String r22 = r3.toString()
                com.ss.android.ugc.aweme.mix.i r3 = new com.ss.android.ugc.aweme.mix.i
                android.text.TextPaint r19 = r10.getPaint()
                r21 = 1
                r23 = 2
                r18 = r3
                r20 = r5
                r18.<init>(r19, r20, r21, r22, r23)
                android.text.SpannableString r5 = r3.mo50296a(r12)
                boolean r3 = r3.f94572b
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r10.setText(r6)
                if (r3 == 0) goto L_0x0213
                r8.setVisibility(r15)
                r7.setVisibility(r15)
                com.ss.android.ugc.aweme.mix.m$g r3 = new com.ss.android.ugc.aweme.mix.m$g
                r6 = r3
                r14 = r7
                r7 = r1
                r24 = r8
                r8 = r10
                r17 = r9
                r9 = r12
                r12 = r10
                r10 = r14
                r14 = 17
                r11 = r24
                r14 = r12
                r12 = r17
                r15 = r13
                r13 = r5
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r14.post(r3)
                goto L_0x00ae
            L_0x0213:
                r14 = r7
                r6 = r8
                r15 = r13
                r3 = 8
                r5 = 17
                r6.setVisibility(r3)
                r14.setVisibility(r3)
                goto L_0x0229
            L_0x0221:
                d.u r1 = new d.u
                java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
                r1.<init>(r2)
                throw r1
            L_0x0229:
                android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                r3.<init>()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "  "
                r6.<init>(r7)
                if (r15 == 0) goto L_0x023a
                java.lang.String r7 = r15.mixName
                goto L_0x023c
            L_0x023a:
                r7 = r16
            L_0x023c:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r3.append(r6)
                com.ss.android.ugc.aweme.mix.b r6 = new com.ss.android.ugc.aweme.mix.b
                android.app.Activity r7 = r1.f94700u
                android.content.Context r7 = (android.content.Context) r7
                r8 = 2131954816(0x7f130c80, float:1.9546142E38)
                r6.<init>(r7, r8)
                r7 = 0
                r8 = 1
                r3.setSpan(r6, r7, r8, r5)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f94682c
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r5.setText(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f94682c
                android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
                com.ss.android.ugc.aweme.mix.m$d r5 = new com.ss.android.ugc.aweme.mix.m$d
                r5.<init>(r1)
                android.view.ViewTreeObserver$OnGlobalLayoutListener r5 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r5
                r3.addOnGlobalLayoutListener(r5)
                if (r15 == 0) goto L_0x0327
                int r3 = r15.mixType
                r5 = 1
                if (r3 != r5) goto L_0x0327
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f94683d
                com.ss.android.ugc.aweme.search.c r5 = r15.autoMixAuthorInfo
                if (r5 == 0) goto L_0x0282
                java.lang.String r5 = r5.getTitle()
                goto L_0x0284
            L_0x0282:
                r5 = r16
            L_0x0284:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0291
                int r5 = r5.length()
                if (r5 != 0) goto L_0x028f
                goto L_0x0291
            L_0x028f:
                r5 = 0
                goto L_0x0292
            L_0x0291:
                r5 = 1
            L_0x0292:
                if (r5 == 0) goto L_0x029e
                android.app.Activity r5 = r1.f94700u
                r6 = 2132548660(0x7f1c1c34, float:2.07506E38)
                java.lang.String r5 = r5.getString(r6)
                goto L_0x02a9
            L_0x029e:
                com.ss.android.ugc.aweme.search.c r5 = r15.autoMixAuthorInfo
                if (r5 == 0) goto L_0x02a7
                java.lang.String r5 = r5.getTitle()
                goto L_0x02a9
            L_0x02a7:
                r5 = r16
            L_0x02a9:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r3.setText(r5)
                android.view.View r3 = r1.f94684e
                r5 = 2131953442(0x7f130722, float:1.9543355E38)
                r3.setBackgroundResource(r5)
                android.app.Activity r3 = r1.f94700u
                android.content.Context r3 = (android.content.Context) r3
                r5 = 1096810496(0x41600000, float:14.0)
                float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r5)
                int r3 = (int) r3
                android.view.View r5 = r1.f94684e
                com.bytedance.common.utility.C9432q.m18679a(r5, r3, r3)
                android.view.View r3 = r1.f94684e
                com.ss.android.ugc.aweme.mix.m$e r5 = new com.ss.android.ugc.aweme.mix.m$e
                r5.<init>(r1)
                android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
                r3.setOnClickListener(r5)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f94683d
                com.ss.android.ugc.aweme.mix.m$f r5 = new com.ss.android.ugc.aweme.mix.m$f
                r5.<init>(r1)
                android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
                r3.setOnClickListener(r5)
                android.app.Activity r3 = r1.f94700u
                r5 = 2132548661(0x7f1c1c35, float:2.0750603E38)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                com.ss.android.ugc.aweme.feed.model.MixStatisStruct r6 = r15.statis
                if (r6 == 0) goto L_0x02f0
                long r8 = r6.updatedToEpisode
                java.lang.Long r16 = java.lang.Long.valueOf(r8)
            L_0x02f0:
                r6 = 0
                r7[r6] = r16
                java.lang.String r3 = r3.getString(r5, r7)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r1.f94693n
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r3 = "  "
                r6.append(r3)
                r6.append(r4)
                java.lang.String r3 = r6.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r5.setText(r3)
                r3 = 2
                android.view.View[] r3 = new android.view.View[r3]
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f94685f
                android.view.View r4 = (android.view.View) r4
                r5 = 0
                r3[r5] = r4
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f94686g
                android.view.View r4 = (android.view.View) r4
                r6 = 1
                r3[r6] = r4
                com.p683ss.android.ugc.aweme.base.utils.C23729p.m58265b(r5, r3)
                goto L_0x0367
            L_0x0327:
                if (r15 == 0) goto L_0x0367
                com.ss.android.ugc.aweme.profile.model.User r3 = r15.author
                if (r3 == 0) goto L_0x0367
                com.ss.android.ugc.aweme.profile.model.User r3 = r15.author
                java.lang.String r4 = "mixInfo.author"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r3 = r3.getNickname()
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f94683d
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r4.setText(r3)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f94683d
                com.ss.android.ugc.aweme.mix.m$b r4 = new com.ss.android.ugc.aweme.mix.m$b
                r4.<init>(r1, r15)
                android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
                r3.setOnClickListener(r4)
                android.app.Activity r3 = r1.f94700u
                android.content.Context r3 = (android.content.Context) r3
                r4 = 1092616192(0x41200000, float:10.0)
                float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
                int r3 = (int) r3
                android.view.View r4 = r1.f94684e
                com.bytedance.common.utility.C9432q.m18679a(r4, r3, r3)
                android.view.View r3 = r1.f94684e
                com.ss.android.ugc.aweme.mix.m$c r4 = new com.ss.android.ugc.aweme.mix.m$c
                r4.<init>(r1, r15)
                android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
                r3.setOnClickListener(r4)
            L_0x0367:
                android.widget.LinearLayout r3 = r1.f94697r
                r4 = 8
                r3.setVisibility(r4)
                android.widget.LinearLayout r1 = r1.f94696q
                r3 = 0
                r1.setVisibility(r3)
                goto L_0x0378
            L_0x0375:
                r3 = 0
                r4 = 8
            L_0x0378:
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.ss.android.ugc.aweme.mix.f r1 = r1.f94619w
                if (r1 == 0) goto L_0x0387
                com.ss.android.ugc.aweme.feed.model.MixStruct r5 = r2.mixInfo
                com.ss.android.ugc.aweme.mix.j r6 = r0.f94659a
                java.lang.String r6 = r6.f94611o
                r1.mo76338a(r5, r6)
            L_0x0387:
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f94617u
                if (r1 == 0) goto L_0x039d
                com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r2.mixInfo
                if (r2 == 0) goto L_0x0396
                java.lang.String r2 = r2.mixName
                if (r2 == 0) goto L_0x0396
                goto L_0x0398
            L_0x0396:
                java.lang.String r2 = ""
            L_0x0398:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
            L_0x039d:
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f94617u
                if (r1 == 0) goto L_0x03ad
                com.ss.android.ugc.aweme.mix.j$p$1 r2 = new com.ss.android.ugc.aweme.mix.j$p$1
                r2.<init>(r0)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r1.setOnClickListener(r2)
            L_0x03ad:
                com.ss.android.ugc.aweme.mix.j r1 = r0.f94659a
                android.view.View r1 = r1.f94583D
                if (r1 == 0) goto L_0x03c3
                com.ss.android.ugc.aweme.mix.j r2 = r0.f94659a
                com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r2.f94581B
                if (r2 == 0) goto L_0x03c0
                int r2 = r2.mixType
                r5 = 1
                if (r2 != r5) goto L_0x03c0
                r3 = 8
            L_0x03c0:
                r1.setVisibility(r3)
            L_0x03c3:
                d.x r1 = p2628d.C52860x.f131107a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.C37053p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$q */
    static final class C37055q extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        public static final C37055q f94661a = new C37055q();

        C37055q() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$r */
    static final class C37056r extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        public static final C37056r f94662a = new C37056r();

        C37056r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$s */
    static final class C37057s extends C52712l implements C52682m<C11866f, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94663a;

        C37057s(C37032j jVar) {
            this.f94663a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            if (!list.isEmpty()) {
                DmtStatusView dmtStatusView = this.f94663a.f94615s;
                if (dmtStatusView != null) {
                    dmtStatusView.setVisibility(8);
                }
                fVar.mo22552a(this.f94663a.mo76346e(), new C52671b<MixDetailState, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C37057s f94664a;

                    {
                        this.f94664a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        MixDetailState mixDetailState = (MixDetailState) obj;
                        C52711k.m112240b(mixDetailState, "it");
                        if (((C37094w) mixDetailState.getListState().getPayload()).f94745c == 0) {
                            this.f94664a.f94663a.mo76345b(true);
                        } else {
                            MixRefreshLayout mixRefreshLayout = this.f94664a.f94663a.f94612p;
                            if (mixRefreshLayout != null) {
                                FragmentActivity activity = this.f94664a.f94663a.getActivity();
                                if (activity == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a((Object) activity, "activity!!");
                                mixRefreshLayout.setRefreshHeader(new C37096y(activity));
                            }
                            this.f94664a.f94663a.mo76351m();
                            this.f94664a.f94663a.mo76348j();
                        }
                        return C52860x.f131107a;
                    }
                });
            } else {
                this.f94663a.mo76345b(true);
                this.f94663a.mo76347g().mo54790b("暂无内容");
                this.f94663a.mo47019a(false);
            }
            this.f94663a.mo76344a(this.f94663a.f94589J);
            DmtStatusView dmtStatusView2 = this.f94663a.f94615s;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setVisibility(8);
            }
            DmtStatusView dmtStatusView3 = this.f94663a.f94615s;
            if (dmtStatusView3 != null) {
                dmtStatusView3.mo19220n();
            }
            if (this.f94663a.f94591L) {
                this.f94663a.mo76347g().mo76378a(true);
                RecyclerView recyclerView = this.f94663a.f94613q;
                if (recyclerView != null) {
                    C1332i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo4741e(0);
                    }
                }
                this.f94663a.f94591L = false;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$t */
    static final class C37059t extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        public static final C37059t f94665a = new C37059t();

        C37059t() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$u */
    static final class C37060u extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94666a;

        C37060u(C37032j jVar) {
            this.f94666a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11866f fVar = (C11866f) obj;
            C52711k.m112240b(fVar, "$receiver");
            fVar.mo22552a(this.f94666a.mo76346e(), new C52671b<MixDetailState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37060u f94667a;

                {
                    this.f94667a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "it");
                    if (mixDetailState.getPullType() == 2) {
                        this.f94667a.f94666a.mo76347g().am_();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$v */
    static final class C37062v extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94668a;

        C37062v(C37032j jVar) {
            this.f94668a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f94668a.mo76347g().mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$w */
    static final class C37063w extends C52712l implements C52682m<C11866f, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94669a;

        C37063w(C37032j jVar) {
            this.f94669a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f94669a.mo76346e(), new C52671b<MixDetailState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37063w f94670a;

                {
                    this.f94670a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "it");
                    if (((C37094w) mixDetailState.getListState().getPayload()).f94745c == 0) {
                        MixRefreshLayout mixRefreshLayout = this.f94670a.f94669a.f94612p;
                        if (mixRefreshLayout != null) {
                            mixRefreshLayout.setRefreshing(false);
                        }
                    }
                    if (mixDetailState.getPullType() == 2) {
                        return C52860x.f131107a;
                    }
                    if (((C37094w) mixDetailState.getListState().getPayload()).f94745c != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        MixRefreshLayout mixRefreshLayout2 = this.f94670a.f94669a.f94612p;
                        if (mixRefreshLayout2 == null) {
                            return null;
                        }
                        mixRefreshLayout2.setRefreshing(false);
                        return C52860x.f131107a;
                    }
                    this.f94670a.f94669a.mo76345b(true);
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$x */
    static final class C37065x extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94671a;

        C37065x(C37032j jVar) {
            this.f94671a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            fVar.mo22552a(this.f94671a.mo76346e(), new C52671b<MixDetailState, Object>(this) {

                /* renamed from: a */
                final /* synthetic */ C37065x f94672a;

                {
                    this.f94672a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Object obj2;
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "state");
                    if (mixDetailState.getPullType() == 2) {
                        if (((C37094w) mixDetailState.getListState().getPayload()).f94746d) {
                            this.f94672a.f94671a.mo47019a(true);
                        } else {
                            this.f94672a.f94671a.mo47019a(false);
                            RecyclerView recyclerView = this.f94672a.f94671a.f94613q;
                            if (recyclerView == null) {
                                return null;
                            }
                            obj2 = Boolean.valueOf(recyclerView.postDelayed(new Runnable(this) {

                                /* renamed from: a */
                                final /* synthetic */ C370661 f94673a;

                                {
                                    this.f94673a = r1;
                                }

                                public final void run() {
                                    this.f94673a.f94672a.f94671a.mo76347g().an_();
                                }
                            }, 500));
                            return obj2;
                        }
                    }
                    obj2 = C52860x.f131107a;
                    return obj2;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$y */
    static final class C37068y extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        public static final C37068y f94674a = new C37068y();

        C37068y() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            C32458a.m75141a(4, "MixDetailFragment", "onEmpty called!");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.j$z */
    static final class C37069z extends C52712l implements C52671b<MixDetailState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37032j f94675a;

        C37069z(C37032j jVar) {
            this.f94675a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MixDetailState mixDetailState = (MixDetailState) obj;
            C52711k.m112240b(mixDetailState, "it");
            if (((C37094w) mixDetailState.getListState().getPayload()).f94745c == 0) {
                this.f94675a.mo76350l().f4778g = 0;
                RecyclerView recyclerView = this.f94675a.f94613q;
                if (recyclerView != null) {
                    C1332i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.mo5022a(this.f94675a.mo76350l());
                        return C52860x.f131107a;
                    }
                }
                return null;
            } else if (this.f94675a.f94591L) {
                return C52860x.f131107a;
            } else {
                this.f94675a.f94591L = true;
                this.f94675a.mo76349k();
                C37032j jVar = this.f94675a;
                jVar.f94592M.f94521a = 0.0f;
                jVar.mo76352n();
                this.f94675a.mo76346e().mo76321b(0);
                this.f94675a.mo76347g().mo76378a(false);
                return C52860x.f131107a;
            }
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: e */
    public final MixDetailViewModel mo76346e() {
        return (MixDetailViewModel) this.f94596S.getValue();
    }

    /* renamed from: g */
    public final C37090u mo76347g() {
        return (C37090u) this.f94597T.getValue();
    }

    /* renamed from: l */
    public final C1346r mo76350l() {
        return (C1346r) this.f94600W.getValue();
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        StringBuilder sb = new StringBuilder("handleHasMore:");
        sb.append(z);
        sb.append(',');
        sb.append(Log.getStackTraceString(new Throwable()));
        C32458a.m75150b("MixDetailFragment", sb.toString());
        if (!z) {
            this.f94602b = false;
            mo76347g().mo54788a((C26846a) null);
            RecyclerView recyclerView = this.f94613q;
            if (recyclerView != null) {
                recyclerView.postDelayed(new C37042e(this), 500);
            }
            mo76347g().mo54798c(true);
            return;
        }
        this.f94602b = true;
        mo76347g().mo54788a((C26846a) this);
        mo76347g().ao_();
        mo76347g().mo54798c(false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f94585F;
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

    public final void onPause() {
        super.onPause();
        this.f94599V = false;
    }

    public final void onResume() {
        super.onResume();
        this.f94599V = true;
    }

    public final void aU_() {
        if (this.f94602b) {
            ar_();
        }
    }

    public final void ar_() {
        mo76346e().mo76319a(2);
    }

    /* renamed from: m */
    public final void mo76351m() {
        if (!this.f94590K) {
            this.f94592M.f94521a = 1.0f;
            mo76352n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo76352n() {
        RelativeLayout relativeLayout = this.f94618v;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(this.f94592M.f94521a);
        }
    }

    public final boolean aW_() {
        C52723a aVar = new C52723a();
        aVar.element = false;
        mo22552a(mo76346e(), new C37043f(aVar));
        return aVar.element;
    }

    /* renamed from: j */
    public final void mo76348j() {
        if (!this.f94588I) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                RelativeLayout relativeLayout = this.f94618v;
                if (relativeLayout != null) {
                    relativeLayout.postDelayed(new C37034aa(activity, this), 500);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo76349k() {
        this.f94592M.f94522b = -C23728o.m58241a(72.0d);
        this.f94592M.f94523c = 0;
        mo76353o();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C37024f fVar = this.f94619w;
        if (fVar != null) {
            fVar.mo76341d();
        }
        C37072m mVar = this.f94614r;
        if (mVar != null) {
            mVar.f94695p.mo76341d();
        }
        if (this.f94601X != null) {
            this.f94601X.clear();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f94598U = SystemClock.elapsedRealtime();
        mo76346e().f94488g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo76353o() {
        LayoutParams layoutParams;
        int i;
        View view = this.f94616t;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = this.f94592M.f94522b;
            }
            View view2 = this.f94616t;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            MixRefreshLayout mixRefreshLayout = this.f94612p;
            if (mixRefreshLayout != null) {
                MixRefreshLayout mixRefreshLayout2 = this.f94612p;
                if (mixRefreshLayout2 != null) {
                    i = mixRefreshLayout2.getPaddingTop();
                } else {
                    i = 0;
                }
                mixRefreshLayout.setPadding(0, i, 0, this.f94592M.f94523c);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public C37032j() {
        C52682m gVar = new C37044g(this);
        C52760c a = C52728w.m112245a(MixDetailViewModel.class);
        C52670a aVar = new C37033a(a);
        this.f94596S = new lifecycleAwareLazy(this, aVar, new C37037b(this, aVar, a, gVar));
        this.f94597T = C52732g.m112285a(new C37045h(this));
        this.f94586G = new C37046i(this);
        this.f94600W = C52732g.m112285a(new C37035ab(this));
        this.f94592M = new C37007aa();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r11 = this;
            super.onStop()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r1 = r11.f94611o
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAwemeById(r1)
            java.lang.String r1 = r11.f94604d
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r11.f94581B
            r3 = 0
            if (r2 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.author
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.getUid()
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r11.f94598U
            long r4 = r4 - r6
            java.lang.String r6 = "compilation_detail"
            java.lang.String r7 = r11.f94606j
            java.lang.String r8 = "stay_time"
            com.ss.android.ugc.aweme.app.f.d r9 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r6 = r9.mo47829a(r10, r6)
            java.lang.String r9 = "compilation_id"
            com.ss.android.ugc.aweme.app.f.d r1 = r6.mo47829a(r9, r1)
            java.lang.String r6 = "author_id"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r6, r2)
            java.lang.String r2 = "feed_group_id"
            if (r0 == 0) goto L_0x004c
            java.lang.String r6 = r0.getAid()
            goto L_0x004d
        L_0x004c:
            r6 = r3
        L_0x004d:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r6)
            java.lang.String r2 = "feed_author_id"
            if (r0 == 0) goto L_0x0059
            java.lang.String r3 = r0.getAuthorUid()
        L_0x0059:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r7)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r0)
            java.lang.String r0 = r3.mo60161a(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
            java.lang.String r1 = "duration"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r0)
            com.ss.android.ugc.aweme.mix.MixDetailViewModel r0 = r11.mo76346e()
            r1 = 1
            r0.f94488g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.onStop():void");
    }

    @C53771m
    public final void onEvent(C35471h hVar) {
        View view;
        C52711k.m112240b(hVar, "event");
        if (isViewValid() && TextUtils.equals("mix", hVar.itemType)) {
            Context context = getContext();
            C37072m mVar = this.f94614r;
            if (mVar != null) {
                view = mVar.f94680a;
            } else {
                view = null;
            }
            C47881fd.m103578a(context, view, hVar);
        }
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 21) {
            Object obj = awVar.f79229b;
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (TextUtils.equals(aweme.getMixId(), this.f94604d)) {
                    mo76347g();
                    aweme.getMixInfo();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo76345b(boolean z) {
        View view;
        StringBuilder sb = new StringBuilder("changeRealHeaderView called ");
        sb.append(z);
        C32458a.m75141a(4, "MixDetailFragment", sb.toString());
        this.f94590K = z;
        MixRefreshLayout mixRefreshLayout = this.f94612p;
        if (mixRefreshLayout != null) {
            mixRefreshLayout.setEnabled(!z);
        }
        C37090u g = mo76347g();
        if (z) {
            C37072m mVar = this.f94614r;
            if (mVar != null) {
                view = mVar.f94680a;
                g.mo48642b_(view);
                if (z && this.f94599V) {
                    mo76347g().notifyDataSetChanged();
                    mo76349k();
                    return;
                }
            }
        }
        view = null;
        g.mo48642b_(view);
        if (z) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 >= 0) goto L_0x0041;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFullFeedVideoChangeEvent(com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31121a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.mix.u r0 = r5.mo76347g()
            java.util.List r0 = r0.mo48640d()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f81461a
            java.lang.String r2 = "awemeList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x001a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r1)
            if (r4 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0030:
            r3 = -1
        L_0x0031:
            com.ss.android.ugc.aweme.mix.u r0 = r5.mo76347g()
            boolean r0 = r0.f94737g
            if (r3 < 0) goto L_0x005e
            if (r0 != 0) goto L_0x0040
            int r0 = r3 + -1
            if (r0 < 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            android.support.v7.widget.RecyclerView r1 = r5.f94613q
            if (r1 == 0) goto L_0x004a
            android.support.v7.widget.RecyclerView$i r1 = r1.getLayoutManager()
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            boolean r3 = r1 instanceof android.support.p043v7.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0055
            android.support.v7.widget.LinearLayoutManager r1 = (android.support.p043v7.widget.LinearLayoutManager) r1
            r1.mo4721a(r0, r2)
            goto L_0x005e
        L_0x0055:
            boolean r3 = r1 instanceof android.support.p043v7.widget.StaggeredGridLayoutManager
            if (r3 == 0) goto L_0x005e
            android.support.v7.widget.StaggeredGridLayoutManager r1 = (android.support.p043v7.widget.StaggeredGridLayoutManager) r1
            r1.mo4721a(r0, r2)
        L_0x005e:
            com.ss.android.ugc.aweme.mix.u r0 = r5.mo76347g()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.f81461a
            r0.f94734d = r6
            java.util.Set<com.ss.android.ugc.aweme.mix.CommonLogicViewHolder> r0 = r0.f94733c
            java.util.Iterator r0 = r0.iterator()
        L_0x006c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.mix.CommonLogicViewHolder r1 = (com.p683ss.android.ugc.aweme.mix.CommonLogicViewHolder) r1
            r1.mo76297a(r6)
            goto L_0x006c
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.onFullFeedVideoChangeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.a):void");
    }

    public final void onClick(View view) {
        Integer num;
        User user;
        ClickInstrumentation.onClick(view);
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (num != null && num.intValue() == R.id.cmr) {
            MixStruct mixStruct = this.f94581B;
            if (mixStruct != null) {
                MixStatusStruct mixStatusStruct = mixStruct.status;
                if (mixStatusStruct != null) {
                    if (mixStatusStruct.getStatus() == 1) {
                        C10691a.m21542b((Context) C11016e.m22312g(), (int) R.string.c6t).mo19066a();
                    } else if (mixStatusStruct.getStatus() == 3 || mixStatusStruct.getStatus() == 4) {
                        C10691a.m21542b((Context) C11016e.m22312g(), (int) R.string.c6s).mo19066a();
                    } else {
                        MixStruct mixStruct2 = this.f94581B;
                        if (mixStruct2 != null) {
                            user = mixStruct2.author;
                        } else {
                            user = null;
                        }
                        if (user == null || !user.isSecret()) {
                            String str2 = this.f94604d;
                            MixStruct mixStruct3 = this.f94581B;
                            if (mixStruct3 != null) {
                                User user2 = mixStruct3.author;
                                if (user2 != null) {
                                    str = user2.getUid();
                                }
                            }
                            C26890h.m65011a("open_compilation_share_board", C23089d.m56640a().mo47829a("enter_from", "compilation_detail").mo47829a("compilation_id", str2).mo47829a("author_id", str).mo47829a("previous_page", this.f94606j).f61491a);
                            mo22552a(mo76346e(), new C37047j(this));
                            return;
                        }
                        C10691a.m21542b((Context) C11016e.m22312g(), (int) R.string.c6r).mo19066a();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r5.isCollected() == 1) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76344a(com.p683ss.android.ugc.aweme.mix.MixInfo r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r4.f94590K
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            com.ss.android.ugc.aweme.feed.model.MixStruct r5 = r5.mixInfo
            if (r5 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.feed.model.MixStatusStruct r5 = r5.status
            if (r5 == 0) goto L_0x0017
            int r5 = r5.isCollected()
            r0 = 1
            if (r5 == r0) goto L_0x003c
        L_0x0017:
            java.lang.Long r5 = r4.f94603c
            if (r5 == 0) goto L_0x003c
            java.lang.Long r5 = r4.f94603c
            if (r5 != 0) goto L_0x0020
            goto L_0x002a
        L_0x0020:
            long r0 = r5.longValue()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x003c
        L_0x002a:
            com.ss.android.ugc.aweme.mix.aa r5 = r4.f94592M
            r0 = 0
            r5.f94522b = r0
            com.ss.android.ugc.aweme.mix.aa r5 = r4.f94592M
            r0 = 4634766966517661696(0x4052000000000000, double:72.0)
            int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r0)
            r5.f94523c = r0
            r4.mo76353o()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37032j.mo76344a(com.ss.android.ugc.aweme.mix.MixInfo):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C1332i iVar;
        C1331h hVar;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f94588I = C31214w.m72902a("mix_show_top_bubble_flag");
        C37024f fVar = new C37024f(this.f94593P, this.f94594Q, this.f94595R, "inner_down", this.f94606j, null, true);
        this.f94619w = fVar;
        MixDetailViewModel e = mo76346e();
        e.f94490i = this.f94604d;
        e.f94489h.mo22565b();
        RecyclerView recyclerView = this.f94613q;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setAdapter(mo76347g());
            mo76346e().f94487f = mo76347g();
            Activity activity = getActivity();
            C52711k.m112240b(recyclerView, "mRecyclerView");
            if (MixCellStyleExperiment.singleRow) {
                if (activity == null) {
                    C52711k.m112234a();
                }
                iVar = new WrapLinearLayoutManager(activity, 1, false);
            } else {
                iVar = new MixCellStyleExperiment$createLayoutManager$1(recyclerView, 2, 1);
            }
            recyclerView.setLayoutManager(iVar);
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity2, "activity!!");
            Context context = activity2;
            C52711k.m112240b(context, "context");
            if (MixCellStyleExperiment.singleRow) {
                hVar = null;
            } else {
                hVar = new C37089t(context);
            }
            if (hVar != null) {
                recyclerView.mo4798a(hVar);
            }
            recyclerView.mo4801a((C1340m) new C37052o(C9432q.m18688b(getActivity()), this));
        }
        C47843ee.m103486a(this.f94613q, this);
        DmtStatusView dmtStatusView = this.f94615s;
        if (dmtStatusView != null) {
            dmtStatusView.mo19212f();
        }
        ListMiddleware.m24163a(mo76346e().f94489h, this, mo76347g(), false, false, new C37050m(C37056r.f94662a, C37059t.f94665a, new C37057s(this)), new C37051n(new C37060u(this), new C37062v(this), new C37063w(this)), new C37065x(this), C37068y.f94674a, null, null, 780, null);
        C11798a.m24151a(this, mo76346e(), C37071l.f94676a, null, C37055q.f94661a, null, new C37053p(this), 10, null);
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            this.f94582C = (DetailViewModel) C0214z.m440a(activity3).mo359a(DetailViewModel.class);
        }
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.of, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.f94613q = (RecyclerView) frameLayout.findViewById(R.id.bmn);
            RecyclerView recyclerView = this.f94613q;
            if (!(recyclerView instanceof FpsRecyclerView)) {
                recyclerView = null;
            }
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) recyclerView;
            if (fpsRecyclerView != null) {
                fpsRecyclerView.setLabel("mix_detail_list");
            }
            MixRefreshLayout mixRefreshLayout = (MixRefreshLayout) frameLayout.findViewById(R.id.cau);
            mixRefreshLayout.setEnabled(true);
            mixRefreshLayout.setRecyclerView(this.f94613q);
            mixRefreshLayout.setOnRefreshListener(new C37048k(this));
            this.f94612p = mixRefreshLayout;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C52711k.m112236a((Object) activity, "it");
                C37072m mVar = new C37072m(activity, this.f94605e, this.f94606j, this.f94604d, new C37040d(this), this.f94611o);
                this.f94614r = mVar;
                ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new C37049l(this, frameLayout));
                }
            }
            OnClickListener onClickListener = this;
            frameLayout.findViewById(R.id.ik).setOnClickListener(onClickListener);
            this.f94583D = frameLayout.findViewById(R.id.cmr);
            View view = this.f94583D;
            if (view != null) {
                view.setOnClickListener(onClickListener);
            }
            this.f94615s = (DmtStatusView) frameLayout.findViewById(R.id.csv);
            C10719a a = C10719a.m21676a((Context) getActivity());
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C52711k.m112236a((Object) activity2, "it");
                Context context = activity2;
                C52711k.m112240b(context, "context");
                DmtTextView dmtTextView = new DmtTextView(context);
                dmtTextView.setTextColor(context.getResources().getColor(R.color.at0));
                dmtTextView.setTextSize(15.0f);
                dmtTextView.setText(R.string.c6q);
                a.mo19231b((View) dmtTextView);
            }
            DmtStatusView dmtStatusView = this.f94615s;
            if (dmtStatusView != null) {
                dmtStatusView.setBuilder(a);
            }
            this.f94616t = frameLayout.findViewById(R.id.bm7);
            this.f94593P = frameLayout.findViewById(R.id.bm6);
            this.f94594Q = (CheckableImageView) frameLayout.findViewById(R.id.bml);
            this.f94595R = (DmtTextView) frameLayout.findViewById(R.id.bmq);
            this.f94618v = (RelativeLayout) frameLayout.findViewById(R.id.d17);
            RelativeLayout relativeLayout = this.f94618v;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
            }
            this.f94617u = (DmtTextView) frameLayout.findViewById(R.id.title);
            return frameLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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
