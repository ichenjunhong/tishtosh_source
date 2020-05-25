package com.p683ss.android.ugc.aweme.account.base;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.account.base.a */
public final class C20916a implements Executor {

    /* renamed from: a */
    public static final C20916a f56902a = new C20916a();

    /* renamed from: b */
    private final Handler f56903b = new Handler(Looper.getMainLooper());

    private C20916a() {
    }

    public final void execute(Runnable runnable) {
        this.f56903b.post(runnable);
    }
}
