package com.bytedance.p829r;

import android.content.Context;
import android.os.storage.StorageManager;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.r.b */
public class C12661b {

    /* renamed from: e */
    private static C12661b f33254e;

    /* renamed from: f */
    private static volatile boolean f33255f;

    /* renamed from: g */
    private static Context f33256g;

    /* renamed from: a */
    public String f33257a;

    /* renamed from: b */
    public long f33258b;

    /* renamed from: c */
    public long f33259c;

    /* renamed from: d */
    public String f33260d;

    /* renamed from: h */
    private volatile Boolean f33261h;

    /* renamed from: a */
    public final boolean mo23793a() {
        if (!"mounted".equals(this.f33257a) || !m25447b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("state=");
        sb.append(this.f33257a);
        sb.append(", totalSize=");
        sb.append(this.f33259c);
        sb.append(", availableSize=");
        sb.append(this.f33258b);
        sb.append(", path=");
        sb.append(this.f33260d);
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:18|19|20|21|22|23|24|35|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|(2:40|41)|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[SYNTHETIC, Splitter:B:33:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[SYNTHETIC, Splitter:B:40:0x0083] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0086=Splitter:B:42:0x0086, B:35:0x0079=Splitter:B:35:0x0079} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25447b() {
        /*
            r5 = this;
            android.content.Context r0 = f33256g
            r1 = 0
            if (r0 != 0) goto L_0x000c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f33261h = r0
            return r1
        L_0x000c:
            java.lang.Boolean r0 = r5.f33261h
            if (r0 != 0) goto L_0x009c
            java.lang.Class<com.bytedance.r.b> r0 = com.bytedance.p829r.C12661b.class
            monitor-enter(r0)
            java.lang.Boolean r2 = r5.f33261h     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x0097
            android.content.Context r2 = f33256g     // Catch:{ Exception -> 0x008f }
            r3 = 0
            r2.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x008f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = r5.f33260d     // Catch:{ all -> 0x0099 }
            r2.append(r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "/Android/data/"
            r2.append(r4)     // Catch:{ all -> 0x0099 }
            android.content.Context r4 = f33256g     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0099 }
            r2.append(r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "/sd_test"
            r2.append(r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0099 }
            java.io.File r2 = com.bytedance.p829r.C12662c.m25451a(r2)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0087
            boolean r4 = r2.exists()     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x004b
            goto L_0x0087
        L_0x004b:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006e }
            r4.<init>(r2)     // Catch:{ Exception -> 0x006e }
            java.lang.String r2 = "bingo"
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r4.write(r2)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r4.flush()     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r5.f33261h = r2     // Catch:{ Exception -> 0x0069, all -> 0x0067 }
            r4.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x0079
        L_0x0067:
            r1 = move-exception
            goto L_0x0081
        L_0x0069:
            r3 = r4
            goto L_0x006e
        L_0x006b:
            r1 = move-exception
            r4 = r3
            goto L_0x0081
        L_0x006e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x006b }
            r5.f33261h = r1     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0079
            r3.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            java.lang.Boolean r1 = r5.f33261h     // Catch:{ all -> 0x0099 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x0081:
            if (r4 == 0) goto L_0x0086
            r4.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0087:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0099 }
            r5.f33261h = r2     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x008f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0099 }
            r5.f33261h = r2     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            return r1
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            goto L_0x009c
        L_0x0099:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0099 }
            throw r1
        L_0x009c:
            java.lang.Boolean r0 = r5.f33261h
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p829r.C12661b.m25447b():boolean");
    }

    /* renamed from: a */
    public static C12661b m25446a(Context context) {
        f33256g = context.getApplicationContext();
        if (!f33255f) {
            synchronized (C12661b.class) {
                if (!f33255f) {
                    try {
                        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
                        Class cls = Class.forName("android.os.storage.StorageVolume");
                        Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                        Method method2 = cls.getMethod("getPathFile", new Class[0]);
                        Method method3 = cls.getMethod("isRemovable", new Class[0]);
                        Method method4 = cls.getMethod("getState", new Class[0]);
                        Object invoke = method.invoke(storageManager, new Object[0]);
                        int length = Array.getLength(invoke);
                        for (int i = 0; i < length; i++) {
                            Object obj = Array.get(invoke, i);
                            if (((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                                File file = (File) method2.invoke(obj, new Object[0]);
                                C12661b bVar = new C12661b((String) method4.invoke(obj, new Object[0]), file.getFreeSpace(), file.getTotalSpace(), file.getPath());
                                f33254e = bVar;
                                f33255f = true;
                                return bVar;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        f33255f = true;
                        throw th;
                    }
                    f33255f = true;
                }
            }
        }
        return f33254e;
    }

    private C12661b(String str, long j, long j2, String str2) {
        this.f33257a = str;
        this.f33258b = j;
        this.f33259c = j2;
        this.f33260d = str2;
    }
}
