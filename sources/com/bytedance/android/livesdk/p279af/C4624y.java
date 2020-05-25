package com.bytedance.android.livesdk.p279af;

import android.os.Build.VERSION;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.Window;
import com.bytedance.android.live.core.p230g.C3894h;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.bytedance.android.livesdk.af.y */
public final class C4624y {
    /* renamed from: a */
    public static void m11088a(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && C3894h.m9842a(activity)) {
            Window window = activity.getWindow();
            if (VERSION.SDK_INT >= 21 && window != null) {
                if (window.getAttributes() == null || (window.getAttributes().flags & DynamicTabYellowPointVersion.DEFAULT) != Integer.MIN_VALUE) {
                    window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                }
                window.setStatusBarColor(-16777216);
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}
