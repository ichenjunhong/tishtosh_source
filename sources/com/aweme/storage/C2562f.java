package com.aweme.storage;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.binary.Base64;

/* renamed from: com.aweme.storage.f */
public final class C2562f {

    /* renamed from: a */
    private static volatile int f7956a;

    /* renamed from: a */
    public static long m7490a() {
        try {
            return Environment.getExternalStorageDirectory().getTotalSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m7497b() {
        try {
            return Environment.getExternalStorageDirectory().getFreeSpace();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m7493a(int i) {
        f7956a = i;
    }

    /* renamed from: a */
    public static boolean m7494a(Context context) {
        if (f7956a <= 0) {
            return false;
        }
        long j = ((long) f7956a) * 1024 * 1024;
        if (m7495a(context, j) || m7500b(context, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m7491a(File file) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && file2.exists()) {
                    j += file2.length();
                }
            }
        }
        return j;
    }

    /* renamed from: b */
    public static String m7498b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (str.length() >= 54611) {
                str = str.substring(0, 54611);
            }
            byte[] a = m7496a(str.getBytes("utf-8"));
            if (a == null) {
                return null;
            }
            return new String(Base64.encodeBase64(a), "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static long m7492a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int i = 0;
                while (i < listFiles.length) {
                    try {
                        length += m7492a(listFiles[i].getAbsolutePath());
                        i++;
                    } catch (StackOverflowError unused) {
                        return 0;
                    } catch (OutOfMemoryError unused2) {
                        return 0;
                    }
                }
            }
        }
        return length;
    }

    /* renamed from: b */
    public static void m7499b(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            file.delete();
                            return;
                        }
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                m7499b(file2);
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

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0029 A[SYNTHETIC, Splitter:B:20:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0030 A[SYNTHETIC, Splitter:B:24:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0038 A[SYNTHETIC, Splitter:B:31:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x003f A[SYNTHETIC, Splitter:B:35:0x003f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m7496a(byte[] r3) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0034, all -> 0x0025 }
            r1.<init>()     // Catch:{ Exception -> 0x0034, all -> 0x0025 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r2.write(r3)     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r2.finish()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            byte[] r3 = r1.toByteArray()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            r2.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            r1.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0043
        L_0x001c:
            r3 = move-exception
            r0 = r2
            goto L_0x0027
        L_0x001f:
            goto L_0x0036
        L_0x0021:
            r3 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = r0
            goto L_0x0036
        L_0x0025:
            r3 = move-exception
            r1 = r0
        L_0x0027:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r3
        L_0x0034:
            r1 = r0
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r3 = r0
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2562f.m7496a(byte[]):byte[]");
    }

    /* renamed from: b */
    private static boolean m7500b(Context context, long j) {
        if (context == null) {
            return false;
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null && cacheDir.getFreeSpace() < j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m7495a(Context context, long j) {
        if (context == null) {
            return false;
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null && externalCacheDir.getFreeSpace() < j) {
            return true;
        }
        return false;
    }
}
