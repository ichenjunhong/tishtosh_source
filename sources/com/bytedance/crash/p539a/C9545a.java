package com.bytedance.crash.p539a;

import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9598h;
import com.bytedance.crash.C9610j;

/* renamed from: com.bytedance.crash.a.a */
public class C9545a implements C9598h {

    /* renamed from: e */
    private static volatile C9545a f26011e;

    /* renamed from: a */
    public volatile String f26012a;

    /* renamed from: b */
    public volatile C9549c f26013b;

    /* renamed from: c */
    public volatile C9550d f26014c;

    /* renamed from: d */
    public volatile boolean f26015d;

    private C9545a() {
        C9610j.m19133a((C9598h) this, C9571d.ALL);
    }

    /* renamed from: a */
    public static C9545a m18940a() {
        if (f26011e == null) {
            synchronized (C9545a.class) {
                if (f26011e == null) {
                    f26011e = new C9545a();
                }
            }
        }
        return f26011e;
    }

    /* renamed from: b */
    public final void mo17351b() {
        if (this.f26013b != null) {
            try {
                this.f26013b.mo17355a();
            } catch (Throwable th) {
                C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.bytedance.crash.d] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], com.bytedance.crash.d]
      uses: [?[OBJECT, ARRAY], java.io.Closeable]
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
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17350a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f26012a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r12.f26012a
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x002e, all -> 0x0029 }
            r2.<init>(r13)     // Catch:{ Throwable -> 0x002e, all -> 0x0029 }
            r0.load(r2)     // Catch:{ Throwable -> 0x002f, all -> 0x0026 }
            goto L_0x002f
        L_0x0026:
            r13 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r13 = move-exception
        L_0x002a:
            com.bytedance.crash.p555n.C9697i.m19370a(r1)
            throw r13
        L_0x002e:
            r2 = r1
        L_0x002f:
            com.bytedance.crash.p555n.C9697i.m19370a(r2)
            java.lang.String r2 = "crash_time"
            java.lang.String r2 = r0.getProperty(r2)     // Catch:{ Throwable -> 0x00d4 }
            java.lang.Long r2 = java.lang.Long.decode(r2)     // Catch:{ Throwable -> 0x00d4 }
            long r6 = r2.longValue()     // Catch:{ Throwable -> 0x00d4 }
            java.io.File r2 = new java.io.File
            r2.<init>(r13)
            java.lang.String r2 = r2.getName()
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.LAUNCH
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0059
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.LAUNCH
        L_0x0057:
            r5 = r1
            goto L_0x0095
        L_0x0059:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.JAVA
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0068
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.JAVA
            goto L_0x0057
        L_0x0068:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.ANR
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0077
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.ANR
            goto L_0x0057
        L_0x0077:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.DART
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0086
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.DART
            goto L_0x0057
        L_0x0086:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.NATIVE
            java.lang.String r3 = r3.getName()
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0057
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.NATIVE
            goto L_0x0057
        L_0x0095:
            java.lang.String r1 = "process_name"
            java.lang.String r8 = r0.getProperty(r1)
            java.lang.String r1 = "alogDir"
            java.lang.String r0 = r0.getProperty(r1)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = r12.f26012a
        L_0x00a5:
            r4 = r0
            r0 = 95
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            int r1 = r2.length()
            int r1 = r1 + -5
            java.lang.String r9 = r2.substring(r0, r1)
            com.bytedance.crash.a.d r0 = r12.f26014c
            boolean r0 = r0 instanceof com.bytedance.crash.p539a.C9548b
            if (r0 == 0) goto L_0x00c5
            com.bytedance.crash.a.b r0 = new com.bytedance.crash.a.b
            r0.<init>(r8)
        L_0x00c3:
            r11 = r0
            goto L_0x00c8
        L_0x00c5:
            com.bytedance.crash.a.d r0 = r12.f26014c
            goto L_0x00c3
        L_0x00c8:
            r3 = r12
            r10 = r13
            boolean r0 = r3.m18941a(r4, r5, r6, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x00d3
            com.bytedance.crash.p555n.C9695g.m19358a(r13)
        L_0x00d3:
            return
        L_0x00d4:
            com.bytedance.crash.p555n.C9695g.m19358a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p539a.C9545a.mo17350a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo17349a(C9571d dVar, String str, Thread thread) {
        if (!dVar.equals(C9571d.NATIVE)) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0080 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17348a(com.bytedance.crash.C9571d r6, long r7, java.lang.String r9) {
        /*
            r5 = this;
            android.content.Context r0 = com.bytedance.crash.C9616k.m19154f()
            java.lang.String r0 = com.bytedance.crash.p555n.C9685a.m19318c(r0)
            com.bytedance.crash.a.c r1 = r5.f26013b     // Catch:{ Throwable -> 0x0098 }
            if (r1 == 0) goto L_0x001c
            com.bytedance.crash.a.c r1 = r5.f26013b     // Catch:{ Throwable -> 0x0012 }
            r1.mo17355a()     // Catch:{ Throwable -> 0x0012 }
            goto L_0x001c
        L_0x0012:
            r1 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r1)     // Catch:{ Throwable -> 0x0098 }
        L_0x001c:
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x0098 }
            android.content.Context r2 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x0098 }
            java.io.File r2 = com.bytedance.crash.p555n.C9705m.m19400e(r2)     // Catch:{ Throwable -> 0x0098 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0098 }
            r3.<init>()     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r4 = r6.getName()     // Catch:{ Throwable -> 0x0098 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r4 = "_"
            r3.append(r4)     // Catch:{ Throwable -> 0x0098 }
            r3.append(r9)     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r9 = ".atmp"
            r3.append(r9)     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r9 = r3.toString()     // Catch:{ Throwable -> 0x0098 }
            r1.<init>(r2, r9)     // Catch:{ Throwable -> 0x0098 }
            boolean r9 = r1.exists()     // Catch:{ Throwable -> 0x0098 }
            if (r9 == 0) goto L_0x004d
            return
        L_0x004d:
            java.io.File r9 = r1.getParentFile()     // Catch:{ Throwable -> 0x0098 }
            r9.mkdirs()     // Catch:{ Throwable -> 0x0098 }
            java.util.Properties r9 = new java.util.Properties     // Catch:{ Throwable -> 0x0098 }
            r9.<init>()     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r2 = "process_name"
            r9.setProperty(r2, r0)     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r0 = "crash_time"
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0098 }
            r9.setProperty(r0, r2)     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r0 = r5.f26012a     // Catch:{ Throwable -> 0x0098 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "alogDir"
            java.lang.String r2 = r5.f26012a     // Catch:{ Throwable -> 0x0098 }
            r9.setProperty(r0, r2)     // Catch:{ Throwable -> 0x0098 }
        L_0x0072:
            r0 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x008c, all -> 0x0086 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x008c, all -> 0x0086 }
            java.lang.String r1 = ""
            r9.store(r2, r1)     // Catch:{ Throwable -> 0x0080, all -> 0x0084 }
            r2.close()     // Catch:{ Throwable -> 0x0080, all -> 0x0084 }
        L_0x0080:
            com.bytedance.crash.p555n.C9697i.m19370a(r2)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x008e
        L_0x0084:
            r6 = move-exception
            goto L_0x0088
        L_0x0086:
            r6 = move-exception
            r2 = r0
        L_0x0088:
            com.bytedance.crash.p555n.C9697i.m19370a(r2)     // Catch:{ Throwable -> 0x0098 }
            throw r6     // Catch:{ Throwable -> 0x0098 }
        L_0x008c:
            r2 = r0
            goto L_0x0080
        L_0x008e:
            java.lang.String r9 = com.bytedance.crash.C9567c.C9568a.f26103k     // Catch:{ Throwable -> 0x0098 }
            com.bytedance.crash.g.a r6 = com.bytedance.crash.p547g.C9590b.m19072a(r6, r9, r7, r0)     // Catch:{ Throwable -> 0x0098 }
            com.bytedance.crash.p547g.C9591c.m19085b(r6)     // Catch:{ Throwable -> 0x0098 }
            return
        L_0x0098:
            r6 = move-exception
            com.bytedance.crash.f r7 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r8 = "NPTH_CATCH"
            r7.mo17384a(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p539a.C9545a.mo17348a(com.bytedance.crash.d, long, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ Throwable -> 0x00fd }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ Throwable -> 0x00fd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18941a(java.lang.String r16, com.bytedance.crash.C9571d r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.bytedance.crash.p539a.C9550d r23) {
        /*
            r15 = this;
            r0 = r16
            r2 = r18
            r4 = r20
            r5 = r23
            boolean r6 = android.text.TextUtils.isEmpty(r16)
            r7 = 0
            if (r6 == 0) goto L_0x0010
            return r7
        L_0x0010:
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            boolean r6 = r6.exists()
            if (r6 != 0) goto L_0x001c
            return r7
        L_0x001c:
            r15.mo17351b()
            if (r5 == 0) goto L_0x0108
            java.util.List r0 = r5.mo17354a(r0, r2)
            int r5 = r0.size()
            r6 = 1
            if (r5 <= 0) goto L_0x0107
            if (r4 == 0) goto L_0x0107
            com.bytedance.crash.f.d r5 = new com.bytedance.crash.f.d     // Catch:{ Throwable -> 0x00fd }
            r5.<init>()     // Catch:{ Throwable -> 0x00fd }
            com.bytedance.crash.k.a r8 = com.bytedance.crash.C9616k.m19147a()     // Catch:{ Throwable -> 0x00fd }
            java.util.Map r8 = r8.mo17446a()     // Catch:{ Throwable -> 0x00fd }
            if (r8 == 0) goto L_0x0049
            java.lang.String r9 = "aid"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x00fd }
            r5.f26156f = r8     // Catch:{ Throwable -> 0x00fd }
        L_0x0049:
            com.bytedance.crash.k.i r8 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r8 = r8.mo17507a()     // Catch:{ Throwable -> 0x00fd }
            r5.f26155e = r8     // Catch:{ Throwable -> 0x00fd }
            r5.f26157g = r4     // Catch:{ Throwable -> 0x00fd }
            r5.f26158h = r0     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r0 = com.bytedance.crash.C9567c.C9568a.f26104l     // Catch:{ Throwable -> 0x00fd }
            com.bytedance.crash.k.h r4 = com.bytedance.crash.p551k.C9652h.m19252a()     // Catch:{ Throwable -> 0x00fd }
            org.json.JSONObject r4 = r4.mo17502a(r2)     // Catch:{ Throwable -> 0x00fd }
            com.bytedance.crash.g.a r8 = new com.bytedance.crash.g.a     // Catch:{ Throwable -> 0x00fd }
            r8.<init>()     // Catch:{ Throwable -> 0x00fd }
            r8.crashTime = r2     // Catch:{ Throwable -> 0x00fd }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00fd }
            r8.eventTime = r2     // Catch:{ Throwable -> 0x00fd }
            r8.event = r0     // Catch:{ Throwable -> 0x00fd }
            if (r17 == 0) goto L_0x0078
            java.lang.String r0 = r17.getName()     // Catch:{ Throwable -> 0x00fd }
            r8.crashType = r0     // Catch:{ Throwable -> 0x00fd }
        L_0x0078:
            com.bytedance.crash.p547g.C9590b.m19077a(r8, r4)     // Catch:{ Throwable -> 0x00fd }
            if (r17 == 0) goto L_0x0080
            com.bytedance.crash.p547g.C9591c.m19085b(r8)     // Catch:{ Throwable -> 0x00fd }
        L_0x0080:
            java.lang.String r0 = r5.f26156f     // Catch:{ Throwable -> 0x00fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00fd }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r5.f26155e     // Catch:{ Throwable -> 0x00fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00fd }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r5.f26157g     // Catch:{ Throwable -> 0x00fd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00fd }
            if (r0 != 0) goto L_0x00a7
            java.util.List<java.lang.String> r0 = r5.f26158h     // Catch:{ Throwable -> 0x00fd }
            if (r0 == 0) goto L_0x00a7
            java.util.List<java.lang.String> r0 = r5.f26158h     // Catch:{ Throwable -> 0x00fd }
            int r0 = r0.size()     // Catch:{ Throwable -> 0x00fd }
            if (r0 != 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 != 0) goto L_0x00ab
            return r6
        L_0x00ab:
            android.content.Context r0 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x00fd }
            java.io.File r9 = com.bytedance.crash.p555n.C9705m.m19400e(r0)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r0 = "alog_%s.npth"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r3 = com.bytedance.crash.C9616k.m19152d()     // Catch:{ Throwable -> 0x00fd }
            r2[r7] = r3     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r10 = com.C2240a.m6772a(r0, r2)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r11 = r5.f26155e     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r12 = r5.f26156f     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r13 = r5.f26157g     // Catch:{ Throwable -> 0x00fd }
            java.util.List<java.lang.String> r14 = r5.f26158h     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r0 = com.bytedance.crash.p555n.C9695g.m19347a(r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x00fd }
            boolean r2 = android.text.TextUtils.isEmpty(r22)     // Catch:{ Throwable -> 0x00fd }
            if (r2 != 0) goto L_0x00d6
            com.bytedance.crash.p555n.C9695g.m19358a(r22)     // Catch:{ Throwable -> 0x00fd }
        L_0x00d6:
            com.bytedance.crash.a.a$2 r2 = new com.bytedance.crash.a.a$2     // Catch:{ Throwable -> 0x00fd }
            r18 = r2
            r19 = r15
            r20 = r5
            r21 = r17
            r22 = r8
            r23 = r0
            r18.<init>(r20, r21, r22, r23)     // Catch:{ Throwable -> 0x00fd }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x00fd }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ Throwable -> 0x00fd }
            if (r0 != r1) goto L_0x00f9
            com.bytedance.crash.k.j r0 = com.bytedance.crash.p551k.C9649f.m19247b()     // Catch:{ Throwable -> 0x0107 }
            r0.mo17509a(r2)     // Catch:{ Throwable -> 0x0107 }
            goto L_0x0107
        L_0x00f9:
            r2.run()     // Catch:{ Throwable -> 0x00fd }
            goto L_0x0107
        L_0x00fd:
            r0 = move-exception
            com.bytedance.crash.f r1 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo17384a(r2, r0)
        L_0x0107:
            return r6
        L_0x0108:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p539a.C9545a.m18941a(java.lang.String, com.bytedance.crash.d, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.crash.a.d):boolean");
    }
}
