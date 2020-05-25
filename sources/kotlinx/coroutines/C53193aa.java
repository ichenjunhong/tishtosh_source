package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import p2628d.p2629a.C52575l;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.aa */
public final class C53193aa {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f131769a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        ServiceLoader load = ServiceLoader.load(cls, cls.getClassLoader());
        C52711k.m112236a((Object) load, "ServiceLoader.load(servi…serviceClass.classLoader)");
        f131769a = C52575l.m112138e((Iterable<? extends T>) load);
    }

    /* renamed from: a */
    public static final void m113019a(C52628e eVar, Throwable th) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(th, "exception");
        for (CoroutineExceptionHandler handleException : f131769a) {
            try {
                handleException.handleException(eVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                C52711k.m112236a((Object) currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C53194ab.m113020a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        C52711k.m112236a((Object) currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
