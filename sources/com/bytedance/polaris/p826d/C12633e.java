package com.bytedance.polaris.p826d;

import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.polaris.d.e */
public final class C12633e {

    /* renamed from: a */
    private static boolean f33197a = false;

    /* renamed from: b */
    private static boolean f33198b = false;

    /* renamed from: c */
    private static String f33199c = null;

    /* renamed from: d */
    private static int f33200d = -1;

    /* renamed from: e */
    private static String f33201e;

    /* renamed from: f */
    private static String f33202f;

    /* renamed from: b */
    public static boolean m25376b() {
        m25383h();
        return "V6".equals(f33199c);
    }

    /* renamed from: c */
    public static boolean m25378c() {
        m25383h();
        return "V7".equals(f33199c);
    }

    /* renamed from: d */
    public static boolean m25379d() {
        m25383h();
        return "V8".equals(f33199c);
    }

    /* renamed from: e */
    public static boolean m25380e() {
        m25383h();
        return "V9".equals(f33199c);
    }

    /* renamed from: j */
    private static String m25385j() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    /* renamed from: a */
    public static boolean m25373a() {
        if (!f33198b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f33197a = true;
                }
            } catch (Exception unused) {
            }
            f33198b = true;
        }
        return f33197a;
    }

    /* renamed from: f */
    public static boolean m25381f() {
        m25383h();
        if ("V10".equals(f33199c) || "v10".equals(f33199c)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static double m25382g() {
        try {
            String c = m25377c("ro.build.version.emui");
            return Double.parseDouble(c.substring(c.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* renamed from: h */
    private static void m25383h() {
        String str;
        if (f33199c == null) {
            try {
                String i = m25384i();
                f33199c = i;
                if (TextUtils.isEmpty(i)) {
                    f33199c = C12626b.m25366a().mo23729a("ro.miui.ui.version.name");
                } else {
                    f33199c = f33199c.trim();
                }
            } catch (IOException unused) {
            }
            if (f33199c == null) {
                str = "";
            } else {
                str = f33199c;
            }
            f33199c = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[SYNTHETIC, Splitter:B:13:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[SYNTHETIC, Splitter:B:21:0x0041] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25384i() {
        /*
            java.lang.String r0 = "ro.miui.ui.version.name"
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r3.append(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r0)     // Catch:{ Throwable -> 0x003e, all -> 0x0037 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x003f, all -> 0x0034 }
            r2.close()     // Catch:{ Throwable -> 0x003f, all -> 0x0034 }
            r2.close()     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            return r0
        L_0x0034:
            r0 = move-exception
            r1 = r2
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r2 = r1
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.close()     // Catch:{ Throwable -> 0x0044 }
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12633e.m25384i():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25375b(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12633e.m25375b(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC, Splitter:B:13:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25377c(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r3 = "getprop "
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x003c, all -> 0x0035 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r4
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p826d.C12633e.m25377c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m25374a(String str) {
        if (f33201e != null) {
            return f33201e.equals(str);
        }
        String b = m25375b("ro.miui.ui.version.name");
        f33202f = b;
        if (!TextUtils.isEmpty(b)) {
            f33201e = "MIUI";
        } else {
            String b2 = m25375b("ro.build.version.emui");
            f33202f = b2;
            if (!TextUtils.isEmpty(b2)) {
                f33201e = "EMUI";
            } else {
                String b3 = m25375b("ro.build.version.opporom");
                f33202f = b3;
                if (!TextUtils.isEmpty(b3)) {
                    f33201e = "OPPO";
                } else {
                    String b4 = m25375b("ro.vivo.os.version");
                    f33202f = b4;
                    if (!TextUtils.isEmpty(b4)) {
                        f33201e = "VIVO";
                    } else {
                        String b5 = m25375b("ro.smartisan.version");
                        f33202f = b5;
                        if (!TextUtils.isEmpty(b5)) {
                            f33201e = "SMARTISAN";
                        } else {
                            String b6 = m25375b("ro.gn.sv.version");
                            f33202f = b6;
                            if (!TextUtils.isEmpty(b6)) {
                                f33201e = "QIONEE";
                            } else {
                                String b7 = m25375b("ro.lenovo.lvp.version");
                                f33202f = b7;
                                if (!TextUtils.isEmpty(b7)) {
                                    f33201e = "LENOVO";
                                } else if (m25385j().toLowerCase().contains("samsung")) {
                                    f33201e = "samsung";
                                } else if (m25385j().toLowerCase().contains("zte")) {
                                    f33201e = "zte";
                                } else {
                                    String str2 = Build.DISPLAY;
                                    f33202f = str2;
                                    if (str2.toUpperCase().contains("FLYME")) {
                                        f33201e = "FLYME";
                                    } else {
                                        f33202f = "unknown";
                                        f33201e = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return f33201e.equals(str);
    }

    /* renamed from: a */
    public static void m25372a(boolean z, Window window) {
        int i;
        try {
            Class cls = window.getClass();
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }
}
