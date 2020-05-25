package com.bytedance.p560f;

/* renamed from: com.bytedance.f.b */
final class C9752b {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC, Splitter:B:18:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long m19527a(java.io.File r6, java.io.File r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0036 }
            r1.<init>(r7)     // Catch:{ all -> 0x0036 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
            r7.<init>(r6)     // Catch:{ all -> 0x002b }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0029 }
            int r0 = r7.read(r6)     // Catch:{ all -> 0x0029 }
            r2 = 0
        L_0x0015:
            if (r0 < 0) goto L_0x0022
            r4 = 0
            r1.write(r6, r4, r0)     // Catch:{ all -> 0x0029 }
            long r4 = (long) r0     // Catch:{ all -> 0x0029 }
            long r2 = r2 + r4
            int r0 = r7.read(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0015
        L_0x0022:
            r7.close()     // Catch:{ all -> 0x0033 }
            r1.close()
            return r2
        L_0x0029:
            r6 = move-exception
            goto L_0x002d
        L_0x002b:
            r6 = move-exception
            r7 = r0
        L_0x002d:
            if (r7 == 0) goto L_0x0035
            r7.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0035
        L_0x0033:
            r6 = move-exception
            goto L_0x0038
        L_0x0035:
            throw r6     // Catch:{ all -> 0x0033 }
        L_0x0036:
            r6 = move-exception
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()
        L_0x003d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p560f.C9752b.m19527a(java.io.File, java.io.File):long");
    }
}
