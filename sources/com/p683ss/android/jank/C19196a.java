package com.p683ss.android.jank;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51544a;
import java.util.concurrent.ExecutorService;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.jank.a */
public final class C19196a implements C51544a {

    /* renamed from: a */
    public static final C19196a f52896a = new C19196a();

    /* renamed from: b */
    private static volatile ExecutorService f52897b;

    private C19196a() {
    }

    /* renamed from: a */
    private ExecutorService m46787a() {
        if (f52897b == null) {
            synchronized (this) {
                if (f52897b == null) {
                    ExecutorService a = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("satan").mo49847a());
                    if (a != null) {
                        f52897b = a;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
                    }
                }
            }
        }
        return f52897b;
    }

    /* renamed from: a */
    public final void mo39173a(Runnable runnable) {
        C52711k.m112240b(runnable, "runnable");
        ExecutorService a = m46787a();
        if (a == null) {
            C52711k.m112234a();
        }
        a.submit(runnable);
    }
}
