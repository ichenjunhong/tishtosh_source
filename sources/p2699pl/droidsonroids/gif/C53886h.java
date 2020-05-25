package p2699pl.droidsonroids.gif;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: pl.droidsonroids.gif.h */
abstract class C53886h implements Runnable {

    /* renamed from: c */
    final C53874a f133519c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo113942a();

    public final void run() {
        try {
            if (!this.f133519c.f133497f.mo113898m()) {
                mo113942a();
            }
        } catch (Throwable th) {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    C53886h(C53874a aVar) {
        this.f133519c = aVar;
    }
}
