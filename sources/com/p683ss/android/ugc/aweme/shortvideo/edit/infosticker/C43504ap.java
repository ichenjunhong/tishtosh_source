package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ap */
public final class C43504ap {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        if (r1 == null) goto L_0x002c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.nio.ByteBuffer m95365a(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0027, all -> 0x0020 }
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0027, all -> 0x0020 }
            long r2 = r1.length()     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            int r4 = (int) r2     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.readFully(r4)     // Catch:{ Exception -> 0x0019, all -> 0x001b }
        L_0x0015:
            r1.close()
            goto L_0x002c
        L_0x0019:
            goto L_0x0029
        L_0x001b:
            r4 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x001e:
            r4 = r0
            goto L_0x0029
        L_0x0020:
            r4 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            throw r4
        L_0x0027:
            r4 = r0
            r1 = r4
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x0015
        L_0x002c:
            if (r4 == 0) goto L_0x0030
            int r0 = r4.length
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43504ap.m95365a(java.lang.String):java.nio.ByteBuffer");
    }
}
