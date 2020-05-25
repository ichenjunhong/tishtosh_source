package leakcanary.internal;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import leakcanary.C53362a;
import leakcanary.C53362a.C53363a;
import leakcanary.C53364b;
import leakcanary.C53372h;
import leakcanary.C53374i;
import leakcanary.internal.C53395a.C53396a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

/* renamed from: leakcanary.internal.k */
public final class C53420k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f132112a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C53420k.class), "isDebuggableBuild", "isDebuggableBuild()Z"))};

    /* renamed from: b */
    public static Application f132113b;

    /* renamed from: c */
    static final Handler f132114c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public static final C53372h f132115d = new C53372h(f132119h, f132120i, C53427g.f132126a);

    /* renamed from: e */
    public static final C53420k f132116e = new C53420k();

    /* renamed from: f */
    private static final C52671b<Application, C52860x> f132117f;

    /* renamed from: g */
    private static final C52668f f132118g = C52732g.m112285a(C53425e.f132124a);

    /* renamed from: h */
    private static final C53423c f132119h = new C53423c();

    /* renamed from: i */
    private static final Executor f132120i = C53422b.f132122a;

    /* renamed from: leakcanary.internal.k$a */
    public static final class C53421a implements C52671b<Application, C52860x>, C53374i {

        /* renamed from: b */
        public static final C53421a f132121b = new C53421a();

        private C53421a() {
        }

        public final void onObjectRetained() {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Application) obj, "application");
            return C52860x.f131107a;
        }
    }

    /* renamed from: leakcanary.internal.k$b */
    static final class C53422b implements Executor {

        /* renamed from: a */
        public static final C53422b f132122a = new C53422b();

        C53422b() {
        }

        public final void execute(Runnable runnable) {
            C53420k kVar = C53420k.f132116e;
            C53420k.f132114c.postDelayed(runnable, C53362a.m113429a().f131997e);
        }
    }

    /* renamed from: leakcanary.internal.k$c */
    public static final class C53423c implements C53364b {
        C53423c() {
        }

        /* renamed from: a */
        public final long mo110953a() {
            return SystemClock.uptimeMillis();
        }
    }

    /* renamed from: leakcanary.internal.k$d */
    static final class C53424d extends C52712l implements C52670a<C53363a> {

        /* renamed from: a */
        public static final C53424d f132123a = new C53424d();

        C53424d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C53362a.m113429a();
        }
    }

    /* renamed from: leakcanary.internal.k$e */
    static final class C53425e extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C53425e f132124a = new C53425e();

        C53425e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            Application application = C53420k.f132113b;
            if (application == null) {
                C52711k.m112237a("application");
            }
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: leakcanary.internal.k$f */
    public static final class C53426f implements InvocationHandler {

        /* renamed from: a */
        public static final C53426f f132125a = new C53426f();

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return C52860x.f131107a;
        }
    }

    /* renamed from: leakcanary.internal.k$g */
    static final class C53427g extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C53427g f132126a = new C53427g();

        C53427g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C53362a.m113429a().f131993a);
        }
    }

    private C53420k() {
    }

    /* renamed from: a */
    public static boolean m113480a() {
        if (f132113b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m113481b() {
        Looper mainLooper = Looper.getMainLooper();
        C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
        if (mainLooper.getThread() != Thread.currentThread()) {
            StringBuilder sb = new StringBuilder("Should be called from the main thread, not ");
            sb.append(Thread.currentThread());
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    static {
        Object obj;
        try {
            Class cls = Class.forName("leakcanary.internal.InternalLeakCanary");
            C52711k.m112236a((Object) cls, "Class.forName(\"leakcanar…rnal.InternalLeakCanary\")");
            obj = cls.getDeclaredField("INSTANCE").get(null);
        } catch (Throwable unused) {
            obj = C53421a.f132121b;
        }
        if (obj != null) {
            f132117f = (C52671b) C52731z.m112265b(obj, 1);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type (android.app.Application) -> kotlin.Unit");
    }

    /* renamed from: a */
    public final void mo111048a(Application application) {
        C52711k.m112240b(application, "application");
        C53173a.m112970a(new C53401d());
        C53174a a = C53173a.m112969a();
        if (a != null) {
            a.mo110681a("Installing AppWatcher");
        }
        m113481b();
        if (f132113b == null) {
            f132113b = application;
            C52670a aVar = C53424d.f132123a;
            C53396a.m113463a(application, f132115d, aVar);
            C53403e.f132074a.mo111023a(application, f132115d, aVar);
            f132117f.invoke(application);
        }
    }
}
