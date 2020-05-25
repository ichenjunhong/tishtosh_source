package com.bytedance.android.live.core.p230g.p231a;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.live.core.g.a.f */
final /* synthetic */ class C3856f implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f10882a = new C3856f();

    private C3856f() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "image-net-requests-monitor");
    }
}
