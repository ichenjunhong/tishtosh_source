package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11686b;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i */
public final class C39919i extends C11698b {

    /* renamed from: b */
    public static final C39932e f101777b = new C39932e(null);

    /* renamed from: a */
    final C39914f f101778a = new C39914f();

    /* renamed from: c */
    private final C39915g f101779c = new C39915g();

    /* renamed from: d */
    private final C39910c f101780d = new C39910c();

    /* renamed from: e */
    private final C11536c<String, Aweme> f101781e;

    /* renamed from: f */
    private final C39908a f101782f;

    /* renamed from: g */
    private final C39909b f101783g;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$a */
    public static final class C39921a extends C52712l implements C52671b<C11689c<C39912d, List<? extends Aweme>, Integer, List<? extends Aweme>>, C52860x> {
        public C39921a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11689c) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11689c<C39912d, List<Aweme>, Integer, List<Aweme>> cVar) {
            C52711k.m112240b(cVar, "$this$keySyncTo");
            cVar.mo22474a((C52682m<? super K, ? super V, ? extends K1>) new C52682m<C39912d, List<? extends Aweme>, Integer>(this) {

                /* renamed from: a */
                final /* synthetic */ C39921a f101785a;

                {
                    this.f101785a = r1;
                }

                public final Integer invoke(C39912d dVar, List<? extends Aweme> list) {
                    return Integer.valueOf(dVar.f101763a);
                }
            });
            cVar.mo22475a((C52686q<? super K, ? super V, ? super V1, ? extends V1>) new C52686q<C39912d, List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>>(this) {

                /* renamed from: a */
                final /* synthetic */ C39921a f101786a;

                {
                    this.f101786a = r1;
                }

                public final List<Aweme> invoke(C39912d dVar, List<? extends Aweme> list, List<? extends Aweme> list2) {
                    boolean z;
                    if (dVar.f101765c == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (list2 == null) {
                            list2 = C52575l.m112097a();
                        }
                        Collection collection = list2;
                        if (list == null) {
                            list = C52575l.m112097a();
                        }
                        if (list != null) {
                            return C52575l.m112133c(collection, list);
                        }
                        throw new RuntimeException();
                    } else if (list == null) {
                        return null;
                    } else {
                        if (list != null) {
                            return list;
                        }
                        throw new RuntimeException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$b */
    public static final class C39924b extends C52712l implements C52671b<C11692d<? extends Object, Aweme, ? extends Object, List<? extends Aweme>>, C52860x> {
        public C39924b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<? extends Object, Aweme, ? extends Object, List<Aweme>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C399251.INSTANCE);
            dVar.mo22477b(new C52682m<Aweme, List<? extends Aweme>, List<? extends Aweme>>(this) {

                /* renamed from: a */
                final /* synthetic */ C39924b f101787a;

                {
                    this.f101787a = r1;
                }

                /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.feed.model.Aweme, code=java.lang.Object, for r6v0, types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> invoke(java.lang.Object r6, java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r7) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "curV"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r1 = 10
                        int r1 = p2628d.p2629a.C52575l.m112104a(r7, r1)
                        r0.<init>(r1)
                        java.util.Collection r0 = (java.util.Collection) r0
                        java.util.Iterator r7 = r7.iterator()
                    L_0x0018:
                        boolean r1 = r7.hasNext()
                        if (r1 == 0) goto L_0x004a
                        java.lang.Object r1 = r7.next()
                        r2 = r6
                        com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
                        r3 = r1
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
                        java.lang.String r4 = "new"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                        java.lang.String r2 = r2.getAid()
                        java.lang.String r3 = r3.getAid()
                        boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                        if (r2 == 0) goto L_0x0046
                        boolean r2 = r6 instanceof java.lang.Object
                        if (r2 != 0) goto L_0x0041
                        r2 = 0
                        goto L_0x0042
                    L_0x0041:
                        r2 = r6
                    L_0x0042:
                        if (r2 != 0) goto L_0x0045
                        goto L_0x0046
                    L_0x0045:
                        r1 = r2
                    L_0x0046:
                        r0.add(r1)
                        goto L_0x0018
                    L_0x004a:
                        java.util.List r0 = (java.util.List) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.jedi.aweme.C39919i.C39924b.C399262.invoke(java.lang.Object, java.util.List):java.util.List");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$c */
    public static final class C39927c extends C52712l implements C52671b<C11683a<? extends Object, List<? extends Aweme>, String, Aweme>, C52860x> {
        public C39927c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11683a) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11683a<? extends Object, List<Aweme>, String, Aweme> aVar) {
            C52711k.m112240b(aVar, "$receiver");
            aVar.mo22473a(new C52671b<List<? extends Aweme>, List<? extends C52847n<? extends String, ? extends Aweme>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C39927c f101788a;

                {
                    this.f101788a = r1;
                }

                public final List<C52847n<String, Aweme>> invoke(List<? extends Aweme> list) {
                    C52711k.m112240b(list, "it");
                    Iterable<Aweme> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Aweme aweme : iterable) {
                        arrayList.add(C52856t.m112465a(aweme.getAid(), aweme));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$d */
    public static final class C39929d extends C52712l implements C52671b<C11692d<String, String, Integer, List<? extends Aweme>>, C52860x> {
        public C39929d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<String, String, Integer, List<Aweme>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C399301.INSTANCE);
            dVar.mo22477b(new C52682m<String, List<? extends Aweme>, List<? extends Aweme>>(this) {

                /* renamed from: a */
                final /* synthetic */ C39929d f101789a;

                {
                    this.f101789a = r1;
                }

                public final List<Aweme> invoke(String str, List<? extends Aweme> list) {
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (!C52711k.m112239a((Object) ((Aweme) next).getAid(), (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$e */
    public static final class C39932e {
        private C39932e() {
        }

        public /* synthetic */ C39932e(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$f */
    static final class C39933f<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C39933f f101790a = new C39933f();

        C39933f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<Aweme> list;
            FeedItemList feedItemList = (FeedItemList) obj;
            C52711k.m112240b(feedItemList, "it");
            List items = feedItemList.getItems();
            if (items != null) {
                list = C52575l.m112128b((Iterable<? extends T>) items);
            } else {
                list = null;
            }
            feedItemList.items = list;
            return feedItemList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$g */
    static final class C39934g<T> implements C1710e<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ String f101791a;

        C39934g(String str) {
            this.f101791a = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            FeedItemList feedItemList = (FeedItemList) obj;
            C39917h hVar = C39917h.f101772b;
            C52711k.m112236a((Object) feedItemList, "it");
            C39917h.m88673a(feedItemList, this.f101791a, 20);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.i$h */
    static final class C39935h<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C39935h f101792a = new C39935h();

        C39935h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<Aweme> list;
            FeedItemList feedItemList = (FeedItemList) obj;
            C52711k.m112240b(feedItemList, "it");
            List items = feedItemList.getItems();
            if (items != null) {
                list = C52575l.m112128b((Iterable<? extends T>) items);
            } else {
                list = null;
            }
            feedItemList.items = list;
            return feedItemList;
        }
    }

    public C39919i() {
        IAwemeService a = C23324d.m57378a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…AwemeService::class.java)");
        this.f101781e = a.getAwemeCache();
        this.f101782f = new C39908a();
        this.f101783g = new C39909b();
        mo22482a((C11587b<K, V, ?, ?>) this.f101779c, (C11544e<K1, V1>) this.f101778a, (C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x>) new C39921a<Object,C52860x>());
        C11544e eVar = this.f101778a;
        C11536c<String, Aweme> cVar = this.f101781e;
        C52711k.m112236a((Object) cVar, "awemeCache");
        mo22481a(eVar, cVar, (C52671b<? super C11683a<K, List<V>, K1, V1>, C52860x>) new C39927c<Object,C52860x>());
        C11536c<String, Aweme> cVar2 = this.f101781e;
        C52711k.m112236a((Object) cVar2, "awemeCache");
        mo22480a(cVar2, (C11544e<K1, V1>) this.f101778a, (C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x>) new C39924b<Object,C52860x>());
        mo22483b(this.f101782f, this.f101778a, new C39929d());
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f101783g), C11571b.m23674a((C11544e<K, V>) this.f101778a), C11686b.m24025a(C11682a.f31134a, (C52682m) null, (C52682m) C399201.f101784a, 1, (Object) null));
    }

    /* renamed from: a */
    public static /* synthetic */ C2201v m88677a(C39919i iVar, String str, String str2, long j, int i, int i2, Object obj) {
        int i3;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i3 = 20;
        } else {
            i3 = i;
        }
        C39915g gVar = iVar.f101779c;
        C39912d dVar = new C39912d(1, i3, j2, str, str2);
        C2201v d = gVar.mo22318c(dVar).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) C39933f.f101790a);
        C52711k.m112236a((Object) d, "awemeListFetcher.request…tems?.filterNotNull() } }");
        return d;
    }

    /* renamed from: b */
    public static /* synthetic */ C2201v m88678b(C39919i iVar, String str, String str2, long j, int i, int i2, Object obj) {
        long j2;
        int i3;
        C39919i iVar2 = iVar;
        if ((i2 & 4) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 = 20;
        } else {
            i3 = i;
        }
        C39912d dVar = new C39912d(0, i3, j2, str, str2);
        C2201v d = iVar2.f101779c.mo22318c(dVar).mo6541d((C1711f<? super T, ? extends R>) C39935h.f101792a);
        if (j2 == 0) {
            String str3 = str;
            C2206z a = d.mo6540d((C1710e<? super T>) new C39934g<Object>(str)).mo6523a((C2206z<? extends T>) iVar2.f101780d.mo22318c(dVar));
            C2206z c = iVar2.f101780d.mo22318c(dVar);
            C1745b.m6050a(a, "source1 is null");
            C1745b.m6050a(c, "source2 is null");
            C2201v a2 = C2201v.m6609a((T[]) new C2206z[]{a, c}).mo6521a(C1723a.m6033a(), false, 2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
            C52711k.m112236a((Object) a2, "Observable.merge(fromNet…dSchedulers.mainThread())");
            return a2;
        }
        C2201v a3 = d.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a3, "fromNetwork.subscribeOn(…dSchedulers.mainThread())");
        return a3;
    }
}
