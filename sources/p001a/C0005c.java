package p001a;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: a.c */
final class C0005c {

    /* renamed from: a */
    static final C0005c f8a = new C0005c();

    /* renamed from: b */
    final Executor f9b;

    /* renamed from: c */
    private final ExecutorService f10c;

    /* renamed from: d */
    private final ScheduledExecutorService f11d;

    /* renamed from: a.c$a */
    static class C0007a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f12a;

        private C0007a() {
            this.f12a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m2a() {
            Integer num = (Integer) this.f12a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f12a.remove();
            } else {
                this.f12a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public final void execute(Runnable runnable) {
            Integer num = (Integer) this.f12a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f12a.set(Integer.valueOf(intValue));
            if (intValue <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m2a();
                    throw th;
                }
            } else {
                C0005c.m0a().execute(runnable);
            }
            m2a();
        }
    }

    /* renamed from: a */
    public static ExecutorService m0a() {
        return C24076h.m58903d();
    }

    /* renamed from: b */
    static ScheduledExecutorService m1b() {
        return C24076h.m58905f();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0005c() {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0019
        L_0x000d:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
        L_0x0019:
            r1 = 1
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            goto L_0x003d
        L_0x0021:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r3 = p001a.C0002b.f4c
            int r4 = p001a.C0002b.f5d
            r5 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 9
            if (r2 < r3) goto L_0x003d
            r0.allowCoreThreadTimeOut(r1)
        L_0x003d:
            r9.f10c = r0
            com.ss.android.ugc.aweme.bu.p r0 = com.p683ss.android.ugc.aweme.p1468bu.C24093p.SCHEDULED
            com.ss.android.ugc.aweme.bu.m$a r0 = com.p683ss.android.ugc.aweme.p1468bu.C24085m.m58928a(r0)
            com.ss.android.ugc.aweme.bu.m$a r0 = r0.mo49844a(r1)
            com.ss.android.ugc.aweme.bu.m r0 = r0.mo49847a()
            java.util.concurrent.ExecutorService r0 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58898a(r0)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r9.f11d = r0
            a.c$a r0 = new a.c$a
            r1 = 0
            r0.<init>()
            r9.f9b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a.C0005c.<init>():void");
    }
}
