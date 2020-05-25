package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.Executor;

final class agg implements Executor {

    /* renamed from: a */
    private final Handler f40434a = new abw(Looper.getMainLooper());

    agg() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                acd.m32585a(C14963ax.m30834d().f40166d, th);
                throw th;
            }
        } else {
            this.f40434a.post(runnable);
        }
    }
}
