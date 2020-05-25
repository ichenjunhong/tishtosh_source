package com.p683ss.android.ugc.effectmanager.common.p2441h;

import android.content.Context;
import android.os.Build;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.c */
public final class C48662c {

    /* renamed from: a */
    private static Map<String, Object> f122296a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final FileFilter f122297b = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.ugc.effectmanager.common.h.c$a */
    public static class C48664a {

        /* renamed from: a */
        public long f122298a;

        /* renamed from: b */
        public long f122299b;
    }

    /* renamed from: a */
    public static String m105292a() {
        Object obj = f122296a.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String b = m105295b();
        f122296a.put("cache_key_cpu_model", b);
        return b;
    }

    /* renamed from: b */
    private static String m105295b() {
        BufferedReader bufferedReader;
        String str = ":";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        m105293a((Closeable) bufferedReader);
                        break;
                    } else if (readLine.contains(str)) {
                        String[] split = readLine.split(str);
                        if (split[0].contains("Hardware")) {
                            String str2 = split[1];
                            m105293a((Closeable) bufferedReader);
                            return str2;
                        }
                    }
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    m105293a((Closeable) bufferedReader2);
                    return Build.HARDWARE;
                } catch (Throwable th) {
                    th = th;
                    m105293a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            m105293a((Closeable) bufferedReader2);
            return Build.HARDWARE;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            m105293a((Closeable) bufferedReader);
            throw th;
        }
        return Build.HARDWARE;
    }

    /* renamed from: a */
    private static void m105293a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static C48664a m105291a(Context context) {
        Object obj = f122296a.get("cache_key_memory_info");
        if (obj != null) {
            return (C48664a) obj;
        }
        C48664a aVar = new C48664a();
        aVar.f122298a = m105294b(context);
        aVar.f122299b = m105296c(context);
        f122296a.put("cache_key_memory_info", aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m105294b(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.totalMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemTotal"
            int r6 = m105290a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m105293a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m105293a(r6)
            throw r0
        L_0x0045:
            m105293a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48662c.m105294b(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m105296c(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)
            long r3 = r0.availMem
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x0040 }
            java.lang.String r6 = "MemAvailable"
            int r6 = m105290a(r6, r0)     // Catch:{ Exception -> 0x003e, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m105293a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x0041
        L_0x003e:
            r6 = r0
            goto L_0x0045
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            m105293a(r6)
            throw r0
        L_0x0045:
            m105293a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48662c.m105296c(android.content.Context):long");
    }

    /* renamed from: a */
    private static int m105290a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                }
                                i2++;
                            }
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
