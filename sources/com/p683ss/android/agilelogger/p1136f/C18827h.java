package com.p683ss.android.agilelogger.p1136f;

import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.agilelogger.f.h */
public final class C18827h {

    /* renamed from: a */
    private static List<String> f52006a = new ArrayList();

    /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|10|11|12|(2:14|(2:16|20)(1:17))|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3 = java.lang.System.mapLibraryName(r9);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r8 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r8.getFilesDir() == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = new java.io.File(r8.getFilesDir(), "libso");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r5.exists() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        new java.io.File(r5.getAbsolutePath()).mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r5 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        r4 = new java.io.File(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r4 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (r4.exists() != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r4.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (m45921a(r8, r9, r4) != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r8 = r4.getAbsolutePath();
        r3 = android.os.SystemClock.uptimeMillis();
        java.lang.System.load(r8);
        com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r8);
        f52006a.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cf, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[SYNTHETIC, Splitter:B:24:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[SYNTHETIC, Splitter:B:39:0x00a8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m45922a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.Class<com.ss.android.agilelogger.f.h> r0 = com.p683ss.android.agilelogger.p1136f.C18827h.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f52006a     // Catch:{ all -> 0x00d0 }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x00d0 }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ UnsatisfiedLinkError -> 0x0070, Throwable -> 0x006e }
            boolean r5 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r9)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            if (r5 == 0) goto L_0x0062
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            long r6 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            com.bytedance.android.p161c.C2835a.m8098a(r5, r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            r5.<init>()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.String r6 = "/lib"
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            r5.append(r9)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.String r6 = ".so"
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            boolean r6 = r6.exists()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            if (r6 == 0) goto L_0x005e
            r6 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r9, r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            java.lang.System.load(r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r9)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
            goto L_0x0068
        L_0x005e:
            r5 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r9, r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0070 }
        L_0x0062:
            com.bytedance.p723j.C11511a.m23578a(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0070, Throwable -> 0x006e }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0070, Throwable -> 0x006e }
        L_0x0068:
            java.util.List<java.lang.String> r3 = f52006a     // Catch:{ UnsatisfiedLinkError -> 0x0070, Throwable -> 0x006e }
            r3.add(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0070, Throwable -> 0x006e }
            goto L_0x00cc
        L_0x006e:
            monitor-exit(r0)
            return r1
        L_0x0070:
            java.lang.String r3 = java.lang.System.mapLibraryName(r9)     // Catch:{ all -> 0x00d0 }
            r4 = 0
            if (r8 == 0) goto L_0x009c
            java.io.File r5 = r8.getFilesDir()     // Catch:{ all -> 0x00d0 }
            if (r5 != 0) goto L_0x007e
            goto L_0x009c
        L_0x007e:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00d0 }
            java.io.File r6 = r8.getFilesDir()     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "libso"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00d0 }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x009d
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ all -> 0x00d0 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00d0 }
            r7.<init>(r6)     // Catch:{ all -> 0x00d0 }
            r7.mkdirs()     // Catch:{ all -> 0x00d0 }
            goto L_0x009d
        L_0x009c:
            r5 = r4
        L_0x009d:
            if (r5 == 0) goto L_0x00a4
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00d0 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x00d0 }
        L_0x00a4:
            if (r4 != 0) goto L_0x00a8
            monitor-exit(r0)
            return r1
        L_0x00a8:
            boolean r3 = r4.exists()     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00b1
            r4.delete()     // Catch:{ all -> 0x00d0 }
        L_0x00b1:
            java.lang.String r8 = m45921a(r8, r9, r4)     // Catch:{ all -> 0x00d0 }
            if (r8 == 0) goto L_0x00b9
            monitor-exit(r0)
            return r1
        L_0x00b9:
            java.lang.String r8 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x00ce }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x00ce }
            java.lang.System.load(r8)     // Catch:{ Throwable -> 0x00ce }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r8)     // Catch:{ Throwable -> 0x00ce }
            java.util.List<java.lang.String> r8 = f52006a     // Catch:{ Throwable -> 0x00ce }
            r8.add(r9)     // Catch:{ Throwable -> 0x00ce }
        L_0x00cc:
            monitor-exit(r0)
            return r2
        L_0x00ce:
            monitor-exit(r0)
            return r1
        L_0x00d0:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.agilelogger.p1136f.C18827h.m45922a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static String m45921a(Context context, String str, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            try {
                StringBuilder sb = new StringBuilder("lib/");
                sb.append(Build.CPU_ABI);
                sb.append("/");
                sb.append(System.mapLibraryName(str));
                ZipEntry entry = zipFile.getEntry(sb.toString());
                if (entry == null) {
                    int indexOf = Build.CPU_ABI.indexOf(45);
                    StringBuilder sb2 = new StringBuilder("lib/");
                    String str2 = Build.CPU_ABI;
                    if (indexOf <= 0) {
                        indexOf = Build.CPU_ABI.length();
                    }
                    sb2.append(str2.substring(0, indexOf));
                    sb2.append("/");
                    sb2.append(System.mapLibraryName(str));
                    String sb3 = sb2.toString();
                    entry = zipFile.getEntry(sb3);
                    if (entry == null) {
                        StringBuilder sb4 = new StringBuilder("Library entry not found:");
                        sb4.append(sb3);
                        String sb5 = sb4.toString();
                        C18819b.m45904a((Closeable) null);
                        C18819b.m45904a((Closeable) null);
                        C18819b.m45905a(zipFile);
                        return sb5;
                    }
                }
                file.createNewFile();
                inputStream = zipFile.getInputStream(entry);
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                    try {
                        String message = th.getMessage();
                        C18819b.m45904a((Closeable) fileOutputStream2);
                        C18819b.m45904a((Closeable) inputStream);
                        C18819b.m45905a(zipFile);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        C18819b.m45904a((Closeable) fileOutputStream2);
                        C18819b.m45904a((Closeable) inputStream);
                        C18819b.m45905a(zipFile);
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C18820c.m45906a("android.os.FileUtils", "setPermissions", file.getAbsolutePath(), Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
                            C18819b.m45904a((Closeable) fileOutputStream);
                            C18819b.m45904a((Closeable) inputStream);
                            C18819b.m45905a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    C18819b.m45904a((Closeable) fileOutputStream2);
                    C18819b.m45904a((Closeable) inputStream);
                    C18819b.m45905a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                C18819b.m45904a((Closeable) fileOutputStream2);
                C18819b.m45904a((Closeable) inputStream);
                C18819b.m45905a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            C18819b.m45904a((Closeable) fileOutputStream2);
            C18819b.m45904a((Closeable) inputStream);
            C18819b.m45905a(zipFile);
            throw th;
        }
    }
}
