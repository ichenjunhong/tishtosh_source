package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17413h;
import com.google.p1057b.p1058a.C17421k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.b.h.a.i */
public final class C17825i extends C17828k {

    /* renamed from: com.google.b.h.a.i$a */
    static final class C17826a<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f49591a;

        /* renamed from: b */
        final C17824h<? super V> f49592b;

        public final String toString() {
            return C17413h.m42637a(this).mo33740a(this.f49592b).toString();
        }

        public final void run() {
            try {
                this.f49592b.onSuccess(C17825i.m43738a(this.f49591a));
            } catch (ExecutionException e) {
                this.f49592b.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f49592b.onFailure(e2);
            }
        }

        C17826a(Future<V> future, C17824h<? super V> hVar) {
            this.f49591a = future;
            this.f49592b = hVar;
        }
    }

    /* renamed from: a */
    public static <V> C17832m<V> m43736a(V v) {
        if (v == null) {
            return C17831b.f49594a;
        }
        return new C17831b(v);
    }

    /* renamed from: a */
    public static <V> C17832m<V> m43737a(Throwable th) {
        C17421k.m42653a(th);
        return new C17830a(th);
    }

    /* renamed from: a */
    public static <V> V m43738a(Future<V> future) throws ExecutionException {
        C17421k.m42669b(future.isDone(), "Future was expected to be done: %s", future);
        return C17839q.m43748a(future);
    }

    /* renamed from: a */
    public static <V> void m43739a(C17832m<V> mVar, C17824h<? super V> hVar) {
        m43740a(mVar, hVar, C17833n.m43743a());
    }

    /* renamed from: a */
    public static <V> void m43740a(C17832m<V> mVar, C17824h<? super V> hVar, Executor executor) {
        C17421k.m42653a(hVar);
        mVar.mo6039a(new C17826a(mVar, hVar), executor);
    }

    /* renamed from: a */
    public static <V, X extends Throwable> C17832m<V> m43735a(C17832m<? extends V> mVar, Class<X> cls, C17819d<? super X, ? extends V> dVar, Executor executor) {
        C17802a aVar = new C17802a(mVar, cls, dVar);
        mVar.mo6039a(aVar, C17833n.m43744a(executor, aVar));
        return aVar;
    }
}
