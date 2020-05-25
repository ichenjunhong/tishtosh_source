package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import leakcanary.C53362a.C53363a;
import leakcanary.C53372h;
import leakcanary.internal.C53420k.C53426f;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.e */
public final class C53403e {

    /* renamed from: a */
    public static final C53403e f132074a = new C53403e();

    /* renamed from: leakcanary.internal.e$a */
    public static final class C53404a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ List f132075a;

        /* renamed from: b */
        private final /* synthetic */ ActivityLifecycleCallbacks f132076b;

        public final void onActivityDestroyed(Activity activity) {
            this.f132076b.onActivityDestroyed(activity);
        }

        public final void onActivityPaused(Activity activity) {
            this.f132076b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f132076b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f132076b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f132076b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f132076b.onActivityStopped(activity);
        }

        C53404a(List list) {
            this.f132075a = list;
            Class<ActivityLifecycleCallbacks> cls = ActivityLifecycleCallbacks.class;
            InvocationHandler invocationHandler = C53426f.f132125a;
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
            if (newProxyInstance != null) {
                this.f132076b = (ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C52711k.m112240b(activity, "activity");
            for (C52671b invoke : this.f132075a) {
                invoke.invoke(activity);
            }
        }
    }

    private C53403e() {
    }

    /* renamed from: a */
    private static boolean m113467a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo111023a(Application application, C53372h hVar, C52670a<C53363a> aVar) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(hVar, "objectWatcher");
        C52711k.m112240b(aVar, "configProvider");
        List arrayList = new ArrayList();
        if (VERSION.SDK_INT >= 26) {
            arrayList.add(new C53399c(hVar, aVar));
        }
        if (m113467a("android.support.v4.app.Fragment")) {
            arrayList.add(new C53434o(hVar, aVar));
        }
        if (arrayList.size() != 0) {
            application.registerActivityLifecycleCallbacks(new C53404a(arrayList));
        }
    }
}
