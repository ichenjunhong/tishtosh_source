package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.os.Bundle;
import com.bytedance.ies.bullet.p653ui.common.C10560a;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate */
public class CommonBizActivityDelegate extends C10560a implements C0183j {

    /* renamed from: b */
    public Activity f64517b;

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18713a(activity, (Bundle) null);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18722f(activity);
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18672b(activity);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18671a(activity);
        }
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18720d(activity);
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        Activity activity = this.f64517b;
        if (activity != null) {
            mo18721e(activity);
        }
    }
}
