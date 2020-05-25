package com.p683ss.android.vesdk.runtime;

import android.content.Context;
import android.os.Build;
import com.p683ss.android.vesdk.C50752q;
import com.p683ss.android.vesdk.C50788v;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.runtime.f */
public final class C50773f {

    /* renamed from: a */
    private static List<String> f127571a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4 = new java.lang.StringBuilder("loadLibrary ");
        r4.append(r10);
        r4.append(" error.");
        r5 = new java.io.StringWriter();
        com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a((java.lang.Throwable) r3, new java.io.PrintWriter(r5, true));
        r4.append(r5.getBuffer().toString());
        com.p683ss.android.ttve.log.C20085a.m49602a(4, r4.toString());
        r4 = java.lang.System.mapLibraryName(r10);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r11 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r11.getFilesDir() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        r7 = new java.io.File(r11.getFilesDir(), "libso");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r7.exists() == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        com.p683ss.android.vesdk.C50752q.m109850b(r7.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r7 != null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r6 = new java.io.File(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r6 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r6.exists() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        r11 = m109885a(r11, r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e1, code lost:
        if (r11 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append(r3.getMessage());
        r10.append("[");
        r10.append(r11);
        r10.append("]");
        com.p683ss.android.ttve.log.C20085a.m49602a(4, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11 = r6.getAbsolutePath();
        r3 = android.os.SystemClock.uptimeMillis();
        java.lang.System.load(r11);
        com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r11);
        f127571a.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0119, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011b, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[ExcHandler: UnsatisfiedLinkError (r3v0 'e' java.lang.UnsatisfiedLinkError A[CUSTOM_DECLARE]), Splitter:B:9:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb A[Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071, Throwable -> 0x011a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4 A[SYNTHETIC, Splitter:B:40:0x00d4] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m109886a(java.lang.String r10, android.content.Context r11) {
        /*
            java.lang.Class<com.ss.android.vesdk.runtime.f> r0 = com.p683ss.android.vesdk.runtime.C50773f.class
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = f127571a     // Catch:{ all -> 0x011c }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x011c }
            r2 = 1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            r1 = 0
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ UnsatisfiedLinkError -> 0x0071, Throwable -> 0x006f }
            boolean r5 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r10)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            if (r5 == 0) goto L_0x0062
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            long r6 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            com.bytedance.android.p161c.C2835a.m8098a(r5, r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            r5.<init>()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.String r6 = "/lib"
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            r5.append(r10)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.String r6 = ".so"
            r5.append(r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            boolean r6 = r6.exists()     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            if (r6 == 0) goto L_0x005e
            r6 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r10, r6)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            java.lang.System.load(r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r10)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
            goto L_0x0068
        L_0x005e:
            r5 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r10, r5)     // Catch:{ Throwable -> 0x0062, UnsatisfiedLinkError -> 0x0071 }
        L_0x0062:
            com.bytedance.p723j.C11511a.m23578a(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0071, Throwable -> 0x006f }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r10)     // Catch:{ UnsatisfiedLinkError -> 0x0071, Throwable -> 0x006f }
        L_0x0068:
            java.util.List<java.lang.String> r3 = f127571a     // Catch:{ UnsatisfiedLinkError -> 0x0071, Throwable -> 0x006f }
            r3.add(r10)     // Catch:{ UnsatisfiedLinkError -> 0x0071, Throwable -> 0x006f }
            goto L_0x0118
        L_0x006f:
            monitor-exit(r0)
            return r1
        L_0x0071:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            java.lang.String r5 = "loadLibrary "
            r4.<init>(r5)     // Catch:{ all -> 0x011c }
            r4.append(r10)     // Catch:{ all -> 0x011c }
            java.lang.String r5 = " error."
            r4.append(r5)     // Catch:{ all -> 0x011c }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ all -> 0x011c }
            r5.<init>()     // Catch:{ all -> 0x011c }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ all -> 0x011c }
            r6.<init>(r5, r2)     // Catch:{ all -> 0x011c }
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r6)     // Catch:{ all -> 0x011c }
            java.lang.StringBuffer r5 = r5.getBuffer()     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x011c }
            r4.append(r5)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x011c }
            r5 = 4
            com.p683ss.android.ttve.log.C20085a.m49602a(r5, r4)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = java.lang.System.mapLibraryName(r10)     // Catch:{ all -> 0x011c }
            r6 = 0
            if (r11 == 0) goto L_0x00c8
            java.io.File r7 = r11.getFilesDir()     // Catch:{ all -> 0x011c }
            if (r7 != 0) goto L_0x00af
            goto L_0x00c8
        L_0x00af:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x011c }
            java.io.File r8 = r11.getFilesDir()     // Catch:{ all -> 0x011c }
            java.lang.String r9 = "libso"
            r7.<init>(r8, r9)     // Catch:{ all -> 0x011c }
            boolean r8 = r7.exists()     // Catch:{ all -> 0x011c }
            if (r8 != 0) goto L_0x00c9
            java.lang.String r8 = r7.getAbsolutePath()     // Catch:{ all -> 0x011c }
            com.p683ss.android.vesdk.C50752q.m109850b(r8)     // Catch:{ all -> 0x011c }
            goto L_0x00c9
        L_0x00c8:
            r7 = r6
        L_0x00c9:
            if (r7 == 0) goto L_0x00d0
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x011c }
            r6.<init>(r7, r4)     // Catch:{ all -> 0x011c }
        L_0x00d0:
            if (r6 != 0) goto L_0x00d4
            monitor-exit(r0)
            return r1
        L_0x00d4:
            boolean r4 = r6.exists()     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x00dd
            r6.delete()     // Catch:{ all -> 0x011c }
        L_0x00dd:
            java.lang.String r11 = m109885a(r11, r10, r6)     // Catch:{ all -> 0x011c }
            if (r11 == 0) goto L_0x0105
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
            r10.<init>()     // Catch:{ all -> 0x011c }
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x011c }
            r10.append(r2)     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "["
            r10.append(r2)     // Catch:{ all -> 0x011c }
            r10.append(r11)     // Catch:{ all -> 0x011c }
            java.lang.String r11 = "]"
            r10.append(r11)     // Catch:{ all -> 0x011c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x011c }
            com.p683ss.android.ttve.log.C20085a.m49602a(r5, r10)     // Catch:{ all -> 0x011c }
            monitor-exit(r0)
            return r1
        L_0x0105:
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ Throwable -> 0x011a }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x011a }
            java.lang.System.load(r11)     // Catch:{ Throwable -> 0x011a }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r3, r11)     // Catch:{ Throwable -> 0x011a }
            java.util.List<java.lang.String> r11 = f127571a     // Catch:{ Throwable -> 0x011a }
            r11.add(r10)     // Catch:{ Throwable -> 0x011a }
        L_0x0118:
            monitor-exit(r0)
            return r2
        L_0x011a:
            monitor-exit(r0)
            return r1
        L_0x011c:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.runtime.C50773f.m109886a(java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: a */
    private static String m109885a(Context context, String str, File file) {
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
                        C50752q.m109847a((Closeable) null);
                        C50752q.m109847a((Closeable) null);
                        C50752q.m109849a(zipFile);
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
                        C50752q.m109847a((Closeable) fileOutputStream2);
                        C50752q.m109847a((Closeable) inputStream);
                        C50752q.m109849a(zipFile);
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        C50752q.m109847a((Closeable) fileOutputStream2);
                        C50752q.m109847a((Closeable) inputStream);
                        C50752q.m109849a(zipFile);
                        throw th;
                    }
                }
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C50788v.m109902a("android.os.FileUtils", "setPermissions", file.getAbsolutePath(), Integer.valueOf(493), Integer.valueOf(-1), Integer.valueOf(-1));
                            C50752q.m109847a((Closeable) fileOutputStream);
                            C50752q.m109847a((Closeable) inputStream);
                            C50752q.m109849a(zipFile);
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    C50752q.m109847a((Closeable) fileOutputStream2);
                    C50752q.m109847a((Closeable) inputStream);
                    C50752q.m109849a(zipFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                C50752q.m109847a((Closeable) fileOutputStream2);
                C50752q.m109847a((Closeable) inputStream);
                C50752q.m109849a(zipFile);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            zipFile = null;
            C50752q.m109847a((Closeable) fileOutputStream2);
            C50752q.m109847a((Closeable) inputStream);
            C50752q.m109849a(zipFile);
            throw th;
        }
    }
}
