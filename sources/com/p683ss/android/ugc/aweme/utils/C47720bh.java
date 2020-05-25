package com.p683ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.bh */
public class C47720bh {

    /* renamed from: a */
    private static final List<Intent> f120232a = new ArrayList();

    /* renamed from: a */
    public static void m103294a(Context context) {
        if (context != null) {
            m103296b(context);
            if (!m103297c(context) && !m103298d(context)) {
                m103299e(context);
            }
        }
    }

    /* renamed from: e */
    private static boolean m103299e(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m103298d(Context context) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static void m103296b(Context context) {
        if (f120232a.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", C47720bh.class.getName());
            f120232a.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            f120232a.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            f120232a.add(component3);
        }
    }

    /* renamed from: c */
    private static boolean m103297c(Context context) {
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            Intent intent = null;
            if (TextUtils.equals(lowerCase, "oppo") && VERSION.SDK_INT <= 23) {
                Iterator it = f120232a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Intent intent2 = (Intent) it.next();
                    if (m103295a(context, intent2)) {
                        intent2.addFlags(268435456);
                        intent = intent2;
                        break;
                    }
                }
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = new Intent();
                intent.setFlags(268435456);
                intent.putExtra("packageName", context.getPackageName());
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", context.getPackageName());
            } else if (TextUtils.equals(lowerCase, "meizu")) {
                intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", context.getPackageName());
            }
            if (intent != null) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m103295a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                return false;
            }
            return resolveActivity.activityInfo.exported;
        } catch (Exception unused) {
            return false;
        }
    }
}
