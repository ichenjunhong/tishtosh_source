package com.bytedance.jedi.arch.ext.list.p744a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.g */
public final class C11852g implements Executor {

    /* renamed from: a */
    private final Handler f31439a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f31439a.post(runnable);
    }
}
