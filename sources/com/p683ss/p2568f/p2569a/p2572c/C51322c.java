package com.p683ss.p2568f.p2569a.p2572c;

import com.p683ss.p2568f.p2569a.C51311c;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import com.p683ss.p2568f.p2569a.p2571b.C51309c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.f.a.c.c */
public final class C51322c {

    /* renamed from: a */
    public final ExecutorService f128262a;

    /* renamed from: b */
    public final C51311c f128263b;

    /* renamed from: c */
    public Future f128264c;

    /* renamed from: com.ss.f.a.c.c$a */
    public interface C51325a {
        /* renamed from: a */
        void mo101877a(C51301a aVar);

        /* renamed from: a */
        void mo101878a(C51309c cVar);
    }

    /* renamed from: a */
    public final void mo101875a() {
        if (this.f128264c != null && !this.f128264c.isDone()) {
            this.f128264c.cancel(true);
            this.f128264c = null;
        }
    }

    public C51322c(ExecutorService executorService, C51311c cVar) {
        this.f128262a = executorService;
        this.f128263b = cVar;
    }
}
