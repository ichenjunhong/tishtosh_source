package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.p2345t.C46774e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.al */
public final class C45392al {

    /* renamed from: a */
    private static boolean f114779a = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableRushLooper);

    /* renamed from: a */
    public static void m98949a(Activity activity) {
        if (f114779a && !activity.isFinishing() && VERSION.SDK_INT <= 28 && VERSION.SDK_INT > 18) {
            try {
                activity.isImmersive();
            } catch (IllegalArgumentException unused) {
                activity.finish();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m98951b(Activity activity) {
        if (!f114779a) {
            return false;
        }
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
    public static void m98950a(Activity activity, boolean z) {
        if (f114779a) {
            C46774e.m101579a(activity, z);
        }
    }
}
