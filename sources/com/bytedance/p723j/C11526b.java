package com.bytedance.p723j;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.p723j.p724a.C11521f;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.j.b */
final class C11526b {

    /* renamed from: a */
    static final C11526b f30889a;

    /* renamed from: n */
    private static final String[] f30890n = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};

    /* renamed from: b */
    public final C11529c f30891b;

    /* renamed from: c */
    private final File f30892c;

    /* renamed from: d */
    private final Map<String, C11527a> f30893d = new HashMap();

    /* renamed from: e */
    private final File f30894e = new File(this.f30892c, "process.lock");

    /* renamed from: f */
    private volatile boolean f30895f;

    /* renamed from: g */
    private File f30896g;

    /* renamed from: h */
    private ZipFile[] f30897h;

    /* renamed from: i */
    private String f30898i;

    /* renamed from: j */
    private ApplicationInfo f30899j;

    /* renamed from: k */
    private Map<String, String> f30900k;

    /* renamed from: l */
    private String[] f30901l;

    /* renamed from: m */
    private String f30902m;

    /* renamed from: com.bytedance.j.b$a */
    static class C11527a {

        /* renamed from: a */
        boolean f30903a;

        C11527a() {
        }

        public final String toString() {
            return Boolean.toString(this.f30903a);
        }
    }

    /* renamed from: com.bytedance.j.b$b */
    class C11528b {

        /* renamed from: a */
        RandomAccessFile f30904a;

        /* renamed from: b */
        FileLock f30905b;

        /* renamed from: c */
        FileChannel f30906c;

        /* renamed from: d */
        File f30907d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo22277a() {
            if (this.f30905b != null) {
                try {
                    this.f30905b.release();
                } catch (IOException unused) {
                }
            }
            new StringBuilder("released lock ").append(this.f30907d.getPath());
            C11526b.this.mo22274a((Closeable) this.f30906c);
            C11526b.this.mo22274a((Closeable) this.f30904a);
        }

        C11528b(File file) {
            this.f30907d = file;
        }
    }

    /* renamed from: b */
    private String m23602b() {
        ZipFile[] zipFileArr;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (ZipFile zipFile : this.f30897h) {
            String name = zipFile.getName();
            File file = new File(name);
            sb.append(name);
            sb.append("#");
            sb.append(zipFile.size());
            sb.append(":");
            sb.append(file.length());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        String str;
        C11529c cVar;
        Context context = C11511a.f30865a;
        C11511a.f30865a = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (C11511a.f30866b != null) {
                str = C11511a.f30866b;
            } else {
                str = "default.version";
            }
            File file = new File(applicationInfo.sourceDir);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(file.lastModified() >> 8);
            File file2 = new File(dir, sb.toString());
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (!file2.getName().equals(file3.getName())) {
                        File[] listFiles2 = file3.listFiles();
                        if (listFiles2 != null) {
                            for (File delete : listFiles2) {
                                delete.delete();
                            }
                        }
                        file3.delete();
                    }
                }
            }
            file2.mkdirs();
            if (file2.exists()) {
                if (C11511a.f30867c != null) {
                    cVar = C11511a.f30867c;
                } else {
                    cVar = new C11529c();
                }
                f30889a = new C11526b(applicationInfo, file2, cVar);
                return;
            }
            f30889a = null;
            return;
        }
        throw new C11530d("you should call init first or use loadLibraryForModule.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23599a() {
        /*
            r8 = this;
            boolean r0 = r8.f30895f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f30895f     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00dd
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00df }
            android.content.pm.ApplicationInfo r1 = r8.f30899j     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r1.sourceDir     // Catch:{ all -> 0x00df }
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00df }
            r1.<init>()     // Catch:{ all -> 0x00df }
            r1.add(r0)     // Catch:{ all -> 0x00df }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00df }
            r2 = 21
            r3 = 0
            if (r0 < r2) goto L_0x003c
            android.content.pm.ApplicationInfo r0 = r8.f30899j     // Catch:{ all -> 0x00df }
            java.lang.String[] r0 = r0.splitSourceDirs     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x003c
            int r4 = r0.length     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x003c
            int r4 = r0.length     // Catch:{ all -> 0x00df }
            r5 = 0
        L_0x002d:
            if (r5 >= r4) goto L_0x003c
            r6 = r0[r5]     // Catch:{ all -> 0x00df }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00df }
            r7.<init>(r6)     // Catch:{ all -> 0x00df }
            r1.add(r7)     // Catch:{ all -> 0x00df }
            int r5 = r5 + 1
            goto L_0x002d
        L_0x003c:
            int r0 = r1.size()     // Catch:{ all -> 0x00df }
            java.util.zip.ZipFile[] r0 = new java.util.zip.ZipFile[r0]     // Catch:{ all -> 0x00df }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00df }
            r4 = 0
        L_0x0047:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00df }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00df }
            int r6 = r4 + 1
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x005c }
            r7.<init>(r5)     // Catch:{ IOException -> 0x005c }
            r0[r4] = r7     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r4 = r6
            goto L_0x0047
        L_0x005e:
            r8.f30897h = r0     // Catch:{ all -> 0x00df }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00df }
            android.content.pm.ApplicationInfo r1 = r8.f30899j     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r1.nativeLibraryDir     // Catch:{ all -> 0x00df }
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            r8.f30896g = r0     // Catch:{ all -> 0x00df }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            r8.f30900k = r0     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f30900k     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "arm64-v8a"
            java.lang.String r4 = "arm64"
            r0.put(r1, r4)     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f30900k     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "armeabi-v7a"
            java.lang.String r4 = "arm"
            r0.put(r1, r4)     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f30900k     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "armeabi"
            java.lang.String r4 = "arm"
            r0.put(r1, r4)     // Catch:{ all -> 0x00df }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00df }
            r1 = 0
            if (r0 < r2) goto L_0x00b7
            java.lang.String r0 = "dalvik.system.VMRuntime"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r4 = "getRuntime"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b7 }
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r4 = r4.invoke(r1, r5)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r5 = "vmInstructionSet"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b7 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00b7 }
            java.lang.Object r0 = r0.invoke(r4, r5)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
            r0 = r1
        L_0x00b8:
            r8.f30898i = r0     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "vm instruction set: "
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r8.f30898i     // Catch:{ all -> 0x00df }
            r0.append(r1)     // Catch:{ all -> 0x00df }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00df }
            r1 = 1
            if (r0 >= r2) goto L_0x00d7
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch:{ all -> 0x00df }
            r0[r3] = r2     // Catch:{ all -> 0x00df }
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch:{ all -> 0x00df }
            r0[r1] = r2     // Catch:{ all -> 0x00df }
            goto L_0x00d9
        L_0x00d7:
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch:{ all -> 0x00df }
        L_0x00d9:
            r8.f30901l = r0     // Catch:{ all -> 0x00df }
            r8.f30895f = r1     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r8)     // Catch:{ all -> 0x00df }
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00df }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p723j.C11526b.m23599a():void");
    }

    /* renamed from: a */
    public final void mo22274a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m23601a(String str) {
        for (String equals : f30890n) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private List<String> m23603b(File file) throws IOException {
        C11521f fVar = null;
        try {
            C11521f fVar2 = new C11521f(file);
            try {
                List<String> a = fVar2.mo22270a();
                Collections.sort(a);
                mo22274a((Closeable) fVar2);
                return a;
            } catch (Throwable th) {
                th = th;
                fVar = fVar2;
                mo22274a((Closeable) fVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mo22274a((Closeable) fVar);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m23606c(String str) {
        if (this.f30898i == null) {
            return true;
        }
        String str2 = (String) this.f30900k.get(str);
        String str3 = this.f30898i;
        if (str2 != null) {
            str = str2;
        }
        return str3.equals(str);
    }

    /* renamed from: d */
    private static String m23607d(String str) {
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|11|14|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m23605c(java.io.File r6) {
        /*
            r5 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream     // Catch:{ IOException -> 0x002d }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r3.<init>(r6)     // Catch:{ IOException -> 0x002d }
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x002d }
            r4.<init>()     // Catch:{ IOException -> 0x002d }
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x002d }
        L_0x0014:
            int r1 = r2.read(r0)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            if (r1 >= 0) goto L_0x0014
            java.util.zip.Checksum r0 = r2.getChecksum()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            long r0 = r0.getValue()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r5.mo22274a(r2)
            return r0
        L_0x0026:
            r6 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x0029:
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r6 = move-exception
            goto L_0x0041
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "fail to check sum for "
            r0.<init>(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r6 = r6.getPath()     // Catch:{ all -> 0x002b }
            r0.append(r6)     // Catch:{ all -> 0x002b }
            r5.mo22274a(r1)
            r0 = 0
            return r0
        L_0x0041:
            r5.mo22274a(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p723j.C11526b.m23605c(java.io.File):long");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private boolean m23608d(File file) throws IOException {
        m23604b(file.getName());
        StringBuilder sb = new StringBuilder("lib/");
        sb.append(this.f30902m);
        sb.append("/");
        sb.append(file.getName());
        String sb2 = sb.toString();
        ZipFile[] zipFileArr = this.f30897h;
        int length = zipFileArr.length;
        int i = 0;
        while (i < length) {
            ZipFile zipFile = zipFileArr[i];
            ZipEntry entry = zipFile.getEntry(sb2);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    m23598a(inputStream, file);
                    StringBuilder sb3 = new StringBuilder("get lib file ");
                    sb3.append(file.getPath());
                    sb3.append(" from ");
                    sb3.append(sb2);
                    sb3.append(" of ");
                    sb3.append(zipFile.getName());
                    mo22274a((Closeable) inputStream);
                    return true;
                } catch (Throwable th) {
                    mo22274a((Closeable) inputStream);
                    throw th;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m23604b(String str) {
        String[] strArr;
        if (this.f30902m == null) {
            for (String str2 : this.f30901l) {
                if (m23606c(str2)) {
                    StringBuilder sb = new StringBuilder("lib/");
                    sb.append(str2);
                    sb.append("/");
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (ZipFile entry : this.f30897h) {
                        if (entry.getEntry(sb2) != null) {
                            this.f30902m = str2;
                            new StringBuilder("ensure that abi is ").append(str2);
                            return;
                        }
                    }
                    continue;
                }
            }
            StringBuilder sb3 = new StringBuilder("can not ensure abi for ");
            sb3.append(str);
            sb3.append(", check ");
            sb3.append(this.f30898i);
            sb3.append(", apks ");
            sb3.append(m23602b());
            throw new C11530d(sb3.toString());
        }
    }

    /* renamed from: a */
    private boolean m23600a(File file) {
        if (!file.exists()) {
            new StringBuilder("file is not exist: ").append(file.getPath());
            return false;
        }
        m23604b(file.getName());
        long j = 0;
        StringBuilder sb = new StringBuilder("lib/");
        sb.append(this.f30902m);
        sb.append("/");
        sb.append(file.getName());
        String sb2 = sb.toString();
        ZipFile[] zipFileArr = this.f30897h;
        int length = zipFileArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ZipEntry entry = zipFileArr[i].getEntry(sb2);
            if (entry != null) {
                j = entry.getCrc();
                break;
            }
            i++;
        }
        long c = m23605c(file);
        if (j == c) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" compare crc ok: entry is ");
            sb3.append(j);
            sb3.append(", file is ");
            sb3.append(c);
            return true;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(" crc is wrong: entry is ");
        sb4.append(j);
        sb4.append(", file is ");
        sb4.append(c);
        return false;
    }

    /* renamed from: a */
    private File m23598a(InputStream inputStream, File file) throws IOException {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        new StringBuilder("extracting ").append(createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                new StringBuilder("renaming to ").append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                StringBuilder sb = new StringBuilder("failed to rename \"");
                sb.append(createTempFile.getAbsolutePath());
                sb.append("\" to \"");
                sb.append(file.getAbsolutePath());
                sb.append("\"");
                throw new IOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("failed to mark readonly \"");
            sb2.append(createTempFile.getAbsolutePath());
            sb2.append("\" (tmp of \"");
            sb2.append(file.getAbsolutePath());
            sb2.append("\")");
            throw new IOException(sb2.toString());
        } finally {
            mo22274a((Closeable) fileOutputStream);
            createTempFile.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1.f30903a == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        new java.lang.StringBuilder("lib was already loaded before: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r0 = new java.io.File(r7.f30892c, m23607d(r8));
        r2 = r0.exists();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r9 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r2 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.bytedance.p723j.C11529c.m23613b(r0.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        com.bytedance.p723j.C11529c.m23612a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        new java.lang.StringBuilder("lib is loaded: ").append(r8);
        r1.f30903a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r4 = new java.lang.StringBuilder("fail to load ");
        r4.append(r0.getName());
        r4.append(", out lib exists: ");
        r4.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        m23599a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r2 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r2 = new java.io.File(r7.f30896g, m23607d(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (m23600a(r2) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r2 = new com.bytedance.p723j.C11526b.C11528b(r7, r7.f30894e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.f30904a = new java.io.RandomAccessFile(r2.f30907d, "rw");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2.f30906c = r2.f30904a.getChannel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        new java.lang.StringBuilder("blocking on lock ").append(r2.f30907d.getPath());
        r2.f30905b = r2.f30906c.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        new java.lang.StringBuilder("acquired on lock ").append(r2.f30907d.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (m23608d(r0) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        if (r9 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        new java.lang.StringBuilder("may be system lib, no found ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.mo22277a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r0 = new java.lang.StringBuilder("fail to find ");
        r0.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        throw new com.bytedance.p723j.C11530d(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r2.mo22277a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f9, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2.f30908e.mo22274a((java.io.Closeable) r2.f30906c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0101, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0102, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.f30908e.mo22274a((java.io.Closeable) r2.f30904a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3 = new java.lang.StringBuilder("fail to extract ");
        r3.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        throw new com.bytedance.p723j.C11530d(r3.toString(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2.mo22277a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r2 = m23603b(r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0133, code lost:
        if (r2.hasNext() != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0135, code lost:
        r4 = (java.lang.String) r2.next();
        r4 = r4.substring(3, r4.length() - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        if (m23601a(r4) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014b, code lost:
        new java.lang.StringBuilder("to load depended lib ").append(r4);
        mo22275a(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        com.bytedance.p723j.C11529c.m23613b(r0.getPath());
        new java.lang.StringBuilder("loaded the lib ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r1.f30903a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016f, code lost:
        r2 = new java.lang.StringBuilder("finally fail to load ");
        r2.append(r0.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        throw new com.bytedance.p723j.C11530d(r2.toString(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0187, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018f, code lost:
        throw new com.bytedance.p723j.C11530d("fail to load depended lib", r8);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22275a(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.util.Map<java.lang.String, com.bytedance.j.b$a> r0 = r7.f30893d
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.bytedance.j.b$a> r1 = r7.f30893d     // Catch:{ all -> 0x0193 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0193 }
            com.bytedance.j.b$a r1 = (com.bytedance.p723j.C11526b.C11527a) r1     // Catch:{ all -> 0x0193 }
            if (r1 == 0) goto L_0x0013
            boolean r2 = r1.f30903a     // Catch:{ all -> 0x0193 }
            if (r2 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return
        L_0x0013:
            com.bytedance.j.b$a r1 = new com.bytedance.j.b$a     // Catch:{ all -> 0x0193 }
            r1.<init>()     // Catch:{ all -> 0x0193 }
            java.util.Map<java.lang.String, com.bytedance.j.b$a> r2 = r7.f30893d     // Catch:{ all -> 0x0193 }
            r2.put(r8, r1)     // Catch:{ all -> 0x0193 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            monitor-enter(r1)
            boolean r0 = r1.f30903a     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x002f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "lib was already loaded before: "
            r9.<init>(r0)     // Catch:{ all -> 0x0190 }
            r9.append(r8)     // Catch:{ all -> 0x0190 }
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            return
        L_0x002f:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0190 }
            java.io.File r2 = r7.f30892c     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = m23607d(r8)     // Catch:{ all -> 0x0190 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0190 }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x0190 }
            r3 = 1
            if (r9 != 0) goto L_0x0072
            if (r2 == 0) goto L_0x004b
            java.lang.String r4 = r0.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            com.bytedance.p723j.C11529c.m23613b(r4)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            goto L_0x004e
        L_0x004b:
            com.bytedance.p723j.C11529c.m23612a(r8)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
        L_0x004e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            java.lang.String r5 = "lib is loaded: "
            r4.<init>(r5)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            r4.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            r1.f30903a = r3     // Catch:{ UnsatisfiedLinkError -> 0x005c }
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            return
        L_0x005c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            java.lang.String r5 = "fail to load "
            r4.<init>(r5)     // Catch:{ all -> 0x0190 }
            java.lang.String r5 = r0.getName()     // Catch:{ all -> 0x0190 }
            r4.append(r5)     // Catch:{ all -> 0x0190 }
            java.lang.String r5 = ", out lib exists: "
            r4.append(r5)     // Catch:{ all -> 0x0190 }
            r4.append(r2)     // Catch:{ all -> 0x0190 }
        L_0x0072:
            r7.m23599a()     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x0127
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0190 }
            java.io.File r4 = r7.f30896g     // Catch:{ all -> 0x0190 }
            java.lang.String r5 = m23607d(r8)     // Catch:{ all -> 0x0190 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0190 }
            boolean r4 = r7.m23600a(r2)     // Catch:{ all -> 0x0190 }
            if (r4 != 0) goto L_0x0126
            com.bytedance.j.b$b r2 = new com.bytedance.j.b$b     // Catch:{ all -> 0x0190 }
            java.io.File r4 = r7.f30894e     // Catch:{ all -> 0x0190 }
            r2.<init>(r4)     // Catch:{ all -> 0x0190 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x010d }
            java.io.File r5 = r2.f30907d     // Catch:{ IOException -> 0x010d }
            java.lang.String r6 = "rw"
            r4.<init>(r5, r6)     // Catch:{ IOException -> 0x010d }
            r2.f30904a = r4     // Catch:{ IOException -> 0x010d }
            java.io.RandomAccessFile r4 = r2.f30904a     // Catch:{ IOException -> 0x0102 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0102 }
            r2.f30906c = r4     // Catch:{ IOException -> 0x0102 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f9 }
            java.lang.String r5 = "blocking on lock "
            r4.<init>(r5)     // Catch:{ IOException -> 0x00f9 }
            java.io.File r5 = r2.f30907d     // Catch:{ IOException -> 0x00f9 }
            java.lang.String r5 = r5.getPath()     // Catch:{ IOException -> 0x00f9 }
            r4.append(r5)     // Catch:{ IOException -> 0x00f9 }
            java.nio.channels.FileChannel r4 = r2.f30906c     // Catch:{ IOException -> 0x00f9 }
            java.nio.channels.FileLock r4 = r4.lock()     // Catch:{ IOException -> 0x00f9 }
            r2.f30905b = r4     // Catch:{ IOException -> 0x00f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0102 }
            java.lang.String r5 = "acquired on lock "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0102 }
            java.io.File r5 = r2.f30907d     // Catch:{ IOException -> 0x0102 }
            java.lang.String r5 = r5.getPath()     // Catch:{ IOException -> 0x0102 }
            r4.append(r5)     // Catch:{ IOException -> 0x0102 }
            boolean r4 = r7.m23608d(r0)     // Catch:{ IOException -> 0x010d }
            if (r4 != 0) goto L_0x00f5
            if (r9 == 0) goto L_0x00e1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010d }
            java.lang.String r0 = "may be system lib, no found "
            r9.<init>(r0)     // Catch:{ IOException -> 0x010d }
            r9.append(r8)     // Catch:{ IOException -> 0x010d }
            r2.mo22277a()     // Catch:{ all -> 0x0190 }
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            return
        L_0x00e1:
            com.bytedance.j.d r9 = new com.bytedance.j.d     // Catch:{ IOException -> 0x010d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010d }
            java.lang.String r3 = "fail to find "
            r0.<init>(r3)     // Catch:{ IOException -> 0x010d }
            r0.append(r8)     // Catch:{ IOException -> 0x010d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x010d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x010d }
            throw r9     // Catch:{ IOException -> 0x010d }
        L_0x00f5:
            r2.mo22277a()     // Catch:{ all -> 0x0190 }
            goto L_0x0127
        L_0x00f9:
            r9 = move-exception
            com.bytedance.j.b r0 = com.bytedance.p723j.C11526b.this     // Catch:{ IOException -> 0x0102 }
            java.nio.channels.FileChannel r3 = r2.f30906c     // Catch:{ IOException -> 0x0102 }
            r0.mo22274a(r3)     // Catch:{ IOException -> 0x0102 }
            throw r9     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            r9 = move-exception
            com.bytedance.j.b r0 = com.bytedance.p723j.C11526b.this     // Catch:{ IOException -> 0x010d }
            java.io.RandomAccessFile r3 = r2.f30904a     // Catch:{ IOException -> 0x010d }
            r0.mo22274a(r3)     // Catch:{ IOException -> 0x010d }
            throw r9     // Catch:{ IOException -> 0x010d }
        L_0x010b:
            r8 = move-exception
            goto L_0x0122
        L_0x010d:
            r9 = move-exception
            com.bytedance.j.d r0 = new com.bytedance.j.d     // Catch:{ all -> 0x010b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "fail to extract "
            r3.<init>(r4)     // Catch:{ all -> 0x010b }
            r3.append(r8)     // Catch:{ all -> 0x010b }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x010b }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x0122:
            r2.mo22277a()     // Catch:{ all -> 0x0190 }
            throw r8     // Catch:{ all -> 0x0190 }
        L_0x0126:
            r0 = r2
        L_0x0127:
            java.util.List r2 = r7.m23603b(r0)     // Catch:{ IOException -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0187 }
        L_0x012f:
            boolean r4 = r2.hasNext()     // Catch:{ IOException -> 0x0187 }
            if (r4 == 0) goto L_0x0159
            java.lang.Object r4 = r2.next()     // Catch:{ IOException -> 0x0187 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0187 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x0187 }
            r6 = 3
            int r5 = r5 - r6
            java.lang.String r4 = r4.substring(r6, r5)     // Catch:{ IOException -> 0x0187 }
            boolean r5 = m23601a(r4)     // Catch:{ IOException -> 0x0187 }
            if (r5 != 0) goto L_0x012f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0187 }
            java.lang.String r6 = "to load depended lib "
            r5.<init>(r6)     // Catch:{ IOException -> 0x0187 }
            r5.append(r4)     // Catch:{ IOException -> 0x0187 }
            r7.mo22275a(r4, r9)     // Catch:{ IOException -> 0x0187 }
            goto L_0x012f
        L_0x0159:
            java.lang.String r9 = r0.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x016e }
            com.bytedance.p723j.C11529c.m23613b(r9)     // Catch:{ UnsatisfiedLinkError -> 0x016e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x016e }
            java.lang.String r2 = "loaded the lib "
            r9.<init>(r2)     // Catch:{ UnsatisfiedLinkError -> 0x016e }
            r9.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x016e }
            r1.f30903a = r3     // Catch:{ all -> 0x0190 }
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            return
        L_0x016e:
            r8 = move-exception
            com.bytedance.j.d r9 = new com.bytedance.j.d     // Catch:{ all -> 0x0190 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "finally fail to load "
            r2.<init>(r3)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0190 }
            r2.append(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0190 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0190 }
            throw r9     // Catch:{ all -> 0x0190 }
        L_0x0187:
            r8 = move-exception
            com.bytedance.j.d r9 = new com.bytedance.j.d     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "fail to load depended lib"
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0190 }
            throw r9     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            throw r8
        L_0x0193:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p723j.C11526b.mo22275a(java.lang.String, boolean):void");
    }

    private C11526b(ApplicationInfo applicationInfo, File file, C11529c cVar) {
        this.f30892c = file;
        this.f30891b = cVar;
        this.f30899j = applicationInfo;
    }
}
