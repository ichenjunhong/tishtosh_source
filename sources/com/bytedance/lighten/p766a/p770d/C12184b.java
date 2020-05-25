package com.bytedance.lighten.p766a.p770d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.a.d.b */
public final class C12184b implements Executor {

    /* renamed from: a */
    private Handler f32098a = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.lighten.a.d.b$a */
    static class C12185a {

        /* renamed from: a */
        public static final C12184b f32099a = new C12184b();
    }

    /* renamed from: a */
    public static C12184b m24629a() {
        return C12185a.f32099a;
    }

    public final void execute(Runnable runnable) {
        boolean z;
        if (Thread.currentThread() == this.f32098a.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            this.f32098a.post(runnable);
        }
    }
}
