package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class bem implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f42198a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f42199b;

    /* renamed from: c */
    private boolean f42200c;

    public bem(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f42199b = new WeakReference<>(activityLifecycleCallbacks);
        this.f42198a = application;
    }

    /* renamed from: a */
    private final void m35506a(beu beu) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f42199b.get();
            if (activityLifecycleCallbacks != null) {
                beu.mo30092a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f42200c) {
                this.f42198a.unregisterActivityLifecycleCallbacks(this);
                this.f42200c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m35506a(new ben(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m35506a(new beo(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m35506a(new bep(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m35506a(new beq(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m35506a(new ber(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m35506a(new bes(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m35506a(new bet(this, activity));
    }
}
