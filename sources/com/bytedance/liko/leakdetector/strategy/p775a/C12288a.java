package com.bytedance.liko.leakdetector.strategy.p775a;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.bytedance.liko.leakdetector.strategy.a.a */
public final class C12288a implements UncaughtExceptionHandler {

    /* renamed from: b */
    private static UncaughtExceptionHandler f32409b;

    /* renamed from: a */
    private Context f32410a;

    private C12288a(Context context) {
        this.f32410a = context;
    }

    /* renamed from: a */
    public static void m24772a(Context context) {
        f32409b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C12288a(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[Catch:{ Throwable -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f32410a
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.String r2 = "LeakDetectorSp"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r2, r1)
            if (r0 == 0) goto L_0x001a
            java.lang.String r2 = "ld_oom_dump_time"
            r3 = -1
            long r2 = r0.getLong(r2, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            long r2 = r0.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "dump:"
            r2.<init>(r3)
            r3 = r0 ^ 1
            r2.append(r3)
            boolean r2 = r8 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x0090
            if (r0 != 0) goto L_0x0090
            com.bytedance.liko.memoryexplorer.MemoryConfig r0 = com.bytedance.liko.memoryexplorer.MemoryConfig.getMemoryConfig()     // Catch:{ Throwable -> 0x008f }
            boolean r0 = r0.oversea     // Catch:{ Throwable -> 0x008f }
            android.content.Context r2 = r6.f32410a     // Catch:{ Throwable -> 0x008f }
            java.io.File r0 = com.bytedance.liko.leakdetector.p774a.C12280a.m24759a(r0, r2)     // Catch:{ Throwable -> 0x008f }
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x008f }
            android.os.Debug.dumpHprofData(r2)     // Catch:{ Throwable -> 0x008f }
            java.io.File r2 = r0.getParentFile()     // Catch:{ Throwable -> 0x008f }
            android.content.Context r3 = r6.f32410a     // Catch:{ Throwable -> 0x008f }
            java.lang.String r4 = ".stacks"
            java.lang.StackTraceElement[] r5 = r7.getStackTrace()     // Catch:{ Throwable -> 0x008f }
            com.bytedance.liko.p772b.C12269a.m24752a(r3, r2, r4, r5)     // Catch:{ Throwable -> 0x008f }
            android.content.Context r2 = r6.f32410a     // Catch:{ Throwable -> 0x008f }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x0085
            java.lang.String r5 = "LeakDetectorSp"
            android.content.SharedPreferences r1 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r5, r1)     // Catch:{ Throwable -> 0x008f }
            if (r1 == 0) goto L_0x0085
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Throwable -> 0x008f }
            if (r1 == 0) goto L_0x0085
            java.lang.String r2 = "ld_oom_dump_time"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)     // Catch:{ Throwable -> 0x008f }
            if (r1 == 0) goto L_0x0085
            r1.commit()     // Catch:{ Throwable -> 0x008f }
        L_0x0085:
            android.content.Context r1 = r6.f32410a     // Catch:{ Throwable -> 0x008f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x008f }
            com.bytedance.liko.leakdetector.p774a.C12282c.m24765b(r1, r0)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            java.lang.Thread$UncaughtExceptionHandler r0 = f32409b
            if (r0 == 0) goto L_0x0099
            java.lang.Thread$UncaughtExceptionHandler r0 = f32409b
            r0.uncaughtException(r7, r8)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.strategy.p775a.C12288a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
