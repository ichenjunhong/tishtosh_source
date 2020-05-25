package com.bytedance.frameworks.baselib.network.http.p574e;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.g */
public final class C9912g {

    /* renamed from: a */
    private static String f26984a;

    /* renamed from: b */
    public static String m19865b(Context context) {
        return C9913h.m19867a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m19863a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.<init>()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.append(r3)     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            goto L_0x002e
        L_0x0039:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return r2
        L_0x0041:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0047
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r1
        L_0x004d:
            r1 = r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p574e.C9912g.m19863a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m19864a(Context context) {
        String b = m19865b(context);
        if ((b == null || !b.contains(":")) && b != null && b.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m19866c(Context context) {
        String str = f26984a;
        if (!C9431p.m18664a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f26984a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a = m19863a();
        f26984a = a;
        return a;
    }
}
