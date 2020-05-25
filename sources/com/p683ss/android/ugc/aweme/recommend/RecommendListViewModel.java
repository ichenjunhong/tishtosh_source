package com.p683ss.android.ugc.aweme.recommend;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
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
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52723a;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel */
public final class RecommendListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: f */
    public static final C41064a f104403f = new C41064a(null);

    /* renamed from: e */
    public final C32579a f104404e = C32616c.f84865a.createRecommendListRepository();

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$a */
    public static final class C41064a {
        private C41064a() {
        }

        public /* synthetic */ C41064a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$b */
    static final class C41065b extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ User f104405a;

        C41065b(User user) {
            this.f104405a = user;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "$receiver");
            Iterable list = recommendUserListState.getSubstate().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!C52711k.m112239a((Object) ((User) next).getUid(), (Object) this.f104405a.getUid())) {
                    arrayList.add(next);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState.getSubstate(), null, (List) arrayList, null, null, null, 29, null), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$c */
    static final class C41066c extends C52712l implements C52671b<RecommendUserListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52723a f104406a;

        C41066c(C52723a aVar) {
            this.f104406a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "it");
            if (((ListState) recommendUserListState.getSubstate()).getList().isEmpty()) {
                this.f104406a.element = true;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$d */
    static final class C41067d extends C52712l implements C52671b<RecommendUserListState, C2201v<C52847n<? extends List<? extends User>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f104407a;

        C41067d(RecommendListViewModel recommendListViewModel) {
            this.f104407a = recommendListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String userId;
            String secUserId;
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            C32579a aVar = this.f104407a.f104404e;
            Integer valueOf = Integer.valueOf(20);
            Integer valueOf2 = Integer.valueOf(recommendUserListState.getSubstate().getPayload().f31450b);
            if (recommendUserListState.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState.getUserId();
            }
            String str = userId;
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C47945d.m103731a());
            C37940g a = C37940g.m84832a();
            C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
            String b = a.mo77416b();
            Integer valueOf5 = Integer.valueOf(C47945d.m103733b());
            if (recommendUserListState.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState.getSecUserId();
            }
            C2201v d = aVar.mo65911b(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, b, null, valueOf5, secUserId).mo6541d((C1711f<? super T, ? extends R>) C410681.f104408a);
            C52711k.m112236a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$e */
    static final class C41069e extends C52712l implements C52682m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a */
        public static final C41069e f104409a = new C41069e();

        C41069e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List<User> list = (List) obj;
            List<User> list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            List arrayList = new ArrayList();
            for (User add : list) {
                arrayList.add(add);
            }
            for (User add2 : list2) {
                arrayList.add(add2);
            }
            C32801b.m75681a(arrayList, list);
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$f */
    static final class C41070f extends C52712l implements C52671b<RecommendUserListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f104410a;

        C41070f(RecommendListViewModel recommendListViewModel) {
            this.f104410a = recommendListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            this.f104410a.f104404e.mo65908a(recommendUserListState.getRecommendUserType()).mo6545f((C1710e<? super T>) new C1710e<C11575f<? extends List<? extends C47587a>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C41070f f104411a;

                /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$f$1$a */
                static final class C41072a extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

                    /* renamed from: a */
                    final /* synthetic */ List f104412a;

                    /* renamed from: b */
                    final /* synthetic */ C410711 f104413b;

                    C41072a(List list, C410711 r2) {
                        this.f104412a = list;
                        this.f104413b = r2;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        List list;
                        RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
                        C52711k.m112240b(recommendUserListState, "$receiver");
                        ListState substate = recommendUserListState.getSubstate();
                        List list2 = this.f104412a;
                        if (list2 != null) {
                            List e = C52575l.m112139e((Collection<? extends T>) list2);
                            if (C40012e.f101952a.mo66362a()) {
                                int b = C29504e.m69642b();
                                if (b >= list2.size()) {
                                    e.add(new RecommendContact(null, 1, null));
                                } else {
                                    e.add(b, new RecommendContact(null, 1, null));
                                }
                            }
                            list = e;
                        } else {
                            list = C52575l.m112097a();
                        }
                        return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(substate, null, list, null, null, null, 29, null), 63, null);
                    }
                }

                {
                    this.f104411a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    List list = (List) ((C11575f) obj).mo22313a();
                    if (list != null) {
                        Iterable<C47587a> iterable = list;
                        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (C47587a aVar : iterable) {
                            arrayList.add(aVar.f120036a);
                        }
                        this.f104411a.f104410a.mo22530c(new C41072a((List) arrayList, this));
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$g */
    static final class C41073g extends C52712l implements C52671b<RecommendUserListState, C2201v<C52847n<? extends List<? extends User>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f104414a;

        C41073g(RecommendListViewModel recommendListViewModel) {
            this.f104414a = recommendListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String secUserId;
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "state");
            C32579a aVar = this.f104414a.f104404e;
            Integer valueOf = Integer.valueOf(20);
            Integer valueOf2 = Integer.valueOf(0);
            if (recommendUserListState.isMySelf()) {
                str = null;
            } else {
                str = recommendUserListState.getUserId();
            }
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C47945d.m103731a());
            C37940g a = C37940g.m84832a();
            C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
            String b = a.mo77416b();
            Integer valueOf5 = Integer.valueOf(C47945d.m103733b());
            if (recommendUserListState.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState.getSecUserId();
            }
            C2201v d = aVar.mo65911b(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, b, null, valueOf5, secUserId).mo6541d((C1711f<? super T, ? extends R>) C410741.f104415a);
            C52711k.m112236a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$h */
    public static final class C41075h extends C52712l implements C52671b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C41112h f104416a;

        public C41075h(C41112h hVar) {
            this.f104416a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
            C52711k.m112240b(recommendUserListState, "$receiver");
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, this.f104416a, null, 95, null);
        }
    }

    /* renamed from: e */
    public final C52671b<RecommendUserListState, C2201v<C52847n<List<User>, C11865l>>> mo22556e() {
        return new C41073g<>(this);
    }

    /* renamed from: f */
    public final C52671b<RecommendUserListState, C2201v<C52847n<List<User>, C11865l>>> mo22557f() {
        return new C41067d<>(this);
    }

    /* renamed from: i */
    public final C52682m<List<? extends User>, List<? extends User>, List<User>> mo22586i() {
        return C41069e.f104409a;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        mo22527b(new C41070f(this));
    }

    public final void onCleared() {
        super.onCleared();
        this.f104404e.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        RecommendUserListState recommendUserListState = new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
        return recommendUserListState;
    }

    /* renamed from: a */
    public final boolean mo83574a(User user) {
        C52711k.m112240b(user, "user");
        C32579a aVar = this.f104404e;
        String uid = user.getUid();
        C52711k.m112236a((Object) uid, "user.uid");
        aVar.mo65907a(uid, user.getSecUid());
        mo22530c(new C41065b(user));
        C52723a aVar2 = new C52723a();
        aVar2.element = false;
        mo22527b(new C41066c(aVar2));
        return aVar2.element;
    }
}
