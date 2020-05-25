package com.p683ss.android.ugc.aweme.p1397az;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.ugc.aweme.az.a */
final class C23331a {

    /* renamed from: a */
    private static final FileFilter f62338a = new FileFilter() {
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

    /* renamed from: a */
    public static int m57385a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int a = m57386a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m57386a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                a = new File("/sys/devices/system/cpu/").listFiles(f62338a).length;
            }
            i = a;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m57390b() {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = m57385a()     // Catch:{ IOException -> 0x0086 }
            if (r2 >= r4) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0086 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0086 }
            r4.append(r2)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0086 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0086 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0086 }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x0086 }
            if (r4 == 0) goto L_0x0063
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x0086 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0086 }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r5 = 0
        L_0x0035:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r8 == 0) goto L_0x0042
            if (r5 >= r4) goto L_0x0042
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0042:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            if (r5 <= r3) goto L_0x005a
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x005a, all -> 0x005e }
            r3 = r4
        L_0x005a:
            r7.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0063
        L_0x005e:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0086 }
            throw r0     // Catch:{ IOException -> 0x0086 }
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0066:
            if (r3 != r1) goto L_0x0085
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086 }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0086 }
            java.lang.String r2 = "cpu MHz"
            int r2 = m57387a(r2, r0)     // Catch:{ all -> 0x0080 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = r3
        L_0x007b:
            r0.close()     // Catch:{ IOException -> 0x0086 }
            r1 = r2
            goto L_0x0086
        L_0x0080:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0086 }
            throw r2     // Catch:{ IOException -> 0x0086 }
        L_0x0085:
            r1 = r3
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1397az.C23331a.m57390b():int");
    }

    /* renamed from: a */
    private static void m57389a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static int m57386a(String str) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        int i = -1;
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (IOException unused) {
                m57389a((Closeable) fileInputStream);
                m57389a((Closeable) bufferedReader2);
                return -1;
            } catch (Throwable th) {
                th = th;
                m57389a((Closeable) fileInputStream);
                m57389a((Closeable) bufferedReader2);
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.matches("0-[\\d]+$")) {
                        i = Integer.parseInt(readLine.substring(2)) + 1;
                    }
                }
                m57389a((Closeable) fileInputStream);
                m57389a((Closeable) bufferedReader);
                return i;
            } catch (IOException unused2) {
                bufferedReader2 = bufferedReader;
                m57389a((Closeable) fileInputStream);
                m57389a((Closeable) bufferedReader2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                m57389a((Closeable) fileInputStream);
                m57389a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
            m57389a((Closeable) fileInputStream);
            m57389a((Closeable) bufferedReader2);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m57389a((Closeable) fileInputStream);
            m57389a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    public static long m57388a(Context context) {
        FileInputStream fileInputStream;
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = -1;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            j = ((long) m57387a("MemTotal", fileInputStream)) * 1024;
            fileInputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return j;
    }

    /* renamed from: a */
    private static int m57387a(String str, FileInputStream fileInputStream) {
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
