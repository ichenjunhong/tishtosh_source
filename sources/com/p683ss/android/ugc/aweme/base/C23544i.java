package com.p683ss.android.ugc.aweme.base;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.ugc.aweme.base.i */
final /* synthetic */ class C23544i implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f62667a = new C23544i();

    private C23544i() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
