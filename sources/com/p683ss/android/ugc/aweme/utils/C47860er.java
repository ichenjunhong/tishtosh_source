package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.utils.er */
final class C47860er {
    /* renamed from: a */
    static void m103532a(Activity activity, boolean z) {
        if (!z && !activity.isFinishing() && VERSION.SDK_INT > 23 && VERSION.SDK_INT <= 28) {
            try {
                activity.isImmersive();
            } catch (IllegalArgumentException unused) {
                activity.finish();
            } catch (Exception unused2) {
            }
        }
    }
}
