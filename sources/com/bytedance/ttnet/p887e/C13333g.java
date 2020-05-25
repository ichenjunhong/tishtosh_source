package com.bytedance.ttnet.p887e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.p573d.C9890a;
import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.frameworks.baselib.network.http.retrofit.RequestVertifyInterceptor;
import com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a.C9920a;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12792q.C12794a;
import com.bytedance.retrofit2.p830a.C12683a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.retrofit.C13358b;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.ttnet.e.g */
public final class C13333g {

    /* renamed from: a */
    private static volatile List<C12727a> f34792a = new LinkedList();

    /* renamed from: b */
    private static C13329d<String, C12792q> f34793b = new C13329d<>(10);

    /* renamed from: c */
    private static C13329d<String, C12792q> f34794c = new C13329d<>(10);

    /* renamed from: a */
    private static void m26864a(C9831a aVar, String[] strArr, List<C12685b> list, C13302e eVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C12685b bVar : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f33318a)) {
                            str = bVar.f33319b;
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (C9431p.m18664a(str)) {
            str = eVar.f26778a;
        }
        if (C9431p.m18664a(str)) {
            str = m26862a(exc);
        }
        if (!C9431p.m18664a(str)) {
            if (strArr != null && strArr.length > 0) {
                strArr[0] = str;
            }
            if (aVar != null) {
                aVar.f26751a = str;
                if (aVar.f26752b != null) {
                    aVar.f26752b.f26778a = str;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r33v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r25v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r33v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r11v21 */
    /* JADX WARNING: type inference failed for: r11v22 */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r11v24 */
    /* JADX WARNING: type inference failed for: r11v25 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v2
      assigns: []
      uses: []
      mth insns count: 232
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
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0169 A[Catch:{ Throwable -> 0x01b0, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0171 A[Catch:{ Throwable -> 0x01b0, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0180 A[Catch:{ Throwable -> 0x01b0, all -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01cc A[Catch:{ all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01cf A[Catch:{ all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ef A[Catch:{ Throwable -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0150 A[Catch:{ Throwable -> 0x01b0, all -> 0x01ae }] */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m26866a(int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.bytedance.frameworks.baselib.network.http.p574e.C9909d<java.lang.String> r31, java.lang.String r32, com.bytedance.frameworks.baselib.network.http.p574e.C9914i r33, java.util.List<com.bytedance.retrofit2.p830a.C12685b> r34, java.lang.String[] r35, int[] r36) throws java.lang.Exception {
        /*
            r1 = r27
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r27)
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            android.util.Pair r0 = com.bytedance.frameworks.baselib.network.http.p574e.C9917l.m19876a(r1, r7)
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.second
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Class<com.bytedance.ttnet.INetworkApi> r0 = com.bytedance.ttnet.INetworkApi.class
            java.lang.Object r0 = m26861a(r3, r0)
            r3 = r0
            com.bytedance.ttnet.INetworkApi r3 = (com.bytedance.ttnet.INetworkApi) r3
            com.bytedance.ttnet.c.e r10 = new com.bytedance.ttnet.c.e
            r10.<init>()
            r11 = -1
            if (r3 == 0) goto L_0x01f3
            r4 = 0
            r5 = -1
            r8 = 0
            r13 = 0
            r9 = r10
            com.bytedance.retrofit2.b r3 = r3.downloadFile(r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x01c6, all -> 0x01c1 }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C13303d.m26799b()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            android.content.Context r0 = r0.mo24896a()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            boolean r0 = com.bytedance.ttnet.p887e.C13336h.m26871a(r0)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            if (r0 != 0) goto L_0x004e
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r13)     // Catch:{ Throwable -> 0x004d }
            if (r3 == 0) goto L_0x004d
            r3.cancel()     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            return r2
        L_0x004e:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            com.bytedance.frameworks.baselib.network.http.e$e r0 = com.bytedance.frameworks.baselib.network.http.C9894e.m19829c()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.mo17826b(r1)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            if (r0 == 0) goto L_0x0068
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            r0.mo17654c()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
            r0 = 1
            r6 = 1
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            com.bytedance.retrofit2.u r0 = r3.execute()     // Catch:{ Throwable -> 0x01b7, all -> 0x01b4 }
            if (r0 != 0) goto L_0x0081
            if (r6 == 0) goto L_0x0078
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r0.mo17655d()
        L_0x0078:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r13)     // Catch:{ Throwable -> 0x0080 }
            if (r3 == 0) goto L_0x0080
            r3.cancel()     // Catch:{ Throwable -> 0x0080 }
        L_0x0080:
            return r2
        L_0x0081:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0143 }
            com.bytedance.retrofit2.a.d r2 = r0.f33551a     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r2 = r2.f33351f     // Catch:{ Exception -> 0x0141 }
            boolean r9 = r2 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Exception -> 0x0141 }
            if (r9 == 0) goto L_0x0090
            com.bytedance.frameworks.baselib.network.http.a r2 = (com.bytedance.frameworks.baselib.network.http.C9831a) r2     // Catch:{ Exception -> 0x0141 }
            goto L_0x0091
        L_0x0090:
            r2 = r13
        L_0x0091:
            if (r2 == 0) goto L_0x009a
            r2.f26757g = r7     // Catch:{ Exception -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            r11 = r13
            goto L_0x0147
        L_0x009a:
            T r9 = r0.f33552b     // Catch:{ Exception -> 0x0096 }
            com.bytedance.retrofit2.mime.TypedInput r9 = (com.bytedance.retrofit2.mime.TypedInput) r9     // Catch:{ Exception -> 0x0096 }
            if (r9 == 0) goto L_0x00a5
            java.io.InputStream r11 = r9.mo9554in()     // Catch:{ Exception -> 0x0096 }
            goto L_0x00a6
        L_0x00a5:
            r11 = r13
        L_0x00a6:
            java.util.List r12 = r0.mo23959b()     // Catch:{ Exception -> 0x013e }
            java.lang.String r14 = "X-TT-LOGID"
            java.lang.String r25 = m26863a(r12, r14)     // Catch:{ Exception -> 0x013a }
            m26864a(r2, r13, r12, r10, r13)     // Catch:{ Exception -> 0x0138 }
            int r0 = r0.mo23958a()     // Catch:{ Exception -> 0x0138 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r0 != r14) goto L_0x0113
            if (r9 == 0) goto L_0x0113
            r9.length()     // Catch:{ Exception -> 0x0138 }
            long r15 = r9.length()     // Catch:{ Exception -> 0x0138 }
            com.bytedance.ttnet.e.g$1 r0 = new com.bytedance.ttnet.e.g$1     // Catch:{ Exception -> 0x0138 }
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x0138 }
            r18 = -1
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r14 = r11
            r17 = r0
            r19 = r28
            r21 = r30
            boolean r0 = com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19808a(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0138 }
            if (r0 == 0) goto L_0x0101
            boolean r9 = r3 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Exception -> 0x0138 }
            if (r9 == 0) goto L_0x00ea
            r9 = r3
            com.bytedance.retrofit2.l r9 = (com.bytedance.retrofit2.C12758l) r9     // Catch:{ Exception -> 0x0138 }
            r9.doCollect()     // Catch:{ Exception -> 0x0138 }
        L_0x00ea:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x00f2
            r2.f26758h = r14     // Catch:{ Exception -> 0x0138 }
        L_0x00f2:
            r9 = 0
            long r14 = r14 - r4
            r28 = r14
            r30 = r4
            r32 = r27
            r33 = r25
            r34 = r2
            com.bytedance.frameworks.baselib.network.http.C9894e.m19818a(r28, r30, r32, r33, r34)     // Catch:{ Exception -> 0x0138 }
        L_0x0101:
            if (r6 == 0) goto L_0x010a
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r1.mo17655d()
        L_0x010a:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r11)     // Catch:{ Throwable -> 0x0112 }
            if (r3 == 0) goto L_0x0112
            r3.cancel()     // Catch:{ Throwable -> 0x0112 }
        L_0x0112:
            return r0
        L_0x0113:
            if (r0 != r14) goto L_0x011f
            if (r9 != 0) goto L_0x011f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0138 }
            java.lang.String r9 = "HTTP TypedInput may not be null"
            r0.<init>(r9)     // Catch:{ Exception -> 0x0138 }
            throw r0     // Catch:{ Exception -> 0x0138 }
        L_0x011f:
            com.bytedance.frameworks.baselib.network.http.a.c r9 = new com.bytedance.frameworks.baselib.network.http.a.c     // Catch:{ Exception -> 0x0138 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            java.lang.String r15 = "get url = "
            r14.<init>(r15)     // Catch:{ Exception -> 0x0138 }
            r14.append(r1)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r15 = " exception"
            r14.append(r15)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0138 }
            r9.<init>(r0, r14)     // Catch:{ Exception -> 0x0138 }
            throw r9     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            goto L_0x014a
        L_0x013a:
            r0 = move-exception
            r25 = r13
            goto L_0x014a
        L_0x013e:
            r0 = move-exception
            r12 = r13
            goto L_0x0148
        L_0x0141:
            r0 = move-exception
            goto L_0x0145
        L_0x0143:
            r0 = move-exception
            r7 = r11
        L_0x0145:
            r2 = r13
            r11 = r2
        L_0x0147:
            r12 = r11
        L_0x0148:
            r25 = r12
        L_0x014a:
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r25)     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r9 == 0) goto L_0x0158
            java.lang.String r9 = "X-TT-LOGID"
            java.lang.String r9 = m26863a(r12, r9)     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            r25 = r9
        L_0x0158:
            if (r2 != 0) goto L_0x016c
            boolean r9 = r3 instanceof com.bytedance.retrofit2.C12759m     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r9 == 0) goto L_0x016c
            r9 = r3
            com.bytedance.retrofit2.m r9 = (com.bytedance.retrofit2.C12759m) r9     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            java.lang.Object r9 = r9.getRequestInfo()     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            boolean r14 = r9 instanceof com.bytedance.frameworks.baselib.network.http.C9831a     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r14 == 0) goto L_0x016c
            com.bytedance.frameworks.baselib.network.http.a r9 = (com.bytedance.frameworks.baselib.network.http.C9831a) r9     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            goto L_0x016d
        L_0x016c:
            r9 = r2
        L_0x016d:
            boolean r2 = r3 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r2 == 0) goto L_0x0177
            r2 = r3
            com.bytedance.retrofit2.l r2 = (com.bytedance.retrofit2.C12758l) r2     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            r2.doCollect()     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
        L_0x0177:
            m26864a(r9, r13, r12, r10, r0)     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r9 == 0) goto L_0x019b
            long r14 = r9.f26757g     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            r16 = 0
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x018a
            r9.f26757g = r7     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
        L_0x018a:
            r9.f26758h = r12     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            org.json.JSONObject r2 = r9.f26775y     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            if (r2 == 0) goto L_0x019b
            org.json.JSONObject r2 = r9.f26775y     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            java.lang.String r7 = "ex"
            java.lang.String r8 = r0.getMessage()     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            r2.put(r7, r8)     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
        L_0x019b:
            r2 = 0
            long r7 = r12 - r4
            r28 = r7
            r30 = r4
            r32 = r27
            r33 = r25
            r34 = r9
            r35 = r0
            com.bytedance.frameworks.baselib.network.http.C9894e.m19819a(r28, r30, r32, r33, r34, r35)     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
            throw r0     // Catch:{ Throwable -> 0x01b0, all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            goto L_0x01e1
        L_0x01b0:
            r0 = move-exception
            r13 = r3
            r2 = r6
            goto L_0x01c8
        L_0x01b4:
            r0 = move-exception
            r11 = r13
            goto L_0x01e1
        L_0x01b7:
            r0 = move-exception
            r2 = r6
            goto L_0x01be
        L_0x01ba:
            r0 = move-exception
            r11 = r13
            goto L_0x01c4
        L_0x01bd:
            r0 = move-exception
        L_0x01be:
            r11 = r13
            r13 = r3
            goto L_0x01c8
        L_0x01c1:
            r0 = move-exception
            r3 = r13
            r11 = r3
        L_0x01c4:
            r6 = 0
            goto L_0x01e1
        L_0x01c6:
            r0 = move-exception
            r11 = r13
        L_0x01c8:
            boolean r1 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x01de }
            if (r1 == 0) goto L_0x01cf
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ all -> 0x01de }
            goto L_0x01dd
        L_0x01cf:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x01de }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x01de }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x01de }
            r0 = r1
        L_0x01dd:
            throw r0     // Catch:{ all -> 0x01de }
        L_0x01de:
            r0 = move-exception
            r6 = r2
            r3 = r13
        L_0x01e1:
            if (r6 == 0) goto L_0x01ea
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
            r1.mo17655d()
        L_0x01ea:
            com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r11)     // Catch:{ Throwable -> 0x01f2 }
            if (r3 == 0) goto L_0x01f2
            r3.cancel()     // Catch:{ Throwable -> 0x01f2 }
        L_0x01f2:
            throw r0
        L_0x01f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p887e.C13333g.m26866a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.e.d, java.lang.String, com.bytedance.frameworks.baselib.network.http.e.i, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* renamed from: a */
    public static synchronized void m26865a(C12727a aVar) {
        synchronized (C13333g.class) {
            if (!f34792a.contains(aVar)) {
                f34792a.add(aVar);
            }
            C13337i.m26874a(f34793b, aVar);
            C13337i.m26874a(f34794c, aVar);
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m26856a(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        try {
            C9890a aVar = new C9890a(str);
            obj = aVar.getBaseType();
            try {
                obj2 = aVar.getParameter("charset");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            obj = null;
        }
        return new Pair<>(obj, obj2);
    }

    /* renamed from: b */
    public static synchronized C12792q m26867b(String str) {
        synchronized (C13333g.class) {
            if (C9431p.m18664a(str)) {
                return null;
            }
            C12792q qVar = (C12792q) f34793b.mo24934a(str);
            if (qVar != null) {
                return qVar;
            }
            C12792q a = m26858a(str, null, null, null);
            f34793b.mo24935a(str, a);
            return a;
        }
    }

    /* renamed from: a */
    public static String m26862a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static synchronized <S> S m26860a(C12792q qVar, Class<S> cls) {
        synchronized (C13333g.class) {
            if (qVar == null) {
                return null;
            }
            S a = qVar.mo23937a(cls);
            return a;
        }
    }

    /* renamed from: a */
    public static synchronized <S> S m26861a(String str, Class<S> cls) {
        S a;
        synchronized (C13333g.class) {
            a = m26860a(m26867b(str), cls);
        }
        return a;
    }

    /* renamed from: a */
    public static String m26863a(List<C12685b> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (C12685b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f33318a)) {
                return bVar.f33319b;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static synchronized C12792q m26857a(String str, List<C12727a> list, C12745a aVar) {
        C12792q a;
        synchronized (C13333g.class) {
            a = m26858a(str, list, null, null);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C12792q m26858a(String str, List<C12727a> list, C12745a aVar, C12726a aVar2) {
        C12792q a;
        synchronized (C13333g.class) {
            a = m26859a(str, list, aVar, (C12726a) null, (C12684a) new C12684a() {
                /* renamed from: a */
                public final C12683a mo9562a() {
                    return new C13358b();
                }
            });
        }
        return a;
    }

    /* renamed from: a */
    private static synchronized C12792q m26859a(String str, List<C12727a> list, C12745a aVar, C12726a aVar2, C12684a aVar3) {
        boolean z;
        C12792q a;
        synchronized (C13333g.class) {
            if (aVar == null) {
                try {
                    aVar = C9920a.m19890a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            C12794a a2 = new C12794a().mo23945a(str).mo23941a(aVar3).mo23946a((Executor) new C9919a()).mo23944a(aVar);
            if (aVar2 != null) {
                a2.mo23942a(aVar2);
            }
            LinkedList<C12727a> linkedList = new LinkedList<>();
            if (list == null || list.size() <= 0) {
                z = false;
            } else {
                z = false;
                for (C12727a aVar4 : list) {
                    if (aVar4 instanceof SsInterceptor) {
                        if (!z) {
                            linkedList.add(aVar4);
                            z = true;
                        }
                    } else if (aVar4 instanceof RequestVertifyInterceptor) {
                    }
                    linkedList.add(aVar4);
                }
            }
            if (!z) {
                linkedList.add(0, new SsInterceptor());
            }
            if (f34792a != null && f34792a.size() > 0) {
                linkedList.addAll(f34792a);
            }
            linkedList.add(new RequestVertifyInterceptor());
            for (C12727a a3 : linkedList) {
                a2.mo23943a(a3);
            }
            a = a2.mo23947a();
        }
        return a;
    }
}
