package com.bytedance.p785o.p797b;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.o.b.b */
public final class C12435b implements ThreadFactory {

    /* renamed from: a */
    final C12445h f32709a;

    /* renamed from: b */
    private final String f32710b;

    /* renamed from: c */
    private int f32711c;

    public final synchronized Thread newThread(Runnable runnable) {
        C124361 r0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32710b);
        sb.append("-thread-");
        sb.append(this.f32711c);
        r0 = new Thread(runnable, sb.toString()) {
            public final void run() {
                if (C12435b.this.f32709a != null) {
                    try {
                        super.run();
                    } catch (Throwable th) {
                        C12435b.this.f32709a.mo23493a(th);
                    }
                } else {
                    super.run();
                }
            }
        };
        this.f32711c++;
        return r0;
    }

    public C12435b(String str, C12445h hVar) {
        this.f32710b = str;
        this.f32709a = hVar;
    }
}
