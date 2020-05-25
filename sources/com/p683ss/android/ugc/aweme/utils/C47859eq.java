package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45453r;

/* renamed from: com.ss.android.ugc.aweme.utils.eq */
public final class C47859eq {
    /* renamed from: a */
    public static void m103529a(Activity activity) {
        if (activity != null && !activity.isFinishing() && VERSION.SDK_INT <= 28 && VERSION.SDK_INT > 18) {
            try {
                activity.isImmersive();
            } catch (IllegalArgumentException unused) {
                activity.finish();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m103531b(Activity activity) {
        if (!activity.isFinishing() && VERSION.SDK_INT > 23 && VERSION.SDK_INT <= 28) {
            try {
                activity.isImmersive();
            } catch (IllegalArgumentException unused) {
                activity.finish();
            } catch (Exception unused2) {
            }
        }
        if (activity.isFinishing()) {
            C45453r.m99045a(activity);
        }
        return activity.isFinishing();
    }

    /* renamed from: a */
    public static void m103530a(Activity activity, boolean z) {
        C47860er.m103532a(activity, z);
    }
}
