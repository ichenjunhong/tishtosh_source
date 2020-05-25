package com.p683ss.sys.ces.out;

import android.content.Context;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.sys.ces.C51393c;

/* renamed from: com.ss.sys.ces.out.StcSDKFactory */
public class StcSDKFactory {

    /* renamed from: a */
    private static ISdk f128562a;

    /* renamed from: b */
    private static boolean f128563b;

    public static ISdk getInstance() {
        return f128562a;
    }

    public static ISdk getSDK(Context context, long j) {
        if (f128562a == null) {
            synchronized (StcSDKFactory.class) {
                if (f128562a == null) {
                    f128562a = C51393c.m110534a(context, j, NormalGiftView.ALPHA_255, null);
                }
            }
        }
        return f128562a;
    }

    public static ISdk getSDK(Context context, long j, int i) {
        if (f128562a == null) {
            synchronized (StcSDKFactory.class) {
                if (f128562a == null) {
                    f128562a = C51393c.m110534a(context, j, i, null);
                }
            }
        }
        return f128562a;
    }

    public static ISdk getSDK(Context context, long j, int i, IExpendFunctions iExpendFunctions) {
        if (f128562a == null) {
            synchronized (StcSDKFactory.class) {
                if (f128562a == null) {
                    f128562a = C51393c.m110534a(context, j, i, iExpendFunctions);
                }
            }
        }
        return f128562a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initSdkListener(android.app.Activity r4) {
        /*
            boolean r0 = f128563b
            if (r0 != 0) goto L_0x0045
            java.lang.Class<com.ss.sys.ces.out.StcSDKFactory> r0 = com.p683ss.sys.ces.out.StcSDKFactory.class
            monitor-enter(r0)
            if (r4 == 0) goto L_0x003e
            android.app.Application r1 = r4.getApplication()     // Catch:{ Throwable -> 0x003e }
            com.ss.sys.ces.b.b r2 = com.p683ss.sys.ces.p2581b.C51390b.m110526a()     // Catch:{ Throwable -> 0x003e }
            r1.registerActivityLifecycleCallbacks(r2)     // Catch:{ Throwable -> 0x003e }
            com.ss.sys.ces.b.b r1 = com.p683ss.sys.ces.p2581b.C51390b.m110526a()     // Catch:{ Throwable -> 0x003e }
            com.ss.a.b.e<android.app.Activity> r1 = r1.f128492a     // Catch:{ Throwable -> 0x003e }
            boolean r1 = r1.contains(r4)     // Catch:{ Throwable -> 0x003e }
            if (r1 != 0) goto L_0x003e
            android.view.Window r1 = r4.getWindow()     // Catch:{ Throwable -> 0x003e }
            if (r1 == 0) goto L_0x003e
            android.view.Window$Callback r2 = r1.getCallback()     // Catch:{ Throwable -> 0x003e }
            com.ss.sys.ces.b.d r3 = new com.ss.sys.ces.b.d     // Catch:{ Throwable -> 0x003e }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x003e }
            r1.setCallback(r3)     // Catch:{ Throwable -> 0x003e }
            com.ss.sys.ces.b.b r1 = com.p683ss.sys.ces.p2581b.C51390b.m110526a()     // Catch:{ Throwable -> 0x003e }
            com.ss.a.b.e<android.app.Activity> r1 = r1.f128492a     // Catch:{ Throwable -> 0x003e }
            r1.add(r4)     // Catch:{ Throwable -> 0x003e }
            goto L_0x003e
        L_0x003c:
            r4 = move-exception
            goto L_0x0043
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r4 = 1
            f128563b = r4
            goto L_0x0045
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r4
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.out.StcSDKFactory.initSdkListener(android.app.Activity):void");
    }
}
