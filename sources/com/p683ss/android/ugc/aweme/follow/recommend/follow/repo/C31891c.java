package com.p683ss.android.ugc.aweme.follow.recommend.follow.repo;

import android.text.TextUtils;
import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c */
public final class C31891c extends C11698b {

    /* renamed from: a */
    public final C31890b f83331a = new C31890b();

    /* renamed from: b */
    public final C31889a f83332b = new C31889a();

    /* renamed from: c */
    public final C11585a<String, String, DislikeRecommendParams, String> f83333c = C32616c.f84865a.createDislikeRecommendFetcher();

    /* renamed from: d */
    private final C11536c<String, User> f83334d = C47588a.m103036c().mo94908a();

    /* renamed from: e */
    private final C11536c<String, Aweme> f83335e;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c$a */
    public static final class C31892a extends C52712l implements C52671b<C11689c<C31906d, List<? extends C31907e>, C52860x, List<? extends C31907e>>, C52860x> {
        public C31892a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11689c) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11689c<C31906d, List<C31907e>, C52860x, List<C31907e>> cVar) {
            C52711k.m112240b(cVar, "$this$keySyncTo");
            cVar.mo22474a((C52682m<? super K, ? super V, ? extends K1>) new C52682m<C31906d, List<? extends C31907e>, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C31892a f83336a;

                {
                    this.f83336a = r1;
                }

                public final C52860x invoke(C31906d dVar, List<? extends C31907e> list) {
                    if (C52711k.m112239a((Object) C31906d.class, (Object) C52860x.class)) {
                        if (dVar != null) {
                            return (C52860x) dVar;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.Unit");
                    } else if (C52711k.m112239a((Object) C52860x.class, (Object) C52860x.class)) {
                        return C52860x.f131107a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.mo22475a((C52686q<? super K, ? super V, ? super V1, ? extends V1>) new C52686q<C31906d, List<? extends C31907e>, List<? extends C31907e>, List<? extends C31907e>>(this) {

                /* renamed from: a */
                final /* synthetic */ C31892a f83337a;

                {
                    this.f83337a = r1;
                }

                public final List<C31907e> invoke(C31906d dVar, List<? extends C31907e> list, List<? extends C31907e> list2) {
                    boolean z;
                    if (dVar.f83344b == 0) {
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

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c$b */
    public static final class C31895b extends C52712l implements C52671b<C11692d<? extends Object, User, ? extends Object, List<? extends C31907e>>, C52860x> {
        public C31895b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<? extends Object, User, ? extends Object, List<C31907e>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C318961.INSTANCE);
            dVar.mo22477b(new C52682m<User, List<? extends C31907e>, List<? extends C31907e>>(this) {

                /* renamed from: a */
                final /* synthetic */ C31895b f83338a;

                {
                    this.f83338a = r1;
                }

                public final List<C31907e> invoke(User user, List<? extends C31907e> list) {
                    Object obj;
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Object next : iterable) {
                        User user2 = user;
                        C31907e eVar = (C31907e) next;
                        if (C52711k.m112239a((Object) eVar.f83352a, (Object) user2.getUid())) {
                            eVar.mo65112a(user2);
                            obj = eVar;
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

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c$c */
    public static final class C31898c extends C52712l implements C52671b<C11692d<? extends Object, Aweme, ? extends Object, List<? extends C31907e>>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31891c f83339a;

        public C31898c(C31891c cVar, C31891c cVar2) {
            this.f83339a = cVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<? extends Object, Aweme, ? extends Object, List<C31907e>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C318991.INSTANCE);
            dVar.mo22477b(new C52682m<Aweme, List<? extends C31907e>, List<? extends C31907e>>(this) {

                /* renamed from: a */
                final /* synthetic */ C31898c f83340a;

                {
                    this.f83340a = r1;
                }

                public final List<C31907e> invoke(Aweme aweme, List<? extends C31907e> list) {
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (Object next : iterable) {
                        Aweme aweme2 = aweme;
                        C31907e eVar = (C31907e) next;
                        if (C31891c.m74325a(eVar.f83353b, aweme2)) {
                            C52711k.m112236a((Object) aweme2, "aweme");
                            next = C31891c.m74324a(eVar, aweme2);
                        }
                        arrayList.add(next);
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c$d */
    public static final class C31901d extends C52712l implements C52671b<C11683a<? extends Object, List<? extends C31907e>, String, User>, C52860x> {
        public C31901d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11683a) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11683a<? extends Object, List<C31907e>, String, User> aVar) {
            C52711k.m112240b(aVar, "$receiver");
            aVar.mo22473a(new C52671b<List<? extends C31907e>, List<? extends C52847n<? extends String, ? extends User>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C31901d f83341a;

                {
                    this.f83341a = r1;
                }

                public final List<C52847n<String, User>> invoke(List<? extends C31907e> list) {
                    C52711k.m112240b(list, "it");
                    Iterable<C31907e> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C31907e eVar : iterable) {
                        arrayList.add(C52856t.m112465a(eVar.f83352a, eVar.f83354c));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c$e */
    public static final class C31903e extends C52712l implements C52671b<C11692d<String, String, C52860x, List<? extends C31907e>>, C52860x> {
        public C31903e() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<String, String, C52860x, List<C31907e>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C319041.INSTANCE);
            dVar.mo22477b(new C52682m<String, List<? extends C31907e>, List<? extends C31907e>>(this) {

                /* renamed from: a */
                final /* synthetic */ C31903e f83342a;

                {
                    this.f83342a = r1;
                }

                public final List<C31907e> invoke(String str, List<? extends C31907e> list) {
                    C52711k.m112240b(list, "curV");
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (!C52711k.m112239a((Object) ((C31907e) next).f83352a, (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public C31891c() {
        IAwemeService a = C23324d.m57378a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…AwemeService::class.java)");
        this.f83335e = a.getAwemeCache();
        mo22482a((C11587b<K, V, ?, ?>) this.f83331a, (C11544e<K1, V1>) this.f83332b, (C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x>) new C31892a<Object,C52860x>());
        mo22481a((C11544e<K, V>) this.f83332b, this.f83334d, (C52671b<? super C11683a<K, List<V>, K1, V1>, C52860x>) new C31901d<Object,C52860x>());
        mo22480a(this.f83334d, (C11544e<K1, V1>) this.f83332b, (C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x>) new C31895b<Object,C52860x>());
        C11536c<String, Aweme> cVar = this.f83335e;
        C52711k.m112236a((Object) cVar, "awemeCache");
        mo22480a(cVar, (C11544e<K1, V1>) this.f83332b, (C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x>) new C31898c<Object,C52860x>(this, this));
        mo22483b(this.f83333c, this.f83332b, new C31903e());
    }

    /* renamed from: a */
    public static C31907e m74324a(C31907e eVar, Aweme aweme) {
        int i = -1;
        int i2 = 0;
        for (Object next : eVar.f83353b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C52575l.m112100b();
            }
            if (TextUtils.equals(((Aweme) next).getAid(), aweme.getAid())) {
                i = i2;
            }
            i2 = i3;
        }
        if (i >= 0) {
            eVar.f83353b.set(i, aweme);
        }
        return eVar;
    }

    /* renamed from: a */
    public static boolean m74325a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            for (Aweme aweme2 : list) {
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, aweme2.getAid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C2201v<RecommendList> mo65093a(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3) {
        C31890b bVar = this.f83331a;
        C31906d dVar = new C31906d(30, i2, str, 11, 0, i5, str2, i6, str3);
        C2201v<RecommendList> a = bVar.mo22318c(dVar).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "recommendFollowFetcher.r…dSchedulers.mainThread())");
        return a;
    }
}
