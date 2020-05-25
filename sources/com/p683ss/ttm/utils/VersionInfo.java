package com.p683ss.ttm.utils;

/* renamed from: com.ss.ttm.utils.VersionInfo */
public class VersionInfo {
    private static String[] mVersion;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r7 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0061, code lost:
        if (r7 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0073, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0076, code lost:
        if (r7 != null) goto L_0x003b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC, Splitter:B:26:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0068 A[SYNTHETIC, Splitter:B:45:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getVersion() {
        /*
            java.lang.String[] r0 = mVersion
            if (r0 != 0) goto L_0x0087
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "null"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "null"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "null"
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "null"
            r5 = 3
            r0[r5] = r1
            java.lang.String r1 = "/proc/version"
            r6 = 0
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Throwable -> 0x0065, all -> 0x004b }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x0065, all -> 0x004b }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0066, all -> 0x0048 }
            r8 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r7, r8)     // Catch:{ Throwable -> 0x0066, all -> 0x0048 }
            java.lang.String r6 = r1.readLine()     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            java.lang.String r8 = "\\s+"
            java.lang.String[] r6 = r6.split(r8)     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r6 = r6[r4]     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r0[r2] = r6     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r1.close()     // Catch:{ Throwable -> 0x003b, all -> 0x003f }
        L_0x003b:
            r7.close()     // Catch:{ Throwable -> 0x0079 }
            goto L_0x0079
        L_0x003f:
            r0 = move-exception
            r7.close()     // Catch:{ Throwable -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r0 = move-exception
            goto L_0x004e
        L_0x0046:
            r6 = r1
            goto L_0x0066
        L_0x0048:
            r0 = move-exception
            r1 = r6
            goto L_0x004e
        L_0x004b:
            r0 = move-exception
            r1 = r6
            r7 = r1
        L_0x004e:
            if (r1 == 0) goto L_0x0061
            r1.close()     // Catch:{ Throwable -> 0x005b, all -> 0x0054 }
            goto L_0x0061
        L_0x0054:
            r0 = move-exception
            if (r7 == 0) goto L_0x005a
            r7.close()     // Catch:{ Throwable -> 0x005a }
        L_0x005a:
            throw r0
        L_0x005b:
            if (r7 == 0) goto L_0x0064
        L_0x005d:
            r7.close()     // Catch:{ Throwable -> 0x0064 }
            goto L_0x0064
        L_0x0061:
            if (r7 == 0) goto L_0x0064
            goto L_0x005d
        L_0x0064:
            throw r0
        L_0x0065:
            r7 = r6
        L_0x0066:
            if (r6 == 0) goto L_0x0076
            r6.close()     // Catch:{ Throwable -> 0x0073, all -> 0x006c }
            goto L_0x0076
        L_0x006c:
            r0 = move-exception
            if (r7 == 0) goto L_0x0072
            r7.close()     // Catch:{ Throwable -> 0x0072 }
        L_0x0072:
            throw r0
        L_0x0073:
            if (r7 == 0) goto L_0x0079
            goto L_0x003b
        L_0x0076:
            if (r7 == 0) goto L_0x0079
            goto L_0x003b
        L_0x0079:
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0[r3] = r1
            java.lang.String r1 = android.os.Build.MODEL
            r0[r4] = r1
            java.lang.String r1 = android.os.Build.DISPLAY
            r0[r5] = r1
            mVersion = r0
        L_0x0087:
            java.lang.String[] r0 = mVersion
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttm.utils.VersionInfo.getVersion():java.lang.String[]");
    }
}
