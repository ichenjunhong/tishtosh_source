package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.following.p1768a.C32002i;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.repository.C32020d;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel */
public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {

    /* renamed from: g */
    public static final C32313a f84149g = new C32313a(null);

    /* renamed from: d */
    public final C32020d f84150d = new C32020d();

    /* renamed from: e */
    public boolean f84151e = true;

    /* renamed from: f */
    public final ListMiddleware<FollowerRelationState, Object, C32041i> f84152f;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$a */
    public static final class C32313a {
        private C32313a() {
        }

        public /* synthetic */ C32313a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$b */
    static final class C32314b extends C52712l implements C52682m<FollowerRelationState, ListState<Object, C32041i>, FollowerRelationState> {

        /* renamed from: a */
        public static final C32314b f84153a = new C32314b();

        C32314b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(followerRelationState, "$receiver");
            C52711k.m112240b(listState, "it");
            return FollowerRelationState.copy$default(followerRelationState, null, null, null, listState, false, 0, null, null, null, 503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$c */
    static final class C32315c extends C52712l implements C52671b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C31995c f84154a;

        /* renamed from: b */
        final /* synthetic */ FollowerRelationViewModel f84155b;

        /* renamed from: c */
        final /* synthetic */ boolean f84156c;

        C32315c(C31995c cVar, FollowerRelationViewModel followerRelationViewModel, boolean z) {
            this.f84154a = cVar;
            this.f84155b = followerRelationViewModel;
            this.f84156c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "$receiver");
            HashMap hashMap = new HashMap();
            List arrayList = new ArrayList();
            if (!this.f84156c) {
                hashMap.putAll(followerRelationState.getUnreadCountMap());
                arrayList.addAll(followerRelationState.getUnreadUidList());
            }
            List<User> list = this.f84154a.f83518a;
            if (list != null) {
                List<User> b = C52575l.m112128b((Iterable<? extends T>) list);
                if (b != null) {
                    for (User user : b) {
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
            }
            return FollowerRelationState.copy$default(followerRelationState, null, null, null, null, false, 0, null, hashMap, arrayList, 127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$d */
    static final class C32316d extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52723a f84157a;

        /* renamed from: b */
        final /* synthetic */ C52727e f84158b;

        C32316d(C52723a aVar, C52727e eVar) {
            this.f84157a = aVar;
            this.f84158b = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            this.f84157a.element = followerRelationState.isHotsoonHasMore();
            this.f84158b.element = followerRelationState.getHotsoonText();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$e */
    static final class C32317e extends C52712l implements C52671b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C52723a f84159a;

        /* renamed from: b */
        final /* synthetic */ C31995c f84160b;

        /* renamed from: c */
        final /* synthetic */ C52727e f84161c;

        C32317e(C52723a aVar, C31995c cVar, C52727e eVar) {
            this.f84159a = aVar;
            this.f84160b = cVar;
            this.f84161c = eVar;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r13) {
            /*
                r12 = this;
                r0 = r13
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState) r0
                java.lang.String r13 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r13)
                d.f.b.v$a r13 = r12.f84159a
                boolean r13 = r13.element
                r1 = 0
                r2 = 1
                if (r13 != 0) goto L_0x001e
                com.ss.android.ugc.aweme.following.a.c r13 = r12.f84160b
                int r13 = r13.f83527j
                if (r13 != r2) goto L_0x0018
                r13 = 1
                goto L_0x0019
            L_0x0018:
                r13 = 0
            L_0x0019:
                if (r13 == 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r5 = 0
                goto L_0x001f
            L_0x001e:
                r5 = 1
            L_0x001f:
                com.ss.android.ugc.aweme.following.a.c r13 = r12.f84160b
                int r6 = r13.f83529l
                com.ss.android.ugc.aweme.following.a.c r13 = r12.f84160b
                java.lang.String r13 = r13.f83528k
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                if (r13 == 0) goto L_0x0031
                int r13 = r13.length()
                if (r13 != 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                r13 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                if (r1 != 0) goto L_0x003e
                com.ss.android.ugc.aweme.following.a.c r1 = r12.f84160b
                java.lang.String r1 = r1.f83528k
            L_0x003c:
                r7 = r1
                goto L_0x0045
            L_0x003e:
                d.f.b.v$e r1 = r12.f84161c
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x003c
            L_0x0045:
                java.lang.String r1 = "if (!resp.hotSoonText.is…Text else lastHotsoonText"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                r8 = 0
                r9 = 0
                r10 = 399(0x18f, float:5.59E-43)
                r11 = 0
                r1 = r13
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r13 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32317e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$f */
    public static final class C32318f extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84162a;

        /* renamed from: b */
        final /* synthetic */ String f84163b;

        public C32318f(FollowerRelationViewModel followerRelationViewModel, String str) {
            this.f84162a = followerRelationViewModel;
            this.f84163b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            final List arrayList = new ArrayList();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            arrayList.add(new C32002i(8, TextUtils.equals(userId, g.getCurUserId()), this.f84163b));
            this.f84162a.mo22530c(new C52671b<FollowerRelationState, FollowerRelationState>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                    C52711k.m112240b(followerRelationState, "$receiver");
                    return FollowerRelationState.copy$default(followerRelationState, null, null, null, ListState.copy$default(followerRelationState.getListState(), null, arrayList, null, null, null, 29, null), false, 0, null, null, null, 503, null);
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$g */
    public static final class C32320g extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84165a;

        /* renamed from: b */
        final /* synthetic */ String f84166b;

        public C32320g(FollowerRelationViewModel followerRelationViewModel, String str) {
            this.f84165a = followerRelationViewModel;
            this.f84166b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            ListMiddleware<FollowerRelationState, Object, C32041i> listMiddleware = this.f84165a.f84152f;
            int size = followerRelationState.getListState().getList().size();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            CharSequence userId2 = followerRelationState.getUserId();
            IAccountUserService g2 = C20854a.m53167g();
            C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
            C32002i iVar = new C32002i(10, TextUtils.equals(userId2, g2.getCurUserId()), null, 4, null);
            listMiddleware.mo22563a(size, C52575l.m112099b((Object[]) new C32002i[]{new C32002i(11, TextUtils.equals(userId, g.getCurUserId()), this.f84166b), iVar}));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$h */
    static final class C32321h extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84167a;

        /* renamed from: b */
        final /* synthetic */ String f84168b;

        C32321h(FollowerRelationViewModel followerRelationViewModel, String str) {
            this.f84167a = followerRelationViewModel;
            this.f84168b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            ListMiddleware<FollowerRelationState, Object, C32041i> listMiddleware = this.f84167a.f84152f;
            int size = followerRelationState.getListState().getList().size();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            listMiddleware.mo22566b(size, new C32002i(11, TextUtils.equals(userId, g.getCurUserId()), this.f84168b));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$i */
    public static final class C32322i extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84169a;

        public C32322i(FollowerRelationViewModel followerRelationViewModel) {
            this.f84169a = followerRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            ListMiddleware<FollowerRelationState, Object, C32041i> listMiddleware = this.f84169a.f84152f;
            int size = followerRelationState.getListState().getList().size();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            C32002i iVar = new C32002i(10, TextUtils.equals(userId, g.getCurUserId()), null, 4, null);
            listMiddleware.mo22566b(size, iVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$j */
    static final class C32323j extends C52712l implements C52671b<FollowerRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32041i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84170a;

        C32323j(FollowerRelationViewModel followerRelationViewModel) {
            this.f84170a = followerRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            this.f84170a.f84151e = true;
            C2201v d = this.f84170a.f84150d.mo65211a(followerRelationState.getUserId(), followerRelationState.getSecUserId(), 0, 20, 0, FollowerRelationViewModel.m74647a(true, true), C47945d.m103731a(), C47945d.m103733b(), 0).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C32323j f84171a;

                {
                    this.f84171a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C31995c cVar = (C31995c) obj;
                    C52711k.m112240b(cVar, "resp");
                    this.f84171a.f84170a.mo65450a(cVar);
                    this.f84171a.f84170a.mo65451a(cVar, true);
                    List<User> list = cVar.f83518a;
                    C52711k.m112236a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (User user : iterable) {
                        C52711k.m112236a((Object) user, "user");
                        C32004k kVar = new C32004k(1, user, 0, null, 12, null);
                        arrayList.add(kVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = cVar.f83520c;
                    int i3 = cVar.f83524g;
                    long j = cVar.f83522e;
                    boolean z2 = cVar.f83525h;
                    if (this.f84171a.f84170a.f84151e) {
                        i = 1;
                    } else {
                        i = 1 + ((C32041i) followerRelationState.getListState().getPayload()).f83619e;
                    }
                    List<User> list3 = cVar.f83518a;
                    if (list3 != null) {
                        i2 = list3.size();
                    } else {
                        i2 = 0;
                    }
                    C32041i iVar = new C32041i(z, i3, j, z2, i, i2);
                    return C52856t.m112465a(list2, iVar);
                }
            });
            C52711k.m112236a((Object) d, "mFollowerRelationReposit…      )\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$k */
    static final class C32325k extends C52712l implements C52671b<FollowerRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32041i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84173a;

        C32325k(FollowerRelationViewModel followerRelationViewModel) {
            this.f84173a = followerRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            this.f84173a.f84151e = false;
            C2201v d = this.f84173a.f84150d.mo65211a(followerRelationState.getUserId(), followerRelationState.getSecUserId(), ((C32041i) followerRelationState.getListState().getPayload()).f83617c, 20, ((C32041i) followerRelationState.getListState().getPayload()).f31450b, FollowerRelationViewModel.m74647a(false, ((C32041i) followerRelationState.getListState().getPayload()).f83618d), C47945d.m103731a(), C47945d.m103733b(), followerRelationState.getVcdCount()).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C32325k f84174a;

                {
                    this.f84174a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C31995c cVar = (C31995c) obj;
                    C52711k.m112240b(cVar, "resp");
                    this.f84174a.f84173a.mo65450a(cVar);
                    this.f84174a.f84173a.mo65451a(cVar, false);
                    List<User> list = cVar.f83518a;
                    C52711k.m112236a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (User user : iterable) {
                        C52711k.m112236a((Object) user, "user");
                        C32004k kVar = new C32004k(1, user, 0, null, 12, null);
                        arrayList.add(kVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = cVar.f83520c;
                    int i2 = cVar.f83524g;
                    long j = cVar.f83522e;
                    boolean z2 = cVar.f83525h;
                    int i3 = 1;
                    if (!this.f84174a.f84173a.f84151e) {
                        i3 = ((C32041i) followerRelationState.getListState().getPayload()).f83619e + 1;
                    }
                    List<User> list3 = cVar.f83518a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C32041i iVar = new C32041i(z, i2, j, z2, i3, i);
                    return C52856t.m112465a(list2, iVar);
                }
            });
            C52711k.m112236a((Object) d, "mFollowerRelationReposit…      )\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$l */
    static final class C32327l extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C32327l f84176a = new C32327l();

        C32327l() {
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

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$m */
    public static final class C32328m extends C52712l implements C52671b<FollowerRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f84177a;

        /* renamed from: b */
        final /* synthetic */ String f84178b;

        public C32328m(FollowerRelationViewModel followerRelationViewModel, String str) {
            this.f84177a = followerRelationViewModel;
            this.f84178b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "it");
            Iterator it = followerRelationState.getListState().getList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (!(next instanceof C32004k) || !C52711k.m112239a((Object) ((C32004k) next).f83564b.getUid(), (Object) this.f84178b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                List e = C52575l.m112139e((Collection<? extends T>) followerRelationState.getListState().getList());
                e.remove(i);
                this.f84177a.f84152f.mo22564a(e);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$n */
    public static final class C32329n extends C52712l implements C52671b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f84179a;

        public C32329n(List list) {
            this.f84179a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowerRelationState followerRelationState = (FollowerRelationState) obj;
            C52711k.m112240b(followerRelationState, "$receiver");
            return FollowerRelationState.copy$default(followerRelationState, null, null, this.f84179a, null, false, 0, null, null, null, 507, null);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f84150d.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        FollowerRelationState followerRelationState = new FollowerRelationState(null, null, null, null, false, 0, null, null, null, 511, null);
        return followerRelationState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<FollowerRelationState, Object, C32041i> listMiddleware = this.f84152f;
        listMiddleware.mo22635a(C32347d.f84211a, (C52682m<? super S, ? super PROP, ? extends S>) C32314b.f84153a);
        mo22525a(listMiddleware);
    }

    public FollowerRelationViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C32323j(this), new C32325k(this), null, C32327l.f84176a, 4, null);
        this.f84152f = listMiddleware;
    }

    /* renamed from: a */
    public final void mo65450a(C31995c cVar) {
        C52723a aVar = new C52723a();
        aVar.element = false;
        C52727e eVar = new C52727e();
        eVar.element = "";
        mo22527b(new C32316d(aVar, eVar));
        mo22530c(new C32317e(aVar, cVar, eVar));
    }

    /* renamed from: a */
    public final void mo65452a(String str) {
        C52711k.m112240b(str, "des");
        mo22527b(new C32321h(this, str));
    }

    /* renamed from: a */
    public static int m74647a(boolean z, boolean z2) {
        if ((!C29504e.m69641a() || !z) && (z || !z2)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo65451a(C31995c cVar, boolean z) {
        if (cVar != null) {
            mo22530c(new C32315c(cVar, this, z));
        }
    }
}
