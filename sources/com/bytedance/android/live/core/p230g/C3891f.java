package com.bytedance.android.live.core.p230g;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.bytedance.android.live.core.g.f */
public final class C3891f {

    /* renamed from: a */
    private static final FileFilter f10900a = new FileFilter() {
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[SYNTHETIC, Splitter:B:17:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037 A[SYNTHETIC, Splitter:B:24:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9840a() {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0033, all -> 0x002c }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0033, all -> 0x002c }
        L_0x0014:
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r1 == 0) goto L_0x0023
            java.lang.String r3 = "Hardware"
            boolean r3 = r1.startsWith(r3)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r3 == 0) goto L_0x0014
            r0 = r1
        L_0x0023:
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0027:
            r0 = move-exception
            r1 = r2
            goto L_0x002d
        L_0x002a:
            r1 = r2
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            java.lang.String r0 = ""
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0051
            java.lang.String r1 = ":"
            java.lang.String[] r1 = r0.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 != r3) goto L_0x0051
            r0 = 1
            r0 = r1[r0]
            java.lang.String r0 = r0.trim()
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p230g.C3891f.m9840a():java.lang.String");
    }
}
