package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class agh implements Executor {
    agh() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
