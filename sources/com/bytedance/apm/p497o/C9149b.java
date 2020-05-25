package com.bytedance.apm.p497o;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.o.b */
public final class C9149b {

    /* renamed from: c */
    public static long f25064c = 30000;

    /* renamed from: d */
    public static long f25065d = 30000;

    /* renamed from: a */
    public C9154c f25066a;

    /* renamed from: b */
    public volatile boolean f25067b;

    /* renamed from: e */
    public final Runnable f25068e;

    /* renamed from: f */
    public final Runnable f25069f;

    /* renamed from: g */
    public CopyOnWriteArraySet<C9153b> f25070g;

    /* renamed from: h */
    public CopyOnWriteArraySet<C9153b> f25071h;

    /* renamed from: com.bytedance.apm.o.b$a */
    static final class C9152a {

        /* renamed from: a */
        static final C9149b f25074a = new C9149b();
    }

    /* renamed from: com.bytedance.apm.o.b$b */
    public interface C9153b {
        /* renamed from: a */
        void mo16358a(long j);
    }

    /* renamed from: a */
    public static C9149b m18170a() {
        return C9152a.f25074a;
    }

    private C9149b() {
        this.f25067b = true;
        this.f25068e = new Runnable() {
            public final void run() {
                Iterator it = C9149b.this.f25070g.iterator();
                while (it.hasNext()) {
                    ((C9153b) it.next()).mo16358a(System.currentTimeMillis());
                }
                if (C9149b.this.f25067b) {
                    C9149b.this.f25066a.mo16530a((Runnable) this, C9149b.f25064c);
                }
            }
        };
        this.f25069f = new Runnable() {
            public final void run() {
                Iterator it = C9149b.this.f25071h.iterator();
                while (it.hasNext()) {
                    ((C9153b) it.next()).mo16358a(System.currentTimeMillis());
                }
                if (C9149b.this.f25067b) {
                    C9149b.this.f25066a.mo16530a((Runnable) this, C9149b.f25065d);
                }
            }
        };
        this.f25070g = new CopyOnWriteArraySet<>();
        this.f25071h = new CopyOnWriteArraySet<>();
        this.f25066a = new C9154c("AsyncEventManager-Thread");
        this.f25066a.mo16528a();
    }

    /* renamed from: b */
    public final void mo16525b(C9153b bVar) {
        try {
            this.f25070g.remove(bVar);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m18171a(long j) {
        f25065d = Math.max(j, 5000);
    }

    /* renamed from: a */
    public final void mo16523a(C9153b bVar) {
        try {
            if (this.f25067b) {
                this.f25070g.add(bVar);
                this.f25066a.mo16531b(this.f25068e);
                this.f25066a.mo16530a(this.f25068e, f25064c);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo16524a(Runnable runnable) {
        if (this.f25067b) {
            this.f25066a.mo16529a(runnable);
        }
    }
}
