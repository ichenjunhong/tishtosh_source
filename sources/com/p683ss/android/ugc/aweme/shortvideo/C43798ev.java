package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Window;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ev */
public final class C43798ev {
    /* renamed from: a */
    public static void m96239a(Activity activity) {
        if (VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
        }
    }

    /* renamed from: b */
    public static void m96240b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
            window.setStatusBarColor(0);
            return;
        }
        m96239a(activity);
    }
}
