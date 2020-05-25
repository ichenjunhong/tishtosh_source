package com.bytedance.crash.p550j;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.bytedance.crash.j.a */
public class C9613a {

    /* renamed from: a */
    private static volatile UUID f26213a = null;

    /* renamed from: b */
    private static String f26214b = "";

    /* renamed from: a */
    public static synchronized String m19141a(Context context) {
        String str;
        synchronized (C9613a.class) {
            if (TextUtils.isEmpty(f26214b)) {
                new C9613a(context);
                UUID uuid = f26213a;
                if (uuid != null) {
                    f26214b = uuid.toString();
                }
            }
            str = f26214b;
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:10|11)|(3:15|16|17)(1:18)|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|(1:9)(5:10|11|(3:15|16|17)(1:18)|19|20))|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9613a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.UUID r0 = f26213a
            if (r0 != 0) goto L_0x0056
            java.lang.Class<com.bytedance.crash.j.a> r0 = com.bytedance.crash.p550j.C9613a.class
            monitor-enter(r0)
            java.util.UUID r1 = f26213a     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            com.bytedance.crash.k.h r1 = com.bytedance.crash.p551k.C9652h.m19252a()     // Catch:{ all -> 0x0053 }
            r2 = 0
            java.lang.String r1 = r1.mo17501a(r2)     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0020
            java.util.UUID r4 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x0053 }
            f26213a = r4     // Catch:{ all -> 0x0053 }
            goto L_0x0051
        L_0x0020:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Throwable -> 0x002b }
            java.lang.String r1 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r1)     // Catch:{ Throwable -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r4 = r2
        L_0x002c:
            if (r4 == 0) goto L_0x003b
            java.lang.String r1 = "utf8"
            byte[] r4 = r4.getBytes(r1)     // Catch:{ Throwable -> 0x0041 }
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch:{ Throwable -> 0x0041 }
            f26213a = r4     // Catch:{ Throwable -> 0x0041 }
            goto L_0x0041
        L_0x003b:
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ Throwable -> 0x0041 }
            f26213a = r4     // Catch:{ Throwable -> 0x0041 }
        L_0x0041:
            com.bytedance.crash.k.h r4 = com.bytedance.crash.p551k.C9652h.m19252a()     // Catch:{ Throwable -> 0x0051 }
            java.util.UUID r1 = f26213a     // Catch:{ Throwable -> 0x0051 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0051 }
            java.io.File r4 = r4.f26347b     // Catch:{ Throwable -> 0x0051 }
            r2 = 0
            com.bytedance.crash.p555n.C9695g.m19352a(r4, r1, r2)     // Catch:{ Throwable -> 0x0051 }
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r4
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p550j.C9613a.<init>(android.content.Context):void");
    }
}
