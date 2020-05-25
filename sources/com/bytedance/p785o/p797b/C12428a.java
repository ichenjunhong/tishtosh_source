package com.bytedance.p785o.p797b;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.o.b.a */
public final class C12428a implements ThreadFactory {

    /* renamed from: a */
    final C12445h f32680a;

    /* renamed from: b */
    private final String f32681b;

    /* renamed from: c */
    private int f32682c;

    public final synchronized Thread newThread(Runnable runnable) {
        C124291 r0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32681b);
        sb.append("-thread-");
        sb.append(this.f32682c);
        r0 = new Thread(runnable, sb.toString()) {
            public final void run() {
                Process.setThreadPriority(10);
                if (C12428a.this.f32680a != null) {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        C12428a.this.f32680a.mo23493a(th);
                    }
                } else {
                    super.run();
                }
            }
        };
        this.f32682c++;
        return r0;
    }

    C12428a(String str, C12445h hVar) {
        this.f32681b = str;
        this.f32680a = hVar;
    }
}
