package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bep implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42204a;

    bep(bem bem, Activity activity) {
        this.f42204a = activity;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f42204a);
    }
}
