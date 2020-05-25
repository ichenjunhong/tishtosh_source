package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.l */
public class C35274l {
    /* renamed from: c */
    public static boolean m79756c(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m79755b(Context context) {
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

    /* renamed from: a */
    public static boolean m79754a(Context context) {
        Intent intent = null;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && VERSION.SDK_INT <= 23) {
                intent = new Intent();
                intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
                intent.putExtra("pkg_name", context.getPackageName());
                intent.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
                intent.putExtra("class_name", C35274l.class.getName());
                intent.addFlags(268435456);
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = new Intent();
                intent.setFlags(268435456);
                intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", "com.ss.android.ugc.aweme.im.sdk");
            } else if (TextUtils.equals(lowerCase, "meizu")) {
                intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", "com.ss.android.ugc.aweme.im.sdk");
            }
            if (intent != null) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
