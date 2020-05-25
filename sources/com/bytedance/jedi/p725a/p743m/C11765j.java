package com.bytedance.jedi.p725a.p743m;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.m.j */
public final class C11765j implements Executor {

    /* renamed from: a */
    public static final C52668f f31247a = C52732g.m112285a(C11767b.f31252a);

    /* renamed from: b */
    public static final C11766a f31248b = new C11766a(null);

    /* renamed from: c */
    private final LinkedBlockingQueue<Runnable> f31249c = new LinkedBlockingQueue<>();

    /* renamed from: d */
    private Runnable f31250d;

    /* renamed from: com.bytedance.jedi.a.m.j$a */
    public static final class C11766a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f31251a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11766a.class), "THREAD_POOL_EXECUTOR", "getTHREAD_POOL_EXECUTOR()Ljava/util/concurrent/ThreadPoolExecutor;"))};

        private C11766a() {
        }

        /* renamed from: a */
        public static int m24109a() {
            return (Runtime.getRuntime().availableProcessors() * 2) + 1;
        }

        public /* synthetic */ C11766a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.j$b */
    static final class C11767b extends C52712l implements C52670a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11767b f31252a = new C11767b();

        C11767b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C11766a.m24109a(), C11766a.m24109a(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return threadPoolExecutor;
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.j$c */
    static final class C11768c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11765j f31253a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31254b;

        C11768c(C11765j jVar, Runnable runnable) {
            this.f31253a = jVar;
            this.f31254b = runnable;
        }

        public final void run() {
            try {
                this.f31254b.run();
            } finally {
                this.f31253a.mo22514a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo22514a() {
        Runnable runnable = (Runnable) this.f31249c.poll();
        if (runnable != null) {
            ((ThreadPoolExecutor) f31247a.getValue()).execute(runnable);
        } else {
            runnable = null;
        }
        this.f31250d = runnable;
    }

    public final synchronized void execute(Runnable runnable) {
        C52711k.m112240b(runnable, "r");
        this.f31249c.offer(new C11768c(this, runnable));
        if (this.f31250d == null) {
            mo22514a();
        }
    }
}
