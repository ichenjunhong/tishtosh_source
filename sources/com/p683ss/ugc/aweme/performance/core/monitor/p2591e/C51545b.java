package com.p683ss.ugc.aweme.performance.core.monitor.p2591e;

import java.util.concurrent.ScheduledExecutorService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.e.b */
public final class C51545b implements C51544a {

    /* renamed from: a */
    public static C51544a f128761a;

    /* renamed from: b */
    public static final C51545b f128762b = new C51545b();

    /* renamed from: c */
    private static ScheduledExecutorService f128763c;

    private C51545b() {
    }

    /* renamed from: a */
    public final void mo39173a(Runnable runnable) {
        C52711k.m112240b(runnable, "runnable");
        C51544a aVar = f128761a;
        if (aVar != null) {
            aVar.mo39173a(runnable);
            return;
        }
        if (f128763c == null) {
            f128763c = C51546c.m110673a(4);
        }
        ScheduledExecutorService scheduledExecutorService = f128763c;
        if (scheduledExecutorService == null) {
            C52711k.m112234a();
        }
        scheduledExecutorService.submit(runnable);
    }
}
