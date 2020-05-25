package com.p683ss.android.ugc.aweme.p2345t;

import android.app.Activity;
import android.os.Build.VERSION;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t.e */
public final class C46774e {
    /* renamed from: a */
    public static final void m101579a(Activity activity, boolean z) {
        C52711k.m112240b(activity, "activity");
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
