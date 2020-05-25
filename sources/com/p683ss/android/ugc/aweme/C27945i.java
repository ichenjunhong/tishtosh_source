package com.p683ss.android.ugc.aweme;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i */
final /* synthetic */ class C27945i implements Callable {

    /* renamed from: a */
    private final StringBuilder f73364a;

    C27945i(StringBuilder sb) {
        this.f73364a = sb;
    }

    public final Object call() {
        return AccountUserService.lambda$logoutAllBackgroundUser$5$AccountUserService(this.f73364a);
    }
}
