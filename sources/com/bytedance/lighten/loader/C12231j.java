package com.bytedance.lighten.loader;

import com.facebook.common.p918b.C13661b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.loader.j */
final class C12231j extends C13661b {
    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }

    public C12231j(Executor executor, int i) {
        super("FixSizeSerialExecutor", 1, executor, new C12230i(10));
    }
}
