package com.google.android.gms.common.util.p1039a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
final class C15510d implements Runnable {

    /* renamed from: a */
    private final Runnable f39982a;

    /* renamed from: b */
    private final int f39983b = 0;

    public C15510d(Runnable runnable, int i) {
        this.f39982a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f39983b);
        this.f39982a.run();
    }
}
