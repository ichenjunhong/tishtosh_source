package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p683ss.android.ugc.aweme.experiment.C29503d;
import com.p683ss.android.ugc.aweme.following.p1768a.C31992a;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.repository.C32009a;
import com.p683ss.android.ugc.aweme.following.repository.C32010b;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.p683ss.android.ugc.aweme.profile.C39830d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.repository.C47587a;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel */
public final class ConnectedRelationListViewModel extends JediBaseViewModel<ConnectedRelationState> {

    /* renamed from: g */
    public static final C32291a f84123g = new C32291a(null);

    /* renamed from: d */
    public final C32010b f84124d = new C32010b();

    /* renamed from: e */
    public final C32579a f84125e = C32616c.f84865a.createRecommendListRepository();

    /* renamed from: f */
    public final ListMiddleware<ConnectedRelationState, Object, C32346c> f84126f;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$a */
    public static final class C32291a {
        private C32291a() {
        }

        public /* synthetic */ C32291a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$b */
    static final class C32292b extends C52712l implements C52671b<ConnectedRelationState, ConnectedRelationState> {

        /* renamed from: a */
        public static final C32292b f84127a = new C32292b();

        C32292b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            C52711k.m112240b(connectedRelationState, "$receiver");
            Iterable list = connectedRelationState.getListState().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(next instanceof RecommendContact)) {
                    arrayList.add(next);
                }
            }
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, null, null, null, ListState.copy$default(connectedRelationState.getListState(), null, (List) arrayList, null, null, null, 29, null), 31, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$c */
    static final class C32293c<T> implements C1710e<String> {

        /* renamed from: a */
        public static final C32293c f84128a = new C32293c();

        C32293c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$d */
    static final class C32294d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C32294d f84129a = new C32294d();

        C32294d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$e */
    static final class C32295e extends C52712l implements C52671b<ConnectedRelationState, ConnectedRelationState> {

        /* renamed from: a */
        final /* synthetic */ C31992a f84130a;

        C32295e(C31992a aVar) {
            this.f84130a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            C52711k.m112240b(connectedRelationState, "$receiver");
            HashMap hashMap = new HashMap();
            List arrayList = new ArrayList();
            List<? extends User> list = this.f84130a.f83504b;
            if (list != null) {
                for (User user : list) {
                    if (user.getUnReadVideoInfo() != null) {
                        user.getUid();
                        user.getUnReadVideoCount();
                        if (user.getUnReadVideoCount() > 0) {
                            Map map = hashMap;
                            String uid = user.getUid();
                            C52711k.m112236a((Object) uid, "it.uid");
                            map.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                            String uid2 = user.getUid();
                            C52711k.m112236a((Object) uid2, "it.uid");
                            arrayList.add(uid2);
                        }
                    }
                }
            }
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, null, hashMap, arrayList, null, 39, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$f */
    static final class C32296f extends C52712l implements C52671b<ConnectedRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32346c>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f84131a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$f$a */
        static final class C32299a<T, R> implements C1711f<Throwable, RecommendList> {

            /* renamed from: a */
            public static final C32299a f84134a = new C32299a();

            C32299a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                C52711k.m112240b((Throwable) obj, "it");
                return new RecommendList();
            }
        }

