package com.p683ss.sys.ces.p2580a;

/* renamed from: com.ss.sys.ces.a.b */
public final class C51381b {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(8:1|2|(1:4)|5|6|7|8|(6:9|10|(2:11|(1:13)(1:53))|14|(1:16)(2:17|(1:19))|(2:21|22)))|23|24|51|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r3 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b A[SYNTHETIC, Splitter:B:36:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[SYNTHETIC, Splitter:B:40:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[SYNTHETIC, Splitter:B:47:0x0099] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m110507a(android.content.Context r9) {
        /*
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            r2.<init>()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.io.File r3 = r9.getFilesDir()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.lang.String r3 = "/assets.czl"
            r2.append(r3)     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            if (r4 == 0) goto L_0x002b
            r1 = 2
            r3.delete()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
        L_0x002b:
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.lang.String r3 = "assets.czl"
            java.io.InputStream r9 = r9.open(r3)     // Catch:{ Throwable -> 0x0096, all -> 0x0087 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0084, all -> 0x007f }
            r3.<init>()     // Catch:{ Throwable -> 0x0084, all -> 0x007f }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
        L_0x0042:
            r5 = 0
            int r6 = r9.read(r4, r5, r0)     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            r7 = -1
            if (r6 == r7) goto L_0x004e
            r3.write(r4, r5, r6)     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            goto L_0x0042
        L_0x004e:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            byte[] r4 = r3.toByteArray()     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            r0.write(r4)     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            r0.close()     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            int r0 = r3.size()     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            if (r0 > 0) goto L_0x0065
            r1 = 3
            goto L_0x0071
        L_0x0065:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            boolean r0 = r0.exists()     // Catch:{ Throwable -> 0x0085, all -> 0x007a }
            if (r0 == 0) goto L_0x0071
            r1 = 0
        L_0x0071:
            if (r9 == 0) goto L_0x0076
            r9.close()     // Catch:{ Throwable -> 0x0076 }
        L_0x0076:
            r3.close()     // Catch:{ Throwable -> 0x00a1 }
            goto L_0x00a1
        L_0x007a:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0089
        L_0x007f:
            r1 = move-exception
            r3 = r0
            r0 = r9
            r9 = r1
            goto L_0x0089
        L_0x0084:
            r3 = r0
        L_0x0085:
            r0 = r9
            goto L_0x0097
        L_0x0087:
            r9 = move-exception
            r3 = r0
        L_0x0089:
            if (r0 == 0) goto L_0x0090
            r0.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            if (r3 == 0) goto L_0x0095
            r3.close()     // Catch:{ Throwable -> 0x0095 }
        L_0x0095:
            throw r9
        L_0x0096:
            r3 = r0
        L_0x0097:
            if (r0 == 0) goto L_0x009e
            r0.close()     // Catch:{ Throwable -> 0x009d }
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            if (r3 == 0) goto L_0x00a1
            goto L_0x0076
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2580a.C51381b.m110507a(android.content.Context):int");
    }
}
