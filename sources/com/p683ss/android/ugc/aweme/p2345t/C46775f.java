package com.p683ss.android.ugc.aweme.p2345t;

/* renamed from: com.ss.android.ugc.aweme.t.f */
public final class C46775f {

    /* renamed from: a */
    public static final C46775f f118132a = new C46775f();

    private C46775f() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4.isClosed() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r4.isClosed() == false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m101580a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r3 = "SELECT * FROM "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            r2.append(r5)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r5 = " LIMIT 0"
            r2.append(r5)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            android.database.Cursor r4 = r4.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            if (r4 == 0) goto L_0x0028
            int r5 = r4.getColumnIndex(r6)     // Catch:{ Exception -> 0x0042, all -> 0x0025 }
            r6 = -1
            if (r5 == r6) goto L_0x0028
            r5 = 1
            r1 = 1
            goto L_0x0028
        L_0x0025:
            r5 = move-exception
            r0 = r4
            goto L_0x0035
        L_0x0028:
            if (r4 == 0) goto L_0x004b
            boolean r5 = r4.isClosed()
            if (r5 != 0) goto L_0x004b
        L_0x0030:
            r4.close()
            goto L_0x004b
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            if (r0 == 0) goto L_0x0040
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r5
        L_0x0041:
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x004b
            boolean r5 = r4.isClosed()
            if (r5 != 0) goto L_0x004b
            goto L_0x0030
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2345t.C46775f.m101580a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }
}
