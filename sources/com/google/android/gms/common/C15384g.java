package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15529t;
import com.google.android.gms.common.util.C15532w;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.g */
public class C15384g {

    /* renamed from: a */
    private static boolean f39684a = false;

    /* renamed from: b */
    public static final int f39685b = 12451000;

    /* renamed from: c */
    static final AtomicBoolean f39686c = new AtomicBoolean();

    /* renamed from: d */
    private static boolean f39687d;

    /* renamed from: e */
    private static final AtomicBoolean f39688e = new AtomicBoolean();

    C15384g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (com.google.android.gms.common.util.C15518i.f39988b.booleanValue() == false) goto L_0x0092;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31956a(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ Throwable -> 0x000a }
            r1 = 2132543143(0x7f1c06a7, float:2.073941E38)
            r0.getString(r1)     // Catch:{ Throwable -> 0x000a }
        L_0x000a:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r4.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicBoolean r0 = f39688e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x005a
            com.google.android.gms.common.internal.C15424ao.m32017a(r4)
            int r0 = com.google.android.gms.common.internal.C15424ao.f39779b
            if (r0 == 0) goto L_0x0052
            int r1 = f39685b
            if (r0 != r1) goto L_0x002a
            goto L_0x005a
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            int r5 = f39685b
            r1 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " but found "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r4.<init>(r5)
            throw r4
        L_0x005a:
            boolean r0 = com.google.android.gms.common.util.C15518i.m32285b(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Boolean r0 = com.google.android.gms.common.util.C15518i.f39988b
            if (r0 != 0) goto L_0x0088
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x0081
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r0 = 0
            goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.C15518i.f39988b = r0
        L_0x0088:
            java.lang.Boolean r0 = com.google.android.gms.common.util.C15518i.f39988b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            int r4 = m31957a(r4, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C15384g.m31956a(android.content.Context, int):int");
    }

    /* renamed from: a */
    private static int m31957a(Context context, boolean z, int i) {
        C15464q.m32133b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C15386i.m31967a(context);
            if (!C15386i.m31970a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C15386i.m31970a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C15532w.m32326a(packageInfo2.versionCode) < C15532w.m32326a(i)) {
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = C15385h.m31966a(packageManager, "com.google.android.gms", 0);
                } catch (NameNotFoundException e) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                    return 1;
                }
            }
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (NameNotFoundException unused2) {
            return 1;
        }
    }

    /* renamed from: b */
    public static boolean m31962b(Context context, int i) {
        return C15529t.m32309a(context, i);
    }

    /* renamed from: a */
    public static boolean m31959a(Context context, int i, String str) {
        return C15529t.m32310a(context, i, str);
    }

    /* renamed from: a */
    public static boolean m31958a(Context context) {
        if (!f39687d) {
            try {
                PackageInfo b = C15377d.m31951a(context).mo28321b("com.google.android.gms", 64);
                C15386i.m31967a(context);
                if (b == null || C15386i.m31970a(b, false) || !C15386i.m31970a(b, true)) {
                    f39684a = false;
                } else {
                    f39684a = true;
                }
            } catch (NameNotFoundException unused) {
            } finally {
                f39687d = true;
            }
        }
        return f39684a || !"user".equals(Build.TYPE);
    }

    /* renamed from: b */
    public static Resources m31961b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Context m31963c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m31965d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m31964c(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m31960a(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m31960a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            boolean r1 = com.google.android.gms.common.util.C15524o.m32299g()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0035 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0035 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x001e
            return r2
        L_0x0035:
            return r3
        L_0x0036:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = com.google.android.gms.common.C15385h.m31966a(r1, r6, r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r0 == 0) goto L_0x0045
            boolean r5 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0076 }
            return r5
        L_0x0045:
            boolean r6 = r6.enabled     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r6 == 0) goto L_0x0075
            boolean r6 = com.google.android.gms.common.util.C15524o.m32296d()     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r6 == 0) goto L_0x0071
            java.lang.String r6 = "user"
            java.lang.Object r6 = r5.getSystemService(r6)     // Catch:{ NameNotFoundException -> 0x0076 }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0076 }
            android.os.Bundle r5 = r6.getApplicationRestrictions(r5)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r5 == 0) goto L_0x0071
            java.lang.String r6 = "true"
            java.lang.String r0 = "restricted_profile"
            java.lang.String r5 = r5.getString(r0)     // Catch:{ NameNotFoundException -> 0x0076 }
            boolean r5 = r6.equals(r5)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r5 == 0) goto L_0x0071
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r5 != 0) goto L_0x0075
            return r2
        L_0x0075:
            return r3
        L_0x0076:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C15384g.m31960a(android.content.Context, java.lang.String):boolean");
    }
}
