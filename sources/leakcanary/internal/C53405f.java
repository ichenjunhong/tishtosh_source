package leakcanary.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.f */
public final class C53405f<T> {

    /* renamed from: a */
    final AtomicReference<T> f132077a = new AtomicReference<>();

    /* renamed from: b */
    final CountDownLatch f132078b = new CountDownLatch(1);

    /* renamed from: a */
    public final void mo111031a(T t) {
        this.f132077a.set(t);
        this.f132078b.countDown();
    }

    /* renamed from: a */
    public final boolean mo111032a(long j, TimeUnit timeUnit) {
        C52711k.m112240b(timeUnit, "unit");
        try {
            return this.f132078b.await(5, timeUnit);
        } catch (InterruptedException e) {
            throw new RuntimeException("Did not expect thread to be interrupted", e);
        }
    }
}
