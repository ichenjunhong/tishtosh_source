package p064c.p065a.p072e.p084g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.a.e.g.o */
public final class C2100o {

    /* renamed from: a */
    public static final boolean f6820a;

    /* renamed from: b */
    public static final int f6821b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f6822c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f6823d = new ConcurrentHashMap();

    /* renamed from: c.a.e.g.o$a */
    static final class C2101a {

        /* renamed from: a */
        boolean f6824a;

        /* renamed from: b */
        int f6825b;

        C2101a() {
        }
    }

    /* renamed from: c.a.e.g.o$b */
    static final class C2102b implements Runnable {
        C2102b() {
        }

        public final void run() {
            Iterator it = new ArrayList(C2100o.f6823d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C2100o.f6823d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6386a() {
        if (f6820a) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f6822c.get();
                if (scheduledExecutorService != null) {
                    break;
                }
                ScheduledExecutorService a = C2103p.m6388a(1, new C2095k("RxSchedulerPurge"));
                if (f6822c.compareAndSet(scheduledExecutorService, a)) {
                    a.scheduleAtFixedRate(new C2102b(), (long) f6821b, (long) f6821b, TimeUnit.SECONDS);
                    return;
                }
                a.shutdownNow();
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C2101a aVar = new C2101a();
        if (properties.containsKey("rx2.purge-enabled")) {
            aVar.f6824a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            aVar.f6824a = true;
        }
        if (aVar.f6824a && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                aVar.f6825b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
            }
            f6820a = aVar.f6824a;
            f6821b = aVar.f6825b;
            m6386a();
        }
        aVar.f6825b = 1;
        f6820a = aVar.f6824a;
        f6821b = aVar.f6825b;
        m6386a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m6385a(ThreadFactory threadFactory) {
        ScheduledExecutorService a = C2103p.m6388a(1, threadFactory);
        m6387a(f6820a, a);
        return a;
    }

    /* renamed from: a */
    private static void m6387a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f6823d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
