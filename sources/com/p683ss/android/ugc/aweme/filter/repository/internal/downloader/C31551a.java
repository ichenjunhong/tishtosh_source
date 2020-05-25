package com.p683ss.android.ugc.aweme.filter.repository.internal.downloader;

import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31549c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31594j;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31595k;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.tools.p2354c.C46935b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p094l.C2178a;
import p064c.p065a.p094l.C2180b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.a */
public final class C31551a implements C31595k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82516a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31551a.class), "executor", "getExecutor()Ljava/util/concurrent/ExecutorService;"))};

    /* renamed from: b */
    public final C2180b<C31546b> f82517b;

    /* renamed from: c */
    public final ConcurrentHashMap<Integer, C31557c> f82518c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public C31594j f82519d;

    /* renamed from: e */
    public final C31597m f82520e;

    /* renamed from: f */
    public final C31567e f82521f;

    /* renamed from: g */
    public final C17432q<C31596l> f82522g;

    /* renamed from: h */
    public final int f82523h;

    /* renamed from: i */
    private final AtomicInteger f82524i = new AtomicInteger(0);

    /* renamed from: j */
    private final C52668f f82525j = C52732g.m112285a(new C31554b(this));

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$a */
    static final class C31552a<T, R> implements C1711f<C31493f, C31550d> {

        /* renamed from: a */
        final /* synthetic */ C31551a f82526a;

        C31552a(C31551a aVar) {
            this.f82526a = aVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d apply(final com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f r12) {
            /*
                r11 = this;
                java.lang.String r0 = "filterMeta"
                p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.e r0 = r0.f82521f
                boolean r0 = r0.mo64426a(r12)
                if (r0 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.e r0 = r0.f82521f
                int r12 = r12.f82404a
                com.ss.android.ugc.aweme.filter.repository.internal.d r12 = r0.mo64424a(r12)
                return r12
            L_0x001a:
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r0 = r0.f82520e
                boolean r0 = r0.mo64432a(r12)
                if (r0 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r0 = r0.f82520e
                int r12 = r12.f82404a
                com.ss.android.ugc.aweme.filter.repository.internal.d r12 = r0.mo64433d(r12)
                return r12
            L_0x002f:
                com.ss.android.ugc.aweme.tools.ToolsUrlModel r0 = r12.f82407d
                r1 = 46
                if (r0 == 0) goto L_0x0124
                java.util.List<java.lang.String> r0 = r0.f118259b
                if (r0 == 0) goto L_0x0124
                r2 = 0
                java.lang.Object r0 = p2628d.p2629a.C52575l.m112118a(r0, r2)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x0124
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r3 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r3 = r3.f82520e
                int r4 = r12.f82404a
                java.lang.String r3 = r3.mo64404b(r4)
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r4 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r4 = r4.f82520e
                int r5 = r12.f82404a
                java.lang.String r4 = r4.mo64403a(r5)
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r5 = r11.f82526a
                com.google.b.a.q<com.ss.android.ugc.aweme.filter.repository.internal.l> r5 = r5.f82522g
                java.lang.Object r5 = r5.get()
                r9 = r5
                com.ss.android.ugc.aweme.filter.repository.internal.l r9 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l) r9
                com.p683ss.android.ugc.tools.utils.C50200d.m108339a(r3, r2)
                c.a.l.b r2 = p064c.p065a.p094l.C2180b.m6534l()
                java.lang.String r5 = "PublishSubject.create<Long>()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$a$1 r5 = new com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$a$1
                r5.<init>(r2, r12)
                com.ss.android.ugc.aweme.filter.repository.internal.p r5 = (com.p683ss.android.ugc.aweme.filter.repository.internal.C31600p) r5
                r9.mo64465a(r0, r4, r3, r5)
                c.a.e.d.e r3 = new c.a.e.d.e     // Catch:{ Exception -> 0x00e8 }
                r3.<init>()     // Catch:{ Exception -> 0x00e8 }
                r2.mo6314a(r3)     // Catch:{ Exception -> 0x00e8 }
                java.lang.Object r2 = r3.mo6234a()     // Catch:{ Exception -> 0x00e8 }
                if (r2 == 0) goto L_0x00e2
                java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x00e8 }
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r3 = r11.f82526a     // Catch:{ Exception -> 0x00e8 }
                com.ss.android.ugc.aweme.filter.repository.internal.j r3 = r3.f82519d     // Catch:{ Exception -> 0x00e8 }
                if (r3 == 0) goto L_0x00a1
                java.lang.String r4 = "duration"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)     // Catch:{ Exception -> 0x00e8 }
                long r6 = r2.longValue()     // Catch:{ Exception -> 0x00e8 }
                java.lang.String r2 = "downloader"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)     // Catch:{ Exception -> 0x00e8 }
                r4 = r12
                r5 = r0
                r8 = r9
                r3.mo64311a(r4, r5, r6, r8)     // Catch:{ Exception -> 0x00e8 }
            L_0x00a1:
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r0 = r0.f82520e
                int r2 = r12.f82404a
                boolean r0 = r0.mo64434e(r2)
                if (r0 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r0 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.m r0 = r0.f82520e
                int r12 = r12.f82404a
                com.ss.android.ugc.aweme.filter.repository.internal.d r12 = r0.mo64433d(r12)
                return r12
            L_0x00b8:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Filter unzip failed and causing exception is missing. "
                r2.<init>(r3)
                java.lang.String r3 = "id : "
                r2.append(r3)
                int r3 = r12.f82404a
                r2.append(r3)
                java.lang.String r3 = ", name : "
                r2.append(r3)
                java.lang.String r12 = r12.f82405b
                r2.append(r12)
                r2.append(r1)
                java.lang.String r12 = r2.toString()
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x00e2:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x00e8 }
                r1.<init>()     // Catch:{ Exception -> 0x00e8 }
                throw r1     // Catch:{ Exception -> 0x00e8 }
            L_0x00e8:
                r1 = move-exception
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.a r2 = r11.f82526a
                com.ss.android.ugc.aweme.filter.repository.internal.j r3 = r2.f82519d
                if (r3 == 0) goto L_0x0121
                boolean r2 = r1 instanceof com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31556b
                r4 = 0
                if (r2 != 0) goto L_0x00f6
                r5 = r4
                goto L_0x00f7
            L_0x00f6:
                r5 = r1
            L_0x00f7:
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.b r5 = (com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31556b) r5
                if (r5 == 0) goto L_0x0104
                java.lang.Long r5 = r5.f82532b
                if (r5 == 0) goto L_0x0104
                long r5 = r5.longValue()
                goto L_0x0106
            L_0x0104:
                r5 = 0
            L_0x0106:
                r6 = r5
                java.lang.String r5 = "downloader"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
                if (r2 != 0) goto L_0x0110
                r2 = r4
                goto L_0x0111
            L_0x0110:
                r2 = r1
            L_0x0111:
                com.ss.android.ugc.aweme.filter.repository.internal.downloader.b r2 = (com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31556b) r2
                if (r2 == 0) goto L_0x0119
                java.lang.Integer r2 = r2.f82531a
                r10 = r2
                goto L_0x011a
            L_0x0119:
                r10 = r4
            L_0x011a:
                r4 = r12
                r5 = r0
                r8 = r9
                r9 = r1
                r3.mo64312a(r4, r5, r6, r8, r9, r10)
            L_0x0121:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x0124:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Filter url list is empty while downloading. "
                r2.<init>(r3)
                java.lang.String r3 = "id : "
                r2.append(r3)
                int r3 = r12.f82404a
                r2.append(r3)
                java.lang.String r3 = ", name : "
                r2.append(r3)
                java.lang.String r12 = r12.f82405b
                r2.append(r12)
                r2.append(r1)
                java.lang.String r12 = r2.toString()
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31551a.C31552a.apply(com.ss.android.ugc.aweme.filter.repository.a.f):com.ss.android.ugc.aweme.filter.repository.internal.d");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$b */
    static final class C31554b extends C52712l implements C52670a<C46935b> {

        /* renamed from: a */
        final /* synthetic */ C31551a f82529a;

        C31554b(C31551a aVar) {
            this.f82529a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46935b bVar = new C46935b(0, this.f82529a.f82523h, 8000, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
            bVar.allowCoreThreadTimeOut(true);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$c */
    static final class C31555c<T> implements C1710e<C31546b> {

        /* renamed from: a */
        final /* synthetic */ C31551a f82530a;

        C31555c(C31551a aVar) {
            this.f82530a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31546b bVar = (C31546b) obj;
            if (bVar.f82507a == C31549c.SUCCESS || bVar.f82507a == C31549c.FAILED) {
                synchronized (this.f82530a.f82518c) {
                    this.f82530a.f82518c.remove(Integer.valueOf(bVar.f82508b.f82404a));
                }
            }
            this.f82530a.f82517b.onNext(bVar);
        }
    }

    /* renamed from: a */
    public final C2201v<C31546b> mo64456a() {
        C2201v<C31546b> e = this.f82517b.mo6542e();
        C52711k.m112236a((Object) e, "downloadEventSubject.hide()");
        return e;
    }

    /* renamed from: b */
    public final void mo64459b() {
        List<C31557c> e;
        synchronized (this.f82518c) {
            Collection values = this.f82518c.values();
            C52711k.m112236a((Object) values, "downloadTaskRegistry.values");
            e = C52575l.m112138e((Iterable<? extends T>) values);
            this.f82518c.clear();
        }
        for (C31557c cVar : e) {
            cVar.f82535c.onNext(new C31546b(C31549c.FAILED, cVar.f82533a, null, null));
            cVar.f82535c.onComplete();
            Future<?> future = cVar.f82537e;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    /* renamed from: b */
    public final C2201v<C31546b> mo64458b(C31493f fVar) {
        C52711k.m112240b(fVar, "filterMeta");
        return m73414a(fVar, false);
    }

    /* renamed from: a */
    public final C2201v<C31546b> mo64457a(C31493f fVar) {
        C52711k.m112240b(fVar, "filterMeta");
        return m73414a(fVar, true);
    }

    /* renamed from: c */
    public final C31549c mo64460c(C31493f fVar) {
        C52711k.m112240b(fVar, "filterMeta");
        C31557c cVar = (C31557c) this.f82518c.get(Integer.valueOf(fVar.f82404a));
        if (cVar != null) {
            C2178a<C31546b> aVar = cVar.f82535c;
            if (aVar != null) {
                C31546b bVar = (C31546b) aVar.mo6469m();
                if (bVar != null) {
                    return bVar.f82507a;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p064c.p065a.C2201v<com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b> m73414a(com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f r14, boolean r15) {
        /*
            r13 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.ss.android.ugc.aweme.filter.repository.internal.downloader.c> r0 = r13.f82518c
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.ss.android.ugc.aweme.filter.repository.internal.downloader.c> r1 = r13.f82518c     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch:{ all -> 0x0098 }
            int r2 = r14.f82404a     // Catch:{ all -> 0x0098 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0098 }
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x0040
            com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$a r3 = new com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$a     // Catch:{ all -> 0x0098 }
            r3.<init>(r13)     // Catch:{ all -> 0x0098 }
            r7 = r3
            c.a.d.f r7 = (p064c.p065a.p071d.C1711f) r7     // Catch:{ all -> 0x0098 }
            c.a.l.a r8 = p064c.p065a.p094l.C2178a.m6527l()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "BehaviorSubject.create<FilterDownloadEvent>()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)     // Catch:{ all -> 0x0098 }
            com.ss.android.ugc.aweme.filter.repository.internal.downloader.c r3 = new com.ss.android.ugc.aweme.filter.repository.internal.downloader.c     // Catch:{ all -> 0x0098 }
            java.util.concurrent.atomic.AtomicInteger r4 = r13.f82524i     // Catch:{ all -> 0x0098 }
            int r6 = r4.getAndIncrement()     // Catch:{ all -> 0x0098 }
            r10 = 0
            r11 = 32
            r12 = 0
            r4 = r3
            r5 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0098 }
            r4 = 1
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r3 = r1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            java.lang.String r1 = "downloadTaskRegistry.get…          }\n            }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)     // Catch:{ all -> 0x0098 }
            com.ss.android.ugc.aweme.filter.repository.internal.downloader.c r3 = (com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31557c) r3     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r4 != 0) goto L_0x0053
            c.a.l.a<com.ss.android.ugc.aweme.filter.repository.internal.b> r2 = r3.f82535c     // Catch:{ all -> 0x0098 }
            java.lang.Object r2 = r2.mo6469m()     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x005f
        L_0x0053:
            if (r15 == 0) goto L_0x005f
            r3.f82536d = r15     // Catch:{ all -> 0x0098 }
            com.ss.android.ugc.aweme.filter.repository.internal.b r15 = new com.ss.android.ugc.aweme.filter.repository.internal.b     // Catch:{ all -> 0x0098 }
            com.ss.android.ugc.aweme.filter.repository.internal.c r2 = com.p683ss.android.ugc.aweme.filter.repository.internal.C31549c.PENDING     // Catch:{ all -> 0x0098 }
            r15.<init>(r2, r14, r1, r1)     // Catch:{ all -> 0x0098 }
            goto L_0x0060
        L_0x005f:
            r15 = r1
        L_0x0060:
            monitor-exit(r0)
            if (r15 == 0) goto L_0x0068
            c.a.l.a<com.ss.android.ugc.aweme.filter.repository.internal.b> r14 = r3.f82535c
            r14.onNext(r15)
        L_0x0068:
            if (r4 == 0) goto L_0x0093
            c.a.l.a<com.ss.android.ugc.aweme.filter.repository.internal.b> r14 = r3.f82535c
            c.a.ac r15 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r14 = r14.mo6514a(r15)
            com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$c r15 = new com.ss.android.ugc.aweme.filter.repository.internal.downloader.a$c
            r15.<init>(r13)
            c.a.d.e r15 = (p064c.p065a.p071d.C1710e) r15
            c.a.d.e r0 = com.p683ss.android.ugc.aweme.tools.p2354c.C46936c.m101974a()
            r14.mo6505a(r15, r0)
            d.f r14 = r13.f82525j
            java.lang.Object r14 = r14.getValue()
            java.util.concurrent.ExecutorService r14 = (java.util.concurrent.ExecutorService) r14
            r15 = r3
            java.lang.Runnable r15 = (java.lang.Runnable) r15
            java.util.concurrent.Future r14 = r14.submit(r15)
            r3.f82537e = r14
        L_0x0093:
            c.a.l.a<com.ss.android.ugc.aweme.filter.repository.internal.b> r14 = r3.f82535c
            c.a.v r14 = (p064c.p065a.C2201v) r14
            return r14
        L_0x0098:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31551a.m73414a(com.ss.android.ugc.aweme.filter.repository.a.f, boolean):c.a.v");
    }

    public C31551a(C31597m mVar, C31567e eVar, C17432q<C31596l> qVar, int i) {
        C52711k.m112240b(mVar, "filterFileService");
        C52711k.m112240b(eVar, "filterBackupService");
        C52711k.m112240b(qVar, "downloaderSupplier");
        this.f82520e = mVar;
        this.f82521f = eVar;
        this.f82522g = qVar;
        this.f82523h = i;
        C2180b<C31546b> l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create<FilterDownloadEvent>()");
        this.f82517b = l;
    }
}
