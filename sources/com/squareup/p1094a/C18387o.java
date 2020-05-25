package com.squareup.p1094a;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.util.LinkedHashMap;

/* renamed from: com.squareup.a.o */
public final class C18387o implements C18369d {

    /* renamed from: b */
    final LinkedHashMap<String, Bitmap> f50767b;

    /* renamed from: c */
    private final int f50768c;

    /* renamed from: d */
    private int f50769d;

    /* renamed from: e */
    private int f50770e;

    /* renamed from: f */
    private int f50771f;

    /* renamed from: g */
    private int f50772g;

    /* renamed from: h */
    private int f50773h;

    /* renamed from: a */
    public final synchronized int mo36815a() {
        return this.f50769d;
    }

    /* renamed from: b */
    public final synchronized int mo36818b() {
        return this.f50768c;
    }

    private C18387o(int i) {
        if (i > 0) {
            this.f50768c = i;
            this.f50767b = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public C18387o(Context context) {
        boolean z;
        ActivityManager activityManager = (ActivityManager) C18356aj.m44591a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        this((memoryClass * 1048576) / 7);
    }

    /* renamed from: a */
    public final Bitmap mo36816a(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = (Bitmap) this.f50767b.get(str);
                if (bitmap != null) {
                    this.f50772g++;
                    return bitmap;
                }
                this.f50773h++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44654a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f50769d     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f50767b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f50769d     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f50769d     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f50767b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f50767b     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f50767b     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f50769d     // Catch:{ all -> 0x0071 }
            int r0 = com.squareup.p1094a.C18356aj.m44587a(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f50769d = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f50771f     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f50771f = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p1094a.C18387o.m44654a(int):void");
    }

    /* renamed from: a */
    public final void mo36817a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f50770e++;
            this.f50769d += C18356aj.m44587a(bitmap);
            Bitmap bitmap2 = (Bitmap) this.f50767b.put(str, bitmap);
            if (bitmap2 != null) {
                this.f50769d -= C18356aj.m44587a(bitmap2);
            }
        }
        m44654a(this.f50768c);
    }
}
