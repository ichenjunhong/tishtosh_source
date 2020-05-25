package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17421k;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.b.h.a.n */
public final class C17833n {

    /* renamed from: com.google.b.h.a.n$a */
    enum C17836a implements Executor {
        INSTANCE;

        public final String toString() {
            return "MoreExecutors.directExecutor()";
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m43743a() {
        return C17836a.INSTANCE;
    }

    /* renamed from: a */
    public static Executor m43744a(final Executor executor, final C17803b<?> bVar) {
        C17421k.m42653a(executor);
        C17421k.m42653a(bVar);
        if (executor == m43743a()) {
            return executor;
        }
        return new Executor() {

            /* renamed from: a */
            boolean f49596a = true;

            public final void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        public final void run() {
                            C178341.this.f49596a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.f49596a) {
                        bVar.mo34623a((Throwable) e);
                    }
                }
            }
        };
    }
}
