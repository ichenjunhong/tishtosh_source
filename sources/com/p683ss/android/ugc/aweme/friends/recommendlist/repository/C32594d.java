package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.repository.C47587a;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d */
public final class C32594d extends C32579a {

    /* renamed from: a */
    private final C32593c f84829a = new C32593c();

    /* renamed from: b */
    private final C32592b f84830b = new C32592b();

    /* renamed from: c */
    private final C32590a f84831c = new C32590a();

    /* renamed from: d */
    private final C11536c<String, User> f84832d = C47588a.m103036c().mo94908a();

    /* renamed from: e */
    private final C32607f f84833e = new C32607f();

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d$a */
    public static final class C32595a extends C52712l implements C52671b<C11689c<C32606e, List<? extends C47587a>, Integer, List<? extends C47587a>>, C52860x> {
        public C32595a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11689c) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11689c<C32606e, List<C47587a>, Integer, List<C47587a>> cVar) {
            C52711k.m112240b(cVar, "$this$keySyncTo");
            cVar.mo22474a((C52682m<? super K, ? super V, ? extends K1>) new C52682m<C32606e, List<? extends C47587a>, Integer>(this) {

                /* renamed from: a */
                final /* synthetic */ C32595a f84834a;

                {
                    this.f84834a = r1;
                }

                public final Integer invoke(C32606e eVar, List<? extends C47587a> list) {
                    return Integer.valueOf(eVar.f84842d);
                }
            });
            cVar.mo22475a((C52686q<? super K, ? super V, ? super V1, ? extends V1>) new C52686q<C32606e, List<? extends C47587a>, List<? extends C47587a>, List<? extends C47587a>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32595a f84835a;

                {
                    this.f84835a = r1;
                }

                public final List<C47587a> invoke(C32606e eVar, List<? extends C47587a> list, List<? extends C47587a> list2) {
                    int i;
                    Integer num = eVar.f84840b;
                    boolean z = false;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        z = true;
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

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d$b */
    public static final class C32598b extends C52712l implements C52671b<C11692d<? extends Object, User, ? extends Object, List<? extends C47587a>>, C52860x> {
        public C32598b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<? extends Object, User, ? extends Object, List<C47587a>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C325991.INSTANCE);
            dVar.mo22477b(new C52682m<User, List<? extends C47587a>, List<? extends C47587a>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32598b f84836a;

                {
                    this.f84836a = r1;
                }

                public final List<C47587a> invoke(User user, List<? extends C47587a> list) {
                    Object obj;
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Object next : iterable) {
                        User user2 = user;
                        C47587a aVar = (C47587a) next;
                        if (C52711k.m112239a((Object) aVar.f120036a.getUid(), (Object) user2.getUid())) {
                            C52711k.m112240b(user2, "<set-?>");
                            aVar.f120036a = user2;
                            obj = aVar;
                        } else {
                            obj = next;
                        }
                        arrayList.add(obj);
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d$c */
    public static final class C32601c extends C52712l implements C52671b<C11683a<? extends Object, List<? extends C47587a>, String, User>, C52860x> {
        public C32601c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11683a) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11683a<? extends Object, List<C47587a>, String, User> aVar) {
            C52711k.m112240b(aVar, "$receiver");
            aVar.mo22473a(new C52671b<List<? extends C47587a>, List<? extends C52847n<? extends String, ? extends User>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32601c f84837a;

                {
                    this.f84837a = r1;
                }

                public final List<C52847n<String, User>> invoke(List<? extends C47587a> list) {
                    C52711k.m112240b(list, "it");
                    Iterable<C47587a> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C47587a aVar : iterable) {
                        arrayList.add(C52856t.m112465a(aVar.f120036a.getUid(), aVar.f120036a));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d$d */
    public static final class C32603d extends C52712l implements C52671b<C11692d<String, String, Integer, List<? extends C47587a>>, C52860x> {
        public C32603d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<String, String, Integer, List<C47587a>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C326041.INSTANCE);
            dVar.mo22477b(new C52682m<String, List<? extends C47587a>, List<? extends C47587a>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32603d f84838a;

                {
                    this.f84838a = r1;
                }

                public final List<C47587a> invoke(String str, List<? extends C47587a> list) {
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (!C52711k.m112239a((Object) ((C47587a) next).f120036a.getUid(), (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public C32594d() {
        mo22482a((C11587b<K, V, ?, ?>) this.f84829a, (C11544e<K1, V1>) this.f84830b, (C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x>) new C32595a<Object,C52860x>());
        mo22481a((C11544e<K, V>) this.f84830b, this.f84832d, (C52671b<? super C11683a<K, List<V>, K1, V1>, C52860x>) new C32601c<Object,C52860x>());
        mo22480a(this.f84832d, (C11544e<K1, V1>) this.f84830b, (C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x>) new C32598b<Object,C52860x>());
        mo22483b(this.f84831c, this.f84830b, new C32603d());
    }

    /* renamed from: a */
    public final C2201v<C11575f<List<C47587a>>> mo65908a(int i) {
        return C11571b.m23674a((C11544e<K, V>) this.f84830b).mo22300a(Integer.valueOf(i), (C11574e<?, ?>[]) new C11574e[]{C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f84829a)});
    }

    /* renamed from: a */
    public final C1680ad<String> mo65907a(String str, String str2) {
        C52711k.m112240b(str, "userId");
        C1680ad<String> a = C1680ad.m5960a((C2206z<? extends T>) this.f84831c.mo22318c(new DislikeRecommendParams(str, str2)));
        C52711k.m112236a((Object) a, "Single.fromObservable(di…dParams(userId, secUid)))");
        return a;
    }

    /* renamed from: a */
    public final C2201v<RecommendUserDialogList> mo65909a(Integer num, Integer num2, String str) {
        Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RecommendUserDialogApi.class);
        C52711k.m112236a(a, "ServiceManager.get().get…serDialogApi::class.java)");
        return ((RecommendUserDialogApi) a).fetchRecommendUserDialogList(num, num2, str);
    }

    /* renamed from: b */
    public final C2201v<RecommendList> mo65911b(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        C32607f fVar = this.f84833e;
        C32609g gVar = new C32609g(num, num2, str, i, num3, num4, str2, null, num5, str4);
        return fVar.mo22318c(gVar);
    }

    /* renamed from: a */
    public final C2201v<RecommendList> mo65910a(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        C32593c cVar = this.f84829a;
        C32606e eVar = new C32606e(num, num2, str, i, num3, num4, str2, null, num5, str4);
        return cVar.mo22318c(eVar);
    }
}
