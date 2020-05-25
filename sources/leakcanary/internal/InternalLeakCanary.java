package leakcanary.internal;

import android.app.Application;
import android.content.ComponentName;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicReference;
import leakcanary.C53362a;
import leakcanary.C53365c.C53366a;
import leakcanary.C53369f;
import leakcanary.C53369f.C53370a;
import leakcanary.C53374i;
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
import p2628d.p2648k.C52767h;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

public final class InternalLeakCanary implements C52671b<Application, C52860x>, C53374i {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InternalLeakCanary.class), "leakDirectoryProvider", "getLeakDirectoryProvider()Lleakcanary/internal/LeakDirectoryProvider;"))};
    public static final InternalLeakCanary INSTANCE = new InternalLeakCanary();
    public static Application application;
    /* access modifiers changed from: private */
    public static volatile boolean applicationVisible;
    /* access modifiers changed from: private */
    public static C53406g heapDumpTrigger;
    private static final C52668f leakDirectoryProvider$delegate = C52732g.m112285a(C53385d.f132037a);

    /* renamed from: leakcanary.internal.InternalLeakCanary$a */
    static final class C53382a implements Runnable {

        /* renamed from: a */
        public static final C53382a f132034a = new C53382a();

        C53382a() {
        }

        public final void run() {
            boolean z = false;
            try {
                Class cls = Class.forName("androidx.test.platform.app.InstrumentationRegistry");
                C52711k.m112236a((Object) cls, "Class.forName(\"androidx.…InstrumentationRegistry\")");
                Field declaredField = cls.getDeclaredField("instrumentationRef");
                C52711k.m112236a((Object) declaredField, "registryClass.getDeclare…eld(\"instrumentationRef\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj != null) {
                    if (((AtomicReference) obj).get() != null) {
                        z = true;
                    }
                    if (z) {
                        C53174a a = C53173a.m112969a();
                        if (a != null) {
                            a.mo110681a("Instrumentation test detected, setting LeakCanary.Config.dumpHeap to false");
                        }
                        C53369f.m113442a(C53370a.m113443a(C53369f.m113441a(), false, false, 0, false, 0, false, false, 126, null));
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReference<android.app.Instrumentation>");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$b */
    static final class C53383b extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        public static final C53383b f132035a = new C53383b();

        C53383b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            InternalLeakCanary.applicationVisible = booleanValue;
            C53406g access$getHeapDumpTrigger$p = InternalLeakCanary.access$getHeapDumpTrigger$p(InternalLeakCanary.INSTANCE);
            if (booleanValue) {
                access$getHeapDumpTrigger$p.f132085f = -1;
            } else {
                access$getHeapDumpTrigger$p.f132085f = SystemClock.uptimeMillis();
                access$getHeapDumpTrigger$p.mo111036a("app became invisible", C53362a.m113429a().f131997e);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$c */
    static final class C53384c extends C52712l implements C52670a<C53370a> {

        /* renamed from: a */
        public static final C53384c f132036a = new C53384c();

        C53384c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C53369f.m113441a();
        }
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$d */
    static final class C53385d extends C52712l implements C52670a<C53428l> {

        /* renamed from: a */
        public static final C53385d f132037a = new C53385d();

        C53385d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C53428l(InternalLeakCanary.INSTANCE.getApplication(), C533861.f132038a, C533872.f132039a);
        }
    }

    /* renamed from: leakcanary.internal.InternalLeakCanary$e */
    public static final class C53388e implements InvocationHandler {

        /* renamed from: a */
        public static final C53388e f132040a = new C53388e();

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            return C52860x.f131107a;
        }
    }

    private InternalLeakCanary() {
    }

    public final boolean getApplicationVisible() {
        return applicationVisible;
    }

    public final C53428l getLeakDirectoryProvider() {
        return (C53428l) leakDirectoryProvider$delegate.getValue();
    }

    private final void disableDumpHeapInInstrumentationTests() {
        new Handler().post(C53382a.f132034a);
    }

    public final Application getApplication() {
        Application application2 = application;
        if (application2 == null) {
            C52711k.m112237a("application");
        }
        return application2;
    }

    public final C53370a getNoInstallConfig() {
        C53370a aVar = new C53370a(false, false, 0, false, 0, false, false, 126, null);
        return aVar;
    }

    public final void onDumpHeapReceived() {
        if (heapDumpTrigger != null) {
            C53406g gVar = heapDumpTrigger;
            if (gVar == null) {
                C52711k.m112237a("heapDumpTrigger");
            }
            gVar.f132087h.post(new C53409c(gVar, true));
        }
    }

    public final /* synthetic */ <T> T noOpDelegate() {
        C52711k.m112235a(4, "T");
        Class<Object> cls = Object.class;
        InvocationHandler invocationHandler = C53388e.f132040a;
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
        C52711k.m112235a(1, "T");
        return (Object) newProxyInstance;
    }

    public final void onObjectRetained() {
        if (heapDumpTrigger != null) {
            C53406g gVar = heapDumpTrigger;
            if (gVar == null) {
                C52711k.m112237a("heapDumpTrigger");
            }
            String str = "found new object retained";
            if (gVar.f132081b) {
                C53174a a = C53173a.m112969a();
                if (a != null) {
                    StringBuilder sb = new StringBuilder("Already scheduled retained check, ignoring (");
                    sb.append(str);
                    sb.append(')');
                    a.mo110681a(sb.toString());
                }
            } else {
                gVar.f132081b = true;
                gVar.f132087h.post(new C53415g(gVar, str));
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Application) obj);
        return C52860x.f131107a;
    }

    public final void setApplication(Application application2) {
        C52711k.m112240b(application2, "<set-?>");
        application = application2;
    }

    public static final /* synthetic */ C53406g access$getHeapDumpTrigger$p(InternalLeakCanary internalLeakCanary) {
        C53406g gVar = heapDumpTrigger;
        if (gVar == null) {
            C52711k.m112237a("heapDumpTrigger");
        }
        return gVar;
    }

    public final void invoke(Application application2) {
        C52711k.m112240b(application2, "application");
        application = application2;
        C53362a.m113431b().mo110963a((C53374i) this);
        AndroidHeapDumper androidHeapDumper = new AndroidHeapDumper(application2, getLeakDirectoryProvider());
        C53366a aVar = C53366a.f131998a;
        C52670a aVar2 = C53384c.f132036a;
        HandlerThread handlerThread = new HandlerThread("LeakCanary-Heap-Dump");
        handlerThread.start();
        C53406g gVar = new C53406g(application2, new Handler(handlerThread.getLooper()), C53362a.m113431b(), aVar, androidHeapDumper, aVar2);
        heapDumpTrigger = gVar;
        C52671b bVar = C53383b.f132035a;
        C52711k.m112240b(application2, "$this$registerVisibilityListener");
        C52711k.m112240b(bVar, "listener");
        application2.registerActivityLifecycleCallbacks(new C53436p(bVar));
        disableDumpHeapInInstrumentationTests();
    }

    public final void setEnabledBlocking(String str, boolean z) {
        int i;
        C52711k.m112240b(str, "componentClassName");
        Application application2 = application;
        if (application2 == null) {
            C52711k.m112237a("application");
        }
        ComponentName componentName = new ComponentName(application2, str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Application application3 = application;
        if (application3 == null) {
            C52711k.m112237a("application");
        }
        application3.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
    }
}
