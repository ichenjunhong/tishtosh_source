package com.p683ss.android.ugc.aweme.utils;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.utils.w */
final /* synthetic */ class C47958w implements Callable {

    /* renamed from: a */
    private final Runnable f120568a;

    /* renamed from: b */
    private final String f120569b;

    C47958w(Runnable runnable, String str) {
        this.f120568a = runnable;
        this.f120569b = str;
    }

    public final Object call() {
        Runnable runnable = this.f120568a;
        String str = this.f120569b;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
