package com.p683ss.android.ugc.aweme.shortvideo;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eg */
final /* synthetic */ class C43780eg implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f110851a = new C43780eg();

    private C43780eg() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("sdk-synthetise");
        return thread;
    }
}
