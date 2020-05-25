package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.C11795c;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.C11935v;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.C23470g;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.p683ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout.C28023b;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.AwemeListState;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2643g.C52733a;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder */
public class MediaMixListViewHolder extends JediBaseViewHolder<MediaMixListViewHolder, Object> implements C28023b {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f101373g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaMixListViewHolder.class), "awemeListViewModel", "getAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: s */
    public static final C39720b f101374s = new C39720b(null);

    /* renamed from: j */
    public C39771q f101375j;

    /* renamed from: k */
    public final RecyclerView f101376k;

    /* renamed from: l */
    final ViewStub f101377l;

    /* renamed from: m */
    public final LinearLayout f101378m;

    /* renamed from: n */
    public View f101379n;

    /* renamed from: o */
    public String f101380o = "";

    /* renamed from: p */
    public String f101381p = "";

    /* renamed from: q */
    public String f101382q;

    /* renamed from: r */
    public MediaMixList f101383r;

    /* renamed from: t */
    private final ScrollToOpenLayout f101384t;

    /* renamed from: u */
    private final C52668f f101385u;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$a */
    public static final class C39719a extends C52712l implements C52670a<JediAwemeListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f101386a;

        /* renamed from: b */
        final /* synthetic */ C52760c f101387b;

        /* renamed from: c */
        final /* synthetic */ C52760c f101388c;

        public C39719a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f101386a = jediViewHolder;
            this.f101387b = cVar;
            this.f101388c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel]
          mth insns count: 49
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f101386a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f101388c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                boolean r2 = r0 instanceof android.support.p030v4.app.Fragment
                if (r2 == 0) goto L_0x0059
                android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                r2 = r0
            L_0x0020:
                if (r2 == 0) goto L_0x003c
                android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x0037 }
                android.arch.lifecycle.y r3 = android.arch.lifecycle.C0214z.m439a(r2, r3)     // Catch:{ ae -> 0x0037 }
                d.k.c r4 = r5.f101387b     // Catch:{ ae -> 0x0037 }
                java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x0037 }
                android.arch.lifecycle.x r3 = r3.mo360a(r1, r4)     // Catch:{ ae -> 0x0037 }
                com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3     // Catch:{ ae -> 0x0037 }
                goto L_0x003d
            L_0x0037:
                android.support.v4.app.Fragment r2 = r2.getParentFragment()
                goto L_0x0020
            L_0x003c:
                r3 = 0
            L_0x003d:
                if (r3 != 0) goto L_0x0058
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f101387b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                r3 = r0
                com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
            L_0x0058:
                return r3
            L_0x0059:
                boolean r2 = r0 instanceof android.support.p030v4.app.FragmentActivity
                if (r2 == 0) goto L_0x0079
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f101387b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0079:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder.C39719a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$b */
    public static final class C39720b {
        private C39720b() {
        }

        public /* synthetic */ C39720b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$c */
    public static final class C39721c implements C11854c<MixStruct, MediaMixListViewHolder> {

        /* renamed from: a */
        final /* synthetic */ C52671b f101389a;

        /* renamed from: b */
        final /* synthetic */ C52682m f101390b;

        /* renamed from: c */
        final /* synthetic */ C52682m f101391c;

        /* renamed from: d */
        private final C52671b<MediaMixListViewHolder, C52860x> f101392d;

        /* renamed from: e */
        private final C52682m<MediaMixListViewHolder, Throwable, C52860x> f101393e;

        /* renamed from: f */
        private final C52682m<MediaMixListViewHolder, List<? extends MixStruct>, C52860x> f101394f;

        /* renamed from: a */
        public final C52671b<MediaMixListViewHolder, C52860x> mo22601a() {
            return this.f101392d;
        }

        /* renamed from: b */
        public final C52682m<MediaMixListViewHolder, Throwable, C52860x> mo22602b() {
            return this.f101393e;
        }

        /* renamed from: c */
        public final C52682m<MediaMixListViewHolder, List<? extends MixStruct>, C52860x> mo22603c() {
            return this.f101394f;
        }

        public C39721c(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f101389a = bVar;
            this.f101390b = mVar;
            this.f101391c = mVar2;
            this.f101392d = bVar;
            this.f101393e = mVar;
            this.f101394f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$d */
    public static final class C39722d extends C1331h {

        /* renamed from: a */
        public final float f101395a;

        /* renamed from: b */
        public final float f101396b;

        /* renamed from: c */
        final /* synthetic */ MediaMixListViewHolder f101397c;

        C39722d(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f101397c = mediaMixListViewHolder;
            this.f101395a = C9432q.m18687b(mediaMixListViewHolder.f101376k.getContext(), 12.0f);
            this.f101396b = C9432q.m18687b(mediaMixListViewHolder.f101376k.getContext(), 2.0f);
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                rect.left = C52733a.m112277a(this.f101395a);
                rect.right = C52733a.m112277a(this.f101396b);
            } else if (f == MediaMixListViewHolder.m88427a(this.f101397c).getItemCount() - 1) {
                rect.left = C52733a.m112277a(this.f101396b);
                rect.right = C52733a.m112277a(this.f101395a);
            } else {
                rect.left = C52733a.m112277a(this.f101396b);
                rect.right = C52733a.m112277a(this.f101396b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$e */
    public static final class C39723e extends C1340m {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f101398a;

        /* renamed from: b */
        private int f101399b;

        /* renamed from: c */
        private int f101400c;

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$e$a */
        static final class C39724a extends C52712l implements C52671b<MediaMixListState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ String f101401a;

            C39724a(String str) {
                this.f101401a = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                MediaMixListState mediaMixListState = (MediaMixListState) obj;
                C52711k.m112240b(mediaMixListState, "it");
                C26890h.m65011a("slide_compilation_list", C23089d.m56640a().mo47829a("enter_from", mediaMixListState.getEnterFrom()).mo47829a("direction", this.f101401a).f61491a);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$e$b */
        static final class C39725b extends C52712l implements C52671b<MediaMixListState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C39723e f101402a;

            C39725b(C39723e eVar) {
                this.f101402a = eVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                MediaMixListState mediaMixListState = (MediaMixListState) obj;
                C52711k.m112240b(mediaMixListState, "it");
                if (mediaMixListState.getListState().getLoadMore() instanceof C11795c) {
                    this.f101402a.f101398a.mo80826p().f103535g.mo22567c();
                }
                return C52860x.f131107a;
            }
        }

        C39723e(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f101398a = mediaMixListViewHolder;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            String str;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.f101399b == 1) {
                if (this.f101400c < recyclerView.computeHorizontalScrollOffset()) {
                    str = "left";
                } else {
                    str = "right";
                }
                this.f101398a.mo22552a(this.f101398a.mo80826p(), (C52671b<? super S1, ? extends R>) new C39724a<Object,Object>(str));
            }
            this.f101399b = i;
            this.f101400c = recyclerView.computeHorizontalScrollOffset();
            this.f101398a.mo22552a(this.f101398a.mo80826p(), (C52671b<? super S1, ? extends R>) new C39725b<Object,Object>(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$f */
    static final class C39726f implements C26846a {

        /* renamed from: a */
        public static final C39726f f101403a = new C39726f();

        C39726f() {
        }

        public final void ar_() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$g */
    static final class C39727g extends C52712l implements C52671b<MediaMixListViewHolder, C52860x> {

        /* renamed from: a */
        public static final C39727g f101404a = new C39727g();

        C39727g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) obj;
            C52711k.m112240b(mediaMixListViewHolder, "$receiver");
            MediaMixListViewHolder.m88427a(mediaMixListViewHolder).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$h */
    static final class C39728h extends C52712l implements C52682m<MediaMixListViewHolder, List<? extends MixStruct>, C52860x> {

        /* renamed from: a */
        public static final C39728h f101405a = new C39728h();

        C39728h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) obj;
            List list = (List) obj2;
            C52711k.m112240b(mediaMixListViewHolder, "$receiver");
            C52711k.m112240b(list, "it");
            MediaMixListViewHolder.m88427a(mediaMixListViewHolder).ao_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$i */
    static final class C39729i extends C52712l implements C52682m<MediaMixListViewHolder, Throwable, C52860x> {

        /* renamed from: a */
        public static final C39729i f101406a = new C39729i();

        C39729i() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(mediaMixListViewHolder, "$receiver");
            C52711k.m112240b(th, "it");
            MediaMixListViewHolder.m88427a(mediaMixListViewHolder).ao_();
            C32458a.m75148a(th);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$j */
    static final class C39730j extends C52712l implements C52671b<MediaMixListState, MediaMixListState> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f101407a;

        C39730j(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f101407a = mediaMixListViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "$receiver");
            String str = this.f101407a.f101380o;
            String str2 = this.f101407a.f101381p;
            MediaMixList mediaMixList = this.f101407a.f101383r;
            if (mediaMixList == null) {
                Object o = this.f101407a.mo22689o();
                if (o != null) {
                    mediaMixList = (MediaMixList) o;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.MediaMixList");
                }
            }
            MediaMixList mediaMixList2 = mediaMixList;
            String str3 = this.f101407a.f101382q;
            if (str3 == null) {
                str3 = "";
            }
            return MediaMixListState.copy$default(mediaMixListState, str, str2, str3, mediaMixList2, null, 16, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$k */
    static final class C39731k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f101408a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f101409b;

        C39731k(MediaMixListViewHolder mediaMixListViewHolder, MixStruct mixStruct) {
            this.f101408a = mediaMixListViewHolder;
            this.f101409b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101408a.mo22552a(this.f101408a.mo80826p(), (C52671b<? super S1, ? extends R>) new C52671b<MediaMixListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C39731k f101410a;

                {
                    this.f101410a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MediaMixListState mediaMixListState = (MediaMixListState) obj;
                    C52711k.m112240b(mediaMixListState, "it");
                    View view = this.f101410a.f101408a.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", this.f101410a.f101409b.mixId).withParam("uid", mediaMixListState.getUid()).withParam("event_type", mediaMixListState.getEnterFrom()).withParam("enter_method", "direct_click").withParam(C47661ab.m103163a().mo94972a("uid", mediaMixListState.getUid()).mo94972a(C22835a.f61196a, mediaMixListState.getSuid()).f120139a).open();
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$l */
    static final class C39733l extends C52712l implements C52671b<AwemeListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f101411a;

        C39733l(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f101411a = mediaMixListViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AwemeListState awemeListState = (AwemeListState) obj;
            C52711k.m112240b(awemeListState, "it");
            MediaMixListViewHolder mediaMixListViewHolder = this.f101411a;
            String label = awemeListState.getLabel();
            if (label == null) {
                label = "";
            }
            mediaMixListViewHolder.f101382q = label;
            MediaMixListViewHolder mediaMixListViewHolder2 = this.f101411a;
            String userId = awemeListState.getUserId();
            if (userId == null) {
                userId = "";
            }
            mediaMixListViewHolder2.mo80824a(userId);
            MediaMixListViewHolder mediaMixListViewHolder3 = this.f101411a;
            String secUserId = awemeListState.getSecUserId();
            if (secUserId == null) {
                secUserId = "";
            }
            mediaMixListViewHolder3.mo80825b(secUserId);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$m */
    static final class C39734m extends C52712l implements C52682m<MediaMixListViewHolder, MediaMixList, C52860x> {

        /* renamed from: a */
        public static final C39734m f101412a = new C39734m();

        C39734m() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) obj;
            MediaMixList mediaMixList = (MediaMixList) obj2;
            C52711k.m112240b(mediaMixListViewHolder, "$receiver");
            C52711k.m112240b(mediaMixList, "it");
            List<MixStruct> list = mediaMixList.mixInfos;
            if (list == null || list.size() != 1) {
                View view = mediaMixListViewHolder.f101379n;
                if (view != null) {
                    view.setVisibility(8);
                }
                mediaMixListViewHolder.f101376k.setVisibility(0);
                if (mediaMixListViewHolder.f101375j != null) {
                    RecyclerView recyclerView = mediaMixListViewHolder.f101376k;
                    C39771q qVar = mediaMixListViewHolder.f101375j;
                    if (qVar == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    recyclerView.setAdapter(qVar);
                } else {
                    mediaMixListViewHolder.f101375j = new C39771q(mediaMixListViewHolder.mo22678n(), mediaMixListViewHolder.mo80826p());
                    RecyclerView recyclerView2 = mediaMixListViewHolder.f101376k;
                    View view2 = mediaMixListViewHolder.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    recyclerView2.setLayoutManager(new WrapLinearLayoutManager(view2.getContext(), 0, false));
                    RecyclerView recyclerView3 = mediaMixListViewHolder.f101376k;
                    C39771q qVar2 = mediaMixListViewHolder.f101375j;
                    if (qVar2 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    recyclerView3.setAdapter(qVar2);
                    mediaMixListViewHolder.f101376k.mo4798a((C1331h) new C39722d(mediaMixListViewHolder));
                    mediaMixListViewHolder.f101376k.mo4801a((C1340m) new C39723e(mediaMixListViewHolder));
                    C39771q qVar3 = mediaMixListViewHolder.f101375j;
                    if (qVar3 == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    qVar3.mo54788a((C26846a) C39726f.f101403a);
                    ListMiddleware<MediaMixListState, MixStruct, C23470g> listMiddleware = mediaMixListViewHolder.mo80826p().f103535g;
                    C11797e eVar = mediaMixListViewHolder;
                    C1322a adapter = mediaMixListViewHolder.f101376k.getAdapter();
                    if (adapter != null) {
                        ListMiddleware.m24163a(listMiddleware, eVar, (C39771q) adapter, false, false, null, new C39721c(C39727g.f101404a, C39729i.f101406a, C39728h.f101405a), null, null, null, null, 988, null);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.adapter.MediaMixAdapter");
                    }
                }
                mediaMixListViewHolder.f101376k.mo4814b(0);
                mediaMixListViewHolder.mo80826p().f103535g.mo22565b();
                mediaMixListViewHolder.f101378m.setVisibility(0);
            } else {
                mediaMixListViewHolder.f101376k.setVisibility(8);
                mediaMixListViewHolder.f101376k.setAdapter(null);
                View view3 = mediaMixListViewHolder.f101379n;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                if (mediaMixListViewHolder.f101379n == null) {
                    View view4 = mediaMixListViewHolder.f101379n;
                    if (view4 == null) {
                        view4 = mediaMixListViewHolder.f101377l.inflate();
                    }
                    mediaMixListViewHolder.f101379n = view4;
                }
                MixStruct mixStruct = (MixStruct) C52575l.m112137e(mediaMixList.mixInfos);
                C52711k.m112240b(mixStruct, "item");
                View view5 = mediaMixListViewHolder.f101379n;
                if (view5 != null) {
                    TextView textView = (TextView) view5.findViewById(R.id.bmp);
                    if (textView != null) {
                        textView.setText(mixStruct.mixName);
                    }
                }
                View view6 = mediaMixListViewHolder.f101379n;
                if (view6 != null) {
                    view6.setOnClickListener(new C39731k(mediaMixListViewHolder, mixStruct));
                }
                mediaMixListViewHolder.mo80826p().mo82863a(mixStruct);
                mediaMixListViewHolder.f101378m.setVisibility(8);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$n */
    static final class C39735n extends C52712l implements C52671b<MediaMixListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f101413a;

        C39735n(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f101413a = mediaMixListViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "state");
            C41713b.f105569a.startProfileVideoMixListActivity(this.f101413a.f101376k.getContext(), this.f101413a.f101380o, this.f101413a.f101381p, mediaMixListState.getEnterFrom());
            return C52860x.f131107a;
        }
    }

    public final void bH_() {
        mo22552a(mo80826p(), (C52671b<? super S1, ? extends R>) new C39735n<Object,Object>(this));
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        if (this.f101382q == null) {
            mo22552a((JediAwemeListViewModel) this.f101385u.getValue(), (C52671b<? super S1, ? extends R>) new C39733l<Object,Object>(this));
        }
        mo22547a(mo80826p(), C39773r.f101526a, C11935v.m24276a(true), C39734m.f101412a);
        this.f101384t.setOnScrollToEndListener(this);
    }

    /* renamed from: p */
    public final MediaMixListViewModel mo80826p() {
        C52671b jVar = new C39730j(this);
        Class<MediaMixListViewModel> cls = MediaMixListViewModel.class;
        C11944b b = mo22666b();
        if (b != null) {
            C11972h a = C11973a.m24361a(mo22542a(), b.mo22685b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo22706a(sb.toString(), cls);
            C11926m a2 = jediViewModel.f31279c.mo22643a(MediaMixListViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo22526a(jVar);
            return (MediaMixListViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: a */
    public final void mo80824a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f101380o = str;
    }

    /* renamed from: b */
    public final void mo80825b(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f101381p = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C39771q m88427a(MediaMixListViewHolder mediaMixListViewHolder) {
        C39771q qVar = mediaMixListViewHolder.f101375j;
        if (qVar == null) {
            C52711k.m112237a("mAdapter");
        }
        return qVar;
    }

    public MediaMixListViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bph, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_mix_list, parent, false)");
        super(inflate);
        View findViewById = this.itemView.findViewById(R.id.bbq);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.listView)");
        this.f101376k = (RecyclerView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bku);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.media_mix_span_whole)");
        this.f101377l = (ViewStub) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.chw);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.scroll_to_open)");
        this.f101384t = (ScrollToOpenLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.f8_);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.whole_mix_ll)");
        this.f101378m = (LinearLayout) findViewById4;
        C52760c a = C52728w.m112245a(JediAwemeListViewModel.class);
        this.f101385u = C52732g.m112285a(new C39719a(this, a, a));
    }
}
