package p064c.p065a.p072e.p084g;

import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.g.l */
public final class C2097l extends C2073a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final void run() {
        this.f6747b = Thread.currentThread();
        try {
            this.f6746a.run();
            this.f6747b = null;
        } catch (Throwable th) {
            this.f6747b = null;
            lazySet(f6744c);
            C2150a.m6492a(th);
        }
    }

    public C2097l(Runnable runnable) {
        super(runnable);
    }
}
