package com.google.android.gms.common.util.p1039a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p1043d.C16482d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public final class C15507a implements Executor {

    /* renamed from: a */
    private final Handler f39974a;

    public C15507a(Looper looper) {
        this.f39974a = new C16482d(looper);
    }

    public final void execute(Runnable runnable) {
        this.f39974a.post(runnable);
    }
}
