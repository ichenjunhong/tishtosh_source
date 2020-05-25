package androidx.work.impl.utils.p058a;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.a.b */
enum C1645b implements Executor {
    INSTANCE;

    public final String toString() {
        return "DirectExecutor";
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
