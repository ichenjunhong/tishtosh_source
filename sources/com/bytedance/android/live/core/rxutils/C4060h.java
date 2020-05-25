package com.bytedance.android.live.core.rxutils;

import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1912ag;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.core.rxutils.h */
public final class C4060h {

    /* renamed from: a */
    public static final C4060h f11209a = new C4060h();

    private C4060h() {
    }

    /* renamed from: a */
    public final C2201v<Long> mo9418a(long j, TimeUnit timeUnit) {
        C52711k.m112240b(timeUnit, "unit");
        C1675ac a = C2168a.m6519a();
        C52711k.m112236a((Object) a, "Schedulers.computation()");
        return m10176a(300, 300, timeUnit, a);
    }

    /* renamed from: a */
    public final C2201v<Long> mo9417a(long j, long j2, TimeUnit timeUnit) {
        C52711k.m112240b(timeUnit, "unit");
        C1675ac a = C2168a.m6519a();
        C52711k.m112236a((Object) a, "Schedulers.computation()");
        return m10176a(0, 1, timeUnit, a);
    }

    /* renamed from: a */
    private static C2201v<Long> m10176a(long j, long j2, TimeUnit timeUnit, C1675ac acVar) {
        C52711k.m112240b(timeUnit, "unit");
        C52711k.m112240b(acVar, "scheduler");
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        C1912ag agVar = new C1912ag(Math.max(0, j), Math.max(0, j2), timeUnit, acVar);
        C2201v<Long> a = C2150a.m6486a((C2201v<T>) agVar);
        C52711k.m112236a((Object) a, "RxJavaPlugins.onAssembly…eriod), unit, scheduler))");
        return a;
    }
}
