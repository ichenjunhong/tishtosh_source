package com.facebook.common.p918b;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.common.b.c */
public final class C13664c extends C13661b implements C13668g {
    public C13664c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
