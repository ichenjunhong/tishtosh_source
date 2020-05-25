package com.facebook.internal.p979a.p980a;

import android.os.Process;
import com.facebook.internal.p979a.C14270b;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.facebook.internal.a.a.a */
public class C14266a implements UncaughtExceptionHandler {

    /* renamed from: a */
    private static final String f37176a = C14266a.class.getCanonicalName();

    /* renamed from: b */
    private static C14266a f37177b;

    /* renamed from: c */
    private final UncaughtExceptionHandler f37178c;

    /* renamed from: d */
    private boolean f37179d;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m29231a() {
        /*
            java.lang.Class<com.facebook.internal.a.a.a> r0 = com.facebook.internal.p979a.p980a.C14266a.class
            monitor-enter(r0)
            boolean r1 = com.facebook.C14533n.m29780n()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0064
            java.io.File r1 = com.facebook.internal.p979a.C14270b.m29235a()     // Catch:{ all -> 0x007a }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            com.facebook.internal.a.b$1 r3 = new com.facebook.internal.a.b$1     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            java.io.File[] r1 = r1.listFiles(r3)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            java.io.File[] r1 = new java.io.File[r2]     // Catch:{ all -> 0x007a }
        L_0x001e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            int r4 = r1.length     // Catch:{ all -> 0x007a }
            r5 = 0
        L_0x0025:
            if (r5 >= r4) goto L_0x003a
            r6 = r1[r5]     // Catch:{ all -> 0x007a }
            com.facebook.internal.a.a.b r7 = new com.facebook.internal.a.a.b     // Catch:{ all -> 0x007a }
            r7.<init>(r6)     // Catch:{ all -> 0x007a }
            boolean r6 = r7.mo26475a()     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x0037
            r3.add(r7)     // Catch:{ all -> 0x007a }
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x003a:
            com.facebook.internal.a.a.a$1 r1 = new com.facebook.internal.a.a.a$1     // Catch:{ all -> 0x007a }
            r1.<init>()     // Catch:{ all -> 0x007a }
            java.util.Collections.sort(r3, r1)     // Catch:{ all -> 0x007a }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x007a }
            r1.<init>()     // Catch:{ all -> 0x007a }
        L_0x0047:
            int r4 = r3.size()     // Catch:{ all -> 0x007a }
            if (r2 >= r4) goto L_0x005a
            r4 = 5
            if (r2 >= r4) goto L_0x005a
            java.lang.Object r4 = r3.get(r2)     // Catch:{ all -> 0x007a }
            r1.put(r4)     // Catch:{ all -> 0x007a }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005a:
            java.lang.String r2 = "crash_reports"
            com.facebook.internal.a.a.a$2 r4 = new com.facebook.internal.a.a.a$2     // Catch:{ all -> 0x007a }
            r4.<init>(r3)     // Catch:{ all -> 0x007a }
            com.facebook.internal.p979a.C14270b.m29239a(r2, r1, r4)     // Catch:{ all -> 0x007a }
        L_0x0064:
            com.facebook.internal.a.a.a r1 = f37177b     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x006a
            monitor-exit(r0)
            return
        L_0x006a:
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x007a }
            com.facebook.internal.a.a.a r2 = new com.facebook.internal.a.a.a     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            f37177b = r2     // Catch:{ all -> 0x007a }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)     // Catch:{ all -> 0x007a }
            monitor-exit(r0)
            return
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p979a.p980a.C14266a.m29231a():void");
    }

    private C14266a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f37178c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = false;
        if (th != null) {
            Throwable th2 = null;
            Throwable th3 = th;
            loop0:
            while (true) {
                if (th3 == null || th3 == th2) {
                    break;
                }
                for (StackTraceElement className : th3.getStackTrace()) {
                    if (className.getClassName().startsWith("com.facebook")) {
                        z = true;
                        break loop0;
                    }
                }
                th2 = th3;
                th3 = th3.getCause();
            }
        }
        if (z) {
            C14269b bVar = new C14269b(th);
            if (bVar.mo26475a()) {
                C14270b.m29238a(bVar.f37181a, bVar.toString());
            }
        }
        if (this.f37178c != null) {
            this.f37178c.uncaughtException(thread, th);
        }
        if (this.f37179d) {
            try {
                Process.killProcess(Process.myPid());
                System.exit(10);
            } catch (Throwable unused) {
            }
        }
    }
}
