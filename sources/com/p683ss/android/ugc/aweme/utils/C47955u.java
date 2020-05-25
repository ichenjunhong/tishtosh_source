package com.p683ss.android.ugc.aweme.utils;

import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.u */
public class C47955u {

    /* renamed from: c */
    private static C47955u f120562c;

    /* renamed from: a */
    public boolean f120563a;

    /* renamed from: b */
    public JSONObject f120564b;

    /* renamed from: a */
    public static C47955u m103766a() {
        if (f120562c == null) {
            synchronized (C47955u.class) {
                if (f120562c == null) {
                    f120562c = new C47955u();
                }
            }
        }
        return f120562c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[SYNTHETIC, Splitter:B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m103767a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            int r4 = r3.available()     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            r3.read(r4)     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            r3.close()     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            if (r3 == 0) goto L_0x0021
            r3.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r1
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r4 = move-exception
            r3 = r0
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r4
        L_0x002c:
            r3 = r0
        L_0x002d:
            if (r3 == 0) goto L_0x0032
            r3.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47955u.m103767a(android.content.Context, java.lang.String):java.lang.String");
    }
}
