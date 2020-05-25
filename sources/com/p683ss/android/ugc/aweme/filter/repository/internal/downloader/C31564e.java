package com.p683ss.android.ugc.aweme.filter.repository.internal.downloader;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.e */
public final class C31564e {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        p2628d.p2638e.C52647c.m112189a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73424a(java.io.InputStream r8, java.lang.String r9) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            okhttp3.internal.f.a r9 = okhttp3.internal.p2688f.C53623a.f132977a
            okio.Sink r9 = r9.mo111494b(r0)
            r9.close()
            java.io.Closeable r8 = (java.io.Closeable) r8
            r9 = 0
            r1 = r8
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Throwable -> 0x0056 }
            boolean r2 = r0.exists()     // Catch:{ Throwable -> 0x0056 }
            if (r2 == 0) goto L_0x001d
            r0.delete()     // Catch:{ Throwable -> 0x0056 }
        L_0x001d:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0056 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0056 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ Throwable -> 0x0056 }
            r0 = r2
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            d.f.b.v$c r4 = new d.f.b.v$c     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            r4.<init>()     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
        L_0x0030:
            int r5 = r1.read(r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            r4.element = r5     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            r6 = -1
            if (r5 == r6) goto L_0x0040
            r5 = 0
            int r6 = r4.element     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            r0.write(r3, r5, r6)     // Catch:{ Throwable -> 0x004a, all -> 0x0047 }
            goto L_0x0030
        L_0x0040:
            p2628d.p2638e.C52647c.m112189a(r2, r9)     // Catch:{ Throwable -> 0x0056 }
            p2628d.p2638e.C52647c.m112189a(r8, r9)
            return
        L_0x0047:
            r0 = move-exception
            r1 = r9
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0050:
            p2628d.p2638e.C52647c.m112189a(r2, r1)     // Catch:{ Throwable -> 0x0056 }
            throw r0     // Catch:{ Throwable -> 0x0056 }
        L_0x0054:
            r0 = move-exception
            goto L_0x0058
        L_0x0056:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0058:
            p2628d.p2638e.C52647c.m112189a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31564e.m73424a(java.io.InputStream, java.lang.String):void");
    }
}
