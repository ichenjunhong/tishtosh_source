package com.p683ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView.C32676a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.user.repository.UserState;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
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
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder */
public final class RecommendFriendItemViewHolder extends JediBaseViewHolder<RecommendFriendItemViewHolder, C32004k> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f104385g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendFriendItemViewHolder.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/recommend/RecommendListViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendFriendItemViewHolder.class), "mFollowingRelationViewModel", "getMFollowingRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;"))};

    /* renamed from: j */
    final RecommendSuggestedItemView f104386j;

    /* renamed from: k */
    private final C52668f f104387k;

    /* renamed from: l */
    private final C52668f f104388l;

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$a */
    public static final class C41055a extends C52712l implements C52670a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104389a;

        /* renamed from: b */
        final /* synthetic */ C52760c f104390b;

        /* renamed from: c */
        final /* synthetic */ C52760c f104391c;

        public C41055a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f104389a = jediViewHolder;
            this.f104390b = cVar;
            this.f104391c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel]
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
        public final com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f104389a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f104391c
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
                d.k.c r4 = r5.f104390b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f104390b
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
                d.k.c r2 = r5.f104390b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder.C41055a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$b */
    public static final class C41056b extends C52712l implements C52670a<FollowingRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104392a;

        /* renamed from: b */
        final /* synthetic */ C52760c f104393b;

        /* renamed from: c */
        final /* synthetic */ C52760c f104394c;

        public C41056b(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f104392a = jediViewHolder;
            this.f104393b = cVar;
            this.f104394c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel]
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
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f104392a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f104394c
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
                d.k.c r4 = r5.f104393b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f104393b
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
                d.k.c r2 = r5.f104393b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder.C41056b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$c */
    static final class C41057c extends C52712l implements C52682m<Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendItemViewHolder f104395a;

        /* renamed from: b */
        final /* synthetic */ User f104396b;

        C41057c(RecommendFriendItemViewHolder recommendFriendItemViewHolder, User user) {
            this.f104395a = recommendFriendItemViewHolder;
            this.f104396b = user;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C52711k.m112240b(str, "extra");
            this.f104395a.mo83573a(this.f104396b, intValue, str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$d */
    static final class C41058d extends C52712l implements C52671b<RecommendUserListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52727e f104397a;

        C41058d(C52727e eVar) {
            this.f104397a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            T t;
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            C52727e eVar = this.f104397a;
            if (recommendUserListState.getRecommendUserType() == 13) {
                t = "following_list";
            } else {
                t = recommendUserListState.getRecommendMobParams().f104478a;
            }
            eVar.element = t;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$e */
    static final class C41059e extends C52712l implements C52671b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C41059e f104398a = new C41059e();

        C41059e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f104479b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$f */
    static final class C41060f extends C52712l implements C52671b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendItemViewHolder f104399a;

        C41060f(RecommendFriendItemViewHolder recommendFriendItemViewHolder) {
            this.f104399a = recommendFriendItemViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UserState userState = (UserState) obj;
            C52711k.m112240b(userState, "$receiver");
            return UserState.copy$default(userState, ((C32004k) this.f104399a.mo22689o()).f83564b, false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$g */
    static final class C41061g extends C52712l implements C52682m<RecommendFriendItemViewHolder, User, C52860x> {

        /* renamed from: a */
        public static final C41061g f104400a = new C41061g();

        C41061g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendFriendItemViewHolder recommendFriendItemViewHolder = (RecommendFriendItemViewHolder) obj;
            User user = (User) obj2;
            C52711k.m112240b(recommendFriendItemViewHolder, "$receiver");
            C52711k.m112240b(user, "user");
            recommendFriendItemViewHolder.f104386j.mo66239a(user);
            recommendFriendItemViewHolder.f104386j.setActionEventListener(new C41057c(recommendFriendItemViewHolder, user));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$h */
    static final class C41062h extends C52712l implements C52682m<RecommendFriendItemViewHolder, Throwable, C52860x> {

        /* renamed from: a */
        public static final C41062h f104401a = new C41062h();

        C41062h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendFriendItemViewHolder recommendFriendItemViewHolder = (RecommendFriendItemViewHolder) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(recommendFriendItemViewHolder, "$receiver");
            C52711k.m112240b(th, "throwable");
            View view = recommendFriendItemViewHolder.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C22971a.m56494a(view.getContext(), th, R.string.b47);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder$i */
    static final class C41063i extends C52712l implements C52671b<RecommendUserListState, Integer> {

        /* renamed from: a */
        public static final C41063i f104402a = new C41063i();

        C41063i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return Integer.valueOf(recommendUserListState.getRecommendUserType());
        }
    }

    /* renamed from: q */
    private final RecommendListViewModel m90727q() {
        return (RecommendListViewModel) this.f104387k.getValue();
    }

    /* renamed from: r */
    private final FollowingRelationViewModel m90728r() {
        return (FollowingRelationViewModel) this.f104388l.getValue();
    }

    /* renamed from: s */
    private final String m90729s() {
        C52727e eVar = new C52727e();
        eVar.element = "";
        mo22552a(m90727q(), (C52671b<? super S1, ? extends R>) new C41058d<Object,Object>(eVar));
        return (String) eVar.element;
    }

    /* renamed from: t */
    private final String m90730t() {
        return (String) mo22552a(m90727q(), (C52671b<? super S1, ? extends R>) C41059e.f104398a);
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        mo22547a(m90726p(), C41110f.f104476a, C11896i.m24255a(), C41061g.f104400a);
        C11798a.m24151a(this, m90726p(), C41111g.f104477a, null, C41062h.f104401a, null, null, 26, null);
        mo83573a(((C32004k) mo22689o()).f83564b, C32676a.m75545e(), "");
    }

    /* renamed from: p */
    private final UserViewModel m90726p() {
        C52671b fVar = new C41060f(this);
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
            jediViewModel.mo22526a(fVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    public RecommendFriendItemViewHolder(RecommendSuggestedItemView recommendSuggestedItemView) {
        C52711k.m112240b(recommendSuggestedItemView, "recommendView");
        super(recommendSuggestedItemView);
        this.f104386j = recommendSuggestedItemView;
        C52760c a = C52728w.m112245a(RecommendListViewModel.class);
        this.f104387k = C52732g.m112285a(new C41055a(this, a, a));
        C52760c a2 = C52728w.m112245a(FollowingRelationViewModel.class);
        this.f104388l = C52732g.m112285a(new C41056b(this, a2, a2));
    }

    /* renamed from: a */
    public final void mo83573a(User user, int i, String str) {
        int i2;
        user.setRequestId(((C32004k) mo22689o()).f83566d);
        ((Number) mo22552a(m90727q(), (C52671b<? super S1, ? extends R>) C41063i.f104402a)).intValue();
        if (i == C32671a.m75532b()) {
            if (user.getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            m90726p().mo94901a(new C39970a().mo81871a(user.getUid()).mo81874b(user.getSecUid()).mo81869a(i2).mo81876c(m90729s()).mo81873b(12).mo81872a());
            user.getFollowStatus();
            String str2 = "single";
            if (user.getFollowerStatus() == 1) {
                str2 = "mutual";
            }
            C26890h.m65011a("follow", C23089d.m56640a().mo47829a("enter_from", m90729s()).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", user.getUid()).mo47826a("impr_order", ((C32004k) mo22689o()).f83565c).mo47829a("previous_page", m90730t()).mo47829a("req_id", user.getRequestId()).mo47829a("follow_type", str2).f61491a);
        } else if (i == C32671a.m75533c()) {
            if (m90727q().mo83574a(((C32004k) mo22689o()).f83564b)) {
                m90728r().mo65479a((List<? extends Object>) new ArrayList<Object>());
            }
            C26890h.m65011a("close_recommend_user_cell", C23089d.m56640a().mo47829a("enter_from", m90729s()).mo47829a("rec_type", user.getRecType()).mo47829a("rec_uid", user.getUid()).mo47826a("impr_order", ((C32004k) mo22689o()).f83565c).mo47829a("previous_page", m90730t()).mo47829a("req_id", user.getRequestId()).f61491a);
        } else if (i == C32671a.m75531a()) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            UserProfileActivity.m89400a(view.getContext(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from", m90729s()).mo94972a("enter_from_request_id", user.getRequestId()).f120139a);
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", m90729s()).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", user.getUid()).mo47826a("impr_order", ((C32004k) mo22689o()).f83565c).mo47829a("previous_page", m90730t()).mo47829a("req_id", user.getRequestId()).mo47829a("impr_id", user.getUid()).f61491a);
        } else {
            if (i == C32671a.m75534d()) {
                if (user.isShould_write_impr()) {
                    C37940g.m84832a().mo77415a(1, user.getUid());
                }
                C26890h.m65011a("show_recommend_user_cell", C23089d.m56640a().mo47829a("enter_from", m90729s()).mo47829a("rec_type", user.getRecType()).mo47829a("rec_uid", user.getUid()).mo47826a("impr_order", ((C32004k) mo22689o()).f83565c).mo47829a("previous_page", m90730t()).mo47829a("req_id", ((C32004k) mo22689o()).f83566d).f61491a);
            }
        }
    }
}
