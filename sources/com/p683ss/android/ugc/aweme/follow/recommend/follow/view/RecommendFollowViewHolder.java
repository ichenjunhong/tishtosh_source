package com.p683ss.android.ugc.aweme.follow.recommend.follow.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31891c;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.C31971a;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.C31975b;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderState;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewHolderViewModel;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel.C31955d;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel.C31957e;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FansFollowUserBtn;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.util.C40575z;
import com.p683ss.android.ugc.aweme.user.repository.UserState;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
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
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder */
public final class RecommendFollowViewHolder extends JediBaseViewHolder<RecommendFollowViewHolder, C31907e> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f83358g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendFollowViewHolder.class), "hostViewModel", "getHostViewModel()Lcom/ss/android/ugc/aweme/follow/recommend/follow/viewModel/RecommendFollowViewModel;"))};

    /* renamed from: y */
    public static final C31915c f83359y = new C31915c(null);

    /* renamed from: A */
    private final LinearLayout f83360A;

    /* renamed from: B */
    private final C40575z f83361B = new C40575z(this.f83360A);

    /* renamed from: C */
    private int f83362C;

    /* renamed from: j */
    final CircleImageView f83363j;

    /* renamed from: k */
    final AutoRTLImageView f83364k;

    /* renamed from: l */
    final TextView f83365l;

    /* renamed from: m */
    final TextView f83366m;

    /* renamed from: n */
    final ImageView f83367n;

    /* renamed from: o */
    final FansFollowUserBtn f83368o;

    /* renamed from: p */
    final LinearLayout f83369p = ((LinearLayout) this.itemView.findViewById(R.id.bf5));

    /* renamed from: q */
    final RemoteImageView f83370q;

    /* renamed from: r */
    final RemoteImageView f83371r;

    /* renamed from: s */
    final RemoteImageView f83372s;

    /* renamed from: t */
    final RemoteImageView[] f83373t;

    /* renamed from: u */
    final View f83374u;

    /* renamed from: v */
    final View f83375v;

    /* renamed from: w */
    final View f83376w;

    /* renamed from: x */
    final View[] f83377x;

    /* renamed from: z */
    private final C52668f f83378z;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$a */
    static final class C31912a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f83382a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f83383b;

        /* renamed from: c */
        final /* synthetic */ RecommendFollowViewHolder f83384c;

        C31912a(int i, RemoteImageView remoteImageView, RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f83382a = i;
            this.f83383b = remoteImageView;
            this.f83384c = recommendFollowViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                View view2 = this.f83384c.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                if (!C31945e.m74349a(view2.getContext())) {
                    View view3 = this.f83384c.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    C10691a.m21542b(view3.getContext(), (int) R.string.cg1).mo19066a();
                } else if (this.f83382a < ((C31907e) this.f83384c.mo22689o()).f83353b.size()) {
                    this.f83384c.mo22552a(this.f83384c.mo65120q(), (C52671b<? super S1, ? extends R>) new C52671b<RecommendFollowState, C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C31912a f83385a;

                        {
                            this.f83385a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                            C52711k.m112240b(recommendFollowState, "state");
                            RecommendFollowViewModel q = this.f83385a.f83384c.mo65120q();
                            RecommendList recommendList = new RecommendList();
                            recommendList.setLogPb(((C31975b) recommendFollowState.getListState().getPayload()).f83474c);
                            recommendList.setCursor(((C31975b) recommendFollowState.getListState().getPayload()).f31450b);
                            recommendList.setHasMore(((C31975b) recommendFollowState.getListState().getPayload()).f31449a.f31440a);
                            recommendList.setRecommendFollowList(recommendFollowState.getListState().getList());
                            RecommendList clone = recommendList.clone();
                            C52711k.m112236a((Object) clone, "RecommendList().apply {\n…                }.clone()");
                            C52711k.m112240b(q, "viewModel");
                            C52711k.m112240b(clone, "data");
                            C31213v.m72896a((C26875a) new C31971a(q, clone, null));
                            Bundle bundle = new Bundle();
                            bundle.putString("id", ((Aweme) ((C31907e) this.f83385a.f83384c.mo22689o()).f83353b.get(this.f83385a.f83382a)).getAid());
                            bundle.putString("refer", "potential_friends");
                            bundle.putString("video_from", "potential_friends");
                            bundle.putInt("profile_enterprise_type", ((Aweme) ((C31907e) this.f83385a.f83384c.mo22689o()).f83353b.get(this.f83385a.f83382a)).getEnterpriseType());
                            bundle.putInt("page_type", 17);
                            C0643c b = C0643c.m1729b(this.f83385a.f83383b, 0, 0, this.f83385a.f83383b.getWidth(), this.f83385a.f83383b.getHeight());
                            C52711k.m112236a((Object) b, "ActivityOptionsCompat.ma…over.width, cover.height)");
                            View view = this.f83385a.f83384c.itemView;
                            C52711k.m112236a((Object) view, "itemView");
                            SmartRouter.buildRoute(view.getContext(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
                            return C52860x.f131107a;
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$b */
    public static final class C31914b extends C52712l implements C52670a<RecommendFollowViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f83386a;

        /* renamed from: b */
        final /* synthetic */ C52760c f83387b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83388c;

        public C31914b(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f83386a = jediViewHolder;
            this.f83387b = cVar;
            this.f83388c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel]
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
        public final com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f83386a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f83388c
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
                d.k.c r4 = r5.f83387b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f83387b
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
                d.k.c r2 = r5.f83387b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder.C31914b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$c */
    public static final class C31915c {
        private C31915c() {
        }

        public /* synthetic */ C31915c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$d */
    public static final class C31916d {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f83389a;

        C31916d(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f83389a = recommendFollowViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$e */
    static final class C31917e extends C52712l implements C52671b<RecommendFollowViewHolderState, RecommendFollowViewHolderState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f83390a;

        C31917e(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f83390a = recommendFollowViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendFollowViewHolderState recommendFollowViewHolderState = (RecommendFollowViewHolderState) obj;
            C52711k.m112240b(recommendFollowViewHolderState, "$receiver");
            return recommendFollowViewHolderState.copy(((C31907e) this.f83390a.mo22689o()).f83353b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$f */
    static final class C31918f extends C52712l implements C52682m<RecommendFollowViewHolder, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        public static final C31918f f83391a = new C31918f();

        C31918f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendFollowViewHolder recommendFollowViewHolder = (RecommendFollowViewHolder) obj;
            List list = (List) obj2;
            C52711k.m112240b(recommendFollowViewHolder, "$receiver");
            C52711k.m112240b(list, "list");
            if (list == null || list.isEmpty()) {
                LinearLayout linearLayout = recommendFollowViewHolder.f83369p;
                C52711k.m112236a((Object) linearLayout, "coverContainer");
                linearLayout.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = recommendFollowViewHolder.f83369p;
                C52711k.m112236a((Object) linearLayout2, "coverContainer");
                linearLayout2.setVisibility(0);
                View view = recommendFollowViewHolder.itemView;
                C52711k.m112236a((Object) view, "itemView");
                float b = C9432q.m18687b(view.getContext(), 2.0f);
                View view2 = recommendFollowViewHolder.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                C13837e b2 = C13837e.m28114b(b, 0.0f, 0.0f, C9432q.m18687b(view2.getContext(), 2.0f));
                View view3 = recommendFollowViewHolder.itemView;
                C52711k.m112236a((Object) view3, "itemView");
                float b3 = C9432q.m18687b(view3.getContext(), 2.0f);
                View view4 = recommendFollowViewHolder.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                C13837e b4 = C13837e.m28114b(0.0f, b3, C9432q.m18687b(view4.getContext(), 2.0f), 0.0f);
                switch (list.size()) {
                    case 1:
                        RemoteImageView remoteImageView = recommendFollowViewHolder.f83370q;
                        View view5 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view5, "itemView");
                        C13834b bVar = new C13834b(view5.getResources());
                        View view6 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view6, "itemView");
                        float b5 = C9432q.m18687b(view6.getContext(), 2.0f);
                        View view7 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view7, "itemView");
                        float b6 = C9432q.m18687b(view7.getContext(), 2.0f);
                        View view8 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view8, "itemView");
                        float b7 = C9432q.m18687b(view8.getContext(), 2.0f);
                        View view9 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view9, "itemView");
                        remoteImageView.setHierarchy(bVar.mo25918a(C13837e.m28114b(b5, b6, b7, C9432q.m18687b(view9.getContext(), 2.0f))).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        recommendFollowViewHolder.mo65118a(recommendFollowViewHolder.f83370q);
                        recommendFollowViewHolder.f83370q.setVisibility(0);
                        recommendFollowViewHolder.f83371r.setVisibility(8);
                        recommendFollowViewHolder.f83372s.setVisibility(8);
                        break;
                    case 2:
                        RemoteImageView remoteImageView2 = recommendFollowViewHolder.f83370q;
                        View view10 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view10, "itemView");
                        remoteImageView2.setHierarchy(new C13834b(view10.getResources()).mo25918a(b2).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        RemoteImageView remoteImageView3 = recommendFollowViewHolder.f83371r;
                        View view11 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view11, "itemView");
                        remoteImageView3.setHierarchy(new C13834b(view11.getResources()).mo25918a(b4).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        recommendFollowViewHolder.mo65118a(recommendFollowViewHolder.f83370q, recommendFollowViewHolder.f83371r);
                        recommendFollowViewHolder.f83370q.setVisibility(0);
                        recommendFollowViewHolder.f83371r.setVisibility(0);
                        recommendFollowViewHolder.f83372s.setVisibility(8);
                        break;
                    case 3:
                        RemoteImageView remoteImageView4 = recommendFollowViewHolder.f83370q;
                        View view12 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view12, "itemView");
                        remoteImageView4.setHierarchy(new C13834b(view12.getResources()).mo25918a(b2).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        RemoteImageView remoteImageView5 = recommendFollowViewHolder.f83371r;
                        View view13 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view13, "itemView");
                        remoteImageView5.setHierarchy(new C13834b(view13.getResources()).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        RemoteImageView remoteImageView6 = recommendFollowViewHolder.f83372s;
                        View view14 = recommendFollowViewHolder.itemView;
                        C52711k.m112236a((Object) view14, "itemView");
                        remoteImageView6.setHierarchy(new C13834b(view14.getResources()).mo25918a(b4).mo25920b((int) R.color.a23).mo25926d((int) R.color.a23).mo25912a());
                        recommendFollowViewHolder.mo65118a(recommendFollowViewHolder.f83370q, recommendFollowViewHolder.f83371r, recommendFollowViewHolder.f83372s);
                        recommendFollowViewHolder.f83370q.setVisibility(0);
                        recommendFollowViewHolder.f83371r.setVisibility(0);
                        recommendFollowViewHolder.f83372s.setVisibility(0);
                        break;
                }
                recommendFollowViewHolder.f83374u.setVisibility(8);
                recommendFollowViewHolder.f83375v.setVisibility(8);
                recommendFollowViewHolder.f83376w.setVisibility(8);
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    Aweme aweme = (Aweme) next;
                    if (aweme.isImage()) {
                        recommendFollowViewHolder.f83377x[i].setVisibility(0);
                        RemoteImageView remoteImageView7 = recommendFollowViewHolder.f83373t[i];
                        Object obj3 = aweme.getImageInfos().get(0);
                        C52711k.m112236a(obj3, "imageInfos[0]");
                        C23515d.m57669a(remoteImageView7, ((ImageInfo) obj3).getLabelThumb());
                    } else {
                        recommendFollowViewHolder.f83377x[i].setVisibility(8);
                        RemoteImageView remoteImageView8 = recommendFollowViewHolder.f83373t[i];
                        Video video = aweme.getVideo();
                        C52711k.m112236a((Object) video, "video");
                        C23515d.m57669a(remoteImageView8, video.getCover());
                    }
                    i = i2;
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$g */
    static final class C31919g extends C52712l implements C52682m<RecommendFollowViewHolder, User, C52860x> {

        /* renamed from: a */
        public static final C31919g f83392a = new C31919g();

        C31919g() {
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a5, code lost:
            if (com.p683ss.android.ugc.aweme.setting.C41589c.m91437i() == 3) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder r4 = (com.p683ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder) r4
                com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.Object r0 = r4.mo22689o()
                com.ss.android.ugc.aweme.follow.recommend.follow.repo.e r0 = (com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e) r0
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.f83353b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x001c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0030
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
                com.ss.android.ugc.aweme.profile.model.User r2 = r5.clone()
                r1.setAuthor(r2)
                goto L_0x001c
            L_0x0030:
                java.lang.String r0 = r5.getRemarkName()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x004f
                int r0 = r5.getFollowStatus()
                if (r0 != 0) goto L_0x0043
                goto L_0x004f
            L_0x0043:
                android.widget.TextView r0 = r4.f83365l
                java.lang.String r1 = r5.getRemarkName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                goto L_0x005a
            L_0x004f:
                android.widget.TextView r0 = r4.f83365l
                java.lang.String r1 = r5.getNickname()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
            L_0x005a:
                com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r4.f83363j
                com.ss.android.ugc.aweme.base.model.UrlModel r1 = r5.getAvatarThumb()
                r0.mo48930a(r1)
                com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r4.f83363j
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
                com.ss.android.ugc.aweme.base.model.UrlModel r1 = r5.getAvatarThumb()
                com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r4.f83363j
                com.facebook.drawee.c.d r2 = r2.getControllerListener()
                com.p683ss.android.ugc.aweme.base.C23515d.m57672a(r0, r1, r2)
                com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn r0 = r4.f83368o
                int r1 = r5.getFollowStatus()
                r0.setFollowStatus(r1)
                r5.getFollowStatus()
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                com.ss.android.ugc.aweme.setting.c r0 = com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                int r0 = com.p683ss.android.ugc.aweme.setting.C41589c.m91437i()
                r1 = 2
                r2 = 8
                if (r0 == r1) goto L_0x00a7
                com.ss.android.ugc.aweme.setting.c r0 = com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                int r0 = com.p683ss.android.ugc.aweme.setting.C41589c.m91437i()
                r1 = 3
                if (r0 != r1) goto L_0x00b8
            L_0x00a7:
                int r0 = r5.getFollowStatus()
                if (r0 == 0) goto L_0x00b3
                com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$d r0 = new com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$d
                r0.<init>(r4)
                goto L_0x00b8
            L_0x00b3:
                com.ss.android.ugc.aweme.views.AutoRTLImageView r0 = r4.f83364k
                r0.setVisibility(r2)
            L_0x00b8:
                int r0 = r5.getFollowStatus()
                if (r0 != 0) goto L_0x00c5
                android.widget.ImageView r0 = r4.f83367n
                r1 = 0
                r0.setVisibility(r1)
                goto L_0x00cb
            L_0x00c5:
                android.widget.ImageView r0 = r4.f83367n
                r1 = 4
                r0.setVisibility(r1)
            L_0x00cb:
                java.lang.String r0 = r5.getRecommendReason()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00dd
                android.widget.TextView r4 = r4.f83366m
                r4.setVisibility(r2)
                goto L_0x00e8
            L_0x00dd:
                android.widget.TextView r4 = r4.f83366m
                java.lang.String r5 = r5.getRecommendReason()
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r4.setText(r5)
            L_0x00e8:
                d.x r4 = p2628d.C52860x.f131107a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder.C31919g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowViewHolder$h */
    static final class C31920h extends C52712l implements C52671b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewHolder f83393a;

        C31920h(RecommendFollowViewHolder recommendFollowViewHolder) {
            this.f83393a = recommendFollowViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UserState userState = (UserState) obj;
            C52711k.m112240b(userState, "$receiver");
            return UserState.copy$default(userState, ((C31907e) this.f83393a.mo22689o()).f83354c, false, null, null, 14, null);
        }
    }

    /* renamed from: q */
    public final RecommendFollowViewModel mo65120q() {
        return (RecommendFollowViewModel) this.f83378z.getValue();
    }

    /* renamed from: p */
    public final UserViewModel mo65119p() {
        C52671b hVar = new C31920h(this);
        Class<UserViewModel> cls = UserViewModel.class;
        C11944b b = mo22666b();
        if (b != null) {
            C11972h a = C11973a.m24361a(mo22542a(), b.mo22685b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo22706a(sb.toString(), cls);
            C11926m a2 = jediViewModel.f31279c.mo22643a(UserViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo22526a(hVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        C52671b eVar = new C31917e(this);
        Class<RecommendFollowViewHolderViewModel> cls = RecommendFollowViewHolderViewModel.class;
        C11944b b = mo22666b();
        if (b != null) {
            C11972h a = C11973a.m24361a(mo22542a(), b.mo22685b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo22706a(sb.toString(), cls);
            C11926m a2 = jediViewModel.f31279c.mo22643a(RecommendFollowViewHolderViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo22526a(eVar);
            mo22547a((RecommendFollowViewHolderViewModel) jediViewModel, C31946f.f83438a, C11896i.m24255a(), C31918f.f83391a);
            mo22547a(mo65119p(), C31947g.f83439a, C11896i.m24255a(), C31919g.f83392a);
            m74331a(((C31907e) mo22689o()).f83354c, "impression", ((C31907e) mo22689o()).f83355d);
            C37940g.m84832a().mo77415a(11, ((C31907e) mo22689o()).f83354c.getUid());
            return;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo65118a(View... viewArr) {
        float f;
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        int a = C9432q.m18670a(view.getContext());
        if (VERSION.SDK_INT >= 17) {
            LinearLayout linearLayout = this.f83369p;
            C52711k.m112236a((Object) linearLayout, "coverContainer");
            int paddingStart = a - linearLayout.getPaddingStart();
            LinearLayout linearLayout2 = this.f83369p;
            C52711k.m112236a((Object) linearLayout2, "coverContainer");
            float paddingEnd = (float) (paddingStart - linearLayout2.getPaddingEnd());
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            f = (paddingEnd - (C9432q.m18687b(view2.getContext(), 1.0f) * 2.0f)) / 3.0f;
        } else {
            LinearLayout linearLayout3 = this.f83369p;
            C52711k.m112236a((Object) linearLayout3, "coverContainer");
            int paddingLeft = a - linearLayout3.getPaddingLeft();
            LinearLayout linearLayout4 = this.f83369p;
            C52711k.m112236a((Object) linearLayout4, "coverContainer");
            float paddingRight = (float) (paddingLeft - linearLayout4.getPaddingRight());
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            f = (paddingRight - (C9432q.m18687b(view3.getContext(), 1.0f) * 2.0f)) / 3.0f;
        }
        float f2 = (f * 4.0f) / 3.0f;
        for (View layoutParams : viewArr) {
            layoutParams.getLayoutParams().height = (int) f2;
        }
    }

    public RecommendFollowViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z3, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…r,\n        parent, false)");
        super(inflate);
        C52760c a = C52728w.m112245a(RecommendFollowViewModel.class);
        this.f83378z = C52732g.m112285a(new C31914b(this, a, a));
        View findViewById = this.itemView.findViewById(R.id.tj);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.civ_avatar)");
        this.f83363j = (CircleImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.b0_);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_edit_remark)");
        this.f83364k = (AutoRTLImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.dcr);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.tv_nickname)");
        this.f83365l = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.deg);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_recommend_reason)");
        this.f83366m = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.azu);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.iv_delete)");
        this.f83367n = (ImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.n6);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.bt_follow)");
        this.f83368o = (FansFollowUserBtn) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bgk);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.ll_tag)");
        this.f83360A = (LinearLayout) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.azk);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.iv_cover1)");
        this.f83370q = (RemoteImageView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.azl);
        C52711k.m112236a((Object) findViewById9, "itemView.findViewById(R.id.iv_cover2)");
        this.f83371r = (RemoteImageView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.azm);
        C52711k.m112236a((Object) findViewById10, "itemView.findViewById(R.id.iv_cover3)");
        this.f83372s = (RemoteImageView) findViewById10;
        this.f83373t = new RemoteImageView[]{this.f83370q, this.f83371r, this.f83372s};
        View findViewById11 = this.itemView.findViewById(R.id.cxf);
        C52711k.m112236a((Object) findViewById11, "itemView.findViewById(R.id.tag_photo1)");
        this.f83374u = findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.cxg);
        C52711k.m112236a((Object) findViewById12, "itemView.findViewById(R.id.tag_photo2)");
        this.f83375v = findViewById12;
        View findViewById13 = this.itemView.findViewById(R.id.cxh);
        C52711k.m112236a((Object) findViewById13, "itemView.findViewById(R.id.tag_photo3)");
        this.f83376w = findViewById13;
        this.f83377x = new View[]{this.f83374u, this.f83375v, this.f83376w};
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f83379a;

            {
                this.f83379a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view)) {
                    View view2 = this.f83379a.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    UserProfileActivity.m89400a(view2.getContext(), C47661ab.m103163a().mo94972a("uid", ((C31907e) this.f83379a.mo22689o()).f83354c.getUid()).mo94969a("from_recommend_card", 1).mo94972a("sec_user_id", ((C31907e) this.f83379a.mo22689o()).f83354c.getSecUid()).mo94972a("enter_from_request_id", ((C31907e) this.f83379a.mo22689o()).f83354c.getRequestId()).mo94972a("extra_previous_page_position", "potential_friends").mo94972a("enter_from", "potential_friends").mo94972a("previous_recommend_reason", ((C31907e) this.f83379a.mo22689o()).f83354c.getRecommendReason()).f120139a);
                    new C23249s().mo48144s(((C31907e) this.f83379a.mo22689o()).f83354c.getUid()).mo48137c("potential_friends").mo48143h("homepage_hot").mo48142g("1044").mo48076e();
                    RecommendFollowViewHolder.m74331a(((C31907e) this.f83379a.mo22689o()).f83354c, "enter_profile", ((C31907e) this.f83379a.mo22689o()).f83355d);
                }
            }
        });
        this.f83367n.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f83380a;

            {
                this.f83380a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                RecommendFollowViewModel q = this.f83380a.mo65120q();
                String str2 = ((C31907e) this.f83380a.mo22689o()).f83352a;
                User user = ((C31907e) this.f83380a.mo22689o()).f83354c;
                if (user != null) {
                    str = user.getSecUid();
                } else {
                    str = null;
                }
                C52711k.m112240b(str2, "uid");
                C31891c cVar = q.f83441d;
                C52711k.m112240b(str2, "userId");
                C1680ad a = C1680ad.m5960a((C2206z<? extends T>) cVar.f83333c.mo22318c(new DislikeRecommendParams(str2, str))).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a());
                C52711k.m112236a((Object) a, "Single.fromObservable(di…dSchedulers.mainThread())");
                a.mo6152a((C1710e<? super T>) new C31955d<Object>(q, str2), (C1710e<? super Throwable>) C31957e.f83454a);
                RecommendFollowViewHolder.m74331a(((C31907e) this.f83380a.mo22689o()).f83354c, "delete", ((C31907e) this.f83380a.mo22689o()).f83355d);
            }
        });
        this.f83368o.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ RecommendFollowViewHolder f83381a;

            {
                this.f83381a = r1;
            }

            public final void onClick(View view) {
                int i;
                String str;
                String str2;
                String str3;
                ClickInstrumentation.onClick(view);
                if (((C31907e) this.f83381a.mo22689o()).f83354c.getFollowStatus() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f83381a.mo65119p().mo94901a(new C39970a().mo81871a(((C31907e) this.f83381a.mo22689o()).f83352a).mo81874b(((C31907e) this.f83381a.mo22689o()).f83354c.getSecUid()).mo81869a(i).mo81876c("common_relation").mo81873b(12).mo81872a());
                User user = ((C31907e) this.f83381a.mo22689o()).f83354c;
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                C23253w c = new C23253w(str).mo48164d("homepage_hot").mo48161b("potential_friends").mo48163c("follow_button");
                if (user.getFollowStatus() == 0) {
                    str2 = "1007";
                } else {
                    str2 = "1036";
                }
                c.mo48160a(str2).mo48166f(user.getUid()).mo48076e();
                if (((C31907e) this.f83381a.mo22689o()).f83354c.getFollowStatus() == 0) {
                    str3 = "follow";
                } else {
                    str3 = "follow_cancel";
                }
                RecommendFollowViewHolder.m74331a(((C31907e) this.f83381a.mo22689o()).f83354c, str3, ((C31907e) this.f83381a.mo22689o()).f83355d);
            }
        });
        RemoteImageView[] remoteImageViewArr = this.f83373t;
        int length = remoteImageViewArr.length;
        int i2 = 0;
        while (i < length) {
            RemoteImageView remoteImageView = remoteImageViewArr[i];
            int i3 = i2 + 1;
            remoteImageView.setOnClickListener(new C31912a(i2, remoteImageView, this));
            i++;
            i2 = i3;
        }
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        int a2 = C9432q.m18670a(view.getContext());
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        this.f83362C = a2 - ((int) C9432q.m18687b(view2.getContext(), 210.0f));
    }

    /* renamed from: a */
    public static void m74331a(User user, String str, int i) {
        new C23205al(null, 1, null).mo47979a(user.getUid()).mo47980b("potential_friends").mo47981c(str).mo47977a(i).mo47982d(user.getRequestId()).mo47983e(user.getRecommendReason()).mo47984f("total").mo47985g("nonempty").mo47986h("1007").mo48076e();
    }
}
