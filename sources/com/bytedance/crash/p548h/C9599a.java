package com.bytedance.crash.p548h;

import android.os.SystemClock;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9598h;
import com.bytedance.crash.C9606i;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p551k.C9638c;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9705m;
import com.bytedance.crash.p555n.C9713t;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.h.a */
public final class C9599a implements UncaughtExceptionHandler {

    /* renamed from: e */
    public static volatile ThreadLocal<Boolean> f26176e = new ThreadLocal<>();

    /* renamed from: f */
    private static C9599a f26177f;

    /* renamed from: j */
    private static volatile boolean f26178j;

    /* renamed from: a */
    public C9600b f26179a;

    /* renamed from: b */
    public C9600b f26180b;

    /* renamed from: c */
    public ConcurrentHashMap<String, Object> f26181c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public ConcurrentHashMap<String, Object> f26182d = new ConcurrentHashMap<>();

    /* renamed from: g */
    private UncaughtExceptionHandler f26183g;

    /* renamed from: h */
    private volatile int f26184h;

    /* renamed from: i */
    private volatile int f26185i;

    /* renamed from: b */
    public static boolean m19109b() {
        return f26178j;
    }

    /* renamed from: a */
    public static C9599a m19103a() {
        if (f26177f == null) {
            f26177f = new C9599a();
        }
        return f26177f;
    }

