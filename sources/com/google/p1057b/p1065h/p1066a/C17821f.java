package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17421k;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.b.h.a.f */
public final class C17821f {

    /* renamed from: a */
    private static final Logger f49585a = Logger.getLogger(C17821f.class.getName());

    /* renamed from: b */
    private C17822a f49586b;

    /* renamed from: c */
    private boolean f49587c;

    /* renamed from: com.google.b.h.a.f$a */
    static final class C17822a {

        /* renamed from: a */
        final Runnable f49588a;

        /* renamed from: b */
        final Executor f49589b;

        /* renamed from: c */
        C17822a f49590c;

        C17822a(Runnable runnable, Executor executor, C17822a aVar) {
            this.f49588a = runnable;
            this.f49589b = executor;
            this.f49590c = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r2 = r1.f49590c;
        r1.f49590c = r0;
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        m43732b(r0.f49588a, r0.f49589b);
        r0 = r0.f49590c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34645a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f49587c     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            r0 = 1
            r4.f49587c = r0     // Catch:{ all -> 0x0029 }
            com.google.b.h.a.f$a r0 = r4.f49586b     // Catch:{ all -> 0x0029 }
            r1 = 0
            r4.f49586b = r1     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            com.google.b.h.a.f$a r2 = r1.f49590c
            r1.f49590c = r0
            r0 = r1
            r1 = r2
            goto L_0x0013
        L_0x001c:
            if (r0 == 0) goto L_0x0028
            java.lang.Runnable r1 = r0.f49588a
            java.util.concurrent.Executor r2 = r0.f49589b
            m43732b(r1, r2)
            com.google.b.h.a.f$a r0 = r0.f49590c
            goto L_0x001c
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1065h.p1066a.C17821f.mo34645a():void");
    }

    /* renamed from: b */
    private static void m43732b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49585a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo34646a(Runnable runnable, Executor executor) {
        C17421k.m42654a(runnable, (Object) "Runnable was null.");
        C17421k.m42654a(executor, (Object) "Executor was null.");
        synchronized (this) {
            if (!this.f49587c) {
                this.f49586b = new C17822a(runnable, executor, this.f49586b);
            } else {
                m43732b(runnable, executor);
            }
        }
    }
}
