package com.bytedance.polaris.p826d;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p526f.C9409b;

/* renamed from: com.bytedance.polaris.d.k */
public class C12645k {
    /* renamed from: d */
    public static boolean m25407d(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!m25404a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m25406c(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            if (!m25404a(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m25403a(Context context) {
        if (context == null) {
            return -1;
        }
        if (VERSION.SDK_INT >= 24) {
            try {
                if (((Boolean) C9409b.m18609a((Object) (NotificationManager) context.getSystemService("notification")).mo17054b("areNotificationsEnabled").f25654a).booleanValue()) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
            }
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
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m25405b(Context context) {
        Intent intent;
        Intent intent2 = null;
        if (context == null) {
            intent = null;
        } else {
            try {
                intent = new Intent();
                intent.setComponent(new ComponentName("com.coloros.notificationmanager", "com.coloros.notificationmanager.AppDetailPreferenceActivity"));
                intent.putExtra("pkg_name", context.getPackageName());
                intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
                intent.putExtra("class_name", C12645k.class.getName());
                intent.addFlags(268435456);
            } catch (Exception unused) {
                return false;
            }
        }
        if (m25404a(intent, context)) {
            context.startActivity(intent);
            return true;
        }
        if (context != null) {
            intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.oppo.notification.center", "com.oppo.notification.center.AppDetailActivity"));
            intent2.putExtra("pkg_name", context.getPackageName());
            intent2.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            intent2.putExtra("class_name", C12645k.class.getName());
            intent2.addFlags(268435456);
        }
        if (!m25404a(intent2, context)) {
            return false;
        }
        context.startActivity(intent2);
        return true;
    }

    /* renamed from: a */
    private static boolean m25404a(Intent intent, Context context) {
        if (context == null || intent == null || context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
            return false;
        }
        return true;
    }
}
