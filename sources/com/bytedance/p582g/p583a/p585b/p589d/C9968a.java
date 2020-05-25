package com.bytedance.p582g.p583a.p585b.p589d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.g.a.b.d.a */
public final class C9968a {

    /* renamed from: c */
    public static long f27086c = 30000;

    /* renamed from: a */
    public C9972b f27087a;

    /* renamed from: b */
    public volatile boolean f27088b;

    /* renamed from: d */
    CopyOnWriteArraySet<C9971b> f27089d;

    /* renamed from: e */
    private final Runnable f27090e;

    /* renamed from: com.bytedance.g.a.b.d.a$a */
    static final class C9970a {

        /* renamed from: a */
        static final C9968a f27092a = new C9968a();
    }

    /* renamed from: com.bytedance.g.a.b.d.a$b */
    public interface C9971b {
        /* renamed from: a */
        void mo17920a(long j);
    }

    /* renamed from: a */
    public static C9968a m20054a() {
        return C9970a.f27092a;
    }

    private C9968a() {
        this.f27088b = true;
        this.f27090e = new Runnable() {
            public final void run() {
                try {
                    Iterator it = C9968a.this.f27089d.iterator();
                    while (it.hasNext()) {
                        ((C9971b) it.next()).mo17920a(System.currentTimeMillis());
                    }
                    if (C9968a.this.f27088b) {
                        C9968a.this.f27087a.mo17945a((Runnable) this, C9968a.f27086c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f27089d = new CopyOnWriteArraySet<>();
        this.f27087a = new C9972b("AsyncEventManager-Thread");
        this.f27087a.f27095a.start();
    }

    /* renamed from: a */
    public final void mo17940a(Runnable runnable) {
        C9972b bVar = this.f27087a;
        bVar.mo17944a(bVar.mo17943a(runnable), 0);
    }

    /* renamed from: a */
    public final void mo17939a(C9971b bVar) {
        try {
            this.f27089d.add(bVar);
            if (this.f27088b) {
                this.f27087a.mo17946b(this.f27090e);
                this.f27087a.mo17945a(this.f27090e, f27086c);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo17941a(Runnable runnable, long j) {
        this.f27087a.mo17945a(runnable, 5000);
    }
}
