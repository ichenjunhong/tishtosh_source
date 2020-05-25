package com.p683ss.android.ugc.aweme.p1445bp.p1458i;

import com.bytedance.apm.p501q.C9198o;
import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17658bm;
import com.google.p1057b.p1060c.C17699l;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23939f;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b.C23946a;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b.C23946a.C23947a;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b.C23949b;
import com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b.C23950c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52820l;

/* renamed from: com.ss.android.ugc.aweme.bp.i.a */
public final class C23940a implements C23939f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63596a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23940a.class), "settingsWhiteList", "getSettingsWhiteList()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23940a.class), "tempWhiteListProvider", "getTempWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/TempWhiteListProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23940a.class), "persistedWhiteListProvider", "getPersistedWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/PersistedWhiteListProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23940a.class), "draftWhiteListProvider", "getDraftWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/DraftWhiteListProvider;"))};

    /* renamed from: b */
    private final C52668f f63597b = C52732g.m112285a(C23943c.f63604a);

    /* renamed from: c */
    private final C52668f f63598c = C52732g.m112306a(new C23950c());

    /* renamed from: d */
    private final C52668f f63599d = C52732g.m112306a(new C23949b());

    /* renamed from: e */
    private final C52668f f63600e = C52732g.m112306a(new C23946a());

    /* renamed from: f */
    private final Set<String> f63601f = C17658bm.m43409b();

    /* renamed from: com.ss.android.ugc.aweme.bp.i.a$a */
    static final class C23941a<F, T> implements C17410f<F, T> {

        /* renamed from: a */
        public static final C23941a f63602a = new C23941a();

        C23941a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo33734a(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            return new C52820l("/data/user/0/").replaceFirst(str, "/data/data/");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bp.i.a$b */
    static final class C23942b<F, T> implements C17410f<F, T> {

        /* renamed from: a */
        public static final C23942b f63603a = new C23942b();

        C23942b() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo33734a(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            return new C52820l("/data/data/").replaceFirst(str, "/data/user/0/");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bp.i.a$c */
    static final class C23943c extends C52712l implements C52670a<Set<? extends String>> {

        /* renamed from: a */
        public static final C23943c f63604a = new C23943c();

        C23943c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Set set;
            Object obj;
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            List cacheCleanDefaultWhiteList = b.getCacheCleanDefaultWhiteList();
            C52711k.m112236a((Object) cacheCleanDefaultWhiteList, "SettingsReader.get().cacheCleanDefaultWhiteList");
            Iterable iterable = cacheCleanDefaultWhiteList;
            C52711k.m112240b(iterable, "$this$toSet");
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                switch (collection.size()) {
                    case 0:
                        set = C52555ag.m112062a();
                        break;
                    case 1:
                        if (iterable instanceof List) {
                            obj = ((List) iterable).get(0);
                        } else {
                            obj = iterable.iterator().next();
                        }
                        set = C52555ag.m112061a(obj);
                        break;
                    default:
                        return (Set) C52575l.m112127b(iterable, new LinkedHashSet(C52550ab.m112044a(collection.size())));
                }
            } else {
                set = (Set) C52575l.m112127b(iterable, new LinkedHashSet());
                C52711k.m112240b(set, "$this$optimizeReadOnlySet");
                switch (set.size()) {
                    case 0:
                        return C52555ag.m112062a();
                    case 1:
                        return C52555ag.m112061a(set.iterator().next());
                }
            }
            return set;
        }
    }

    /* renamed from: c */
    private final C23950c m58744c() {
        return (C23950c) this.f63598c.getValue();
    }

    /* renamed from: d */
    private final C23949b m58745d() {
        return (C23949b) this.f63599d.getValue();
    }

    /* renamed from: e */
    private final C23946a m58746e() {
        return (C23946a) this.f63600e.getValue();
    }

    /* renamed from: b */
    public final Set<String> mo49537b() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll((Set) this.f63597b.getValue());
        return linkedHashSet;
    }

    /* renamed from: a */
    public final Set<String> mo49536a() {
        Set<String> set;
        m58744c();
        m58745d();
        m58746e().f63610a.get();
        Set linkedHashSet = new LinkedHashSet();
        Set<String> set2 = m58744c().f63613a;
        C52711k.m112236a((Object) set2, "tempWhiteList");
        linkedHashSet.addAll(set2);
        m58745d();
        linkedHashSet.addAll(C39629l.m88232a().mo58577h().mo49490d().mo49522a());
        C23946a e = m58746e();
        if (e.f63610a.get()) {
            set = e.mo49540a();
        } else {
            set = e.f63611b;
            C52711k.m112236a((Object) set, "mWhiteList");
        }
        linkedHashSet.addAll(set);
        Collection collection = linkedHashSet;
        Collection a = C17699l.m43481a(collection, (C17410f<? super F, T>) C23942b.f63603a);
        Collection a2 = C17699l.m43481a(collection, (C17410f<? super F, T>) C23941a.f63602a);
        this.f63601f.clear();
        this.f63601f.addAll(collection);
        Set<String> set3 = this.f63601f;
        C52711k.m112236a((Object) a, "dataUser0WhiteList");
        set3.addAll(a);
        Set<String> set4 = this.f63601f;
        C52711k.m112236a((Object) a2, "dataDataWhiteList");
        set4.addAll(a2);
        Set<String> set5 = this.f63601f;
        C52711k.m112236a((Object) set5, "mWhiteList");
        return set5;
    }

    /* renamed from: a */
    public final void mo49538a(C29059c cVar, boolean z) {
        C52711k.m112240b(cVar, "draft");
        C23946a e = m58746e();
        e.f63610a.set(true);
        if (C9198o.m18275a()) {
            C0013i.m16a((Callable<TResult>) new C23947a<TResult>(e));
        } else {
            e.mo49540a();
        }
    }
}
