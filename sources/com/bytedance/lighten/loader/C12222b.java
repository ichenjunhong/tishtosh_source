package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.p920d.C13691k;
import com.facebook.imagepipeline.p964d.C13987q;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.bytedance.lighten.loader.b */
public final class C12222b implements C13691k<C13987q> {

    /* renamed from: a */
    private final ActivityManager f32298a;

    /* renamed from: b */
    private int f32299b;

    /* renamed from: b */
    public final /* synthetic */ Object mo23157b() {
        int i;
        int i2;
        if (this.f32299b > 0) {
            i2 = this.f32299b;
        } else {
            int min = Math.min(this.f32298a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
            if (min < 33554432) {
                i = 4194304;
            } else if (min < 67108864) {
                i = 6291456;
            } else if (VERSION.SDK_INT < 11) {
                i = 8388608;
            } else {
                i2 = min / 8;
            }
            C13987q qVar = new C13987q(i, UnReadVideoExperiment.BROWSE_RECORD_LIST, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return qVar;
        }
        i = i2;
        C13987q qVar2 = new C13987q(i, UnReadVideoExperiment.BROWSE_RECORD_LIST, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar2;
    }

    public C12222b(ActivityManager activityManager, int i) {
        this.f32298a = activityManager;
        this.f32299b = i;
    }
}
