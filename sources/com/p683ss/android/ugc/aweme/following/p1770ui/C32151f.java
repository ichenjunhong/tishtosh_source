package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11936w;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32352x.C32357b;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32318f;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32320g;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32322i;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32329n;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32760i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.C41144a;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.C41143j;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.following.ui.f */
public final class C32151f extends C32052a {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f83877k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32151f.class), "mFollowerRelationViewModel", "getMFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32151f.class), "mRecommendUserLisViewModel", "getMRecommendUserLisViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: l */
    public FollowListAdapter f83878l;

    /* renamed from: m */
    boolean f83879m;

    /* renamed from: n */
    private final lifecycleAwareLazy f83880n;

    /* renamed from: o */
    private final lifecycleAwareLazy f83881o;

    /* renamed from: p */
    private HashMap f83882p;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$a */
    public static final class C32152a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83883a;

        public C32152a(C52760c cVar) {
            this.f83883a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83883a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$aa */
    static final class C32153aa extends C52712l implements C52671b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C32153aa f83884a = new C32153aa();

        C32153aa() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            boolean z2;
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            Collection collection = (Collection) followerRelationState.getListState().getRefresh().mo22538a();
            boolean z3 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Collection collection2 = (Collection) followerRelationState.getListState().getLoadMore().mo22538a();
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$ab */
    static final class C32154ab extends C52712l implements C52682m<FollowerRelationState, Bundle, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83885a;

        C32154ab(C32151f fVar) {
            this.f83885a = fVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r13 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                r12 = this;
                r0 = r13
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState) r0
                android.os.Bundle r14 = (android.os.Bundle) r14
                java.lang.String r13 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r13)
                com.ss.android.ugc.aweme.following.ui.f r13 = r12.f83885a
                java.lang.String r13 = r13.f83663b
                if (r13 != 0) goto L_0x0012
                java.lang.String r13 = ""
            L_0x0012:
                r1 = r13
                com.ss.android.ugc.aweme.following.ui.f r13 = r12.f83885a
                com.ss.android.ugc.aweme.profile.model.User r13 = r13.f83664c
                if (r13 == 0) goto L_0x0022
                java.lang.String r13 = r13.getSecUid()
                if (r13 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r2 = r13
                goto L_0x0025
            L_0x0022:
                java.lang.String r13 = ""
                goto L_0x0020
            L_0x0025:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 508(0x1fc, float:7.12E-43)
                r11 = 0
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r13 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32151f.C32154ab.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$ac */
    static final class C32155ac extends C52712l implements C52682m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83886a;

        C32155ac(C32151f fVar) {
            this.f83886a = fVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r11 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                r10 = this;
                r0 = r11
                com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r0 = (com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState) r0
                android.os.Bundle r12 = (android.os.Bundle) r12
                java.lang.String r11 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r11)
                com.ss.android.ugc.aweme.following.ui.f r11 = r10.f83886a
                java.lang.String r11 = r11.f83663b
                if (r11 != 0) goto L_0x0012
                java.lang.String r11 = ""
            L_0x0012:
                r1 = r11
                com.ss.android.ugc.aweme.following.ui.f r11 = r10.f83886a
                com.ss.android.ugc.aweme.profile.model.User r11 = r11.f83664c
                if (r11 == 0) goto L_0x0022
                java.lang.String r11 = r11.getSecUid()
                if (r11 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r2 = r11
                goto L_0x0025
            L_0x0022:
                java.lang.String r11 = ""
                goto L_0x0020
            L_0x0025:
                com.ss.android.ugc.aweme.following.ui.f r11 = r10.f83886a
                boolean r3 = r11.mo65258k()
                r4 = 14
                r5 = 0
                com.ss.android.ugc.aweme.recommend.viewmodel.a r6 = new com.ss.android.ugc.aweme.recommend.viewmodel.a
                com.ss.android.ugc.aweme.following.ui.f r11 = r10.f83886a
                java.lang.String r11 = r11.mo65260m()
                com.ss.android.ugc.aweme.following.ui.f r12 = r10.f83886a
                java.lang.String r12 = r12.mo65261n()
                java.lang.String r7 = "empty"
                r6.<init>(r11, r12, r7)
                r7 = 0
                r8 = 80
                r9 = 0
                com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r11 = com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32151f.C32155ac.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$ad */
    static final class C32156ad extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83887a;

        C32156ad(C32151f fVar) {
            this.f83887a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            Collection recommendList = followerRelationState.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f83887a.mo65314v().f84152f.mo22567c();
            } else {
                this.f83887a.mo65315w().mo22588k();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$ae */
    static final class C32157ae extends C52712l implements C52671b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83888a;

        C32157ae(C32151f fVar) {
            this.f83888a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            return Boolean.valueOf(this.f83888a.mo65255a(followerRelationState.getListState()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$af */
    static final class C32158af extends C52712l implements C52671b<FollowerRelationState, String> {

        /* renamed from: a */
        public static final C32158af f83889a = new C32158af();

        C32158af() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            return followerRelationState.getHotsoonText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$b */
    public static final class C32159b extends C52712l implements C52670a<FollowerRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83890a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83891b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83892c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83893d;

        public C32159b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83890a = fragment;
            this.f83891b = aVar;
            this.f83892c = cVar;
            this.f83893d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel, java.lang.Object]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83890a
                android.support.v4.app.Fragment r1 = r3.f83890a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83891b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83892c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel> r2 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.f$b$1 r1 = new com.ss.android.ugc.aweme.following.ui.f$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32151f.C32159b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$c */
    public static final class C32161c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83895a;

        public C32161c(C52760c cVar) {
            this.f83895a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83895a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$d */
    public static final class C32162d extends C52712l implements C52670a<RecommendUserListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83896a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83897b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83898c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83899d;

        public C32162d(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83896a = fragment;
            this.f83897b = aVar;
            this.f83898c = cVar;
            this.f83899d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel, java.lang.Object]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83896a
                android.support.v4.app.Fragment r1 = r3.f83896a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83897b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83898c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel> r2 = com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.f$d$1 r1 = new com.ss.android.ugc.aweme.following.ui.f$d$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32151f.C32162d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$e */
    static final class C32164e extends C52712l implements C52671b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83901a;

        C32164e(C32151f fVar) {
            this.f83901a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            C32151f fVar = this.f83901a;
            followerRelationState.getListState().getList().size();
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$f */
    static final class C32165f extends C52712l implements C52671b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C32165f f83902a = new C32165f();

        C32165f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            return Boolean.valueOf(followerRelationState.isHotsoonHasMore());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$g */
    static final class C32166g implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C32151f f83903a;

        C32166g(C32151f fVar) {
            this.f83903a = fVar;
        }

        public final void ar_() {
            this.f83903a.mo22552a(this.f83903a.mo65314v(), new C52671b<FollowerRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32166g f83904a;

                {
                    this.f83904a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
                    if (r6 == false) goto L_0x002d;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r6 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState) r6
                        java.lang.String r0 = "it"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                        com.bytedance.jedi.arch.ext.list.ListState r0 = r6.getListState()
                        com.bytedance.jedi.arch.ext.list.l r0 = r0.getPayload()
                        com.ss.android.ugc.aweme.following.repository.i r0 = (com.p683ss.android.ugc.aweme.following.repository.C32041i) r0
                        long r0 = r0.f83617c
                        r2 = 0
                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r4 != 0) goto L_0x002d
                        java.util.List r6 = r6.getRecommendList()
                        java.util.Collection r6 = (java.util.Collection) r6
                        if (r6 == 0) goto L_0x002a
                        boolean r6 = r6.isEmpty()
                        if (r6 == 0) goto L_0x0028
                        goto L_0x002a
                    L_0x0028:
                        r6 = 0
                        goto L_0x002b
                    L_0x002a:
                        r6 = 1
                    L_0x002b:
                        if (r6 != 0) goto L_0x0041
                    L_0x002d:
                        com.ss.android.ugc.aweme.following.ui.f$g r6 = r5.f83904a
                        com.ss.android.ugc.aweme.following.ui.f r6 = r6.f83903a
                        com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel r0 = r6.mo65314v()
                        com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                        com.ss.android.ugc.aweme.following.ui.f$ad r1 = new com.ss.android.ugc.aweme.following.ui.f$ad
                        r1.<init>(r6)
                        d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                        r6.mo22552a(r0, r1)
                    L_0x0041:
                        d.x r6 = p2628d.C52860x.f131107a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32151f.C32166g.C321671.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$h */
    static final class C32168h extends C52712l implements C52671b<FollowerRelationState, String> {

        /* renamed from: a */
        public static final C32168h f83905a = new C32168h();

        C32168h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            if (followerRelationState.getHotsoonText().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "剩余粉丝因暂未授权不支持查看";
            }
            return followerRelationState.getHotsoonText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$i */
    public static final class C32169i implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83906a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83907b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83908c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83909d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83910e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f83911f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83909d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83910e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f83911f;
        }

        public C32169i(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83906a = bVar;
            this.f83907b = mVar;
            this.f83908c = mVar2;
            this.f83909d = bVar;
            this.f83910e = mVar;
            this.f83911f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$j */
    public static final class C32170j implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83912a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83913b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83914c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83915d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83916e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f83917f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83915d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83916e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f83917f;
        }

        public C32170j(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83912a = bVar;
            this.f83913b = mVar;
            this.f83914c = mVar2;
            this.f83915d = bVar;
            this.f83916e = mVar;
            this.f83917f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$k */
    static final class C32171k extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83918a;

        C32171k(C32151f fVar) {
            this.f83918a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f83918a.mo48632a((int) R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$l */
    static final class C32172l extends C52712l implements C52686q<C11866f, ListState<Object, C32041i>, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83919a;

        C32172l(C32151f fVar) {
            this.f83919a = fVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ListState listState = (ListState) obj2;
            List list = (List) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(listState, "listState");
            C52711k.m112240b(list, "recommendList");
            C32151f.m74541a(this.f83919a).mo48634a(C52575l.m112133c(listState.getList(), list));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$m */
    static final class C32173m extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83920a;

        C32173m(C32151f fVar) {
            this.f83920a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (this.f83920a.mo65310C()) {
                ((DmtStatusView) this.f83920a.mo48632a((int) R.id.csv)).mo19212f();
            } else {
                C32151f.m74541a(this.f83920a).am_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$n */
    static final class C32174n extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83921a;

        C32174n(C32151f fVar) {
            this.f83921a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "error");
            if (this.f83921a.mo65310C()) {
                this.f83921a.mo65311D();
            } else {
                this.f83921a.mo65309A();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$o */
    static final class C32175o extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83922a;

        C32175o(C32151f fVar) {
            this.f83922a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "data");
            if (this.f83922a.mo65310C() && list.isEmpty()) {
                this.f83922a.mo65311D();
            } else if (this.f83922a.mo65310C()) {
                ((DmtStatusView) this.f83922a.mo48632a((int) R.id.csv)).mo19209d();
                FollowerRelationViewModel v = this.f83922a.mo65314v();
                if (this.f83922a.mo65317y()) {
                    str = this.f83922a.mo65318z();
                } else {
                    str = "";
                }
                C52711k.m112240b(str, "des");
                v.mo22527b(new C32318f(v, str));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$p */
    static final class C32176p extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83923a;

        C32176p(C32151f fVar) {
            this.f83923a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C32151f.m74541a(this.f83923a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$q */
    static final class C32177q extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83924a;

        C32177q(C32151f fVar) {
            this.f83924a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C32151f.m74541a(this.f83924a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$r */
    static final class C32178r extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83925a;

        C32178r(C32151f fVar) {
            this.f83925a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "error");
            C32151f fVar = this.f83925a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f83925a.mo48632a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            fVar.mo65253a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f83925a.mo48632a((int) R.id.csv)).mo19214h();
            C32151f.m74541a(this.f83925a).an_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$s */
    static final class C32179s extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83926a;

        C32179s(C32151f fVar) {
            this.f83926a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                User user = (User) next;
                if (user instanceof RecommendContact) {
                    arrayList.add(user);
                } else {
                    String requestId = user.getRequestId();
                    C52711k.m112236a((Object) requestId, "user.requestId");
                    arrayList.add(new C32004k(2, user, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            if (!list.isEmpty()) {
                String string = this.f83926a.getResources().getString(R.string.ahs);
                C52711k.m112236a((Object) string, "resources.getString(R.st…relation_recommend_title)");
                arrayList.add(0, new C32003j(4, string));
            }
            FollowerRelationViewModel v = this.f83926a.mo65314v();
            C52711k.m112240b(arrayList, "recommendList");
            v.mo22530c(new C32329n(arrayList));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$t */
    static final class C32180t extends C52712l implements C52686q<C11866f, List<? extends User>, C11853b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83927a;

        C32180t(C32151f fVar) {
            this.f83927a = fVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            List list = (List) obj2;
            C11853b bVar = (C11853b) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            C52711k.m112240b(bVar, "hasMore");
            if (bVar.f31440a) {
                C32151f.m74541a(this.f83927a).ao_();
            } else if (!this.f83927a.mo65310C() || !list.isEmpty()) {
                this.f83927a.mo65309A();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$u */
    static final class C32181u extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83928a;

        C32181u(C32151f fVar) {
            this.f83928a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            if (!C9376b.m18558a((Collection<T>) list)) {
                ((DmtStatusView) this.f83928a.mo48632a((int) R.id.csv)).mo19209d();
            }
            fVar.mo22552a(this.f83928a.mo65314v(), new C52671b<FollowerRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32181u f83929a;

                {
                    this.f83929a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                    C52711k.m112240b(followerRelationState, "it");
                    this.f83929a.f83928a.mo65314v();
                    followerRelationState.getListState().getPayload();
                    followerRelationState.getListState().getPayload();
                    followerRelationState.getListState().getPayload();
                    if (!this.f83929a.f83928a.mo65310C() || this.f83929a.f83928a.mo65316x()) {
                        ((DmtStatusView) this.f83929a.f83928a.mo48632a((int) R.id.csv)).mo19209d();
                    } else {
                        this.f83929a.f83928a.mo65311D();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$v */
    static final class C32183v extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83930a;

        C32183v(C32151f fVar) {
            this.f83930a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11866f fVar = (C11866f) obj;
            C52711k.m112240b(fVar, "$receiver");
            fVar.mo22552a(this.f83930a.mo65314v(), new C52671b<FollowerRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32183v f83931a;

                {
                    this.f83931a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                    C52711k.m112240b(followerRelationState, "it");
                    if (followerRelationState.getListState().isEmpty().f31440a) {
                        ((DmtStatusView) this.f83931a.f83930a.mo48632a((int) R.id.csv)).mo19212f();
                    } else {
                        C32151f.m74541a(this.f83931a.f83930a).am_();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$w */
    static final class C32185w extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83932a;

        C32185w(C32151f fVar) {
            this.f83932a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C32151f.m74541a(this.f83932a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$x */
    static final class C32186x extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83933a;

        C32186x(C32151f fVar) {
            this.f83933a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f83933a.mo65314v(), new C52671b<FollowerRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32186x f83934a;

                {
                    this.f83934a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                    C52711k.m112240b(followerRelationState, "it");
                    this.f83934a.f83933a.mo65314v();
                    followerRelationState.getListState().getPayload();
                    followerRelationState.getListState().getPayload();
                    followerRelationState.getListState().getPayload();
                    if (!this.f83934a.f83933a.mo65310C() || this.f83934a.f83933a.mo65316x()) {
                        ((DmtStatusView) this.f83934a.f83933a.mo48632a((int) R.id.csv)).mo19209d();
                    } else {
                        this.f83934a.f83933a.mo65311D();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$y */
    static final class C32188y extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83935a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.f$y$a */
        static final class C32189a extends C52712l implements C52671b<RecommendUserListState, C41144a> {

            /* renamed from: a */
            public static final C32189a f83936a = new C32189a();

            C32189a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
                C52711k.m112240b(recommendUserListState, "state");
                return recommendUserListState.getRecommendMobParams();
            }
        }

        C32188y(C32151f fVar) {
            this.f83935a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C32151f.m74541a(this.f83935a).ao_();
            } else if (this.f83935a.mo65316x()) {
                if (!this.f83935a.mo65310C()) {
                    C41144a aVar = (C41144a) fVar.mo22552a(this.f83935a.mo65315w(), C32189a.f83936a);
                    RecommendUserListViewModel w = this.f83935a.mo65315w();
                    String str = "nonempty";
                    String str2 = aVar.f104535a;
                    String str3 = aVar.f104536b;
                    C52711k.m112240b(str2, "enterFrom");
                    C52711k.m112240b(str3, "previousPage");
                    C52711k.m112240b(str, "pageStatus");
                    C41144a aVar2 = new C41144a(str2, str3, str);
                    C52711k.m112240b(aVar2, "params");
                    w.mo22530c(new C41143j(aVar2));
                }
                C32151f fVar2 = this.f83935a;
                FollowListAdapter followListAdapter = fVar2.f83878l;
                if (followListAdapter == null) {
                    C52711k.m112237a("mFollowerListAdapter");
                }
                followListAdapter.ao_();
                if (!fVar2.mo65310C() && !fVar2.f83879m && fVar2.mo65317y()) {
                    fVar2.mo65314v().mo65452a(fVar2.mo65318z());
                    fVar2.f83879m = true;
                }
                this.f83935a.mo65315w().mo22587j();
            } else if (this.f83935a.mo65262o()) {
                C32151f fVar3 = this.f83935a;
                FollowListAdapter followListAdapter2 = fVar3.f83878l;
                if (followListAdapter2 == null) {
                    C52711k.m112237a("mFollowerListAdapter");
                }
                followListAdapter2.ao_();
                if (fVar3.mo65310C() || fVar3.f83879m || !fVar3.mo65317y()) {
                    FollowerRelationViewModel v = fVar3.mo65314v();
                    v.mo22527b(new C32322i(v));
                } else {
                    FollowerRelationViewModel v2 = fVar3.mo65314v();
                    String z = fVar3.mo65318z();
                    C52711k.m112240b(z, "des");
                    v2.mo22527b(new C32320g(v2, z));
                    fVar3.f83879m = true;
                }
                C32151f.m74541a(this.f83935a).ao_();
            } else if (!this.f83935a.mo65310C()) {
                this.f83935a.mo65309A();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.f$z */
    static final class C32190z extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32151f f83937a;

        C32190z(C32151f fVar) {
            this.f83937a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue && !this.f83937a.mo65316x()) {
                fVar.mo22552a(this.f83937a.mo65314v(), new C52671b<FollowerRelationState, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32190z f83938a;

                    {
                        this.f83938a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                        C52711k.m112240b(followerRelationState, "it");
                        if (followerRelationState.getListState().isEmpty().f31440a && !((C32041i) followerRelationState.getListState().getPayload()).f31449a.f31440a && ((followerRelationState.getListState().getLoadMore() instanceof C11936w) || (followerRelationState.getListState().getRefresh() instanceof C11936w))) {
                            this.f83938a.f83937a.mo65311D();
                        }
                        return C52860x.f131107a;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83882p == null) {
            this.f83882p = new HashMap();
        }
        View view = (View) this.f83882p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83882p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83882p != null) {
            this.f83882p.clear();
        }
    }

    /* renamed from: j */
    public final int mo65257j() {
        return R.layout.bow;
    }

    /* renamed from: l */
    public final int mo65259l() {
        return R.string.czr;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    @C53771m
    public final void onEvent(C47496d dVar) {
    }

    /* renamed from: s */
    public final int mo65266s() {
        return R.drawable.aqy;
    }

    /* renamed from: v */
    public final FollowerRelationViewModel mo65314v() {
        return (FollowerRelationViewModel) this.f83880n.getValue();
    }

    /* renamed from: w */
    public final RecommendUserListViewModel mo65315w() {
        return (RecommendUserListViewModel) this.f83881o.getValue();
    }

    /* renamed from: u */
    public final int mo65268u() {
        mo65258k();
        return R.string.b5a;
    }

    /* renamed from: m */
    public final String mo65260m() {
        if (mo65258k()) {
            return "fans";
        }
        return "other_fans";
    }

    /* renamed from: r */
    public final void mo65265r() {
        mo65314v().f84152f.mo22565b();
    }

    /* renamed from: t */
    public final int mo65267t() {
        if (mo65258k()) {
            return R.string.b5b;
        }
        return R.string.b5c;
    }

    /* renamed from: C */
    public final boolean mo65310C() {
        return ((Boolean) mo22552a(mo65314v(), C32153aa.f83884a)).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo65262o() {
        return ((Boolean) mo22552a(mo65314v(), new C32157ae(this))).booleanValue();
    }

    /* renamed from: x */
    public final boolean mo65316x() {
        if (mo65258k()) {
            return ((Boolean) mo22552a(mo65314v(), new C32164e(this))).booleanValue();
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo65317y() {
        return ((Boolean) mo22552a(mo65314v(), C32165f.f83902a)).booleanValue();
    }

    /* renamed from: z */
    public final String mo65318z() {
        return (String) mo22552a(mo65314v(), C32168h.f83905a);
    }

    /* renamed from: A */
    public final void mo65309A() {
        FollowListAdapter followListAdapter = this.f83878l;
        if (followListAdapter == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        followListAdapter.ao_();
        if (!this.f83879m) {
            if (mo65310C() || !mo65317y()) {
                FollowListAdapter followListAdapter2 = this.f83878l;
                if (followListAdapter2 == null) {
                    C52711k.m112237a("mFollowerListAdapter");
                }
                followListAdapter2.an_();
            } else {
                mo65314v().mo65452a(mo65318z());
                this.f83879m = true;
            }
        }
    }

    public C32151f() {
        C52682m abVar = new C32154ab(this);
        C52760c a = C52728w.m112245a(FollowerRelationViewModel.class);
        C52670a aVar = new C32152a(a);
        C0184k kVar = this;
        this.f83880n = new lifecycleAwareLazy(kVar, aVar, new C32159b(this, aVar, a, abVar));
        C52682m acVar = new C32155ac(this);
        C52760c a2 = C52728w.m112245a(RecommendUserListViewModel.class);
        C52670a cVar = new C32161c(a2);
        this.f83881o = new lifecycleAwareLazy(kVar, cVar, new C32162d(this, cVar, a2, acVar));
    }

    /* renamed from: D */
    public final void mo65311D() {
        boolean z;
        ((DmtStatusView) mo48632a((int) R.id.csv)).mo19209d();
        if (mo65317y()) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            String string = getString(R.string.hv3);
            C52711k.m112236a((Object) string, "getString(R.string.vcd_follow_empty_title)");
            String str = (String) mo22552a(mo65314v(), C32158af.f83889a);
            C52711k.m112240b(dmtStatusView, "statusView");
            C52711k.m112240b(string, "title");
            C52711k.m112240b(str, "des");
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str.length();
            }
            dmtStatusView.mo19213g();
            return;
        }
        ((DmtStatusView) mo48632a((int) R.id.csv)).mo19213g();
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m74541a(C32151f fVar) {
        FollowListAdapter followListAdapter = fVar.f83878l;
        if (followListAdapter == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        return followListAdapter;
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        C52711k.m112240b(aVar, "event");
        String str = aVar.f62554a;
        if (str != null) {
            CharSequence charSequence = str;
            if (C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/user/follower/list/?", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/user/following/list/?", false, 2, (Object) null)) {
                C47718bf.m103293f(aVar);
                mo65265r();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.cra);
        C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh");
        boolean z = false;
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        mo65252a(dmtStatusView);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        recyclerView2.setItemAnimator(new C32760i());
        C47849eh.m103498b((RecyclerView) mo48632a((int) R.id.cg7));
        this.f83878l = new FollowListAdapter(this, "follower_relation", mo65258k());
        FollowListAdapter followListAdapter = this.f83878l;
        if (followListAdapter == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        followListAdapter.f70682s = getResources().getColor(R.color.a0_);
        RecyclerView recyclerView3 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView3, "rv_list");
        FollowListAdapter followListAdapter2 = this.f83878l;
        if (followListAdapter2 == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        recyclerView3.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f83878l;
        if (followListAdapter3 == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        followListAdapter3.mo54788a((C26846a) new C32166g(this));
        RecyclerView recyclerView4 = (RecyclerView) mo48632a((int) R.id.cg7);
        FollowerCardViewHolder followerCardViewHolder = new FollowerCardViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.bop, recyclerView4, false), new C32199n(this.f83663b, mo65258k(), C32357b.follower));
        followerCardViewHolder.mo65232a();
        C52711k.m112236a((Object) followerCardViewHolder, "FollowingHeaderViewFacto…      rv_list, pageParam)");
        if (followerCardViewHolder.f83632b && followerCardViewHolder.f83631a != null && !followerCardViewHolder.f83631a.isBlock() && !followerCardViewHolder.f83631a.isBlocked()) {
            z = true;
        }
        if (z) {
            FollowListAdapter followListAdapter4 = this.f83878l;
            if (followListAdapter4 == null) {
                C52711k.m112237a("mFollowerListAdapter");
            }
            followListAdapter4.mo48642b_(followerCardViewHolder.itemView);
        }
        ListMiddleware<FollowerRelationState, Object, C32041i> listMiddleware = mo65314v().f84152f;
        C11797e eVar = this;
        FollowListAdapter followListAdapter5 = this.f83878l;
        if (followListAdapter5 == null) {
            C52711k.m112237a("mFollowerListAdapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, followListAdapter5, false, false, new C32169i(new C32171k(this), new C32178r(this), new C32181u(this)), new C32170j(new C32183v(this), new C32185w(this), new C32186x(this)), new C32188y(this), new C32190z(this), null, null, 780, null);
        mo22549a(mo65314v(), C32198m.f83945a, C32192g.f83939a, C11896i.m24255a(), new C32172l(this));
        C11798a.m24151a(this, mo65315w(), C32193h.f83940a, null, new C32174n(this), new C32173m(this), new C32175o(this), 2, null);
        C11798a.m24151a(this, mo65315w(), C32194i.f83941a, null, new C32177q(this), new C32176p(this), null, 18, null);
        mo22547a(mo65315w(), C32195j.f83942a, C11896i.m24255a(), new C32179s(this));
        mo22549a(mo65315w(), C32196k.f83943a, C32197l.f83944a, C11896i.m24255a(), new C32180t(this));
        if (!this.f83665d) {
            mo65314v().f84152f.mo22565b();
        }
    }
}
