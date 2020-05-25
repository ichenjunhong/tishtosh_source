package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.al */
public final class C53206al implements C53292ch {

    /* renamed from: a */
    public static final C53206al f131782a = new C53206al();

    private C53206al() {
    }

    /* renamed from: a */
    public final Runnable mo110776a(Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        return runnable;
    }

    /* renamed from: a */
    public final long mo110775a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public final void mo110778a(Thread thread) {
        C52711k.m112240b(thread, "thread");
        LockSupport.unpark(thread);
    }

    /* renamed from: a */
    public final void mo110777a(Object obj, long j) {
        C52711k.m112240b(obj, "blocker");
        LockSupport.parkNanos(obj, j);
    }
}
