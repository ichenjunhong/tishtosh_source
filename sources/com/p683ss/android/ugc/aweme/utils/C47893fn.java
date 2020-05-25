package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45453r;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.fn */
public final class C47893fn {
    /* renamed from: a */
    public static void m103596a(Activity activity) {
        Field a = C45453r.m99044a(activity, "mStartedActivity");
        if (a != null) {
            try {
                a.setAccessible(true);
                a.set(activity, Boolean.valueOf(true));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static synchronized PackageInfo m103595a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (C47893fn.class) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
        }
        return packageInfo;
    }
}
