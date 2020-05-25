package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bwd implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44112a;

    bwd(bvy bvy, Activity activity) {
        this.f44112a = activity;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f44112a);
    }
}
