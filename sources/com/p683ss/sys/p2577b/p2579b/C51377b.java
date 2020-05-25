package com.p683ss.sys.p2577b.p2579b;

/* renamed from: com.ss.sys.b.b.b */
public final class C51377b {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(4:1|2|3|(7:4|5|(3:6|7|(1:9)(1:46))|10|(1:12)(1:13)|14|(2:16|17)))|18|19|44|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        if (r2 == null) goto L_0x008f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC, Splitter:B:29:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080 A[SYNTHETIC, Splitter:B:33:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[SYNTHETIC, Splitter:B:40:0x0087] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m110496a(java.lang.String r8, byte[] r9) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            r2.<init>()     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            com.bytedance.retrofit2.q r3 = com.bytedance.ttnet.p887e.C13333g.m26867b(r8)     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            java.lang.Class<com.ss.sys.b.b.c> r4 = com.p683ss.sys.p2577b.p2579b.C51378c.class
            java.lang.Object r3 = r3.mo23937a(r4)     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            com.ss.sys.b.b.c r3 = (com.p683ss.sys.p2577b.p2579b.C51378c) r3     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            com.bytedance.retrofit2.mime.TypedByteArray r4 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            java.lang.String r5 = "application/octet-stream"
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            r4.<init>(r5, r9, r7)     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            com.bytedance.retrofit2.b r8 = r3.mo102055a(r8, r2, r4)     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            com.bytedance.retrofit2.u r8 = r8.execute()     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            int r9 = r8.mo23958a()     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            r2.<init>()     // Catch:{ Throwable -> 0x0084, all -> 0x0075 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch:{ Throwable -> 0x0073, all -> 0x0071 }
            T r8 = r8.f33552b     // Catch:{ Throwable -> 0x0073, all -> 0x0071 }
            com.bytedance.retrofit2.mime.TypedInput r8 = (com.bytedance.retrofit2.mime.TypedInput) r8     // Catch:{ Throwable -> 0x0073, all -> 0x0071 }
            java.io.InputStream r8 = r8.mo9554in()     // Catch:{ Throwable -> 0x0073, all -> 0x0071 }
        L_0x003b:
            int r1 = r8.read(r4, r6, r3)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            if (r1 <= 0) goto L_0x0045
            r2.write(r4, r6, r1)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            goto L_0x003b
        L_0x0045:
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L_0x0059
            java.lang.String r1 = "{\"code\":%d}"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r3[r6] = r9     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            java.lang.String r9 = com.C2240a.m6772a(r1, r3)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            goto L_0x0062
        L_0x0059:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            byte[] r1 = r2.toByteArray()     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
            r9.<init>(r1)     // Catch:{ Throwable -> 0x006f, all -> 0x006c }
        L_0x0062:
            r0 = r9
            if (r8 == 0) goto L_0x0068
            r8.close()     // Catch:{ Throwable -> 0x0068 }
        L_0x0068:
            r2.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x008f
        L_0x006c:
            r9 = move-exception
            r1 = r8
            goto L_0x0077
        L_0x006f:
            r1 = r8
            goto L_0x0085
        L_0x0071:
            r9 = move-exception
            goto L_0x0077
        L_0x0073:
            goto L_0x0085
        L_0x0075:
            r9 = move-exception
            r2 = r1
        L_0x0077:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ Throwable -> 0x007d }
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()     // Catch:{ Throwable -> 0x0083 }
        L_0x0083:
            throw r9
        L_0x0084:
            r2 = r1
        L_0x0085:
            if (r1 == 0) goto L_0x008c
            r1.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            if (r2 == 0) goto L_0x008f
            goto L_0x0068
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2577b.p2579b.C51377b.m110496a(java.lang.String, byte[]):java.lang.String");
    }
}
