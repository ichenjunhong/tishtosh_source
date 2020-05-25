package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16582bz;

/* renamed from: com.google.android.gms.internal.measurement.bv */
public final class C16578bv<T extends Context & C16582bz> {

    /* renamed from: c */
    private static Boolean f46585c;

    /* renamed from: a */
    final Handler f46586a = new C16590cg();

    /* renamed from: b */
    public final T f46587b;

    public C16578bv(T t) {
        C15464q.m32123a(t);
        this.f46587b = t;
    }

    /* renamed from: a */
    public static boolean m39574a(Context context) {
        C15464q.m32123a(context);
        if (f46585c != null) {
            return f46585c.booleanValue();
        }
        boolean a = C16585cb.m39590a(context, "com.google.android.gms.analytics.AnalyticsService");
        f46585c = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public final void mo31851a() {
        C16862t.m40963a((Context) this.f46587b).mo32518a().mo32493b("Local AnalyticsService is starting up");
    }

    /* renamed from: b */
    public final void mo31853b() {
        C16862t.m40963a((Context) this.f46587b).mo32518a().mo32493b("Local AnalyticsService is shutting down");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r4 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r0.f48555h == 1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        com.google.android.gms.common.stats.C15501e.f39970a.mo28516a(r0.f48552e, com.google.android.gms.common.stats.C15500d.m32251a(r0.f48549b, r9), 8, r0.f48551d, r9, null, r0.f48550c, r0.mo33414a());
        r0.f48555h--;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo31850a(android.content.Intent r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r15
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C16577bu.f46582a     // Catch:{ SecurityException -> 0x0080 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0080 }
            com.google.android.gms.stats.a r0 = com.google.android.gms.internal.measurement.C16577bu.f46583b     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            android.os.PowerManager$WakeLock r3 = r0.f48549b     // Catch:{ all -> 0x007d }
            boolean r3 = r3.isHeld()     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x007b
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f48556i     // Catch:{ all -> 0x007d }
            r3.decrementAndGet()     // Catch:{ all -> 0x007d }
            r3 = 0
            java.lang.String r9 = r0.mo33413a(r3)     // Catch:{ all -> 0x007d }
            java.lang.Object r3 = r0.f48548a     // Catch:{ all -> 0x007d }
            monitor-enter(r3)     // Catch:{ all -> 0x007d }
            boolean r4 = r0.f48553f     // Catch:{ all -> 0x0078 }
            r13 = 1
            r14 = 0
            if (r4 == 0) goto L_0x004e
            java.util.Map<java.lang.String, java.lang.Integer[]> r4 = r0.f48554g     // Catch:{ all -> 0x0078 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x0078 }
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x002f
        L_0x002d:
            r4 = 0
            goto L_0x004c
        L_0x002f:
            r5 = r4[r14]     // Catch:{ all -> 0x0078 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0078 }
            if (r5 != r13) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Integer[]> r4 = r0.f48554g     // Catch:{ all -> 0x0078 }
            r4.remove(r9)     // Catch:{ all -> 0x0078 }
            r4 = 1
            goto L_0x004c
        L_0x003e:
            r5 = r4[r14]     // Catch:{ all -> 0x0078 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0078 }
            int r5 = r5 - r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0078 }
            r4[r14] = r5     // Catch:{ all -> 0x0078 }
            goto L_0x002d
        L_0x004c:
            if (r4 != 0) goto L_0x0056
        L_0x004e:
            boolean r4 = r0.f48553f     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x0073
            int r4 = r0.f48555h     // Catch:{ all -> 0x0078 }
            if (r4 != r13) goto L_0x0073
        L_0x0056:
            com.google.android.gms.common.stats.e r4 = com.google.android.gms.common.stats.C15501e.f39970a     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r0.f48552e     // Catch:{ all -> 0x0078 }
            android.os.PowerManager$WakeLock r6 = r0.f48549b     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = com.google.android.gms.common.stats.C15500d.m32251a(r6, r9)     // Catch:{ all -> 0x0078 }
            r7 = 8
            java.lang.String r8 = r0.f48551d     // Catch:{ all -> 0x0078 }
            r10 = 0
            int r11 = r0.f48550c     // Catch:{ all -> 0x0078 }
            java.util.List r12 = r0.mo33414a()     // Catch:{ all -> 0x0078 }
            r4.mo28516a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0078 }
            int r4 = r0.f48555h     // Catch:{ all -> 0x0078 }
            int r4 = r4 - r13
            r0.f48555h = r4     // Catch:{ all -> 0x0078 }
        L_0x0073:
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            r0.mo33415a(r14)     // Catch:{ all -> 0x007d }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            goto L_0x0080
        L_0x007d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            throw r0     // Catch:{ SecurityException -> 0x0080 }
        L_0x0080:
            T r0 = r1.f46587b
            com.google.android.gms.internal.measurement.t r0 = com.google.android.gms.internal.measurement.C16862t.m40963a(r0)
            com.google.android.gms.internal.measurement.bl r0 = r0.mo32518a()
            r2 = 2
            if (r16 != 0) goto L_0x0093
            java.lang.String r3 = "AnalyticsService started with null intent"
            r0.mo32503e(r3)
            return r2
        L_0x0093:
            java.lang.String r3 = r16.getAction()
            java.lang.String r4 = "Local AnalyticsService called. startId, action"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r0.mo32491a(r4, r5, r3)
            java.lang.String r4 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b2
            com.google.android.gms.internal.measurement.bw r3 = new com.google.android.gms.internal.measurement.bw
            r4 = r18
            r3.<init>(r15, r4, r0)
            r15.mo31852a(r3)
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16578bv.mo31850a(android.content.Intent, int, int):int");
    }

    /* renamed from: a */
    public final void mo31852a(Runnable runnable) {
        C16862t.m40963a((Context) this.f46587b).mo32520c().mo32471a((C16557ba) new C16581by(this, runnable));
    }
}
