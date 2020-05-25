package com.p683ss.android.ugc.aweme.utils;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.utils.y */
final /* synthetic */ class C47960y implements Callable {

    /* renamed from: a */
    private final Runnable f120571a;

    /* renamed from: b */
    private final String f120572b;

    C47960y(Runnable runnable, String str) {
        this.f120571a = runnable;
        this.f120572b = str;
    }

    public final Object call() {
        Runnable runnable = this.f120571a;
        String str = this.f120572b;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