    private C9599a() {
        UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f26183g = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: c */
    private void m19110c() {
        synchronized (this) {
            this.f26185i--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f26185i != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: d */
    private static void m19111d() {
        boolean z;
        File a = C9705m.m19391a(C9616k.m19154f());
        File b = C9705m.m19393b(C9616k.m19154f());
        File a2 = C9705m.m19390a();
        if (!C9695g.m19360b(a) || !C9695g.m19360b(b) || !C9695g.m19360b(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (true) {
                if (C9638c.m19220a().f26305d || !C9685a.m19317b(C9616k.m19154f())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                    try {
                        SystemClock.sleep(500);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17434a(String str) {
        this.f26181c.put(str, new Object());
    }

    /* renamed from: b */
    private void m19108b(Thread thread, Throwable th) {
        if (this.f26183g != null && this.f26183g != this) {
            this.f26183g.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private static boolean m19107a(Thread thread, Throwable th) {
        C9606i iVar = C9616k.m19150b().f26031i;
        if (iVar != null) {
            try {
                if (!iVar.mo17443a(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r11v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r5v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.bytedance.crash.a.a] */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r11v20 */
    /* JADX WARNING: type inference failed for: r11v21 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: type inference failed for: r6v32 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: type inference failed for: r6v34 */
    /* JADX WARNING: type inference failed for: r6v35 */
    /* JADX WARNING: type inference failed for: r11v22 */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01bb, code lost:
        if (r10 == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r5 = r11;
        r11 = r12;
        r6 = r14;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r5 = r11;
        r11 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015d, code lost:
        r11 = r17;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0187, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0188, code lost:
        r11 = r17;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018c, code lost:
        r5 = r11;
        r11 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018f, code lost:
        r10 = r2;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0191, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0192, code lost:
        r5 = r11;
        r11 = r12;
        r6 = r14;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0197, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0198, code lost:
        r5 = r11;
        r11 = r12;
        r6 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019b, code lost:
        r4 = null;
        r6 = r6;
        r5 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:21:0x005e, B:27:0x006f] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:60:0x0114, B:78:0x016d] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Throwable, code=null, for r21v0, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 246
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
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[Catch:{ Throwable -> 0x00ca, all -> 0x00c4 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:40:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cf A[Catch:{ Throwable -> 0x00ca, all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[SYNTHETIC, Splitter:B:48:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe A[SYNTHETIC, Splitter:B:54:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015c A[ExcHandler: all (th java.lang.Throwable), PHI: r5 r6 r17 
      PHI: (r5v11 ?) = (r5v27 ?), (r5v30 ?), (r5v33 ?), (r5v37 ?) binds: [B:54:0x00fe, B:78:0x016d, B:79:?, B:60:0x0114] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v9 ?) = (r6v24 ?), (r6v27 ?), (r6v30 ?), (r6v34 ?) binds: [B:54:0x00fe, B:78:0x016d, B:79:?, B:60:0x0114] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v1 long) = (r17v2 long), (r17v2 long), (r17v4 long) binds: [B:78:0x016d, B:79:?, B:60:0x0114] A[DONT_GENERATE, DONT_INLINE], Splitter:B:60:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a2 A[Catch:{ all -> 0x01be }] */
    /* JADX WARNING: Unknown variable types count: 28 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r20, java.lang.Throwable r21) {
        /*
            r19 = this;
            r7 = r19
            r15 = r20
            r14 = r21
            int r0 = r7.f26184h
            r1 = 3
            if (r0 < r1) goto L_0x000c
            return
        L_0x000c:
            int r0 = r7.f26184h
            r8 = 1
            int r0 = r0 + r8
            r7.f26184h = r0
            int r0 = r7.f26185i
            int r0 = r0 + r8
            r7.f26185i = r0
            boolean r0 = f26178j
            if (r0 == 0) goto L_0x0024
            java.lang.ThreadLocal<java.lang.Boolean> r0 = f26176e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0.set(r1)
        L_0x0024:
            f26178j = r8
            r9 = 0
            long r12 = java.lang.System.currentTimeMillis()
            long r0 = com.bytedance.crash.C9616k.m19157i()
            long r0 = r12 - r0
            com.bytedance.crash.k.b r2 = com.bytedance.crash.C9616k.m19156h()
            long r2 = r2.f26293f
            r10 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x004a
            boolean r0 = com.bytedance.crash.C9616k.m19158j()
            if (r0 == 0) goto L_0x0048
            int r0 = com.bytedance.crash.C9616k.m19159k()
            if (r0 == 0) goto L_0x004a
        L_0x0048:
            r11 = 1
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            boolean r2 = com.bytedance.crash.p555n.C9713t.m19446b(r21)
            if (r2 == 0) goto L_0x005a
            boolean r0 = com.bytedance.crash.p555n.C9713t.m19448c(r21)
            if (r0 == 0) goto L_0x005a
            r16 = 1
            goto L_0x005c
        L_0x005a:
            r16 = 0
        L_0x005c:
            if (r11 == 0) goto L_0x006f
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            goto L_0x0071
        L_0x0061:
            r0 = move-exception
            r5 = r11
            r11 = r12
            r6 = r14
            r2 = 0
            goto L_0x01c0
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            r4 = r9
            r5 = r11
            r11 = r12
            r6 = r14
            goto L_0x019c
        L_0x006f:
            com.bytedance.crash.d r0 = com.bytedance.crash.C9571d.JAVA     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
        L_0x0071:
            java.lang.String r0 = com.bytedance.crash.C9616k.m19148a(r12, r0)     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            r1 = r19
            r3 = r21
            r4 = r0
            r5 = r20
            r6 = r16
            java.io.File r1 = r1.m19104a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            com.bytedance.crash.k.c r2 = com.bytedance.crash.p551k.C9638c.m19220a()     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            r2.mo17482b()     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            com.bytedance.crash.k.b r2 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            com.bytedance.services.slardar.config.IConfigManager r2 = r2.mo17477b()     // Catch:{ Throwable -> 0x0197, all -> 0x0061 }
            if (r2 == 0) goto L_0x00bb
            com.bytedance.crash.k.b r2 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            com.bytedance.services.slardar.config.IConfigManager r2 = r2.mo17477b()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r3 = "exception_modules"
            org.json.JSONObject r2 = r2.getConfigJSON(r3)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            if (r2 == 0) goto L_0x00bb
            com.bytedance.crash.k.b r2 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            com.bytedance.services.slardar.config.IConfigManager r2 = r2.mo17477b()     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r3 = "exception_modules"
            org.json.JSONObject r2 = r2.getConfigJSON(r3)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            java.lang.String r3 = "oom_callback"
            int r2 = r2.optInt(r3, r10)     // Catch:{ Throwable -> 0x0068, all -> 0x0061 }
            if (r2 != r8) goto L_0x00bb
            r2 = 1
            goto L_0x00bc
        L_0x00bb:
            r2 = 0
        L_0x00bc:
            if (r16 == 0) goto L_0x00cd
            if (r2 == 0) goto L_0x00cd
            m19105a(r15, r14, r11, r12)     // Catch:{ Throwable -> 0x00ca, all -> 0x00c4 }
            goto L_0x00cd
        L_0x00c4:
            r0 = move-exception
            r5 = r11
            r11 = r12
            r6 = r14
            goto L_0x01c0
        L_0x00ca:
            r0 = move-exception
            r10 = r2
            goto L_0x0069
        L_0x00cd:
            if (r11 == 0) goto L_0x00d2
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x00ca, all -> 0x00c4 }
            goto L_0x00d4
        L_0x00d2:
            com.bytedance.crash.d r3 = com.bytedance.crash.C9571d.JAVA     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
        L_0x00d4:
            java.lang.String r4 = com.bytedance.crash.C9567c.C9568a.f26094b     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            com.bytedance.crash.g.a r4 = com.bytedance.crash.p547g.C9590b.m19072a(r3, r4, r12, r14)     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            com.bytedance.crash.p547g.C9591c.m19085b(r4)     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            com.bytedance.crash.g.a r4 = r4.clone()     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            java.lang.String r5 = com.bytedance.crash.C9567c.C9568a.f26096d     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            com.bytedance.crash.g.a r4 = r4.eventType(r5)     // Catch:{ Throwable -> 0x0191, all -> 0x00c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            java.lang.String r6 = "[uncaughtException] isLaunchCrash="
            r5.<init>(r6)     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            r5.append(r11)     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            com.bytedance.crash.a.a r5 = com.bytedance.crash.p539a.C9545a.m18940a()     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            r5.mo17348a(r3, r12, r0)     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            boolean r3 = m19107a(r20, r21)     // Catch:{ Throwable -> 0x018b, all -> 0x00c4 }
            if (r3 == 0) goto L_0x0133
            com.bytedance.crash.h.b r5 = r7.f26179a     // Catch:{ Throwable -> 0x012c, all -> 0x0126 }
            if (r5 == 0) goto L_0x0133
            if (r11 == 0) goto L_0x0133
            com.bytedance.crash.p547g.C9591c.m19085b(r4)     // Catch:{ Throwable -> 0x012c, all -> 0x0126 }
            com.bytedance.crash.h.b r8 = r7.f26179a     // Catch:{ Throwable -> 0x012c, all -> 0x0126 }
            r9 = r12
            r5 = r11
            r11 = r20
            r17 = r12
            r12 = r21
            r13 = r0
            r6 = r14
            r14 = r1
            r8.mo17436a(r9, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.String r1 = "[uncaughtException] mLaunchCrashDisposer "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            r0.append(r1)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            goto L_0x0174
        L_0x0126:
            r0 = move-exception
            r5 = r11
            r6 = r14
            r11 = r12
            goto L_0x01c0
        L_0x012c:
            r0 = move-exception
            r5 = r11
            r6 = r14
            r10 = r2
            r11 = r12
            goto L_0x019c
        L_0x0133:
            r5 = r11
            r17 = r12
            r6 = r14
            if (r3 == 0) goto L_0x0166
            com.bytedance.crash.h.b r8 = r7.f26180b     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            if (r8 == 0) goto L_0x0166
            com.bytedance.crash.p547g.C9591c.m19085b(r4)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            com.bytedance.crash.h.b r8 = r7.f26180b     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            r9 = r17
            r11 = r20
            r12 = r21
            r13 = r0
            r14 = r1
            r8.mo17436a(r9, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.String r1 = "[uncaughtException] mLaunchCrashDisposer "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            r0.append(r1)     // Catch:{ Throwable -> 0x0161, all -> 0x015c }
            goto L_0x0174
        L_0x015c:
            r0 = move-exception
            r11 = r17
            goto L_0x01c0
        L_0x0161:
            r0 = move-exception
            r10 = r2
            r11 = r17
            goto L_0x019c
        L_0x0166:
            if (r3 != 0) goto L_0x016b
            r0 = 100
            goto L_0x016d
        L_0x016b:
            r0 = 101(0x65, float:1.42E-43)
        L_0x016d:
            com.bytedance.crash.g.a r0 = r4.state(r0)     // Catch:{ Throwable -> 0x0187, all -> 0x015c }
            com.bytedance.crash.p547g.C9591c.m19085b(r0)     // Catch:{ Throwable -> 0x0187, all -> 0x015c }
        L_0x0174:
            if (r16 == 0) goto L_0x017d
            if (r2 != 0) goto L_0x017d
            r11 = r17
        L_0x017a:
            m19105a(r15, r6, r5, r11)
        L_0x017d:
            m19111d()
            r19.m19110c()
            r19.m19108b(r20, r21)
            return
        L_0x0187:
            r0 = move-exception
            r11 = r17
            goto L_0x018f
        L_0x018b:
            r0 = move-exception
            r5 = r11
            r11 = r12
            r6 = r14
        L_0x018f:
            r10 = r2
            goto L_0x019c
        L_0x0191:
            r0 = move-exception
            r5 = r11
            r11 = r12
            r6 = r14
            r10 = r2
            goto L_0x019b
        L_0x0197:
            r0 = move-exception
            r5 = r11
            r11 = r12
            r6 = r14
        L_0x019b:
            r4 = r9
        L_0x019c:
            boolean r1 = com.bytedance.crash.p555n.C9713t.m19446b(r0)     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x01b9
            if (r4 != 0) goto L_0x01ac
            com.bytedance.crash.d r1 = com.bytedance.crash.C9571d.JAVA     // Catch:{ all -> 0x01be }
            java.lang.String r2 = com.bytedance.crash.C9567c.C9568a.f26094b     // Catch:{ all -> 0x01be }
            com.bytedance.crash.g.a r4 = com.bytedance.crash.p547g.C9590b.m19072a(r1, r2, r11, r6)     // Catch:{ all -> 0x01be }
        L_0x01ac:
            r1 = 103(0x67, float:1.44E-43)
            com.bytedance.crash.g.a r1 = r4.state(r1)     // Catch:{ all -> 0x01be }
            com.bytedance.crash.g.a r0 = r1.errorInfo(r0)     // Catch:{ all -> 0x01be }
            com.bytedance.crash.p547g.C9591c.m19085b(r0)     // Catch:{ all -> 0x01be }
        L_0x01b9:
            if (r16 == 0) goto L_0x017d
            if (r10 != 0) goto L_0x017d
            goto L_0x017a
        L_0x01be:
            r0 = move-exception
            r2 = r10
        L_0x01c0:
            if (r16 == 0) goto L_0x01c7
            if (r2 != 0) goto L_0x01c7
            m19105a(r15, r6, r5, r11)
        L_0x01c7:
            m19111d()
            r19.m19110c()
            r19.m19108b(r20, r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p548h.C9599a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    private static void m19105a(Thread thread, Throwable th, boolean z, long j) {
        Iterator it = C9616k.m19150b().f26030h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public static void m19106a(Thread thread, Throwable th, boolean z, C9584a aVar) {
        List<C9598h> list;
        C9571d dVar;
        if (z) {
            list = C9616k.m19150b().f26026d;
            dVar = C9571d.LAUNCH;
        } else {
            list = C9616k.m19150b().f26027e;
            dVar = C9571d.JAVA;
        }
        for (C9598h hVar : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                hVar.mo17349a(dVar, C9713t.m19435a(th), thread);
                StringBuilder sb = new StringBuilder("callback_cost_");
                sb.append(hVar.getClass().getName());
                aVar.mo17397b(sb.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable unused) {
                StringBuilder sb2 = new StringBuilder("callback_err_");
                sb2.append(hVar.getClass().getName());
                aVar.mo17397b(sb2.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x012e */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[SYNTHETIC, Splitter:B:28:0x00a7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File m19104a(boolean r5, java.lang.Throwable r6, java.lang.String r7, java.lang.Thread r8, boolean r9) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = com.bytedance.crash.C9616k.m19154f()
            java.io.File r1 = com.bytedance.crash.p555n.C9705m.m19393b(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r5 == 0) goto L_0x0014
            java.lang.String r5 = "oom_"
            goto L_0x0016
        L_0x0014:
            java.lang.String r5 = "normal_"
        L_0x0016:
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = r2.toString()
            r0.<init>(r1, r5)
            java.lang.String r5 = r0.getAbsolutePath()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r7 = r4.f26182d
            java.lang.String r1 = r0.getName()
            r7.put(r1, r0)
            r7 = -1
            java.io.File r1 = r0.getParentFile()     // Catch:{ Throwable -> 0x0040 }
            r1.mkdirs()     // Catch:{ Throwable -> 0x0040 }
            r0.createNewFile()     // Catch:{ Throwable -> 0x0040 }
            int r1 = com.bytedance.crash.nativecrash.NativeImpl.m19466a(r5)     // Catch:{ Throwable -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = -1
        L_0x0041:
            if (r9 == 0) goto L_0x00ac
            int r5 = com.bytedance.crash.nativecrash.NativeImpl.m19471b(r5)
            if (r5 <= 0) goto L_0x0149
            android.content.Context r7 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = com.bytedance.crash.p555n.C9685a.m19318c(r7)     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = "\n"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = r6.getMessage()     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = "\n"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.Class r7 = r6.getClass()     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = r7.getName()     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = r6.getMessage()     // Catch:{ Throwable -> 0x0093 }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = ": "
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = r6.getMessage()     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
        L_0x0082:
            java.lang.String r7 = "\n"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = r8.getName()     // Catch:{ Throwable -> 0x0093 }
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r7 = "\n"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x0093 }
        L_0x0093:
            java.lang.String r7 = "stack:"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x009d }
            java.lang.String r7 = "\n"
            com.bytedance.crash.nativecrash.NativeImpl.m19467a(r5, r7)     // Catch:{ Throwable -> 0x009d }
        L_0x009d:
            com.bytedance.crash.p555n.C9713t.m19440a(r6, r5)     // Catch:{ Throwable -> 0x00a3, all -> 0x00a1 }
            goto L_0x00a3
        L_0x00a1:
            r5 = move-exception
            throw r5
        L_0x00a3:
            boolean r6 = com.bytedance.crash.nativecrash.NativeImpl.f26446a
            if (r6 == 0) goto L_0x0149
            com.bytedance.crash.nativecrash.NativeImpl.doCloseFile(r5)     // Catch:{ Throwable -> 0x0149 }
            goto L_0x0149
        L_0x00ac:
            r9 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010e }
            r2.<init>()     // Catch:{ Throwable -> 0x010e }
            android.content.Context r3 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x010e }
            java.lang.String r3 = com.bytedance.crash.p555n.C9685a.m19318c(r3)     // Catch:{ Throwable -> 0x010e }
            r2.append(r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x010e }
            r3 = 0
            com.bytedance.crash.p555n.C9695g.m19352a(r0, r2, r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010e }
            r2.<init>()     // Catch:{ Throwable -> 0x010e }
            java.lang.String r3 = r6.getMessage()     // Catch:{ Throwable -> 0x010e }
            r2.append(r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x010e }
            com.bytedance.crash.p555n.C9695g.m19352a(r0, r2, r9)     // Catch:{ Throwable -> 0x010e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010e }
            r2.<init>()     // Catch:{ Throwable -> 0x010e }
            r2.append(r6)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x010e }
            com.bytedance.crash.p555n.C9695g.m19352a(r0, r2, r9)     // Catch:{ Throwable -> 0x010e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010e }
            r2.<init>()     // Catch:{ Throwable -> 0x010e }
            java.lang.String r8 = r8.getName()     // Catch:{ Throwable -> 0x010e }
            r2.append(r8)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r8 = "\n"
            r2.append(r8)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r8 = r2.toString()     // Catch:{ Throwable -> 0x010e }
            com.bytedance.crash.p555n.C9695g.m19352a(r0, r8, r9)     // Catch:{ Throwable -> 0x010e }
        L_0x010e:
            java.lang.String r8 = "stack:\n"
            com.bytedance.crash.p555n.C9695g.m19352a(r0, r8, r9)     // Catch:{ Throwable -> 0x0113 }
        L_0x0113:
            r8 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0146, all -> 0x0140 }
            r2.<init>(r0, r9)     // Catch:{ Throwable -> 0x0146, all -> 0x0140 }
            if (r1 != r7) goto L_0x0121
            com.bytedance.crash.nativecrash.NativeImpl.m19466a(r5)     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            goto L_0x0121
        L_0x011f:
            r5 = move-exception
            goto L_0x0142
        L_0x0121:
            java.io.PrintStream r5 = new java.io.PrintStream     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            r5.<init>(r2)     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            java.io.PrintWriter r7 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            com.bytedance.crash.p555n.C9713t.m19443a(r6, r7)     // Catch:{ Throwable -> 0x012e, all -> 0x0132 }
        L_0x012e:
            r7.close()     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            goto L_0x0137
        L_0x0132:
            r5 = move-exception
            r7.close()     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            throw r5     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
        L_0x0137:
            com.bytedance.crash.p555n.C9697i.m19370a(r2)     // Catch:{ Throwable -> 0x013e, all -> 0x011f }
            com.bytedance.crash.p555n.C9697i.m19370a(r2)
            goto L_0x0149
        L_0x013e:
            r8 = r2
            goto L_0x0146
        L_0x0140:
            r5 = move-exception
            r2 = r8
        L_0x0142:
            com.bytedance.crash.p555n.C9697i.m19370a(r2)
            throw r5
        L_0x0146:
            com.bytedance.crash.p555n.C9697i.m19370a(r8)
        L_0x0149:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p548h.C9599a.m19104a(boolean, java.lang.Throwable, java.lang.String, java.lang.Thread, boolean):java.io.File");
    }
}
