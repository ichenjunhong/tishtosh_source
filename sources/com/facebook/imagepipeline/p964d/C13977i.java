package com.facebook.imagepipeline.p964d;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.p920d.C13691k;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.facebook.imagepipeline.d.i */
public class C13977i implements C13691k<C13987q> {

    /* renamed from: a */
    private final ActivityManager f36460a;

    /* renamed from: a */
    public C13987q mo23157b() {
        int i;
        int min = Math.min(this.f36460a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else if (VERSION.SDK_INT < 11) {
            i = 8388608;
        } else {
            i = min / 4;
        }
        C13987q qVar = new C13987q(i, UnReadVideoExperiment.BROWSE_RECORD_LIST, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar;
    }

    public C13977i(ActivityManager activityManager) {
        this.f36460a = activityManager;
    }
}