        C32296f(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f84131a = connectedRelationListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            C52711k.m112240b(connectedRelationState, "state");
            C32010b bVar = this.f84131a.f84124d;
            String userId = connectedRelationState.getUserId();
            String secUserId = connectedRelationState.getSecUserId();
            C52711k.m112240b(userId, "uid");
            C52711k.m112240b(secUserId, "secUid");
            C2201v d = C2201v.m6603a((C2206z<? extends T1>) bVar.f83583a.mo22318c(new C32009a(userId, secUserId, null, null)), (C2206z<? extends T2>) this.f84131a.f84125e.mo65910a(Integer.valueOf(30), Integer.valueOf(0), connectedRelationState.getUserId(), 3, Integer.valueOf(0), Integer.valueOf(C47945d.m103731a()), connectedRelationState.getReportId(), null, Integer.valueOf(C47945d.m103733b()), connectedRelationState.getSecUserId()).mo6547f((C1711f<? super Throwable, ? extends T>) C32299a.f84134a), (C1707b<? super T1, ? super T2, ? extends R>) C322971.f84132a).mo6541d((C1711f<? super T, ? extends R>) new C32345b<Object,Object>(C39830d.m88578a((C52671b<? super T, ? extends R>) new C52671b<C52855s<? extends Integer, ? extends C31992a, ? extends RecommendList>, C52847n<? extends List<? extends Object>, ? extends C32346c>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32296f f84133a;

                {
                    this.f84133a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x0061 A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
                    /*
                        r10 = this;
                        d.s r11 = (p2628d.C52855s) r11
                        java.lang.String r0 = "$receiver"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$f r0 = r10.f84133a
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel r0 = r0.f84131a
                        java.lang.Object r1 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r1 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r1
                        if (r1 == 0) goto L_0x001d
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$e r2 = new com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$e
                        r2.<init>(r1)
                        d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
                        r0.mo22530c(r2)
                    L_0x001d:
                        java.lang.Object r0 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r0 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r0
                        java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f83504b
                        java.util.Collection r0 = (java.util.Collection) r0
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L_0x0034
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L_0x0032
                        goto L_0x0034
                    L_0x0032:
                        r0 = 0
                        goto L_0x0035
                    L_0x0034:
                        r0 = 1
                    L_0x0035:
                        if (r0 == 0) goto L_0x003d
                        java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
                        goto L_0x00ea
                    L_0x003d:
                        java.lang.Object r0 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r0 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r0
                        java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f83504b
                        java.lang.Object r3 = r11.getThird()
                        com.ss.android.ugc.aweme.friends.model.RecommendList r3 = (com.p683ss.android.ugc.aweme.friends.model.RecommendList) r3
                        java.util.List r3 = r3.getUserList()
                        java.lang.String r4 = "third.userList"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                        java.lang.Iterable r3 = (java.lang.Iterable) r3
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.Collection r4 = (java.util.Collection) r4
                        java.util.Iterator r3 = r3.iterator()
                    L_0x0061:
                        boolean r5 = r3.hasNext()
                        if (r5 == 0) goto L_0x00b6
                        java.lang.Object r5 = r3.next()
                        r6 = r5
                        com.ss.android.ugc.aweme.profile.model.User r6 = (com.p683ss.android.ugc.aweme.profile.model.User) r6
                        java.lang.Object r7 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r7 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r7
                        java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r7 = r7.f83504b
                        if (r7 != 0) goto L_0x007b
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x007b:
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        boolean r8 = r7 instanceof java.util.Collection
                        if (r8 == 0) goto L_0x008a
                        r8 = r7
                        java.util.Collection r8 = (java.util.Collection) r8
                        boolean r8 = r8.isEmpty()
                        if (r8 != 0) goto L_0x00af
                    L_0x008a:
                        java.util.Iterator r7 = r7.iterator()
                    L_0x008e:
                        boolean r8 = r7.hasNext()
                        if (r8 == 0) goto L_0x00af
                        java.lang.Object r8 = r7.next()
                        com.ss.android.ugc.aweme.profile.model.User r8 = (com.p683ss.android.ugc.aweme.profile.model.User) r8
                        java.lang.String r9 = "ru"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r6, r9)
                        java.lang.String r9 = r6.getUid()
                        java.lang.String r8 = r8.getUid()
                        boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r8)
                        if (r8 == 0) goto L_0x008e
                        r6 = 0
                        goto L_0x00b0
                    L_0x00af:
                        r6 = 1
                    L_0x00b0:
                        if (r6 == 0) goto L_0x0061
                        r4.add(r5)
                        goto L_0x0061
                    L_0x00b6:
                        java.util.List r4 = (java.util.List) r4
                        r1 = r4
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L_0x00bf:
                        boolean r3 = r1.hasNext()
                        if (r3 == 0) goto L_0x00de
                        java.lang.Object r3 = r1.next()
                        com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3
                        java.lang.String r5 = "it"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                        java.lang.Object r5 = r11.getThird()
                        com.ss.android.ugc.aweme.friends.model.RecommendList r5 = (com.p683ss.android.ugc.aweme.friends.model.RecommendList) r5
                        java.lang.String r5 = r5.getRid()
                        r3.setRequestId(r5)
                        goto L_0x00bf
                    L_0x00de:
                        java.lang.Object r1 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r1 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r1
                        java.lang.String r1 = r1.f83503a
                        java.util.List r0 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel.m74636a(r0, r4, r1)
                    L_0x00ea:
                        java.lang.Object r1 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r1 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r1
                        java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r1.f83504b
                        if (r1 == 0) goto L_0x00f8
                        int r2 = r1.size()
                    L_0x00f8:
                        com.ss.android.ugc.aweme.following.ui.viewmodel.c r1 = new com.ss.android.ugc.aweme.following.ui.viewmodel.c
                        java.lang.Object r3 = r11.getSecond()
                        com.ss.android.ugc.aweme.following.a.a r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C31992a) r3
                        java.lang.String r3 = r3.f83503a
                        java.lang.Object r4 = r11.getThird()
                        com.ss.android.ugc.aweme.friends.model.RecommendList r4 = (com.p683ss.android.ugc.aweme.friends.model.RecommendList) r4
                        boolean r4 = r4.hasMore()
                        java.lang.Object r11 = r11.getThird()
                        com.ss.android.ugc.aweme.friends.model.RecommendList r11 = (com.p683ss.android.ugc.aweme.friends.model.RecommendList) r11
                        int r11 = r11.getCursor()
                        r1.<init>(r3, r2, r4, r11)
                        d.n r11 = p2628d.C52856t.m112465a(r0, r1)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel.C32296f.C322982.invoke(java.lang.Object):java.lang.Object");
                }
            })));
            C52711k.m112236a((Object) d, "Observable.zip(relationO…                       })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$g */
    static final class C32300g extends C52712l implements C52671b<ConnectedRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32346c>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f84135a;

        C32300g(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f84135a = connectedRelationListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            C52711k.m112240b(connectedRelationState, "state");
            C2201v d = this.f84135a.f84125e.mo65910a(Integer.valueOf(30), Integer.valueOf(((C32346c) connectedRelationState.getListState().getPayload()).f31450b), connectedRelationState.getUserId(), 3, Integer.valueOf(0), Integer.valueOf(C47945d.m103731a()), connectedRelationState.getReportId(), null, Integer.valueOf(C47945d.m103733b()), connectedRelationState.getSecUserId()).mo6541d((C1711f<? super T, ? extends R>) C323011.f84136a).mo6518a((C1710e<? super T>) C323022.f84137a).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    C52855s sVar = (C52855s) obj;
                    C52711k.m112240b(sVar, "resp");
                    List arrayList = new ArrayList();
                    Object third = sVar.getThird();
                    C52711k.m112236a(third, "resp.third");
                    List<User> userList = ((RecommendList) third).getUserList();
                    C52711k.m112236a((Object) userList, "resp.third.userList");
                    for (User user : userList) {
                        C52711k.m112236a((Object) user, "it");
                        C32004k kVar = new C32004k(2, user, 0, null, 12, null);
                        arrayList.add(kVar);
                    }
                    List e = C52575l.m112138e((Iterable<? extends T>) arrayList);
                    String str = ((C32346c) connectedRelationState.getListState().getPayload()).f84209c;
                    int i = ((C32346c) connectedRelationState.getListState().getPayload()).f84210d;
                    boolean hasMore = ((RecommendList) sVar.getThird()).hasMore();
                    Object third2 = sVar.getThird();
                    C52711k.m112236a(third2, "resp.third");
                    return C52856t.m112465a(e, new C32346c(str, i, hasMore, ((RecommendList) third2).getCursor()));
                }
            });
            C52711k.m112236a((Object) d, "mRecommendListRepository…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$h */
    static final class C32304h extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C32304h f84139a = new C32304h();

        C32304h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            HashSet hashSet = new HashSet();
            List arrayList = new ArrayList();
            int i = 0;
            for (Object next : list) {
                if (next instanceof C32004k) {
                    C32004k kVar = (C32004k) next;
                    if (hashSet.add(kVar.f83564b.getUid())) {
                        int i2 = i + 1;
                        arrayList.add(C32004k.m74394a(kVar, 0, null, i, null, 11, null));
                        i = i2;
                    }
                }
                arrayList.add(next);
            }
            int i3 = i;
            for (Object next2 : list2) {
                if (next2 != null) {
                    C32004k kVar2 = (C32004k) next2;
                    if (hashSet.add(kVar2.f83564b.getUid())) {
                        int i4 = i3 + 1;
                        arrayList.add(C32004k.m74394a(kVar2, 0, null, i3, null, 11, null));
                        i3 = i4;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$i */
    static final class C32305i<T> implements C1710e<C11575f<? extends List<? extends C47587a>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f84140a;

        C32305i(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f84140a = connectedRelationListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C11575f fVar = (C11575f) obj;
            this.f84140a.mo22530c(new C52671b<ConnectedRelationState, ConnectedRelationState>(this) {

                /* renamed from: a */
                final /* synthetic */ C32305i f84141a;

                {
                    this.f84141a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
                    /*
                        r13 = this;
                        r0 = r14
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState) r0
                        java.lang.String r14 = "$receiver"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r0, r14)
                        java.util.ArrayList r14 = new java.util.ArrayList
                        r14.<init>()
                        java.util.List r14 = (java.util.List) r14
                        com.bytedance.jedi.arch.ext.list.ListState r1 = r0.getListState()
                        java.util.List r1 = r1.getList()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L_0x001d:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x0038
                        java.lang.Object r2 = r1.next()
                        boolean r3 = r2 instanceof com.p683ss.android.ugc.aweme.following.p1768a.C32004k
                        if (r3 == 0) goto L_0x001d
                        com.ss.android.ugc.aweme.following.a.k r2 = (com.p683ss.android.ugc.aweme.following.p1768a.C32004k) r2
                        int r3 = r2.f83563a
                        r4 = 5
                        if (r3 != r4) goto L_0x001d
                        com.ss.android.ugc.aweme.profile.model.User r2 = r2.f83564b
                        r14.add(r2)
                        goto L_0x001d
                    L_0x0038:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.List r1 = (java.util.List) r1
                        com.bytedance.jedi.a.c.f r2 = r3
                        java.lang.Object r2 = r2.mo22313a()
                        java.util.List r2 = (java.util.List) r2
                        if (r2 == 0) goto L_0x0120
                        java.util.HashMap r3 = new java.util.HashMap
                        java.util.Collection r2 = (java.util.Collection) r2
                        java.util.List r4 = p2628d.p2629a.C52575l.m112139e(r2)
                        int r4 = r4.size()
                        r3.<init>(r4)
                        java.util.List r2 = p2628d.p2629a.C52575l.m112139e(r2)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.Iterator r2 = r2.iterator()
                    L_0x0062:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x0082
                        java.lang.Object r4 = r2.next()
                        com.ss.android.ugc.aweme.user.repository.a r4 = (com.p683ss.android.ugc.aweme.user.repository.C47587a) r4
                        r5 = r3
                        java.util.Map r5 = (java.util.Map) r5
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f120036a
                        java.lang.String r6 = r6.getUid()
                        java.lang.String r7 = "item.user.uid"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f120036a
                        r5.put(r6, r4)
                        goto L_0x0062
                    L_0x0082:
                        com.bytedance.jedi.arch.ext.list.ListState r2 = r0.getListState()
                        java.util.List r2 = r2.getList()
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.Collection r4 = (java.util.Collection) r4
                        java.util.Iterator r2 = r2.iterator()
                    L_0x0097:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L_0x00c2
                        java.lang.Object r5 = r2.next()
                        boolean r6 = r5 instanceof com.p683ss.android.ugc.aweme.following.p1768a.C32004k
                        if (r6 == 0) goto L_0x00bb
                        r6 = r5
                        com.ss.android.ugc.aweme.following.a.k r6 = (com.p683ss.android.ugc.aweme.following.p1768a.C32004k) r6
                        int r7 = r6.f83563a
                        r8 = 2
                        if (r7 != r8) goto L_0x00bb
                        com.ss.android.ugc.aweme.profile.model.User r6 = r6.f83564b
                        java.lang.String r6 = r6.getUid()
                        boolean r6 = r3.containsKey(r6)
                        if (r6 == 0) goto L_0x00bb
                        r6 = 1
                        goto L_0x00bc
                    L_0x00bb:
                        r6 = 0
                    L_0x00bc:
                        if (r6 == 0) goto L_0x0097
                        r4.add(r5)
                        goto L_0x0097
                    L_0x00c2:
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r2 = r4.iterator()
                    L_0x00ca:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x0120
                        java.lang.Object r4 = r2.next()
                        if (r4 == 0) goto L_0x0118
                        com.ss.android.ugc.aweme.following.a.k r4 = (com.p683ss.android.ugc.aweme.following.p1768a.C32004k) r4
                        com.ss.android.ugc.aweme.profile.model.User r5 = r4.f83564b
                        java.lang.String r5 = r5.getUid()
                        java.lang.Object r5 = r3.get(r5)
                        com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
                        if (r5 == 0) goto L_0x00ca
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f83564b
                        java.lang.String r6 = r6.getUid()
                        r5.setRequestId(r6)
                        java.lang.String r6 = "user"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f83564b
                        java.lang.String r6 = r6.getRecommendReason()
                        r5.setRecommendReason(r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f83564b
                        int r6 = r6.getAwemeCount()
                        r5.setAwemeCount(r6)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f83564b
                        int r4 = r4.getFollowerCount()
                        r5.setFollowerCount(r4)
                        java.lang.String r4 = "this.also { user ->\n    …                        }"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r5, r4)
                        r1.add(r5)
                        goto L_0x00ca
                    L_0x0118:
                        d.u r14 = new d.u
                        java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser"
                        r14.<init>(r0)
                        throw r14
                    L_0x0120:
                        com.bytedance.jedi.arch.ext.list.ListState r2 = r0.getListState()
                        com.bytedance.jedi.arch.ext.list.l r2 = r2.getPayload()
                        com.ss.android.ugc.aweme.following.ui.viewmodel.c r2 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.C32346c) r2
                        java.lang.String r2 = r2.f84209c
                        java.util.List r5 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel.m74636a(r14, r1, r2)
                        r1 = 0
                        r2 = 0
                        r14 = 0
                        r11 = 0
                        r12 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r3 = r0.getListState()
                        r4 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 29
                        r10 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r6 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
                        r7 = 31
                        r3 = r14
                        r4 = r11
                        r5 = r12
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r14 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel.C32305i.C323061.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$j */
    static final class C32307j extends C52712l implements C52682m<ConnectedRelationState, ListState<Object, C32346c>, ConnectedRelationState> {

        /* renamed from: a */
        public static final C32307j f84143a = new C32307j();

        C32307j() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(connectedRelationState, "$receiver");
            C52711k.m112240b(listState, "it");
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, null, null, null, listState, 31, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$k */
    static final class C32308k extends C52712l implements C52671b<ConnectedRelationState, ConnectedRelationState> {

        /* renamed from: a */
        final /* synthetic */ String f84144a;

        C32308k(String str) {
            this.f84144a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
            C52711k.m112240b(connectedRelationState, "$receiver");
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, this.f84144a, null, null, null, 59, null);
        }
    }

    /* renamed from: e */
    public final void mo65396e() {
        this.f84126f.mo22565b();
    }

    public final void onCleared() {
        super.onCleared();
        this.f84124d.aZ_();
        this.f84125e.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        ConnectedRelationState connectedRelationState = new ConnectedRelationState(null, null, null, null, null, null, 63, null);
        return connectedRelationState;
    }

    public ConnectedRelationListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C32296f(this), new C32300g(this), null, C32304h.f84139a, 4, null);
        this.f84126f = listMiddleware;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<ConnectedRelationState, Object, C32346c> listMiddleware = this.f84126f;
        listMiddleware.mo22635a(C32344a.f84207a, (C52682m<? super S, ? super PROP, ? extends S>) C32307j.f84143a);
        mo22525a(listMiddleware);
        this.f84125e.mo65908a(3).mo6545f((C1710e<? super T>) new C32305i<Object>(this));
    }

    /* renamed from: a */
    public final void mo65395a(String str) {
        C52711k.m112240b(str, "reportId");
        mo22530c(new C32308k(str));
    }

    /* renamed from: a */
    public final void mo65394a(User user) {
        C52711k.m112240b(user, "user");
        if (user instanceof RecommendContact) {
            mo22530c(C32292b.f84127a);
            return;
        }
        C32579a aVar = this.f84125e;
        String uid = user.getUid();
        C52711k.m112236a((Object) uid, "user.uid");
        C52711k.m112236a((Object) aVar.mo65907a(uid, user.getSecUid()).mo6152a((C1710e<? super T>) C32293c.f84128a, (C1710e<? super Throwable>) C32294d.f84129a), "mRecommendListRepository…ackTrace()\n            })");
    }

    /* renamed from: a */
    public static List<Object> m74636a(List<? extends User> list, List<? extends User> list2, String str) {
        boolean z;
        List<Object> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(new C32003j(6, str));
            for (User user : list) {
                C32004k kVar = new C32004k(5, user, 0, null, 12, null);
                arrayList.add(kVar);
                hashSet.add(user.getUid());
            }
        }
        Collection collection2 = list2;
        if (!collection2.isEmpty()) {
            String string = C11010c.m22280a().getResources().getString(R.string.ahs);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…relation_recommend_title)");
            arrayList.add(new C32003j(4, string));
            List<User> e = C52575l.m112139e(collection2);
            if (C32782b.f85367a.mo66362a()) {
                int a = C29503d.m69640a();
                if (a >= list2.size()) {
                    e.add(new RecommendContact(null, 1, null));
                } else {
                    e.add(a, new RecommendContact(null, 1, null));
                }
            }
            for (User user2 : e) {
                if (user2 instanceof RecommendContact) {
                    arrayList.add(new RecommendContact(null, 1, null));
                } else if (hashSet.add(user2.getUid())) {
                    int i2 = i + 1;
                    String requestId = user2.getRequestId();
                    C52711k.m112236a((Object) requestId, "user.requestId");
                    arrayList.add(new C32004k(2, user2, i, requestId));
                    i = i2;
                }
            }
        }
        return arrayList;
    }
}
