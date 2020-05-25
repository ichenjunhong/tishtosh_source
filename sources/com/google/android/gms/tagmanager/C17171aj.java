package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.aj */
class C17171aj {

    /* renamed from: d */
    private static C17171aj f48566d;

    /* renamed from: a */
    public volatile C17172a f48567a = C17172a.NONE;

    /* renamed from: b */
    public volatile String f48568b = null;

    /* renamed from: c */
    public volatile String f48569c = null;

    /* renamed from: e */
    private volatile String f48570e = null;

    /* renamed from: com.google.android.gms.tagmanager.aj$a */
    enum C17172a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    C17171aj() {
    }

    /* renamed from: a */
    static C17171aj m42098a() {
        C17171aj ajVar;
        synchronized (C17171aj.class) {
            if (f48566d == null) {
                f48566d = new C17171aj();
            }
            ajVar = f48566d;
        }
        return ajVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33436a(android.net.Uri r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.lang.String r1 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            java.lang.String r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"
            boolean r2 = r1.matches(r2)     // Catch:{ all -> 0x00cf }
            r3 = 1
            if (r2 == 0) goto L_0x007e
            java.lang.String r0 = "Container preview url: "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            int r4 = r2.length()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x0025
            r0.concat(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x002a
        L_0x0025:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r2.<init>(r0)     // Catch:{ all -> 0x00cf }
        L_0x002a:
            java.lang.String r0 = ".*?&gtm_debug=x$"
            boolean r0 = r1.matches(r0)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.tagmanager.aj$a r0 = com.google.android.gms.tagmanager.C17171aj.C17172a.CONTAINER_DEBUG     // Catch:{ all -> 0x00cf }
            r5.f48567a = r0     // Catch:{ all -> 0x00cf }
            goto L_0x003b
        L_0x0037:
            com.google.android.gms.tagmanager.aj$a r0 = com.google.android.gms.tagmanager.C17171aj.C17172a.CONTAINER     // Catch:{ all -> 0x00cf }
            r5.f48567a = r0     // Catch:{ all -> 0x00cf }
        L_0x003b:
            java.lang.String r6 = r6.getQuery()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "&gtm_debug=x"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.replace(r0, r1)     // Catch:{ all -> 0x00cf }
            r5.f48570e = r6     // Catch:{ all -> 0x00cf }
            com.google.android.gms.tagmanager.aj$a r6 = r5.f48567a     // Catch:{ all -> 0x00cf }
            com.google.android.gms.tagmanager.aj$a r0 = com.google.android.gms.tagmanager.C17171aj.C17172a.CONTAINER     // Catch:{ all -> 0x00cf }
            if (r6 == r0) goto L_0x0055
            com.google.android.gms.tagmanager.aj$a r6 = r5.f48567a     // Catch:{ all -> 0x00cf }
            com.google.android.gms.tagmanager.aj$a r0 = com.google.android.gms.tagmanager.C17171aj.C17172a.CONTAINER_DEBUG     // Catch:{ all -> 0x00cf }
            if (r6 != r0) goto L_0x0074
        L_0x0055:
            java.lang.String r6 = "/r?"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r5.f48570e     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cf }
            int r1 = r0.length()     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x006c
            java.lang.String r6 = r6.concat(r0)     // Catch:{ all -> 0x00cf }
            goto L_0x0072
        L_0x006c:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r0.<init>(r6)     // Catch:{ all -> 0x00cf }
            r6 = r0
        L_0x0072:
            r5.f48569c = r6     // Catch:{ all -> 0x00cf }
        L_0x0074:
            java.lang.String r6 = r5.f48570e     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = m42099a(r6)     // Catch:{ all -> 0x00cf }
            r5.f48568b = r6     // Catch:{ all -> 0x00cf }
            monitor-exit(r5)
            return r3
        L_0x007e:
            java.lang.String r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"
            boolean r2 = r1.matches(r2)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r6 = r6.getQuery()     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = m42099a(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = r5.f48568b     // Catch:{ all -> 0x00cf }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00cf }
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = "Exit preview mode for container: "
            java.lang.String r0 = r5.f48568b     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cf }
            int r1 = r0.length()     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00a8
            r6.concat(r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00ad
        L_0x00a8:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r0.<init>(r6)     // Catch:{ all -> 0x00cf }
        L_0x00ad:
            com.google.android.gms.tagmanager.aj$a r6 = com.google.android.gms.tagmanager.C17171aj.C17172a.NONE     // Catch:{ all -> 0x00cf }
            r5.f48567a = r6     // Catch:{ all -> 0x00cf }
            r6 = 0
            r5.f48569c = r6     // Catch:{ all -> 0x00cf }
            monitor-exit(r5)
            return r3
        L_0x00b6:
            monitor-exit(r5)
            return r0
        L_0x00b8:
            java.lang.String r6 = "Invalid preview uri: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            int r2 = r1.length()     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x00c8
            r6.concat(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x00cd
        L_0x00c8:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r1.<init>(r6)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r5)
            return r0
        L_0x00cf:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x00d2:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17171aj.mo33436a(android.net.Uri):boolean");
    }

    /* renamed from: a */
    private static String m42099a(String str) {
        return str.split("&")[0].split("=")[1];
    }
}
