package p001a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: a.b */
final class C0002b {

    /* renamed from: a */
    static final C0002b f3a = new C0002b();

    /* renamed from: c */
    static final int f4c;

    /* renamed from: d */
    static final int f5d = ((f6e * 2) + 1);

    /* renamed from: e */
    private static final int f6e;

    /* renamed from: b */
    final Executor f7b = new C0004a();

    /* renamed from: a.b$a */
    static class C0004a implements Executor {
        private C0004a() {
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private C0002b() {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6e = availableProcessors;
        f4c = availableProcessors + 1;
    }
}
