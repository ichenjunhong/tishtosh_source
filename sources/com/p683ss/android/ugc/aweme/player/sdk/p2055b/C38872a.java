package com.p683ss.android.ugc.aweme.player.sdk.p2055b;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.a */
public final class C38872a {

    /* renamed from: a */
    private static int f98980a = -1;

    /* renamed from: b */
    private static int f98981b = -1;

    /* renamed from: c */
    private static final FileFilter f98982c = new FileFilter() {
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

    /* renamed from: d */
    private static final Pattern f98983d = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static int m86414a() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        if (f98980a > 0) {
            return f98980a;
        }
        int i = -1;
        try {
            int a = m86415a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m86415a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                a = new File("/sys/devices/system/cpu/").listFiles(f98982c).length;
            }
            i = a;
        } catch (NullPointerException | SecurityException unused) {
        }
        f98980a = i;
        return i;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0061 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m86417b() {
        /*
            int r0 = f98981b
            if (r0 <= 0) goto L_0x0007
            int r0 = f98981b
            return r0
        L_0x0007:
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x000b:
            int r4 = m86414a()     // Catch:{ IOException -> 0x008e }
            if (r2 >= r4) goto L_0x006d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.<init>(r5)     // Catch:{ IOException -> 0x008e }
            r4.append(r2)     // Catch:{ IOException -> 0x008e }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x008e }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x008e }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008e }
            r5.<init>(r4)     // Catch:{ IOException -> 0x008e }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x008e }
            if (r4 == 0) goto L_0x006a
            r4 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r4]     // Catch:{ IOException -> 0x008e }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008e }
            r7.<init>(r5)     // Catch:{ IOException -> 0x008e }
            r7.read(r6)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r5 = 0
        L_0x003c:
            byte r8 = r6[r5]     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            boolean r8 = java.lang.Character.isDigit(r8)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            if (r8 == 0) goto L_0x0049
            if (r5 >= r4) goto L_0x0049
            int r5 = r5 + 1
            goto L_0x003c
        L_0x0049:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r4.<init>(r6, r0, r5)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            if (r5 <= r3) goto L_0x0061
            int r4 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0061, all -> 0x0065 }
            r3 = r4
        L_0x0061:
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x008e }
            throw r0     // Catch:{ IOException -> 0x008e }
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x006d:
            if (r3 != r1) goto L_0x008c
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008e }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x008e }
            java.lang.String r2 = "cpu MHz"
            int r2 = m86416a(r2, r0)     // Catch:{ all -> 0x0087 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r3
        L_0x0082:
            r0.close()     // Catch:{ IOException -> 0x008e }
            r1 = r2
            goto L_0x008f
        L_0x0087:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x008e }
        L_0x008c:
            r1 = r3
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            if (r1 <= 0) goto L_0x0093
            int r1 = r1 * 1000
        L_0x0093:
            f98981b = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38872a.m86417b():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m86415a(java.lang.String r3) {
        /*
            r0 = -1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f, all -> 0x0037 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003f, all -> 0x0037 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.String r3 = r3.readLine()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            if (r3 == 0) goto L_0x002f
            java.lang.String r1 = "0-[\\d]+$"
            boolean r1 = r3.matches(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            r1 = 2
            java.lang.String r3 = r3.substring(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            int r0 = r3 + 1
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r3 = move-exception
            goto L_0x0039
        L_0x0035:
            r1 = r2
            goto L_0x003f
        L_0x0037:
            r3 = move-exception
            r2 = r1
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r3
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.sdk.p2055b.C38872a.m86415a(java.lang.String):int");
    }

    /* renamed from: a */
    private static int m86416a(String str, FileInputStream fileInputStream) {
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
