package com.p683ss.android.ugc.aweme.utils.p2387a;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.common.utility.p526f.C9409b;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.a.a */
public final class C47656a implements Callback {

    /* renamed from: a */
    private C9409b f120133a;

    /* renamed from: b */
    private Field f120134b;

    public final boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        switch (message.what) {
            case 103:
            case 104:
                try {
                    if (m103157a(m103156a(message))) {
                        return true;
                    }
                } catch (Throwable unused) {
                    break;
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    private IBinder m103156a(Message message) {
        if (VERSION.SDK_INT >= 24) {
            try {
                if (this.f120134b == null) {
                    this.f120134b = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                return (IBinder) this.f120134b.get(message.obj);
            } catch (Exception unused) {
            }
        } else {
            if (message.obj instanceof IBinder) {
                return (IBinder) message.obj;
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m103157a(android.os.IBinder r6) {
        /*
            r5 = this;
            r0 = 0
            com.bytedance.common.utility.f.b r1 = r5.f120133a     // Catch:{ Throwable -> 0x004c }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x004c }
            com.bytedance.common.utility.f.b r1 = com.bytedance.common.utility.p526f.C9409b.m18608a(r1)     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "currentActivityThread"
            com.bytedance.common.utility.f.b r1 = r1.mo17054b(r2)     // Catch:{ Throwable -> 0x004c }
            r5.f120133a = r1     // Catch:{ Throwable -> 0x004c }
        L_0x0017:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x004c }
            r2 = 18
            r3 = 1
            if (r1 > r2) goto L_0x0035
            com.bytedance.common.utility.f.b r1 = r5.f120133a     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "mActivities"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x004c }
            com.bytedance.common.utility.f.b r1 = r1.mo17051a(r2, (java.lang.Class<?>[]) r4)     // Catch:{ Throwable -> 0x004c }
            java.lang.Object r1 = r1.f25654a     // Catch:{ Throwable -> 0x004c }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Throwable -> 0x004c }
            if (r1 == 0) goto L_0x004c
            boolean r6 = r1.containsKey(r6)     // Catch:{ Throwable -> 0x004c }
            if (r6 != 0) goto L_0x004c
            return r3
        L_0x0035:
            com.bytedance.common.utility.f.b r1 = r5.f120133a     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "mActivities"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x004c }
            com.bytedance.common.utility.f.b r1 = r1.mo17051a(r2, (java.lang.Class<?>[]) r4)     // Catch:{ Throwable -> 0x004c }
            java.lang.Object r1 = r1.f25654a     // Catch:{ Throwable -> 0x004c }
            android.util.ArrayMap r1 = (android.util.ArrayMap) r1     // Catch:{ Throwable -> 0x004c }
            if (r1 == 0) goto L_0x004c
            boolean r6 = r1.containsKey(r6)     // Catch:{ Throwable -> 0x004c }
            if (r6 != 0) goto L_0x004c
            return r3
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.p2387a.C47656a.m103157a(android.os.IBinder):boolean");
    }
}
