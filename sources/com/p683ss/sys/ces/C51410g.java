package com.p683ss.sys.ces;

/* renamed from: com.ss.sys.ces.g */
public final class C51410g {

    /* renamed from: a */
    public static int f128554a = 7200;

    /* renamed from: b */
    public static int f128555b = 1800;

    /* renamed from: c */
    public static int f128556c = 180;

    /* renamed from: d */
    public static int f128557d = 120;

    /* renamed from: e */
    public static int f128558e = 1800;

    /* renamed from: f */
    public static int f128559f;

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        if (r6 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f8 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2 A[SYNTHETIC, Splitter:B:46:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee A[SYNTHETIC, Splitter:B:53:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5 A[SYNTHETIC, Splitter:B:57:0x00f5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m110572a(android.content.Context r13, int r14) {
        /*
            java.lang.Class<com.ss.sys.ces.g> r14 = com.p683ss.sys.ces.C51410g.class
            monitor-enter(r14)
            r0 = 0
            com.p683ss.sys.ces.C51393c.f128504k = r0     // Catch:{ all -> 0x0161 }
            r1 = 0
        L_0x0007:
            r2 = 3
            if (r1 >= r2) goto L_0x015f
            boolean r2 = com.p683ss.sys.ces.C51393c.f128502b     // Catch:{ all -> 0x0161 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00f9
            com.ss.sys.ces.c.g r2 = new com.ss.sys.ces.c.g     // Catch:{ Throwable -> 0x0106 }
            java.lang.String r5 = com.p683ss.sys.ces.C51393c.m110540f()     // Catch:{ Throwable -> 0x0106 }
            r2.<init>(r13, r5)     // Catch:{ Throwable -> 0x0106 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r5.<init>()     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            com.bytedance.retrofit2.a.b r6 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r7 = "Cookie"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r9 = "sessionid="
            r8.<init>(r9)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r9 = r2.f128540a     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r8.append(r9)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r6 = r2.f128542c     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            com.bytedance.retrofit2.q r6 = com.bytedance.ttnet.p887e.C13333g.m26867b(r6)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.Class<com.ss.sys.ces.c.d> r7 = com.p683ss.sys.ces.p2582c.C51400d.class
            java.lang.Object r6 = r6.mo23937a(r7)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            com.ss.sys.ces.c.d r6 = (com.p683ss.sys.ces.p2582c.C51400d) r6     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.lang.String r7 = r2.f128542c     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            com.bytedance.retrofit2.b r5 = r6.mo102119a(r7, r5)     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            com.bytedance.retrofit2.u r5 = r5.execute()     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r6.<init>()     // Catch:{ Throwable -> 0x00dd, all -> 0x00d9 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r7]     // Catch:{ Throwable -> 0x00de }
            T r5 = r5.f33552b     // Catch:{ Throwable -> 0x00de }
            com.bytedance.retrofit2.mime.TypedInput r5 = (com.bytedance.retrofit2.mime.TypedInput) r5     // Catch:{ Throwable -> 0x00de }
            java.io.InputStream r5 = r5.mo9554in()     // Catch:{ Throwable -> 0x00de }
        L_0x0061:
            int r3 = r5.read(r8, r0, r7)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            if (r3 <= 0) goto L_0x006b
            r6.write(r8, r0, r3)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            goto L_0x0061
        L_0x006b:
            byte[] r3 = r6.toByteArray()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            if (r3 == 0) goto L_0x00cc
            r7 = 200(0xc8, float:2.8E-43)
            android.content.Context r2 = r2.f128541b     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            java.lang.Object r2 = com.p683ss.sys.ces.C51379a.meta(r7, r2, r3)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            if (r2 == 0) goto L_0x00cc
            int r3 = r2.length()     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            if (r3 <= 0) goto L_0x00cc
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            java.lang.String r2 = "result"
            int r2 = r3.optInt(r2, r0)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            java.lang.String r7 = "t1"
            int r8 = f128554a     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r7 = r3.optInt(r7, r8)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r7 = r7 / r4
            java.lang.String r8 = "t2"
            int r9 = f128555b     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r8 = r3.optInt(r8, r9)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r8 = r8 / r4
            java.lang.String r9 = "t3"
            int r10 = f128556c     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r9 = r3.optInt(r9, r10)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r9 = r9 / r4
            java.lang.String r10 = "t4"
            int r11 = f128557d     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r10 = r3.optInt(r10, r11)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r10 = r10 / r4
            java.lang.String r11 = "t5"
            int r12 = f128558e     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r3 = r3.optInt(r11, r12)     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            int r3 = r3 / r4
            if (r2 != r4) goto L_0x00ca
            f128554a = r7     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            f128555b = r8     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            f128556c = r9     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            f128557d = r10     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            f128558e = r3     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            com.p683ss.sys.ces.C51393c.f128504k = r4     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
            goto L_0x00cc
        L_0x00ca:
            com.p683ss.sys.ces.C51393c.f128504k = r0     // Catch:{ Throwable -> 0x00d7, all -> 0x00d5 }
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
            r5.close()     // Catch:{ Throwable -> 0x00d1 }
        L_0x00d1:
            r6.close()     // Catch:{ Throwable -> 0x0106 }
            goto L_0x0106
        L_0x00d5:
            r2 = move-exception
            goto L_0x00ec
        L_0x00d7:
            r3 = r5
            goto L_0x00de
        L_0x00d9:
            r2 = move-exception
            r5 = r3
            r6 = r5
            goto L_0x00ec
        L_0x00dd:
            r6 = r3
        L_0x00de:
            com.p683ss.sys.ces.C51393c.f128504k = r0     // Catch:{ all -> 0x00ea }
            if (r3 == 0) goto L_0x00e7
            r3.close()     // Catch:{ Throwable -> 0x00e6 }
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            if (r6 == 0) goto L_0x0106
            goto L_0x00d1
        L_0x00ea:
            r2 = move-exception
            r5 = r3
        L_0x00ec:
            if (r5 == 0) goto L_0x00f3
            r5.close()     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
        L_0x00f3:
            if (r6 == 0) goto L_0x00f8
            r6.close()     // Catch:{ Throwable -> 0x00f8 }
        L_0x00f8:
            throw r2     // Catch:{ Throwable -> 0x0106 }
        L_0x00f9:
            com.ss.sys.ces.c.c r2 = new com.ss.sys.ces.c.c     // Catch:{ all -> 0x0161 }
            java.lang.String r5 = com.p683ss.sys.ces.C51393c.m110540f()     // Catch:{ all -> 0x0161 }
            r2.<init>(r13, r5)     // Catch:{ all -> 0x0161 }
            r5 = 2
            r2.mo37726a(r5, r5, r3)     // Catch:{ all -> 0x0161 }
        L_0x0106:
            int r1 = r1 + 1
            int r2 = r1 * 3000
            long r2 = (long) r2     // Catch:{ all -> 0x0161 }
            com.p683ss.p1096a.p1098b.C18484d.m44731a(r2)     // Catch:{ all -> 0x0161 }
            boolean r2 = com.p683ss.sys.ces.C51393c.f128504k     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x0158
            int r13 = f128554a     // Catch:{ all -> 0x0161 }
            if (r13 <= 0) goto L_0x0120
            int r0 = r13 / 60
            if (r0 <= 0) goto L_0x011d
            int r13 = r13 / 60
            goto L_0x011e
        L_0x011d:
            r13 = 1
        L_0x011e:
            com.p683ss.sys.ces.C51405d.f128543a = r13     // Catch:{ all -> 0x0161 }
        L_0x0120:
            int r13 = f128555b     // Catch:{ all -> 0x0161 }
            if (r13 <= 0) goto L_0x012e
            int r0 = r13 / 60
            if (r0 <= 0) goto L_0x012b
            int r13 = r13 / 60
            goto L_0x012c
        L_0x012b:
            r13 = 1
        L_0x012c:
            com.p683ss.sys.ces.C51405d.f128544b = r13     // Catch:{ all -> 0x0161 }
        L_0x012e:
            int r13 = f128556c     // Catch:{ all -> 0x0161 }
            if (r13 <= 0) goto L_0x013c
            int r0 = r13 / 60
            if (r0 <= 0) goto L_0x0139
            int r13 = r13 / 60
            goto L_0x013a
        L_0x0139:
            r13 = 1
        L_0x013a:
            com.p683ss.sys.ces.C51405d.f128545c = r13     // Catch:{ all -> 0x0161 }
        L_0x013c:
            int r13 = f128557d     // Catch:{ all -> 0x0161 }
            if (r13 <= 0) goto L_0x014a
            int r0 = r13 / 60
            if (r0 <= 0) goto L_0x0147
            int r13 = r13 / 60
            goto L_0x0148
        L_0x0147:
            r13 = 1
        L_0x0148:
            com.p683ss.sys.ces.C51405d.f128546d = r13     // Catch:{ all -> 0x0161 }
        L_0x014a:
            int r13 = f128558e     // Catch:{ all -> 0x0161 }
            if (r13 <= 0) goto L_0x0156
            int r0 = r13 / 60
            if (r0 <= 0) goto L_0x0154
            int r4 = r13 / 60
        L_0x0154:
            com.p683ss.sys.ces.C51405d.f128547e = r4     // Catch:{ all -> 0x0161 }
        L_0x0156:
            monitor-exit(r14)
            return
        L_0x0158:
            int r2 = f128559f     // Catch:{ all -> 0x0161 }
            int r2 = r2 + r4
            f128559f = r2     // Catch:{ all -> 0x0161 }
            goto L_0x0007
        L_0x015f:
            monitor-exit(r14)
            return
        L_0x0161:
            r13 = move-exception
            monitor-exit(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.C51410g.m110572a(android.content.Context, int):void");
    }
}
