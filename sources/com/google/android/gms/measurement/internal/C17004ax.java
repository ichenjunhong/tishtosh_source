package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.ax */
final class C17004ax extends Thread {

    /* renamed from: a */
    private final Object f47951a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C17003aw<?>> f47952b;

    /* renamed from: c */
    private final /* synthetic */ C17000at f47953c;

    public C17004ax(C17000at atVar, String str, BlockingQueue<C17003aw<?>> blockingQueue) {
        this.f47953c = atVar;
        C15464q.m32123a(str);
        C15464q.m32123a(blockingQueue);
        this.f47952b = blockingQueue;
        setName(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r1 = r6.f47953c.f47943h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f47953c.f47944i.release();
        r6.f47953c.f47943h.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        if (r6 != r6.f47953c.f47937b) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0084, code lost:
        r6.f47953c.f47937b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r6 != r6.f47953c.f47938c) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0092, code lost:
        r6.f47953c.f47938c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        r6.f47953c.mo32854q().f48445b.mo33376a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.at r1 = r6.f47953c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f47944i     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m41254a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b3 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b3 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r2 = r6.f47952b     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.measurement.internal.aw r2 = (com.google.android.gms.measurement.internal.C17003aw) r2     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f47947a     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b3 }
            r2.run()     // Catch:{ all -> 0x00b3 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f47951a     // Catch:{ all -> 0x00b3 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b3 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r3 = r6.f47952b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b0 }
            if (r3 != 0) goto L_0x0052
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00b0 }
            boolean r3 = r3.f47936a     // Catch:{ all -> 0x00b0 }
            if (r3 != 0) goto L_0x0052
            java.lang.Object r3 = r6.f47951a     // Catch:{ InterruptedException -> 0x004e }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r3 = move-exception
            r6.m41254a(r3)     // Catch:{ all -> 0x00b0 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r2.f47943h     // Catch:{ all -> 0x00b3 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b3 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.aw<?>> r3 = r6.f47952b     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00ad }
            if (r3 != 0) goto L_0x00aa
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.measurement.internal.at r1 = r6.f47953c
            java.lang.Object r1 = r1.f47943h
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.Semaphore r2 = r2.f47944i     // Catch:{ all -> 0x00a7 }
            r2.release()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            java.lang.Object r2 = r2.f47943h     // Catch:{ all -> 0x00a7 }
            r2.notifyAll()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.ax r2 = r2.f47937b     // Catch:{ all -> 0x00a7 }
            if (r6 != r2) goto L_0x008a
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            r2.f47937b = null     // Catch:{ all -> 0x00a7 }
            goto L_0x00a5
        L_0x008a:
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.ax r2 = r2.f47938c     // Catch:{ all -> 0x00a7 }
            if (r6 != r2) goto L_0x0098
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            r2.f47938c = null     // Catch:{ all -> 0x00a7 }
            goto L_0x00a5
        L_0x0098:
            com.google.android.gms.measurement.internal.at r0 = r6.f47953c     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo33376a(r2)     // Catch:{ all -> 0x00a7 }
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r0
        L_0x00aa:
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x001c
        L_0x00ad:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            com.google.android.gms.measurement.internal.at r2 = r6.f47953c
            java.lang.Object r2 = r2.f47943h
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            java.util.concurrent.Semaphore r3 = r3.f47944i     // Catch:{ all -> 0x00f8 }
            r3.release()     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            java.lang.Object r3 = r3.f47943h     // Catch:{ all -> 0x00f8 }
            r3.notifyAll()     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.ax r3 = r3.f47937b     // Catch:{ all -> 0x00f8 }
            if (r6 == r3) goto L_0x00f1
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.ax r3 = r3.f47938c     // Catch:{ all -> 0x00f8 }
            if (r6 != r3) goto L_0x00e3
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            r3.f47938c = null     // Catch:{ all -> 0x00f8 }
            goto L_0x00f6
        L_0x00e3:
            com.google.android.gms.measurement.internal.at r0 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x00f8 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo33376a(r3)     // Catch:{ all -> 0x00f8 }
            goto L_0x00f6
        L_0x00f1:
            com.google.android.gms.measurement.internal.at r3 = r6.f47953c     // Catch:{ all -> 0x00f8 }
            r3.f47937b = null     // Catch:{ all -> 0x00f8 }
        L_0x00f6:
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            throw r1
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17004ax.run():void");
    }

    /* renamed from: a */
    public final void mo32919a() {
        synchronized (this.f47951a) {
            this.f47951a.notifyAll();
        }
    }

    /* renamed from: a */
    private final void m41254a(InterruptedException interruptedException) {
        this.f47953c.mo32854q().f48448e.mo33377a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
