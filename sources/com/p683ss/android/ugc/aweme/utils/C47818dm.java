package com.p683ss.android.ugc.aweme.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0621ad;
import com.bytedance.common.utility.p526f.C9409b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.dm */
public class C47818dm {
    /* renamed from: b */
    public static void m103459b(Context context) {
        if (context != null && !m103461d(context)) {
            m103462e(context);
        }
    }

    /* renamed from: e */
    private static boolean m103462e(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!m103458a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m103457a(Context context) {
        char c;
        try {
            if (VERSION.SDK_INT > 19) {
                return C0621ad.m1696a(context).mo2144a();
            }
            int c2 = m103460c(context);
            if (c2 == 0) {
                c = 0;
            } else if (c2 == 1) {
                c = 1;
            } else {
                c = 65535;
            }
            if (c == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m103461d(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            if (!m103458a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static int m103460c(Context context) {
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

    /* renamed from: a */
    private static boolean m103458a(Intent intent, Context context) {
        if (context == null) {
            return false;
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
