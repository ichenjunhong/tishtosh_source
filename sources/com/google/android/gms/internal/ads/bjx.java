package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class bjx implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f42723a;

    bjx(biw biw, Handler handler) {
        this.f42723a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f42723a.post(runnable);
    }
}
