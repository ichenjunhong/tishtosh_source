package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p727b.C11554a.C11556b;
import com.bytedance.jedi.p725a.p727b.C11562b;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p729d.C11578a;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p738h.C11681f;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11686b;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31549c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31593i;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31595k;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31599o;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31547a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31498k;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p683ss.android.ugc.aweme.tools.p2354c.C46936c;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2178a;
import p064c.p065a.p094l.C2180b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g */
public final class C31512g extends C11698b implements C31499l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82433a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31512g.class), "filterSource", "getFilterSource()Lcom/ss/android/ugc/aweme/filter/repository/api/IFilterSource;"))};

    /* renamed from: b */
    public final C2178a<C31490c> f82434b;

    /* renamed from: c */
    public final C11578a<Integer, C31491d> f82435c;

    /* renamed from: d */
    public final C2178a<Map<Integer, C31491d>> f82436d;

    /* renamed from: e */
    public AtomicReference<C2201v<C31502a>> f82437e;

    /* renamed from: f */
    public final C31593i f82438f;

    /* renamed from: g */
    final boolean f82439g;

    /* renamed from: h */
    private final C11681f<C31502a> f82440h = new C11681f<>();

    /* renamed from: i */
    private final C2180b<C31492e> f82441i;

    /* renamed from: j */
    private final C52668f f82442j;

    /* renamed from: k */
    private final C1689b f82443k;

    /* renamed from: l */
    private final C31597m f82444l;

    /* renamed from: m */
    private final C31595k f82445m;

    /* renamed from: n */
    private final C31567e f82446n;

    /* renamed from: o */
    private final C31592h f82447o;

    /* renamed from: p */
    private final C31599o f82448p;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$a */
    public static final class C31513a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ List f82449a;

        public C31513a(List list) {
            this.f82449a = list;
        }

        public final int compare(T t, T t2) {
            boolean z;
            boolean z2;
            C31493f fVar = (C31493f) t;
            Iterator it = this.f82449a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C31493f) it.next()).f82404a == fVar.f82404a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            }
            int i2 = Integer.MAX_VALUE;
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            Comparable valueOf = Integer.valueOf(i);
            C31493f fVar2 = (C31493f) t2;
            Iterator it2 = this.f82449a.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((C31493f) it2.next()).f82404a == fVar2.f82404a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                i2 = i3;
            }
            return C52594a.m112153a(valueOf, Integer.valueOf(i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$b */
    static final class C31514b<T> implements C1710e<List<? extends C52847n<? extends C52860x, ? extends C31502a>>> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82450a;

        C31514b(C31512g gVar) {
            this.f82450a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C52711k.m112236a((Object) list, "cache");
            C52847n nVar = (C52847n) C52575l.m112118a(list, 0);
            if (nVar != null) {
                C31502a aVar = (C31502a) nVar.getSecond();
                if (aVar != null) {
                    this.f82450a.f82434b.onNext(aVar.f82411a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$c */
    static final class C31515c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82451a;

        C31515c(C31512g gVar) {
            this.f82451a = gVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C31546b bVar = (C31546b) obj;
            C52711k.m112240b(bVar, "it");
            return this.f82451a.mo64436a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$d */
    static final class C31516d implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C31512g f82452a;

        C31516d(C31512g gVar) {
            this.f82452a = gVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f82452a.f82437e.set(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$e */
    static final class C31517e<T> implements C1710e<C31502a> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82453a;

        C31517e(C31512g gVar) {
            this.f82453a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f82453a.mo64437a(((C31502a) obj).f82411a.f82395a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$f */
    static final class C31518f extends C52712l implements C52671b<C11556b<C52860x, C31502a, C52860x, C31502a>, C52860x> {

        /* renamed from: a */
        public static final C31518f f82454a = new C31518f();

        C31518f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11556b bVar = (C11556b) obj;
            C52711k.m112240b(bVar, "$receiver");
            C52671b<? super K, ? extends K1> bVar2 = C315191.f82455a;
            C52711k.m112240b(bVar2, "block");
            bVar.f30940a = bVar2;
            C52671b<? super V1, ? extends V> bVar3 = C315202.f82456a;
            C52711k.m112240b(bVar3, "block");
            bVar.f30941b = bVar3;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$g */
    static final class C31521g extends C52712l implements C52682m<C2201v<C31502a>, C2201v<C31502a>, C2201v<C31502a>> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82457a;

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$g$a */
        static final class C31522a<T, R> implements C1711f<T, C2206z<? extends R>> {

            /* renamed from: a */
            public static final C31522a f82458a = new C31522a();

            C31522a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                C31502a aVar = (C31502a) obj;
                C52711k.m112240b(aVar, "cachedResponse");
                if (aVar.f82412b) {
                    return C2201v.m6610b();
                }
                return C2201v.m6614b(aVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$g$b */
        static final class C31523b<T> implements C1710e<C31502a> {

            /* renamed from: a */
            final /* synthetic */ C31521g f82459a;

            C31523b(C31521g gVar) {
                this.f82459a = gVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.f82459a.f82457a.mo64437a(((C31502a) obj).f82411a.f82395a);
            }
        }

        C31521g(C31512g gVar) {
            this.f82457a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C2201v vVar = (C2201v) obj;
            C2201v vVar2 = (C2201v) obj2;
            C52711k.m112240b(vVar, "fetcher");
            C52711k.m112240b(vVar2, "cache");
            C2201v c = vVar2.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) C31522a.f82458a).mo6532b((C2206z<? extends T>) C2201v.m6610b()).mo6537c((C2206z<? extends T>) vVar.mo6540d((C1710e<? super T>) new C31523b<Object>(this)));
            C52711k.m112236a((Object) c, "alterCache.onExceptionRe…itchIfEmpty(alterFetcher)");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$h */
    static final class C31524h<T> implements C1710e<List<? extends C31491d>> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82460a;

        /* renamed from: b */
        final /* synthetic */ List f82461b;

        C31524h(C31512g gVar, List list) {
            this.f82460a = gVar;
            this.f82461b = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            boolean z;
            boolean z2;
            List list = (List) obj;
            C31512g gVar = this.f82460a;
            List list2 = this.f82461b;
            C52711k.m112236a((Object) list, "infoList");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                boolean z3 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C31491d dVar = (C31491d) gVar.f82435c.mo22314c(Integer.valueOf(((C31491d) next).f82397a));
                if (!(dVar == null || dVar.f82398b == C31494g.FILTER_STATE_UNKNOWN)) {
                    z3 = false;
                }
                if (z3) {
                    arrayList.add(next);
                }
            }
            gVar.mo64439b((List) arrayList);
            if (gVar.f82439g) {
                Iterable iterable2 = list2;
                Collection arrayList2 = new ArrayList();
                for (Object next2 : iterable2) {
                    C31493f fVar = (C31493f) next2;
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((C31491d) obj2).f82397a == fVar.f82404a) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    C31491d dVar2 = (C31491d) obj2;
                    if (dVar2 == null || dVar2.f82398b != C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next2);
                    }
                }
                gVar.mo64438a((List) arrayList2, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$i */
    static final class C31525i extends C52712l implements C52670a<C31593i> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82462a;

        C31525i(C31512g gVar) {
            this.f82462a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C31593i iVar = this.f82462a.f82438f;
            iVar.mo64442a(this.f82462a);
            return iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$j */
    static final class C31526j<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82463a;

        C31526j(C31512g gVar) {
            this.f82463a = gVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C31546b bVar = (C31546b) obj;
            C52711k.m112240b(bVar, "event");
            return C52575l.m112092a(this.f82463a.mo64436a(bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$k */
    static final class C31527k<T> implements C1710e<List<? extends C31491d>> {

        /* renamed from: a */
        final /* synthetic */ C31512g f82464a;

        C31527k(C31512g gVar) {
            this.f82464a = gVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C31512g gVar = this.f82464a;
            C52711k.m112236a((Object) list, "it");
            gVar.mo64439b(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.g$l */
    static final class C31528l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31512g f82465a;

        C31528l(C31512g gVar) {
            this.f82465a = gVar;
        }

        public final void run() {
            this.f82465a.f82435c.mo22284c();
            this.f82465a.f82436d.onNext(C52550ab.m112045a());
        }
    }

    /* renamed from: a */
    public final void mo64411a(boolean z) {
        C2201v vVar;
        if (z) {
            vVar = this.f82447o.mo22470a().mo6540d((C1710e<? super T>) new C31517e<Object>(this));
        } else {
            vVar = C11562b.m23668a(this.f82447o, this.f82440h, C31518f.f82454a).mo22307a(new C31521g(this)).mo22318c(C52860x.f131107a);
        }
        if (z) {
            vVar.mo6529b(C2168a.m6521b()).mo6505a(C1723a.m6037b(), C46936c.m101974a());
            return;
        }
        if (this.f82437e.compareAndSet(null, vVar)) {
            vVar.mo6529b(C2168a.m6521b()).mo6506a(C1723a.m6037b(), C46936c.m101974a(), (C1706a) new C31516d(this));
        }
    }

    /* renamed from: a */
    public final void mo64437a(List<C31493f> list) {
        this.f82443k.mo6181a(this.f82448p.mo22318c(list).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C31524h<Object>(this, list), C46936c.m101974a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64438a(List<C31493f> list, boolean z) {
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m73375c(((C31493f) next).f82404a) == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        List<C31493f> list2 = (List) arrayList;
        if (!list2.isEmpty()) {
            for (C31493f b : list2) {
                this.f82445m.mo64458b(b);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64410a(com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "filterData"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> r0 = r12.f82440h
            d.x r1 = p2628d.C52860x.f131107a
            java.lang.Object r0 = r0.mo22314c(r1)
            com.ss.android.ugc.aweme.filter.repository.internal.a r0 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a) r0
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.filter.repository.a.c r4 = r0.f82411a
            if (r4 == 0) goto L_0x0040
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r4 = r4.f82395a
            if (r4 == 0) goto L_0x0040
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.ss.android.ugc.aweme.filter.repository.a.f r6 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r6
            int r6 = r6.f82404a
            int r7 = r13.f82404a
            if (r6 != r7) goto L_0x0037
            r6 = 1
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            if (r6 == 0) goto L_0x0022
            goto L_0x003c
        L_0x003b:
            r5 = r3
        L_0x003c:
            r4 = r5
            com.ss.android.ugc.aweme.filter.repository.a.f r4 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r4
            goto L_0x0041
        L_0x0040:
            r4 = r3
        L_0x0041:
            if (r4 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.filter.repository.a.c r3 = r0.f82411a
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r3 = r3.f82395a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L_0x0054:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.ss.android.ugc.aweme.filter.repository.a.f r6 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r6
            int r6 = r6.f82404a
            int r7 = r13.f82404a
            if (r6 == r7) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x0054
            r4.add(r5)
            goto L_0x0054
        L_0x0070:
            java.util.List r4 = (java.util.List) r4
            com.ss.android.ugc.aweme.filter.repository.a.c r3 = r0.f82411a
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r3 = r3.f82396b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p2628d.p2629a.C52575l.m112104a(r3, r6)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r3 = r3.iterator()
        L_0x0089:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r3.next()
            d.n r6 = (p2628d.C52847n) r6
            java.lang.Object r7 = r6.getFirst()
            java.lang.Object r6 = r6.getSecond()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r6 = r6.iterator()
        L_0x00aa:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00c6
            java.lang.Object r9 = r6.next()
            r10 = r9
            com.ss.android.ugc.aweme.filter.repository.a.f r10 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r10
            int r10 = r10.f82404a
            int r11 = r13.f82404a
            if (r10 == r11) goto L_0x00bf
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            if (r10 == 0) goto L_0x00aa
            r8.add(r9)
            goto L_0x00aa
        L_0x00c6:
            java.util.List r8 = (java.util.List) r8
            d.n r6 = p2628d.C52856t.m112465a(r7, r8)
            r5.add(r6)
            goto L_0x0089
        L_0x00d0:
            java.util.List r5 = (java.util.List) r5
            com.ss.android.ugc.aweme.filter.repository.internal.a r3 = new com.ss.android.ugc.aweme.filter.repository.internal.a
            com.ss.android.ugc.aweme.filter.repository.a.c r13 = new com.ss.android.ugc.aweme.filter.repository.a.c
            r13.<init>(r4, r5)
            boolean r0 = r0.f82412b
            r3.<init>(r13, r0)
        L_0x00de:
            if (r3 == 0) goto L_0x00e5
            com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> r13 = r12.f82440h
            r13.mo22472d(r3)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31512g.mo64410a(com.ss.android.ugc.aweme.filter.repository.a.f):void");
    }

    /* renamed from: f */
    public final C31498k mo64416f() {
        return this.f82444l;
    }

    /* renamed from: c */
    public final C2201v<Map<Integer, C31491d>> mo64413c() {
        C2201v<Map<Integer, C31491d>> e = this.f82436d.mo6542e();
        C52711k.m112236a((Object) e, "filterInfoSubject.hide()");
        return e;
    }

    /* renamed from: d */
    public final C2201v<C31492e> mo64414d() {
        C2201v<C31492e> e = this.f82441i.mo6542e();
        C52711k.m112236a((Object) e, "filterInfoChangeSubject.hide()");
        return e;
    }

    /* renamed from: e */
    public final C31501n mo64415e() {
        return (C31501n) this.f82442j.getValue();
    }

    /* renamed from: b */
    public final C2201v<C31490c> mo64412b() {
        C2201v<C31490c> e = this.f82434b.mo6542e();
        C52711k.m112236a((Object) e, "filterDataSubject.hide()");
        return e;
    }

    /* renamed from: a */
    public final void mo64409a() {
        this.f82443k.dispose();
        this.f82443k.mo6180a();
        this.f82446n.mo64427b();
        this.f82445m.mo64459b();
        this.f82440h.mo22284c();
        this.f82434b.onNext(C31483a.m73315a());
        C1667a.m5940a().mo6139a(new C31528l(this));
    }

    /* renamed from: a */
    public final C31494g mo64408a(int i) {
        return m73375c(i);
    }

    /* renamed from: b */
    private C2201v<C31491d> m73373b(C31493f fVar) {
        C52711k.m112240b(fVar, "filterData");
        return m73371a(fVar, true);
    }

    /* renamed from: b */
    private C31491d m73374b(int i) {
        return (C31491d) this.f82435c.mo22314c(Integer.valueOf(i));
    }

    /* renamed from: c */
    private final C31494g m73375c(int i) {
        C31491d dVar = (C31491d) this.f82435c.mo22314c(Integer.valueOf(i));
        if (dVar != null) {
            C31494g gVar = dVar.f82398b;
            if (gVar != null) {
                return gVar;
            }
        }
        return C31494g.FILTER_STATE_UNKNOWN;
    }

    /* renamed from: a */
    public final C2201v<C31491d> mo64406a(C31459g gVar) {
        C52711k.m112240b(gVar, "filterBean");
        C52711k.m112240b(gVar, "filterBean");
        int i = gVar.f82324a;
        String str = gVar.f82325b;
        C52711k.m112236a((Object) str, "filterBean.name");
        String str2 = gVar.f82326c;
        ToolsUrlModel toolsUrlModel = gVar.f82327d;
        List a = gVar.mo64357a();
        C52711k.m112236a((Object) a, "filterBean.tags");
        C31493f fVar = new C31493f(i, str, str2, toolsUrlModel, a, gVar.f82329f);
        return m73373b(fVar);
    }

    /* renamed from: b */
    public final void mo64439b(List<C31491d> list) {
        boolean z;
        List<C31492e> arrayList = new ArrayList<>();
        for (C31491d dVar : list) {
            C31491d dVar2 = (C31491d) this.f82435c.mo22314c(Integer.valueOf(dVar.f82397a));
            if (dVar2 == null) {
                dVar2 = C31547a.m73406a(dVar.f82397a);
            }
            if (true ^ C52711k.m112239a((Object) dVar2, (Object) dVar)) {
                this.f82435c.mo22280a(Integer.valueOf(dVar.f82397a), dVar);
                arrayList.add(new C31492e(dVar2, dVar));
            }
        }
        if (!arrayList.isEmpty()) {
            C2178a<Map<Integer, C31491d>> aVar = this.f82436d;
            Iterable f = this.f82435c.mo22315f();
            Collection arrayList2 = new ArrayList();
            for (Object next : f) {
                if (((C52847n) next).getSecond() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            Iterable<C52847n> iterable = (List) arrayList2;
            Map linkedHashMap = new LinkedHashMap(C52753d.m112321c(C52550ab.m112044a(C52575l.m112104a(iterable, 10)), 16));
            for (C52847n nVar : iterable) {
                Object first = nVar.getFirst();
                Object second = nVar.getSecond();
                if (second == null) {
                    C52711k.m112234a();
                }
                C52847n nVar2 = new C52847n(first, second);
                linkedHashMap.put(nVar2.getFirst(), nVar2.getSecond());
            }
            aVar.onNext(linkedHashMap);
            for (C31492e onNext : arrayList) {
                this.f82441i.onNext(onNext);
            }
        }
    }

    /* renamed from: a */
    public final C31491d mo64436a(C31546b bVar) {
        if (bVar.f82507a == C31549c.PENDING || bVar.f82507a == C31549c.START) {
            C31491d dVar = new C31491d(bVar.f82508b.f82404a, C31494g.FILTER_STATE_DOWNLOADING, "", "", "");
            return dVar;
        } else if (bVar.f82507a == C31549c.SUCCESS) {
            C31550d dVar2 = bVar.f82509c;
            if (dVar2 == null) {
                if (this.f82446n.mo64426a(bVar.f82508b)) {
                    dVar2 = this.f82446n.mo64424a(bVar.f82508b.f82404a);
                } else {
                    dVar2 = this.f82444l.mo64433d(bVar.f82508b.f82404a);
                }
            }
            C31491d dVar3 = new C31491d(bVar.f82508b.f82404a, C31494g.FILTER_STATE_DOWNLOAD_SUCCESS, dVar2.f82513a, dVar2.f82514b, dVar2.f82515c);
            return dVar3;
        } else if (bVar.f82507a == C31549c.FAILED) {
            C31491d dVar4 = new C31491d(bVar.f82508b.f82404a, C31494g.FILTER_STATE_DOWNLOAD_FAILED, "", "", "");
            return dVar4;
        } else {
            C31491d dVar5 = new C31491d(bVar.f82508b.f82404a, C31494g.FILTER_STATE_UNKNOWN, "", "", "");
            return dVar5;
        }
    }

    /* renamed from: a */
    private final C2201v<C31491d> m73371a(C31493f fVar, boolean z) {
        C31494g gVar;
        C31491d b = m73374b(fVar.f82404a);
        if (b != null) {
            gVar = b.f82398b;
        } else {
            gVar = null;
        }
        if (gVar == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            C2201v<C31491d> b2 = C2201v.m6614b(b);
            C52711k.m112236a((Object) b2, "Observable.just(filterInfo)");
            return b2;
        }
        C2201v<C31491d> d = this.f82445m.mo64457a(fVar).mo6541d((C1711f<? super T, ? extends R>) new C31515c<Object,Object>(this));
        C52711k.m112236a((Object) d, "downloadObservable.map {…adEvent(it)\n            }");
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r3 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p064c.p065a.C2201v<com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d> mo64407a(com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f r17, java.util.List<? extends p2628d.C52847n<? extends com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f>>> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "filterData"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> r3 = r0.f82440h
            d.x r4 = p2628d.C52860x.f131107a
            java.lang.Object r3 = r3.mo22314c(r4)
            com.ss.android.ugc.aweme.filter.repository.internal.a r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a) r3
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.filter.repository.a.c r7 = r3.f82411a
            if (r7 == 0) goto L_0x0044
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r7 = r7.f82395a
            if (r7 == 0) goto L_0x0044
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0027:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0040
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.ss.android.ugc.aweme.filter.repository.a.f r9 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r9
            int r9 = r9.f82404a
            int r10 = r1.f82404a
            if (r9 != r10) goto L_0x003c
            r9 = 1
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 == 0) goto L_0x0027
            goto L_0x0041
        L_0x0040:
            r8 = r4
        L_0x0041:
            com.ss.android.ugc.aweme.filter.repository.a.f r8 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r8
            goto L_0x0045
        L_0x0044:
            r8 = r4
        L_0x0045:
            r7 = -1
            if (r2 == 0) goto L_0x0097
            r9 = r2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x004f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x008b
            java.lang.Object r10 = r9.next()
            r11 = r10
            d.n r11 = (p2628d.C52847n) r11
            java.lang.Object r11 = r11.getSecond()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x0067:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0082
            java.lang.Object r13 = r11.next()
            com.ss.android.ugc.aweme.filter.repository.a.f r13 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r13
            int r13 = r13.f82404a
            int r14 = r1.f82404a
            if (r13 != r14) goto L_0x007b
            r13 = 1
            goto L_0x007c
        L_0x007b:
            r13 = 0
        L_0x007c:
            if (r13 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r12 = r12 + 1
            goto L_0x0067
        L_0x0082:
            r12 = -1
        L_0x0083:
            if (r12 < 0) goto L_0x0087
            r11 = 1
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            if (r11 == 0) goto L_0x004f
            goto L_0x008c
        L_0x008b:
            r10 = r4
        L_0x008c:
            d.n r10 = (p2628d.C52847n) r10
            if (r10 == 0) goto L_0x0097
            java.lang.Object r9 = r10.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r9 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r9
            goto L_0x0098
        L_0x0097:
            r9 = r4
        L_0x0098:
            if (r3 != 0) goto L_0x00bf
            java.util.List r2 = p2628d.p2629a.C52575l.m112092a(r17)
            if (r9 == 0) goto L_0x00ae
            java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r17)
            d.n r3 = p2628d.C52856t.m112465a(r9, r3)
            java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r3)
            if (r3 != 0) goto L_0x00b2
        L_0x00ae:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()
        L_0x00b2:
            com.ss.android.ugc.aweme.filter.repository.a.c r4 = new com.ss.android.ugc.aweme.filter.repository.a.c
            r4.<init>(r2, r3)
            com.ss.android.ugc.aweme.filter.repository.internal.a r2 = new com.ss.android.ugc.aweme.filter.repository.internal.a
            r2.<init>(r4, r6)
            r4 = r2
            goto L_0x02e7
        L_0x00bf:
            if (r8 != 0) goto L_0x02e7
            if (r9 == 0) goto L_0x02cf
            com.ss.android.ugc.aweme.filter.repository.a.c r4 = r3.f82411a
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r4 = r4.f82396b
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r4 = (java.util.Collection) r4
            r10.addAll(r4)
            java.util.Iterator r4 = r10.iterator()
            r11 = 0
        L_0x00d8:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00fc
            java.lang.Object r12 = r4.next()
            d.n r12 = (p2628d.C52847n) r12
            java.lang.Object r12 = r12.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r12 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r12
            java.lang.String r12 = r12.getId()
            java.lang.String r13 = r9.getId()
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r13)
            if (r12 == 0) goto L_0x00f9
            goto L_0x00fd
        L_0x00f9:
            int r11 = r11 + 1
            goto L_0x00d8
        L_0x00fc:
            r11 = -1
        L_0x00fd:
            if (r2 == 0) goto L_0x0128
            java.util.Iterator r4 = r18.iterator()
            r12 = 0
        L_0x0104:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0128
            java.lang.Object r13 = r4.next()
            d.n r13 = (p2628d.C52847n) r13
            java.lang.Object r13 = r13.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r13 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r13
            java.lang.String r13 = r13.getId()
            java.lang.String r14 = r9.getId()
            boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r14)
            if (r13 == 0) goto L_0x0125
            goto L_0x0129
        L_0x0125:
            int r12 = r12 + 1
            goto L_0x0104
        L_0x0128:
            r12 = -1
        L_0x0129:
            if (r11 < 0) goto L_0x012d
            goto L_0x01b3
        L_0x012d:
            if (r12 >= 0) goto L_0x0142
            java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
            d.n r4 = p2628d.C52856t.m112465a(r9, r4)
            r10.add(r4)
            int r4 = r10.size()
            int r11 = r4 + -1
            goto L_0x01b3
        L_0x0142:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r13 = 0
        L_0x0151:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x017c
            java.lang.Object r14 = r11.next()
            int r15 = r13 + 1
            if (r13 >= 0) goto L_0x0162
            p2628d.p2629a.C52575l.m112100b()
        L_0x0162:
            d.n r14 = (p2628d.C52847n) r14
            java.lang.Object r14 = r14.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r14 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r14
            java.lang.String r14 = r14.getId()
            java.lang.String r5 = "pair.first.id"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r4.put(r14, r5)
            r13 = r15
            goto L_0x0151
        L_0x017c:
            if (r12 < 0) goto L_0x01a6
            r5 = 0
            r11 = -1
        L_0x0180:
            if (r2 != 0) goto L_0x0185
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0185:
            java.lang.Object r13 = r2.get(r5)
            d.n r13 = (p2628d.C52847n) r13
            java.lang.Object r13 = r13.getFirst()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r13 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r13
            java.lang.String r13 = r13.getId()
            java.lang.Object r13 = r4.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L_0x01a1
            int r11 = r13.intValue()
        L_0x01a1:
            if (r5 == r12) goto L_0x01a7
            int r5 = r5 + 1
            goto L_0x0180
        L_0x01a6:
            r11 = -1
        L_0x01a7:
            int r11 = r11 + r6
            java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
            d.n r4 = p2628d.C52856t.m112465a(r9, r4)
            r10.add(r11, r4)
        L_0x01b3:
            java.lang.Object r4 = r10.get(r11)
            d.n r4 = (p2628d.C52847n) r4
            java.lang.Object r4 = r4.getSecond()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x01c4:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x01df
            java.lang.Object r9 = r4.next()
            com.ss.android.ugc.aweme.filter.repository.a.f r9 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r9
            int r9 = r9.f82404a
            int r13 = r1.f82404a
            if (r9 != r13) goto L_0x01d8
            r9 = 1
            goto L_0x01d9
        L_0x01d8:
            r9 = 0
        L_0x01d9:
            if (r9 == 0) goto L_0x01dc
            goto L_0x01e0
        L_0x01dc:
            int r5 = r5 + 1
            goto L_0x01c4
        L_0x01df:
            r5 = -1
        L_0x01e0:
            if (r12 < 0) goto L_0x0213
            if (r2 != 0) goto L_0x01e7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01e7:
            java.lang.Object r4 = r2.get(r12)
            d.n r4 = (p2628d.C52847n) r4
            java.lang.Object r4 = r4.getSecond()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
        L_0x01f8:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0213
            java.lang.Object r13 = r4.next()
            com.ss.android.ugc.aweme.filter.repository.a.f r13 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r13
            int r13 = r13.f82404a
            int r14 = r1.f82404a
            if (r13 != r14) goto L_0x020c
            r13 = 1
            goto L_0x020d
        L_0x020c:
            r13 = 0
        L_0x020d:
            if (r13 == 0) goto L_0x0210
            goto L_0x0214
        L_0x0210:
            int r9 = r9 + 1
            goto L_0x01f8
        L_0x0213:
            r9 = -1
        L_0x0214:
            if (r5 >= 0) goto L_0x02d3
            if (r9 >= 0) goto L_0x023e
            java.lang.Object r2 = r10.remove(r11)
            d.n r2 = (p2628d.C52847n) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r2.getSecond()
            java.util.Collection r5 = (java.util.Collection) r5
            r4.addAll(r5)
            r4.add(r1)
            java.lang.Object r2 = r2.getFirst()
            d.n r2 = p2628d.C52856t.m112465a(r2, r4)
            r10.add(r11, r2)
            goto L_0x02d3
        L_0x023e:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r10.get(r11)
            d.n r5 = (p2628d.C52847n) r5
            java.lang.Object r5 = r5.getSecond()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r13 = 0
        L_0x0256:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0278
            java.lang.Object r14 = r5.next()
            int r15 = r13 + 1
            if (r13 >= 0) goto L_0x0267
            p2628d.p2629a.C52575l.m112100b()
        L_0x0267:
            com.ss.android.ugc.aweme.filter.repository.a.f r14 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r14
            int r14 = r14.f82404a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4.put(r14, r13)
            r13 = r15
            goto L_0x0256
        L_0x0278:
            if (r9 < 0) goto L_0x02a9
            r5 = 0
        L_0x027b:
            if (r2 != 0) goto L_0x0280
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0280:
            java.lang.Object r13 = r2.get(r12)
            d.n r13 = (p2628d.C52847n) r13
            java.lang.Object r13 = r13.getSecond()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r13.get(r5)
            com.ss.android.ugc.aweme.filter.repository.a.f r13 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f) r13
            int r13 = r13.f82404a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r4.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L_0x02a4
            int r7 = r13.intValue()
        L_0x02a4:
            if (r5 == r9) goto L_0x02a9
            int r5 = r5 + 1
            goto L_0x027b
        L_0x02a9:
            int r7 = r7 + r6
            java.lang.Object r2 = r10.remove(r11)
            d.n r2 = (p2628d.C52847n) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r2.getSecond()
            java.util.Collection r5 = (java.util.Collection) r5
            r4.addAll(r5)
            r4.add(r7, r1)
            java.lang.Object r2 = r2.getFirst()
            d.n r2 = p2628d.C52856t.m112465a(r2, r4)
            r10.add(r11, r2)
            goto L_0x02d3
        L_0x02cf:
            com.ss.android.ugc.aweme.filter.repository.a.c r2 = r3.f82411a
            java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> r10 = r2.f82396b
        L_0x02d3:
            com.ss.android.ugc.aweme.filter.repository.a.c r2 = r3.f82411a
            java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f> r2 = r2.f82395a
            java.util.List r2 = m73372a(r1, r2, r10)
            com.ss.android.ugc.aweme.filter.repository.internal.a r4 = new com.ss.android.ugc.aweme.filter.repository.internal.a
            com.ss.android.ugc.aweme.filter.repository.a.c r5 = new com.ss.android.ugc.aweme.filter.repository.a.c
            r5.<init>(r2, r10)
            boolean r2 = r3.f82412b
            r4.<init>(r5, r2)
        L_0x02e7:
            if (r4 == 0) goto L_0x02ee
            com.bytedance.jedi.a.h.f<com.ss.android.ugc.aweme.filter.repository.internal.a> r2 = r0.f82440h
            r2.mo22472d(r4)
        L_0x02ee:
            if (r8 != 0) goto L_0x02f1
            goto L_0x02f2
        L_0x02f1:
            r1 = r8
        L_0x02f2:
            c.a.v r1 = r0.m73373b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31512g.mo64407a(com.ss.android.ugc.aweme.filter.repository.a.f, java.util.List):c.a.v");
    }

    /* renamed from: a */
    private static List<C31493f> m73372a(C31493f fVar, List<C31493f> list, List<? extends C52847n<? extends EffectCategoryResponse, ? extends List<C31493f>>> list2) {
        boolean z;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C31493f) it.next()).f82404a == fVar.f82404a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return list;
        }
        List<C31493f> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        arrayList.add(fVar);
        Iterable<C52847n> iterable = list2;
        Collection arrayList2 = new ArrayList();
        for (C52847n second : iterable) {
            C52575l.m112108a(arrayList2, (Iterable) (List) second.getSecond());
        }
        List list3 = (List) arrayList2;
        if (arrayList.size() > 1) {
            C52575l.m112105a(arrayList, new C31513a(list3));
        }
        return arrayList;
    }

    public C31512g(C31597m mVar, C31595k kVar, C31567e eVar, C31592h hVar, C31599o oVar, C31593i iVar, boolean z) {
        C52711k.m112240b(mVar, "filterFiler");
        C52711k.m112240b(kVar, "filterDownloader");
        C52711k.m112240b(eVar, "localFilterManager");
        C52711k.m112240b(hVar, "filterDataFetcher");
        C52711k.m112240b(oVar, "filterInfoFetcher");
        C52711k.m112240b(iVar, "filterSourceInternal");
        this.f82444l = mVar;
        this.f82445m = kVar;
        this.f82446n = eVar;
        this.f82447o = hVar;
        this.f82448p = oVar;
        this.f82438f = iVar;
        this.f82439g = z;
        C2178a<C31490c> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<FilterData>()");
        this.f82434b = l;
        this.f82435c = new C11578a<>(0, 1, null);
        C2178a<Map<Integer, C31491d>> l2 = C2178a.m6527l();
        C52711k.m112236a((Object) l2, "BehaviorSubject.create<Map<Int, FilterInfo>>()");
        this.f82436d = l2;
        C2180b<C31492e> l3 = C2180b.m6534l();
        C52711k.m112236a((Object) l3, "PublishSubject.create<FilterInfoEvent>()");
        this.f82441i = l3;
        this.f82437e = new AtomicReference<>(null);
        this.f82442j = C52732g.m112285a(new C31525i(this));
        this.f82443k = new C1689b();
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f82447o), C11571b.m23673a((C11536c<K, V>) this.f82440h), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C11697a.f31149a, 1, (Object) null));
        C11571b.m23673a((C11536c<K, V>) this.f82440h).mo22301a(true, (C11574e<?, ?>[]) new C11574e[0]).mo6505a((C1710e<? super T>) new C31514b<Object>(this), C46936c.m101974a());
        this.f82445m.mo64456a().mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C31526j<Object,Object>(this)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C31527k<Object>(this), C46936c.m101974a());
    }
}
