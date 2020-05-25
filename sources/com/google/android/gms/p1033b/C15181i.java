package com.google.android.gms.p1033b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.i */
public final class C15181i {

    /* renamed from: a */
    public static final Executor f39203a = new C15182a();

    /* renamed from: b */
    static final Executor f39204b = new C15200y();

    /* renamed from: com.google.android.gms.b.i$a */
    static final class C15182a implements Executor {

        /* renamed from: a */
        private final Handler f39205a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f39205a.post(runnable);
        }
    }
}
