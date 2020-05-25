package com.p683ss.android.ugc.network.observer;

import com.bytedance.netecho.NetechoConfig;
import com.p683ss.android.ugc.network.observer.bean.C50094c;
import com.p683ss.android.ugc.network.observer.bean.DetectorParam;
import com.p683ss.android.ugc.network.observer.p2491b.C50090b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.network.observer.c */
public final class C50096c {

    /* renamed from: a */
    static ConcurrentHashMap<Long, C50090b> f125484a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C50096c f125485b = new C50096c();

    /* renamed from: c */
    private static volatile AtomicLong f125486c = new AtomicLong(10);

    /* renamed from: com.ss.android.ugc.network.observer.c$a */
    static final class C50098a extends C52712l implements C52671b<Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ long f125488a;

        /* renamed from: b */
        final /* synthetic */ DetectorParam f125489b;

        /* renamed from: c */
        final /* synthetic */ C50094c f125490c;

        /* renamed from: d */
        final /* synthetic */ C52682m f125491d;

        /* renamed from: e */
        final /* synthetic */ C52671b f125492e;

        C50098a(long j, DetectorParam detectorParam, C50094c cVar, C52682m mVar, C52671b bVar) {
            this.f125488a = j;
            this.f125489b = detectorParam;
            this.f125490c = cVar;
            this.f125491d = mVar;
            this.f125492e = bVar;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a A[Catch:{ Throwable -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0083 A[Catch:{ Throwable -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf A[Catch:{ Throwable -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8 A[Catch:{ Throwable -> 0x00fb }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Number r15 = (java.lang.Number) r15
                r15.longValue()
                com.ss.android.ugc.network.observer.c r15 = com.p683ss.android.ugc.network.observer.C50096c.f125485b     // Catch:{ Throwable -> 0x00fb }
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.ss.android.ugc.network.observer.b.b> r15 = com.p683ss.android.ugc.network.observer.C50096c.f125484a     // Catch:{ Throwable -> 0x00fb }
                long r0 = r14.f125488a     // Catch:{ Throwable -> 0x00fb }
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x00fb }
                r15.remove(r0)     // Catch:{ Throwable -> 0x00fb }
                com.ss.android.ugc.network.observer.d r15 = com.p683ss.android.ugc.network.observer.C50099d.f125499g     // Catch:{ Throwable -> 0x00fb }
                long r0 = r14.f125488a     // Catch:{ Throwable -> 0x00fb }
                com.ss.android.ugc.network.observer.bean.DetectorParam r15 = r14.f125489b     // Catch:{ Throwable -> 0x00fb }
                com.ss.android.ugc.network.observer.bean.c r2 = r14.f125490c     // Catch:{ Throwable -> 0x00fb }
                d.f.a.m r3 = r14.f125491d     // Catch:{ Throwable -> 0x00fb }
                d.f.a.b r4 = r14.f125492e     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r5 = "param"
                p2628d.p2639f.p2641b.C52711k.m112240b(r15, r5)     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r5 = "localParam"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r5 = "callback"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r5)     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r5 = "callback2"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)     // Catch:{ Throwable -> 0x00fb }
                java.lang.Thread r5 = com.p683ss.android.ugc.network.observer.C50099d.f125497e     // Catch:{ Throwable -> 0x00fb }
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x0047
                java.lang.Thread r5 = com.p683ss.android.ugc.network.observer.C50099d.f125497e     // Catch:{ Throwable -> 0x00fb }
                if (r5 != 0) goto L_0x003f
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00fb }
            L_0x003f:
                boolean r5 = r5.isAlive()     // Catch:{ Throwable -> 0x00fb }
                if (r5 == 0) goto L_0x0047
                r5 = 1
                goto L_0x0048
            L_0x0047:
                r5 = 0
            L_0x0048:
                if (r5 != 0) goto L_0x00e4
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00fb }
                long r10 = com.p683ss.android.ugc.network.observer.C50099d.f125493a     // Catch:{ Throwable -> 0x00fb }
                r5 = 0
                long r10 = r8 - r10
                int r5 = r15.getBlackTimeout()     // Catch:{ Throwable -> 0x00fb }
                long r12 = (long) r5     // Catch:{ Throwable -> 0x00fb }
                int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r5 <= 0) goto L_0x0080
                long r10 = com.p683ss.android.ugc.network.observer.C50099d.f125494b     // Catch:{ Throwable -> 0x00fb }
                r5 = 0
                long r10 = r8 - r10
                r12 = 60000(0xea60, double:2.9644E-319)
                int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r5 <= 0) goto L_0x0072
                com.p683ss.android.ugc.network.observer.C50099d.f125494b = r8     // Catch:{ Throwable -> 0x00fb }
                com.p683ss.android.ugc.network.observer.C50099d.f125495c = r7     // Catch:{ Throwable -> 0x00fb }
                java.util.concurrent.atomic.AtomicBoolean r5 = com.p683ss.android.ugc.network.observer.C50099d.f125496d     // Catch:{ Throwable -> 0x00fb }
                r5.set(r7)     // Catch:{ Throwable -> 0x00fb }
                goto L_0x007e
            L_0x0072:
                int r5 = com.p683ss.android.ugc.network.observer.C50099d.f125495c     // Catch:{ Throwable -> 0x00fb }
                int r5 = r5 + r7
                com.p683ss.android.ugc.network.observer.C50099d.f125495c = r5     // Catch:{ Throwable -> 0x00fb }
                int r8 = r15.getFrequencyLimit()     // Catch:{ Throwable -> 0x00fb }
                if (r5 <= r8) goto L_0x007e
                goto L_0x0080
            L_0x007e:
                r5 = 0
                goto L_0x0081
            L_0x0080:
                r5 = 1
            L_0x0081:
                if (r5 == 0) goto L_0x00cf
                com.ss.android.ugc.network.observer.b r15 = com.p683ss.android.ugc.network.observer.C50088b.UNKNOWN_STATUS     // Catch:{ Throwable -> 0x00fb }
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00fb }
                r0.<init>()     // Catch:{ Throwable -> 0x00fb }
                r3.invoke(r15, r0)     // Catch:{ Throwable -> 0x00fb }
                java.util.concurrent.atomic.AtomicBoolean r15 = com.p683ss.android.ugc.network.observer.C50099d.f125496d     // Catch:{ Throwable -> 0x00fb }
                boolean r15 = r15.compareAndSet(r7, r6)     // Catch:{ Throwable -> 0x00fb }
                if (r15 == 0) goto L_0x00fb
                java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Throwable -> 0x00fb }
                r15.<init>()     // Catch:{ Throwable -> 0x00fb }
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00fb }
                r0.<init>()     // Catch:{ Throwable -> 0x00fb }
                r1 = r15
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r3 = com.p683ss.android.ugc.network.observer.bean.C50095d.m108049b()     // Catch:{ Throwable -> 0x00fb }
                com.ss.android.ugc.network.observer.b r5 = com.p683ss.android.ugc.network.observer.C50088b.UNKNOWN_STATUS     // Catch:{ Throwable -> 0x00fb }
                int r5 = r5.ordinal()     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x00fb }
                r1.put(r3, r5)     // Catch:{ Throwable -> 0x00fb }
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r3 = "extra_info"
                java.lang.String r5 = "1"
                java.util.HashMap r2 = com.p683ss.android.ugc.network.observer.p2491b.C50089a.m108045a(r5, r2)     // Catch:{ Throwable -> 0x00fb }
                r1.put(r3, r2)     // Catch:{ Throwable -> 0x00fb }
                r1 = r15
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x00fb }
                java.lang.String r2 = com.p683ss.android.ugc.network.observer.bean.C50095d.m108050c()     // Catch:{ Throwable -> 0x00fb }
                r1.put(r2, r0)     // Catch:{ Throwable -> 0x00fb }
                r4.invoke(r15)     // Catch:{ Throwable -> 0x00fb }
                goto L_0x00fb
            L_0x00cf:
                com.ss.android.ugc.network.observer.a r5 = new com.ss.android.ugc.network.observer.a     // Catch:{ Throwable -> 0x00fb }
                r5.<init>(r15, r2)     // Catch:{ Throwable -> 0x00fb }
                com.p683ss.android.ugc.network.observer.C50099d.f125498f = r5     // Catch:{ Throwable -> 0x00fb }
                java.lang.Thread r15 = new java.lang.Thread     // Catch:{ Throwable -> 0x00fb }
                com.ss.android.ugc.network.observer.a r2 = com.p683ss.android.ugc.network.observer.C50099d.f125498f     // Catch:{ Throwable -> 0x00fb }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ Throwable -> 0x00fb }
                r15.<init>(r2)     // Catch:{ Throwable -> 0x00fb }
                com.p683ss.android.ugc.network.observer.C50099d.f125497e = r15     // Catch:{ Throwable -> 0x00fb }
                r15.start()     // Catch:{ Throwable -> 0x00fb }
            L_0x00e4:
                com.ss.android.ugc.network.observer.a r15 = com.p683ss.android.ugc.network.observer.C50099d.f125498f     // Catch:{ Throwable -> 0x00fb }
                if (r15 == 0) goto L_0x00fb
                java.util.concurrent.CopyOnWriteArrayList<d.n<d.f.a.m<com.ss.android.ugc.network.observer.b, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>>, d.x>, d.f.a.b<java.util.HashMap<java.lang.String, java.lang.Object>, d.x>>> r2 = r15.f125433a     // Catch:{ Throwable -> 0x00fb }
                d.n r5 = new d.n     // Catch:{ Throwable -> 0x00fb }
                r5.<init>(r3, r4)     // Catch:{ Throwable -> 0x00fb }
                r2.add(r5)     // Catch:{ Throwable -> 0x00fb }
                java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r15 = r15.f125434b     // Catch:{ Throwable -> 0x00fb }
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x00fb }
                r15.add(r0)     // Catch:{ Throwable -> 0x00fb }
            L_0x00fb:
                d.x r15 = p2628d.C52860x.f131107a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.network.observer.C50096c.C50098a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    private C50096c() {
    }

    /* renamed from: a */
    private static long m108051a() {
        return f125486c.incrementAndGet();
    }

    static {
        NetechoConfig.INSTANCE.setLoadLibrary(C500971.f125487a);
    }

    /* renamed from: a */
    public static void m108053a(long j) {
        C50090b bVar = (C50090b) f125484a.get(Long.valueOf(j));
        if (bVar != null) {
            bVar.mo97854a();
            f125484a.remove(Long.valueOf(j));
        }
        C50099d.m108055a(j);
    }

    /* renamed from: a */
    public final long mo97879a(DetectorParam detectorParam, C50094c cVar, C52682m<? super C50088b, ? super HashMap<String, HashMap<String, Object>>, C52860x> mVar, C52671b<? super HashMap<String, Object>, C52860x> bVar) {
        C52711k.m112240b(detectorParam, "netParam");
        C52711k.m112240b(cVar, "localParam");
        C52711k.m112240b(mVar, "callback");
        C52711k.m112240b(bVar, "callback2");
        long a = m108051a();
        f125484a.put(Long.valueOf(a), m108052a(a, detectorParam, cVar, mVar, bVar));
        return a;
    }

    /* renamed from: a */
    private static C50090b m108052a(long j, DetectorParam detectorParam, C50094c cVar, C52682m<? super C50088b, ? super HashMap<String, HashMap<String, Object>>, C52860x> mVar, C52671b<? super HashMap<String, Object>, C52860x> bVar) {
        C50090b bVar2 = new C50090b();
        long startTimeout = (long) detectorParam.getStartTimeout();
        C50098a aVar = new C50098a(j, detectorParam, cVar, mVar, bVar);
        bVar2.mo97855a(startTimeout, aVar);
        return bVar2;
    }
}
