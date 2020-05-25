package com.p683ss.ugc.aweme.performance.p2586a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.p683ss.ugc.aweme.performance.core.monitor.C51526a.C51527a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51529a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51543b;
import com.p683ss.ugc.aweme.performance.mainlooper.monitor.work.SampleJankListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.ugc.aweme.performance.a.b */
public final class C51521b {

    /* renamed from: c */
    public static final String f128689c = f128689c;

    /* renamed from: d */
    public static final String f128690d = ">>>>> Dispatching";

    /* renamed from: e */
    public static final String f128691e = "<<<<< Finished";

    /* renamed from: f */
    public static final String f128692f = f128692f;

    /* renamed from: g */
    public static boolean f128693g;

    /* renamed from: h */
    public static Handler f128694h;

    /* renamed from: i */
    public static long f128695i = 32;

    /* renamed from: j */
    public static Printer f128696j;

    /* renamed from: k */
    public static int f128697k;

    /* renamed from: l */
    public static long f128698l;

    /* renamed from: m */
    public static final C52668f f128699m = C52732g.m112286a(C52757k.SYNCHRONIZED, C51523b.f128706a);

    /* renamed from: n */
    public static final C51522a f128700n = new C51522a(null);

    /* renamed from: o */
    private static HandlerThread f128701o;

    /* renamed from: p */
    private static final C51524c f128702p = new C51524c();

    /* renamed from: a */
    public boolean f128703a;

    /* renamed from: b */
    public List<C51543b> f128704b;

    /* renamed from: com.ss.ugc.aweme.performance.a.b$a */
    public static final class C51522a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f128705a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C51522a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/monitor/JankMonitor;"))};

        private C51522a() {
        }

        /* renamed from: a */
        public static long m110656a() {
            return C51521b.f128695i;
        }

        /* renamed from: b */
        public static C51521b m110657b() {
            return (C51521b) C51521b.f128699m.getValue();
        }

        public /* synthetic */ C51522a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.a.b$b */
    static final class C51523b extends C52712l implements C52670a<C51521b> {

        /* renamed from: a */
        public static final C51523b f128706a = new C51523b();

        C51523b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (C51527a.m110658a().f128715e || !C51527a.m110658a().f128712b) {
                return new C51521b(null);
            }
            throw new RuntimeException("not init , please check!");
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.a.b$c */
    public static final class C51524c implements Printer {

        /* renamed from: a */
        private long f128707a;

        /* renamed from: com.ss.ugc.aweme.performance.a.b$c$a */
        static final class C51525a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52727e f128708a;

            C51525a(C52727e eVar) {
                this.f128708a = eVar;
            }

            public final void run() {
                for (C51543b onJankHappened : C51522a.m110657b().f128704b) {
                    onJankHappened.onJankHappened((String) this.f128708a.element, -1, -1, -1);
                }
            }
        }

        C51524c() {
        }

