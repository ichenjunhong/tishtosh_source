package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView.C32676a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p683ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p683ss.android.ugc.aweme.user.repository.UserState;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder */
public final class RecommendRelationUserViewHolder extends JediBaseViewHolder<RecommendRelationUserViewHolder, C32004k> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f84095g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendRelationUserViewHolder.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: j */
    final RecommendUserItemView f84096j;

    /* renamed from: k */
    private final C52668f f84097k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$a */
    public static final class C32274a extends C52712l implements C52670a<RecommendUserListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f84098a;

        /* renamed from: b */
        final /* synthetic */ C52760c f84099b;

        /* renamed from: c */
        final /* synthetic */ C52760c f84100c;

        public C32274a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f84098a = jediViewHolder;
            this.f84099b = cVar;
            this.f84100c = cVar2;
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
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f84098a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f84100c
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
                d.k.c r4 = r5.f84099b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f84099b
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
                d.k.c r2 = r5.f84099b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendRelationUserViewHolder.C32274a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$b */
    static final class C32275b extends C52712l implements C52682m<Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationUserViewHolder f84101a;

        /* renamed from: b */
        final /* synthetic */ User f84102b;

        C32275b(RecommendRelationUserViewHolder recommendRelationUserViewHolder, User user) {
            this.f84101a = recommendRelationUserViewHolder;
            this.f84102b = user;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C52711k.m112240b(str, "extra");
            this.f84101a.mo65392a(this.f84102b, intValue, str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$c */
    static final class C32276c extends C52712l implements C52671b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C32276c f84103a = new C32276c();

        C32276c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f104535a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$d */
    static final class C32277d extends C52712l implements C52671b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C32277d f84104a = new C32277d();

        C32277d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f104537c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$e */
    static final class C32278e extends C52712l implements C52671b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C32278e f84105a = new C32278e();

        C32278e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f104536b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$f */
    static final class C32279f extends C52712l implements C52671b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationUserViewHolder f84106a;

        C32279f(RecommendRelationUserViewHolder recommendRelationUserViewHolder) {
            this.f84106a = recommendRelationUserViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UserState userState = (UserState) obj;
            C52711k.m112240b(userState, "$receiver");
            return UserState.copy$default(userState, ((C32004k) this.f84106a.mo22689o()).f83564b, false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$g */
    static final class C32280g extends C52712l implements C52682m<RecommendRelationUserViewHolder, User, C52860x> {

        /* renamed from: a */
        public static final C32280g f84107a = new C32280g();

        C32280g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendRelationUserViewHolder recommendRelationUserViewHolder = (RecommendRelationUserViewHolder) obj;
            User user = (User) obj2;
            C52711k.m112240b(recommendRelationUserViewHolder, "$receiver");
            C52711k.m112240b(user, "user");
            recommendRelationUserViewHolder.f84096j.mo65348a(user);
            recommendRelationUserViewHolder.f84096j.setAdapterPosition(recommendRelationUserViewHolder.getAdapterPosition());
            recommendRelationUserViewHolder.f84096j.setActionEventListener(new C32275b(recommendRelationUserViewHolder, user));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$h */
    static final class C32281h extends C52712l implements C52682m<RecommendRelationUserViewHolder, Throwable, C52860x> {

        /* renamed from: a */
        public static final C32281h f84108a = new C32281h();

        C32281h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendRelationUserViewHolder recommendRelationUserViewHolder = (RecommendRelationUserViewHolder) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(recommendRelationUserViewHolder, "$receiver");
            C52711k.m112240b(th, "throwable");
            View view = recommendRelationUserViewHolder.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C22971a.m56494a(view.getContext(), th, R.string.b47);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationUserViewHolder$i */
    static final class C32282i extends C52712l implements C52671b<RecommendUserListState, Integer> {

        /* renamed from: a */
        public static final C32282i f84109a = new C32282i();

        C32282i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            return Integer.valueOf(recommendUserListState.getRecommendUserType());
        }
    }

    /* renamed from: q */
    private final RecommendUserListViewModel m74629q() {
        return (RecommendUserListViewModel) this.f84097k.getValue();
    }

    /* renamed from: r */
    private final String m74630r() {
        return (String) mo22552a(m74629q(), (C52671b<? super S1, ? extends R>) C32277d.f84104a);
    }

    /* renamed from: s */
    private final String m74631s() {
        return (String) mo22552a(m74629q(), (C52671b<? super S1, ? extends R>) C32278e.f84105a);
    }

    /* renamed from: t */
    private final String m74632t() {
        return (String) mo22552a(m74629q(), (C52671b<? super S1, ? extends R>) C32276c.f84103a);
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        mo22547a(m74628p(), C32289e.f84121a, C11896i.m24255a(), C32280g.f84107a);
        C11798a.m24151a(this, m74628p(), C32290f.f84122a, null, C32281h.f84108a, null, null, 26, null);
        mo65392a(((C32004k) mo22689o()).f83564b, C32676a.m75545e(), "");
    }

    /* renamed from: p */
    private final UserViewModel m74628p() {
        C52671b fVar = new C32279f(this);
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

    public RecommendRelationUserViewHolder(RecommendUserItemView recommendUserItemView) {
        C52711k.m112240b(recommendUserItemView, "recommendView");
        super(recommendUserItemView);
        this.f84096j = recommendUserItemView;
        C52760c a = C52728w.m112245a(RecommendUserListViewModel.class);
        this.f84097k = C52732g.m112285a(new C32274a(this, a, a));
    }

    /* renamed from: a */
    private final void m74625a(User user) {
        new C23249s().mo48144s(user.getUid()).mo48137c(m74632t()).mo48143h(m74631s()).mo48076e();
    }

    /* renamed from: b */
    private final void m74627b(User user) {
        String str;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        new C23253w(str).mo48164d(m74631s()).mo48161b(m74632t()).mo48163c("follow_button").mo48166f(user.getUid()).mo48076e();
    }

    /* renamed from: a */
    private final void m74626a(User user, String str, int i) {
        new C23205al(null, 1, null).mo47979a(user.getUid()).mo47980b(m74632t()).mo47981c(str).mo47977a(i).mo47982d(user.getRequestId()).mo47983e(user.getRecommendReason()).mo47984f("total").mo47985g(m74630r()).mo48076e();
    }

    /* renamed from: a */
    public final void mo65392a(User user, int i, String str) {
        String str2;
        user.setRequestId(((C32004k) mo22689o()).f83566d);
        int intValue = ((Number) mo22552a(m74629q(), (C52671b<? super S1, ? extends R>) C32282i.f84109a)).intValue();
        if (i == C32676a.m75545e()) {
            m74626a(user, "impression", ((C32004k) mo22689o()).f83565c);
            C37940g.m84832a().mo77415a(intValue, user.getUid());
            RecommendUserListViewModel q = m74629q();
            C37940g a = C37940g.m84832a();
            C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
            String b = a.mo77416b();
            C52711k.m112236a((Object) b, "RecUserImpressionReporte…getInstance().toReportIds");
            q.mo83656a(b);
            return;
        }
        int i2 = 1;
        if (i == 0 || i == C32676a.m75541a()) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            UserProfileActivity.m89400a(view.getContext(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from", m74632t()).mo94972a("enter_from_request_id", user.getRequestId()).mo94969a("need_track_compare_recommend_reason", 1).mo94969a("from_recommend_card", 1).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").mo94972a("extra_previous_page_position", "recommend_card").f120139a);
            m74625a(user);
            m74626a(user, "enter_profile", ((C32004k) mo22689o()).f83565c);
            return;
        }
        if (i == C32676a.m75542b()) {
            if (user.getFollowStatus() != 0) {
                i2 = 0;
            }
            m74628p().mo94901a(new C39970a().mo81871a(user.getUid()).mo81874b(user.getSecUid()).mo81869a(i2).mo81876c(m74632t()).mo81873b(12).mo81872a());
            m74627b(user);
            if (user.getFollowStatus() == 0) {
                str2 = "follow";
            } else {
                str2 = "follow_cancel";
            }
            if (user.getFollowStatus() == 0) {
                m74626a(user, str2, ((C32004k) mo22689o()).f83565c);
            }
        } else if (i == C32676a.m75543c()) {
            m74629q().mo83655a(((C32004k) mo22689o()).f83564b);
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            C10691a.m21548c(view2.getContext(), (int) R.string.ti).mo19066a();
            m74626a(user, "delete", ((C32004k) mo22689o()).f83565c);
        }
    }
}
