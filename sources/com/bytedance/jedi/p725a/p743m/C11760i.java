package com.bytedance.jedi.p725a.p743m;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.m.i */
public final class C11760i {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31237a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11760i.class), "CPU_COUNT", "getCPU_COUNT()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11760i.class), "CORE_POOL_SIZE", "getCORE_POOL_SIZE()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11760i.class), "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11760i.class), "defaultScheduler", "getDefaultScheduler()Lio/reactivex/Scheduler;"))};

    /* renamed from: b */
    static final C52668f f31238b = C52732g.m112285a(C11761a.f31243a);

    /* renamed from: c */
    static final C52668f f31239c = C52732g.m112285a(C11763c.f31245a);

    /* renamed from: d */
    public static final C52668f f31240d = C52732g.m112285a(C11764d.f31246a);

    /* renamed from: e */
    public static final C11760i f31241e = new C11760i();

    /* renamed from: f */
    private static final C52668f f31242f = C52732g.m112285a(C11762b.f31244a);

    /* renamed from: com.bytedance.jedi.a.m.i$a */
    static final class C11761a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C11761a f31243a = new C11761a();

        C11761a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(Math.max(2, Math.min(C11760i.f31241e.mo22513a() - 1, 4)));
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.i$b */
    static final class C11762b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C11762b f31244a = new C11762b();

        C11762b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.i$c */
    static final class C11763c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C11763c f31245a = new C11763c();

        C11763c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((C11760i.f31241e.mo22513a() * 2) + 1);
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.i$d */
    static final class C11764d extends C52712l implements C52670a<C1675ac> {

        /* renamed from: a */
        public static final C11764d f31246a = new C11764d();

        C11764d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11760i iVar = C11760i.f31241e;
            int intValue = ((Number) C11760i.f31238b.getValue()).intValue();
            C11760i iVar2 = C11760i.f31241e;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(intValue, ((Number) C11760i.f31239c.getValue()).intValue(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return C2168a.m6520a(threadPoolExecutor);
        }
    }

    private C11760i() {
    }

    /* renamed from: a */
    public final int mo22513a() {
        return ((Number) f31242f.getValue()).intValue();
    }
}
