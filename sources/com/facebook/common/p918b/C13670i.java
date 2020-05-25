package com.facebook.common.p918b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.common.b.i */
public final class C13670i extends C13666e {

    /* renamed from: b */
    private static C13670i f35656b;

    private C13670i() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C13670i m27623a() {
        if (f35656b == null) {
            f35656b = new C13670i();
        }
        return f35656b;
    }

    public final void execute(Runnable runnable) {
        boolean z;
        if (Thread.currentThread() == this.f35652a.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
