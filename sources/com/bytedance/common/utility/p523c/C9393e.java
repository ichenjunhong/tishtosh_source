package com.bytedance.common.utility.p523c;

import com.bytedance.common.utility.C9415i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.c.e */
public class C9393e implements Runnable {
    private static ExecutorService CACHED_EXECUTOR = C9389c.m18568a();
    private static ExecutorService FIXED_EXECUTOR = C9389c.m18568a();
    protected static final AtomicInteger sCount = new AtomicInteger();
    private final boolean mBackground;
    private Runnable runnable;

    public static void shutdown() {
    }

    public C9393e() {
        this(false);
    }

    public void run() {
        if (this.runnable != null) {
            this.runnable.run();
        }
    }

    public void start() {
        Runnable runnable2;
        if (C9415i.m18635b()) {
            runnable2 = new Runnable() {
                public final void run() {
                    try {
                        C9393e.this.run();
                    } catch (Exception unused) {
                    }
                }
            };
        } else {
            runnable2 = this;
        }
        if (this.mBackground) {
            FIXED_EXECUTOR.submit(runnable2);
        } else {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public static void setExecutorService(ExecutorService executorService) {
        CACHED_EXECUTOR = executorService;
        FIXED_EXECUTOR = executorService;
    }

    public static void submitRunnable(Runnable runnable2) {
        if (runnable2 != null) {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public C9393e(String str) {
        this(false);
    }

    public C9393e(boolean z) {
        this.mBackground = z;
    }

    public C9393e(Runnable runnable2, String str, boolean z) {
        this.runnable = runnable2;
        this.mBackground = z;
    }
}
