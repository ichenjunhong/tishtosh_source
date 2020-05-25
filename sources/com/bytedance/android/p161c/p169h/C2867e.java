package com.bytedance.android.p161c.p169h;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.p161c.p163b.C2845a;
import com.bytedance.android.p161c.p169h.p170a.C2859b;
import java.io.InputStream;

/* renamed from: com.bytedance.android.c.h.e */
public final class C2867e implements Runnable {

    /* renamed from: a */
    private InputStream f8530a;

    /* renamed from: b */
    private C2859b f8531b;

    /* renamed from: c */
    private long f8532c;

    /* renamed from: d */
    private Handler f8533d;

    /* renamed from: e */
    private String f8534e;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "Decompress runnable start!"
            com.bytedance.android.c.f.a r2 = com.bytedance.android.p161c.p167f.C2852b.m8146a()
            r2.mo7484e(r0, r1)
            long r0 = r12.f8532c
            r2 = 0
            java.lang.String r3 = r12.f8534e     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0067 }
            r6 = 0
            java.io.InputStream r7 = r12.f8530a     // Catch:{ Exception -> 0x0067 }
            r5[r6] = r7     // Catch:{ Exception -> 0x0067 }
            java.io.InputStream r3 = com.bytedance.android.p161c.p165d.C2849a.m8135a(r3, r5)     // Catch:{ Exception -> 0x0067 }
            if (r3 != 0) goto L_0x0039
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            java.lang.String r1 = "UnSupport method!"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r12.m8167a(r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r3 == 0) goto L_0x0033
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r3)
        L_0x0033:
            return
        L_0x0034:
            r0 = move-exception
            goto L_0x0072
        L_0x0036:
            r0 = move-exception
            r2 = r3
            goto L_0x0068
        L_0x0039:
            r2 = 32768(0x8000, float:4.5918E-41)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
        L_0x003e:
            int r11 = r3.read(r2)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r5 = -1
            if (r11 == r5) goto L_0x0051
            com.bytedance.android.c.h.a.b r5 = r12.f8531b     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r7 = 0
            r6 = r2
            r8 = r11
            r9 = r0
            r5.mo7489a(r6, r7, r8, r9)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            long r5 = (long) r11     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            long r0 = r0 + r5
            goto L_0x003e
        L_0x0051:
            android.os.Handler r0 = r12.f8533d     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            android.os.Message r0 = android.os.Message.obtain(r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r0.what = r4     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            android.os.Handler r1 = r12.f8533d     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r1.sendMessage(r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r3 == 0) goto L_0x0071
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r3)
            return
        L_0x0064:
            r0 = move-exception
            r3 = r2
            goto L_0x0072
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            r12.m8167a(r0)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x0071
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r2)
            return
        L_0x0071:
            return
        L_0x0072:
            if (r3 == 0) goto L_0x0077
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r3)
        L_0x0077:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.p169h.C2867e.run():void");
    }

    /* renamed from: a */
    private void m8167a(Exception exc) {
        Message obtain = Message.obtain(this.f8533d);
        obtain.what = 0;
        obtain.obj = new C2845a(6, "Exception while decompress!", exc);
        this.f8533d.sendMessage(obtain);
    }

    public C2867e(InputStream inputStream, C2859b bVar, long j, Handler handler, String str) {
        this.f8530a = inputStream;
        this.f8531b = bVar;
        this.f8532c = j;
        this.f8533d = handler;
        this.f8534e = str;
    }
}
