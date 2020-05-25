package com.p683ss.android.p1192ml;

import com.google.gson.C17971f;
import com.google.gson.p1078c.C17958a;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.p1192ml.process.C19507a;
import com.p683ss.android.p1192ml.process.C19520c;
import com.p683ss.android.p1192ml.process.p1194bl.MLConfigModel;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ml.e */
public class C19500e {

    /* renamed from: a */
    public static C19496a f53847a;

    /* renamed from: i */
    private static final ExecutorService f53848i;

    /* renamed from: b */
    public volatile boolean f53849b;

    /* renamed from: c */
    public C19499d f53850c;

    /* renamed from: d */
    protected final C19503f f53851d;

    /* renamed from: e */
    private int f53852e;

    /* renamed from: f */
    private int f53853f;

    /* renamed from: g */
    private MLConfigModel f53854g;

    /* renamed from: h */
    private C19497b f53855h;

    /* renamed from: a */
    public static C19496a m47747a() {
        return f53847a;
    }

    /* renamed from: b */
    public final boolean mo40665b() {
        return this.f53851d.mo40673a();
    }

    /* renamed from: c */
    public final List<? extends C19520c> mo40667c() {
        return this.f53854g.preOPModelList;
    }

    /* renamed from: d */
    public final C19507a mo40668d() {
        return this.f53854g.afOPModel;
    }

    /* renamed from: e */
    public final List<String> mo40669e() {
        return this.f53854g.inputFeatureList;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("ml-evaluator");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        f53848i = threadPoolExecutor;
    }

