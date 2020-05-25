package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class beq implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42205a;

    beq(bem bem, Activity activity) {
        this.f42205a = activity;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f42205a);
    }
}
