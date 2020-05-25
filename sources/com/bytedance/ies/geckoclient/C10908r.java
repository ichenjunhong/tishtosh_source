package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.ies.geckoclient.r */
public final class C10908r {

    /* renamed from: a */
    private static byte[] f29279a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f29280b = {80, 75, 5, 6};

    /* renamed from: a */
    public final boolean mo19707a(String str) {
        return m22164a(new File(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC, Splitter:B:26:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0042 A[SYNTHETIC, Splitter:B:32:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m22164a(java.io.File r4) {
        /*
            boolean r0 = r4.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r4 = 4
            byte[] r0 = new byte[r4]     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            int r3 = r2.read(r0, r1, r4)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r3 != r4) goto L_0x0030
            byte[] r4 = f29279a     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 != 0) goto L_0x002e
            byte[] r4 = f29280b     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            boolean r4 = java.util.Arrays.equals(r4, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            if (r4 == 0) goto L_0x0030
        L_0x002e:
            r4 = 1
            r1 = 1
        L_0x0030:
            r2.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0045
        L_0x0034:
            r4 = move-exception
            goto L_0x003a
        L_0x0036:
            r0 = r2
            goto L_0x0040
        L_0x0038:
            r4 = move-exception
            r2 = r0
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r4
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10908r.m22164a(java.io.File):boolean");
    }

    /* renamed from: b */
    private static String m22166b(File file) {
        if (file == null) {
            return "tmpFile==null";
        }
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(file.getAbsolutePath());
            sb.append(";parent exists?");
            sb.append(file.getParentFile().exists());
            sb.append(";parent dir?");
            sb.append(file.getParentFile().isDirectory());
            sb.append(";write read");
            sb.append(file.getParentFile().canWrite());
            sb.append(file.getParentFile().canRead());
            sb.append(file.canWrite());
            sb.append(file.canRead());
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m22165a(String str, String str2) throws Exception {
        File file;
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        do {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (name == null || !name.contains("../")) {
                    file = new File(name);
                    while (!TextUtils.isEmpty(file.getParent())) {
                        file = file.getParentFile();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("目录穿越:");
                    sb.append(str);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                zipInputStream.close();
                return false;
            }
        } while (!TextUtils.equals(file.getPath(), str2));
        zipInputStream.close();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:1|2|(4:4|(4:6|(2:9|7)|83|10)|(2:14|(2:16|(6:18|(1:20)|21|22|23|(2:27|81)(1:80))(13:28|29|30|31|(1:33)|34|35|36|37|(2:38|(1:40)(1:84))|41|42|82))(3:49|50|51))|76)(1:77)) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (r2.endsWith("/") == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        r2.replace("/", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010b, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append(r11);
        r12.append(java.io.File.separator);
        r12.append(r2);
        r12.append(java.io.File.separator);
        r12.append("gecko_activate_done");
        r10 = new java.io.File(r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0132, code lost:
        if (r10.exists() != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r10.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r3 = r10;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013c, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        new java.lang.StringBuilder("unzip file done:").append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014a, code lost:
        if (r1 == null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0150, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x000e A[LOOP:0: B:1:0x000e->B:76:0x000e, LOOP_START, PHI: r1 r2 r3 
      PHI: (r1v2 java.io.FileOutputStream) = (r1v1 java.io.FileOutputStream), (r1v5 java.io.FileOutputStream) binds: [B:0:0x0000, B:76:0x000e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:0:0x0000, B:76:0x000e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v1 java.io.File) = (r3v0 java.io.File), (r3v5 java.io.File) binds: [B:0:0x0000, B:76:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo19706a(java.lang.String r10, java.lang.String r11, java.lang.String r12) throws java.lang.Exception {
        /*
            r9 = this;
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r10)
            r0.<init>(r1)
            r1 = 0
            java.lang.String r2 = ""
            r3 = r1
        L_0x000e:
            java.util.zip.ZipEntry r4 = r0.getNextEntry()     // Catch:{ Exception -> 0x0150 }
            if (r4 == 0) goto L_0x00f9
            java.lang.String r5 = r4.getName()     // Catch:{ Exception -> 0x0150 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0150 }
            if (r6 == 0) goto L_0x0036
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0150 }
        L_0x0023:
            java.lang.String r6 = r2.getParent()     // Catch:{ Exception -> 0x0150 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0150 }
            if (r6 != 0) goto L_0x0032
            java.io.File r2 = r2.getParentFile()     // Catch:{ Exception -> 0x0150 }
            goto L_0x0023
        L_0x0032:
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0150 }
        L_0x0036:
            if (r5 == 0) goto L_0x000e
            boolean r6 = r5.startsWith(r12)     // Catch:{ Exception -> 0x0150 }
            if (r6 == 0) goto L_0x000e
            java.lang.String r6 = "../"
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0150 }
            if (r6 != 0) goto L_0x00e5
            boolean r4 = r4.isDirectory()     // Catch:{ Exception -> 0x0150 }
            r6 = 0
            if (r4 == 0) goto L_0x0092
            int r4 = r5.length()     // Catch:{ Exception -> 0x0150 }
            r7 = 1
            int r4 = r4 - r7
            java.lang.String r4 = r5.substring(r6, r4)     // Catch:{ Exception -> 0x0150 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r6.<init>()     // Catch:{ Exception -> 0x0150 }
            r6.append(r11)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x0150 }
            r6.append(r8)     // Catch:{ Exception -> 0x0150 }
            r6.append(r4)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0150 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0150 }
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0150 }
            if (r4 != 0) goto L_0x0079
            r5.mkdirs()     // Catch:{ Exception -> 0x0150 }
        L_0x0079:
            java.lang.String r4 = "HUAWEI"
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x000e }
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x000e }
            if (r4 != 0) goto L_0x008d
            java.lang.String r4 = "HONOR"
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Exception -> 0x000e }
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x000e }
            if (r4 == 0) goto L_0x000e
        L_0x008d:
            r5.setWritable(r7)     // Catch:{ Exception -> 0x000e }
            goto L_0x000e
        L_0x0092:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r7.<init>()     // Catch:{ Exception -> 0x0150 }
            r7.append(r11)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x0150 }
            r7.append(r8)     // Catch:{ Exception -> 0x0150 }
            r7.append(r5)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0150 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0150 }
            java.io.File r3 = r4.getParentFile()     // Catch:{ Exception -> 0x00e1 }
            boolean r3 = r3.exists()     // Catch:{ Exception -> 0x00e1 }
            if (r3 != 0) goto L_0x00bc
            java.io.File r3 = r4.getParentFile()     // Catch:{ Exception -> 0x00e1 }
            r3.mkdirs()     // Catch:{ Exception -> 0x00e1 }
        L_0x00bc:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00e1 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00e1 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x00de, all -> 0x00da }
        L_0x00c5:
            int r5 = r0.read(r1)     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r7 = -1
            if (r5 == r7) goto L_0x00d3
            r3.write(r1, r6, r5)     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r3.flush()     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            goto L_0x00c5
        L_0x00d3:
            r3.close()     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r1 = r3
            r3 = r4
            goto L_0x000e
        L_0x00da:
            r10 = move-exception
            r1 = r3
            goto L_0x017a
        L_0x00de:
            r10 = move-exception
            r1 = r3
            goto L_0x00e2
        L_0x00e1:
            r10 = move-exception
        L_0x00e2:
            r3 = r4
            goto L_0x0156
        L_0x00e5:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            java.lang.String r2 = "目录穿越:"
            r12.<init>(r2)     // Catch:{ Exception -> 0x0150 }
            r12.append(r10)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x0150 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0150 }
            throw r11     // Catch:{ Exception -> 0x0150 }
        L_0x00f9:
            r0.close()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r10 = "/"
            boolean r10 = r2.endsWith(r10)     // Catch:{ Exception -> 0x0150 }
            if (r10 == 0) goto L_0x010b
            java.lang.String r10 = "/"
            java.lang.String r12 = ""
            r2.replace(r10, r12)     // Catch:{ Exception -> 0x0150 }
        L_0x010b:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r12.<init>()     // Catch:{ Exception -> 0x0150 }
            r12.append(r11)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r11 = java.io.File.separator     // Catch:{ Exception -> 0x0150 }
            r12.append(r11)     // Catch:{ Exception -> 0x0150 }
            r12.append(r2)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r11 = java.io.File.separator     // Catch:{ Exception -> 0x0150 }
            r12.append(r11)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r11 = "gecko_activate_done"
            r12.append(r11)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x0150 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0150 }
            boolean r11 = r10.exists()     // Catch:{ Exception -> 0x0150 }
            if (r11 != 0) goto L_0x013c
            r10.createNewFile()     // Catch:{ Exception -> 0x0138 }
            goto L_0x013d
        L_0x0138:
            r11 = move-exception
            r3 = r10
            r10 = r11
            goto L_0x0156
        L_0x013c:
            r10 = r3
        L_0x013d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = "unzip file done:"
            r11.<init>(r12)     // Catch:{ Exception -> 0x0138 }
            r11.append(r2)     // Catch:{ Exception -> 0x0138 }
            r0.close()
            if (r1 == 0) goto L_0x014f
            r1.close()
        L_0x014f:
            return r2
        L_0x0150:
            r10 = move-exception
            goto L_0x0156
        L_0x0152:
            r10 = move-exception
            goto L_0x017a
        L_0x0154:
            r10 = move-exception
            r3 = r1
        L_0x0156:
            java.lang.String r11 = m22166b(r3)     // Catch:{ all -> 0x0152 }
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ all -> 0x0152 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            java.lang.String r3 = "解压失败:"
            r2.<init>(r3)     // Catch:{ all -> 0x0152 }
            r2.append(r11)     // Catch:{ all -> 0x0152 }
            java.lang.String r11 = ":"
            r2.append(r11)     // Catch:{ all -> 0x0152 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x0152 }
            r2.append(r10)     // Catch:{ all -> 0x0152 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0152 }
            r12.<init>(r10)     // Catch:{ all -> 0x0152 }
            throw r12     // Catch:{ all -> 0x0152 }
        L_0x017a:
            r0.close()
            if (r1 == 0) goto L_0x0182
            r1.close()
        L_0x0182:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10908r.mo19706a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
