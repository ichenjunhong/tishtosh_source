package com.bytedance.frameworks.baselib.network.p567b;

/* renamed from: com.bytedance.frameworks.baselib.network.b.f */
public class C9827f implements C9823d {

    /* renamed from: a */
    private static volatile boolean f26725a = true;

    /* renamed from: b */
    private static volatile C9828g f26726b;

    /* renamed from: c */
    private static volatile C9827f f26727c;

    public C9827f() {
        this(8, 8);
    }

    /* renamed from: b */
    public static C9827f m19663b() {
        if (f26727c == null) {
            synchronized (C9827f.class) {
                if (f26727c == null) {
                    f26727c = new C9827f();
                }
            }
        }
        return f26727c;
    }

    /* renamed from: a */
    public static synchronized C9828g m19661a() {
        C9828g gVar;
        synchronized (C9827f.class) {
            if (f26726b == null) {
                f26726b = C9828g.m19666a().mo17671a(8, 8).mo17675b(8, 8).mo17672a(30).mo17677c(10).mo17676b(10).mo17673a(true).mo17674a();
            }
            gVar = f26726b;
        }
        return gVar;
    }

    /* renamed from: a */
    public static synchronized void m19662a(boolean z) {
        synchronized (C9827f.class) {
            f26725a = z;
            if (f26726b != null) {
                f26726b.f26737j = f26725a;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17664a(com.bytedance.frameworks.baselib.network.p567b.C9820b r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.bytedance.frameworks.baselib.network.b.e r0 = com.bytedance.frameworks.baselib.network.p567b.C9824e.f26716b     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x0046
            boolean r1 = r7.mo17663c()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0046
        L_0x000c:
            int r1 = com.bytedance.frameworks.baselib.network.p567b.C9824e.m19656a()     // Catch:{ all -> 0x0048 }
            r7.mo17658a(r1)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.b.c$a r1 = r7.mo17659a()     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.b.c$a r2 = com.bytedance.frameworks.baselib.network.p567b.C9821c.C9822a.IMMEDIATE     // Catch:{ all -> 0x0048 }
            if (r1 != r2) goto L_0x0024
            java.util.concurrent.ExecutorService r0 = r0.mo17666b()     // Catch:{ all -> 0x0048 }
            r0.execute(r7)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x0024:
            int r1 = r7.f26713e     // Catch:{ all -> 0x0048 }
            long r1 = (long) r1     // Catch:{ all -> 0x0048 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003d
            android.os.Message r3 = android.os.Message.obtain()     // Catch:{ all -> 0x0048 }
            r4 = 1
            r3.what = r4     // Catch:{ all -> 0x0048 }
            r3.obj = r7     // Catch:{ all -> 0x0048 }
            com.bytedance.common.utility.b.g r7 = r0.f26718a     // Catch:{ all -> 0x0048 }
            r7.sendMessageDelayed(r3, r1)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x003d:
            java.util.concurrent.ExecutorService r0 = r0.mo17668d()     // Catch:{ all -> 0x0048 }
            r0.execute(r7)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x0046:
            monitor-exit(r6)
            return
        L_0x0048:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.p567b.C9827f.mo17664a(com.bytedance.frameworks.baselib.network.b.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17665b(com.bytedance.frameworks.baselib.network.p567b.C9820b r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.bytedance.frameworks.baselib.network.b.e r0 = com.bytedance.frameworks.baselib.network.p567b.C9824e.f26716b     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x0046
            boolean r1 = r7.mo17663c()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0046
        L_0x000c:
            int r1 = com.bytedance.frameworks.baselib.network.p567b.C9824e.m19656a()     // Catch:{ all -> 0x0048 }
            r7.mo17658a(r1)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.b.c$a r1 = r7.mo17659a()     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.b.c$a r2 = com.bytedance.frameworks.baselib.network.p567b.C9821c.C9822a.IMMEDIATE     // Catch:{ all -> 0x0048 }
            if (r1 != r2) goto L_0x0024
            java.util.concurrent.ExecutorService r0 = r0.mo17666b()     // Catch:{ all -> 0x0048 }
            r0.execute(r7)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x0024:
            int r1 = r7.f26713e     // Catch:{ all -> 0x0048 }
            long r1 = (long) r1     // Catch:{ all -> 0x0048 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003d
            android.os.Message r3 = android.os.Message.obtain()     // Catch:{ all -> 0x0048 }
            r4 = 0
            r3.what = r4     // Catch:{ all -> 0x0048 }
            r3.obj = r7     // Catch:{ all -> 0x0048 }
            com.bytedance.common.utility.b.g r7 = r0.f26718a     // Catch:{ all -> 0x0048 }
            r7.sendMessageDelayed(r3, r1)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x003d:
            java.util.concurrent.ExecutorService r0 = r0.mo17667c()     // Catch:{ all -> 0x0048 }
            r0.execute(r7)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x0046:
            monitor-exit(r6)
            return
        L_0x0048:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.p567b.C9827f.mo17665b(com.bytedance.frameworks.baselib.network.b.b):void");
    }

    private C9827f(int i, int i2) {
        if (f26726b == null) {
            f26726b = C9828g.m19666a().mo17671a(8, 8).mo17675b(8, 8).mo17672a(30).mo17677c(10).mo17676b(10).mo17673a(true).mo17674a();
        }
    }
}
