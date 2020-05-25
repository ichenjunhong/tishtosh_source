package com.onething.xyvod;

public class XYVodSDK {

    /* renamed from: a */
    private static boolean f50339a;

    public static native String getInfoStatus();

    private static native String getInfoString(String str);

    private static native String getVersion();

    private static native int init(int i);

    private static native String playUrlRewrite(String str, boolean z);

    private static native int release();

    public static native int setLogEnable(int i);

    private static native int setLongValue(int i, String str, long j);

    public static native int setPlayPos(String str, long j);

    public static native int setStuck(String str, int i);

    private static native int stopTask(String str);

    /* renamed from: a */
    public static int m44425a() {
        try {
            return release();
        } catch (UnsatisfiedLinkError unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m44430b() {
        try {
            return getVersion();
        } catch (UnsatisfiedLinkError unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static int m44432c(String str) {
        try {
            return stopTask(m44431b(str));
        } catch (UnsatisfiedLinkError unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m44428a(String str) {
        try {
            return getInfoString(m44431b(str));
        } catch (UnsatisfiedLinkError unused) {
            return "";
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005a */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ExcHandler: SecurityException | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44427a(boolean r6) {
        /*
            f50339a = r6
            r0 = -1
            if (r6 != 0) goto L_0x006a
            java.lang.String r6 = "xyvodsdk"
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ SecurityException | UnsatisfiedLinkError -> 0x0064 }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r6)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            if (r3 == 0) goto L_0x005a
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            com.bytedance.android.p161c.C2835a.m8098a(r3, r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            r3.<init>()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            r3.append(r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.String r4 = "/lib"
            r3.append(r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            r3.append(r6)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.String r4 = ".so"
            r3.append(r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            boolean r4 = r4.exists()     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            if (r4 == 0) goto L_0x0056
            r4 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r6, r4)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            java.lang.System.load(r3)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r6)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
            goto L_0x0060
        L_0x0056:
            r3 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r6, r3)     // Catch:{ Throwable -> 0x005a, SecurityException | UnsatisfiedLinkError -> 0x0064 }
        L_0x005a:
            com.bytedance.p723j.C11511a.m23578a(r6)     // Catch:{ SecurityException | UnsatisfiedLinkError -> 0x0064 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r1, r6)     // Catch:{ SecurityException | UnsatisfiedLinkError -> 0x0064 }
        L_0x0060:
            r6 = 1
            f50339a = r6     // Catch:{ SecurityException | UnsatisfiedLinkError -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            boolean r6 = f50339a
            if (r6 != 0) goto L_0x006a
            return r0
        L_0x006a:
            r6 = 0
            int r6 = init(r6)     // Catch:{ UnsatisfiedLinkError -> 0x0070 }
            return r6
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onething.xyvod.XYVodSDK.m44427a(boolean):int");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44431b(java.lang.String r8) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r8.length()
            if (r2 >= r3) goto L_0x0057
            char r3 = r8.charAt(r2)
            if (r3 < 0) goto L_0x001b
            r4 = 255(0xff, float:3.57E-43)
            if (r3 > r4) goto L_0x001b
            r0.append(r3)
            goto L_0x0054
        L_0x001b:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r4 = "utf-8"
            byte[] r3 = r3.getBytes(r4)     // Catch:{ Exception -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.out
            r4.println(r3)
            byte[] r3 = new byte[r1]
        L_0x002e:
            r4 = 0
        L_0x002f:
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0054
            byte r5 = r3[r4]
            if (r5 >= 0) goto L_0x0038
            int r5 = r5 + 256
        L_0x0038:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "%"
            r6.<init>(r7)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r5 = r5.toUpperCase()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0057:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onething.xyvod.XYVodSDK.m44431b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m44429a(String str, int i) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        try {
            return playUrlRewrite(str, z);
        } catch (UnsatisfiedLinkError unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static int m44426a(String str, int i, long j) {
        try {
            m44431b(str);
            return setLongValue(i, str, j);
        } catch (UnsatisfiedLinkError unused) {
            return 0;
        }
    }
}
