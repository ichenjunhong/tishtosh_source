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
import com.p683ss.android.ugc.aweme.following.p1770ui.view.ConnectedRelationItemView;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView.C32676a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.user.repository.UserState;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder */
public final class ConnectedRelationViewHolder extends JediBaseViewHolder<ConnectedRelationViewHolder, C32004k> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f84068g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ConnectedRelationViewHolder.class), "mRelationListViewMode", "getMRelationListViewMode()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;"))};

    /* renamed from: j */
    public final RecommendUserItemView f84069j;

    /* renamed from: k */
    private final C52668f f84070k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$a */
    public static final class C32263a extends C52712l implements C52670a<ConnectedRelationListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f84071a;

        /* renamed from: b */
        final /* synthetic */ C52760c f84072b;

        /* renamed from: c */
        final /* synthetic */ C52760c f84073c;

        public C32263a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f84071a = jediViewHolder;
            this.f84072b = cVar;
            this.f84073c = cVar2;
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
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f84071a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f84073c
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
                d.k.c r4 = r5.f84072b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f84072b
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
                d.k.c r2 = r5.f84072b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.ConnectedRelationViewHolder.C32263a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$b */
    static final class C32264b extends C52712l implements C52682m<Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationViewHolder f84074a;

        /* renamed from: b */
        final /* synthetic */ User f84075b;

        C32264b(ConnectedRelationViewHolder connectedRelationViewHolder, User user) {
            this.f84074a = connectedRelationViewHolder;
            this.f84075b = user;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C52711k.m112240b(str, "extra");
            this.f84074a.mo65388a(this.f84075b, intValue, str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$c */
    static final class C32265c extends C52712l implements C52671b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationViewHolder f84076a;

        C32265c(ConnectedRelationViewHolder connectedRelationViewHolder) {
            this.f84076a = connectedRelationViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UserState userState = (UserState) obj;
            C52711k.m112240b(userState, "$receiver");
            return UserState.copy$default(userState, ((C32004k) this.f84076a.mo22689o()).f83564b, false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$d */
    static final class C32266d extends C52712l implements C52682m<ConnectedRelationViewHolder, User, C52860x> {

        /* renamed from: a */
        public static final C32266d f84077a = new C32266d();

        C32266d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ConnectedRelationViewHolder connectedRelationViewHolder = (ConnectedRelationViewHolder) obj;
            User user = (User) obj2;
            C52711k.m112240b(connectedRelationViewHolder, "$receiver");
            C52711k.m112240b(user, "user");
            if (((C32004k) connectedRelationViewHolder.mo22689o()).f83563a == 5) {
                User clone = user.clone();
                C52711k.m112236a((Object) clone, "it");
                clone.setRecommendReason(((C32004k) connectedRelationViewHolder.mo22689o()).f83564b.getRecommendReason());
                C52711k.m112236a((Object) clone, "user.clone().also { it.r…em.user.recommendReason }");
                connectedRelationViewHolder.mo65387a(clone);
            } else {
                user.setRecommendReason(((C32004k) connectedRelationViewHolder.mo22689o()).f83564b.getRecommendReason());
                user.setFollowerCount(((C32004k) connectedRelationViewHolder.mo22689o()).f83564b.getFollowerCount());
                user.setAwemeCount(((C32004k) connectedRelationViewHolder.mo22689o()).f83564b.getAwemeCount());
                connectedRelationViewHolder.mo65387a(user);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$e */
    static final class C32267e extends C52712l implements C52682m<ConnectedRelationViewHolder, Throwable, C52860x> {

        /* renamed from: a */
        public static final C32267e f84078a = new C32267e();

        C32267e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ConnectedRelationViewHolder connectedRelationViewHolder = (ConnectedRelationViewHolder) obj;
            Throwable th = (Throwable) obj2;
            C52711k.m112240b(connectedRelationViewHolder, "$receiver");
            C52711k.m112240b(th, "throwable");
            View view = connectedRelationViewHolder.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C22971a.m56494a(view.getContext(), th, R.string.b47);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$f */
    static final class C32268f extends C52712l implements C52686q<ConnectedRelationViewHolder, HashMap<String, Integer>, List<? extends String>, C52860x> {

        /* renamed from: a */
        public static final C32268f f84079a = new C32268f();

        C32268f() {
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            final ConnectedRelationViewHolder connectedRelationViewHolder = (ConnectedRelationViewHolder) obj;
            final HashMap hashMap = (HashMap) obj2;
            final List list = (List) obj3;
            C52711k.m112240b(connectedRelationViewHolder, "$receiver");
            C52711k.m112240b(hashMap, "map");
            C52711k.m112240b(list, "list");
            if (connectedRelationViewHolder.f84069j instanceof ConnectedRelationItemView) {
                connectedRelationViewHolder.mo22552a(connectedRelationViewHolder.mo65389p(), (C52671b<? super S1, ? extends R>) new C52671b<UserState, C52860x>() {
                    public final /* synthetic */ Object invoke(Object obj) {
                        UserState userState = (UserState) obj;
                        C52711k.m112240b(userState, "it");
                        ConnectedRelationItemView connectedRelationItemView = (ConnectedRelationItemView) connectedRelationViewHolder.f84069j;
                        HashMap hashMap = hashMap;
                        List list = list;
                        User user = userState.getUser();
                        C52711k.m112240b(hashMap, "unreadMap");
                        C52711k.m112240b(list, "unreadUidList");
                        C52711k.m112240b(user, "user");
                        connectedRelationItemView.f84035b.clear();
                        connectedRelationItemView.f84036c.clear();
                        connectedRelationItemView.f84035b.putAll(hashMap);
                        connectedRelationItemView.f84036c.addAll(list);
                        connectedRelationItemView.mo65350b(user);
                        return C52860x.f131107a;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: q */
    private final ConnectedRelationListViewModel m74616q() {
        return (ConnectedRelationListViewModel) this.f84070k.getValue();
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        mo22547a(mo65389p(), C32285a.f84117a, C11896i.m24255a(), C32266d.f84077a);
        C11798a.m24151a(this, mo65389p(), C32286b.f84118a, null, C32267e.f84078a, null, null, 26, null);
        mo22549a(m74616q(), C32287c.f84119a, C32288d.f84120a, C11896i.m24255a(), C32268f.f84079a);
        mo65388a(((C32004k) mo22689o()).f83564b, C32676a.m75545e(), "");
    }

    /* renamed from: p */
    public final UserViewModel mo65389p() {
        C52671b cVar = new C32265c(this);
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
            jediViewModel.mo22526a(cVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: a */
    public final void mo65387a(User user) {
        this.f84069j.mo65348a(user);
        this.f84069j.setAdapterPosition(getAdapterPosition());
        this.f84069j.setActionEventListener(new C32264b(this, user));
    }

    public ConnectedRelationViewHolder(RecommendUserItemView recommendUserItemView) {
        C52711k.m112240b(recommendUserItemView, "recommendView");
        super(recommendUserItemView);
        this.f84069j = recommendUserItemView;
        C52760c a = C52728w.m112245a(ConnectedRelationListViewModel.class);
        this.f84070k = C52732g.m112285a(new C32263a(this, a, a));
    }

    /* renamed from: b */
    private static void m74614b(User user) {
        new C23249s().mo48144s(user.getUid()).mo48137c("common_relation").mo48143h("others_homepage").mo48142g("1044").mo48076e();
    }

    /* renamed from: c */
    private static void m74615c(User user) {
        String str;
        String str2;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        C23253w c = new C23253w(str).mo48164d("others_homepage").mo48161b("common_relation").mo48163c("follow_button");
        if (user.getFollowStatus() == 0) {
            str2 = "1007";
        } else {
            str2 = "1036";
        }
        c.mo48160a(str2).mo48166f(user.getUid()).mo48076e();
    }

    /* renamed from: a */
    private final void m74613a(User user, String str, int i) {
        if (((C32004k) mo22689o()).f83563a == 2) {
            new C23205al(null, 1, null).mo47979a(user.getUid()).mo47980b("common_relation").mo47981c(str).mo47977a(i).mo47982d(user.getRequestId()).mo47983e(user.getRecommendReason()).mo47984f("total").mo47985g("nonempty").mo47986h("1007").mo48076e();
        }
    }

    /* renamed from: a */
    public final void mo65388a(User user, int i, String str) {
        String str2;
        user.setRequestId(((C32004k) mo22689o()).f83566d);
        if (i != C32676a.m75545e()) {
            int i2 = 0;
            if (i == 0 || i == C32676a.m75541a()) {
                if (((C32004k) mo22689o()).f83563a == 2) {
                    i2 = 1;
                }
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                UserProfileActivity.m89400a(view.getContext(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from", "common_relation").mo94972a("enter_from_request_id", user.getRequestId()).mo94969a("need_track_compare_recommend_reason", 1).mo94969a("from_recommend_card", i2).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
                m74614b(user);
                m74613a(user, "enter_profile", ((C32004k) mo22689o()).f83565c);
            } else if (i == C32676a.m75542b()) {
                if (user.getFollowStatus() == 0) {
                    i2 = 1;
                }
                mo65389p().mo94901a(new C39970a().mo81871a(user.getUid()).mo81874b(user.getSecUid()).mo81869a(i2).mo81876c("common_relation").mo81873b(12).mo81872a());
                m74615c(user);
                if (user.getFollowStatus() == 0) {
                    str2 = "follow";
                } else {
                    str2 = "follow_cancel";
                }
                m74613a(user, str2, ((C32004k) mo22689o()).f83565c);
            } else if (i == C32676a.m75543c()) {
                m74616q().mo65394a(((C32004k) mo22689o()).f83564b);
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                C10691a.m21548c(view2.getContext(), (int) R.string.ti).mo19066a();
                m74613a(user, "delete", ((C32004k) mo22689o()).f83565c);
            } else if (i == C32676a.m75544d()) {
                C41302w a = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(str);
                a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "find_friends").mo83871a());
            }
        } else if (((C32004k) mo22689o()).f83563a == 2) {
            m74613a(user, "impression", ((C32004k) mo22689o()).f83565c);
            C37940g.m84832a().mo77415a(3, user.getUid());
            ConnectedRelationListViewModel q = m74616q();
            C37940g a2 = C37940g.m84832a();
            C52711k.m112236a((Object) a2, "RecUserImpressionReporter.getInstance()");
            String b = a2.mo77416b();
            C52711k.m112236a((Object) b, "RecUserImpressionReporte…getInstance().toReportIds");
            q.mo65395a(b);
        }
    }
}
