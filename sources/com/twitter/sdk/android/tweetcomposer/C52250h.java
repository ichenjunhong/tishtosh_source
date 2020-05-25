package com.twitter.sdk.android.tweetcomposer;

/* renamed from: com.twitter.sdk.android.tweetcomposer.h */
final class C52250h {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m111674a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0035 }
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x002f
            boolean r8 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            goto L_0x0037
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            return r0
        L_0x0035:
            r8 = move-exception
            r7 = r0
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetcomposer.C52250h.m111674a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
