package com.bytedance.p513c.p515b;

import java.net.HttpURLConnection;

/* renamed from: com.bytedance.c.b.a */
public final class C9290a {

    /* renamed from: d */
    private static int f25401d = 5000;

    /* renamed from: a */
    private String f25402a;

    /* renamed from: b */
    private C9291a f25403b;

    /* renamed from: c */
    private String f25404c = "GET";

    /* renamed from: e */
    private HttpURLConnection f25405e;

    /* renamed from: com.bytedance.c.b.a$a */
    public interface C9291a {
        /* renamed from: a */
        void mo16882a(C9290a aVar, int i, String str);
    }

    /* JADX INFO: used method not loaded: com.bytedance.c.d.a(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.c.d.a(java.lang.String, org.json.JSONObject):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        if (r10.f25405e != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        r10.f25405e.disconnect();
        r10.f25405e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r10.f25405e != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r10.f25405e.disconnect();
        r10.f25405e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r10.f25405e != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        r8 = java.lang.System.currentTimeMillis() - r0;
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.put("duration", r8);
        r0.put("result", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        com.bytedance.p513c.C9302d.m18449a(com.bytedance.p513c.C9302d.m18446a("turing_verify_fetch_config", r0).toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16881a() {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.lang.String r6 = r10.f25402a     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r10.f25405e = r5     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = r10.f25405e     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            int r6 = f25401d     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r5.setConnectTimeout(r6)     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = r10.f25405e     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            int r6 = f25401d     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r5.setReadTimeout(r6)     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = r10.f25405e     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.lang.String r6 = r10.f25404c     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r5.setRequestMethod(r6)     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = r10.f25405e     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r5.connect()     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            java.net.HttpURLConnection r5 = r10.f25405e     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            int r5 = r5.getResponseCode()     // Catch:{ Exception -> 0x008d, all -> 0x0080 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x0071
            java.net.HttpURLConnection r6 = r10.f25405e     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r6.getContentLength()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            java.net.HttpURLConnection r6 = r10.f25405e     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r7 = r6
            java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            boolean r8 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r7)     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            if (r8 == 0) goto L_0x0056
            java.net.URL r8 = r7.getURL()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            java.lang.String r7 = r7.getContentType()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r8, r4, r4, r7)     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
        L_0x0056:
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            java.lang.String r7 = r8.readLine()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r8.close()     // Catch:{ Exception -> 0x008e, all -> 0x0080 }
            r6.close()     // Catch:{ Exception -> 0x006f, all -> 0x0080 }
            goto L_0x0074
        L_0x006f:
            goto L_0x008f
        L_0x0071:
            java.lang.String r7 = ""
            r3 = r5
        L_0x0074:
            java.net.HttpURLConnection r2 = r10.f25405e
            if (r2 == 0) goto L_0x0094
        L_0x0078:
            java.net.HttpURLConnection r2 = r10.f25405e
            r2.disconnect()
            r10.f25405e = r4
            goto L_0x0094
        L_0x0080:
            r0 = move-exception
            java.net.HttpURLConnection r1 = r10.f25405e
            if (r1 == 0) goto L_0x008c
            java.net.HttpURLConnection r1 = r10.f25405e
            r1.disconnect()
            r10.f25405e = r4
        L_0x008c:
            throw r0
        L_0x008d:
            r5 = -1
        L_0x008e:
            r7 = r2
        L_0x008f:
            java.net.HttpURLConnection r2 = r10.f25405e
            if (r2 == 0) goto L_0x0094
            goto L_0x0078
        L_0x0094:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "duration"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r1 = "result"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r1 = "turing_verify_fetch_config"
            org.json.JSONObject r0 = com.bytedance.p513c.C9302d.m18446a(r1, r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.p513c.C9302d.m18449a(r0)
        L_0x00b5:
            com.bytedance.c.b.a$a r0 = r10.f25403b
            r0.mo16882a(r10, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p513c.p515b.C9290a.mo16881a():void");
    }

    C9290a(String str, C9291a aVar) {
        this.f25403b = aVar;
        this.f25402a = str;
    }
}
