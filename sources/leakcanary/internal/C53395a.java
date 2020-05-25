package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import leakcanary.C53362a.C53363a;
import leakcanary.C53372h;
import leakcanary.internal.C53420k.C53426f;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.a */
public final class C53395a {

    /* renamed from: d */
    public static final C53396a f132062d = new C53396a(null);

    /* renamed from: a */
    public final C53397b f132063a;

    /* renamed from: b */
    public final C53372h f132064b;

    /* renamed from: c */
    public final C52670a<C53363a> f132065c;

    /* renamed from: leakcanary.internal.a$a */
    public static final class C53396a {
        private C53396a() {
        }

        public /* synthetic */ C53396a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m113463a(Application application, C53372h hVar, C52670a<C53363a> aVar) {
            C52711k.m112240b(application, "application");
            C52711k.m112240b(hVar, "objectWatcher");
            C52711k.m112240b(aVar, "configProvider");
            application.registerActivityLifecycleCallbacks(new C53395a(hVar, aVar, null).f132063a);
        }
    }

    /* renamed from: leakcanary.internal.a$b */
    public static final class C53397b implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C53395a f132066a;

        /* renamed from: b */
        private final /* synthetic */ ActivityLifecycleCallbacks f132067b;

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.f132067b.onActivityCreated(activity, bundle);
        }

        public final void onActivityPaused(Activity activity) {
            this.f132067b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f132067b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f132067b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f132067b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f132067b.onActivityStopped(activity);
        }

        public final void onActivityDestroyed(Activity activity) {
            C52711k.m112240b(activity, "activity");
            if (((C53363a) this.f132066a.f132065c.invoke()).f131994b) {
                this.f132066a.f132064b.mo110961a((Object) activity);
            }
        }

        C53397b(C53395a aVar) {
            this.f132066a = aVar;
            Class<ActivityLifecycleCallbacks> cls = ActivityLifecycleCallbacks.class;
            InvocationHandler invocationHandler = C53426f.f132125a;
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
            if (newProxyInstance != null) {
                this.f132067b = (ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }
    }

    private C53395a(C53372h hVar, C52670a<C53363a> aVar) {
        this.f132064b = hVar;
        this.f132065c = aVar;
        this.f132063a = new C53397b(this);
    }

    public /* synthetic */ C53395a(C53372h hVar, C52670a aVar, C52707g gVar) {
        this(hVar, aVar);
    }
}
