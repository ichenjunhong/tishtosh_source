package com.facebook.imagepipeline.p964d;

import android.os.Build.VERSION;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13703b;
import com.facebook.imagepipeline.p964d.C13971h.C13974a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.facebook.imagepipeline.d.d */
public final class C13960d implements C13974a {
    /* renamed from: a */
    public final double mo26131a(C13703b bVar) {
        switch (bVar) {
            case OnCloseToDalvikHeapLimit:
                if (VERSION.SDK_INT >= 21) {
                    return C13703b.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
                }
                return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            case OnAppBackgrounded:
            case OnSystemMemoryCriticallyLowWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInBackground:
                return 1.0d;
            default:
                C13697a.m27698d("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", bVar);
                return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
    }
}
