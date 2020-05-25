package com.bytedance.jedi.arch;

import com.bytedance.jedi.arch.internal.C11881c;
import com.bytedance.jedi.arch.internal.C11886e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p064c.p065a.C1675ac;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.arch.g */
public final class C11867g {

    /* renamed from: a */
    static C52682m<? super JediViewModel<C11932s>, ? super C11932s, ? extends C11933t<C11932s>> f31451a = C11870c.f31460a;

    /* renamed from: b */
    static C52670a<? extends C1675ac> f31452b = C11871d.f31461a;

    /* renamed from: c */
    public static C52670a<? extends Executor> f31453c = C11868a.f31458a;

    /* renamed from: d */
    public static final C11867g f31454d = new C11867g();

    /* renamed from: e */
    private static boolean f31455e;

    /* renamed from: f */
    private static boolean f31456f;

    /* renamed from: g */
    private static final C52670a<Executor> f31457g = C11869b.f31459a;

    /* renamed from: com.bytedance.jedi.arch.g$a */
    static final class C11868a extends C52712l implements C52670a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11868a f31458a = new C11868a();

        C11868a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ThreadPoolExecutor) C11886e.f31489b.getValue();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$b */
    static final class C11869b extends C52712l implements C52670a<C11886e> {

        /* renamed from: a */
        public static final C11869b f31459a = new C11869b();

        C11869b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C11886e();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$c */
    static final class C11870c extends C52712l implements C52682m<JediViewModel<C11932s>, C11932s, C11881c<C11932s>> {

        /* renamed from: a */
        public static final C11870c f31460a = new C11870c();

        C11870c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11932s sVar = (C11932s) obj2;
            C52711k.m112240b((JediViewModel) obj, "<anonymous parameter 0>");
            C52711k.m112240b(sVar, "state");
            return new C11881c(sVar, (C1675ac) C11867g.f31452b.invoke());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$d */
    static final class C11871d extends C52712l implements C52670a<C1675ac> {

        /* renamed from: a */
        public static final C11871d f31461a = new C11871d();

        C11871d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C1675ac a = C2168a.m6520a((Executor) C11867g.m24219c().invoke());
            C52711k.m112236a((Object) a, "Schedulers.from(storeExecutorFactory())");
            return a;
        }
    }

    private C11867g() {
    }

    /* renamed from: a */
    public static boolean m24217a() {
        return f31455e;
    }

    /* renamed from: b */
    public static boolean m24218b() {
        return f31456f;
    }

    /* renamed from: c */
    public static C52670a<Executor> m24219c() {
        return f31457g;
    }
}
