package com.bytedance.frameworks.baselib.p565a;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.a.f */
final class C9805f extends Thread {

    /* renamed from: a */
    final Object f26675a = new Object();

    /* renamed from: b */
    private final Context f26676b;

    /* renamed from: c */
    private final AtomicBoolean f26677c;

    /* renamed from: d */
    private final C9794a f26678d;

    /* renamed from: e */
    private long f26679e = -1;

    /* renamed from: f */
    private long f26680f = 0;

    /* renamed from: g */
    private long f26681g = 120000;

    /* renamed from: h */
    private C9804e f26682h;

    /* renamed from: i */
    private final LinkedList<C9800c> f26683i;

    /* renamed from: c */
    private boolean m19635c() {
        return this.f26677c.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r6.f26678d.mo17639a(r0.f26666f, r0.f26662b) < Long.MAX_VALUE) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r6.f26678d.mo17641a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r6.f26678d.mo17641a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19632a() {
        /*
            r6 = this;
            boolean r0 = r6.m19635c()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r2 = r6.f26683i
            monitor-enter(r2)
            boolean r3 = r6.m19635c()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            return r1
        L_0x0014:
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r1 = r6.f26683i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0024
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r0 = r6.f26683i     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.baselib.a.c r0 = (com.bytedance.frameworks.baselib.p565a.C9800c) r0     // Catch:{ all -> 0x004e }
        L_0x0024:
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r1 = r6.f26683i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            r1 = r1 ^ 1
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004d
            com.bytedance.frameworks.baselib.a.a r2 = r6.f26678d     // Catch:{ SQLiteFullException -> 0x0048 }
            java.lang.String r3 = r0.f26666f     // Catch:{ SQLiteFullException -> 0x0048 }
            byte[] r0 = r0.f26662b     // Catch:{ SQLiteFullException -> 0x0048 }
            long r2 = r2.mo17639a(r3, r0)     // Catch:{ SQLiteFullException -> 0x0048 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            com.bytedance.frameworks.baselib.a.a r0 = r6.f26678d     // Catch:{ SQLiteFullException -> 0x0048 }
            r0.mo17641a()     // Catch:{ SQLiteFullException -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            com.bytedance.frameworks.baselib.a.a r0 = r6.f26678d
            r0.mo17641a()
        L_0x004d:
            return r1
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p565a.C9805f.m19632a():boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r6.m19635c()
            if (r0 != 0) goto L_0x004b
            boolean r0 = r6.m19632a()
            boolean r1 = r6.m19635c()
            if (r1 != 0) goto L_0x004b
            boolean r1 = r6.m19634b()
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            boolean r1 = r6.m19635c()
            if (r1 != 0) goto L_0x004b
            if (r0 == 0) goto L_0x002c
            r0 = 5000(0x1388, double:2.4703E-320)
            sleep(r0)     // Catch:{ InterruptedException -> 0x002a }
            goto L_0x0000
        L_0x002a:
            goto L_0x0000
        L_0x002c:
            java.lang.Object r0 = r6.f26675a
            monitor-enter(r0)
            long r1 = r6.f26681g     // Catch:{ InterruptedException -> 0x0047 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            java.lang.Object r1 = r6.f26675a     // Catch:{ InterruptedException -> 0x0047 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0047 }
            goto L_0x0047
        L_0x003d:
            java.lang.Object r1 = r6.f26675a     // Catch:{ InterruptedException -> 0x0047 }
            long r2 = r6.f26681g     // Catch:{ InterruptedException -> 0x0047 }
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0047 }
            goto L_0x0047
        L_0x0045:
            r1 = move-exception
            goto L_0x0049
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0000
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p565a.C9805f.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0109, code lost:
        if ((r12 - r4.f26659g) >= r16) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x024d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x024e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19634b() {
        /*
            r26 = this;
            r1 = r26
            boolean r0 = r26.m19635c()
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = r1.f26679e
            r0 = 0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0077
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r1.f26680f
            long r3 = r3 - r7
            r7 = 600000(0x927c0, double:2.964394E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0077
            r1.f26679e = r5
            boolean r3 = r26.m19635c()
            if (r3 != 0) goto L_0x0071
            com.bytedance.frameworks.baselib.a.e r3 = r1.f26682h
            java.util.Map<java.lang.String, com.bytedance.frameworks.baselib.a.b> r3 = r3.f26670a
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
            boolean r8 = r26.m19635c()
            if (r8 != 0) goto L_0x0068
            java.lang.Object r8 = r3.get(r7)
            com.bytedance.frameworks.baselib.a.b r8 = (com.bytedance.frameworks.baselib.p565a.C9796b) r8
            if (r8 == 0) goto L_0x003d
            com.bytedance.frameworks.baselib.a.b$b r8 = r8.f26655c
            if (r8 == 0) goto L_0x003d
            com.bytedance.frameworks.baselib.a.a r9 = r1.f26678d
            int r8 = r8.mo16501c()
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            r9.mo17642a(r7, r8, r10)
            goto L_0x003d
        L_0x0068:
            com.bytedance.frameworks.baselib.a.a r3 = r1.f26678d
            r4 = -1
            r7 = 864000000(0x337f9800, double:4.26872718E-315)
            r3.mo17642a(r0, r4, r7)
        L_0x0071:
            long r3 = java.lang.System.currentTimeMillis()
            r1.f26680f = r3
        L_0x0077:
            android.content.Context r3 = r1.f26676b
            com.bytedance.frameworks.baselib.a.d$b r4 = com.bytedance.frameworks.baselib.p565a.C9801d.f26667a
            boolean r3 = r4.mo16513a(r3)
            r7 = 120000(0x1d4c0, double:5.9288E-319)
            if (r3 != 0) goto L_0x0087
            r1.f26681g = r7
            return r2
        L_0x0087:
            com.bytedance.frameworks.baselib.a.a r3 = r1.f26678d
            long r9 = r1.f26679e
            com.bytedance.frameworks.baselib.a.c r3 = r3.mo17640a(r9)
            if (r3 != 0) goto L_0x00b1
            long r3 = r1.f26679e
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00a4
            com.bytedance.frameworks.baselib.a.a r3 = r1.f26678d
            long r3 = r3.mo17638a(r0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00a4
            r1.f26681g = r5
            return r2
        L_0x00a4:
            long r3 = r1.f26679e
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            r1.f26681g = r7
        L_0x00ae:
            r1.f26679e = r5
            return r2
        L_0x00b1:
            long r9 = r1.f26679e
            long r11 = r3.f26661a
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00be
            long r9 = r3.f26661a
            r1.f26679e = r9
            goto L_0x00c5
        L_0x00be:
            long r9 = r1.f26679e
            r11 = 1
            long r9 = r9 + r11
            r1.f26679e = r9
        L_0x00c5:
            byte[] r4 = r3.f26662b
            r9 = 1
            if (r4 == 0) goto L_0x0241
            byte[] r4 = r3.f26662b
            int r4 = r4.length
            if (r4 > 0) goto L_0x00d1
            goto L_0x0241
        L_0x00d1:
            com.bytedance.frameworks.baselib.a.e r4 = r1.f26682h
            java.lang.String r10 = r3.f26666f
            com.bytedance.frameworks.baselib.a.b r4 = r4.mo17647a(r10)
            if (r4 != 0) goto L_0x00dc
            return r9
        L_0x00dc:
            com.bytedance.frameworks.baselib.a.b$b r10 = r4.f26655c
            com.bytedance.frameworks.baselib.a.b$c r11 = r4.f26658f
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r10.mo16502d()
            if (r11 == 0) goto L_0x01cd
            boolean r16 = r11.mo16503a()
            if (r16 == 0) goto L_0x00f7
            r2 = r3
            r3 = r10
            r13 = 1
        L_0x00f3:
            r18 = 0
            goto L_0x0247
        L_0x00f7:
            long r16 = r11.mo16504b()
            long r7 = r4.f26660h
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            r19 = r3
            long r2 = r4.f26659g
            long r2 = r12 - r2
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            goto L_0x010e
        L_0x010c:
            r19 = r3
        L_0x010e:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x011b
            long r2 = r4.f26659g
            long r2 = r12 - r2
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
        L_0x011a:
            return r9
        L_0x011b:
            long r2 = java.lang.System.currentTimeMillis()
            r4.f26659g = r2
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0138
            r2 = r19
            int r0 = r2.f26664d
            if (r0 <= 0) goto L_0x013a
            long r7 = r2.f26665e
            long r12 = r12 - r7
            int r0 = r2.f26664d
            long r7 = (long) r0
            long r14 = r14 * r7
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x013a
            return r9
        L_0x0138:
            r2 = r19
        L_0x013a:
            java.lang.String r3 = r4.f26657e
            java.util.List r0 = r10.mo16500b()
            if (r0 != 0) goto L_0x0143
            return r9
        L_0x0143:
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01bc }
            if (r7 != 0) goto L_0x0151
            byte[] r7 = r2.f26662b     // Catch:{ Throwable -> 0x01bc }
            boolean r7 = m19633a(r4, r3, r7)     // Catch:{ Throwable -> 0x01bc }
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
            boolean r15 = r11.mo16505c()     // Catch:{ Throwable -> 0x01b3 }
            if (r15 != 0) goto L_0x016f
            if (r8 != 0) goto L_0x0195
        L_0x016f:
            boolean r15 = r26.m19635c()     // Catch:{ Throwable -> 0x01b3 }
            if (r15 == 0) goto L_0x0176
            return r9
        L_0x0176:
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x01b3 }
            if (r15 != 0) goto L_0x0192
            boolean r15 = r14.equals(r3)     // Catch:{ Throwable -> 0x01b3 }
            if (r15 == 0) goto L_0x0183
            goto L_0x0192
        L_0x0183:
            byte[] r8 = r2.f26662b     // Catch:{ Throwable -> 0x01b3 }
            boolean r8 = m19633a(r4, r14, r8)     // Catch:{ Throwable -> 0x01b3 }
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
            long r11 = r11.mo16506d()     // Catch:{ Throwable -> 0x01b0 }
            r4.f26660h = r11     // Catch:{ Throwable -> 0x01b0 }
            r0 = r3
            r7 = r8
            goto L_0x023d
        L_0x01ac:
            r4.f26660h = r5     // Catch:{ Throwable -> 0x01b0 }
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
            r4.f26660h = r5     // Catch:{ Throwable -> 0x01b5 }
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
            int r0 = r2.f26664d
            if (r0 <= 0) goto L_0x01e3
            long r7 = r2.f26665e
            long r12 = r12 - r7
            int r0 = r2.f26664d
            long r7 = (long) r0
            long r14 = r14 * r7
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e3
            return r9
        L_0x01e3:
            java.lang.String r3 = r4.f26657e
            java.util.List r0 = r10.mo16500b()
            if (r0 != 0) goto L_0x01ec
            return r9
        L_0x01ec:
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0230 }
            if (r7 != 0) goto L_0x01f9
            byte[] r7 = r2.f26662b     // Catch:{ Throwable -> 0x0230 }
            boolean r7 = m19633a(r4, r3, r7)     // Catch:{ Throwable -> 0x0230 }
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
            boolean r11 = r26.m19635c()     // Catch:{ Throwable -> 0x022e }
            if (r11 == 0) goto L_0x0213
            return r9
        L_0x0213:
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x022e }
            if (r11 != 0) goto L_0x0200
            boolean r11 = r8.equals(r3)     // Catch:{ Throwable -> 0x022e }
            if (r11 != 0) goto L_0x0200
            byte[] r11 = r2.f26662b     // Catch:{ Throwable -> 0x022e }
            boolean r11 = m19633a(r4, r8, r11)     // Catch:{ Throwable -> 0x022e }
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
            boolean r7 = r26.m19635c()
            if (r7 == 0) goto L_0x024e
            return r9
        L_0x024e:
            if (r18 == 0) goto L_0x0262
            com.bytedance.frameworks.baselib.a.a r0 = r1.f26678d
            long r2 = r2.f26661a
            r22 = 1
            r23 = 0
            r25 = 0
            r19 = r0
            r20 = r2
            r19.mo17643a(r20, r22, r23, r25)
            goto L_0x0298
        L_0x0262:
            if (r13 == 0) goto L_0x0266
            r4.f26657e = r0
        L_0x0266:
            com.bytedance.frameworks.baselib.a.a r10 = r1.f26678d
            long r11 = r2.f26661a
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r16 = r3.mo16501c()
            boolean r0 = r10.mo17643a(r11, r13, r14, r16)
            if (r0 == 0) goto L_0x0293
            long r3 = r3.mo16502d()
            int r0 = r2.f26664d
            int r0 = r0 + r9
            long r7 = (long) r0
            long r3 = r3 * r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0287
            r1.f26681g = r3
        L_0x0287:
            long r2 = r1.f26681g
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = java.lang.Math.min(r4, r2)
            r1.f26681g = r2
            goto L_0x0298
        L_0x0293:
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            r1.f26681g = r4
        L_0x0298:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p565a.C9805f.m19634b():boolean");
    }

    /* renamed from: a */
    private static boolean m19633a(C9796b bVar, String str, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 0 || bVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bVar.mo16507a(str, bArr);
    }

    C9805f(Context context, C9804e eVar, LinkedList<C9800c> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f26682h = eVar;
        this.f26676b = context;
        this.f26683i = linkedList;
        this.f26677c = atomicBoolean;
        this.f26678d = C9794a.m19604a(this.f26676b);
    }
}
