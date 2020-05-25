package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder */
public final class RecommendContactViewHolder extends JediSimpleViewHolder<RecommendContact> {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f84083f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendContactViewHolder.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: g */
    private final C52668f f84084g;

    /* renamed from: j */
    private final IRecommendContactItemView f84085j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$a */
    public static final class C32270a extends C52712l implements C52670a<RecommendUserListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f84086a;

        /* renamed from: b */
        final /* synthetic */ C52760c f84087b;

        /* renamed from: c */
        final /* synthetic */ C52760c f84088c;

        public C32270a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f84086a = jediViewHolder;
            this.f84087b = cVar;
            this.f84088c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel]
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f84086a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f84088c
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
                d.k.c r4 = r5.f84087b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f84087b
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
                d.k.c r2 = r5.f84087b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendContactViewHolder.C32270a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$b */
    static final class C32271b extends C52712l implements C52682m<RecommendContact, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendContactViewHolder f84089a;

        C32271b(RecommendContactViewHolder recommendContactViewHolder) {
            this.f84089a = recommendContactViewHolder;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendContact recommendContact = (RecommendContact) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(recommendContact, "contact");
            this.f84089a.mo65390p().mo83655a((User) recommendContact);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$c */
    static final class C32272c extends C52712l implements C52671b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C32272c f84090a = new C32272c();

        C32272c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f104535a;
        }
    }

    /* renamed from: p */
    public final RecommendUserListViewModel mo65390p() {
        return (RecommendUserListViewModel) this.f84084g.getValue();
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        this.f84085j.setEnterFrom((String) mo22552a(mo65390p(), (C52671b<? super S1, ? extends R>) C32272c.f84090a));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        RecommendContact recommendContact = (RecommendContact) obj;
        C52711k.m112240b(recommendContact, "item");
        this.f84085j.mo66180a(recommendContact, getAdapterPosition());
        this.f84085j.setDislikeListener(new C32271b(this));
    }

    public RecommendContactViewHolder(IRecommendContactItemView iRecommendContactItemView) {
        C52711k.m112240b(iRecommendContactItemView, "recommendView");
        super(iRecommendContactItemView);
        this.f84085j = iRecommendContactItemView;
        C52760c a = C52728w.m112245a(RecommendUserListViewModel.class);
        this.f84084g = C52732g.m112285a(new C32270a(this, a, a));
    }
}
