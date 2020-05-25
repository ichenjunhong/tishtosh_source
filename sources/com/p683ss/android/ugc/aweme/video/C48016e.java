package com.p683ss.android.ugc.aweme.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.video.e */
public final class C48016e {

    /* renamed from: a */
    static Context f120685a;

    /* renamed from: a */
    public static File m103932a() {
        return m103941b(f120685a);
    }

    /* renamed from: d */
    public static File m103950d() {
        return m103946c(f120685a);
    }

    /* renamed from: e */
    public static String m103953e() {
        return m103946c(f120685a).getPath();
    }

    /* renamed from: g */
    public static boolean m103957g() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static File m103940b() {
        if (!m103956f() || !m103957g()) {
            return null;
        }
        File file = new File(m103932a(), "video");
        m103937a(file);
        return file;
    }

    /* renamed from: c */
    public static File m103945c() {
        if (!m103956f() || !m103957g()) {
            return null;
        }
        File file = new File(m103932a(), "picture");
        m103937a(file);
        return file;
    }

    /* renamed from: f */
    public static boolean m103956f() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return m103951d(f120685a);
        }
    }

    /* renamed from: h */
    public static long m103958h() {
        long j;
        if (!m103956f()) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (VERSION.SDK_INT >= 18) {
            j = statFs.getAvailableBytes();
        } else {
            j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        }
        return j;
    }

    /* renamed from: a */
    public static void m103936a(Context context) {
        if (context != null) {
            f120685a = context;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static File m103941b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            return context.getCacheDir();
        }
        return externalCacheDir;
    }

    /* renamed from: a */
    public static void m103937a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    public static void m103942b(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                m103942b(file2);
                            } else {
                                file2.delete();
                            }
                        }
                        file.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static File m103946c(Context context) {
        if (!Environment.isExternalStorageEmulated()) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                m103937a(externalFilesDir);
                return externalFilesDir;
            }
        }
        return context.getFilesDir();
    }

    /* renamed from: e */
    public static void m103954e(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m103942b(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A[SYNTHETIC, Splitter:B:19:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0037 A[SYNTHETIC, Splitter:B:27:0x0037] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m103955f(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0034, all -> 0x002c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r5.<init>()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r2 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r2]     // Catch:{ Exception -> 0x0035, all -> 0x002a }
        L_0x0016:
            int r3 = r0.read(r2)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r4 = -1
            if (r3 == r4) goto L_0x0022
            r4 = 0
            r5.append(r2, r4, r3)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            goto L_0x0016
        L_0x0022:
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r5
        L_0x002a:
            r5 = move-exception
            goto L_0x002e
        L_0x002c:
            r5 = move-exception
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r5
        L_0x0034:
            r0 = r1
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48016e.m103955f(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static File m103934a(String str) {
        if (!m103956f() || !m103957g() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(m103932a(), str);
        m103937a(file);
        return file;
    }

    /* renamed from: b */
    public static boolean m103944b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: c */
    public static boolean m103947c(String str) {
        if (TextUtils.isEmpty(str) || !m103957g()) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static long m103949d(String str) {
        long j = 0;
        try {
            if (m103957g()) {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                return 0;
                            }
                            for (File file2 : listFiles) {
                                if (file2.isFile()) {
                                    j += file2.length();
                                } else if (file2.isDirectory()) {
                                    j += m103949d(file2.getAbsolutePath());
                                }
                            }
                            return j;
                        }
                    }
                    return 0;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static boolean m103951d(Context context) {
        Object obj;
        Method method;
        Method method2 = null;
        if (context != null) {
            obj = context.getSystemService("storage");
            try {
                method = obj.getClass().getMethod("getVolumeList", new Class[0]);
                try {
                    method2 = obj.getClass().getMethod("getVolumeState", new Class[]{String.class});
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                method = null;
            }
        } else {
            obj = null;
            method = null;
        }
        if (obj == null || method == null || method2 == null) {
            return false;
        }
        try {
            Object[] objArr = (Object[]) method.invoke(obj, new Object[0]);
            if (objArr != null) {
                if (objArr.length != 0) {
                    Method method3 = objArr[0].getClass().getMethod("getPath", new Class[0]);
                    Method method4 = objArr[0].getClass().getMethod("isEmulated", new Class[0]);
                    if (method3 != null) {
                        if (method4 != null) {
                            for (Object obj2 : objArr) {
                                if (((Boolean) method4.invoke(obj2, new Object[0])).booleanValue()) {
                                    if (method2.invoke(obj, new Object[]{(String) method3.invoke(obj2, new Object[0])}).equals("mounted")) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: b */
    public static void m103943b(String str, String str2) {
        m103938a(str, str2, true);
    }

    /* renamed from: a */
    public static File m103933a(File file, String str) {
        if (!m103956f() || !m103957g() || TextUtils.isEmpty(str)) {
            return null;
        }
        if (file == null) {
            file = m103932a();
        }
        File file2 = new File(file, str);
        m103937a(file2);
        return file2;
    }

    /* renamed from: a */
    public static File m103935a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
        return file;
    }

    /* renamed from: c */
    public static boolean m103948c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        m103935a(str2, true);
        return m103952d(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0065 A[SYNTHETIC, Splitter:B:52:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006a A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x006f A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0074 A[Catch:{ IOException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x007d A[SYNTHETIC, Splitter:B:65:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0082 A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0087 A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x008c A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0095 A[SYNTHETIC, Splitter:B:78:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x009a A[Catch:{ IOException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x009f A[Catch:{ IOException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00a4 A[Catch:{ IOException -> 0x00a7 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m103952d(java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = m103957g()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0078, all -> 0x005f }
            r2.<init>(r11)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0078, all -> 0x005f }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, all -> 0x0055 }
            r11.<init>(r12)     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, all -> 0x0055 }
            java.nio.channels.FileChannel r12 = r2.getChannel()     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0051, all -> 0x004b }
            java.nio.channels.FileChannel r9 = r11.getChannel()     // Catch:{ FileNotFoundException -> 0x0047, IOException -> 0x0044, all -> 0x003e }
            r4 = 0
            long r6 = r12.size()     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0045, all -> 0x0038 }
            r3 = r12
            r8 = r9
            r3.transferTo(r4, r6, r8)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0045, all -> 0x0038 }
            r2.close()     // Catch:{ IOException -> 0x0036 }
            if (r12 == 0) goto L_0x002e
            r12.close()     // Catch:{ IOException -> 0x0036 }
        L_0x002e:
            r11.close()     // Catch:{ IOException -> 0x0036 }
            if (r9 == 0) goto L_0x0036
            r9.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r11 = 1
            return r11
        L_0x0038:
            r0 = move-exception
            r10 = r12
            r12 = r11
            r11 = r0
            r0 = r10
            goto L_0x0063
        L_0x003e:
            r1 = move-exception
            r9 = r0
            r0 = r12
            r12 = r11
            r11 = r1
            goto L_0x0063
        L_0x0044:
            r9 = r0
        L_0x0045:
            r0 = r12
            goto L_0x007b
        L_0x0047:
            r9 = r0
        L_0x0048:
            r0 = r12
            goto L_0x0093
        L_0x004b:
            r12 = move-exception
            r9 = r0
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x0063
        L_0x0051:
            r9 = r0
            goto L_0x007b
        L_0x0053:
            r9 = r0
            goto L_0x0093
        L_0x0055:
            r11 = move-exception
            r12 = r0
            r9 = r12
            goto L_0x0063
        L_0x0059:
            r11 = r0
            r9 = r11
            goto L_0x007b
        L_0x005c:
            r11 = r0
            r9 = r11
            goto L_0x0093
        L_0x005f:
            r11 = move-exception
            r12 = r0
            r2 = r12
            r9 = r2
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            r0.close()     // Catch:{ IOException -> 0x0077 }
        L_0x006d:
            if (r12 == 0) goto L_0x0072
            r12.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0072:
            if (r9 == 0) goto L_0x0077
            r9.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            throw r11
        L_0x0078:
            r11 = r0
            r2 = r11
            r9 = r2
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ IOException -> 0x008f }
        L_0x0080:
            if (r0 == 0) goto L_0x0085
            r0.close()     // Catch:{ IOException -> 0x008f }
        L_0x0085:
            if (r11 == 0) goto L_0x008a
            r11.close()     // Catch:{ IOException -> 0x008f }
        L_0x008a:
            if (r9 == 0) goto L_0x008f
            r9.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r1
        L_0x0090:
            r11 = r0
            r2 = r11
            r9 = r2
        L_0x0093:
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x0098:
            if (r0 == 0) goto L_0x009d
            r0.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x009d:
            if (r11 == 0) goto L_0x00a2
            r11.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a2:
            if (r9 == 0) goto L_0x00a7
            r9.close()     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48016e.m103952d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m103939a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            FileWriter fileWriter = new FileWriter(str, false);
            fileWriter.write(str2);
            fileWriter.flush();
            fileWriter.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m103938a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    File file2 = new File(str2);
                    if (!file2.exists() || !file2.isDirectory()) {
                        file2.mkdirs();
                    }
                    for (File file3 : listFiles) {
                        if (!z || !file3.isDirectory()) {
                            String path = file3.getPath();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(file3.getName());
                            m103952d(path, sb.toString());
                        } else {
                            String path2 = file3.getPath();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(file3.getName());
                            sb2.append(File.separator);
                            m103938a(path2, sb2.toString(), z);
                        }
                    }
                }
            }
        }
    }
}
