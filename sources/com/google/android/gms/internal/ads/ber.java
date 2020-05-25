package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ber implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42206a;

    ber(bem bem, Activity activity) {
        this.f42206a = activity;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f42206a);
    }
}
