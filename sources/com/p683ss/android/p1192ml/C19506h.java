package com.p683ss.android.p1192ml;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ml.h */
public final class C19506h {

    /* renamed from: a */
    private static char[] f53862a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m47779a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m47780a(Throwable th) {
        C19496a a = C19500e.m47747a();
        if (a != null) {
            a.mo40655a(th, "ml-evaluator");
        }
    }

    /* renamed from: a */
    public static boolean m47781a(File file) {
        try {
            try {
                new ObjectInputStream(new FileInputStream(file)).close();
            } catch (Exception unused) {
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m47778a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(f53862a[(b & 240) >> 4]);
                sb.append(f53862a[b & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0046 A[SYNTHETIC, Splitter:B:30:0x0046] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m47782b(java.io.File r6) {
        /*
            boolean r0 = r6.isFile()
            if (r0 != 0) goto L_0x0009
            java.lang.String r6 = ""
            return r6
        L_0x0009:
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003b }
        L_0x001e:
            r6 = 0
            int r0 = r4.read(r2, r6, r1)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            r5 = -1
            if (r0 == r5) goto L_0x002a
            r3.update(r2, r6, r0)     // Catch:{ Exception -> 0x0039, all -> 0x0036 }
            goto L_0x001e
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            byte[] r6 = r3.digest()
            java.lang.String r6 = m47783b(r6)
            return r6
        L_0x0036:
            r6 = move-exception
            r0 = r4
            goto L_0x003c
        L_0x0039:
            r0 = r4
            goto L_0x0042
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r6
        L_0x0042:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1192ml.C19506h.m47782b(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    private static String m47783b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3
      assigns: []
      uses: []
      mth insns count: 86
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099 A[Catch:{ Exception -> 0x00ac, all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e A[Catch:{ Exception -> 0x00ac, all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bb A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m47777a(java.io.File r9, java.io.File r10) throws java.io.IOException {
        /*
            r0 = 0
            r10.mkdirs()     // Catch:{ Exception -> 0x00b2 }
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00b2 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x00b2 }
            r9 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r9]     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.util.Enumeration r3 = r1.entries()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r4 = r0
        L_0x0012:
            boolean r5 = r3.hasMoreElements()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r5 = r3.nextElement()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r7 = "../"
            boolean r6 = r6.contains(r7)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r6 != 0) goto L_0x0012
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r7.<init>()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r8 = r10.getPath()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r7.append(r8)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r8 = java.io.File.separator     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r7.append(r8)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r8 = r5.getName()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r7.append(r8)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            boolean r7 = r5.isDirectory()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r7 == 0) goto L_0x0055
            r6.mkdirs()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            goto L_0x0012
        L_0x0055:
            java.io.File r7 = r6.getParentFile()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r8 != 0) goto L_0x0062
            r7.mkdirs()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
        L_0x0062:
            r6.createNewFile()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0095 }
            java.io.InputStream r5 = r1.getInputStream(r5)     // Catch:{ all -> 0x0095 }
            r7.<init>(r5)     // Catch:{ all -> 0x0095 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0093 }
            r4.<init>(r6)     // Catch:{ all -> 0x0093 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0093 }
            r5.<init>(r4, r9)     // Catch:{ all -> 0x0093 }
        L_0x0078:
            r0 = 0
            int r4 = r7.read(r2, r0, r9)     // Catch:{ all -> 0x0090 }
            r6 = -1
            if (r4 == r6) goto L_0x0084
            r5.write(r2, r0, r4)     // Catch:{ all -> 0x0090 }
            goto L_0x0078
        L_0x0084:
            r5.flush()     // Catch:{ all -> 0x0090 }
            r5.close()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r7.close()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r0 = r5
            r4 = r7
            goto L_0x0012
        L_0x0090:
            r9 = move-exception
            r0 = r5
            goto L_0x0097
        L_0x0093:
            r9 = move-exception
            goto L_0x0097
        L_0x0095:
            r9 = move-exception
            r7 = r4
        L_0x0097:
            if (r0 == 0) goto L_0x009c
            r0.close()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
        L_0x009c:
            if (r7 == 0) goto L_0x00a1
            r7.close()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
        L_0x00a1:
            throw r9     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
        L_0x00a2:
            r1.close()
            java.lang.String r9 = r10.getPath()
            return r9
        L_0x00aa:
            r9 = move-exception
            goto L_0x00c6
        L_0x00ac:
            r9 = move-exception
            r0 = r1
            goto L_0x00b3
        L_0x00af:
            r9 = move-exception
            r1 = r0
            goto L_0x00c6
        L_0x00b2:
            r9 = move-exception
        L_0x00b3:
            boolean r1 = r9 instanceof java.io.IOException     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00bb
            r10.delete()     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00bb:
            r10.delete()     // Catch:{ all -> 0x00af }
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "Error when decompressing zip file."
            r10.<init>(r1, r9)     // Catch:{ all -> 0x00af }
            throw r10     // Catch:{ all -> 0x00af }
        L_0x00c6:
            if (r1 == 0) goto L_0x00cb
            r1.close()
        L_0x00cb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1192ml.C19506h.m47777a(java.io.File, java.io.File):java.lang.String");
    }
}
