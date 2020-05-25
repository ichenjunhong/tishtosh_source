package com.p683ss.android.ugc.aweme.p2108r.p2110b;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0621ad;
import com.bytedance.common.utility.p526f.C9409b;

/* renamed from: com.ss.android.ugc.aweme.r.b.a */
public final class C41051a {
    /* renamed from: a */
    public static boolean m90720a(Context context) {
        try {
            if (VERSION.SDK_INT > 19) {
                return C0621ad.m1696a(context).mo2144a();
            }
            if (m90721b(context) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m90721b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            C9409b a = C9409b.m18609a((Object) appOpsManager);
            if (((Integer) a.mo17052a("checkOpNoThrow", (Class<?>[]) new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(((Integer) a.mo17051a("OP_POST_NOTIFICATION", (Class<?>[]) new Class[]{Integer.TYPE}).f25654a).intValue()), Integer.valueOf(i), packageName).f25654a).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
