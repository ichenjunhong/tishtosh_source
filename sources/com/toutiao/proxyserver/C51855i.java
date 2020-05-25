package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.toutiao.proxyserver.net.C51873c;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2611c.C51814a;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2614f.C51835a;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.File;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.i */
final class C51855i extends C51790a {

    /* renamed from: m */
    final Object f129362m = this;

    /* renamed from: n */
    public Exception f129363n;

    /* renamed from: o */
    private int f129364o;

    /* renamed from: p */
    private final C51859b f129365p;

    /* renamed from: q */
    private final boolean f129366q;

    /* renamed from: r */
    private C51881p f129367r;

    /* renamed from: com.toutiao.proxyserver.i$a */
    static final class C51858a {

        /* renamed from: a */
        String f129376a;

        /* renamed from: b */
        String f129377b;

        /* renamed from: c */
        C51800ab f129378c;

        /* renamed from: d */
        C51881p f129379d;

        /* renamed from: e */
        C51813c f129380e;

        /* renamed from: f */
        C51809c f129381f;

        /* renamed from: g */
        List<C51873c> f129382g;

        /* renamed from: h */
        int f129383h;

        /* renamed from: i */
        C51914w f129384i;

        /* renamed from: j */
        C51859b f129385j;

        /* renamed from: k */
        boolean f129386k;

