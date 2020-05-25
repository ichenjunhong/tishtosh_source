package com.p683ss.android.ugc.aweme.update;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.update.c */
public final class C47514c {

    /* renamed from: a */
    final Context f119893a;

    /* renamed from: b */
    final UpdateHelper f119894b;

    /* renamed from: c */
    volatile boolean f119895c;

    public C47514c(UpdateHelper updateHelper, Context context) {
        this.f119894b = updateHelper;
        this.f119893a = context;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e4, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0201, code lost:
        if (r12 != null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x020c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x020d, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x020f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0231, code lost:
        if (r12 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r4 = java.net.InetAddress.getByName(r12.getURL().getHost()).getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5 = r12.getURL().toString();
        r9 = new java.lang.StringBuilder("download failed statusCode:");
        r9.append(r0);
        r9.append(" url:");
        r9.append(r5);
        r9.append("  remote_ip:");
        r9.append(r4);
        r3 = new java.lang.Exception(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        r0 = new java.lang.Exception("can not know content length, give up");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        if (r11 <= 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014e, code lost:
        if (r11 != r10) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0151, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0153, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016a, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v1, types: [boolean]
      assigns: []
      uses: [?[int, byte, short, char], boolean]
      mth insns count: 254
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
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Exception -> 0x020f, all -> 0x0031 }, ExcHandler: all (th java.lang.Throwable), PHI: r12 r13 
      PHI: (r12v13 java.net.HttpURLConnection) = (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v6 java.net.HttpURLConnection) binds: [B:28:0x008f, B:30:0x0093, B:43:0x00b6, B:123:0x01b8, B:81:0x0154, B:82:?, B:85:0x015c, B:86:?, B:97:0x017d, B:110:0x01a0, B:111:?, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v13 java.lang.Exception) = (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v10 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception), (r13v3 java.lang.Exception) binds: [B:28:0x008f, B:30:0x0093, B:43:0x00b6, B:123:0x01b8, B:81:0x0154, B:82:?, B:85:0x015c, B:86:?, B:97:0x017d, B:110:0x01a0, B:111:?, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE], Splitter:B:123:0x01b8] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01e3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:113:0x01a2] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f9 A[SYNTHETIC, Splitter:B:152:0x01f9] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x020f A[ExcHandler: Exception (e java.lang.Exception), PHI: r12 
      PHI: (r12v8 java.net.HttpURLConnection) = (r12v9 java.net.HttpURLConnection), (r12v9 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v12 java.net.HttpURLConnection), (r12v6 java.net.HttpURLConnection) binds: [B:141:0x01e8, B:142:?, B:131:0x01ce, B:30:0x0093, B:43:0x00b6, B:123:0x01b8, B:119:0x01ae, B:120:?, B:81:0x0154, B:82:?, B:113:0x01a2, B:114:?, B:97:0x017d, B:110:0x01a0, B:111:?, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE], Splitter:B:123:0x01b8] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x021d A[SYNTHETIC, Splitter:B:170:0x021d] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0222 A[SYNTHETIC, Splitter:B:174:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x022e A[SYNTHETIC, Splitter:B:182:0x022e] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo94830a(java.lang.String r22, java.lang.String r23, boolean r24, java.lang.Exception[] r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            r0 = r23
            r6.<init>(r0)     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            r8 = 1
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x0226, all -> 0x0212 }
            r9 = r22
            r12 = r3
            r13 = r12
            r0 = 0
            r10 = 0
            r11 = 0
        L_0x001b:
            r14 = 4
            if (r0 >= r14) goto L_0x01e6
            if (r0 > r8) goto L_0x0034
            java.lang.String r14 = "http:"
            boolean r14 = r9.startsWith(r14)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r14 == 0) goto L_0x0036
            java.lang.String r14 = "http:"
            java.lang.String r15 = "https:"
            java.lang.String r9 = r9.replace(r14, r15)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            goto L_0x0216
        L_0x0034:
            r9 = r22
        L_0x0036:
            java.net.URL r14 = new java.net.URL     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r14.<init>(r9)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r15 = "https:"
            boolean r15 = r9.startsWith(r15)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r15 == 0) goto L_0x004b
            java.net.URLConnection r14 = r14.openConnection()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            javax.net.ssl.HttpsURLConnection r14 = (javax.net.ssl.HttpsURLConnection) r14     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
        L_0x0049:
            r12 = r14
            goto L_0x0052
        L_0x004b:
            java.net.URLConnection r14 = r14.openConnection()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x0049
        L_0x0052:
            r12.setInstanceFollowRedirects(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r14 = 6000(0x1770, float:8.408E-42)
            r12.setConnectTimeout(r14)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r12.setReadTimeout(r14)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            boolean r14 = r1.f119895c     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r14 != 0) goto L_0x01e6
            int r14 = r0 + 1
            if (r10 <= 0) goto L_0x008f
            java.lang.String r0 = "Range"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r8 = "bytes="
            r15.<init>(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r15.append(r10)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r8 = "-"
            r15.append(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r8 = r15.toString()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r15 = r12
            java.net.URLConnection r15 = (java.net.URLConnection) r15     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            boolean r16 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r15)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r16 == 0) goto L_0x008c
            java.net.URL r15 = r15.getURL()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r4 = ""
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r15, r0, r8, r4)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
        L_0x008c:
            r12.addRequestProperty(r0, r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
        L_0x008f:
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x01c7, Exception -> 0x01c4, all -> 0x0031 }
            boolean r4 = r1.f119895c     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r4 != 0) goto L_0x01e6
            if (r10 != 0) goto L_0x009d
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 != r4) goto L_0x00a3
        L_0x009d:
            if (r10 <= 0) goto L_0x00e4
            r4 = 206(0xce, float:2.89E-43)
            if (r0 == r4) goto L_0x00e4
        L_0x00a3:
            java.lang.String r4 = ""
            java.net.URL r5 = r12.getURL()     // Catch:{ UnknownHostException -> 0x00b6 }
            java.lang.String r5 = r5.getHost()     // Catch:{ UnknownHostException -> 0x00b6 }
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch:{ UnknownHostException -> 0x00b6 }
            java.lang.String r5 = r5.getHostAddress()     // Catch:{ UnknownHostException -> 0x00b6 }
            r4 = r5
        L_0x00b6:
            java.net.URL r5 = r12.getURL()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r10 = "download failed statusCode:"
            r9.<init>(r10)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r9.append(r0)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r0 = " url:"
            r9.append(r0)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r9.append(r5)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r0 = "  remote_ip:"
            r9.append(r0)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r9.append(r4)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r3 = r8
            goto L_0x01e7
        L_0x00e4:
            r0 = -1
            if (r10 != 0) goto L_0x0123
            java.lang.String r4 = "Transfer-Encoding"
            java.lang.String r4 = r12.getHeaderField(r4)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r4 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r4 = r3
        L_0x00f1:
            if (r4 != 0) goto L_0x0102
            java.lang.String r8 = "Content-Length"
            java.lang.String r8 = r12.getHeaderField(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r8 == 0) goto L_0x0100
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x0104
        L_0x0100:
            r8 = r3
            goto L_0x0104
        L_0x0102:
            r8 = r3
            r11 = -1
        L_0x0104:
            if (r8 != 0) goto L_0x0119
            if (r4 == 0) goto L_0x0110
            java.lang.String r8 = "chunked"
            boolean r4 = r4.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r4 != 0) goto L_0x0119
        L_0x0110:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r4 = "can not know content length, give up"
            r0.<init>(r4)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x01c5
        L_0x0119:
            com.ss.android.ugc.aweme.update.UpdateHelper r4 = r1.f119894b     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            java.lang.String r8 = ""
            r15 = r24
            r4.mo94791a(r11, r8, r15)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x0125
        L_0x0123:
            r15 = r24
        L_0x0125:
            r4 = r12
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ IOException -> 0x01b2 }
            boolean r8 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r4)     // Catch:{ IOException -> 0x01b2 }
            if (r8 == 0) goto L_0x0142
            java.net.URL r8 = r4.getURL()     // Catch:{ IOException -> 0x013a }
            java.lang.String r4 = r4.getContentType()     // Catch:{ IOException -> 0x013a }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r8, r3, r3, r4)     // Catch:{ IOException -> 0x013a }
            goto L_0x0142
        L_0x013a:
            r0 = move-exception
            r13 = r0
            r20 = r5
            r19 = r9
            goto L_0x01b8
        L_0x0142:
            java.io.InputStream r4 = r12.getInputStream()     // Catch:{ IOException -> 0x01b2 }
        L_0x0146:
            int r8 = r4.read(r5)     // Catch:{ IOException -> 0x01a6 }
            if (r8 != r0) goto L_0x015a
            if (r11 <= 0) goto L_0x0153
            if (r11 != r10) goto L_0x0151
            goto L_0x0153
        L_0x0151:
            r4 = 0
            goto L_0x0154
        L_0x0153:
            r4 = 1
        L_0x0154:
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r3 = r13
            goto L_0x01e8
        L_0x015a:
            int r10 = r10 + r8
            r3 = 0
            r7.write(r5, r3, r8)     // Catch:{ Exception -> 0x01a1, all -> 0x0031 }
            long r0 = (long) r10
            r17 = 209715200(0xc800000, double:1.036130757E-315)
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x0178
            r12.disconnect()     // Catch:{ Exception -> 0x0173, all -> 0x016e }
            r1 = r21
            goto L_0x01e6
        L_0x016e:
            r0 = move-exception
            r1 = r21
            goto L_0x0216
        L_0x0173:
            r0 = move-exception
            r1 = r21
            goto L_0x0210
        L_0x0178:
            r19 = r9
            r8 = r0
            r1 = r21
            boolean r0 = r1.f119895c     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r0 == 0) goto L_0x0186
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x01e6
        L_0x0186:
            com.ss.android.ugc.aweme.update.UpdateHelper r0 = r1.f119894b     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            com.ss.android.ugc.aweme.update.b r3 = r0.f119832L     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            r20 = r5
            com.ss.android.ugc.aweme.update.b r5 = r0.f119832L     // Catch:{ all -> 0x019e }
            r5.f119891a = r8     // Catch:{ all -> 0x019e }
            com.ss.android.ugc.aweme.update.b r0 = r0.f119832L     // Catch:{ all -> 0x019e }
            long r8 = (long) r11     // Catch:{ all -> 0x019e }
            r0.f119892b = r8     // Catch:{ all -> 0x019e }
            monitor-exit(r3)     // Catch:{ all -> 0x019e }
            r9 = r19
            r5 = r20
            r0 = -1
            r3 = 0
            goto L_0x0146
        L_0x019e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
        L_0x01a1:
            r0 = move-exception
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x01e3 }
            goto L_0x01c5
        L_0x01a6:
            r0 = move-exception
            r20 = r5
            r19 = r9
            r4.close()     // Catch:{ Exception -> 0x01ae, all -> 0x01e3 }
        L_0x01ae:
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x01e3 }
            goto L_0x01d9
        L_0x01b2:
            r0 = move-exception
            r20 = r5
            r19 = r9
            r13 = r0
        L_0x01b8:
            android.content.Context r0 = r1.f119893a     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            boolean r0 = com.p683ss.android.ugc.aweme.update.C47515d.m102943a(r0)     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            if (r0 == 0) goto L_0x01e6
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x0031 }
            goto L_0x01da
        L_0x01c4:
            r0 = move-exception
        L_0x01c5:
            r3 = r0
            goto L_0x01e7
        L_0x01c7:
            r0 = move-exception
            r15 = r24
            r20 = r5
            r19 = r9
            android.content.Context r3 = r1.f119893a     // Catch:{ Exception -> 0x020f, all -> 0x01e3 }
            boolean r3 = com.p683ss.android.ugc.aweme.update.C47515d.m102943a(r3)     // Catch:{ Exception -> 0x020f, all -> 0x01e3 }
            if (r3 == 0) goto L_0x01c5
            r12.disconnect()     // Catch:{ Exception -> 0x020f, all -> 0x01e3 }
        L_0x01d9:
            r13 = r0
        L_0x01da:
            r0 = r14
            r9 = r19
            r5 = r20
            r3 = 0
            r8 = 1
            goto L_0x001b
        L_0x01e3:
            r0 = move-exception
            r13 = r0
            goto L_0x0216
        L_0x01e6:
            r3 = r13
        L_0x01e7:
            r4 = 0
        L_0x01e8:
            r7.close()     // Catch:{ Exception -> 0x020f, all -> 0x020c }
            if (r4 == 0) goto L_0x01f9
            if (r3 == 0) goto L_0x01f2
            r4 = 0
            r25[r4] = r3
        L_0x01f2:
            if (r12 == 0) goto L_0x01f7
            r12.disconnect()     // Catch:{ Exception -> 0x01f7 }
        L_0x01f7:
            r2 = 1
            return r2
        L_0x01f9:
            r6.delete()     // Catch:{ Exception -> 0x0208, all -> 0x0204 }
            if (r3 == 0) goto L_0x0201
            r4 = 0
            r25[r4] = r3
        L_0x0201:
            if (r12 == 0) goto L_0x0236
            goto L_0x0233
        L_0x0204:
            r0 = move-exception
            r13 = r3
            r7 = 0
            goto L_0x0216
        L_0x0208:
            r0 = move-exception
            r3 = 0
            r7 = 0
            goto L_0x022a
        L_0x020c:
            r0 = move-exception
            r13 = r3
            goto L_0x0216
        L_0x020f:
            r0 = move-exception
        L_0x0210:
            r3 = 0
            goto L_0x022a
        L_0x0212:
            r0 = move-exception
            r7 = 0
            r12 = 0
            r13 = 0
        L_0x0216:
            if (r13 == 0) goto L_0x021b
            r3 = 0
            r25[r3] = r13
        L_0x021b:
            if (r7 == 0) goto L_0x0220
            r7.close()     // Catch:{ Exception -> 0x0220 }
        L_0x0220:
            if (r12 == 0) goto L_0x0225
            r12.disconnect()     // Catch:{ Exception -> 0x0225 }
        L_0x0225:
            throw r0
        L_0x0226:
            r0 = move-exception
            r3 = 0
            r7 = 0
            r12 = 0
        L_0x022a:
            r25[r3] = r0
            if (r7 == 0) goto L_0x0231
            r7.close()     // Catch:{ Exception -> 0x0231 }
        L_0x0231:
            if (r12 == 0) goto L_0x0236
        L_0x0233:
            r12.disconnect()     // Catch:{ Exception -> 0x0236 }
        L_0x0236:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.update.C47514c.mo94830a(java.lang.String, java.lang.String, boolean, java.lang.Exception[]):boolean");
    }
}
