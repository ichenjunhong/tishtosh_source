package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import java.util.Map;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.aa */
public final class C33391aa extends Thread {

    /* renamed from: a */
    private final Queue<C33392ab> f86583a;

    /* renamed from: b */
    private final Map<String, C33392ab> f86584b;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r0 = r3.f86583a
            monitor-enter(r0)
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r1 = r3.f86583a     // Catch:{ all -> 0x002d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0013
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r1 = r3.f86583a     // Catch:{ InterruptedException -> 0x0011 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0000
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r0 = r3.f86583a
            java.lang.Object r0 = r0.poll()
            com.ss.android.ugc.aweme.im.sdk.chat.d.ab r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33392ab) r0
            if (r0 == 0) goto L_0x0000
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r1 = r3.f86584b
            java.lang.String r2 = r0.f86585f
            r1.put(r2, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.d.ab> r1 = r3.f86584b
            r0.f86586g = r1
            r0.run()
            goto L_0x0000
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33391aa.run():void");
    }

    public C33391aa(String str, Queue<C33392ab> queue, Map<String, C33392ab> map) {
        super(str);
        setDaemon(true);
        this.f86583a = queue;
        this.f86584b = map;
    }
}