        C51858a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51855i mo107363a() {
            if (this.f129380e != null && this.f129381f != null && (this.f129379d != null || (!TextUtils.isEmpty(this.f129376a) && !TextUtils.isEmpty(this.f129377b) && this.f129378c != null))) {
                return new C51855i(this);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107354a(int i) {
            this.f129383h = i;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107358a(C51859b bVar) {
            this.f129385j = bVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107355a(C51800ab abVar) {
            if (abVar != null) {
                this.f129378c = abVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107356a(C51809c cVar) {
            if (cVar != null) {
                this.f129381f = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C51858a mo107364b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f129377b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107357a(C51813c cVar) {
            if (cVar != null) {
                this.f129380e = cVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107359a(C51881p pVar) {
            if (pVar != null) {
                this.f129379d = pVar;
                return this;
            }
            throw new IllegalArgumentException("urlsLazyProvider is NULL");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107360a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f129376a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107361a(List<C51873c> list) {
            this.f129382g = list;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C51858a mo107362a(boolean z) {
            this.f129386k = true;
            return this;
        }
    }

    /* renamed from: com.toutiao.proxyserver.i$b */
    public interface C51859b {
        /* renamed from: a */
        void mo107365a(C51855i iVar);

        /* renamed from: b */
        void mo107366b(C51855i iVar);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Throwable, com.toutiao.proxyserver.x] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.toutiao.proxyserver.x] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.toutiao.proxyserver.v$a] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v15, types: [com.toutiao.proxyserver.x] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v16, types: [com.toutiao.proxyserver.v$a] */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r1 = new java.lang.StringBuilder("CancelException: ");
        r1.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_DownloadTask", r1.toString(), r9.f129203g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r3 = new java.lang.StringBuilder("ContentLengthNotMatchException: ");
        r3.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_DownloadTask", r3.toString(), r9.f129203g);
        r9.f129363n = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r7 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        r5 = new java.lang.StringBuilder("IOException: ");
        r5.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r4));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_DownloadTask", r5.toString(), r9.f129203g);
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r3 = move-exception;
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2
      assigns: []
      uses: []
      mth insns count: 130
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
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[ExcHandler: e (r0v2 'e' com.toutiao.proxyserver.e A[CUSTOM_DECLARE]), Splitter:B:10:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[ExcHandler: f (r0v1 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:10:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m111213k() throws com.toutiao.proxyserver.C51821e {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r2 = 0
        L_0x0005:
            com.toutiao.proxyserver.ab r5 = r9.f129206j
            boolean r5 = r5.mo107293a()
            r6 = 1
            if (r5 == 0) goto L_0x0123
            r9.mo107282f()
            if (r2 == 0) goto L_0x0023
            r5 = r0
        L_0x0014:
            com.toutiao.proxyserver.ab r7 = r9.f129206j
            boolean r7 = r7.mo107293a()
            if (r7 == 0) goto L_0x0029
            com.toutiao.proxyserver.ab r5 = r9.f129206j
            com.toutiao.proxyserver.ab$a r5 = r5.mo107294b()
            goto L_0x0014
        L_0x0023:
            com.toutiao.proxyserver.ab r5 = r9.f129206j
            com.toutiao.proxyserver.ab$a r5 = r5.mo107294b()
        L_0x0029:
            java.lang.String r7 = r5.f129263a     // Catch:{ x -> 0x00f0, IOException -> 0x00bf, a -> 0x009e, f -> 0x0081, e -> 0x0066, Exception -> 0x0046 }
            r9.mo107286j()     // Catch:{ x -> 0x0042, IOException -> 0x003f, a -> 0x003c, f -> 0x0081, e -> 0x0066, Exception -> 0x0039 }
            java.lang.String r4 = r5.f129263a     // Catch:{ x -> 0x0042, IOException -> 0x003f, a -> 0x003c, f -> 0x0081, e -> 0x0066, Exception -> 0x0039 }
            r9.m111212b(r4)     // Catch:{ x -> 0x0042, IOException -> 0x003f, a -> 0x003c, f -> 0x0081, e -> 0x0066, Exception -> 0x0039 }
            java.lang.String r4 = r5.f129263a     // Catch:{ x -> 0x0042, IOException -> 0x003f, a -> 0x003c, f -> 0x0081, e -> 0x0066, Exception -> 0x0039 }
            com.toutiao.proxyserver.C51895s.m111277a(r1, r4)     // Catch:{ x -> 0x0042, IOException -> 0x003f, a -> 0x003c, f -> 0x0081, e -> 0x0066, Exception -> 0x0039 }
            return r6
        L_0x0039:
            r3 = move-exception
            r4 = r7
            goto L_0x0047
        L_0x003c:
            r3 = move-exception
            r4 = r7
            goto L_0x009f
        L_0x003f:
            r4 = move-exception
            goto L_0x00c2
        L_0x0042:
            r3 = move-exception
            r4 = r7
            goto L_0x00f1
        L_0x0046:
            r3 = move-exception
        L_0x0047:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "OtherException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r5, r7, r8)
            int r5 = r9.f129207k
            int r5 = r5 + r6
            r9.f129207k = r5
            goto L_0x0005
        L_0x0066:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CancelException: "
            r1.<init>(r2)
            java.lang.String r2 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r9.f129203g
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r1, r2)
            throw r0
        L_0x0081:
            r0 = move-exception
            java.lang.String r2 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r2, r3, r4)
            r9.f129363n = r0
            return r1
        L_0x009e:
            r3 = move-exception
        L_0x009f:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RandomAccessFileWrapper"
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r5, r7, r8)
            int r5 = r9.f129207k
            int r5 = r5 + r6
            r9.f129207k = r5
            goto L_0x0005
        L_0x00bf:
            r5 = move-exception
            r7 = r4
            r4 = r5
        L_0x00c2:
            java.lang.String r5 = "Canceled"
            java.lang.String r8 = r4.getMessage()
            boolean r5 = r5.equalsIgnoreCase(r8)
            if (r5 != 0) goto L_0x00e8
            java.lang.String r3 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "IOException: "
            r5.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r4)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r5, r8)
            r3 = r4
        L_0x00e8:
            int r4 = r9.f129207k
            int r4 = r4 + r6
            r9.f129207k = r4
            r4 = r7
            goto L_0x0005
        L_0x00f0:
            r3 = move-exception
        L_0x00f1:
            boolean r7 = com.toutiao.proxyserver.C51895s.f129481p
            if (r7 != 0) goto L_0x00f8
            r5.mo107295a()
        L_0x00f8:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "RequestException: "
            r7.<init>(r8)
            java.lang.String r8 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r5, r7, r8)
            int r5 = r3.errorCode
            r7 = 403(0x193, float:5.65E-43)
            if (r5 != r7) goto L_0x011c
            boolean r5 = com.toutiao.proxyserver.C51895s.f129481p
            if (r5 == 0) goto L_0x011c
            r2 = 1
        L_0x011c:
            int r5 = r9.f129207k
            int r5 = r5 + r6
            r9.f129207k = r5
            goto L_0x0005
        L_0x0123:
            r9.f129363n = r3
            com.toutiao.proxyserver.C51895s.m111277a(r6, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51855i.m111213k():boolean");
    }

    public final void run() {
        try {
            if (this.f129206j == null && this.f129367r != null) {
                String[] a = this.f129367r.mo95402a();
                if (a == null || a.length <= 0) {
                    C51895s.m111277a(1, "lazy provide lazy url fail, provide empty urls.");
                    return;
                }
                this.f129206j = new C51800ab(C51838d.m111172a(a));
                this.f129203g = this.f129367r.mo95404c();
                this.f129204h = C51835a.m111161a(this.f129203g);
                StringBuilder sb = new StringBuilder("lazy preload rawKey:");
                sb.append(this.f129203g);
                sb.append(", key:");
                sb.append(this.f129204h);
                C51820c.m111141b("TAG_PROXY_DownloadTask", sb.toString());
                if (!TextUtils.isEmpty(this.f129204h)) {
                    String a2 = C51835a.m111161a(this.f129204h);
                    File e = this.f129197a.mo107310e(a2);
                    int b = this.f129367r.mo95403b();
                    if (b > 0) {
                        this.f129364o = b;
                    }
                    if (e != null && e.length() >= ((long) this.f129364o)) {
                        StringBuilder sb2 = new StringBuilder("lazy no need preload, file size: ");
                        sb2.append(e.length());
                        sb2.append(", need preload size: ");
                        sb2.append(this.f129364o);
                        C51820c.m111141b("TAG_PROXY_DownloadTask", sb2.toString());
                        return;
                    } else if (C51897t.m111286a().mo107408a(mo107283g(), a2)) {
                        StringBuilder sb3 = new StringBuilder("lazy has pending proxy task, skip preload for key: ");
                        sb3.append(this.f129204h);
                        C51820c.m111143c("TAG_PROXY_DownloadTask", sb3.toString());
                        return;
                    } else if (this.f129365p != null) {
                        this.f129365p.mo107365a(this);
                    }
                } else {
                    return;
                }
            }
            try {
                this.f129197a.mo107306a(this.f129204h);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    m111213k();
                } catch (C51821e e2) {
                    C51820c.m111144c("TAG_PROXY_DownloadTask", C51820c.m111138a(e2), this.f129203g);
                }
                this.f129200d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f129197a.mo107307b(this.f129204h);
                if (this.f129365p != null) {
                    this.f129365p.mo107366b(this);
                }
            } catch (C51814a unused) {
                if (this.f129365p != null) {
                    this.f129365p.mo107366b(this);
                }
            }
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder("lazy provide lazy url fail:");
            sb4.append(e3.toString());
            C51895s.m111277a(1, sb4.toString());
        }
    }

    C51855i(C51858a aVar) {
        super(aVar.f129380e, aVar.f129381f);
        this.f129364o = aVar.f129383h;
        this.f129365p = aVar.f129385j;
        this.f129203g = aVar.f129376a;
        this.f129204h = aVar.f129377b;
        this.f129201e = aVar.f129382g;
        this.f129206j = aVar.f129378c;
        this.f129205i = aVar.f129384i;
        this.f129366q = aVar.f129386k;
        this.f129367r = aVar.f129379d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x040f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0410, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03ea A[SYNTHETIC, Splitter:B:124:0x03ea] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x040f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0428 A[Catch:{ all -> 0x0430 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04a8 A[SYNTHETIC, Splitter:B:177:0x04a8] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x035d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0148 A[SYNTHETIC, Splitter:B:35:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01e6 A[SYNTHETIC, Splitter:B:47:0x01e6] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x022f A[Catch:{ IOException -> 0x03fb, all -> 0x03f8 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111212b(java.lang.String r23) throws java.io.IOException, com.toutiao.proxyserver.C51912v.C51913a, com.toutiao.proxyserver.C51821e, com.toutiao.proxyserver.C51834f {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "process() called with: url = ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "]， rawKey："
            r2.append(r3)
            java.lang.String r3 = r8.f129203g
            r2.append(r3)
            java.lang.String r3 = "， key："
            r2.append(r3)
            java.lang.String r3 = r8.f129204h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111140a(r1, r2, r3)
            com.toutiao.proxyserver.c r1 = r8.f129197a
            java.lang.String r2 = r8.f129204h
            java.io.File r1 = r1.mo107309d(r2)
            long r2 = r1.length()
            int r4 = r8.f129364o
            if (r4 <= 0) goto L_0x0078
            int r4 = r8.f129364o
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0078
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "no necessary to download for "
            r1.<init>(r4)
            java.lang.String r4 = r8.f129204h
            r1.append(r4)
            java.lang.String r4 = ", rawKey: "
            r1.append(r4)
            java.lang.String r4 = r8.f129203g
            r1.append(r4)
            java.lang.String r4 = ", cache file size: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", max: "
            r1.append(r2)
            int r2 = r8.f129364o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r0, r1, r2)
            return
        L_0x0078:
            int r4 = r22.mo107283g()
            com.toutiao.proxyserver.b.c r5 = r8.f129198b
            java.lang.String r6 = r8.f129204h
            com.toutiao.proxyserver.b.a r9 = r5.mo107300a(r6, r4)
            if (r9 == 0) goto L_0x00af
            int r5 = r9.f129274c
            long r5 = (long) r5
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00af
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file download complete, key: "
            r1.<init>(r2)
            java.lang.String r2 = r8.f129204h
            r1.append(r2)
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)
            java.lang.String r2 = r8.f129203g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r0, r1, r2)
            return
        L_0x00af:
            boolean r5 = com.toutiao.proxyserver.C51895s.f129483r
            if (r5 == 0) goto L_0x00bf
            if (r9 == 0) goto L_0x00bf
            int r5 = r8.f129364o
            int r6 = r9.f129274c
            if (r5 <= r6) goto L_0x00bf
            int r5 = r9.f129274c
            r8.f129364o = r5
        L_0x00bf:
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() before request, max:"
            r6.<init>(r7)
            int r7 = r8.f129364o
            r6.append(r7)
            java.lang.String r7 = ", contentLength:"
            r6.append(r7)
            if (r9 == 0) goto L_0x00db
            int r7 = r9.f129274c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00dd
        L_0x00db:
            java.lang.String r7 = "null"
        L_0x00dd:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.p2612d.C51820c.m111139a(r5, r6)
            r22.mo107282f()
            r22.mo107285i()
            int r5 = (int) r2
            int r6 = r8.f129364o
            java.lang.String r7 = "GET"
            com.toutiao.proxyserver.net.e r10 = r8.mo107270a(r0, r5, r6, r7)
            java.lang.String r5 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "process() after request statuscode:"
            r6.<init>(r7)
            int r7 = r10.f129420b
            r6.append(r7)
            java.lang.String r7 = ", contentlength:"
            r6.append(r7)
            int r7 = com.toutiao.proxyserver.p2614f.C51838d.m111166a(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.toutiao.proxyserver.p2612d.C51820c.m111139a(r5, r6)
            r22.mo107284h()
            com.toutiao.proxyserver.e.d r11 = new com.toutiao.proxyserver.e.d
            r11.<init>(r2)
            com.toutiao.proxyserver.e.c r5 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r5.f129312a = r11
            r12 = 1
            r14 = 0
            com.toutiao.proxyserver.e.c r5 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            r5.mo107321b()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            r22.mo107282f()     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.w r5 = r8.f129205i     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r5 != 0) goto L_0x013e
            boolean r5 = com.toutiao.proxyserver.C51895s.f129476k     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r5 == 0) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013b:
            r0 = move-exception
            goto L_0x0419
        L_0x013e:
            r5 = 0
        L_0x013f:
            com.toutiao.proxyserver.p2614f.C51838d.m111174a(r10, r5, r12)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            int r15 = com.toutiao.proxyserver.p2614f.C51838d.m111166a(r10)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r9 == 0) goto L_0x01d3
            int r5 = r9.f129274c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r5 == r15) goto L_0x01d3
            com.toutiao.proxyserver.o r1 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            if (r1 == 0) goto L_0x0166
            int r1 = r22.mo107283g()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            boolean r2 = com.toutiao.proxyserver.p2610b.C51808b.m111117a(r1)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r4 = r9.f129274c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r7 = r9.f129276e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r1 = r22
            r5 = r15
            r6 = r23
            r1.mo107276a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
        L_0x0166:
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = "Content-Length not match, old: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r3 = r9.f129274c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r15)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", key: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f129204h     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r1, r2, r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            com.toutiao.proxyserver.f r1 = new com.toutiao.proxyserver.f     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = "Content-Length not match, old length: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            int r3 = r9.f129274c     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", new length: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r15)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", rawKey: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r3 = ", currentUrl: "
            r2.append(r3)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = ", previousInfo: "
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = r9.f129276e     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r2.append(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x013b, all -> 0x040f }
            throw r1     // Catch:{ IOException -> 0x013b, all -> 0x040f }
        L_0x01d3:
            com.toutiao.proxyserver.b.c r5 = r8.f129198b     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            java.lang.String r6 = r8.f129204h     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.p2614f.C51838d.m111168a(r10, r5, r6, r4)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.b.c r5 = r8.f129198b     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            java.lang.String r6 = r8.f129204h     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            com.toutiao.proxyserver.b.a r7 = r5.mo107300a(r6, r4)     // Catch:{ IOException -> 0x0417, all -> 0x040f }
            if (r7 != 0) goto L_0x01e6
            r9 = 0
            goto L_0x01e9
        L_0x01e6:
            int r4 = r7.f129274c     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r9 = r4
        L_0x01e9:
            java.io.InputStream r15 = r10.mo107386d()     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            com.toutiao.proxyserver.v r4 = new com.toutiao.proxyserver.v     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            java.lang.String r5 = "rwd"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r4.mo107426a(r2)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            com.toutiao.proxyserver.d r5 = new com.toutiao.proxyserver.d     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            r5.<init>(r4)     // Catch:{ IOException -> 0x040c, all -> 0x040a }
            java.util.concurrent.Future r16 = r5.mo107313b()     // Catch:{ IOException -> 0x0404, all -> 0x0401 }
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r6 = "preload start from: "
            r4.<init>(r6)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = ", rawKey: "
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = ", key: "
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r4.append(r2)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r1, r2, r3)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            int r1 = com.toutiao.proxyserver.C51895s.f129477l     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
        L_0x022d:
            if (r15 == 0) goto L_0x035d
            r22.mo107282f()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r22.mo107285i()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            int r4 = r15.read(r6)     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            com.toutiao.proxyserver.o r3 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            if (r3 == 0) goto L_0x025a
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03fb, all -> 0x03f8 }
            r19 = 0
            long r17 = r17 - r1
            r1 = r22
            r2 = r3
            r3 = r23
            r20 = r4
            r12 = r5
            r13 = r6
            r5 = r17
            r1.mo107274a(r2, r3, r4, r5)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            goto L_0x025e
        L_0x025a:
            r20 = r4
            r12 = r5
            r13 = r6
        L_0x025e:
            r22.mo107284h()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1 = r20
            if (r1 < 0) goto L_0x035e
            if (r1 <= 0) goto L_0x0299
            r12.mo107312a(r13, r14, r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r2 = (long) r1     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r11.mo107328a(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.ac r2 = com.toutiao.proxyserver.C51802ac.m111110a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r4 = r11.mo107327a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r2.mo107297a(r3, r4)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.w r2 = r8.f129205i     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            if (r2 == 0) goto L_0x028c
            java.lang.Object r2 = r8.f129362m     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.Object r3 = r8.f129362m     // Catch:{ all -> 0x0289 }
            r3.notifyAll()     // Catch:{ all -> 0x0289 }
            monitor-exit(r2)     // Catch:{ all -> 0x0289 }
            goto L_0x028c
        L_0x0289:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0289 }
            throw r0     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
        L_0x028c:
            java.util.concurrent.atomic.AtomicInteger r2 = r8.f129199c     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r2.addAndGet(r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r1 = r11.mo107327a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r1 = (int) r1     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r8.mo107272a(r9, r1)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
        L_0x0299:
            int r1 = r8.f129364o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            if (r1 <= 0) goto L_0x034f
            long r1 = r11.mo107327a()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r3 = r8.f129364o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            long r3 = (long) r3     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x034f
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = "download, more data received, currentCacheFileSize: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r11)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", max: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            int r2 = r8.f129364o     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r1.append(r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.p2612d.C51820c.m111144c(r0, r1, r2)     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107322c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107324e()
            com.toutiao.proxyserver.p2614f.C51838d.m111175a(r10)
            r12.mo107311a()
            r22.mo107271a()
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cancel call, rawKey: "
            r1.<init>(r2)
            java.lang.String r2 = r8.f129203g
            r1.append(r2)
            java.lang.String r2 = ", key: "
            r1.append(r2)
            java.lang.String r2 = r8.f129204h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111144c(r0, r1, r2)
            boolean r0 = r8.f129366q
            if (r0 == 0) goto L_0x031a
            java.lang.String r0 = "preloader"
            goto L_0x031c
        L_0x031a:
            java.lang.String r0 = "proxy"
        L_0x031c:
            r8.mo107273a(r0)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x0325
            r4 = 0
            goto L_0x0328
        L_0x0325:
            int r0 = r7.f129274c
            r4 = r0
        L_0x0328:
            long r0 = r11.mo107327a()
            int r5 = (int) r0
            r6 = 0
            r1 = r22
            r1.m111211a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.ac r0 = com.toutiao.proxyserver.C51802ac.m111110a()
            java.lang.String r1 = r8.f129203g
            long r2 = r11.mo107327a()
            r0.mo107297a(r1, r2)
            java.lang.String r0 = "finally"
            int r1 = r8.f129207k
            r2 = 0
            r8.mo107275a(r2, r0, r1)
            if (r16 == 0) goto L_0x034e
            r16.get()     // Catch:{ InterruptedException -> 0x034d, ExecutionException -> 0x034e }
        L_0x034d:
            return
        L_0x034e:
            return
        L_0x034f:
            r22.mo107282f()     // Catch:{ IOException -> 0x035a, all -> 0x0357 }
            r5 = r12
            r6 = r13
            r12 = 1
            goto L_0x022d
        L_0x0357:
            r0 = move-exception
            goto L_0x0414
        L_0x035a:
            r0 = move-exception
            goto L_0x03fd
        L_0x035d:
            r12 = r5
        L_0x035e:
            java.lang.String r0 = "complete"
            int r1 = r8.f129207k     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r2 = 0
            r8.mo107275a(r2, r0, r1)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r22.mo107280d()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.o r0 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            if (r0 == 0) goto L_0x037e
            long r0 = r11.mo107327a()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            long r2 = (long) r9     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x037e
            com.toutiao.proxyserver.i$1 r0 = new com.toutiao.proxyserver.i$1     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r0.<init>()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.p2614f.C51838d.m111186b(r0)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
        L_0x037e:
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = "download succeed, no need to cancel call, rawKey: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            r1.append(r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r0, r1, r2)     // Catch:{ IOException -> 0x03f3, all -> 0x03ef }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107322c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107324e()
            com.toutiao.proxyserver.p2614f.C51838d.m111175a(r10)
            r12.mo107311a()
            boolean r0 = r8.f129366q
            if (r0 == 0) goto L_0x03ba
            java.lang.String r0 = "preloader"
            goto L_0x03bc
        L_0x03ba:
            java.lang.String r0 = "proxy"
        L_0x03bc:
            r8.mo107273a(r0)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x03c5
            r4 = 0
            goto L_0x03c8
        L_0x03c5:
            int r0 = r7.f129274c
            r4 = r0
        L_0x03c8:
            long r0 = r11.mo107327a()
            int r5 = (int) r0
            r6 = 0
            r1 = r22
            r1.m111211a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.ac r0 = com.toutiao.proxyserver.C51802ac.m111110a()
            java.lang.String r1 = r8.f129203g
            long r2 = r11.mo107327a()
            r0.mo107297a(r1, r2)
            java.lang.String r0 = "finally"
            int r1 = r8.f129207k
            r2 = 0
            r8.mo107275a(r2, r0, r1)
            if (r16 == 0) goto L_0x03ee
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03ed }
        L_0x03ed:
            return
        L_0x03ee:
            return
        L_0x03ef:
            r0 = move-exception
            r21 = 0
            goto L_0x0435
        L_0x03f3:
            r0 = move-exception
            r9 = r7
            r13 = r12
            r12 = 0
            goto L_0x041c
        L_0x03f8:
            r0 = move-exception
            r12 = r5
            goto L_0x0414
        L_0x03fb:
            r0 = move-exception
            r12 = r5
        L_0x03fd:
            r9 = r7
            r13 = r12
            r12 = 1
            goto L_0x041c
        L_0x0401:
            r0 = move-exception
            r12 = r5
            goto L_0x0412
        L_0x0404:
            r0 = move-exception
            r12 = r5
            r9 = r7
            r13 = r12
            r12 = 1
            goto L_0x041a
        L_0x040a:
            r0 = move-exception
            goto L_0x0411
        L_0x040c:
            r0 = move-exception
            r9 = r7
            goto L_0x0418
        L_0x040f:
            r0 = move-exception
            r7 = r9
        L_0x0411:
            r12 = 0
        L_0x0412:
            r16 = 0
        L_0x0414:
            r21 = 1
            goto L_0x0435
        L_0x0417:
            r0 = move-exception
        L_0x0418:
            r12 = 1
        L_0x0419:
            r13 = 0
        L_0x041a:
            r16 = 0
        L_0x041c:
            java.lang.String r1 = "Canceled"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0430 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0430 }
            if (r1 != 0) goto L_0x042f
            java.lang.String r1 = "exception"
            int r2 = r8.f129207k     // Catch:{ all -> 0x0430 }
            r8.mo107275a(r0, r1, r2)     // Catch:{ all -> 0x0430 }
        L_0x042f:
            throw r0     // Catch:{ all -> 0x0430 }
        L_0x0430:
            r0 = move-exception
            r7 = r9
            r21 = r12
            r12 = r13
        L_0x0435:
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r1.mo107322c()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r1.mo107324e()
            com.toutiao.proxyserver.p2614f.C51838d.m111175a(r10)
            if (r12 == 0) goto L_0x044b
            r12.mo107311a()
        L_0x044b:
            if (r21 == 0) goto L_0x0471
            r22.mo107271a()
            java.lang.String r1 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cancel call, rawKey: "
            r2.<init>(r3)
            java.lang.String r3 = r8.f129203g
            r2.append(r3)
            java.lang.String r3 = ", key: "
            r2.append(r3)
            java.lang.String r3 = r8.f129204h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111144c(r1, r2, r3)
        L_0x0471:
            boolean r1 = r8.f129366q
            if (r1 == 0) goto L_0x0478
            java.lang.String r1 = "preloader"
            goto L_0x047a
        L_0x0478:
            java.lang.String r1 = "proxy"
        L_0x047a:
            r8.mo107273a(r1)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L_0x0483
            r4 = 0
            goto L_0x0486
        L_0x0483:
            int r1 = r7.f129274c
            r4 = r1
        L_0x0486:
            long r5 = r11.mo107327a()
            int r5 = (int) r5
            r6 = 0
            r1 = r22
            r1.m111211a(r2, r3, r4, r5, r6)
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()
            java.lang.String r2 = r8.f129203g
            long r3 = r11.mo107327a()
            r1.mo107297a(r2, r3)
            java.lang.String r1 = "finally"
            int r2 = r8.f129207k
            r3 = 0
            r8.mo107275a(r3, r1, r2)
            if (r16 == 0) goto L_0x04ab
            r16.get()     // Catch:{ InterruptedException | ExecutionException -> 0x04ab }
        L_0x04ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51855i.m111212b(java.lang.String):void");
    }

    /* renamed from: a */
    private void m111211a(boolean z, int i, int i2, int i3, int i4) {
        final C51880o oVar = C51895s.f129471f;
        if (oVar != null) {
            final int i5 = i2;
            final int i6 = i3;
            C518572 r0 = new Runnable(false, 0, 0) {

                /* renamed from: c */
                final /* synthetic */ int f129371c;

                public final void run() {
                    String str = C51855i.this.f129203g;
                }

                {
                    this.f129371c = r4;
                }
            };
            C51838d.m111186b((Runnable) r0);
        }
    }
}
