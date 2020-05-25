package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import com.google.android.gms.internal.measurement.C16577bu;

public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C16577bu f38937a;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ SecurityException -> 0x0081, all -> 0x005d }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[SYNTHETIC, Splitter:B:24:0x0063] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.bu r0 = r5.f38937a
            if (r0 != 0) goto L_0x000b
            com.google.android.gms.internal.measurement.bu r0 = new com.google.android.gms.internal.measurement.bu
            r0.<init>()
            r5.f38937a = r0
        L_0x000b:
            com.google.android.gms.internal.measurement.t r0 = com.google.android.gms.internal.measurement.C16862t.m40963a(r6)
            com.google.android.gms.internal.measurement.bl r0 = r0.mo32518a()
            if (r7 != 0) goto L_0x001b
            java.lang.String r6 = "AnalyticsReceiver called with null intent"
            r0.mo32503e(r6)
            return
        L_0x001b:
            java.lang.String r7 = r7.getAction()
            java.lang.String r1 = "Local AnalyticsReceiver got"
            r0.mo32490a(r1, r7)
            java.lang.String r1 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x008a
            boolean r7 = com.google.android.gms.internal.measurement.C16578bv.m39574a(r6)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            r1.<init>(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsService"
            r2.<init>(r6, r3)
            r1.setComponent(r2)
            java.lang.String r2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            r1.setAction(r2)
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C16577bu.f46582a
            monitor-enter(r2)
            if (r6 == 0) goto L_0x0059
            boolean r3 = r6 instanceof android.content.Context     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0059
            r3 = r6
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x005d }
            boolean r3 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r3, r1)     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r6.startService(r1)     // Catch:{ all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r6 = move-exception
            goto L_0x0088
        L_0x005f:
            if (r7 != 0) goto L_0x0063
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            return
        L_0x0063:
            com.google.android.gms.stats.a r7 = com.google.android.gms.internal.measurement.C16577bu.f46583b     // Catch:{ SecurityException -> 0x0081 }
            if (r7 != 0) goto L_0x0079
            com.google.android.gms.stats.a r7 = new com.google.android.gms.stats.a     // Catch:{ SecurityException -> 0x0081 }
            r1 = 1
            java.lang.String r3 = "Analytics WakeLock"
            r7.<init>(r6, r1, r3)     // Catch:{ SecurityException -> 0x0081 }
            com.google.android.gms.internal.measurement.C16577bu.f46583b = r7     // Catch:{ SecurityException -> 0x0081 }
            android.os.PowerManager$WakeLock r6 = r7.f48549b     // Catch:{ SecurityException -> 0x0081 }
            r1 = 0
            r6.setReferenceCounted(r1)     // Catch:{ SecurityException -> 0x0081 }
            r7.f48553f = r1     // Catch:{ SecurityException -> 0x0081 }
        L_0x0079:
            com.google.android.gms.stats.a r6 = com.google.android.gms.internal.measurement.C16577bu.f46583b     // Catch:{ SecurityException -> 0x0081 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r6.mo33416a(r3)     // Catch:{ SecurityException -> 0x0081 }
            goto L_0x0086
        L_0x0081:
            java.lang.String r6 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions."
            r0.mo32503e(r6)     // Catch:{ all -> 0x005d }
        L_0x0086:
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            return
        L_0x0088:
            monitor-exit(r2)     // Catch:{ all -> 0x005d }
            throw r6
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.AnalyticsReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
