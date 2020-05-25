package com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31891c;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel */
public final class RecommendFollowViewModel extends JediViewModel<RecommendFollowState> {

    /* renamed from: f */
    public static final C31948a f83440f = new C31948a(null);

    /* renamed from: d */
    public final C31891c f83441d = new C31891c();

    /* renamed from: e */
    public final ListMiddleware<RecommendFollowState, C31907e, C31975b> f83442e;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$a */
    public static final class C31948a {
        private C31948a() {
        }

        public /* synthetic */ C31948a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$b */
    public interface C31949b {
        /* renamed from: a */
        void mo65158a(RecommendList recommendList);

        /* renamed from: a */
        void mo65159a(Throwable th);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$c */
    static final class C31950c extends C52712l implements C52671b<RecommendFollowState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f83443a;

        /* renamed from: b */
        final /* synthetic */ boolean f83444b;

        /* renamed from: c */
        final /* synthetic */ C31949b f83445c;

        C31950c(RecommendFollowViewModel recommendFollowViewModel, boolean z, C31949b bVar) {
            this.f83443a = recommendFollowViewModel;
            this.f83444b = z;
            this.f83445c = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            int i2;
            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
            C52711k.m112240b(recommendFollowState, "it");
            if (this.f83444b) {
                i = ((C31975b) recommendFollowState.getListState().getPayload()).f31450b;
            } else {
                i = 0;
            }
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isUidContactPermisioned()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            C31891c cVar = this.f83443a.f83441d;
            String userId = recommendFollowState.getUserId();
            C37940g a = C37940g.m84832a();
            C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
            cVar.mo65093a(30, i, userId, 11, 0, i2, a.mo77416b(), C47945d.m103733b(), recommendFollowState.getSecUid()).mo6540d((C1710e<? super T>) C319511.f83446a).mo6505a((C1710e<? super T>) new C1710e<RecommendList>(this) {

                /* renamed from: a */
                final /* synthetic */ C31950c f83447a;

                {
                    this.f83447a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    final RecommendList recommendList = (RecommendList) obj;
                    this.f83447a.f83443a.mo22530c(new C52671b<RecommendFollowState, RecommendFollowState>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C319522 f83448a;

                        {
                            this.f83448a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                            C52711k.m112240b(recommendFollowState, "$receiver");
                            List arrayList = new ArrayList();
                            if (this.f83448a.f83447a.f83444b) {
                                List list = recommendFollowState.getListState().getList();
                                arrayList.addAll(list);
                                RecommendList recommendList = recommendList;
                                C52711k.m112236a((Object) recommendList, "recommendList");
                                List<C31907e> recommendFollowList = recommendList.getRecommendFollowList();
                                C52711k.m112236a((Object) recommendFollowList, "recommendList.recommendFollowList");
                                for (C31907e eVar : recommendFollowList) {
                                    if (!list.contains(eVar)) {
                                        C52711k.m112236a((Object) eVar, "struct");
                                        arrayList.add(eVar);
                                    }
                                }
                            } else {
                                RecommendList recommendList2 = recommendList;
                                C52711k.m112236a((Object) recommendList2, "recommendList");
                                List recommendFollowList2 = recommendList2.getRecommendFollowList();
                                C52711k.m112236a((Object) recommendFollowList2, "recommendList.recommendFollowList");
                                arrayList.addAll(recommendFollowList2);
                            }
                            RecommendList recommendList3 = recommendList;
                            C52711k.m112236a((Object) recommendList3, "recommendList");
                            recommendList3.setRecommendFollowList(C52575l.m112139e((Collection<? extends T>) arrayList));
                            C31949b bVar = this.f83448a.f83447a.f83445c;
                            if (bVar != null) {
                                RecommendList clone = recommendList.clone();
                                C52711k.m112236a((Object) clone, "recommendList.clone()");
                                bVar.mo65158a(clone);
                            }
                            ListState listState = recommendFollowState.getListState();
                            boolean hasMore = recommendList.hasMore();
                            RecommendList recommendList4 = recommendList;
                            C52711k.m112236a((Object) recommendList4, "recommendList");
                            int cursor = recommendList4.getCursor();
                            RecommendList recommendList5 = recommendList;
                            C52711k.m112236a((Object) recommendList5, "recommendList");
                            return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, ListState.copy$default(listState, new C31975b(hasMore, cursor, recommendList5.getLogPb()), arrayList, null, null, null, 28, null), 63, null);
                        }
                    });
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C31950c f83450a;

                {
                    this.f83450a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C31949b bVar = this.f83450a.f83445c;
                    if (bVar != null) {
                        C52711k.m112236a((Object) th, "throwable");
                        bVar.mo65159a(th);
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$d */
    public static final class C31955d<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f83451a;

        /* renamed from: b */
        final /* synthetic */ String f83452b;

        public C31955d(RecommendFollowViewModel recommendFollowViewModel, String str) {
            this.f83451a = recommendFollowViewModel;
            this.f83452b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            this.f83451a.mo22530c(new C52671b<RecommendFollowState, RecommendFollowState>(this) {

                /* renamed from: a */
                final /* synthetic */ C31955d f83453a;

                {
                    this.f83453a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                    C52711k.m112240b(recommendFollowState, "$receiver");
                    Iterable list = recommendFollowState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (!C52711k.m112239a((Object) ((C31907e) next).f83352a, (Object) this.f83453a.f83452b)) {
                            arrayList.add(next);
                        }
                    }
                    List list2 = (List) arrayList;
                    return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, new C52847n(this.f83453a.f83452b, Boolean.valueOf(true)), ListState.copy$default(recommendFollowState.getListState(), null, list2, null, null, null, 29, null), 31, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$e */
    public static final class C31957e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C31957e f83454a = new C31957e();

        C31957e() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f */
    static final class C31958f extends C52712l implements C52671b<RecommendFollowState, C2201v<C52847n<? extends List<? extends C31907e>, ? extends C31975b>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f83455a;

        C31958f(RecommendFollowViewModel recommendFollowViewModel) {
            this.f83455a = recommendFollowViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
            C52711k.m112240b(recommendFollowState, "state");
            C31891c cVar = this.f83455a.f83441d;
            String userId = recommendFollowState.getUserId();
            int a = C47945d.m103731a();
            C37940g a2 = C37940g.m84832a();
            C52711k.m112236a((Object) a2, "RecUserImpressionReporter.getInstance()");
            C2201v d = cVar.mo65093a(30, 0, userId, 11, 0, a, a2.mo77416b(), C47945d.m103733b(), recommendFollowState.getSecUid()).mo6540d((C1710e<? super T>) C319591.f83456a).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C31958f f83457a;

                /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f$2$a */
                static final class C31961a extends C52712l implements C52671b<RecommendFollowState, C52860x> {

                    /* renamed from: a */
                    final /* synthetic */ User f83458a;

                    C31961a(User user) {
                        this.f83458a = user;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                        C52711k.m112240b(recommendFollowState, "state");
                        this.f83458a.setRecommendReason(recommendFollowState.getRelationInfo());
                        return C52860x.f131107a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f$2$b */
                static final class C31962b extends C52712l implements C52671b<RecommendFollowState, C52860x> {

                    /* renamed from: a */
                    final /* synthetic */ Aweme f83459a;

                    C31962b(Aweme aweme) {
                        this.f83459a = aweme;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                        C52711k.m112240b(recommendFollowState, "it");
                        Aweme aweme = this.f83459a;
                        RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
                        relationDynamicLabel.setLabelInfo(recommendFollowState.getRelationInfo());
                        relationDynamicLabel.setType(5);
                        aweme.setRelationLabel(relationDynamicLabel);
                        return C52860x.f131107a;
                    }
                }

                {
                    this.f83457a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    RecommendList recommendList = (RecommendList) obj;
                    C52711k.m112240b(recommendList, "it");
                    List recommendFollowList = recommendList.getRecommendFollowList();
                    C52711k.m112236a((Object) recommendFollowList, "it.recommendFollowList");
                    Iterable iterable = recommendFollowList;
                    List userList = recommendList.getUserList();
                    C52711k.m112236a((Object) userList, "it.userList");
                    Iterable iterable2 = userList;
                    Iterator it = iterable.iterator();
                    Iterator it2 = iterable2.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(C52575l.m112104a(iterable, 10), C52575l.m112104a(iterable2, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        User user = (User) it2.next();
                        C31907e eVar = (C31907e) it.next();
                        eVar.f83355d = recommendList.getRecommendFollowList().indexOf(eVar);
                        if (eVar.f83355d == 0) {
                            this.f83457a.f83455a.mo22527b(new C31961a(user));
                        }
                        C52711k.m112236a((Object) user, "user.apply {\n           …                        }");
                        eVar.mo65112a(user);
                        eVar.f83354c.setRequestId(recommendList.getRid());
                        for (Aweme aweme : eVar.f83353b) {
                            if (eVar.f83355d == 0) {
                                this.f83457a.f83455a.mo22527b(new C31962b(aweme));
                            } else {
                                RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
                                C52711k.m112236a((Object) user, "user");
                                String recommendReason = user.getRecommendReason();
                                if (recommendReason == null) {
                                    recommendReason = "";
                                }
                                relationDynamicLabel.setLabelInfo(recommendReason);
                                relationDynamicLabel.setType(5);
                                aweme.setRelationLabel(relationDynamicLabel);
                            }
                            C23324d.m57378a().updateAweme(aweme.clone());
                        }
                        arrayList.add(eVar);
                    }
                    return C52856t.m112465a(arrayList, new C31975b(recommendList.hasMore(), recommendList.getCursor(), recommendList.getLogPb()));
                }
            });
            C52711k.m112236a((Object) d, "repo.getRecommendFollowL….logPb)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$g */
    static final class C31963g extends C52712l implements C52671b<RecommendFollowState, C2201v<C52847n<? extends List<? extends C31907e>, ? extends C31975b>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f83460a;

        C31963g(RecommendFollowViewModel recommendFollowViewModel) {
            this.f83460a = recommendFollowViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
            C52711k.m112240b(recommendFollowState, "state");
            C31891c cVar = this.f83460a.f83441d;
            int i = ((C31975b) recommendFollowState.getListState().getPayload()).f31450b;
            String userId = recommendFollowState.getUserId();
            int a = C47945d.m103731a();
            C37940g a2 = C37940g.m84832a();
            C52711k.m112236a((Object) a2, "RecUserImpressionReporter.getInstance()");
            C2201v d = cVar.mo65093a(30, i, userId, 11, 0, a, a2.mo77416b(), C47945d.m103733b(), recommendFollowState.getSecUid()).mo6540d((C1710e<? super T>) C319641.f83461a).mo6541d((C1711f<? super T, ? extends R>) C319652.f83462a);
            C52711k.m112236a((Object) d, "repo.getRecommendFollowL….logPb)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$h */
    static final class C31966h extends C52712l implements C52682m<List<? extends C31907e>, List<? extends C31907e>, List<C31907e>> {

        /* renamed from: a */
        public static final C31966h f83463a = new C31966h();

        C31966h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List<C31907e> list2 = (List) obj2;
            C52711k.m112240b(list, "oldList");
            C52711k.m112240b(list2, "newList");
            List arrayList = new ArrayList();
            arrayList.addAll(list);
            for (C31907e eVar : list2) {
                if (!list.contains(eVar)) {
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$i */
    static final class C31967i<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        public static final C31967i f83464a = new C31967i();

        C31967i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "list");
            return C2201v.m6613b((Iterable<? extends T>) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$j */
    static final class C31968j<T> implements C1710e<C52847n<? extends C52860x, ? extends List<? extends C31907e>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f83465a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$j$a */
        static final class C31969a extends C52712l implements C52671b<RecommendFollowState, RecommendFollowState> {

            /* renamed from: a */
            final /* synthetic */ List f83466a;

            C31969a(List list) {
                this.f83466a = list;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                C52711k.m112240b(recommendFollowState, "$receiver");
                return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, ListState.copy$default(recommendFollowState.getListState(), null, this.f83466a, null, null, null, 29, null), 63, null);
            }
        }

        C31968j(RecommendFollowViewModel recommendFollowViewModel) {
            this.f83465a = recommendFollowViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) ((C52847n) obj).getSecond();
            if (list != null) {
                this.f83465a.mo22530c(new C31969a(list));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$k */
    static final class C31970k extends C52712l implements C52682m<RecommendFollowState, ListState<C31907e, C31975b>, RecommendFollowState> {

        /* renamed from: a */
        public static final C31970k f83467a = new C31970k();

        C31970k() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(recommendFollowState, "$receiver");
            C52711k.m112240b(listState, "it");
            return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, listState, 63, null);
        }
    }

    /* renamed from: e */
    public final void mo65157e() {
        this.f83442e.mo22565b();
    }

    public final void onCleared() {
        super.onCleared();
        this.f83441d.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        RecommendFollowState recommendFollowState = new RecommendFollowState("", null, 0, null, null, null, null, 126, null);
        return recommendFollowState;
    }

    public RecommendFollowViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C31958f(this), new C31963g(this), null, C31966h.f83463a, 4, null);
        this.f83442e = listMiddleware;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<RecommendFollowState, C31907e, C31975b> listMiddleware = this.f83442e;
        listMiddleware.mo22635a(C31976c.f83475a, (C52682m<? super S, ? super PROP, ? extends S>) C31970k.f83467a);
        mo22525a(listMiddleware);
        C31891c cVar = this.f83441d;
        C1690c f = C11571b.m23674a((C11544e<K, V>) cVar.f83332b).mo22301a(false, (C11574e<?, ?>[]) new C11574e[]{C11571b.m23675a((C11587b<K, V, REQ, RESP>) cVar.f83331a)}).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) C31967i.f83464a).mo6545f((C1710e<? super T>) new C31968j<Object>(this));
        C52711k.m112236a((Object) f, "repo.observerListSource(…      }\n                }");
        mo22521a(f);
    }
}
