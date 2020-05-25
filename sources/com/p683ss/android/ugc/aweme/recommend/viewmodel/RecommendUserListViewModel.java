package com.p683ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1793g.C32801b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40012e;
import com.p683ss.android.ugc.aweme.user.repository.C47587a;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
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

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel */
public final class RecommendUserListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: f */
    public static final C41130a f104519f = new C41130a(null);

    /* renamed from: e */
    public final C32579a f104520e = C32616c.f84865a.createRecommendListRepository();

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$a */
    public static final class C41130a {
        private C41130a() {
        }

        public /* synthetic */ C41130a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$b */
    static final class C41131b extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        public static final C41131b f104521a = new C41131b();

        C41131b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "$receiver");
            Iterable list = recommendUserListState.getSubstate().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(((User) next) instanceof RecommendContact)) {
                    arrayList.add(next);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState.getSubstate(), null, (List) arrayList, null, null, null, 29, null), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$c */
    static final class C41132c<T> implements C1710e<String> {

        /* renamed from: a */
        public static final C41132c f104522a = new C41132c();

        C41132c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$d */
    static final class C41133d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C41133d f104523a = new C41133d();

        C41133d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$e */
    static final class C41134e extends C52712l implements C52671b<RecommendUserListState, C2201v<C52847n<? extends List<? extends User>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f104524a;

        C41134e(RecommendUserListViewModel recommendUserListViewModel) {
            this.f104524a = recommendUserListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String str2;
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            C32579a aVar = this.f104524a.f104520e;
            Integer valueOf = Integer.valueOf(30);
            Integer valueOf2 = Integer.valueOf(recommendUserListState.getSubstate().getPayload().f31450b);
            if (recommendUserListState.isMySelf()) {
                str = null;
            } else {
                str = recommendUserListState.getUserId();
            }
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C47945d.m103731a());
            String reportId = recommendUserListState.getReportId();
            Integer valueOf5 = Integer.valueOf(C47945d.m103733b());
            if (recommendUserListState.isMySelf()) {
                str2 = null;
            } else {
                str2 = recommendUserListState.getSecUserId();
            }
            C2201v d = aVar.mo65910a(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, reportId, null, valueOf5, str2).mo6541d((C1711f<? super T, ? extends R>) C411351.f104525a);
            C52711k.m112236a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$f */
    static final class C41136f extends C52712l implements C52682m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a */
        public static final C41136f f104526a = new C41136f();

        C41136f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            List arrayList = new ArrayList();
            arrayList.addAll(list);
            C32801b.m75681a(arrayList, list2);
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g */
    static final class C41137g extends C52712l implements C52671b<RecommendUserListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f104527a;

        C41137g(RecommendUserListViewModel recommendUserListViewModel) {
            this.f104527a = recommendUserListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            this.f104527a.f104520e.mo65908a(recommendUserListState.getRecommendUserType()).mo6545f((C1710e<? super T>) new C1710e<C11575f<? extends List<? extends C47587a>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C41137g f104528a;

                /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g$1$a */
                static final class C41139a extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

                    /* renamed from: a */
                    final /* synthetic */ List f104529a;

                    /* renamed from: b */
                    final /* synthetic */ C411381 f104530b;

                    C41139a(List list, C411381 r2) {
                        this.f104529a = list;
                        this.f104530b = r2;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
                        C52711k.m112240b(recommendUserListState, "$receiver");
                        return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState.getSubstate(), null, RecommendUserListViewModel.m90820a(this.f104529a), null, null, null, 29, null), 63, null);
                    }
                }

                {
                    this.f104528a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    List list = (List) ((C11575f) obj).mo22313a();
                    if (list != null) {
                        Iterable<C47587a> iterable = list;
                        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (C47587a aVar : iterable) {
                            arrayList.add(aVar.f120036a);
                        }
                        this.f104528a.f104527a.mo22530c(new C41139a((List) arrayList, this));
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$h */
    static final class C41140h extends C52712l implements C52671b<RecommendUserListState, C2201v<C52847n<? extends List<? extends User>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f104531a;

        C41140h(RecommendUserListViewModel recommendUserListViewModel) {
            this.f104531a = recommendUserListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String str2;
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            C32579a aVar = this.f104531a.f104520e;
            Integer valueOf = Integer.valueOf(30);
            Integer valueOf2 = Integer.valueOf(0);
            if (recommendUserListState.isMySelf()) {
                str = null;
            } else {
                str = recommendUserListState.getUserId();
            }
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C47945d.m103731a());
            String reportId = recommendUserListState.getReportId();
            Integer valueOf5 = Integer.valueOf(C47945d.m103733b());
            if (recommendUserListState.isMySelf()) {
                str2 = null;
            } else {
                str2 = recommendUserListState.getSecUserId();
            }
            C2201v d = aVar.mo65910a(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, reportId, null, valueOf5, str2).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C41140h f104532a;

                {
                    this.f104532a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    RecommendList recommendList = (RecommendList) obj;
                    C52711k.m112240b(recommendList, "it");
                    return C52856t.m112465a(RecommendUserListViewModel.m90820a(recommendList.getUserList()), new C11865l(recommendList.hasMore(), recommendList.getCursor()));
                }
            });
            C52711k.m112236a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$i */
    static final class C41142i extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ String f104533a;

        C41142i(String str) {
            this.f104533a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "$receiver");
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, this.f104533a, null, null, 111, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$j */
    public static final class C41143j extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C41144a f104534a;

        public C41143j(C41144a aVar) {
            this.f104534a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "$receiver");
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, this.f104534a, null, 95, null);
        }
    }

    /* renamed from: e */
    public final C52671b<RecommendUserListState, C2201v<C52847n<List<User>, C11865l>>> mo22556e() {
        return new C41140h<>(this);
    }

    /* renamed from: f */
    public final C52671b<RecommendUserListState, C2201v<C52847n<List<User>, C11865l>>> mo22557f() {
        return new C41134e<>(this);
    }

    /* renamed from: i */
    public final C52682m<List<? extends User>, List<? extends User>, List<User>> mo22586i() {
        return C41136f.f104526a;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        mo22527b(new C41137g(this));
    }

    public final void onCleared() {
        super.onCleared();
        this.f104520e.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        RecommendUserListState recommendUserListState = new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
        return recommendUserListState;
    }

    /* renamed from: a */
    public final void mo83656a(String str) {
        C52711k.m112240b(str, "reportId");
        mo22530c(new C41142i(str));
    }

    /* renamed from: a */
    public static List<User> m90820a(List<? extends User> list) {
        if (list == null) {
            return C52575l.m112097a();
        }
        List<User> e = C52575l.m112139e((Collection<? extends T>) list);
        if (C40012e.f101952a.mo66362a()) {
            int b = C29504e.m69642b();
            if (b >= list.size()) {
                e.add(new RecommendContact(null, 1, null));
            } else {
                e.add(b, new RecommendContact(null, 1, null));
            }
        }
        return e;
    }

    /* renamed from: a */
    public final void mo83655a(User user) {
        C52711k.m112240b(user, "user");
        if (user instanceof RecommendContact) {
            mo22530c(C41131b.f104521a);
            return;
        }
        C32579a aVar = this.f104520e;
        String uid = user.getUid();
        C52711k.m112236a((Object) uid, "user.uid");
        C52711k.m112236a((Object) aVar.mo65907a(uid, user.getSecUid()).mo6152a((C1710e<? super T>) C41132c.f104522a, (C1710e<? super Throwable>) C41133d.f104523a), "mRepository.dislikeRecom…ackTrace()\n            })");
    }
}
