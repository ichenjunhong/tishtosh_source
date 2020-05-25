package com.bytedance.android.p140a.p141a.p144c;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.a.a.c.c */
abstract class C2781c implements Runnable {

    /* renamed from: a */
    private static final AtomicInteger f8346a = new AtomicInteger(1);

    C2781c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7365a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract String mo7377b();

    public final void run() {
        String name = Thread.currentThread().getName();
        try {
            String b = mo7377b();
            if (TextUtils.isEmpty(b)) {
                b = "track_task";
            }
            Thread currentThread = Thread.currentThread();
            StringBuilder sb = new StringBuilder("ByteAdTracker#");
            sb.append(b);
            sb.append("_");
            sb.append(f8346a.getAndIncrement());
            currentThread.setName(sb.toString());
        } catch (Throwable unused) {
        }
        mo7365a();
        try {
            Thread.currentThread().setName(name);
        } catch (Throwable unused2) {
        }
    }
}
