package com.p683ss.android.ugc.effectmanager.common.p2441h;

import android.os.Environment;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.i */
public final class C48671i {

    /* renamed from: a */
    public static final C48671i f122310a = new C48671i();

    /* renamed from: b */
    private static final Charset f122311b = Charset.forName("US-ASCII");

    /* renamed from: c */
    private static final Charset f122312c = Charset.forName("UTF-8");

    /* renamed from: d */
    private static final int f122313d = 8192;

    private C48671i() {
    }

    /* renamed from: a */
    public static Charset m105322a() {
        return f122311b;
    }

    /* renamed from: b */
    private static boolean m105325b() {
        try {
            return C52711k.m112239a((Object) "mounted", (Object) Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m105323a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo96264e(String str) {
        if (str != null) {
            m105326d(new File(str));
        }
    }

    /* renamed from: a */
    public static boolean m105324a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: b */
    public final boolean mo96259b(File file) {
        try {
            mo96257a(file);
            if (file != null) {
                return file.delete();
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final InputStream mo96263d(String str) {
        InputStream inputStream;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!m105324a(file.getPath())) {
            return null;
        }
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception unused) {
            inputStream = null;
        }
        return inputStream;
    }

    /* renamed from: d */
    private void m105326d(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    C52711k.m112236a((Object) file2, "child");
                    if (file2.isDirectory()) {
                        m105326d(file2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo96260b(String str) {
        if (!m105325b() || TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final long mo96261c(File file) {
        long j;
        long j2 = 0;
        if (file == null) {
            return 0;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            C52711k.m112236a((Object) file2, "files[i]");
            if (file2.isFile()) {
                j = listFiles[i].length();
            } else {
                j = mo96261c(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        if (r0 != null) goto L_0x0046;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[SYNTHETIC, Splitter:B:29:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[SYNTHETIC, Splitter:B:33:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0067 A[SYNTHETIC, Splitter:B:40:0x0067] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96262c(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "path"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.lang.String r6 = r0.getPath()
            boolean r6 = m105324a(r6)
            if (r6 == 0) goto L_0x0070
            java.lang.String r6 = ""
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0063, all -> 0x0053 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0053 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            r3 = r2
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x004c, all -> 0x004a }
        L_0x0028:
            if (r1 == 0) goto L_0x0043
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            r3.<init>()     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            r3.append(r6)     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            r3.append(r1)     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            java.lang.String r6 = r0.readLine()     // Catch:{ Exception -> 0x0041, all -> 0x004a }
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x0028
        L_0x0041:
            r6 = r1
            goto L_0x0065
        L_0x0043:
            r2.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r0.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x006f
        L_0x004a:
            r6 = move-exception
            goto L_0x0056
        L_0x004c:
            goto L_0x0065
        L_0x004e:
            r6 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0051:
            r0 = r1
            goto L_0x0065
        L_0x0053:
            r6 = move-exception
            r0 = r1
            r2 = r0
        L_0x0056:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r6
        L_0x0063:
            r0 = r1
            r2 = r0
        L_0x0065:
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006c
        L_0x006b:
        L_0x006c:
            if (r0 == 0) goto L_0x006f
            goto L_0x0046
        L_0x006f:
            return r6
        L_0x0070:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.mo96262c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo96257a(File file) throws IOException {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    C52711k.m112236a((Object) file2, "file");
                    if (file2.isDirectory()) {
                        mo96257a(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("failed to delete file: ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|(0)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[SYNTHETIC, Splitter:B:20:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m105320a(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "cache"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "path"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.Class<com.ss.android.ugc.effectmanager.common.h.i> r0 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0053 }
            r1.<init>(r4)     // Catch:{ all -> 0x0053 }
            boolean r4 = r1.exists()     // Catch:{ all -> 0x0053 }
            if (r4 != 0) goto L_0x0020
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x0053 }
            r2 = 1
            m105321a(r4, r2)     // Catch:{ all -> 0x0053 }
        L_0x0020:
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0049, all -> 0x0041 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0049, all -> 0x0041 }
            java.nio.charset.Charset r4 = p2628d.p2650m.C52808d.f131043a     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            java.lang.String r4 = "(this as java.lang.String).getBytes(charset)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            r2.write(r3)     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            r2.flush()     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            int r3 = r3.length     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            long r3 = (long) r3
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x003d:
            r3 = move-exception
            goto L_0x0043
        L_0x003f:
            r4 = r2
            goto L_0x0049
        L_0x0041:
            r3 = move-exception
            r2 = r4
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r3     // Catch:{ all -> 0x0053 }
        L_0x0049:
            r1 = 0
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r3 = r1
        L_0x0051:
            monitor-exit(r0)
            return r3
        L_0x0053:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105320a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    private static File m105321a(String str, boolean z) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    C52711k.m112234a();
                }
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00db A[Catch:{ all -> 0x00cf }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96258b(java.lang.String r9, java.lang.String r10) throws com.p683ss.android.ugc.effectmanager.common.p2437d.C48637d {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00e9
            if (r10 != 0) goto L_0x0006
            goto L_0x00e9
        L_0x0006:
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            boolean r10 = r0.exists()
            if (r10 == 0) goto L_0x0014
            r8.m105326d(r0)
        L_0x0014:
            r10 = 0
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x00d2 }
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00d2 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d2 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d2 }
            r4.<init>(r9)     // Catch:{ IOException -> 0x00d2 }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ IOException -> 0x00d2 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00d2 }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ IOException -> 0x00d2 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00d2 }
            java.util.zip.ZipEntry r9 = r2.getNextEntry()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
        L_0x0030:
            if (r9 == 0) goto L_0x00c4
            java.lang.String r3 = r9.getName()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r4.<init>(r0, r3)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r3 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = "canonicalDestPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = "canonicalDirPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r5 = 2
            r6 = 0
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r1, r6, r5, r10)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            if (r3 == 0) goto L_0x00aa
            boolean r9 = r9.isDirectory()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            if (r9 == 0) goto L_0x005f
            r4.mkdirs()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.util.zip.ZipEntry r9 = r2.getNextEntry()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            goto L_0x0030
        L_0x005f:
            java.io.File r9 = r4.getParentFile()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            if (r9 == 0) goto L_0x006f
            boolean r3 = r9.exists()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            if (r3 != 0) goto L_0x006f
            r9.mkdirs()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            goto L_0x0078
        L_0x006f:
            boolean r9 = r4.exists()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            if (r9 == 0) goto L_0x0078
            r4.delete()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
        L_0x0078:
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r9.<init>(r3)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            d.f.b.v$c r3 = new d.f.b.v$c     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r3.<init>()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            int r4 = f122313d     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
        L_0x008d:
            int r5 = r2.read(r4)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r3.element = r5     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r7 = -1
            if (r5 == r7) goto L_0x009c
            int r5 = r3.element     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r9.write(r4, r6, r5)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            goto L_0x008d
        L_0x009c:
            r9.flush()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r9.close()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r2.closeEntry()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.util.zip.ZipEntry r9 = r2.getNextEntry()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            goto L_0x0030
        L_0x00aa:
            com.ss.android.ugc.effectmanager.common.d.d r10 = new com.ss.android.ugc.effectmanager.common.d.d     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r1 = "Entry is outside of the target dir: "
            r0.<init>(r1)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r9 = r9.getName()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r0.append(r9)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.String r9 = r0.toString()     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            r10.<init>(r9)     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
            throw r10     // Catch:{ IOException -> 0x00cc, all -> 0x00ca }
        L_0x00c4:
            java.io.Closeable r2 = (java.io.Closeable) r2
            m105323a(r2)
            return
        L_0x00ca:
            r9 = move-exception
            goto L_0x00e3
        L_0x00cc:
            r9 = move-exception
            r10 = r2
            goto L_0x00d3
        L_0x00cf:
            r9 = move-exception
            r2 = r10
            goto L_0x00e3
        L_0x00d2:
            r9 = move-exception
        L_0x00d3:
            com.ss.android.ugc.effectmanager.common.d.d r0 = new com.ss.android.ugc.effectmanager.common.d.d     // Catch:{ all -> 0x00cf }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00cf }
            if (r9 != 0) goto L_0x00dd
            java.lang.String r9 = ""
        L_0x00dd:
            r0.<init>(r9)     // Catch:{ all -> 0x00cf }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00e3:
            java.io.Closeable r2 = (java.io.Closeable) r2
            m105323a(r2)
            throw r9
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.mo96258b(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static long m105319a(InputStream inputStream, OutputStream outputStream, long j, C48625b bVar) throws IOException {
        C52711k.m112240b(inputStream, "source");
        C52711k.m112240b(outputStream, "sink");
        byte[] bArr = new byte[f122313d];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read > 0) {
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
            if (j2 < j && j > 0 && bVar != null) {
                bVar.mo96205a((int) ((((float) j2) / ((float) j)) * 100.0f), j);
            }
            read = inputStream.read(bArr);
        }
        if (bVar != null) {
            bVar.mo96205a(100, j);
        }
        return j2;
    }
}
