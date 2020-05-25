package com.github.luben.zstd.p996a;

import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.github.luben.zstd.a.a */
public enum C14726a {
    ;
    

    /* renamed from: a */
    private static final String f38144a = null;

    /* renamed from: b */
    private static boolean f38145b;

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (C14726a.class) {
            z = f38145b;
        }
        return z;
    }

    public static synchronized void load() {
        synchronized (C14726a.class) {
            load(null);
        }
    }

    static {
        StringBuilder sb = new StringBuilder("Unsupported OS/arch, cannot find ");
        sb.append(m30106c());
        sb.append(" or load zstd-jni");
        sb.append(" from system libraries. Please try building from source the jar or providing libzstd-jni");
        sb.append(" in your system.");
        f38144a = sb.toString();
        f38145b = false;
    }

    /* renamed from: a */
    private static String m30103a() {
        String replace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        if (replace.startsWith("win")) {
            return "win";
        }
        if (replace.startsWith("mac")) {
            return "darwin";
        }
        return replace;
    }

    /* renamed from: b */
    private static String m30105b() {
        if (m30103a().contains("os_x") || m30103a().contains("darwin")) {
            return "dylib";
        }
        if (m30103a().contains("win")) {
            return "dll";
        }
        return "so";
    }

    /* renamed from: c */
    private static String m30106c() {
        StringBuilder sb = new StringBuilder("/");
        sb.append(m30103a());
        sb.append("/");
        sb.append(System.getProperty("os.arch"));
        sb.append("/libzstd-jni");
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(m30105b());
        return sb.toString();
    }

    /* renamed from: a */
    private static UnsatisfiedLinkError m30104a(UnsatisfiedLinkError unsatisfiedLinkError) {
        StringBuilder sb = new StringBuilder();
        sb.append(unsatisfiedLinkError.getMessage());
        sb.append("\n");
        sb.append(f38144a);
        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(sb.toString());
        unsatisfiedLinkError2.setStackTrace(unsatisfiedLinkError.getStackTrace());
        return unsatisfiedLinkError2;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:73|74|75|76|77|(1:79)|(1:83)|84|85) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0091, code lost:
        r2 = th;
        r8 = r8;
        r4 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x00ba */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v3
      assigns: []
      uses: []
      mth insns count: 101
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0091 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:26:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ac A[Catch:{ IOException -> 0x00ba }] */
    /* JADX WARNING: Unknown variable types count: 14 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void load(java.io.File r8) {
        /*
            java.lang.Class<com.github.luben.zstd.a.a> r0 = com.github.luben.zstd.p996a.C14726a.class
            monitor-enter(r0)
            boolean r1 = f38145b     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = m30106c()     // Catch:{ all -> 0x00bb }
            java.lang.Class<com.github.luben.zstd.a.a> r2 = com.github.luben.zstd.p996a.C14726a.class
            java.io.InputStream r1 = r2.getResourceAsStream(r1)     // Catch:{ all -> 0x00bb }
            r2 = 1
            if (r1 != 0) goto L_0x0025
            java.lang.String r8 = "zstd-jni"
            com.github.luben.zstd.p996a.C14727b.m30107a(r8)     // Catch:{ UnsatisfiedLinkError -> 0x001f }
            f38145b = r2     // Catch:{ UnsatisfiedLinkError -> 0x001f }
            monitor-exit(r0)
            return
        L_0x001f:
            r8 = move-exception
            java.lang.UnsatisfiedLinkError r8 = m30104a(r8)     // Catch:{ all -> 0x00bb }
            throw r8     // Catch:{ all -> 0x00bb }
        L_0x0025:
            r3 = 0
            java.lang.String r4 = "libzstd-jni"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            java.lang.String r6 = "."
            r5.<init>(r6)     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            java.lang.String r6 = m30105b()     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            r5.append(r6)     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            java.io.File r8 = java.io.File.createTempFile(r4, r5, r8)     // Catch:{ IOException -> 0x009b, all -> 0x0098 }
            r8.deleteOnExit()     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0096, all -> 0x0091 }
        L_0x004a:
            int r6 = r1.read(r5)     // Catch:{ IOException -> 0x0096, all -> 0x0091 }
            r7 = -1
            if (r6 == r7) goto L_0x0056
            r7 = 0
            r4.write(r5, r7, r6)     // Catch:{ IOException -> 0x0096, all -> 0x0091 }
            goto L_0x004a
        L_0x0056:
            r4.flush()     // Catch:{ IOException -> 0x005d, all -> 0x0091 }
            r4.close()     // Catch:{ IOException -> 0x005d, all -> 0x0091 }
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x006d }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ UnsatisfiedLinkError -> 0x006d }
            java.lang.System.load(r4)     // Catch:{ UnsatisfiedLinkError -> 0x006d }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r5, r4)     // Catch:{ UnsatisfiedLinkError -> 0x006d }
            goto L_0x0072
        L_0x006d:
            java.lang.String r4 = "zstd-jni"
            com.github.luben.zstd.p996a.C14727b.m30107a(r4)     // Catch:{ UnsatisfiedLinkError -> 0x008b }
        L_0x0072:
            f38145b = r2     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
            r1.close()     // Catch:{ IOException -> 0x0089 }
            if (r3 == 0) goto L_0x007c
            r3.close()     // Catch:{ IOException -> 0x0089 }
        L_0x007c:
            if (r8 == 0) goto L_0x0087
            boolean r1 = r8.exists()     // Catch:{ IOException -> 0x0089 }
            if (r1 == 0) goto L_0x0087
            r8.delete()     // Catch:{ IOException -> 0x0089 }
        L_0x0087:
            monitor-exit(r0)
            return
        L_0x0089:
            monitor-exit(r0)
            return
        L_0x008b:
            r2 = move-exception
            java.lang.UnsatisfiedLinkError r2 = m30104a(r2)     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
            throw r2     // Catch:{ IOException -> 0x0095, all -> 0x0093 }
        L_0x0091:
            r2 = move-exception
            goto L_0x00a6
        L_0x0093:
            r2 = move-exception
            goto L_0x00a7
        L_0x0095:
            r4 = r3
        L_0x0096:
            r3 = r8
            goto L_0x009c
        L_0x0098:
            r2 = move-exception
            r8 = r3
            goto L_0x00a7
        L_0x009b:
            r4 = r3
        L_0x009c:
            java.lang.ExceptionInInitializerError r8 = new java.lang.ExceptionInInitializerError     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "Cannot unpack libzstd-jni"
            r8.<init>(r2)     // Catch:{ all -> 0x00a4 }
            throw r8     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r2 = move-exception
            r8 = r3
        L_0x00a6:
            r3 = r4
        L_0x00a7:
            r1.close()     // Catch:{ IOException -> 0x00ba }
            if (r3 == 0) goto L_0x00af
            r3.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00af:
            if (r8 == 0) goto L_0x00ba
            boolean r1 = r8.exists()     // Catch:{ IOException -> 0x00ba }
            if (r1 == 0) goto L_0x00ba
            r8.delete()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            throw r2     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.p996a.C14726a.load(java.io.File):void");
    }
}
