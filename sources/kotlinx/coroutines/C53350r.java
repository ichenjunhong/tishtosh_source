package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;
import p2628d.p2650m.C52830p;

/* renamed from: kotlinx.coroutines.r */
public final class C53350r extends C53255bd {

    /* renamed from: b */
    public static final C53350r f131982b = new C53350r();

    /* renamed from: c */
    private static final int f131983c;

    /* renamed from: d */
    private static boolean f131984d;
    private static volatile Executor pool;

    /* renamed from: kotlinx.coroutines.r$a */
    static final class C53351a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f131985a;

        C53351a(AtomicInteger atomicInteger) {
            this.f131985a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("CommonPool-worker-");
            sb.append(this.f131985a.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: kotlinx.coroutines.r$b */
    static final class C53352b implements Runnable {

        /* renamed from: a */
        public static final C53352b f131986a = new C53352b();

        C53352b() {
        }

        public final void run() {
        }
    }

    private C53350r() {
    }

    public final String toString() {
        return "CommonPool";
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* renamed from: c */
    private final ExecutorService m113417c() {
        ExecutorService a = C53353s.m113420a(m113414a(), new C53351a(new AtomicInteger()));
        C52711k.m112236a((Object) a, "Executors.newFixedThread…Daemon = true }\n        }");
        return a;
    }

    /* renamed from: d */
    private final synchronized Executor m113418d() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            ExecutorService b = m113416b();
            pool = b;
            executor = b;
        }
        return executor;
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer c = C52830p.m112395c(str);
            if (c == null || c.intValue() <= 0) {
                StringBuilder sb = new StringBuilder("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            i = c.intValue();
        }
        f131983c = i;
    }

    /* renamed from: a */
    private static int m113414a() {
        boolean z;
        Integer valueOf = Integer.valueOf(f131983c);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return C52753d.m112321c(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: b */
    private final ExecutorService m113416b() {
        Class cls;
        ExecutorService executorService;
        Object obj;
        if (System.getSecurityManager() != null) {
            return m113417c();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m113417c();
        }
        if (!f131984d && f131983c < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                if (method != null) {
                    obj = method.invoke(null, new Object[0]);
                } else {
                    obj = null;
                }
                if (!(obj instanceof ExecutorService)) {
                    obj = null;
                }
                executorService = (ExecutorService) obj;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f131982b.m113415a(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(m113414a())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return m113417c();
    }

    /* renamed from: a */
    private boolean m113415a(Class<?> cls, ExecutorService executorService) {
        Integer num;
        C52711k.m112240b(cls, "fjpClass");
        C52711k.m112240b(executorService, "executor");
        executorService.submit(C53352b.f131986a);
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
            num = null;
        }
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m113418d();
            }
            executor.execute(C53293ci.m113275a().mo110776a(runnable));
        } catch (RejectedExecutionException unused) {
            C53204aj.f131779b.mo110846a(runnable);
        }
    }
}
