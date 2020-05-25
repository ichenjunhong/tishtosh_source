package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bes implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42207a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f42208b;

    bes(bem bem, Activity activity, Bundle bundle) {
        this.f42207a = activity;
        this.f42208b = bundle;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f42207a, this.f42208b);
    }
}
