package com.bytedance.common.p518a;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.common.a.g */
final class C9344g implements Callable<C9337b> {

    /* renamed from: a */
    private final String f25577a;

    /* renamed from: b */
    private final Context f25578b;

    /* renamed from: c */
    private final String f25579c;

    /* renamed from: d */
    private final C9339c f25580d;

    /* renamed from: e */
    private final long f25581e;

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.bytedance.common.a.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bytedance.common.a.b] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.bytedance.common.a.b] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8
      assigns: [?[OBJECT, ARRAY], com.bytedance.common.a.b, ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.bytedance.common.a.b, java.lang.Object, java.io.InputStream]
      mth insns count: 165
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
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138 A[SYNTHETIC, Splitter:B:60:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013d A[Catch:{ IOException -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0190 A[SYNTHETIC, Splitter:B:84:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0195 A[Catch:{ IOException -> 0x0198 }] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.common.p518a.C9337b call() {
        /*
            r8 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            r2 = 14
            if (r1 < r2) goto L_0x000d
            r1 = 40965(0xa005, float:5.7404E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.lang.String r2 = "http://203.107.1.4:80/"
            r1.<init>(r2)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.lang.String r2 = r8.f25579c     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            r1.append(r2)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.lang.String r2 = "/d?host="
            r1.append(r2)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.lang.String r2 = r8.f25577a     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            r1.append(r2)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            boolean r2 = com.bytedance.common.p518a.C9343f.f25575a     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x002e
            com.bytedance.common.p518a.C9343f.m18512a(r1)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
        L_0x002e:
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            int r2 = r1.getResponseCode()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0082
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r3 = "response code is "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r2.append(r3)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r3 = " expect 200"
            r2.append(r3)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.text.DateFormat r3 = com.bytedance.common.p518a.C9343f.f25576b     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            if (r3 == 0) goto L_0x007f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r3.<init>()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.text.DateFormat r4 = com.bytedance.common.p518a.C9343f.f25576b     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.util.Date r5 = new java.util.Date     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r5.<init>()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r4 = r4.format(r5)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r3.append(r4)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r3.append(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
        L_0x007f:
            r3 = r0
            r5 = r3
            goto L_0x00e2
        L_0x0082:
            r2 = r1
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            boolean r3 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            if (r3 == 0) goto L_0x0096
            java.net.URL r3 = r2.getURL()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.lang.String r2 = r2.getContentType()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r3, r0, r0, r2)     // Catch:{ Exception -> 0x0111, all -> 0x010d }
        L_0x0096:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0107, all -> 0x0100 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0107, all -> 0x0100 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x0107, all -> 0x0100 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0107, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            r4.<init>()     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
        L_0x00ab:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            if (r5 == 0) goto L_0x00b5
            r4.append(r5)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            goto L_0x00ab
        L_0x00b5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r6 = "resolve host: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r6 = r8.f25577a     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            r5.append(r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r6 = ", return: "
            r5.append(r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            r5.append(r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            com.bytedance.common.p518a.C9343f.m18512a(r5)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            com.bytedance.common.a.b r5 = new com.bytedance.common.a.b     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            com.bytedance.common.a.c r6 = r8.f25580d     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            boolean r6 = r6.f25563f     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f4 }
            r0 = r2
        L_0x00e2:
            if (r1 == 0) goto L_0x00e7
            r1.disconnect()
        L_0x00e7:
            if (r0 == 0) goto L_0x00ec
            r0.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00ec:
            if (r3 == 0) goto L_0x00f1
            r3.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            r0 = r5
            goto L_0x0140
        L_0x00f4:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x0189
        L_0x00fa:
            r4 = move-exception
            r7 = r3
            r3 = r2
            r2 = r4
            r4 = r7
            goto L_0x0120
        L_0x0100:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r2
            r2 = r7
            goto L_0x0189
        L_0x0107:
            r3 = move-exception
            r4 = r0
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0120
        L_0x010d:
            r2 = move-exception
            r3 = r0
            goto L_0x0189
        L_0x0111:
            r2 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0120
        L_0x0115:
            r1 = move-exception
            r3 = r0
            r2 = r1
            r1 = r3
            goto L_0x0189
        L_0x011b:
            r1 = move-exception
            r3 = r0
            r4 = r3
            r2 = r1
            r1 = r4
        L_0x0120:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            java.lang.String r6 = "resolve fail: "
            r5.<init>(r6)     // Catch:{ all -> 0x0185 }
            r5.append(r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0185 }
            com.bytedance.common.p518a.C9343f.m18512a(r2)     // Catch:{ all -> 0x0185 }
            if (r1 == 0) goto L_0x0136
            r1.disconnect()
        L_0x0136:
            if (r3 == 0) goto L_0x013b
            r3.close()     // Catch:{ IOException -> 0x0140 }
        L_0x013b:
            if (r4 == 0) goto L_0x0140
            r4.close()     // Catch:{ IOException -> 0x0140 }
        L_0x0140:
            if (r0 != 0) goto L_0x014f
            com.bytedance.common.a.b r0 = new com.bytedance.common.a.b
            java.lang.String r1 = r8.f25577a
            long r2 = r8.f25581e
            com.bytedance.common.a.c r4 = r8.f25580d
            boolean r4 = r4.f25563f
            r0.<init>(r1, r2, r4)
        L_0x014f:
            com.bytedance.common.a.c r1 = r8.f25580d
            java.util.concurrent.ConcurrentMap<java.lang.String, com.bytedance.common.a.b> r1 = r1.f25558a
            int r1 = r1.size()
            r2 = 100
            if (r1 >= r2) goto L_0x0176
            com.bytedance.common.a.c r1 = r8.f25580d
            java.lang.String r2 = r8.f25577a
            java.util.concurrent.ConcurrentMap r3 = r1.mo16963a()     // Catch:{ Throwable -> 0x016e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ Throwable -> 0x016e }
            com.bytedance.common.a.b r3 = (com.bytedance.common.p518a.C9337b) r3     // Catch:{ Throwable -> 0x016e }
            if (r3 == 0) goto L_0x016e
            r3.mo16959a()     // Catch:{ Throwable -> 0x016e }
        L_0x016e:
            java.util.concurrent.ConcurrentMap r1 = r1.mo16963a()
            r1.put(r2, r0)
            goto L_0x017b
        L_0x0176:
            java.lang.String r1 = "the total number of hosts is exceed 100"
            com.bytedance.common.p518a.C9343f.m18512a(r1)
        L_0x017b:
            com.bytedance.common.a.c r1 = r8.f25580d
            java.lang.String r2 = r8.f25577a
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r1 = r1.f25560c
            r1.remove(r2)
            return r0
        L_0x0185:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r4
        L_0x0189:
            if (r1 == 0) goto L_0x018e
            r1.disconnect()
        L_0x018e:
            if (r0 == 0) goto L_0x0193
            r0.close()     // Catch:{ IOException -> 0x0198 }
        L_0x0193:
            if (r3 == 0) goto L_0x0198
            r3.close()     // Catch:{ IOException -> 0x0198 }
        L_0x0198:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.p518a.C9344g.call():com.bytedance.common.a.b");
    }

    C9344g(String str, Context context, String str2, C9339c cVar, long j) {
        this.f25577a = str;
        this.f25578b = context;
        this.f25579c = str2;
        this.f25580d = cVar;
        this.f25581e = j;
    }
}
