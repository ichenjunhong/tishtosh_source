package com.p683ss.android.ugc.aweme.util;

import com.p683ss.android.ugc.aweme.util.p2386a.C47612a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.util.b */
public final /* synthetic */ class C47614b implements Callable {

    /* renamed from: a */
    public static final Callable f120083a = new C47614b();

    private C47614b() {
    }

    public final Object call() {
        boolean z = false;
        if (!(C47612a.m103085f() > 0)) {
            C47612a.m103081b().putLong("active_time", System.currentTimeMillis()).apply();
            C47611a.m103070b("fb_mobile_achievement_unlocked", null, null);
        } else {
            if (!C47612a.m103077a().getBoolean("has_2d_rr_use", false)) {
                if (TimeUnit.MILLISECONDS.toDays(C47612a.m103085f()) + 1 == TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())) {
                    z = true;
                }
            }
            if (z) {
                C47611a.m103070b("2d_rr_user", null, null);
                C47611a.m103066a("d2_rr_user", null, null);
                C47612a.m103080a("has_2d_rr_use", true);
            }
        }
        return null;
    }
}
