package com.bytedance.polaris.p826d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: com.bytedance.polaris.d.l */
public final class C12646l {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m25408a(android.content.Context r6) {
        /*
            java.lang.String r0 = "OPPO"
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25374a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "com.coloros.safecenter"
            java.lang.String r1 = "com.coloros.privacypermissionsentry.PermissionTopActivity"
            boolean r1 = m25409a(r6, r0, r1)
            goto L_0x011a
        L_0x0013:
            java.lang.String r0 = android.os.Build.BRAND
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r2 != 0) goto L_0x002a
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "vivo"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x002a
        L_0x0028:
            r0 = 1
            goto L_0x0055
        L_0x002a:
            java.lang.String r0 = android.os.Build.MODEL
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x003f
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "vivo"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x003f
            goto L_0x0028
        L_0x003f:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0054
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "vivo"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0054
            goto L_0x0028
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "com.vivo.permissionmanager"
            java.lang.String r1 = "com.vivo.permissionmanager.activity.PurviewTabActivity"
            boolean r1 = m25409a(r6, r0, r1)
            goto L_0x011a
        L_0x0061:
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25373a()
            if (r0 == 0) goto L_0x009e
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25376b()
            if (r0 != 0) goto L_0x0092
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25378c()
            if (r0 == 0) goto L_0x0074
            goto L_0x0092
        L_0x0074:
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25379d()
            if (r0 != 0) goto L_0x0086
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25380e()
            if (r0 != 0) goto L_0x0086
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25381f()
            if (r0 == 0) goto L_0x011a
        L_0x0086:
            java.lang.String r0 = "com.miui.securitycenter"
            java.lang.String r1 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            java.lang.String r2 = "miui.intent.action.APP_PERM_EDITOR"
            boolean r1 = m25410a(r6, r0, r1, r2)
            goto L_0x011a
        L_0x0092:
            java.lang.String r0 = "com.miui.securitycenter"
            java.lang.String r1 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            java.lang.String r2 = "miui.intent.action.APP_PERM_EDITOR"
            boolean r1 = m25410a(r6, r0, r1, r2)
            goto L_0x011a
        L_0x009e:
            java.lang.String r0 = "EMUI"
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25374a(r0)
            if (r0 == 0) goto L_0x00d8
            double r2 = com.bytedance.polaris.p826d.C12633e.m25382g()     // Catch:{ SecurityException -> 0x00cf, ActivityNotFoundException -> 0x00c6, Exception -> 0x011a }
            r4 = 4614162998222441677(0x4008cccccccccccd, double:3.1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "com.huawei.systemmanager"
            java.lang.String r2 = "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"
            boolean r0 = m25409a(r6, r0, r2)     // Catch:{ SecurityException -> 0x00cf, ActivityNotFoundException -> 0x00c6, Exception -> 0x011a }
        L_0x00bb:
            r1 = r0
            goto L_0x011a
        L_0x00bd:
            java.lang.String r0 = "com.huawei.systemmanager"
            java.lang.String r2 = "com.huawei.permissionmanager.ui.MainActivity"
            boolean r0 = m25409a(r6, r0, r2)     // Catch:{ SecurityException -> 0x00cf, ActivityNotFoundException -> 0x00c6, Exception -> 0x011a }
            goto L_0x00bb
        L_0x00c6:
            java.lang.String r0 = "com.Android.settings"
            java.lang.String r1 = "com.android.settings.permission.TabItem"
            boolean r1 = m25409a(r6, r0, r1)
            goto L_0x011a
        L_0x00cf:
            java.lang.String r0 = "com.huawei.systemmanager"
            java.lang.String r1 = "com.huawei.permissionmanager.ui.MainActivity"
            boolean r1 = m25409a(r6, r0, r1)
            goto L_0x011a
        L_0x00d8:
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r2 = "Flyme"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "com.meizu.safe"
            java.lang.String r1 = "com.meizu.safe.security.AppSecActivity"
            java.lang.String r2 = "com.meizu.safe.security.SHOW_APPSEC"
            boolean r1 = m25410a(r6, r0, r1, r2)
            goto L_0x011a
        L_0x00ed:
            java.lang.String r0 = "QIKU"
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25374a(r0)
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "360"
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25374a(r0)
            if (r0 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r3 = 0
        L_0x00ff:
            if (r3 == 0) goto L_0x010a
            java.lang.String r0 = "com.android.settings"
            java.lang.String r1 = "com.android.settings.Settings$OverlaySettingsActivity"
            boolean r1 = m25409a(r6, r0, r1)
            goto L_0x011a
        L_0x010a:
            java.lang.String r0 = "SMARTISAN"
            boolean r0 = com.bytedance.polaris.p826d.C12633e.m25374a(r0)
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "com.smartisanos.security"
            java.lang.String r1 = "com.smartisanos.security.PermissionsActivity"
            boolean r1 = m25409a(r6, r0, r1)
        L_0x011a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12646l.m25408a(android.content.Context):boolean");
    }

    /* renamed from: a */
    private static boolean m25411a(Intent intent, Context context) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25409a(Context context, String str, String str2) {
        return m25410a(context, str, str2, "");
    }

    /* renamed from: a */
    private static boolean m25410a(Context context, String str, String str2, String str3) {
        Intent intent;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str3)) {
            intent = new Intent();
        } else {
            intent = new Intent(str3);
        }
        intent.setClassName(str, str2);
        intent.setFlags(268435456);
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("package", context.getPackageName());
        intent.putExtra("extra_pkgname", context.getPackageName());
        if (m25411a(intent, context)) {
            context.startActivity(intent);
            z = true;
        }
        return z;
    }
}
