package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9598h;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9713t;
import java.util.Map.Entry;

public class NativeCrashCollector {
    /* renamed from: a */
    public static String m19460a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return C9713t.m19436a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < enumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return C9713t.m19436a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (Entry entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = ((Thread) entry.getKey()).getName();
                if (name2.equals(str) || name2.startsWith(str)) {
                    return C9713t.m19436a((StackTraceElement[]) entry.getValue());
                }
                if (name2.endsWith(str)) {
                    return C9713t.m19436a((StackTraceElement[]) entry.getValue());
                }
            }
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onNativeCrash(java.lang.String r15) {
        /*
            long r7 = java.lang.System.currentTimeMillis()
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.NATIVE
            java.lang.String r1 = com.bytedance.crash.C9567c.C9568a.f26097e
            r9 = 0
            com.bytedance.crash.g.a r0 = com.bytedance.crash.p547g.C9590b.m19072a(r0, r1, r7, r9)
            com.bytedance.crash.p547g.C9591c.m19085b(r0)
            java.lang.String r1 = com.bytedance.crash.C9567c.C9568a.f26100h
            com.bytedance.crash.g.a r10 = r0.eventType(r1)
            com.bytedance.crash.g.a r3 = r0.clone()
            com.bytedance.crash.g.a r0 = r0.clone()
            java.lang.String r1 = com.bytedance.crash.C9567c.C9568a.f26099g
            com.bytedance.crash.g.a r6 = r0.eventType(r1)
            com.bytedance.crash.k.c r0 = com.bytedance.crash.p551k.C9638c.m19220a()     // Catch:{ Throwable -> 0x00c6 }
            r0.mo17482b()     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r1 = com.bytedance.crash.p555n.C9705m.m19390a()     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = com.bytedance.crash.C9616k.m19153e()     // Catch:{ Throwable -> 0x00c6 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00c6 }
            java.io.File r11 = com.bytedance.crash.p555n.C9705m.m19404g(r0)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.k.a.f r12 = com.bytedance.crash.p551k.p552a.C9628f.m19195a()     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.d r13 = com.bytedance.crash.C9571d.NATIVE     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.nativecrash.NativeCrashCollector$1 r14 = new com.bytedance.crash.nativecrash.NativeCrashCollector$1     // Catch:{ Throwable -> 0x00c6 }
            r0 = r14
            r1 = r15
            r2 = r11
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r6)     // Catch:{ Throwable -> 0x00c6 }
            r15 = 1
            com.bytedance.crash.f.a r15 = r12.mo17473a(r13, r9, r14, r15)     // Catch:{ Throwable -> 0x00c6 }
            org.json.JSONObject r0 = r15.f26141a     // Catch:{ Throwable -> 0x00c6 }
            if (r0 == 0) goto L_0x00a8
            int r1 = r0.length()     // Catch:{ Throwable -> 0x00c6 }
            if (r1 == 0) goto L_0x00a8
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c6 }
            r3 = 0
            long r3 = r1 - r7
            r5 = 0
            java.lang.String r6 = "java_end"
            r0.put(r6, r1)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r1 = "crash_cost"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0088 }
            r15.mo17397b(r1, r2)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r1 = "crash_cost"
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = r3 / r6
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0088 }
            r15.mo17390a(r1, r2)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.g.a r15 = r10.state(r5)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.g.a r15 = r15.crashTime(r3)     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.crash.p547g.C9591c.m19085b(r15)     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.io.File r15 = new java.io.File     // Catch:{ Throwable -> 0x00c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c6 }
            r1.<init>()     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = r11.getAbsolutePath()     // Catch:{ Throwable -> 0x00c6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r2 = ".tmp"
            r1.append(r2)     // Catch:{ Throwable -> 0x00c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00c6 }
            r15.<init>(r1)     // Catch:{ Throwable -> 0x00c6 }
            com.bytedance.crash.p555n.C9695g.m19353a(r15, r0, r5)     // Catch:{ Throwable -> 0x00c6 }
            r15.renameTo(r11)     // Catch:{ Throwable -> 0x00c6 }
        L_0x00a8:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r15 = ""
            m19461a(r15, r9)
            java.lang.String r15 = com.bytedance.crash.C9567c.C9568a.f26106n
            com.bytedance.crash.g.a r15 = r10.eventType(r15)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r0
            com.bytedance.crash.g.a r15 = r15.crashTime(r2)
            com.bytedance.crash.p547g.C9591c.m19085b(r15)
            return
        L_0x00c4:
            r15 = move-exception
            goto L_0x00de
        L_0x00c6:
            r15 = move-exception
            com.bytedance.crash.f r0 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "NPTH_CATCH"
            r0.mo17384a(r1, r15)     // Catch:{ all -> 0x00c4 }
            r0 = 301(0x12d, float:4.22E-43)
            com.bytedance.crash.g.a r0 = r10.state(r0)     // Catch:{ all -> 0x00c4 }
            com.bytedance.crash.g.a r15 = r0.errorInfo(r15)     // Catch:{ all -> 0x00c4 }
            com.bytedance.crash.p547g.C9591c.m19085b(r15)     // Catch:{ all -> 0x00c4 }
            goto L_0x00a8
        L_0x00de:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = ""
            m19461a(r2, r9)
            java.lang.String r2 = com.bytedance.crash.C9567c.C9568a.f26106n
            com.bytedance.crash.g.a r2 = r10.eventType(r2)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r0
            com.bytedance.crash.g.a r0 = r2.crashTime(r3)
            com.bytedance.crash.p547g.C9591c.m19085b(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.NativeCrashCollector.onNativeCrash(java.lang.String):void");
    }

    /* renamed from: a */
    private static void m19461a(String str, Thread thread) {
        for (C9598h a : C9616k.m19150b().f26028f) {
            try {
                a.mo17349a(C9571d.NATIVE, "", null);
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
    }
}
