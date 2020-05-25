package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder */
public final class ConnectedRelationContactViewHolder extends JediSimpleViewHolder<RecommendContact> {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f84061f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ConnectedRelationContactViewHolder.class), "mConnectedRelationViewModel", "getMConnectedRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;"))};

    /* renamed from: g */
    final C52668f f84062g;

    /* renamed from: j */
    private final IRecommendContactItemView f84063j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder$a */
    public static final class C32261a extends C52712l implements C52670a<ConnectedRelationListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f84064a;

        /* renamed from: b */
        final /* synthetic */ C52760c f84065b;

        /* renamed from: c */
        final /* synthetic */ C52760c f84066c;

        public C32261a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f84064a = jediViewHolder;
            this.f84065b = cVar;
            this.f84066c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel]
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
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f84064a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f84066c
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
                d.k.c r4 = r5.f84065b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f84065b
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
                d.k.c r2 = r5.f84065b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.ConnectedRelationContactViewHolder.C32261a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder$b */
    static final class C32262b extends C52712l implements C52682m<RecommendContact, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationContactViewHolder f84067a;

        C32262b(ConnectedRelationContactViewHolder connectedRelationContactViewHolder) {
            this.f84067a = connectedRelationContactViewHolder;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendContact recommendContact = (RecommendContact) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(recommendContact, "contact");
            ((ConnectedRelationListViewModel) this.f84067a.f84062g.getValue()).mo65394a((User) recommendContact);
            return C52860x.f131107a;
        }
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        this.f84063j.getEnterFrom();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        RecommendContact recommendContact = (RecommendContact) obj;
        C52711k.m112240b(recommendContact, "item");
        this.f84063j.mo66180a(recommendContact, getAdapterPosition());
        this.f84063j.setDislikeListener(new C32262b(this));
    }

    public ConnectedRelationContactViewHolder(IRecommendContactItemView iRecommendContactItemView) {
        C52711k.m112240b(iRecommendContactItemView, "recommendView");
        super(iRecommendContactItemView);
        this.f84063j = iRecommendContactItemView;
        C52760c a = C52728w.m112245a(ConnectedRelationListViewModel.class);
        this.f84062g = C52732g.m112285a(new C32261a(this, a, a));
    }
}
