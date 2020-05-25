package com.p683ss.android.message.p1191b;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Pair;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p526f.C9409b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.message.b.k */
public final class C19470k {

    /* renamed from: a */
    public static String f53796a;

    /* renamed from: b */
    public static boolean f53797b;

    /* renamed from: c */
    public static boolean f53798c;

    /* renamed from: a */
    public static boolean m47654a() {
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m47660d() {
        if (VERSION.SDK_INT >= 21) {
            return C19471l.m47664a("ro.build.version.emui");
        }
        return m47661e();
    }

    /* renamed from: f */
    private static boolean m47662f() {
        if (!f53798c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f53797b = true;
                    f53798c = true;
                    return f53797b;
                }
            } catch (Exception unused) {
            }
            f53798c = true;
        }
        return f53797b;
    }

    /* renamed from: c */
    private static boolean m47657c() {
        try {
            if ((C9431p.m18664a(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (C9431p.m18664a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static String m47661e() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[]{"ro.build.version.emui"});
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ Throwable -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087 A[Catch:{ Throwable -> 0x0094 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m47655b() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = m47662f()     // Catch:{ Throwable -> 0x0094 }
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "MIUI-"
            r0.append(r1)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x008f
        L_0x0012:
            boolean r1 = m47654a()     // Catch:{ Throwable -> 0x0094 }
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "FLYME-"
            r0.append(r1)     // Catch:{ Throwable -> 0x0094 }
            goto L_0x008f
        L_0x001f:
            java.lang.String r1 = m47660d()     // Catch:{ Throwable -> 0x0094 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = m47660d()     // Catch:{ Throwable -> 0x0094 }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0094 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0044
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r3 = "emotionui"
            boolean r2 = r2.startsWith(r3)     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            boolean r2 = m47657c()     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x004c
        L_0x004a:
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = "angler"
            java.lang.String r3 = android.os.Build.BOARD     // Catch:{ Throwable -> 0x0094 }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r3 = "nexus"
            boolean r2 = r2.contains(r3)     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r3 = "6p"
            boolean r2 = r2.contains(r3)     // Catch:{ Throwable -> 0x0094 }
            if (r2 == 0) goto L_0x007a
            r4 = 1
        L_0x007a:
            if (r4 != 0) goto L_0x0081
            java.lang.String r2 = "EMUI-"
            r0.append(r2)     // Catch:{ Throwable -> 0x0094 }
        L_0x0081:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0094 }
            if (r2 != 0) goto L_0x008f
            r0.append(r1)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r1 = "-"
            r0.append(r1)     // Catch:{ Throwable -> 0x0094 }
        L_0x008f:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x0094 }
            r0.append(r1)     // Catch:{ Throwable -> 0x0094 }
        L_0x0094:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1191b.C19470k.m47655b():java.lang.String");
    }

    /* renamed from: c */
    public static boolean m47658c(Context context) {
        String a = C19471l.m47663a(context);
        if ((a == null || !a.contains(":")) && a != null && a.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m47651a(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("user");
        if (systemService == null) {
            return null;
        }
        try {
            Object invoke = Process.class.getMethod("myUserHandle", null).invoke(Process.class, null);
            return String.valueOf(((Long) systemService.getClass().getMethod("getSerialNumberForUser", new Class[]{invoke.getClass()}).invoke(systemService, new Object[]{invoke})).longValue());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m47659d(Context context) {
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
    public static String m47656b(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setDataAndType(Uri.parse("http://"), null);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65568);
            if (queryIntentActivities.size() > 0) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo != null && resolveInfo.activityInfo != null && "com.android.browser".equals(resolveInfo.activityInfo.packageName)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(resolveInfo.activityInfo.packageName);
                        sb.append("/");
                        sb.append(resolveInfo.activityInfo.name);
                        return sb.toString();
                    }
                }
                ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(0);
                if (!(resolveInfo2 == null || resolveInfo2.activityInfo == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(resolveInfo2.activityInfo.packageName);
                    sb2.append("/");
                    sb2.append(resolveInfo2.activityInfo.name);
                    return sb2.toString();
                }
            }
        } catch (Exception unused) {
        }
        return "com.android.browser/com.android.browser.BrowserActivity";
    }

    /* renamed from: a */
    public static String m47652a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C9425l.m18648a(list, "UTF-8"));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m47653a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return m47652a(str, (List<Pair<String, String>>) arrayList);
    }
}
