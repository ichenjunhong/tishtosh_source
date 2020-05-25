package com.p683ss.android.ugc.aweme.p1468bu;

import android.os.Process;
import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.p1468bu.C24088n.C24090a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.bu.e */
final class C24063e implements C24090a {

    /* renamed from: a */
    public static AtomicInteger f63866a = new AtomicInteger(0);

    /* renamed from: b */
    public static ExecutorService f63867b = m58890a(f63874i, C24093p.IO, "tp-reject");

    /* renamed from: c */
    public static ExecutorService f63868c = m58890a(f63873h, C24093p.DEFAULT, "tp-default-reject");

    /* renamed from: d */
    public static long f63869d;

    /* renamed from: e */
    public static long f63870e;

    /* renamed from: f */
    public static final long f63871f = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: g */
    private static final int f63872g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    private static final int f63873h = (f63872g + 1);

    /* renamed from: i */
    private static final int f63874i = (Math.max(2, Math.min(f63872g - 1, 6)) * 2);

    /* renamed from: j */
    private static final int f63875j;

    /* renamed from: k */
    private static final int f63876k;

    /* renamed from: l */
    private static final int f63877l;

    /* renamed from: m */
    private static final int f63878m;

    /* renamed from: n */
    private static RejectedExecutionHandler f63879n = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C24063e.f63867b.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C24063e.f63869d >= C24063e.f63871f) {
                C24063e.f63869d = elapsedRealtime;
                C24070g.m58893a().mo49838a(runnable, threadPoolExecutor);
                return;
            }
            C24063e.f63869d = elapsedRealtime;
        }
    };

    /* renamed from: o */
    private static RejectedExecutionHandler f63880o = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C24063e.f63868c.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C24063e.f63870e >= C24063e.f63871f || C24076h.m58897a().f63918a) {
                C24063e.f63870e = elapsedRealtime;
                C24070g.m58893a().mo49838a(runnable, threadPoolExecutor);
                return;
            }
            C24063e.f63870e = elapsedRealtime;
        }
    };

    C24063e() {
    }

    /* renamed from: a */
    private static ExecutorService m58889a() {
        C24057a aVar = new C24057a(C24093p.IO, 0, f63877l, (long) f63878m, TimeUnit.SECONDS, new SynchronousQueue(), m58891a("tp-io", false, 0), f63879n);
        return aVar;
    }

    static {
        int max = Math.max(2, Math.min(f63872g - 1, 4));
        f63875j = max;
        f63876k = (max * 2) + 1;
        C24060b bVar = C24076h.f63911b;
        if (bVar != null) {
            if (bVar.f63860a > 0) {
                f63877l = bVar.f63860a;
            } else {
                f63877l = 128;
            }
            if (bVar.f63861b >= 0) {
                f63878m = bVar.f63861b;
            } else {
                f63878m = 30;
            }
        } else {
            f63877l = 128;
            f63878m = 30;
        }
    }

    /* renamed from: a */
    public final ExecutorService mo49831a(C24085m mVar) {
        String str;
        long j;
        String str2;
        BlockingQueue linkedBlockingQueue;
        RejectedExecutionHandler abortPolicy;
        String str3;
        BlockingQueue linkedBlockingQueue2;
        RejectedExecutionHandler abortPolicy2;
        C24085m mVar2 = mVar;
        long j2 = 30;
        switch (mVar2.f63932a) {
            case IO:
                return m58889a();
            case DEFAULT:
                long j3 = (long) f63878m;
                long j4 = j3;
                C24057a aVar = new C24057a(C24093p.DEFAULT, f63875j, f63876k, j4, TimeUnit.SECONDS, new LinkedBlockingQueue(128), m58891a("tp-default", false, 0), f63880o);
                aVar.allowCoreThreadTimeOut(true);
                return aVar;
            case BACKGROUND:
                C24057a aVar2 = new C24057a(C24093p.BACKGROUND, 0, 3, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(128), m58891a("tp-background", true, 10), f63880o);
                return aVar2;
            case SCHEDULED:
                if (mVar2.f63933b != null) {
                    str = mVar2.f63933b;
                } else {
                    str = "tp-scheduled";
                }
                ThreadFactory a = m58891a(str, false, 0);
                int i = mVar2.f63934c;
                if (mVar2.f63938g != null) {
                    a = mVar2.f63938g;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, a);
                if (mVar2.f63937f >= 0) {
                    j = mVar2.f63937f;
                } else {
                    j = 15;
                }
                scheduledThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                return scheduledThreadPoolExecutor;
            case SERIAL:
                if (mVar2.f63933b != null) {
                    str2 = mVar2.f63933b;
                } else {
                    str2 = "tp-serial";
                }
                ThreadFactory a2 = m58891a(str2, false, 0);
                C24093p pVar = C24093p.SERIAL;
                if (mVar2.f63937f >= 0) {
                    j2 = mVar2.f63937f;
                }
                long j5 = j2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (mVar2.f63935d != null) {
                    linkedBlockingQueue = mVar2.f63935d;
                } else {
                    linkedBlockingQueue = new LinkedBlockingQueue();
                }
                BlockingQueue blockingQueue = linkedBlockingQueue;
                if (mVar2.f63938g != null) {
                    a2 = mVar2.f63938g;
                }
                ThreadFactory threadFactory = a2;
                if (mVar2.f63936e != null) {
                    abortPolicy = mVar2.f63936e;
                } else {
                    abortPolicy = new AbortPolicy();
                }
                C24057a aVar3 = new C24057a(pVar, 1, 1, j5, timeUnit, blockingQueue, threadFactory, abortPolicy);
                aVar3.allowCoreThreadTimeOut(true);
                return aVar3;
            case FIXED:
                if (mVar2.f63933b != null) {
                    str3 = mVar2.f63933b;
                } else {
                    str3 = "tp-fixed";
                }
                ThreadFactory a3 = m58891a(str3, false, 0);
                C24093p pVar2 = C24093p.FIXED;
                int i2 = mVar2.f63934c;
                int i3 = mVar2.f63934c;
                if (mVar2.f63937f >= 0) {
                    j2 = mVar2.f63937f;
                }
                long j6 = j2;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                if (mVar2.f63935d != null) {
                    linkedBlockingQueue2 = mVar2.f63935d;
                } else {
                    linkedBlockingQueue2 = new LinkedBlockingQueue();
                }
                BlockingQueue blockingQueue2 = linkedBlockingQueue2;
                if (mVar2.f63938g != null) {
                    a3 = mVar2.f63938g;
                }
                ThreadFactory threadFactory2 = a3;
                if (mVar2.f63936e != null) {
                    abortPolicy2 = mVar2.f63936e;
                } else {
                    abortPolicy2 = new AbortPolicy();
                }
                C24057a aVar4 = new C24057a(pVar2, i2, i3, j6, timeUnit2, blockingQueue2, threadFactory2, abortPolicy2);
                aVar4.allowCoreThreadTimeOut(true);
                return aVar4;
            default:
                return m58889a();
        }
    }

    /* renamed from: a */
    private static ThreadFactory m58891a(final String str, final boolean z, final int i) {
        return new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                Thread thread = new Thread(new Runnable() {
                    public final void run() {
                        try {
                            Process.setThreadPriority(i);
                        } catch (Throwable unused) {
                        }
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(C24063e.f63866a.incrementAndGet());
                thread.setName(sb.toString());
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    private static ExecutorService m58890a(int i, C24093p pVar, String str) {
        C24057a aVar = new C24057a(pVar, i, i, (long) f63878m, TimeUnit.SECONDS, new LinkedBlockingQueue(), m58891a(str, false, 0));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }
}
