package p064c.p065a.p072e.p084g;

import java.util.concurrent.ThreadFactory;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;

/* renamed from: c.a.e.g.h */
public final class C2092h extends C1675ac {

    /* renamed from: c */
    private static final C2095k f6808c = new C2095k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f6809b;

    public C2092h() {
        this(f6808c);
    }

    /* renamed from: a */
    public final C1678c mo6130a() {
        return new C2093i(this.f6809b);
    }

    private C2092h(ThreadFactory threadFactory) {
        this.f6809b = threadFactory;
    }
}
