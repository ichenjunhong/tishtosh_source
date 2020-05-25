package com.p683ss.android.socialbase.downloader.p1220i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.i.a */
public final class C19939a implements ThreadFactory {

    /* renamed from: a */
    private final String f54796a;

    /* renamed from: b */
    private final AtomicInteger f54797b = new AtomicInteger();

    /* renamed from: c */
    private final boolean f54798c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f54797b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54796a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f54798c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C19939a(String str, boolean z) {
        this.f54796a = str;
        this.f54798c = true;
    }
}
