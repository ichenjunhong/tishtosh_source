package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.profile.jedi.p2089a.C39879b;
import com.p683ss.android.ugc.aweme.profile.jedi.p2089a.C39879b.C39882a;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.profile.service.C40025r;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel.C40584a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1979c;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel */
public final class JediAwemeListViewModel extends JediBaseViewModel<AwemeListState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f101737d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(JediAwemeListViewModel.class), "awemeListRepository", "getAwemeListRepository()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListRepository;"))};

    /* renamed from: e */
    public FeedItemList f101738e;

    /* renamed from: f */
    public int f101739f;

    /* renamed from: g */
    public final ListMiddleware<AwemeListState, Object, C39913e> f101740g;

    /* renamed from: h */
    private final C52668f f101741h = C52732g.m112286a(C52757k.NONE, C39890a.f101742a);

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$a */
    static final class C39890a extends C52712l implements C52670a<C39919i> {

        /* renamed from: a */
        public static final C39890a f101742a = new C39890a();

        C39890a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39919i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b */
    static final class C39891b extends C52712l implements C52671b<AwemeListState, C2201v<C52847n<? extends List<? extends Object>, ? extends C39913e>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f101743a;

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b$a */
        static final class C39893a<T> implements C1710e<FeedItemList> {

            /* renamed from: a */
            final /* synthetic */ C39891b f101745a;

            C39893a(C39891b bVar) {
                this.f101745a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                FeedItemList feedItemList = (FeedItemList) obj;
                this.f101745a.f101743a.mo81052a(feedItemList);
                JediAwemeListViewModel jediAwemeListViewModel = this.f101745a.f101743a;
                C52711k.m112236a((Object) feedItemList, "it");
                C52711k.m112240b(feedItemList, "<set-?>");
                jediAwemeListViewModel.f101738e = feedItemList;
                this.f101745a.f101743a.f101739f = feedItemList.status_code;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b$b */
        static final class C39894b<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            public static final C39894b f101746a = new C39894b();

            C39894b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                FeedItemList feedItemList = (FeedItemList) obj;
                C52711k.m112240b(feedItemList, "it");
                List items = feedItemList.getItems();
                if (items == null) {
                    items = C52575l.m112097a();
                }
                boolean z = true;
                if (feedItemList.hasMore != 1) {
                    z = false;
                }
                return C52856t.m112465a(items, new C39913e(z, (int) feedItemList.cursor, feedItemList.maxCursor));
            }
        }

        C39891b(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f101743a = jediAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C2201v vVar;
            C2201v vVar2;
            AwemeListState awemeListState = (AwemeListState) obj;
            C52711k.m112240b(awemeListState, "state");
            if (awemeListState.getProfileListType() != 1) {
                vVar = C39919i.m88678b(this.f101743a.mo81053e(), awemeListState.getUserId(), awemeListState.getSecUserId(), 0, 0, 12, null);
            } else {
                vVar = C39919i.m88677a(this.f101743a.mo81053e(), awemeListState.getUserId(), awemeListState.getSecUserId(), 0, 0, 12, null);
            }
            C2201v d = vVar.mo6540d((C1710e<? super T>) new C39893a<Object>(this)).mo6541d((C1711f<? super T, ? extends R>) C39894b.f101746a);
            C52711k.m112236a((Object) d, "when (state.profileListT…Cursor)\n                }");
            if (awemeListState.getProfileListType() != 0 || ((!awemeListState.isMyProfile() && awemeListState.isPrivateAccount() && awemeListState.getFollowStatus() != 1 && awemeListState.getFollowStatus() != 2) || !C40025r.f101962a.mo76335b())) {
                return d;
            }
            C2206z zVar = d;
            C40584a aVar = MediaMixListViewModel.f103532i;
            String userId = awemeListState.getUserId();
            if (userId == null) {
                userId = "";
            }
            String str = userId;
            String secUserId = awemeListState.getSecUserId();
            if (secUserId == null) {
                secUserId = "";
            }
            C2206z a = C40584a.m90018a(aVar, str, secUserId, 0, 0, 12, null);
            C1707b bVar = C398921.f101744a;
            C1745b.m6050a(zVar, "source1 is null");
            C1745b.m6050a(a, "source2 is null");
            C1711f a2 = C1723a.m6034a(bVar);
            int a3 = C2201v.m6590a();
            C2206z[] zVarArr = {zVar, a};
            C1745b.m6050a(zVarArr, "sources is null");
            if (zVarArr.length == 0) {
                vVar2 = C2201v.m6610b();
            } else {
                C1745b.m6050a(a2, "combiner is null");
                C1745b.m6048a(a3, "bufferSize");
                C1979c cVar = new C1979c(zVarArr, null, a2, a3 << 1, false);
                vVar2 = C2150a.m6486a((C2201v<T>) cVar);
            }
            C52711k.m112236a((Object) vVar2, "Observable.combineLatest…nd\n                    })");
            return vVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$c */
    static final class C39895c extends C52712l implements C52671b<AwemeListState, C2201v<C52847n<? extends List<? extends Object>, ? extends C39913e>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f101747a;

        C39895c(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f101747a = jediAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C2201v vVar;
            AwemeListState awemeListState = (AwemeListState) obj;
            C52711k.m112240b(awemeListState, "state");
            if (awemeListState.getProfileListType() != 1) {
                vVar = C39919i.m88678b(this.f101747a.mo81053e(), awemeListState.getUserId(), awemeListState.getSecUserId(), ((C39913e) awemeListState.getListState().getPayload()).f101768c, 0, 8, null);
            } else {
                vVar = C39919i.m88677a(this.f101747a.mo81053e(), awemeListState.getUserId(), awemeListState.getSecUserId(), ((C39913e) awemeListState.getListState().getPayload()).f101768c, 0, 8, null);
            }
            C2201v d = vVar.mo6540d((C1710e<? super T>) new C1710e<FeedItemList>(this) {

                /* renamed from: a */
                final /* synthetic */ C39895c f101748a;

                {
                    this.f101748a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    FeedItemList feedItemList = (FeedItemList) obj;
                    this.f101748a.f101747a.mo81052a(feedItemList);
                    FeedItemList f = this.f101748a.f101747a.mo81054f();
                    List items = f.getItems();
                    C52711k.m112236a((Object) feedItemList, "it");
                    items.addAll(C39937k.m88679a(feedItemList.getItems()));
                    f.cursor = feedItemList.cursor;
                    f.hasMore = feedItemList.hasMore;
                    f.logPb = feedItemList.logPb;
                }
            }).mo6541d((C1711f<? super T, ? extends R>) C398972.f101749a);
            C52711k.m112236a((Object) d, "when (state.profileListT…Cursor)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$d */
    static final class C39898d extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C39898d f101750a = new C39898d();

        C39898d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object obj3;
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "old");
            C52711k.m112240b(list2, "refresh");
            Collection collection = list2;
            if (!(!collection.isEmpty())) {
                return list;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (obj3 instanceof C29059c) {
                    break;
                }
            }
            if (obj3 == null) {
                return list2;
            }
            if (C52575l.m112140f(list2) instanceof MediaMixList) {
                List c = C52575l.m112101c(C52575l.m112137e(list2));
                c.add(obj3);
                c.addAll(list2.subList(1, list2.size()));
                return c;
            }
            List c2 = C52575l.m112101c(C52575l.m112137e(list));
            c2.addAll(collection);
            return c2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$e */
    static final class C39899e extends C52712l implements C52682m<AwemeListState, ListState<Object, C39913e>, AwemeListState> {

        /* renamed from: a */
        public static final C39899e f101751a = new C39899e();

        C39899e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            AwemeListState awemeListState = (AwemeListState) obj;
            AwemeListState awemeListState2 = awemeListState;
            ListState listState = (ListState) obj2;
            ListState listState2 = listState;
            C52711k.m112240b(awemeListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return AwemeListState.copy$default(awemeListState2, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, listState2, 1048575, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$f */
    static final class C39900f<T> implements C1710e<List<? extends C52847n<? extends Integer, ? extends List<? extends Aweme>>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f101752a;

        C39900f(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f101752a = jediAwemeListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C52711k.m112236a((Object) list, "newList");
            final List list2 = (List) ((C52847n) C52575l.m112137e(list)).getSecond();
            if (list2 != null) {
                this.f101752a.mo22527b(new C52671b<AwemeListState, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C39900f f101753a;

                    {
                        this.f101753a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        AwemeListState awemeListState = (AwemeListState) obj;
                        C52711k.m112240b(awemeListState, "state");
                        Iterable list = awemeListState.getListState().getList();
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if (!(next instanceof Aweme)) {
                                arrayList.add(next);
                            }
                        }
                        final List c = C52575l.m112133c(C52575l.m112139e((Collection<? extends T>) (List) arrayList), list2);
                        FeedItemList f = this.f101753a.f101752a.mo81054f();
                        f.items = list2;
                        if (awemeListState.getProfileListType() == 0) {
                            C39917h hVar = C39917h.f101772b;
                            FeedItemList clone = f.clone();
                            List items = clone.getItems();
                            C52711k.m112236a((Object) items, "items");
                            clone.items = C52575l.m112129b((Iterable<? extends T>) items, 20);
                            C52711k.m112236a((Object) clone, "this.clone().apply {\n   …                        }");
                            String userId = awemeListState.getUserId();
                            C52711k.m112240b(clone, "feedItemList");
                            if (C39917h.f101771a != clone.size()) {
                                C2201v.m6614b(clone).mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b()).mo6545f((C1710e<? super T>) new C39918a<Object>(clone, userId, 20));
                            }
                        }
                        this.f101753a.f101752a.mo22530c(new C52671b<AwemeListState, AwemeListState>() {
                            public final /* synthetic */ Object invoke(Object obj) {
                                boolean z;
                                AwemeListState awemeListState = (AwemeListState) obj;
                                C52711k.m112240b(awemeListState, "$receiver");
                                ListState listState = awemeListState.getListState();
                                List list = c;
                                Collection collection = c;
                                if (collection == null || collection.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return AwemeListState.copy$default(awemeListState, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, ListState.copy$default(listState, null, list, null, null, new C11853b(z), 13, null), 1048575, null);
                            }
                        });
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$g */
    static final class C39903g extends C52712l implements C52671b<AwemeListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f101756a;

        C39903g(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f101756a = jediAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AwemeListState awemeListState = (AwemeListState) obj;
            C52711k.m112240b(awemeListState, "it");
            if (awemeListState.isMyProfile() && awemeListState.getProfileListType() == 0) {
                JediAwemeListViewModel jediAwemeListViewModel = this.f101756a;
                this.f101756a.mo81053e();
                C2201v d = C11571b.m23674a((C11544e<K, V>) C39879b.f101727a).mo22300a(C52860x.f131107a, (C11574e<?, ?>[]) new C11574e[0]).mo6541d((C1711f<? super T, ? extends R>) C39882a.f101732a);
                C52711k.m112236a((Object) d, "AwemeDraftRepository.observeDrafts()");
                C1690c f = d.mo6545f((C1710e<? super T>) new C1710e<List<? extends C29059c>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C39903g f101757a;

                    {
                        this.f101757a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        List list = (List) obj;
                        C52711k.m112236a((Object) list, "draftList");
                        final C29059c cVar = (C29059c) C52575l.m112140f(list);
                        this.f101757a.f101756a.mo22527b(new C52671b<AwemeListState, C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C399041 f101758a;

                            {
                                this.f101758a = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                final List list;
                                boolean z;
                                boolean z2;
                                AwemeListState awemeListState = (AwemeListState) obj;
                                C52711k.m112240b(awemeListState, "state");
                                if (cVar == null) {
                                    Iterable list2 = awemeListState.getListState().getList();
                                    Collection arrayList = new ArrayList();
                                    for (Object next : list2) {
                                        if (!(next instanceof C29059c)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            arrayList.add(next);
                                        }
                                    }
                                    list = (List) arrayList;
                                } else {
                                    Collection c = C52575l.m112101c(cVar);
                                    Iterable list3 = awemeListState.getListState().getList();
                                    Collection arrayList2 = new ArrayList();
                                    for (Object next2 : list3) {
                                        if (!(next2 instanceof C29059c)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    list = C52575l.m112133c(c, (List) arrayList2);
                                }
                                this.f101758a.f101757a.f101756a.mo22530c(new C52671b<AwemeListState, AwemeListState>() {
                                    public final /* synthetic */ Object invoke(Object obj) {
                                        boolean z;
                                        AwemeListState awemeListState = (AwemeListState) obj;
                                        C52711k.m112240b(awemeListState, "$receiver");
                                        ListState listState = awemeListState.getListState();
                                        List list = list;
                                        Collection collection = list;
                                        if (collection == null || collection.isEmpty()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        return AwemeListState.copy$default(awemeListState, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, ListState.copy$default(listState, null, list, null, null, new C11853b(z), 13, null), 1048575, null);
                                    }
                                });
                                return C52860x.f131107a;
                            }
                        });
                    }
                });
                C52711k.m112236a((Object) f, "awemeListRepository.obse…      }\n                }");
                jediAwemeListViewModel.mo22521a(f);
                this.f101756a.mo81053e();
                C39879b.m88654b().mo6158b();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$h */
    static final class C39907h extends C52712l implements C52671b<AwemeListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FeedItemList f101761a;

        C39907h(FeedItemList feedItemList) {
            this.f101761a = feedItemList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            AwemeListState awemeListState = (AwemeListState) obj;
            C52711k.m112240b(awemeListState, "it");
            if (awemeListState.isMyProfile()) {
                i = 1000;
            } else {
                i = 2000;
            }
            int profileListType = awemeListState.getProfileListType();
            List items = this.f101761a.getItems();
            if (items != null) {
                int i2 = 0;
                for (Object next : items) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C52575l.m112100b();
                    }
                    Aweme aweme = (Aweme) next;
                    IRequestIdService a = C23325e.m57379a();
                    StringBuilder sb = new StringBuilder();
                    C52711k.m112236a((Object) aweme, "aweme");
                    sb.append(aweme.getAid());
                    sb.append(i + profileListType);
                    a.setRequestIdAndIndex(sb.toString(), this.f101761a.getRequestId(), i2);
                    i2 = i3;
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: e */
    public final C39919i mo81053e() {
        return (C39919i) this.f101741h.getValue();
    }

    /* renamed from: f */
    public final FeedItemList mo81054f() {
        FeedItemList feedItemList = this.f101738e;
        if (feedItemList == null) {
            C52711k.m112237a("cacheData");
        }
        return feedItemList;
    }

    public JediAwemeListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C39891b(this), new C39895c(this), C39898d.f101750a, null, 8, null);
        this.f101740g = listMiddleware;
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        AwemeListState awemeListState = new AwemeListState(null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097151, null);
        return awemeListState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<AwemeListState, Object, C39913e> listMiddleware = this.f101740g;
        listMiddleware.mo22635a(C39936j.f101793a, (C52682m<? super S, ? super PROP, ? extends S>) C39899e.f101751a);
        mo22525a(listMiddleware);
        C1690c f = C11571b.m23674a((C11544e<K, V>) mo81053e().f101778a).mo22301a(false, (C11574e<?, ?>[]) new C11574e[0]).mo6545f((C1710e<? super T>) new C39900f<Object>(this));
        C52711k.m112236a((Object) f, "awemeListRepository.obse…}\n            }\n        }");
        mo22521a(f);
        mo22527b(new C39903g(this));
    }

    /* renamed from: a */
    public final void mo81052a(FeedItemList feedItemList) {
        String str;
        if (feedItemList != null) {
            LogPbBean logPbBean = feedItemList.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            feedItemList.setRequestId(str);
            C29981aa.m70153a().mo60162a(feedItemList.getRequestId(), feedItemList.logPb);
            mo22527b(new C39907h(feedItemList));
        }
    }
}
