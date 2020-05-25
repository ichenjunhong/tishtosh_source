package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.following.p1768a.C31998e;
import com.p683ss.android.ugc.aweme.following.p1768a.C32002i;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.repository.C32029e;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel */
public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {

    /* renamed from: i */
    public static final C32330a f84180i = new C32330a(null);

    /* renamed from: d */
    public final C32029e f84181d = new C32029e();

    /* renamed from: e */
    public boolean f84182e;

    /* renamed from: f */
    public int f84183f;

    /* renamed from: g */
    public final int f84184g;

    /* renamed from: h */
    public final ListMiddleware<FollowingRelationState, Object, C32041i> f84185h;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$a */
    public static final class C32330a {
        private C32330a() {
        }

        public /* synthetic */ C32330a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$b */
    static final class C32331b extends C52712l implements C52682m<FollowingRelationState, ListState<Object, C32041i>, FollowingRelationState> {

        /* renamed from: a */
        public static final C32331b f84186a = new C32331b();

        C32331b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(followingRelationState, "$receiver");
            C52711k.m112240b(listState, "it");
            return FollowingRelationState.copy$default(followingRelationState, null, null, false, null, listState, false, 0, null, null, null, 1007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$c */
    static final class C32332c extends C52712l implements C52671b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C31998e f84187a;

        /* renamed from: b */
        final /* synthetic */ FollowingRelationViewModel f84188b;

        /* renamed from: c */
        final /* synthetic */ boolean f84189c;

        C32332c(C31998e eVar, FollowingRelationViewModel followingRelationViewModel, boolean z) {
            this.f84187a = eVar;
            this.f84188b = followingRelationViewModel;
            this.f84189c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "$receiver");
            HashMap hashMap = new HashMap();
            List arrayList = new ArrayList();
            if (!this.f84189c) {
                hashMap.putAll(followingRelationState.getUnreadCountMap());
                arrayList.addAll(followingRelationState.getUnreadUidList());
            }
            List<User> list = this.f84187a.f83542a;
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
            return FollowingRelationState.copy$default(followingRelationState, null, null, false, null, null, false, 0, null, hashMap, arrayList, NormalGiftView.ALPHA_255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$d */
    static final class C32333d extends C52712l implements C52671b<FollowingRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52723a f84190a;

        /* renamed from: b */
        final /* synthetic */ C52727e f84191b;

        C32333d(C52723a aVar, C52727e eVar) {
            this.f84190a = aVar;
            this.f84191b = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            this.f84190a.element = followingRelationState.isHotsoonHasMore();
            this.f84191b.element = followingRelationState.getHotsoonText();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$e */
    static final class C32334e extends C52712l implements C52671b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C52723a f84192a;

        /* renamed from: b */
        final /* synthetic */ C31998e f84193b;

        /* renamed from: c */
        final /* synthetic */ C52727e f84194c;

        C32334e(C52723a aVar, C31998e eVar, C52727e eVar2) {
            this.f84192a = aVar;
            this.f84193b = eVar;
            this.f84194c = eVar2;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                r0 = r14
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationState) r0
                java.lang.String r14 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r14)
                d.f.b.v$a r14 = r13.f84192a
                boolean r14 = r14.element
                r1 = 0
                r2 = 1
                if (r14 != 0) goto L_0x001e
                com.ss.android.ugc.aweme.following.a.e r14 = r13.f84193b
                int r14 = r14.f83551j
                if (r14 != r2) goto L_0x0018
                r14 = 1
                goto L_0x0019
            L_0x0018:
                r14 = 0
            L_0x0019:
                if (r14 == 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r6 = 0
                goto L_0x001f
            L_0x001e:
                r6 = 1
            L_0x001f:
                com.ss.android.ugc.aweme.following.a.e r14 = r13.f84193b
                int r7 = r14.f83549h
                com.ss.android.ugc.aweme.following.a.e r14 = r13.f84193b
                java.lang.String r14 = r14.f83550i
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                if (r14 == 0) goto L_0x0031
                int r14 = r14.length()
                if (r14 != 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                r14 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                if (r1 != 0) goto L_0x003f
                com.ss.android.ugc.aweme.following.a.e r1 = r13.f84193b
                java.lang.String r1 = r1.f83550i
            L_0x003d:
                r8 = r1
                goto L_0x0046
            L_0x003f:
                d.f.b.v$e r1 = r13.f84194c
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x003d
            L_0x0046:
                java.lang.String r1 = "if (!resp.hotSoonText.is…Text else lastHotsoonText"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r1)
                r9 = 0
                r10 = 0
                r11 = 799(0x31f, float:1.12E-42)
                r12 = 0
                r1 = r14
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r14 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel.C32334e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$f */
    public static final class C32335f extends C52712l implements C52671b<FollowingRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f84195a;

        public C32335f(FollowingRelationViewModel followingRelationViewModel) {
            this.f84195a = followingRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            ListMiddleware<FollowingRelationState, Object, C32041i> listMiddleware = this.f84195a.f84185h;
            int size = followingRelationState.getListState().getList().size();
            C32002i iVar = new C32002i(9, followingRelationState.isSelf(), null, 4, null);
            listMiddleware.mo22566b(size, iVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$g */
    public static final class C32336g extends C52712l implements C52671b<FollowingRelationState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f84196a;

        /* renamed from: b */
        final /* synthetic */ String f84197b;

        public C32336g(FollowingRelationViewModel followingRelationViewModel, String str) {
            this.f84196a = followingRelationViewModel;
            this.f84197b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            this.f84196a.f84185h.mo22566b(0, new C32002i(7, followingRelationState.isSelf(), this.f84197b));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$h */
    static final class C32337h extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C32337h f84198a = new C32337h();

        C32337h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "<anonymous parameter 0>");
            C52711k.m112240b(list, "refresh");
            return list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$i */
    static final class C32338i extends C52712l implements C52671b<FollowingRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32041i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f84199a;

        C32338i(FollowingRelationViewModel followingRelationViewModel) {
            this.f84199a = followingRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            this.f84199a.f84182e = true;
            C2201v d = this.f84199a.f84181d.mo65220a(followingRelationState.getUserId(), followingRelationState.getSecUserId(), 0, 20, 0, FollowingRelationViewModel.m74653a(true, followingRelationState.isSelf(), true), this.f84199a.f84184g, C47945d.m103733b(), 0, this.f84199a.f84183f).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C32338i f84200a;

                {
                    this.f84200a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C31998e eVar = (C31998e) obj;
                    C52711k.m112240b(eVar, "resp");
                    this.f84200a.f84199a.mo65478a(eVar, true);
                    this.f84200a.f84199a.mo65477a(eVar);
                    List<User> list = eVar.f83542a;
                    C52711k.m112236a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (User user : iterable) {
                        C52711k.m112236a((Object) user, "user");
                        C32004k kVar = new C32004k(0, user, 0, null, 12, null);
                        arrayList.add(kVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = eVar.f83544c;
                    int i3 = eVar.f83547f;
                    long j = eVar.f83546e;
                    boolean z2 = eVar.f83548g;
                    if (this.f84200a.f84199a.f84182e) {
                        i = 1;
                    } else {
                        i = 1 + ((C32041i) followingRelationState.getListState().getPayload()).f83619e;
                    }
                    List<User> list3 = eVar.f83542a;
                    if (list3 != null) {
                        i2 = list3.size();
                    } else {
                        i2 = 0;
                    }
                    C32041i iVar = new C32041i(z, i3, j, z2, i, i2);
                    return C52856t.m112465a(list2, iVar);
                }
            });
            C52711k.m112236a((Object) d, "mRepo.queryFollowingList…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$j */
    static final class C32340j extends C52712l implements C52671b<FollowingRelationState, C2201v<C52847n<? extends List<? extends Object>, ? extends C32041i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f84202a;

        C32340j(FollowingRelationViewModel followingRelationViewModel) {
            this.f84202a = followingRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "it");
            this.f84202a.f84182e = false;
            C2201v d = this.f84202a.f84181d.mo65220a(followingRelationState.getUserId(), followingRelationState.getSecUserId(), ((C32041i) followingRelationState.getListState().getPayload()).f83617c, 20, ((C32041i) followingRelationState.getListState().getPayload()).f31450b, FollowingRelationViewModel.m74653a(false, followingRelationState.isSelf(), ((C32041i) followingRelationState.getListState().getPayload()).f83618d), this.f84202a.f84184g, C47945d.m103733b(), followingRelationState.getVcdCount(), this.f84202a.f84183f).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C32340j f84203a;

                {
                    this.f84203a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C31998e eVar = (C31998e) obj;
                    C52711k.m112240b(eVar, "resp");
                    this.f84203a.f84202a.mo65477a(eVar);
                    this.f84203a.f84202a.mo65478a(eVar, false);
                    List<User> list = eVar.f83542a;
                    C52711k.m112236a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (User user : iterable) {
                        C52711k.m112236a((Object) user, "user");
                        C32004k kVar = new C32004k(0, user, 0, null, 12, null);
                        arrayList.add(kVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = eVar.f83544c;
                    int i2 = eVar.f83547f;
                    long j = eVar.f83546e;
                    boolean z2 = eVar.f83548g;
                    int i3 = 1;
                    if (!this.f84203a.f84202a.f84182e) {
                        i3 = ((C32041i) followingRelationState.getListState().getPayload()).f83619e + 1;
                    }
                    List<User> list3 = eVar.f83542a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C32041i iVar = new C32041i(z, i2, j, z2, i3, i);
                    return C52856t.m112465a(list2, iVar);
                }
            });
            C52711k.m112236a((Object) d, "mRepo.queryFollowingList…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$k */
    static final class C32342k extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C32342k f84205a = new C32342k();

        C32342k() {
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

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$l */
    static final class C32343l extends C52712l implements C52671b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f84206a;

        C32343l(List list) {
            this.f84206a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FollowingRelationState followingRelationState = (FollowingRelationState) obj;
            C52711k.m112240b(followingRelationState, "$receiver");
            return FollowingRelationState.copy$default(followingRelationState, null, null, false, this.f84206a, null, false, 0, null, null, null, 1015, null);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.f84181d.aZ_();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        FollowingRelationState followingRelationState = new FollowingRelationState(null, null, false, null, null, false, 0, null, null, null, 1023, null);
        return followingRelationState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<FollowingRelationState, Object, C32041i> listMiddleware = this.f84185h;
        listMiddleware.mo22635a(C32348e.f84212a, (C52682m<? super S, ? super PROP, ? extends S>) C32331b.f84186a);
        mo22525a(listMiddleware);
    }

    public FollowingRelationViewModel() {
        int i = 1;
        this.f84182e = true;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isUidContactPermisioned()) {
            i = 2;
        }
        this.f84184g = i;
        this.f84185h = new ListMiddleware<>(new C32338i(this), new C32340j(this), C32337h.f84198a, C32342k.f84205a);
    }

    /* renamed from: a */
    public final void mo65477a(C31998e eVar) {
        C52723a aVar = new C52723a();
        aVar.element = false;
        C52727e eVar2 = new C52727e();
        eVar2.element = "";
        mo22527b(new C32333d(aVar, eVar2));
        mo22530c(new C32334e(aVar, eVar, eVar2));
    }

    /* renamed from: a */
    public final void mo65479a(List<? extends Object> list) {
        C52711k.m112240b(list, "recommendList");
        mo22530c(new C32343l(list));
    }

    /* renamed from: a */
    public final void mo65478a(C31998e eVar, boolean z) {
        if (eVar != null) {
            mo22530c(new C32332c(eVar, this, z));
        }
    }

    /* renamed from: a */
    public static int m74653a(boolean z, boolean z2, boolean z3) {
        if (z) {
            if (C29504e.m69641a()) {
                return 2;
            }
            return 1;
        } else if (z3) {
            return 2;
        } else {
            return 1;
        }
    }
}
