package com.p683ss.android.ugc.tools.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.tools.utils.d */
public final class C50200d {
    /* renamed from: a */
    private static boolean m108344a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m108341a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m108349b(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    /* renamed from: a */
    public static boolean m108346a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: b */
    public static File m108348b(Context context) {
        if (!Environment.isExternalStorageEmulated()) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                m108349b(externalFilesDir);
                return externalFilesDir;
            }
        }
        return context.getFilesDir();
    }

    /* renamed from: d */
    private static boolean m108354d(Context context) {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return m108353c(context);
        }
    }

    /* renamed from: a */
    public static long m108338a(Context context) {
        long j;
        if (!m108354d(context)) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (VERSION.SDK_INT >= 18) {
            j = statFs.getAvailableBytes();
        } else {
            j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        }
        return j;
    }

    /* renamed from: b */
    public static boolean m108350b(String str) {
        if (TextUtils.isEmpty(str) || !m108344a()) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m108352c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m108342a(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m108353c(Context context) {
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

    /* renamed from: a */
    public static void m108342a(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                m108342a(file2);
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

    /* renamed from: a */
    public static File m108339a(String str, boolean z) {
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

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029 A[SYNTHETIC, Splitter:B:18:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0030 A[SYNTHETIC, Splitter:B:26:0x0030] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m108340a(java.io.InputStream r4, java.lang.String r5) {
        /*
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x002d, all -> 0x0025 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x002d, all -> 0x0025 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
        L_0x000f:
            r2 = -1
            int r3 = r1.read(r4)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r5.write(r4, r2, r3)     // Catch:{ Exception -> 0x002e, all -> 0x0023 }
            goto L_0x000f
        L_0x001b:
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            java.lang.String r4 = r5.toString()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            r1 = r0
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r4
        L_0x002d:
            r1 = r0
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.utils.C50200d.m108340a(java.io.InputStream, java.lang.String):java.lang.String");
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m108351b(java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = m108344a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.utils.C50200d.m108351b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m108345a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    m108341a((Closeable) inputStream);
                    m108341a((Closeable) outputStream);
                    return true;
                }
            } catch (Exception unused) {
                m108341a((Closeable) inputStream);
                m108341a((Closeable) outputStream);
                return false;
            } catch (Throwable th) {
                m108341a((Closeable) inputStream);
                m108341a((Closeable) outputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m108347a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        m108339a(str2, true);
        return m108351b(str, str2);
    }

    /* renamed from: a */
    public static void m108343a(String str, String str2, boolean z) {
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
                            m108351b(path, sb.toString());
                        } else {
                            String path2 = file3.getPath();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(file3.getName());
                            sb2.append(File.separator);
                            m108343a(path2, sb2.toString(), z);
                        }
                    }
                }
            }
        }
    }
}
