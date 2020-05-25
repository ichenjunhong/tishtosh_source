package com.bytedance.jirafast.p751d;

/* renamed from: com.bytedance.jirafast.d.f */
public final class C12025f {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(0)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[SYNTHETIC, Splitter:B:19:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC, Splitter:B:25:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<java.lang.String> m24439a(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.jirafast.d.f> r0 = com.bytedance.jirafast.p751d.C12025f.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            android.content.Context r2 = com.bytedance.jirafast.C11991a.m24390a()     // Catch:{ all -> 0x003c }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x003c }
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0035, all -> 0x002e }
        L_0x001b:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r5 == 0) goto L_0x0025
            r1.add(r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            goto L_0x001b
        L_0x0025:
            r3.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003a
        L_0x0029:
            r5 = move-exception
            r2 = r3
            goto L_0x002f
        L_0x002c:
            r2 = r3
            goto L_0x0035
        L_0x002e:
            r5 = move-exception
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            throw r5     // Catch:{ all -> 0x003c }
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            monitor-exit(r0)
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12025f.m24439a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|(0)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[SYNTHETIC, Splitter:B:19:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC, Splitter:B:25:0x0059] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> java.util.List<T> m24441b(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.jirafast.d.f> r0 = com.bytedance.jirafast.p751d.C12025f.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            android.content.Context r2 = com.bytedance.jirafast.C11991a.m24390a()     // Catch:{ all -> 0x005e }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x005e }
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0057, all -> 0x004f }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0057, all -> 0x004f }
        L_0x001b:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            if (r5 == 0) goto L_0x0047
            java.lang.String r2 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r2)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.String r4 = "ISO-8859-1"
            byte[] r5 = r5.getBytes(r4)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r5.<init>(r2)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.Object r4 = r5.readObject()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r5.close()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r2.close()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.io.Serializable r4 = (java.io.Serializable) r4     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r1.add(r4)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            goto L_0x001b
        L_0x0047:
            r3.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x004b:
            r5 = move-exception
            goto L_0x0051
        L_0x004d:
            r2 = r3
            goto L_0x0057
        L_0x004f:
            r5 = move-exception
            r3 = r2
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            throw r5     // Catch:{ all -> 0x005e }
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            monitor-exit(r0)
            return r1
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12025f.m24441b(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(0)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a A[SYNTHETIC, Splitter:B:33:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070 A[SYNTHETIC, Splitter:B:39:0x0070] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> boolean m24440a(java.lang.String r7, java.util.List<T> r8) {
        /*
            java.lang.Class<com.bytedance.jirafast.d.f> r0 = com.bytedance.jirafast.p751d.C12025f.class
            monitor-enter(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            android.content.Context r2 = com.bytedance.jirafast.C11991a.m24390a()     // Catch:{ all -> 0x0075 }
            java.io.File r7 = r2.getFileStreamPath(r7)     // Catch:{ all -> 0x0075 }
            boolean r2 = r7.exists()     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x001c
            r7.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return r1
        L_0x001c:
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x006e, all -> 0x0066 }
            r7 = 0
        L_0x0028:
            int r2 = r8.size()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            if (r7 >= r2) goto L_0x005d
            java.lang.Object r2 = r8.get(r7)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r4.<init>()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r5.writeObject(r2)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            java.lang.String r2 = "ISO-8859-1"
            java.lang.String r2 = r4.toString(r2)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            java.lang.String r6 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r5.close()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r4.close()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r3.write(r2)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r3.newLine()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            r3.flush()     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            int r7 = r7 + 1
            goto L_0x0028
        L_0x005d:
            r3.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            r1 = 1
            goto L_0x0073
        L_0x0062:
            r7 = move-exception
            goto L_0x0068
        L_0x0064:
            r2 = r3
            goto L_0x006e
        L_0x0066:
            r7 = move-exception
            r3 = r2
        L_0x0068:
            if (r3 == 0) goto L_0x006d
            r3.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            throw r7     // Catch:{ all -> 0x0075 }
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            monitor-exit(r0)
            return r1
        L_0x0075:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12025f.m24440a(java.lang.String, java.util.List):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(0)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC, Splitter:B:33:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC, Splitter:B:39:0x0053] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m24442b(java.lang.String r5, java.util.List<java.lang.String> r6) {
        /*
            java.lang.Class<com.bytedance.jirafast.d.f> r0 = com.bytedance.jirafast.p751d.C12025f.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            android.content.Context r2 = com.bytedance.jirafast.C11991a.m24390a()     // Catch:{ all -> 0x0058 }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x0058 }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x001c
            r5.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return r1
        L_0x001c:
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r5 = 0
        L_0x0028:
            int r2 = r6.size()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r5 >= r2) goto L_0x0040
            java.lang.Object r2 = r6.get(r5)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.write(r2)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.newLine()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.flush()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0040:
            r3.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r1 = 1
            goto L_0x0056
        L_0x0045:
            r5 = move-exception
            goto L_0x004b
        L_0x0047:
            r2 = r3
            goto L_0x0051
        L_0x0049:
            r5 = move-exception
            r3 = r2
        L_0x004b:
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r5     // Catch:{ all -> 0x0058 }
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            monitor-exit(r0)
            return r1
        L_0x0058:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12025f.m24442b(java.lang.String, java.util.List):boolean");
    }
}
