package com.p683ss.android.ugc.aweme.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.p920d.C13691k;
import com.facebook.imagepipeline.p964d.C13987q;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.ugc.aweme.app.ai */
public final class C22933ai implements C13691k<C13987q> {

    /* renamed from: a */
    private ActivityManager f61262a;

    /* renamed from: b */
    public final /* synthetic */ Object mo23157b() {
        int i;
        int min = Math.min(this.f61262a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            i = min / 4;
        }
        if (VERSION.SDK_INT >= 19) {
            C13987q qVar = new C13987q(i, 128, i / 12, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return qVar;
        }
        C13987q qVar2 = new C13987q(i, UnReadVideoExperiment.BROWSE_RECORD_LIST, i / 8, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar2;
    }

    public C22933ai(ActivityManager activityManager) {
        this.f61262a = activityManager;
    }
}
