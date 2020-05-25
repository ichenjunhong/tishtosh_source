package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bwf implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44115a;

    bwf(bvy bvy, Activity activity) {
        this.f44115a = activity;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f44115a);
    }
}
