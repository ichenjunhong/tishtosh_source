package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bwa implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44109a;

    bwa(bvy bvy, Activity activity) {
        this.f44109a = activity;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f44109a);
    }
}
