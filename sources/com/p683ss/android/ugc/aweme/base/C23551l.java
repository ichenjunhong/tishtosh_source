package com.p683ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.base.l */
public final class C23551l implements Executor {

    /* renamed from: a */
    public static final C23551l f62672a = new C23551l();

    /* renamed from: b */
    private final Handler f62673b = new Handler(Looper.getMainLooper());

    private C23551l() {
    }

    public final void execute(Runnable runnable) {
        this.f62673b.post(runnable);
    }

    /* renamed from: a */
    public final void mo48719a(Runnable runnable, long j) {
        this.f62673b.postDelayed(runnable, 500);
    }
}
