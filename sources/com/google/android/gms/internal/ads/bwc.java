package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bwc implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44111a;

    bwc(bvy bvy, Activity activity) {
        this.f44111a = activity;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f44111a);
    }
}
