package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bet implements beu {

    /* renamed from: a */
    private final /* synthetic */ Activity f42209a;

    bet(bem bem, Activity activity) {
        this.f42209a = activity;
    }

    /* renamed from: a */
    public final void mo30092a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f42209a);
    }
}
