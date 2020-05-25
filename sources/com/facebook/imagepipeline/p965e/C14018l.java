package com.facebook.imagepipeline.p965e;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.imagepipeline.e.l */
public final class C14018l implements ThreadFactory {

    /* renamed from: a */
    public final int f36615a = 10;

    /* renamed from: b */
    private final String f36616b;

    /* renamed from: c */
    private final boolean f36617c;

    /* renamed from: d */
    private final AtomicInteger f36618d = new AtomicInteger(1);

    public final Thread newThread(final Runnable runnable) {
        String str;
        C140191 r0 = new Runnable() {
            public final void run() {
                try {
                    Process.setThreadPriority(C14018l.this.f36615a);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.f36617c) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f36616b);
            sb.append("-");
            sb.append(this.f36618d.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.f36616b;
        }
        return new Thread(r0, str);
    }

    public C14018l(int i, String str, boolean z) {
        this.f36616b = str;
        this.f36617c = true;
    }
}
