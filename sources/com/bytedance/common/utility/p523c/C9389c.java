package com.bytedance.common.utility.p523c;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.c.c */
public final class C9389c {

    /* renamed from: a */
    public static ExecutorService f25618a;

    /* renamed from: b */
    public static final int f25619b;

    /* renamed from: c */
    public static final int f25620c;

    /* renamed from: d */
    public static final int f25621d;

    /* renamed from: e */
    public static final int f25622e;

    /* renamed from: f */
    public static final int f25623f = Math.max(2, Math.min(f25620c - 1, 3));

    /* renamed from: g */
    public static final int f25624g = ((f25620c * 2) + 1);

    /* renamed from: h */
    private static ExecutorService f25625h;

    /* renamed from: i */
    private static ExecutorService f25626i;

    /* renamed from: j */
    private static ScheduledExecutorService f25627j = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(3).mo49846a((ThreadFactory) f25630m).mo49847a()));

    /* renamed from: k */
    private static final C9391a f25628k = new C9391a("TTDefaultExecutors");

    /* renamed from: l */
    private static final C9391a f25629l = new C9391a("TTCpuExecutors");

    /* renamed from: m */
    private static final C9391a f25630m = new C9391a("TTScheduledExecutors");

    /* renamed from: n */
    private static final C9391a f25631n = new C9391a("TTDownLoadExecutors");

    /* renamed from: o */
    private static final BlockingQueue<Runnable> f25632o = new LinkedBlockingQueue();

    /* renamed from: p */
    private static final BlockingQueue<Runnable> f25633p = new LinkedBlockingQueue();

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f25634q = new LinkedBlockingQueue();

    /* renamed from: r */
    private static final RejectedExecutionHandler f25635r = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    };

    /* renamed from: com.bytedance.common.utility.c.c$a */
    static class C9391a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f25636a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f25637b;

        /* renamed from: c */
        private final AtomicInteger f25638c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f25639d;

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f25637b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25639d);
            sb.append(this.f25638c.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }

        C9391a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f25637b = threadGroup;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(f25636a.getAndIncrement());
            sb.append("-Thread-");
            this.f25639d = sb.toString();
        }
    }

    /* renamed from: a */
    public static ExecutorService m18568a() {
        return f25618a;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m18569b() {
        return f25627j;
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f25619b = availableProcessors;
        if (availableProcessors > 0) {
            i = f25619b;
        } else {
            i = 1;
        }
        f25620c = i;
        int max = Math.max(2, Math.min(f25620c - 1, 6)) * 2;
        f25621d = max;
        f25622e = (max * 2) + 1;
        C9392d dVar = new C9392d(f25621d, f25622e, 30, TimeUnit.SECONDS, f25632o, f25628k, f25635r);
        f25618a = dVar;
        dVar.allowCoreThreadTimeOut(true);
        C9392d dVar2 = new C9392d(f25623f, f25624g, 30, TimeUnit.SECONDS, f25633p, f25629l, f25635r);
        f25625h = dVar2;
        dVar2.allowCoreThreadTimeOut(true);
        C9392d dVar3 = new C9392d(2, 2, 30, TimeUnit.SECONDS, f25634q, f25631n, f25635r);
        f25626i = dVar3;
        dVar3.allowCoreThreadTimeOut(true);
    }
}
