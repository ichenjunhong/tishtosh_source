package p064c.p065a.p072e.p087j;

import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1674ab;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.j.i */
public final class C2133i {
    /* renamed from: a */
    public static void m6426a(C1674ab<?> abVar, AtomicInteger atomicInteger, C2126c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = cVar.terminate();
            if (terminate != null) {
                abVar.onError(terminate);
                return;
            }
            abVar.onComplete();
        }
    }

    /* renamed from: a */
    public static void m6425a(C1674ab<?> abVar, Throwable th, AtomicInteger atomicInteger, C2126c cVar) {
        if (!cVar.addThrowable(th)) {
            C2150a.m6492a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            abVar.onError(cVar.terminate());
        }
    }

    /* renamed from: a */
    public static <T> void m6424a(C1674ab<? super T> abVar, T t, AtomicInteger atomicInteger, C2126c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            abVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = cVar.terminate();
                if (terminate != null) {
                    abVar.onError(terminate);
                    return;
                }
                abVar.onComplete();
            }
        }
    }
}
