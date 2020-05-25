package com.bytedance.liko.leakdetector.p774a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.bytedance.liko.leakdetector.a.d */
public final class C12283d {
    /* renamed from: a */
    private static void m24767a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        File[] listFiles;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getName());
                        sb.append(File.separator);
                        sb.append(file2.getName());
                        sb.append(File.separator);
                        str = sb.toString();
                    }
                    m24767a(zipOutputStream, file2, str);
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r4 != null) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[SYNTHETIC, Splitter:B:23:0x007b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24766a(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5) {
        /*
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = java.io.File.separator
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.util.zip.ZipOutputStream r4 = new java.util.zip.ZipOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0082, all -> 0x0077 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
        L_0x002f:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x002f
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            if (r0 == 0) goto L_0x0065
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.<init>()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.append(r2)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r2 = java.io.File.separator     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            r0.append(r2)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            m24767a(r4, r1, r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            goto L_0x002f
        L_0x0065:
            java.lang.String r0 = ""
            m24767a(r4, r1, r0)     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
            goto L_0x002f
        L_0x006b:
            r4.flush()     // Catch:{ Exception -> 0x0083, all -> 0x0075 }
        L_0x006e:
            r4.closeEntry()     // Catch:{ IOException -> 0x0086 }
            r4.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0086
        L_0x0075:
            r3 = move-exception
            goto L_0x0079
        L_0x0077:
            r3 = move-exception
            r4 = r1
        L_0x0079:
            if (r4 == 0) goto L_0x0081
            r4.closeEntry()     // Catch:{ IOException -> 0x0081 }
            r4.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            throw r3
        L_0x0082:
            r4 = r1
        L_0x0083:
            if (r4 == 0) goto L_0x0086
            goto L_0x006e
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.p774a.C12283d.m24766a(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }
}
