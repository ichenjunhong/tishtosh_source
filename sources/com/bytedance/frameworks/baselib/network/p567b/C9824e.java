package com.bytedance.frameworks.baselib.network.p567b;

import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.b.e */
final class C9824e implements C9382a {

    /* renamed from: b */
    static C9824e f26716b = new C9824e();

    /* renamed from: f */
    private static AtomicInteger f26717f = new AtomicInteger();

    /* renamed from: a */
    C9381g f26718a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: c */
    private ThreadPoolExecutor f26719c;

    /* renamed from: d */
    private ThreadPoolExecutor f26720d;

    /* renamed from: e */
    private ThreadPoolExecutor f26721e;

    /* renamed from: com.bytedance.frameworks.baselib.network.b.e$a */
    static class C9825a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f26722a = new AtomicInteger(1);

        /* renamed from: b */
        private String f26723b = "ApiExecutor";

        C9825a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f26723b = str;
            }
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26723b);
            sb.append("#");
            sb.append(this.f26722a.getAndIncrement());
            C98261 r1 = new Thread(runnable, sb.toString()) {
                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            r1.setDaemon(false);
            return r1;
        }
    }

    /* renamed from: a */
    static int m19656a() {
        return f26717f.incrementAndGet();
    }

    /* renamed from: e */
    private static C9828g m19657e() {
        return C9827f.m19661a();
    }

    private C9824e() {
    }

    /* renamed from: b */
    public final synchronized ExecutorService mo17666b() {
        if (this.f26719c == null) {
            this.f26719c = m19657e().f26728a;
            if (this.f26719c == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, m19657e().f26736i, TimeUnit.SECONDS, new SynchronousQueue(), new C9825a("NetImmediate"));
                this.f26719c = threadPoolExecutor;
            }
        }
        return this.f26719c;
    }

    /* renamed from: c */
    public final synchronized ExecutorService mo17667c() {
        if (this.f26720d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m19657e().f26732e, m19657e().f26730c, m19657e().f26734g, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C9825a("NetNormal"));
            this.f26720d = threadPoolExecutor;
            this.f26720d.allowCoreThreadTimeOut(C9827f.m19661a().f26737j);
        }
        return this.f26720d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized ExecutorService mo17668d() {
        if (this.f26721e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m19657e().f26733f, m19657e().f26731d, m19657e().f26735h, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C9825a("NetDownload"));
            this.f26721e = threadPoolExecutor;
            this.f26721e.allowCoreThreadTimeOut(C9827f.m19661a().f26737j);
        }
        return this.f26721e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0029
            java.lang.Object r0 = r2.obj
            boolean r0 = r0 instanceof java.lang.Runnable
            if (r0 != 0) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            int r0 = r2.what     // Catch:{ Throwable -> 0x0028 }
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ Throwable -> 0x0028 }
        L_0x000e:
            goto L_0x0027
        L_0x000f:
            java.util.concurrent.ExecutorService r0 = r1.mo17666b()     // Catch:{ Throwable -> 0x0028 }
            java.lang.Object r2 = r2.obj     // Catch:{ Throwable -> 0x0028 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ Throwable -> 0x0028 }
            r0.execute(r2)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0027
        L_0x001b:
            java.util.concurrent.ExecutorService r0 = r1.mo17667c()     // Catch:{ Throwable -> 0x0028 }
            java.lang.Object r2 = r2.obj     // Catch:{ Throwable -> 0x0028 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ Throwable -> 0x0028 }
            r0.execute(r2)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.p567b.C9824e.handleMsg(android.os.Message):void");
    }
}
