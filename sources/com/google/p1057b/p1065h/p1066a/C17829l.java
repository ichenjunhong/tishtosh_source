package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17421k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.b.h.a.l */
abstract class C17829l<V> extends C17823g<V> {

    /* renamed from: a */
    private static final Logger f49593a = Logger.getLogger(C17829l.class.getName());

    /* renamed from: com.google.b.h.a.l$a */
    static final class C17830a<V> extends C17813h<V> {
        C17830a(Throwable th) {
            mo34623a(th);
        }
    }

    /* renamed from: com.google.b.h.a.l$b */
    static class C17831b<V> extends C17829l<V> {

        /* renamed from: a */
        static final C17831b<Object> f49594a = new C17831b<>(null);

        /* renamed from: b */
        private final V f49595b;

        public final V get() {
            return this.f49595b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            sb.append(this.f49595b);
            sb.append("]]");
            return sb.toString();
        }

        C17831b(V v) {
            this.f49595b = v;
        }
    }

    C17829l() {
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        C17421k.m42653a(timeUnit);
        return get();
    }

    /* renamed from: a */
    public final void mo6039a(Runnable runnable, Executor executor) {
        C17421k.m42654a(runnable, (Object) "Runnable was null.");
        C17421k.m42654a(executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49593a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }
}
