package com.facebook.common.p918b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.a */
public final class C13660a extends AbstractExecutorService {

    /* renamed from: a */
    private static final C13660a f35642a = new C13660a();

    private C13660a() {
    }

    /* renamed from: a */
    public static C13660a m27612a() {
        return f35642a;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
    }

    public final List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
