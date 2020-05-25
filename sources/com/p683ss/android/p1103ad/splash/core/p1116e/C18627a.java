package com.p683ss.android.p1103ad.splash.core.p1116e;

import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ad.splash.core.e.a */
public class C18627a {

    /* renamed from: b */
    private static volatile C18627a f51438b;

    /* renamed from: a */
    public volatile ExecutorService f51439a;

    /* renamed from: a */
    public static C18627a m45126a() {
        if (f51438b == null) {
            synchronized (C18627a.class) {
                if (f51438b == null) {
                    f51438b = new C18627a();
                }
            }
        }
        return f51438b;
    }

    /* renamed from: a */
    public final void mo38030a(ExecutorService executorService) {
        if (executorService != null) {
            this.f51439a = executorService;
        }
    }
}
