package com.p683ss.android.ugc.aweme.emoji.utils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.n */
public final class C29488n {
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.ss.android.ugc.aweme.emoji.utils.a.w$1] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:81|82|(2:84|85)|86|87) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|(1:19)|20|(11:21|22|(1:24)(2:25|(2:27|(1:29)(3:103|30|31))(1:32))|33|34|35|36|37|(2:38|(1:40)(1:41))|42|(1:105))|45|46|106) */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        r14 = th;
        r8 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0114 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0133 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010a A[SYNTHETIC, Splitter:B:56:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0111 A[SYNTHETIC, Splitter:B:60:0x0111] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119 A[SYNTHETIC, Splitter:B:67:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0128 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:45:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0130 A[SYNTHETIC, Splitter:B:84:0x0130] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m69579a(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.emoji.utils.n> r0 = com.p683ss.android.ugc.aweme.emoji.utils.C29488n.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x013f }
            r1.<init>(r15)     // Catch:{ all -> 0x013f }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x0011
            r1.mkdirs()     // Catch:{ all -> 0x013f }
        L_0x0011:
            r1 = 0
            com.ss.android.ugc.aweme.emoji.utils.a.w r8 = new com.ss.android.ugc.aweme.emoji.utils.a.w     // Catch:{ IOException -> 0x0134, all -> 0x012c }
            r8.<init>(r14)     // Catch:{ IOException -> 0x0134, all -> 0x012c }
            java.util.List<com.ss.android.ugc.aweme.emoji.utils.a.u> r14 = r8.f77137a     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.util.Enumeration r14 = java.util.Collections.enumeration(r14)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
        L_0x001d:
            boolean r2 = r14.hasMoreElements()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r14.nextElement()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r9 = r2
            com.ss.android.ugc.aweme.emoji.utils.a.u r9 = (com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29459u) r9     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            boolean r2 = r9.isDirectory()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r9.getName()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            int r3 = r3 - r11
            java.lang.String r2 = r2.substring(r10, r3)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r4.<init>()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r4.append(r15)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r4.append(r5)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r4.append(r2)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.mkdir()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            goto L_0x001d
        L_0x005c:
            java.lang.String r2 = r9.getName()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3 = 92
            r4 = 47
            java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.<init>()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.append(r15)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.append(r4)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r3.append(r2)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r12.<init>(r2)     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            java.io.File r2 = r12.getParentFile()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            r2.mkdirs()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            boolean r2 = r12.exists()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            if (r2 == 0) goto L_0x0091
            r12.delete()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
        L_0x0091:
            r12.createNewFile()     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
            boolean r2 = r9 instanceof com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29461w.C29465b     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            if (r2 != 0) goto L_0x009a
            r3 = r1
            goto L_0x00df
        L_0x009a:
            r2 = r9
            com.ss.android.ugc.aweme.emoji.utils.a.w$b r2 = (com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29461w.C29465b) r2     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            com.ss.android.ugc.aweme.emoji.utils.a.w$d r2 = r2.f77157f     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29435aa.m69416a(r9)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            long r4 = r2.f77161b     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            com.ss.android.ugc.aweme.emoji.utils.a.w$a r13 = new com.ss.android.ugc.aweme.emoji.utils.a.w$a     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            long r6 = r9.getCompressedSize()     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            r2 = r13
            r3 = r8
            r2.<init>(r4, r6)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            int r2 = r9.getMethod()     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            if (r2 == 0) goto L_0x00de
            r3 = 8
            if (r2 != r3) goto L_0x00c6
            r13.f77153a = r11     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            java.util.zip.Inflater r2 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            r2.<init>(r11)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            com.ss.android.ugc.aweme.emoji.utils.a.w$1 r3 = new com.ss.android.ugc.aweme.emoji.utils.a.w$1     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            r3.<init>(r13, r2, r2)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            goto L_0x00df
        L_0x00c6:
            java.util.zip.ZipException r2 = new java.util.zip.ZipException     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            java.lang.String r4 = "Found unsupported compression method "
            r3.<init>(r4)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            int r4 = r9.getMethod()     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            r3.append(r4)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
            throw r2     // Catch:{ IOException -> 0x0115, all -> 0x0106 }
        L_0x00de:
            r3 = r13
        L_0x00df:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0104, all -> 0x0102 }
            r2.<init>(r12)     // Catch:{ IOException -> 0x0104, all -> 0x0102 }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0100, all -> 0x00fd }
        L_0x00e8:
            int r5 = r3.read(r4)     // Catch:{ IOException -> 0x0100, all -> 0x00fd }
            r6 = -1
            if (r5 == r6) goto L_0x00f3
            r2.write(r4, r10, r5)     // Catch:{ IOException -> 0x0100, all -> 0x00fd }
            goto L_0x00e8
        L_0x00f3:
            r2.close()     // Catch:{ IOException -> 0x00f6, all -> 0x0128 }
        L_0x00f6:
            if (r3 == 0) goto L_0x001d
        L_0x00f8:
            r3.close()     // Catch:{ IOException -> 0x001d, all -> 0x0128 }
            goto L_0x001d
        L_0x00fd:
            r14 = move-exception
            r1 = r2
            goto L_0x0108
        L_0x0100:
            goto L_0x0117
        L_0x0102:
            r14 = move-exception
            goto L_0x0108
        L_0x0104:
            r2 = r1
            goto L_0x0117
        L_0x0106:
            r14 = move-exception
            r3 = r1
        L_0x0108:
            if (r1 == 0) goto L_0x010f
            r1.close()     // Catch:{ IOException -> 0x010e, all -> 0x0128 }
            goto L_0x010f
        L_0x010e:
        L_0x010f:
            if (r3 == 0) goto L_0x0114
            r3.close()     // Catch:{ IOException -> 0x0114, all -> 0x0128 }
        L_0x0114:
            throw r14     // Catch:{ IOException -> 0x012a, all -> 0x0128 }
        L_0x0115:
            r2 = r1
            r3 = r2
        L_0x0117:
            if (r2 == 0) goto L_0x011e
            r2.close()     // Catch:{ IOException -> 0x011d, all -> 0x0128 }
            goto L_0x011e
        L_0x011d:
        L_0x011e:
            if (r3 == 0) goto L_0x001d
            goto L_0x00f8
        L_0x0121:
            r8.close()     // Catch:{ IOException -> 0x0126 }
            monitor-exit(r0)
            return
        L_0x0126:
            monitor-exit(r0)
            return
        L_0x0128:
            r14 = move-exception
            goto L_0x012e
        L_0x012a:
            r1 = r8
            goto L_0x0134
        L_0x012c:
            r14 = move-exception
            r8 = r1
        L_0x012e:
            if (r8 == 0) goto L_0x0133
            r8.close()     // Catch:{ IOException -> 0x0133 }
        L_0x0133:
            throw r14     // Catch:{ all -> 0x013f }
        L_0x0134:
            if (r1 == 0) goto L_0x013d
            r1.close()     // Catch:{ IOException -> 0x013b }
            monitor-exit(r0)
            return
        L_0x013b:
            monitor-exit(r0)
            return
        L_0x013d:
            monitor-exit(r0)
            return
        L_0x013f:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.utils.C29488n.m69579a(java.lang.String, java.lang.String):void");
    }
}
