package p064c.p065a.p072e.p084g;

import java.util.concurrent.Callable;

/* renamed from: c.a.e.g.m */
public final class C2098m extends C2073a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final Void call() throws Exception {
        this.f6747b = Thread.currentThread();
        try {
            this.f6746a.run();
            return null;
        } finally {
            lazySet(f6744c);
            this.f6747b = null;
        }
    }

    public C2098m(Runnable runnable) {
        super(runnable);
    }
}
