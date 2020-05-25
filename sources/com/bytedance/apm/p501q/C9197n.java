package com.bytedance.apm.p501q;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.apm.q.n */
public final class C9197n {

    /* renamed from: a */
    public static final CharSequence f25164a = "amigo";

    /* renamed from: b */
    public static final CharSequence f25165b = "funtouch";

    /* renamed from: c */
    public static boolean f25166c;

    /* renamed from: d */
    public static boolean f25167d;

    /* renamed from: e */
    public static String f25168e;

    /* renamed from: f */
    private static final CharSequence f25169f = "sony";

    /* renamed from: c */
    public static boolean m18274c() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f25166c = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f25166c;
    }

    /* renamed from: a */
    public static boolean m18272a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: b */
    public static String m18273b() {
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0029] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18271a(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r4 = "getprop "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r3.append(r5)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.Process r5 = r2.exec(r5)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x003e, all -> 0x0039 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x003f, all -> 0x0036 }
            r5.destroy()     // Catch:{ Throwable -> 0x0034, all -> 0x0036 }
            com.bytedance.apm.p501q.C9184f.m18231a(r2)
            return r1
        L_0x0034:
            r0 = r1
            goto L_0x003f
        L_0x0036:
            r5 = move-exception
            r1 = r2
            goto L_0x003a
        L_0x0039:
            r5 = move-exception
        L_0x003a:
            com.bytedance.apm.p501q.C9184f.m18231a(r1)
            throw r5
        L_0x003e:
            r2 = r1
        L_0x003f:
            com.bytedance.apm.p501q.C9184f.m18231a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p501q.C9197n.m18271a(java.lang.String):java.lang.String");
    }
}
