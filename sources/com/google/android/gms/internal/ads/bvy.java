package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class bvy implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f44102a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f44103b;

    /* renamed from: c */
    private boolean f44104c;

    public bvy(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f44103b = new WeakReference<>(activityLifecycleCallbacks);
        this.f44102a = application;
    }

    /* renamed from: a */
    private final void m36899a(bwg bwg) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f44103b.get();
            if (activityLifecycleCallbacks != null) {
                bwg.mo30801a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f44104c) {
                this.f44102a.unregisterActivityLifecycleCallbacks(this);
                this.f44104c = true;
            }
        } catch (Exception e) {
            abv.m32793b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m36899a(new bvz(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m36899a(new bwa(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m36899a(new bwb(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m36899a(new bwc(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m36899a(new bwd(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m36899a(new bwe(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m36899a(new bwf(this, activity));
    }
}
