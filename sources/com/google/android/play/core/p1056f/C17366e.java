package com.google.android.play.core.p1056f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.f.e */
public final class C17366e {

    /* renamed from: a */
    public static final Executor f48876a = new C17367a();

    /* renamed from: b */
    static final Executor f48877b = new C17377o();

    /* renamed from: com.google.android.play.core.f.e$a */
    static final class C17367a implements Executor {

        /* renamed from: a */
        private final Handler f48878a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f48878a.post(runnable);
        }
    }
}
