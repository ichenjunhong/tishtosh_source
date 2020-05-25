package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bwe implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44113a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f44114b;

    bwe(bvy bvy, Activity activity, Bundle bundle) {
        this.f44113a = activity;
        this.f44114b = bundle;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f44113a, this.f44114b);
    }
}
