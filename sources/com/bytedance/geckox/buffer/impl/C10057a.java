package com.bytedance.geckox.buffer.impl;

import android.content.Context;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.p611i.C10117b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.buffer.impl.a */
public final class C10057a {
    /* renamed from: a */
    public static C10053a m20267a(Context context, File file, long j) throws IOException {
        C10053a b = m20268b(context, file, j);
        StringBuilder sb = new StringBuilder("buffer type:");
        sb.append(b.getClass());
        C10117b.m20388a("gecko-debug-tag", sb.toString());
        return b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return new com.bytedance.geckox.buffer.impl.C10059c(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r5 = new java.lang.StringBuilder("create random access file failed! file:");
        r5.append(r3.getAbsolutePath());
        r5.append(" caused by:");
        r5.append(r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        throw new java.lang.RuntimeException(r5.toString(), r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0037 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.geckox.buffer.C10053a m20268b(android.content.Context r2, java.io.File r3, long r4) throws java.io.IOException {
        /*
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0031
            com.bytedance.geckox.buffer.impl.b r2 = new com.bytedance.geckox.buffer.impl.b     // Catch:{ Exception -> 0x000c }
            r2.<init>(r3)     // Catch:{ Exception -> 0x000c }
            return r2
        L_0x000c:
            r2 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "create FileBuffer failed! file:"
            r5.<init>(r0)
            java.lang.String r3 = r3.getAbsolutePath()
            r5.append(r3)
            java.lang.String r3 = " caused by:"
            r5.append(r3)
            java.lang.String r3 = r2.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r2)
            throw r4
        L_0x0031:
            com.bytedance.geckox.buffer.impl.MMapBuffer r2 = new com.bytedance.geckox.buffer.impl.MMapBuffer     // Catch:{ Exception -> 0x0037 }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0037 }
            return r2
        L_0x0037:
            com.bytedance.geckox.buffer.impl.c r2 = new com.bytedance.geckox.buffer.impl.c     // Catch:{ Exception -> 0x003d }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x003d }
            return r2
        L_0x003d:
            r2 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "create random access file failed! file:"
            r5.<init>(r0)
            java.lang.String r3 = r3.getAbsolutePath()
            r5.append(r3)
            java.lang.String r3 = " caused by:"
            r5.append(r3)
            java.lang.String r3 = r2.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3, r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.C10057a.m20268b(android.content.Context, java.io.File, long):com.bytedance.geckox.buffer.a");
    }
}
