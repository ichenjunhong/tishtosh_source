package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a */
public final class C34904a<R> extends C34922e<R> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89888a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34904a.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: g */
    public static final C34906b f89889g = new C34906b(null);

    /* renamed from: b */
    public C34933g<R> f89890b;

    /* renamed from: c */
    public C52670a<Boolean> f89891c;

    /* renamed from: d */
    public C52671b<? super C34907c<R>, Boolean> f89892d;

    /* renamed from: e */
    public C52671b<? super List<R>, ? extends List<R>> f89893e;

    /* renamed from: f */
    public volatile boolean f89894f;

    /* renamed from: i */
    private final C52668f f89895i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$a */
    public static final class C34905a<R> {

        /* renamed from: a */
        public final C34904a<R> f89896a = new C34904a<>(null);

        /* renamed from: a */
        public final C34905a<R> mo73029a(C34920d<R> dVar) {
            C52711k.m112240b(dVar, "loadSubscriber");
            C34905a<R> aVar = this;
            aVar.f89896a.mo73035a(dVar);
            return aVar;
        }

        /* renamed from: a */
        public final C34905a<R> mo73030a(C34933g<R> gVar) {
            C52711k.m112240b(gVar, "provider");
            C34905a<R> aVar = this;
            aVar.f89896a.f89890b = gVar;
            return aVar;
        }

        /* renamed from: a */
        public final C34905a<R> mo73031a(C52671b<? super C34907c<R>, Boolean> bVar) {
            C52711k.m112240b(bVar, "interceptor");
            C34905a<R> aVar = this;
            aVar.f89896a.f89892d = bVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$b */
    public static final class C34906b {
        private C34906b() {
        }

        /* renamed from: a */
        public static <R> C34905a<R> m79022a() {
            return new C34905a<>();
        }

        public /* synthetic */ C34906b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$c */
    public static final class C34907c<R> {

        /* renamed from: a */
        public final LinkedHashMap<C34922e<R>, List<R>> f89897a;

        /* renamed from: b */
        public final List<R> f89898b;

        /* renamed from: c */
        public final C34922e<R> f89899c;

        public C34907c(LinkedHashMap<C34922e<R>, List<R>> linkedHashMap, List<R> list, C34922e<R> eVar) {
            C52711k.m112240b(linkedHashMap, "resultMap");
            C52711k.m112240b(list, "list");
            C52711k.m112240b(eVar, "loader");
            this.f89897a = linkedHashMap;
            this.f89898b = list;
            this.f89899c = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$d */
    static final class C34908d extends C52712l implements C52670a<C1689b> {

        /* renamed from: a */
        public static final C34908d f89900a = new C34908d();

        C34908d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e */
    static final class C34909e<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C34904a f89901a;

        /* renamed from: b */
        final /* synthetic */ boolean f89902b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$a */
        static final /* synthetic */ class C34910a extends C52710j implements C52670a<List<R>> {
            C34910a(C34923f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadMoreDirectly";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C34923f.class);
            }

            public final String getSignature() {
                return "loadMoreDirectly()Ljava/util/List;";
            }

            public final /* synthetic */ Object invoke() {
                return ((C34923f) this.receiver).mo73041h();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$b */
        static final /* synthetic */ class C34911b extends C52710j implements C52670a<List<R>> {
            C34911b(C34923f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadMoreDirectly";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C34923f.class);
            }

            public final String getSignature() {
                return "loadMoreDirectly()Ljava/util/List;";
            }

            public final /* synthetic */ Object invoke() {
                return ((C34923f) this.receiver).mo73041h();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$c */
        static final /* synthetic */ class C34912c extends C52710j implements C52670a<List<R>> {
            C34912c(C34923f fVar) {
                super(0, fVar);
            }

            public final String getName() {
                return "loadDirectly";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C34923f.class);
            }

            public final String getSignature() {
                return "loadDirectly()Ljava/util/List;";
            }

            public final /* synthetic */ Object invoke() {
                return ((C34923f) this.receiver).mo73040g();
            }
        }

        C34909e(C34904a aVar, boolean z) {
            this.f89901a = aVar;
            this.f89902b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x0090 A[LOOP:0: B:16:0x003d->B:36:0x0090, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0092 A[EDGE_INSN: B:45:0x0092->B:37:0x0092 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p064c.p065a.C2204x<java.util.List<R>> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "emitter"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a r0 = r7.f89901a
                d.f.a.a<java.lang.Boolean> r0 = r0.f89891c
                r1 = 1
                if (r0 == 0) goto L_0x0019
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 == 0) goto L_0x0019
                boolean r0 = r0.booleanValue()
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                if (r0 != 0) goto L_0x0027
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r8.mo6282a(r0)
                return
            L_0x0027:
                boolean r0 = r7.f89902b
                if (r0 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a r0 = r7.f89901a
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.g<R> r0 = r0.f89890b
                if (r0 != 0) goto L_0x0034
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0034:
                r0.mo73049b()
            L_0x0037:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r2 = 0
            L_0x003d:
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a r3 = r7.f89901a
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.g<R> r3 = r3.f89890b
                if (r3 != 0) goto L_0x0046
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0046:
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.f r3 = r3.mo73046a(r1)
                if (r3 != 0) goto L_0x004d
                goto L_0x0092
            L_0x004d:
                if (r2 != 0) goto L_0x0059
                boolean r4 = r7.f89902b
                if (r4 == 0) goto L_0x0059
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$a r2 = new com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$a
                r2.<init>(r3)
                goto L_0x006a
            L_0x0059:
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r2)
                if (r2 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$b r2 = new com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$b
                r2.<init>(r3)
                goto L_0x006a
            L_0x0065:
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$c r2 = new com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$e$c
                r2.<init>(r3)
            L_0x006a:
                d.f.a.a r2 = (p2628d.p2639f.p2640a.C52670a) r2
                java.lang.Object r2 = r2.invoke()
                java.util.List r2 = (java.util.List) r2
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a r4 = r7.f89901a
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$c r5 = new com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$c
                r6 = r3
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.e r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34922e) r6
                r5.<init>(r0, r2, r6)
                d.f.a.b<? super com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$c<R>, java.lang.Boolean> r2 = r4.f89892d
                if (r2 == 0) goto L_0x008d
                java.lang.Object r2 = r2.invoke(r5)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x008d
                boolean r2 = r2.booleanValue()
                goto L_0x008e
            L_0x008d:
                r2 = 0
            L_0x008e:
                if (r2 == 0) goto L_0x0092
                r2 = r3
                goto L_0x003d
            L_0x0092:
                com.ss.android.ugc.aweme.im.sdk.relations.core.b.a r1 = r7.f89901a
                java.util.List r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34915b.m79023a(r0)
                d.f.a.b<? super java.util.List<R>, ? extends java.util.List<R>> r1 = r1.f89893e
                if (r1 == 0) goto L_0x00a6
                java.lang.Object r1 = r1.invoke(r0)
                java.util.List r1 = (java.util.List) r1
                if (r1 != 0) goto L_0x00a5
                goto L_0x00a6
            L_0x00a5:
                r0 = r1
            L_0x00a6:
                r8.mo6282a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34909e.subscribe(c.a.x):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$f */
    static final class C34913f<T> implements C1710e<List<R>> {

        /* renamed from: a */
        final /* synthetic */ C34904a f89903a;

        /* renamed from: b */
        final /* synthetic */ boolean f89904b;

        C34913f(C34904a aVar, boolean z) {
            this.f89903a = aVar;
            this.f89904b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.f89903a.f89894f = false;
            C34904a aVar = this.f89903a;
            C52711k.m112236a((Object) list, "it");
            aVar.mo73037a(list, this.f89904b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.a$g */
    static final class C34914g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C34904a f89905a;

        /* renamed from: b */
        final /* synthetic */ boolean f89906b;

        C34914g(C34904a aVar, boolean z) {
            this.f89905a = aVar;
            this.f89906b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f89905a.f89894f = false;
            C34904a aVar = this.f89905a;
            C52711k.m112236a((Object) th, "it");
            aVar.mo73036a(th, this.f89906b);
        }
    }

    /* renamed from: f */
    private final C1689b m79015f() {
        return (C1689b) this.f89895i.getValue();
    }

    /* renamed from: d */
    public final boolean mo73027d() {
        return this.f89894f;
    }

    private C34904a() {
        this.f89895i = C52732g.m112285a(C34908d.f89900a);
    }

    /* renamed from: e */
    public final boolean mo73028e() {
        C34923f fVar;
        C34933g<R> gVar = this.f89890b;
        if (gVar != null) {
            fVar = gVar.mo73046a(true);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return true;
        }
        return false;
    }

    public final void bp_() {
        C34904a aVar;
        if (mo73016b()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C34904a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.m79014a(false);
        }
    }

    public final void bq_() {
        C34904a aVar;
        if (mo73016b()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C34904a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.m79014a(true);
        }
    }

    /* renamed from: b */
    public final boolean mo73016b() {
        List list;
        boolean z;
        if (!this.f89894f) {
            C34933g<R> gVar = this.f89890b;
            if (gVar != null) {
                list = gVar.mo73048a();
            } else {
                list = null;
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z || !super.mo73016b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ C34904a(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    private final void m79014a(boolean z) {
        this.f89894f = true;
        C1690c a = C2201v.m6601a((C2205y<T>) new C34909e<T>(this, z)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34913f<Object>(this, z), (C1710e<? super Throwable>) new C34914g<Object>(this, z));
        m79015f().mo6180a();
        m79015f().mo6181a(a);
    }
}
