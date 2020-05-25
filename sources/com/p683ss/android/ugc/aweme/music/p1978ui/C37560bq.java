package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37489a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37491c;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37491c.C37492a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1984f.C37610a.C37611a;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.C37669a;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37679a;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.SimilarMusicListState;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.SimilarMusicListViewModel;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bq */
public final class C37560bq extends C37627o implements C37492a {

    /* renamed from: e */
    static final /* synthetic */ C52767h[] f95817e = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37560bq.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/music/ui/viewmodel/SimilarMusicListViewModel;"))};

    /* renamed from: q */
    public static final C37564c f95818q = new C37564c(null);

    /* renamed from: j */
    public String f95819j;

    /* renamed from: k */
    String f95820k;

    /* renamed from: l */
    String f95821l;

    /* renamed from: m */
    String f95822m;

    /* renamed from: n */
    public C37491c f95823n;

    /* renamed from: o */
    public boolean f95824o;

    /* renamed from: p */
    public float f95825p;

    /* renamed from: r */
    private int f95826r;

    /* renamed from: s */
    private int f95827s;

    /* renamed from: t */
    private C10719a f95828t;

    /* renamed from: u */
    private boolean f95829u;

    /* renamed from: v */
    private final lifecycleAwareLazy f95830v;

    /* renamed from: w */
    private HashMap f95831w;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$a */
    public static final class C37561a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f95832a;

