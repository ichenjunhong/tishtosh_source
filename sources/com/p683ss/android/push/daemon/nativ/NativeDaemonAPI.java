package com.p683ss.android.push.daemon.nativ;

import com.p683ss.android.push.daemon.NativeDaemonBase;

/* renamed from: com.ss.android.push.daemon.nativ.NativeDaemonAPI */
public class NativeDaemonAPI extends NativeDaemonBase {
    public native void doDaemon(String str, String str2, String str3, String str4);

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|(2:8|13)(1:9))|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0055 */
    static {
        /*
            java.lang.String r0 = "daemon"
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x005c }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r0)     // Catch:{ Throwable -> 0x0055 }
            if (r3 == 0) goto L_0x0055
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0055 }
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.android.p161c.C2835a.m8098a(r3, r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0055 }
            r3.<init>()     // Catch:{ Throwable -> 0x0055 }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x0055 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r4 = "/lib"
            r3.append(r4)     // Catch:{ Throwable -> 0x0055 }
            r3.append(r0)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r4 = ".so"
            r3.append(r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0055 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x0055 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x0055 }
            boolean r4 = r4.exists()     // Catch:{ Throwable -> 0x0055 }
            if (r4 == 0) goto L_0x0051
            r4 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r0, r4)     // Catch:{ Throwable -> 0x0055 }
            java.lang.System.load(r3)     // Catch:{ Throwable -> 0x0055 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r0)     // Catch:{ Throwable -> 0x0055 }
            goto L_0x005c
        L_0x0051:
            r3 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r0, r3)     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            com.bytedance.p723j.C11511a.m23578a(r0)     // Catch:{ Exception -> 0x005c }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r0)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.push.daemon.nativ.NativeDaemonAPI.<clinit>():void");
    }
}