    /* renamed from: f */
    public final boolean mo40670f() {
        if (this.f53851d.mo40673a() && !this.f53850c.mo40661b() && !this.f53849b && this.f53852e <= 15) {
            this.f53849b = true;
            this.f53852e++;
            f53848i.submit(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:104:0x0224, code lost:
                    r0 = th;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:105:0x0226, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
                    com.p683ss.android.p1192ml.C19506h.m47780a(r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:108:0x022b, code lost:
                    r0 = th;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:109:0x022c, code lost:
                    r2 = false;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Removed duplicated region for block: B:104:0x0224 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
                  PHI: (r2v3 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v6 boolean), (r2v6 boolean), (r2v10 boolean), (r2v10 boolean), (r2v14 boolean), (r2v14 boolean), (r2v15 boolean), (r2v15 boolean), (r2v0 boolean) binds: [B:1:0x0003, B:23:0x00f1, B:24:?, B:26:0x0100, B:100:0x0213, B:101:?, B:92:0x01f7, B:93:?, B:74:0x01bc, B:75:?, B:65:0x019f, B:66:?, B:17:0x00db] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0003] */
                /* JADX WARNING: Removed duplicated region for block: B:105:0x0226 A[ExcHandler: Throwable (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:23:0x00f1] */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x014b A[Catch:{ Throwable -> 0x0209 }] */
                /* JADX WARNING: Removed duplicated region for block: B:63:0x019c A[Catch:{ Throwable -> 0x01d4, Throwable -> 0x0226 }] */
                /* JADX WARNING: Removed duplicated region for block: B:69:0x01b1 A[SYNTHETIC, Splitter:B:69:0x01b1] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r21 = this;
                        r1 = r21
                        r2 = 0
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.f r0 = r0.f53851d     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r0 = r0.mo40674b()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        if (r0 != 0) goto L_0x000f
                        r4 = 0
                        goto L_0x0017
                    L_0x000f:
                        byte[] r4 = r0.getBytes()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r4 = com.p683ss.android.p1192ml.C19506h.m47778a(r4)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                    L_0x0017:
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r5.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r6 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.f r6 = r6.f53851d     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r6 = r6.mo40675c()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r5.append(r6)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r6 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r5.append(r6)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r6 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.f r6 = r6.f53851d     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r6 = r6.mo40676d()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r5.append(r6)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r6.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r6.append(r5)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r7 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r6.append(r7)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r6.append(r4)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r7.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r7.append(r6)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r8 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r7.append(r8)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r7.append(r4)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.append(r5)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r5 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.append(r5)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.append(r4)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.append(r5)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r9 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r8.append(r9)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r9 = "data"
                        r8.append(r9)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r9.<init>()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r9.append(r5)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r10 = java.io.File.separator     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r9.append(r10)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r10 = "config"
                        r9.append(r10)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r10.<init>(r8)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.io.File r11 = new java.io.File     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r11.<init>(r9)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        boolean r12 = r10.exists()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r13 = 2
                        r14 = 1
                        if (r12 == 0) goto L_0x00f1
                        boolean r12 = r11.exists()     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        if (r12 == 0) goto L_0x00f1
                        com.ss.android.ml.e r12 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.f r12 = r12.f53851d     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        boolean r12 = com.p683ss.android.p1192ml.C19500e.m47749a(r12, r10)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        if (r12 == 0) goto L_0x00f1
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        boolean r0 = r0.mo40666b(r11)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        if (r0 != 0) goto L_0x00db
                        java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x00db:
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        boolean r0 = r0.mo40663a(r10)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        if (r0 != 0) goto L_0x00ec
                        java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                    L_0x00ec:
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x00f1:
                        java.lang.String[] r12 = new java.lang.String[r13]     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r12[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r12[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r12)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        java.io.File r12 = new java.io.File     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r12.<init>(r6, r4)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 4
                        java.lang.String r15 = r12.getPath()     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        r17 = 0
                        if (r16 != 0) goto L_0x0148
                        boolean r16 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        if (r16 == 0) goto L_0x0113
                        goto L_0x0148
                    L_0x0113:
                        java.io.File r13 = new java.io.File     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        r13.<init>(r15)     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        boolean r15 = r13.exists()     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        if (r15 == 0) goto L_0x0148
                        long r19 = r13.length()     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        int r15 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
                        if (r15 != 0) goto L_0x0127
                        goto L_0x0148
                    L_0x0127:
                        java.lang.String r15 = "?"
                        int r15 = r0.indexOf(r15)     // Catch:{ Throwable -> 0x0209, all -> 0x0224 }
                        r2 = -1
                        if (r15 != r2) goto L_0x0132
                    L_0x0130:
                        r2 = 1
                        goto L_0x0149
                    L_0x0132:
                        int r15 = r15 + r14
                        java.lang.String r2 = r0.substring(r15)     // Catch:{ Throwable -> 0x0209 }
                        boolean r15 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0209 }
                        if (r15 != 0) goto L_0x0148
                        java.lang.String r13 = com.p683ss.android.p1192ml.C19506h.m47782b(r13)     // Catch:{ Throwable -> 0x0209 }
                        boolean r2 = r2.equalsIgnoreCase(r13)     // Catch:{ Throwable -> 0x0209 }
                        if (r2 == 0) goto L_0x0148
                        goto L_0x0130
                    L_0x0148:
                        r2 = 0
                    L_0x0149:
                        if (r2 != 0) goto L_0x0185
                        java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0209 }
                        r13 = 0
                        r2[r13] = r8     // Catch:{ Throwable -> 0x0209 }
                        r2[r14] = r9     // Catch:{ Throwable -> 0x0209 }
                        r13 = 2
                        r2[r13] = r7     // Catch:{ Throwable -> 0x0209 }
                        r13 = 3
                        r2[r13] = r5     // Catch:{ Throwable -> 0x0209 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r2)     // Catch:{ Throwable -> 0x0209 }
                        com.ss.android.ml.e r2 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0209 }
                        boolean r0 = r2.mo40664a(r0, r6, r4)     // Catch:{ Throwable -> 0x0209 }
                        if (r0 == 0) goto L_0x016a
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0209 }
                        r2 = 0
                        r0.mo40662a(r14, r2)     // Catch:{ Throwable -> 0x0209 }
                        goto L_0x0185
                    L_0x016a:
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0209 }
                        r2 = 2
                        r4 = 0
                        r0.mo40662a(r2, r4)     // Catch:{ Throwable -> 0x0209 }
                        java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0209 }
                        r4 = 0
                        r0[r4] = r8     // Catch:{ Throwable -> 0x0209 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0209 }
                        r0[r2] = r7     // Catch:{ Throwable -> 0x0209 }
                        r2 = 3
                        r0[r2] = r5     // Catch:{ Throwable -> 0x0209 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0209 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r4
                        return
                    L_0x0185:
                        java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0226 }
                        r0.<init>(r6)     // Catch:{ Throwable -> 0x0226 }
                        com.p683ss.android.p1192ml.C19506h.m47777a(r12, r0)     // Catch:{ Throwable -> 0x01d4 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x01d4 }
                        r2 = 3
                        r4 = 0
                        r0.mo40662a(r2, r4)     // Catch:{ Throwable -> 0x01d4 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226 }
                        boolean r0 = r0.mo40666b(r11)     // Catch:{ Throwable -> 0x0226 }
                        if (r0 != 0) goto L_0x01b1
                        java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0226 }
                        r2 = 0
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 2
                        r0[r3] = r7     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 3
                        r0[r3] = r5     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x01b1:
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226 }
                        boolean r0 = r0.mo40663a(r10)     // Catch:{ Throwable -> 0x0226 }
                        if (r0 != 0) goto L_0x01ce
                        java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0226 }
                        r2 = 0
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 2
                        r0[r3] = r7     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 3
                        r0[r3] = r5     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x01ce:
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r2 = 0
                        r0.f53849b = r2
                        return
                    L_0x01d4:
                        r0 = move-exception
                        long r10 = r12.length()     // Catch:{ Throwable -> 0x0226 }
                        int r2 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                        if (r2 != 0) goto L_0x01e0
                        java.lang.String r2 = "file length is 0"
                        goto L_0x01e2
                    L_0x01e0:
                        java.lang.String r2 = ""
                    L_0x01e2:
                        com.ss.android.ml.e r4 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226 }
                        boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x0226 }
                        if (r6 == 0) goto L_0x01eb
                        goto L_0x01f1
                    L_0x01eb:
                        java.lang.Throwable r6 = new java.lang.Throwable     // Catch:{ Throwable -> 0x0226 }
                        r6.<init>(r2, r0)     // Catch:{ Throwable -> 0x0226 }
                        r0 = r6
                    L_0x01f1:
                        r4.mo40662a(r3, r0)     // Catch:{ Throwable -> 0x0226 }
                        java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0226 }
                        r2 = 0
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 2
                        r0[r3] = r7     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 3
                        r0[r3] = r5     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x0209:
                        r0 = move-exception
                        com.ss.android.ml.e r2 = com.p683ss.android.p1192ml.C19500e.this     // Catch:{ Throwable -> 0x0226 }
                        r4 = 2
                        r2.mo40662a(r4, r0)     // Catch:{ Throwable -> 0x0226 }
                        java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0226 }
                        r2 = 0
                        r0[r2] = r8     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r14] = r9     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r0[r4] = r7     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        r3 = 3
                        r0[r3] = r5     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.p683ss.android.p1192ml.C19500e.m47748a(r0)     // Catch:{ Throwable -> 0x0226, all -> 0x0224 }
                        com.ss.android.ml.e r0 = com.p683ss.android.p1192ml.C19500e.this
                        r0.f53849b = r2
                        return
                    L_0x0224:
                        r0 = move-exception
                        goto L_0x022d
                    L_0x0226:
                        r0 = move-exception
                        com.p683ss.android.p1192ml.C19506h.m47780a(r0)     // Catch:{ all -> 0x022b }
                        goto L_0x01ce
                    L_0x022b:
                        r0 = move-exception
                        r2 = 0
                    L_0x022d:
                        com.ss.android.ml.e r3 = com.p683ss.android.p1192ml.C19500e.this
                        r3.f53849b = r2
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1192ml.C19500e.C195022.run():void");
                }
            });
        }
        return this.f53850c.mo40661b();
    }

    /* renamed from: a */
    public static void m47748a(String... strArr) {
        for (String file : strArr) {
            File file2 = new File(file);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    public C19500e(C19503f fVar) {
        C19499d dVar;
        if (fVar != null) {
            this.f53851d = fVar;
            this.f53855h = fVar.mo40679g();
            if (f53847a == null) {
                dVar = new C19505g(fVar.mo40674b());
            } else {
                dVar = new C19498c(new C19505g(fVar.mo40674b()), f53847a);
            }
            this.f53850c = dVar;
            return;
        }
        throw new RuntimeException("MLModelConfig can not be null!");
    }

    /* renamed from: a */
    public final boolean mo40663a(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                this.f53850c.mo40660a(fileInputStream2, this.f53854g);
                mo40662a(7, (Throwable) null);
                C19506h.m47779a((Closeable) fileInputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                C19506h.m47779a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mo40662a(8, th);
            C19506h.m47779a((Closeable) fileInputStream);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo40666b(File file) {
        try {
            this.f53854g = (MLConfigModel) new C17971f().mo34880a(new C17958a(new FileReader(file)), (Type) MLConfigModel.class);
            if (this.f53854g == null) {
                mo40662a(6, (Throwable) null);
            } else {
                mo40662a(5, (Throwable) null);
            }
            return true;
        } catch (Throwable th) {
            mo40662a(6, th);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo40662a(int i, Throwable th) {
        this.f53853f = i;
        m47750b(this.f53853f, th);
    }

    /* renamed from: a */
    public static boolean m47749a(C19503f fVar, File file) {
        boolean a = C19506h.m47781a(file);
        if ((!a || fVar.mo40678f()) && (a || !fVar.mo40678f())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m47750b(int i, Throwable th) {
        String str;
        String str2;
        if (this.f53855h != null) {
            C19497b bVar = this.f53855h;
            String b = this.f53851d.mo40674b();
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                if (th == null) {
                    str2 = "";
                } else {
                    StringWriter stringWriter = new StringWriter();
                    C17840a.m43751a(th, new PrintWriter(stringWriter));
                    str2 = stringWriter.toString();
                }
                sb.append(str2);
                str = sb.toString();
            } else {
                str = "";
            }
            bVar.mo40656a(b, i, str);
        }
    }

    /* renamed from: a */
    public final boolean mo40664a(String str, String str2, String str3) {
        return this.f53851d.mo40677e().mo40680a(str, str2, str3);
    }
}