        public C37561a(C52760c cVar) {
            this.f95832a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f95832a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$b */
    public static final class C37562b extends C52712l implements C52670a<SimilarMusicListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f95833a;

        /* renamed from: b */
        final /* synthetic */ C52670a f95834b;

        /* renamed from: c */
        final /* synthetic */ C52760c f95835c;

        /* renamed from: d */
        final /* synthetic */ C52682m f95836d;

        public C37562b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f95833a = fragment;
            this.f95834b = aVar;
            this.f95835c = cVar;
            this.f95836d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.SimilarMusicListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f95833a
                android.support.v4.app.Fragment r1 = r3.f95833a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f95834b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f95835c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel> r2 = com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.SimilarMusicListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.music.ui.bq$b$1 r1 = new com.ss.android.ugc.aweme.music.ui.bq$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.C37560bq.C37562b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$c */
    public static final class C37564c {
        private C37564c() {
        }

        public /* synthetic */ C37564c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$d */
    static final class C37565d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95838a;

        C37565d(C37560bq bqVar) {
            this.f95838a = bqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95838a.mo77093k().f96073f.mo22565b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$e */
    static final class C37566e implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95839a;

        C37566e(C37560bq bqVar) {
            this.f95839a = bqVar;
        }

        public final void ar_() {
            this.f95839a.mo77093k().f96073f.mo22567c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$f */
    public static final class C37567f implements C1339l {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95840a;

        /* renamed from: a */
        public final void mo5079a(boolean z) {
        }

        /* renamed from: b */
        public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "p0");
            C52711k.m112240b(motionEvent, "p1");
        }

        C37567f(C37560bq bqVar) {
            this.f95840a = bqVar;
        }

        /* renamed from: a */
        public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "p0");
            C52711k.m112240b(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f95840a.f95825p = motionEvent.getY();
                    break;
                case 1:
                    this.f95840a.f95825p = motionEvent.getY() - this.f95840a.f95825p;
                    if (this.f95840a.f95825p <= 10.0f) {
                        if (this.f95840a.f95825p < -10.0f) {
                            C37611a.m84059a(this.f95840a.f95819j, true);
                            break;
                        }
                    } else {
                        C37611a.m84059a(this.f95840a.f95819j, false);
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$g */
    public static final class C37568g extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95841a;

        /* renamed from: b */
        final /* synthetic */ C52723a f95842b;

        C37568g(C37560bq bqVar, C52723a aVar) {
            this.f95841a = bqVar;
            this.f95842b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onScrolled(android.support.p043v7.widget.RecyclerView r11, int r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "recyclerView"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                super.onScrolled(r11, r12, r13)
                com.ss.android.ugc.aweme.music.ui.bq r11 = r10.f95841a
                r12 = 2132022436(0x7f1414a4, float:1.9683292E38)
                android.view.View r11 = r11.mo77089b(r12)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                r0 = 0
                if (r11 == 0) goto L_0x0021
                android.view.View r11 = r11.getChildAt(r0)
                if (r11 == 0) goto L_0x0021
                int r11 = r11.getHeight()
                goto L_0x0022
            L_0x0021:
                r11 = 0
            L_0x0022:
                d.f.b.v$a r1 = r10.f95842b
                boolean r1 = r1.element
                r2 = 1
                if (r1 == 0) goto L_0x0124
                int r1 = java.lang.Math.abs(r13)
                if (r1 <= 0) goto L_0x0124
                com.ss.android.ugc.aweme.music.ui.bq r1 = r10.f95841a
                android.view.View r3 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
                java.lang.String r4 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                android.support.v7.widget.RecyclerView$i r3 = r3.getLayoutManager()
                if (r3 == 0) goto L_0x011c
                android.support.v7.widget.LinearLayoutManager r3 = (android.support.p043v7.widget.LinearLayoutManager) r3
                int r3 = r3.mo4751l()
                float r4 = r1.mo77090c(r11)
                int r4 = (int) r4
                com.ss.android.ugc.aweme.music.ui.a.c r5 = r1.f95823n
                if (r5 != 0) goto L_0x0056
                java.lang.String r6 = "mAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0056:
                int r5 = r5.getItemCount()
                int r5 = r5 - r2
                if (r3 != r5) goto L_0x00b6
                android.view.View r3 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
                java.lang.String r5 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                int r3 = r3.getHeight()
                int r3 = r3 + r4
                int r3 = r3 % r11
                if (r3 != 0) goto L_0x0074
                r1.f95824o = r2
                r1 = r11
                goto L_0x00b7
            L_0x0074:
                boolean r3 = r1.f95824o
                if (r3 != 0) goto L_0x00a3
                android.view.View r3 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
                java.lang.String r5 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                int r3 = r3.getHeight()
                int r3 = r3 + r4
                int r3 = r3 % r11
                double r5 = com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.C37669a.f96068b
                int r5 = (int) r5
                if (r3 <= r5) goto L_0x008f
                goto L_0x00a3
            L_0x008f:
                android.view.View r1 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
                java.lang.String r3 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                int r1 = r1.getHeight()
                int r4 = r4 + r1
                int r4 = r4 % r11
                int r1 = r11 + r4
                goto L_0x00b7
            L_0x00a3:
                android.view.View r1 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
                java.lang.String r3 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                int r1 = r1.getHeight()
                int r4 = r4 + r1
                int r1 = r4 % r11
                goto L_0x00b7
            L_0x00b6:
                r1 = 0
            L_0x00b7:
                double r3 = (double) r1
                double r5 = (double) r11
                r7 = 4606732058837280358(0x3fee666666666666, double:0.95)
                java.lang.Double.isNaN(r5)
                double r5 = r5 * r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x0124
                com.ss.android.ugc.aweme.music.ui.bq r11 = r10.f95841a
                android.view.View r11 = r11.mo77089b(r12)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                java.lang.String r13 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r13)
                android.support.v7.widget.RecyclerView$i r11 = r11.getLayoutManager()
                if (r11 == 0) goto L_0x0114
                android.support.v7.widget.LinearLayoutManager r11 = (android.support.p043v7.widget.LinearLayoutManager) r11
                int r11 = r11.mo4751l()
                com.ss.android.ugc.aweme.music.ui.bq r13 = r10.f95841a
                android.view.View r13 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r13 = (android.support.p043v7.widget.RecyclerView) r13
                android.support.v7.widget.RecyclerView$v r13 = r13.mo4844e(r11)
                boolean r1 = r13 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r1 == 0) goto L_0x00f5
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r13 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r13
                r13.mo77156p()
            L_0x00f5:
                com.ss.android.ugc.aweme.music.ui.bq r13 = r10.f95841a
                android.view.View r12 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r12 = (android.support.p043v7.widget.RecyclerView) r12
                int r11 = r11 - r2
                android.support.v7.widget.RecyclerView$v r11 = r12.mo4844e(r11)
                boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r12 == 0) goto L_0x010b
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r11 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r11
                r11.bC_()
            L_0x010b:
                d.f.b.v$a r11 = r10.f95842b
                r11.element = r0
                com.ss.android.ugc.aweme.music.ui.bq r11 = r10.f95841a
                r11.f95824o = r2
                return
            L_0x0114:
                d.u r11 = new d.u
                java.lang.String r12 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
                r11.<init>(r12)
                throw r11
            L_0x011c:
                d.u r11 = new d.u
                java.lang.String r12 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
                r11.<init>(r12)
                throw r11
            L_0x0124:
                com.ss.android.ugc.aweme.music.ui.bq r1 = r10.f95841a
                android.view.View r1 = r1.mo77089b(r12)
                android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
                boolean r1 = r1.canScrollVertically(r2)
                if (r1 != 0) goto L_0x0193
                d.f.b.v$a r1 = r10.f95842b
                boolean r1 = r1.element
                if (r1 != 0) goto L_0x0193
                int r13 = java.lang.Math.abs(r13)
                if (r13 <= 0) goto L_0x0193
                com.ss.android.ugc.aweme.music.ui.bq r11 = r10.f95841a
                android.view.View r11 = r11.mo77089b(r12)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                java.lang.String r13 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r13)
                android.support.v7.widget.RecyclerView$i r11 = r11.getLayoutManager()
                if (r11 == 0) goto L_0x018b
                android.support.v7.widget.LinearLayoutManager r11 = (android.support.p043v7.widget.LinearLayoutManager) r11
                int r11 = r11.mo4751l()
                com.ss.android.ugc.aweme.music.ui.bq r13 = r10.f95841a
                android.view.View r13 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r13 = (android.support.p043v7.widget.RecyclerView) r13
                android.support.v7.widget.RecyclerView$v r13 = r13.mo4844e(r11)
                boolean r1 = r13 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r1 == 0) goto L_0x016c
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r13 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r13
                r13.bC_()
            L_0x016c:
                com.ss.android.ugc.aweme.music.ui.bq r13 = r10.f95841a
                android.view.View r12 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r12 = (android.support.p043v7.widget.RecyclerView) r12
                int r11 = r11 - r2
                android.support.v7.widget.RecyclerView$v r11 = r12.mo4844e(r11)
                boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r12 == 0) goto L_0x0182
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r11 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r11
                r11.mo77156p()
            L_0x0182:
                d.f.b.v$a r11 = r10.f95842b
                r11.element = r2
                com.ss.android.ugc.aweme.music.ui.bq r11 = r10.f95841a
                r11.f95824o = r0
                return
            L_0x018b:
                d.u r11 = new d.u
                java.lang.String r12 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
                r11.<init>(r12)
                throw r11
            L_0x0193:
                d.f.b.v$a r13 = r10.f95842b
                boolean r13 = r13.element
                if (r13 != 0) goto L_0x023f
                com.ss.android.ugc.aweme.music.ui.bq r13 = r10.f95841a
                android.view.View r0 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r0 = (android.support.p043v7.widget.RecyclerView) r0
                java.lang.String r1 = "rv_list"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
                if (r0 == 0) goto L_0x0237
                android.support.v7.widget.LinearLayoutManager r0 = (android.support.p043v7.widget.LinearLayoutManager) r0
                int r0 = r0.mo4749j()
                float r1 = r13.mo77090c(r11)
                float r11 = (float) r11
                float r1 = r1 % r11
                android.view.View r3 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
                android.support.v7.widget.RecyclerView$v r3 = r3.mo4844e(r0)
                if (r3 == 0) goto L_0x0236
                boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r4 != 0) goto L_0x01c9
                goto L_0x0236
            L_0x01c9:
                com.ss.android.ugc.aweme.music.ui.a.c r4 = r13.f95823n
                if (r4 != 0) goto L_0x01d2
                java.lang.String r5 = "mAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x01d2:
                float r4 = r4.mo77033f()
                float r11 = r11 - r4
                double r4 = (double) r11
                com.ss.android.ugc.aweme.music.ui.a.c r11 = r13.f95823n
                if (r11 != 0) goto L_0x01e1
                java.lang.String r6 = "mAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x01e1:
                float r11 = r11.mo77033f()
                double r6 = (double) r11
                r8 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                java.lang.Double.isNaN(r6)
                double r6 = r6 * r8
                java.lang.Double.isNaN(r4)
                double r4 = r4 + r6
                double r6 = (double) r1
                int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r11 < 0) goto L_0x0215
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r3 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r3
                r3.mo77156p()
                android.view.View r11 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                int r0 = r0 + r2
                android.support.v7.widget.RecyclerView$v r11 = r11.mo4844e(r0)
                if (r11 == 0) goto L_0x023f
                boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r12 == 0) goto L_0x023f
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r11 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r11
                r11.bC_()
                return
            L_0x0215:
                r11 = 0
                int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r11 < 0) goto L_0x023f
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r3 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r3
                r3.bC_()
                android.view.View r11 = r13.mo77089b(r12)
                android.support.v7.widget.RecyclerView r11 = (android.support.p043v7.widget.RecyclerView) r11
                int r0 = r0 + r2
                android.support.v7.widget.RecyclerView$v r11 = r11.mo4844e(r0)
                if (r11 == 0) goto L_0x023f
                boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder
                if (r12 == 0) goto L_0x023f
                com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r11 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewholder.SimilarMusicListViewHolder) r11
                r11.mo77156p()
                goto L_0x023f
            L_0x0236:
                return
            L_0x0237:
                d.u r11 = new d.u
                java.lang.String r12 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
                r11.<init>(r12)
                throw r11
            L_0x023f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.C37560bq.C37568g.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$h */
    static final class C37569h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95843a;

        C37569h(C37560bq bqVar) {
            this.f95843a = bqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f95843a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$i */
    public static final class C37570i implements C11854c<C37682d, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f95844a;

        /* renamed from: b */
        final /* synthetic */ C52682m f95845b;

        /* renamed from: c */
        final /* synthetic */ C52682m f95846c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f95847d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f95848e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C37682d>, C52860x> f95849f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f95847d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f95848e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C37682d>, C52860x> mo22603c() {
            return this.f95849f;
        }

        public C37570i(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f95844a = bVar;
            this.f95845b = mVar;
            this.f95846c = mVar2;
            this.f95847d = bVar;
            this.f95848e = mVar;
            this.f95849f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$j */
    public static final class C37571j implements C11854c<C37682d, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f95850a;

        /* renamed from: b */
        final /* synthetic */ C52682m f95851b;

        /* renamed from: c */
        final /* synthetic */ C52682m f95852c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f95853d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f95854e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C37682d>, C52860x> f95855f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f95853d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f95854e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C37682d>, C52860x> mo22603c() {
            return this.f95855f;
        }

        public C37571j(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f95850a = bVar;
            this.f95851b = mVar;
            this.f95852c = mVar2;
            this.f95853d = bVar;
            this.f95854e = mVar;
            this.f95855f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$k */
    static final class C37572k extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95856a;

        C37572k(C37560bq bqVar) {
            this.f95856a = bqVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f95856a.mo77089b(R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$l */
    static final class C37573l extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95857a;

        C37573l(C37560bq bqVar) {
            this.f95857a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            ((DmtStatusView) this.f95857a.mo77089b(R.id.csv)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$m */
    static final class C37574m extends C52712l implements C52682m<C11866f, List<? extends C37682d>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95858a;

        C37574m(C37560bq bqVar) {
            this.f95858a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            if (!C9376b.m18558a((Collection<T>) list)) {
                ((DmtStatusView) this.f95858a.mo77089b(R.id.csv)).mo19209d();
            }
            fVar.mo22552a(this.f95858a.mo77093k(), new C52671b<SimilarMusicListState, Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C37574m f95859a;

                {
                    this.f95859a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
                    C52711k.m112240b(similarMusicListState, "it");
                    return Boolean.valueOf(this.f95859a.f95858a.mo77093k().mo77181a(((C37679a) similarMusicListState.getListState().getPayload()).f31449a.f31440a, ((C37679a) similarMusicListState.getListState().getPayload()).f96083c, ((C37679a) similarMusicListState.getListState().getPayload()).f96084d));
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$n */
    static final class C37576n extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95860a;

        C37576n(C37560bq bqVar) {
            this.f95860a = bqVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C37560bq.m84004a(this.f95860a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$o */
    static final class C37577o extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95861a;

        C37577o(C37560bq bqVar) {
            this.f95861a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C37560bq.m84004a(this.f95861a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$p */
    static final class C37578p extends C52712l implements C52682m<C11866f, List<? extends C37682d>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95862a;

        C37578p(C37560bq bqVar) {
            this.f95862a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f95862a.mo77093k(), new C52671b<SimilarMusicListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37578p f95863a;

                {
                    this.f95863a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
                    C52711k.m112240b(similarMusicListState, "it");
                    if (!this.f95863a.f95862a.mo77093k().mo77181a(((C37679a) similarMusicListState.getListState().getPayload()).f31449a.f31440a, ((C37679a) similarMusicListState.getListState().getPayload()).f96083c, ((C37679a) similarMusicListState.getListState().getPayload()).f96084d)) {
                        if (C9376b.m18558a((Collection<T>) similarMusicListState.getListState().getList())) {
                            ((DmtStatusView) this.f95863a.f95862a.mo77089b(R.id.csv)).mo19213g();
                        } else {
                            ((DmtStatusView) this.f95863a.f95862a.mo77089b(R.id.csv)).mo19209d();
                        }
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$q */
    static final class C37580q extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95864a;

        C37580q(C37560bq bqVar) {
            this.f95864a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C37560bq.m84004a(this.f95864a).ao_();
            } else {
                C37560bq.m84004a(this.f95864a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$r */
    static final class C37581r extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95865a;

        C37581r(C37560bq bqVar) {
            this.f95865a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            ((DmtStatusView) this.f95865a.mo77089b(R.id.csv)).mo19206b(false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bq$s */
    static final class C37582s extends C52712l implements C52682m<SimilarMusicListState, Bundle, SimilarMusicListState> {

        /* renamed from: a */
        final /* synthetic */ C37560bq f95866a;

        C37582s(C37560bq bqVar) {
            this.f95866a = bqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            String str2;
            String str3;
            String str4;
            SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
            Bundle bundle = (Bundle) obj2;
            C52711k.m112240b(similarMusicListState, "$receiver");
            C37560bq bqVar = this.f95866a;
            Bundle arguments = this.f95866a.getArguments();
            if (arguments != null) {
                str = arguments.getString("music_id");
            } else {
                str = null;
            }
            bqVar.f95819j = str;
            if (arguments != null) {
                str2 = arguments.getString("music_title");
            } else {
                str2 = null;
            }
            bqVar.f95820k = str2;
            if (arguments != null) {
                str3 = arguments.getString("anthor_id");
            } else {
                str3 = null;
            }
            bqVar.f95822m = str3;
            if (arguments != null) {
                str4 = arguments.getString("enter_type");
            } else {
                str4 = null;
            }
            bqVar.f95821l = str4;
            String str5 = this.f95866a.f95819j;
            if (str5 == null) {
                str5 = "";
            }
            return SimilarMusicListState.copy$default(similarMusicListState, str5, null, 2, null);
        }
    }

    /* renamed from: b */
    public final View mo77089b(int i) {
        if (this.f95831w == null) {
            this.f95831w = new HashMap();
        }
        View view = (View) this.f95831w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f95831w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final String mo77091g() {
        return "similar_song";
    }

    /* renamed from: j */
    public final void mo77092j() {
        if (this.f95831w != null) {
            this.f95831w.clear();
        }
    }

    /* renamed from: k */
    public final SimilarMusicListViewModel mo77093k() {
        return (SimilarMusicListViewModel) this.f95830v.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo77092j();
    }

    public final void onResume() {
        super.onResume();
        if (!this.f95829u) {
            C1352v e = ((RecyclerView) mo77089b(R.id.cg7)).mo4844e(this.f95826r);
            if (e instanceof C37489a) {
                ((C37489a) e).bC_();
            }
        }
    }

    public C37560bq() {
        C52682m sVar = new C37582s(this);
        C52760c a = C52728w.m112245a(SimilarMusicListViewModel.class);
        C52670a aVar = new C37561a(a);
        this.f95830v = new lifecycleAwareLazy(this, aVar, new C37562b(this, aVar, a, sVar));
    }

    public final void onPause() {
        super.onPause();
        RecyclerView recyclerView = (RecyclerView) mo77089b(R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo4749j();
            RecyclerView recyclerView2 = (RecyclerView) mo77089b(R.id.cg7);
            C52711k.m112236a((Object) recyclerView2, "rv_list");
            C1332i layoutManager2 = recyclerView2.getLayoutManager();
            if (layoutManager2 != null) {
                int l = ((LinearLayoutManager) layoutManager2).mo4751l();
                if (j <= l) {
                    while (true) {
                        if (j >= 0) {
                            C37491c cVar = this.f95823n;
                            if (cVar == null) {
                                C52711k.m112237a("mAdapter");
                            }
                            if (j < cVar.getItemCount()) {
                                C1352v e = ((RecyclerView) mo77089b(R.id.cg7)).mo4844e(j);
                                if (e instanceof C37489a) {
                                    ((C37489a) e).bB_();
                                }
                            }
                        }
                        if (j != l) {
                            j++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: a */
    public final void mo77036a(boolean z) {
        this.f95829u = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ C37491c m84004a(C37560bq bqVar) {
        C37491c cVar = bqVar.f95823n;
        if (cVar == null) {
            C52711k.m112237a("mAdapter");
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final float mo77090c(int i) {
        try {
            RecyclerView recyclerView = (RecyclerView) mo77089b(R.id.cg7);
            C52711k.m112236a((Object) recyclerView, "rv_list");
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int j = ((LinearLayoutManager) layoutManager).mo4749j();
                RecyclerView recyclerView2 = (RecyclerView) mo77089b(R.id.cg7);
                C52711k.m112236a((Object) recyclerView2, "rv_list");
                C1332i layoutManager2 = recyclerView2.getLayoutManager();
                if (layoutManager2 != null) {
                    View c = ((LinearLayoutManager) layoutManager2).mo4736c(j);
                    if (j >= 0) {
                        if (c != null) {
                            return (((float) (j * i)) + 0.0f) - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public final void mo77035a(Music music, int i) {
        String str;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            music.getOwnerId();
        }
        String str2 = this.f95819j;
        String str3 = this.f95822m;
        C26890h.m65011a("cancel_favourite_song", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("music_id", str).mo47829a("from_music_id", str2).f61491a);
    }

    /* renamed from: c */
    public final void mo77038c(Music music, int i) {
        String str;
        String str2 = this.f95819j;
        String str3 = this.f95822m;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            music.getOwnerId();
        }
        C26890h.m65011a("show_similar_song", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("music_id", str2).mo47829a("similar_song_id", str).f61491a);
    }

    /* renamed from: b */
    public final void mo77037b(Music music, int i) {
        String str;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            music.getOwnerId();
        }
        String str2 = this.f95819j;
        String str3 = this.f95822m;
        C26890h.m65011a("favourite_song", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("music_id", str).mo47829a("from_music_id", str2).f61491a);
    }

    /* renamed from: e */
    public final void mo77040e(Music music, int i) {
        String str;
        String uuid = UUID.randomUUID().toString();
        C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
        String str2 = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            music.getOwnerId();
        }
        String str3 = this.f95819j;
        String str4 = this.f95822m;
        C52711k.m112240b(uuid, "processId");
        C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("music_id", str).mo47829a("process_id", uuid).mo47829a("from_music_id", str3).f61491a);
        Intent intent = new Intent(getActivity(), MusicDetailActivity.class);
        String str5 = "id";
        if (music != null) {
            str2 = music.getMid();
        }
        intent.putExtra(str5, str2);
        intent.putExtra("extra_music_from", "similar_song");
        intent.putExtra("click_reason", 3);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    /* renamed from: d */
    public final void mo77039d(Music music, int i) {
        Object obj;
        if (music == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(music.convertToMusicModel(), getContext(), true)) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
            if (curUser.isLive()) {
                C10691a.m21548c(getContext(), (int) R.string.btm).mo19066a();
            } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                C10691a.m21548c(getContext(), (int) R.string.hr).mo19066a();
            } else if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                User curUser2 = g2.getCurUser();
                C52711k.m112236a((Object) curUser2, "AccountProxyService.userService().curUser");
                if (curUser2.isLive()) {
                    C10691a.m21548c(getContext(), (int) R.string.btm).mo19066a();
                } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                    C10691a.m21548c(getContext(), (int) R.string.hr).mo19066a();
                } else if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                    String uuid = UUID.randomUUID().toString();
                    C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
                    C23089d a = C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "similar_song");
                    String str = "music_id";
                    MusicModel musicModel = null;
                    if (music != null) {
                        obj = Long.valueOf(music.getId());
                    } else {
                        obj = null;
                    }
                    C26890h.m65011a("shoot", a.mo47828a(str, obj).f61491a);
                    mo77136a(new C37646v(getActivity(), this));
                    C37646v e = mo77137e();
                    if (music != null) {
                        musicModel = music.convertToMusicModel();
                    }
                    e.mo77153a(musicModel, false);
                } else {
                    C10691a.m21545b(getContext(), music.getOwnerBanShowInfo()).mo19066a();
                }
            } else {
                C10691a.m21545b(getContext(), music.getOwnerBanShowInfo()).mo19066a();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtStatusView dmtStatusView = (DmtStatusView) mo77089b(R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        C52711k.m112240b(dmtStatusView, "statusView");
        C10719a b = C10719a.m21676a((Context) getActivity()).mo19232b(C48190g.m104428a(getActivity(), new C37565d(this)));
        C52711k.m112236a((Object) b, "DmtStatusView.Builder.cr…orViewStatus(errorStatus)");
        this.f95828t = b;
        MtEmptyView a = MtEmptyView.m21697a((Context) getActivity());
        a.setStatus(new C10723a(getActivity()).mo19277a((int) R.drawable.din).mo19280b((int) R.string.gtd).mo19282c(R.string.gtc).f28711a);
        C10719a aVar = this.f95828t;
        if (aVar == null) {
            C52711k.m112237a("mStatusViewBuilder");
        }
        aVar.mo19231b((View) a);
        C10719a aVar2 = this.f95828t;
        if (aVar2 == null) {
            C52711k.m112237a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar2);
        this.f95823n = new C37491c(this);
        C37491c cVar = this.f95823n;
        if (cVar == null) {
            C52711k.m112237a("mAdapter");
        }
        C37492a aVar3 = this;
        C52711k.m112240b(aVar3, "onItemOperationListener");
        cVar.f95676e = aVar3;
        C37491c cVar2 = this.f95823n;
        if (cVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        cVar2.mo54798c(false);
        C37491c cVar3 = this.f95823n;
        if (cVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        cVar3.mo54788a((C26846a) new C37566e(this));
        RecyclerView recyclerView = (RecyclerView) mo77089b(R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        C37491c cVar4 = this.f95823n;
        if (cVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView.setAdapter(cVar4);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        RecyclerView recyclerView2 = (RecyclerView) mo77089b(R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        recyclerView2.setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) mo77089b(R.id.cg7)).mo4798a((C1331h) new C37669a());
        C52723a aVar4 = new C52723a();
        aVar4.element = false;
        ((RecyclerView) mo77089b(R.id.cg7)).mo4800a((C1339l) new C37567f(this));
        ((RecyclerView) mo77089b(R.id.cg7)).mo4801a((C1340m) new C37568g(this, aVar4));
        ListMiddleware<SimilarMusicListState, C37682d, C37679a> listMiddleware = mo77093k().f96073f;
        C11797e eVar = this;
        C37491c cVar5 = this.f95823n;
        if (cVar5 == null) {
            C52711k.m112237a("mAdapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, cVar5, false, false, new C37570i(new C37572k(this), new C37573l(this), new C37574m(this)), new C37571j(new C37576n(this), new C37577o(this), new C37578p(this)), new C37580q(this), new C37581r(this), null, null, 780, null);
        String string = getString(R.string.gtb);
        C52711k.m112236a((Object) string, "getString(R.string.music_similar_sounds)");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) mo77089b(R.id.d10);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" - ");
        sb.append(this.f95820k);
        buttonTitleBar.setTitle((CharSequence) sb.toString());
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) mo77089b(R.id.d10);
        C52711k.m112236a((Object) buttonTitleBar2, "title_bar");
        buttonTitleBar2.getStartBtn().setOnClickListener(new C37569h(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bli, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo77034a(Aweme aweme, int i, int i2) {
        String str;
        this.f95826r = i;
        this.f95827s = i2;
        StringBuilder sb = new StringBuilder("SimilarMusicFragment onVideoPaly: ");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" pos:");
        sb.append(i);
        sb.append(" pos2:");
        sb.append(i2);
        RecyclerView recyclerView = (RecyclerView) mo77089b(R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo4749j();
            RecyclerView recyclerView2 = (RecyclerView) mo77089b(R.id.cg7);
            C52711k.m112236a((Object) recyclerView2, "rv_list");
            C1332i layoutManager2 = recyclerView2.getLayoutManager();
            if (layoutManager2 != null) {
                int l = ((LinearLayoutManager) layoutManager2).mo4751l();
                if (j <= l) {
                    while (true) {
                        if (j >= 0) {
                            C37491c cVar = this.f95823n;
                            if (cVar == null) {
                                C52711k.m112237a("mAdapter");
                            }
                            if (j < cVar.getItemCount()) {
                                C1352v e = ((RecyclerView) mo77089b(R.id.cg7)).mo4844e(j);
                                if (e instanceof C37489a) {
                                    ((C37489a) e).mo77030a(i, i2);
                                }
                            }
                        }
                        if (j != l) {
                            j++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }
}
