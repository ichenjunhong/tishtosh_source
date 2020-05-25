package com.p683ss.caijing.globaliap.p2557b;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.caijing.globaliap.b.a */
public class C51223a extends Thread {

    /* renamed from: d */
    private static volatile C51223a f127929d;

    /* renamed from: a */
    public final Queue<C51224b> f127930a = new LinkedList();

    /* renamed from: b */
    public final Queue<C51224b> f127931b = new LinkedList();

    /* renamed from: c */
    public final Lock f127932c = new ReentrantLock();

    /* renamed from: e */
    private int f127933e = 300000;

    /* renamed from: f */
    private volatile long f127934f = -1;

    /* renamed from: g */
    private final Lock f127935g = new ReentrantLock();

    /* renamed from: h */
    private volatile boolean f127936h = false;

    public synchronized void start() {
        if (!isAlive()) {
            super.start();
        }
    }

    private C51223a() {
        setPriority(1);
        setName("cj_bg_thread");
    }

    /* renamed from: a */
    public static C51223a m110135a() {
        if (f127929d == null || f127929d.f127936h) {
            synchronized (C51223a.class) {
                if (f127929d == null || f127929d.f127936h) {
                    f127929d = new C51223a();
                }
            }
        }
        return f127929d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r6.isInterrupted()
            if (r0 != 0) goto L_0x00aa
            monitor-enter(r6)
            long r0 = r6.f127934f     // Catch:{ all -> 0x00a7 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0022
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a7 }
            r6.f127934f = r0     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "run background task for the first time:"
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            long r1 = r6.f127934f     // Catch:{ all -> 0x00a7 }
            r0.append(r1)     // Catch:{ all -> 0x00a7 }
            goto L_0x0049
        L_0x0022:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "last run time:"
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            long r3 = r6.f127934f     // Catch:{ all -> 0x00a7 }
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = ",currentTime:"
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            r2.append(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = ",period:"
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            long r3 = r6.f127934f     // Catch:{ all -> 0x00a7 }
            r5 = 0
            long r3 = r0 - r3
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            r6.f127934f = r0     // Catch:{ all -> 0x00a7 }
        L_0x0049:
            java.util.concurrent.locks.Lock r0 = r6.f127935g     // Catch:{ all -> 0x00a7 }
            r0.lock()     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.locks.Lock r0 = r6.f127932c     // Catch:{ all -> 0x00a7 }
            r0.lock()     // Catch:{ all -> 0x00a7 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r0 = r6.f127930a     // Catch:{ all -> 0x00a7 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r1 = r6.f127931b     // Catch:{ all -> 0x00a7 }
            r0.addAll(r1)     // Catch:{ all -> 0x00a7 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r0 = r6.f127931b     // Catch:{ all -> 0x00a7 }
            r0.clear()     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.locks.Lock r0 = r6.f127932c     // Catch:{ all -> 0x00a7 }
            r0.unlock()     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "current size:"
            r0.<init>(r1)     // Catch:{ all -> 0x00a7 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r1 = r6.f127930a     // Catch:{ all -> 0x00a7 }
            int r1 = r1.size()     // Catch:{ all -> 0x00a7 }
            r0.append(r1)     // Catch:{ all -> 0x00a7 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r0 = r6.f127930a     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0092
            java.util.Queue<com.ss.caijing.globaliap.b.b> r0 = r6.f127930a     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0082:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a7 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x00a7 }
            r1.run()     // Catch:{ all -> 0x00a7 }
            goto L_0x0082
        L_0x0092:
            java.util.concurrent.locks.Lock r0 = r6.f127935g     // Catch:{ all -> 0x00a7 }
            r0.unlock()     // Catch:{ all -> 0x00a7 }
            int r0 = r6.f127933e     // Catch:{ all -> 0x00a7 }
            if (r0 <= 0) goto L_0x00a4
            int r0 = r6.f127933e     // Catch:{ InterruptedException -> 0x00a2 }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00a2 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00a2 }
            goto L_0x00a4
        L_0x00a2:
            monitor-exit(r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x00aa
        L_0x00a4:
            monitor-exit(r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x0000
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a7 }
            throw r0
        L_0x00aa:
            r0 = 1
            r6.f127936h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.p2557b.C51223a.run():void");
    }

    /* renamed from: a */
    public final synchronized C51223a mo101749a(int i) {
        if (i > 300000) {
            this.f127933e = i;
        }
        return this;
    }
}
