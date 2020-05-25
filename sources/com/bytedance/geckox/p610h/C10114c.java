package com.bytedance.geckox.p610h;

import android.util.Pair;
import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.h.c */
public final class C10114c {

    /* renamed from: a */
    public static final Map<String, Pair<FileLock, AtomicLong>> f27412a = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20386a(java.lang.String r7) throws java.lang.Exception {
        /*
            java.util.Map<java.lang.String, android.util.Pair<com.bytedance.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> r0 = f27412a
            monitor-enter(r0)
            com.bytedance.geckox.utils.FileLock r1 = com.bytedance.geckox.utils.FileLock.m20468b(r7)     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x000b:
            java.util.Map<java.lang.String, android.util.Pair<com.bytedance.geckox.utils.FileLock, java.util.concurrent.atomic.AtomicLong>> r2 = f27412a     // Catch:{ all -> 0x006c }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x006c }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x006c }
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2     // Catch:{ all -> 0x006c }
            long r2 = r2.get()     // Catch:{ all -> 0x006c }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002f
            r1.mo18151a()     // Catch:{ all -> 0x006c }
            int r1 = android.os.Process.myPid()     // Catch:{ all -> 0x006c }
            com.bytedance.geckox.utils.FileLock.m20467a(r7, r1)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x002f:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x006c }
            r2.<init>(r7)     // Catch:{ all -> 0x006c }
            java.io.File r7 = r2.getParentFile()     // Catch:{ all -> 0x006c }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r3.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ all -> 0x006c }
            r3.append(r4)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "--pending-delete"
            r3.append(r4)     // Catch:{ all -> 0x006c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x006c }
            r2.<init>(r3)     // Catch:{ all -> 0x006c }
            boolean r7 = r7.renameTo(r2)     // Catch:{ all -> 0x006c }
            if (r7 == 0) goto L_0x006a
            r1.mo18151a()     // Catch:{ all -> 0x006c }
            r1.mo18152b()     // Catch:{ all -> 0x006c }
            com.bytedance.geckox.utils.f r7 = com.bytedance.geckox.utils.C10157f.m20483a()     // Catch:{ all -> 0x006c }
            com.bytedance.geckox.h.c$1 r1 = new com.bytedance.geckox.h.c$1     // Catch:{ all -> 0x006c }
            r1.<init>(r2)     // Catch:{ all -> 0x006c }
            r7.execute(r1)     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p610h.C10114c.m20386a(java.lang.String):void");
    }
}
