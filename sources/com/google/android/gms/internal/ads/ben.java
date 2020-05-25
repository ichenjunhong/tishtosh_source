package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class ben implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42201a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f42202b;

    ben(bem bem, Activity activity, Bundle bundle) {
        this.f42201a = activity;
        this.f42202b = bundle;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f42201a, this.f42202b);
    }
}
