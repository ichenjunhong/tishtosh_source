package com.bytedance.p702im.core.internal.p710a.p713c;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d.C11300a;
import com.bytedance.p702im.core.internal.p710a.p713c.p714a.C11278a;

/* renamed from: com.bytedance.im.core.internal.a.c.a */
public abstract class C11275a implements C11278a {

    /* renamed from: a */
    protected final Context f30375a;

    /* renamed from: b */
    public final String f30376b;

    /* renamed from: c */
    public final C11300a f30377c;

    /* renamed from: d */
    public C11278a f30378d;

    /* renamed from: e */
    private final int f30379e;

    /* renamed from: f */
    private final DatabaseErrorHandler f30380f;

    /* renamed from: g */
    private final String f30381g;

    /* renamed from: a */
    public abstract C11278a mo20956a();

    /* renamed from: a */
    public final void mo20967a(C11278a aVar) {
    }

    /* renamed from: a */
    public void mo20957a(C11299d dVar) {
    }

    /* renamed from: a */
    public void mo20958a(C11299d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public void mo20959b(C11299d dVar, int i, int i2) {
    }

    /* renamed from: c */
    public final C11299d mo20969c() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.sqlite.SQLiteDatabase$CursorFactory] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.bytedance.im.core.internal.a.c.a$2] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.tencent.wcdb.database.SQLiteDatabase$a] */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.bytedance.im.core.internal.a.c.a$1] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.bytedance.im.core.internal.a.c.a$1, com.bytedance.im.core.internal.a.c.a$2]
      uses: [android.database.sqlite.SQLiteDatabase$CursorFactory, ?[OBJECT, ARRAY]]
      mth insns count: 38
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20968b() {
        /*
            r9 = this;
            com.bytedance.im.core.internal.a.c.a.a r0 = r9.mo20956a()
            com.bytedance.im.core.a.c r1 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            com.bytedance.im.core.a.e r1 = r1.mo20513b()
            boolean r1 = r1.f30142f
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.bytedance.im.core.internal.a.c.d$a r1 = r9.f30377c
            if (r1 == 0) goto L_0x001a
            com.bytedance.im.core.internal.a.c.a$1 r2 = new com.bytedance.im.core.internal.a.c.a$1
            r2.<init>()
        L_0x001a:
            r7 = r2
            java.lang.String r1 = r9.f30381g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0031
            com.bytedance.im.core.internal.a.c.a.f r1 = new com.bytedance.im.core.internal.a.c.a.f
            android.content.Context r2 = r9.f30375a
            java.lang.String r3 = r9.f30376b
            int r4 = r9.f30379e
            r1.<init>(r2, r3, r7, r4)
            r9.f30378d = r1
            goto L_0x005c
        L_0x0031:
            com.bytedance.im.core.internal.a.c.a.f r1 = new com.bytedance.im.core.internal.a.c.a.f
            android.content.Context r4 = r9.f30375a
            java.lang.String r5 = r9.f30376b
            java.lang.String r2 = r9.f30381g
            byte[] r6 = r2.getBytes()
            int r8 = r9.f30379e
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f30378d = r1
            goto L_0x005c
        L_0x0046:
            com.bytedance.im.core.internal.a.c.d$a r1 = r9.f30377c
            if (r1 == 0) goto L_0x004f
            com.bytedance.im.core.internal.a.c.a$2 r2 = new com.bytedance.im.core.internal.a.c.a$2
            r2.<init>()
        L_0x004f:
            com.bytedance.im.core.internal.a.c.a.e r1 = new com.bytedance.im.core.internal.a.c.a.e
            android.content.Context r3 = r9.f30375a
            java.lang.String r4 = r9.f30376b
            int r5 = r9.f30379e
            r1.<init>(r3, r4, r2, r5)
            r9.f30378d = r1
        L_0x005c:
            com.bytedance.im.core.internal.a.c.a.a r1 = r9.f30378d
            r1.mo20967a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.p713c.C11275a.mo20968b():void");
    }

    public C11275a(Context context, String str, C11300a aVar, int i) {
        this(context, str, null, null, 17, null);
    }

    public C11275a(Context context, String str, String str2, C11300a aVar, int i) {
        this(context, str, str2, null, 17, null);
    }

    private C11275a(Context context, String str, String str2, C11300a aVar, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i > 0) {
            this.f30375a = context;
            this.f30376b = str;
            this.f30381g = str2;
            this.f30377c = aVar;
            this.f30379e = i;
            this.f30380f = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Version must be >= 1, was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
