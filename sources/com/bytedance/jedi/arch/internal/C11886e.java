package com.bytedance.jedi.arch.internal;

import com.bytedance.jedi.arch.C11867g;
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

/* renamed from: com.bytedance.jedi.arch.internal.e */
public final class C11886e implements Executor {

    /* renamed from: a */
    public static final C52668f f31488a = C52732g.m112285a(C11889c.f31495a);

    /* renamed from: b */
    public static final C52668f f31489b = C52732g.m112285a(C11888b.f31494a);

    /* renamed from: c */
    public static final C11887a f31490c = new C11887a(null);

    /* renamed from: d */
    private final LinkedBlockingQueue<Runnable> f31491d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private Runnable f31492e;

    /* renamed from: com.bytedance.jedi.arch.internal.e$a */
    public static final class C11887a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f31493a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11887a.class), "WORKER", "getWORKER()Ljava/util/concurrent/Executor;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11887a.class), "UNBOUND_EXECUTOR", "getUNBOUND_EXECUTOR$arch_release()Ljava/util/concurrent/ThreadPoolExecutor;"))};

        private C11887a() {
        }

        /* renamed from: a */
        public static int m24243a() {
            return (Runtime.getRuntime().availableProcessors() * 2) + 1;
        }

        public /* synthetic */ C11887a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$b */
    static final class C11888b extends C52712l implements C52670a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11888b f31494a = new C11888b();

        C11888b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C11887a.m24243a(), C11887a.m24243a(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C11877a());
            return threadPoolExecutor;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$c */
    static final class C11889c extends C52712l implements C52670a<Executor> {

        /* renamed from: a */
        public static final C11889c f31495a = new C11889c();

        C11889c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return (Executor) C11867g.f31453c.invoke();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$d */
    static final class C11890d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11886e f31496a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31497b;

        C11890d(C11886e eVar, Runnable runnable) {
            this.f31496a = eVar;
            this.f31497b = runnable;
        }

        public final void run() {
            try {
                this.f31497b.run();
            } finally {
                this.f31496a.mo22622a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo22622a() {
        Runnable runnable = (Runnable) this.f31491d.poll();
        if (runnable != null) {
            ((Executor) f31488a.getValue()).execute(runnable);
        } else {
            runnable = null;
        }
        this.f31492e = runnable;
    }

    public final synchronized void execute(Runnable runnable) {
        C52711k.m112240b(runnable, "r");
        this.f31491d.offer(new C11890d(this, runnable));
        if (this.f31492e == null) {
            mo22622a();
        }
    }
}