        public final void println(String str) {
            C52711k.m112240b(str, "x");
            if (!TextUtils.isEmpty(str) && C51522a.m110657b().f128703a) {
                if (C51521b.f128693g) {
                    C52727e eVar = new C52727e();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C51521b.f128692f);
                    sb.append(String.valueOf(C51521b.f128697k));
                    eVar.element = sb.toString();
                    if (C52830p.m112411b(str, C51521b.f128690d, false, 2, null)) {
                        Handler handler = C51521b.f128694h;
                        if (handler != null) {
                            handler.postDelayed(new C51525a(eVar), C51522a.m110656a() * 50);
                        }
                        this.f128707a = System.nanoTime();
                        for (C51543b onMessageArrive : C51522a.m110657b().f128704b) {
                            onMessageArrive.onMessageArrive((String) eVar.element, this.f128707a);
                        }
                    }
                    if (C52830p.m112411b(str, C51521b.f128691e, false, 2, null)) {
                        Handler handler2 = C51521b.f128694h;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        if (this.f128707a != 0) {
                            long nanoTime = System.nanoTime();
                            long j = (nanoTime - this.f128707a) / 1000000;
                            if (j > C51522a.m110656a()) {
                                C51521b.f128698l += j;
                                C51521b.f128697k++;
                                for (C51543b onJankHappened : C51522a.m110657b().f128704b) {
                                    onJankHappened.onJankHappened((String) eVar.element, this.f128707a, nanoTime, j);
                                }
                            }
                            for (C51543b onMessageLeave : C51522a.m110657b().f128704b) {
                                onMessageLeave.onMessageLeave((String) eVar.element, nanoTime);
                            }
                        }
                    }
                }
                if (C51521b.f128696j != null && (!C52711k.m112239a((Object) C51521b.f128696j, (Object) this))) {
                    Printer printer = C51521b.f128696j;
                    if (printer == null) {
                        C52711k.m112234a();
                    }
                    printer.println(str);
                }
            }
        }
    }

    /* renamed from: b */
    private static Printer m110652b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            C52711k.m112236a((Object) declaredField, "printerField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj != null) {
                return (Printer) obj;
            }
            throw new C52857u("null cannot be cast to non-null type android.util.Printer");
        } catch (Exception unused) {
            return null;
        }
    }

    private C51521b() {
        boolean z;
        long j;
        this.f128704b = new ArrayList();
        C51529a aVar = C51527a.m110658a().f128713c;
        if (aVar != null) {
            z = aVar.mo39169d();
        } else {
            z = false;
        }
        f128693g = z;
        C51529a aVar2 = C51527a.m110658a().f128713c;
        if (aVar2 != null) {
            j = aVar2.mo39170e();
        } else {
            j = 100;
        }
        f128695i = j;
        SampleJankListener sampleJankListener = new SampleJankListener();
        C52711k.m112240b(sampleJankListener, "messageListener");
        this.f128704b.add(sampleJankListener);
        sampleJankListener.setThreshold(f128695i);
    }

    /* renamed from: a */
    public final synchronized void mo103702a() {
        if (f128693g) {
            if (!this.f128703a) {
                this.f128703a = true;
                if (f128701o == null) {
                    HandlerThread handlerThread = new HandlerThread(f128689c);
                    f128701o = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = f128701o;
                    if (handlerThread2 == null) {
                        C52711k.m112234a();
                    }
                    f128694h = new Handler(handlerThread2.getLooper());
                }
                for (C51543b threshold : this.f128704b) {
                    threshold.setThreshold(f128695i);
                }
                if (true ^ C52711k.m112239a((Object) f128696j, (Object) m110652b())) {
                    f128696j = m110652b();
                }
                Looper.getMainLooper().setMessageLogging(f128702p);
            }
        }
    }

    public /* synthetic */ C51521b(C52707g gVar) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo103704b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "endPoint"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)     // Catch:{ all -> 0x003e }
            boolean r0 = f128693g     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x000c
            monitor-exit(r3)
            return
        L_0x000c:
            com.ss.ugc.aweme.performance.core.monitor.b.d r0 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.m110665a(r4)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0018
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x003e }
            r0.f128742b = r1     // Catch:{ all -> 0x003e }
        L_0x0018:
            if (r0 == 0) goto L_0x003c
            java.util.List<com.ss.ugc.aweme.performance.core.monitor.d.b> r1 = r3.f128704b     // Catch:{ all -> 0x003e }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003e }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            com.ss.ugc.aweme.performance.core.monitor.d.b r2 = (com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51543b) r2     // Catch:{ all -> 0x003e }
            r2.flush(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0022
        L_0x0032:
            java.lang.String r0 = "endPoint"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.ugc.aweme.performance.core.monitor.b.d> r0 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128719a     // Catch:{ all -> 0x003e }
            r0.remove(r4)     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r3)
            return
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.aweme.performance.p2586a.C51521b.mo103704b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo103703a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "startPoint"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)     // Catch:{ all -> 0x0066 }
            boolean r0 = f128693g     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x000c
            monitor-exit(r3)
            return
        L_0x000c:
            boolean r0 = r3.f128703a     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0013
            r3.mo103702a()     // Catch:{ all -> 0x0066 }
        L_0x0013:
            com.ss.ugc.aweme.performance.core.monitor.b.d r0 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.m110665a(r4)     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0064
            com.ss.ugc.aweme.performance.core.monitor.b.d r0 = new com.ss.ugc.aweme.performance.core.monitor.b.d     // Catch:{ all -> 0x0066 }
            r0.<init>(r4)     // Catch:{ all -> 0x0066 }
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0066 }
            r0.f128741a = r1     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "point"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128720b     // Catch:{ all -> 0x0066 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x004c
            int r1 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128721c     // Catch:{ all -> 0x0066 }
            int r1 = r1 + 1
            com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128721c = r1     // Catch:{ all -> 0x0066 }
            r0.f128743c = r1     // Catch:{ all -> 0x0066 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128720b     // Catch:{ all -> 0x0066 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0066 }
            int r2 = r0.f128743c     // Catch:{ all -> 0x0066 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0066 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0066 }
            goto L_0x005f
        L_0x004c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128720b     // Catch:{ all -> 0x0066 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0057
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x0066 }
        L_0x0057:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x0066 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0066 }
            r0.f128743c = r1     // Catch:{ all -> 0x0066 }
        L_0x005f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.ugc.aweme.performance.core.monitor.b.d> r1 = com.p683ss.ugc.aweme.performance.core.monitor.C51531b.f128719a     // Catch:{ all -> 0x0066 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r3)
            return
        L_0x0066:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.aweme.performance.p2586a.C51521b.mo103703a(java.lang.String):void");
    }
}
