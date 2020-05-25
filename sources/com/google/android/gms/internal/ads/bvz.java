package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bvz implements bwg {

    /* renamed from: a */
    private final /* synthetic */ Activity f44105a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f44106b;

    bvz(bvy bvy, Activity activity, Bundle bundle) {
        this.f44105a = activity;
        this.f44106b = bundle;
    }

    /* renamed from: a */
    public final void mo30801a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f44105a, this.f44106b);
    }
}
