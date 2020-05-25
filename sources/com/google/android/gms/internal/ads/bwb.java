package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bwb implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44110a;

    bwb(bvy bvy, Activity activity) {
        this.f44110a = activity;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f44110a);
    }
}
