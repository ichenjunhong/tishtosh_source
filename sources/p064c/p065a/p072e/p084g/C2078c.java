package p064c.p065a.p072e.p084g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064c.p065a.p069b.C1690c;

/* renamed from: c.a.e.g.c */
final class C2078c implements Future<Object> {

    /* renamed from: a */
    final C1690c f6762a;

    public final Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    C2078c(C1690c cVar) {
        this.f6762a = cVar;
    }

    public final boolean cancel(boolean z) {
        this.f6762a.dispose();
        return false;
    }
}
