package com.bytedance.p582g.p583a.p591c;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.g.a.c.f */
final class C9995f extends Thread {

    /* renamed from: a */
    final Object f27132a = new Object();

    /* renamed from: b */
    private final Context f27133b;

    /* renamed from: c */
    private final AtomicBoolean f27134c;

    /* renamed from: d */
    private final C9994e f27135d;

    /* renamed from: e */
    private long f27136e = -1;

    /* renamed from: f */
    private long f27137f = 0;

    /* renamed from: g */
    private long f27138g = 120000;

    /* renamed from: h */
    private C9993d f27139h;

    /* renamed from: i */
    private final LinkedList<C9989b> f27140i;

    /* renamed from: c */
    private boolean m20105c() {
        return this.f27134c.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r6.f27135d.mo17960a(r0.f27120f, r0.f27116b) < Long.MAX_VALUE) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r6.f27135d.mo17962a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r6.f27135d.mo17962a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20102a() {
        /*
            r6 = this;
            boolean r0 = r6.m20105c()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.LinkedList<com.bytedance.g.a.c.b> r2 = r6.f27140i
            monitor-enter(r2)
            boolean r3 = r6.m20105c()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            return r1
        L_0x0014:
            java.util.LinkedList<com.bytedance.g.a.c.b> r1 = r6.f27140i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0024
            java.util.LinkedList<com.bytedance.g.a.c.b> r0 = r6.f27140i     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x004e }
            com.bytedance.g.a.c.b r0 = (com.bytedance.p582g.p583a.p591c.C9989b) r0     // Catch:{ all -> 0x004e }
        L_0x0024:
            java.util.LinkedList<com.bytedance.g.a.c.b> r1 = r6.f27140i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            r1 = r1 ^ 1
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004d
            com.bytedance.g.a.c.e r2 = r6.f27135d     // Catch:{ SQLiteFullException -> 0x0048 }
            java.lang.String r3 = r0.f27120f     // Catch:{ SQLiteFullException -> 0x0048 }
            byte[] r0 = r0.f27116b     // Catch:{ SQLiteFullException -> 0x0048 }
            long r2 = r2.mo17960a(r3, r0)     // Catch:{ SQLiteFullException -> 0x0048 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            com.bytedance.g.a.c.e r0 = r6.f27135d     // Catch:{ SQLiteFullException -> 0x0048 }
            r0.mo17962a()     // Catch:{ SQLiteFullException -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            com.bytedance.g.a.c.e r0 = r6.f27135d
            r0.mo17962a()
        L_0x004d:
            return r1
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p591c.C9995f.m20102a():boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r6.m20105c()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r6.m20102a()
            boolean r1 = r6.m20105c()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r6.m20104b()
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            boolean r1 = r6.m20105c()
            if (r1 != 0) goto L_0x0043
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r6.f27132a
            monitor-enter(r0)
            long r1 = r6.f27138g     // Catch:{ InterruptedException -> 0x003f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            java.lang.Object r1 = r6.f27132a     // Catch:{ InterruptedException -> 0x003f }
            r1.wait()     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x003f
        L_0x0035:
            java.lang.Object r1 = r6.f27132a     // Catch:{ InterruptedException -> 0x003f }
            long r2 = r6.f27138g     // Catch:{ InterruptedException -> 0x003f }
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x003f
        L_0x003d:
            r1 = move-exception
            goto L_0x0041
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0000
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p591c.C9995f.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0109, code lost:
        if ((r12 - r4.f27113h) >= r16) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x024d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x024e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20104b() {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r26.m20105c()
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = r1.f27136e
            r0 = 0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0077
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r1.f27137f
            long r3 = r3 - r7
            r7 = 600000(0x927c0, double:2.964394E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0077
            r1.f27136e = r5
            boolean r3 = r26.m20105c()
            if (r3 != 0) goto L_0x0071
            com.bytedance.g.a.c.d r3 = r1.f27139h
            java.util.Map<java.lang.String, com.bytedance.g.a.c.a> r3 = r3.f27124a
            if (r3 == 0) goto L_0x0068
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0068
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x003d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r26.m20105c()
            if (r8 != 0) goto L_0x0068
            java.lang.Object r8 = r3.get(r7)
            com.bytedance.g.a.c.a r8 = (com.bytedance.p582g.p583a.p591c.C9985a) r8
            if (r8 == 0) goto L_0x003d
            com.bytedance.g.a.c.a$b r8 = r8.f27109d
            if (r8 == 0) goto L_0x003d
            com.bytedance.g.a.c.e r9 = r1.f27135d
            int r8 = r8.mo17930c()
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            r9.mo17963a(r7, r8, r10)
            goto L_0x003d
        L_0x0068:
            com.bytedance.g.a.c.e r3 = r1.f27135d
            r4 = -1
            r7 = 864000000(0x337f9800, double:4.26872718E-315)
            r3.mo17963a(r0, r4, r7)
        L_0x0071:
            long r3 = java.lang.System.currentTimeMillis()
            r1.f27137f = r3
        L_0x0077:
            android.content.Context r3 = r1.f27133b
            com.bytedance.g.a.c.c$b r4 = com.bytedance.p582g.p583a.p591c.C9990c.f27121a
            boolean r3 = r4.mo17955a(r3)
            r7 = 120000(0x1d4c0, double:5.9288E-319)
            if (r3 != 0) goto L_0x0087
            r1.f27138g = r7
            return r2
        L_0x0087:
            com.bytedance.g.a.c.e r3 = r1.f27135d
            long r9 = r1.f27136e
            com.bytedance.g.a.c.b r3 = r3.mo17961a(r9)
            if (r3 != 0) goto L_0x00b1
            long r3 = r1.f27136e
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00a4
            com.bytedance.g.a.c.e r3 = r1.f27135d
            long r3 = r3.mo17959a(r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00a4
            r1.f27138g = r5
            return r2
        L_0x00a4:
            long r3 = r1.f27136e
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            r1.f27138g = r7
        L_0x00ae:
            r1.f27136e = r5
            return r2
        L_0x00b1:
            long r9 = r1.f27136e
            long r11 = r3.f27115a
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00be
            long r9 = r3.f27115a
            r1.f27136e = r9
            goto L_0x00c5
        L_0x00be:
            long r9 = r1.f27136e
            r11 = 1
            long r9 = r9 + r11
            r1.f27136e = r9
        L_0x00c5:
            byte[] r4 = r3.f27116b
            r9 = 1
            if (r4 == 0) goto L_0x0241
            byte[] r4 = r3.f27116b
            int r4 = r4.length
            if (r4 > 0) goto L_0x00d1
            goto L_0x0241
        L_0x00d1:
            com.bytedance.g.a.c.d r4 = r1.f27139h
            java.lang.String r10 = r3.f27120f
            com.bytedance.g.a.c.a r4 = r4.mo17956a(r10)
            if (r4 != 0) goto L_0x00dc
            return r9
        L_0x00dc:
            com.bytedance.g.a.c.a$b r10 = r4.f27109d
            com.bytedance.g.a.c.a$c r11 = r4.f27112g
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r10.mo17931d()
            if (r11 == 0) goto L_0x01cd
            boolean r16 = r11.mo17932a()
            if (r16 == 0) goto L_0x00f7
            r2 = r3
            r3 = r10
            r13 = 1
        L_0x00f3:
            r18 = 0
            goto L_0x0247
        L_0x00f7:
            long r16 = r11.mo17933b()
            long r7 = r4.f27114i
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            r19 = r3
            long r2 = r4.f27113h
            long r2 = r12 - r2
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            goto L_0x010e
        L_0x010c:
            r19 = r3
        L_0x010e:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x011b
            long r2 = r4.f27113h
            long r2 = r12 - r2
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
        L_0x011a:
            return r9
        L_0x011b:
            long r2 = java.lang.System.currentTimeMillis()
            r4.f27113h = r2
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0138
            r2 = r19
            int r0 = r2.f27118d
            if (r0 <= 0) goto L_0x013a
            long r7 = r2.f27119e
            long r12 = r12 - r7
            int r0 = r2.f27118d
            long r7 = (long) r0
            long r14 = r14 * r7
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x013a
            return r9
        L_0x0138:
            r2 = r19
        L_0x013a:
            java.lang.String r3 = r4.f27111f
            java.util.List r0 = r10.mo17929b()
            if (r0 != 0) goto L_0x0143
            return r9
        L_0x0143:
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01bc }
            if (r7 != 0) goto L_0x0151
            byte[] r7 = r2.f27116b     // Catch:{ Throwable -> 0x01bc }
            boolean r7 = m20103a(r4, r3, r7)     // Catch:{ Throwable -> 0x01bc }
            r8 = 1
            goto L_0x0153
        L_0x0151:
            r7 = 0
            r8 = 0
        L_0x0153:
            if (r7 != 0) goto L_0x01b8
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Throwable -> 0x01b5 }
            r13 = r7
            r7 = 0
        L_0x015b:
            boolean r14 = r12.hasNext()     // Catch:{ Throwable -> 0x01b3 }
            if (r14 == 0) goto L_0x0195
            java.lang.Object r14 = r12.next()     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x01b3 }
            boolean r15 = r11.mo17934c()     // Catch:{ Throwable -> 0x01b3 }
            if (r15 != 0) goto L_0x016f
            if (r8 != 0) goto L_0x0195
        L_0x016f:
            boolean r15 = r26.m20105c()     // Catch:{ Throwable -> 0x01b3 }
            if (r15 == 0) goto L_0x0176
            return r9
        L_0x0176:
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x01b3 }
            if (r15 != 0) goto L_0x0192
            boolean r15 = r14.equals(r3)     // Catch:{ Throwable -> 0x01b3 }
            if (r15 == 0) goto L_0x0183
            goto L_0x0192
        L_0x0183:
            byte[] r8 = r2.f27116b     // Catch:{ Throwable -> 0x01b3 }
            boolean r8 = m20103a(r4, r14, r8)     // Catch:{ Throwable -> 0x01b3 }
            if (r8 == 0) goto L_0x018d
            r3 = r14
            goto L_0x0196
        L_0x018d:
            int r7 = r7 + 1
            r13 = r8
            r8 = 1
            goto L_0x015b
        L_0x0192:
            int r7 = r7 + 1
            goto L_0x015b
        L_0x0195:
            r8 = r13
        L_0x0196:
            int r12 = r0.size()     // Catch:{ Throwable -> 0x01b0 }
            if (r7 != r12) goto L_0x01ac
            int r0 = r0.size()     // Catch:{ Throwable -> 0x01b0 }
            if (r0 <= r9) goto L_0x01ac
            long r11 = r11.mo17935d()     // Catch:{ Throwable -> 0x01b0 }
            r4.f27114i = r11     // Catch:{ Throwable -> 0x01b0 }
            r0 = r3
            r7 = r8
            goto L_0x023d
        L_0x01ac:
            r4.f27114i = r5     // Catch:{ Throwable -> 0x01b0 }
            r0 = r3
            goto L_0x01ca
        L_0x01b0:
            r0 = move-exception
            r13 = r8
            goto L_0x01be
        L_0x01b3:
            r0 = move-exception
            goto L_0x01be
        L_0x01b5:
            r0 = move-exception
            r13 = r7
            goto L_0x01be
        L_0x01b8:
            r4.f27114i = r5     // Catch:{ Throwable -> 0x01b5 }
            goto L_0x023c
        L_0x01bc:
            r0 = move-exception
            r13 = 0
        L_0x01be:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "send log exception: "
            r7.<init>(r8)
            r7.append(r0)
            r0 = r3
            r8 = r13
        L_0x01ca:
            r13 = r8
            goto L_0x023e
        L_0x01cd:
            r2 = r3
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e3
            int r0 = r2.f27118d
            if (r0 <= 0) goto L_0x01e3
            long r7 = r2.f27119e
            long r12 = r12 - r7
            int r0 = r2.f27118d
            long r7 = (long) r0
            long r14 = r14 * r7
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e3
            return r9
        L_0x01e3:
            java.lang.String r3 = r4.f27111f
            java.util.List r0 = r10.mo17929b()
            if (r0 != 0) goto L_0x01ec
            return r9
        L_0x01ec:
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0230 }
            if (r7 != 0) goto L_0x01f9
            byte[] r7 = r2.f27116b     // Catch:{ Throwable -> 0x0230 }
            boolean r7 = m20103a(r4, r3, r7)     // Catch:{ Throwable -> 0x0230 }
            goto L_0x01fa
        L_0x01f9:
            r7 = 0
        L_0x01fa:
            if (r7 != 0) goto L_0x023c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x022e }
        L_0x0200:
            boolean r8 = r0.hasNext()     // Catch:{ Throwable -> 0x022e }
            if (r8 == 0) goto L_0x023c
            java.lang.Object r8 = r0.next()     // Catch:{ Throwable -> 0x022e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Throwable -> 0x022e }
            boolean r11 = r26.m20105c()     // Catch:{ Throwable -> 0x022e }
            if (r11 == 0) goto L_0x0213
            return r9
        L_0x0213:
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x022e }
            if (r11 != 0) goto L_0x0200
            boolean r11 = r8.equals(r3)     // Catch:{ Throwable -> 0x022e }
            if (r11 != 0) goto L_0x0200
            byte[] r11 = r2.f27116b     // Catch:{ Throwable -> 0x022e }
            boolean r11 = m20103a(r4, r8, r11)     // Catch:{ Throwable -> 0x022e }
            if (r11 == 0) goto L_0x022c
            r0 = r8
            r3 = r10
            r13 = r11
            goto L_0x00f3
        L_0x022c:
            r7 = r11
            goto L_0x0200
        L_0x022e:
            r0 = move-exception
            goto L_0x0232
        L_0x0230:
            r0 = move-exception
            r7 = 0
        L_0x0232:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "send log exception: "
            r8.<init>(r11)
            r8.append(r0)
        L_0x023c:
            r0 = r3
        L_0x023d:
            r13 = r7
        L_0x023e:
            r3 = r10
            goto L_0x00f3
        L_0x0241:
            r2 = r3
            r3 = r0
            r4 = r3
            r13 = 0
            r18 = 1
        L_0x0247:
            boolean r7 = r26.m20105c()
            if (r7 == 0) goto L_0x024e
            return r9
        L_0x024e:
            if (r18 == 0) goto L_0x0262
            com.bytedance.g.a.c.e r0 = r1.f27135d
            long r2 = r2.f27115a
            r22 = 1
            r23 = 0
            r25 = 0
            r19 = r0
            r20 = r2
            r19.mo17964a(r20, r22, r23, r25)
            goto L_0x0298
        L_0x0262:
            if (r13 == 0) goto L_0x0266
            r4.f27111f = r0
        L_0x0266:
            com.bytedance.g.a.c.e r10 = r1.f27135d
            long r11 = r2.f27115a
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r16 = r3.mo17930c()
            boolean r0 = r10.mo17964a(r11, r13, r14, r16)
            if (r0 == 0) goto L_0x0293
            long r3 = r3.mo17931d()
            int r0 = r2.f27118d
            int r0 = r0 + r9
            long r7 = (long) r0
            long r3 = r3 * r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0287
            r1.f27138g = r3
        L_0x0287:
            long r2 = r1.f27138g
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = java.lang.Math.min(r4, r2)
            r1.f27138g = r2
            goto L_0x0298
        L_0x0293:
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            r1.f27138g = r4
        L_0x0298:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p591c.C9995f.m20104b():boolean");
    }

    /* renamed from: a */
    private static boolean m20103a(C9985a aVar, String str, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 0 || aVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return aVar.mo17936a(str, bArr);
    }

    C9995f(Context context, C9993d dVar, LinkedList<C9989b> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f27139h = dVar;
        this.f27133b = context;
        this.f27140i = linkedList;
        this.f27134c = atomicBoolean;
        this.f27135d = C9994e.m20093a(this.f27133b);
    }
}
