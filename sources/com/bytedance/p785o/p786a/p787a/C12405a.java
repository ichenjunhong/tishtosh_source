package com.bytedance.p785o.p786a.p787a;

/* renamed from: com.bytedance.o.a.a.a */
public class C12405a {

    /* renamed from: a */
    public static Class f32654a;

    /* renamed from: b */
    public static Object f32655b;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0055 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m24983a() {
        /*
            java.lang.Object r0 = f32655b
            if (r0 != 0) goto L_0x005e
            java.lang.Class<com.bytedance.o.a.a.a> r0 = com.bytedance.p785o.p786a.p787a.C12405a.class
            monitor-enter(r0)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r1 = f32655b     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0024
            java.lang.Class r1 = f32654a     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x005b }
            f32654a = r1     // Catch:{ all -> 0x005b }
        L_0x0017:
            java.lang.Class r1 = f32654a     // Catch:{ all -> 0x005b }
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x005b }
            java.lang.Object r1 = com.bytedance.p785o.p786a.p796d.C12427b.m25019a(r1, r2, r3)     // Catch:{ all -> 0x005b }
            f32655b = r1     // Catch:{ all -> 0x005b }
        L_0x0024:
            java.lang.Object r1 = f32655b     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0059
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x005b }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005b }
            if (r1 == r2) goto L_0x0059
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x005b }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005b }
            r2.<init>(r3)     // Catch:{ all -> 0x005b }
            com.bytedance.o.a.a.a$1 r3 = new com.bytedance.o.a.a.a$1     // Catch:{ all -> 0x005b }
            r3.<init>(r1)     // Catch:{ all -> 0x005b }
            r2.post(r3)     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = f32655b     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0059
            monitor-enter(r1)     // Catch:{ all -> 0x005b }
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x0055
        L_0x0053:
            r2 = move-exception
            goto L_0x0057
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x0059
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x0053 }
            throw r2     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r1     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            java.lang.Object r0 = f32655b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p785o.p786a.p787a.C12405a.m24983a():java.lang.Object");
    }
}
