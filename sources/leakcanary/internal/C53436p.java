package leakcanary.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import leakcanary.internal.InternalLeakCanary.C53388e;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.internal.p */
public final class C53436p implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private int f132145a;

    /* renamed from: b */
    private boolean f132146b;

    /* renamed from: c */
    private final C52671b<Boolean, C52860x> f132147c;

    /* renamed from: d */
    private final /* synthetic */ ActivityLifecycleCallbacks f132148d;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f132148d.onActivityCreated(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f132148d.onActivityDestroyed(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f132148d.onActivityPaused(activity);
    }

    public final void onActivityResumed(Activity activity) {
        this.f132148d.onActivityResumed(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f132148d.onActivitySaveInstanceState(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f132145a++;
        if (!this.f132146b && this.f132145a == 1) {
            this.f132146b = true;
            this.f132147c.invoke(Boolean.valueOf(true));
        }
    }

    public C53436p(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        Class<ActivityLifecycleCallbacks> cls = ActivityLifecycleCallbacks.class;
        InvocationHandler invocationHandler = C53388e.f132040a;
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
        if (newProxyInstance != null) {
            this.f132148d = (ActivityLifecycleCallbacks) newProxyInstance;
            this.f132147c = bVar;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
    }

    public final void onActivityStopped(Activity activity) {
        C52711k.m112240b(activity, "activity");
        if (this.f132145a > 0) {
            this.f132145a--;
        }
        if (this.f132146b && this.f132145a == 0 && !activity.isChangingConfigurations()) {
            this.f132146b = false;
            this.f132147c.invoke(Boolean.valueOf(false));
        }
    }
}
