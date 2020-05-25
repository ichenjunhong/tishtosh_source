package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.p021a.C0328d.C0332c;
import android.support.constraint.p020a.p021a.C0333e.C0335a;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.f */
public final class C0336f extends C0347o {

    /* renamed from: a */
    public boolean f1016a;

    /* renamed from: aA */
    public boolean f1017aA = false;

    /* renamed from: aB */
    public boolean f1018aB = false;

    /* renamed from: aC */
    int f1019aC = 0;

    /* renamed from: aE */
    private C0345n f1020aE;

    /* renamed from: ar */
    int f1021ar;

    /* renamed from: as */
    int f1022as;

    /* renamed from: at */
    int f1023at;

    /* renamed from: au */
    int f1024au;

    /* renamed from: av */
    int f1025av = 0;

    /* renamed from: aw */
    int f1026aw = 0;

    /* renamed from: ax */
    C0327c[] f1027ax = new C0327c[4];

    /* renamed from: ay */
    C0327c[] f1028ay = new C0327c[4];

    /* renamed from: az */
    public int f1029az = 3;

    /* renamed from: b */
    public C0351e f1030b = new C0351e();

    /* renamed from: f */
    public final void mo726f() {
        this.f1030b.mo796b();
        this.f1021ar = 0;
        this.f1023at = 0;
        this.f1022as = 0;
        this.f1024au = 0;
        super.mo726f();
    }

    /* renamed from: y */
    public final void mo749y() {
        C0342k kVar = mo711a(C0332c.LEFT).f932a;
        C0342k kVar2 = mo711a(C0332c.TOP).f932a;
        kVar.mo756a((C0342k) null, 0.0f);
        kVar2.mo756a((C0342k) null, 0.0f);
    }

    /* renamed from: z */
    public final void mo750z() {
        int size = this.f1069aD.size();
        mo702b();
        for (int i = 0; i < size; i++) {
            ((C0333e) this.f1069aD.get(i)).mo702b();
        }
    }

    /* JADX WARNING: type inference failed for: r12v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v12, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 389
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
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f9  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo748x() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f958L
            int r3 = r1.f959M
            int r0 = r21.mo730j()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo731k()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f1017aA = r4
            r1.f1018aB = r4
            android.support.constraint.a.a.e r0 = r1.f953G
            if (r0 == 0) goto L_0x009b
            android.support.constraint.a.a.n r0 = r1.f1020aE
            if (r0 != 0) goto L_0x002a
            android.support.constraint.a.a.n r0 = new android.support.constraint.a.a.n
            r0.<init>(r1)
            r1.f1020aE = r0
        L_0x002a:
            android.support.constraint.a.a.n r0 = r1.f1020aE
            int r7 = r1.f958L
            r0.f1059a = r7
            int r7 = r1.f959M
            r0.f1060b = r7
            int r7 = r21.mo730j()
            r0.f1061c = r7
            int r7 = r21.mo731k()
            r0.f1062d = r7
            java.util.ArrayList<android.support.constraint.a.a.n$a> r7 = r0.f1063e
            int r7 = r7.size()
            r8 = 0
        L_0x0047:
            if (r8 >= r7) goto L_0x0088
            java.util.ArrayList<android.support.constraint.a.a.n$a> r9 = r0.f1063e
            java.lang.Object r9 = r9.get(r8)
            android.support.constraint.a.a.n$a r9 = (android.support.constraint.p020a.p021a.C0345n.C0346a) r9
            android.support.constraint.a.a.d r10 = r9.f1064a
            android.support.constraint.a.a.d$c r10 = r10.f934c
            android.support.constraint.a.a.d r10 = r1.mo711a(r10)
            r9.f1064a = r10
            android.support.constraint.a.a.d r10 = r9.f1064a
            if (r10 == 0) goto L_0x007a
            android.support.constraint.a.a.d r10 = r9.f1064a
            android.support.constraint.a.a.d r10 = r10.f935d
            r9.f1065b = r10
            android.support.constraint.a.a.d r10 = r9.f1064a
            int r10 = r10.mo705a()
            r9.f1066c = r10
            android.support.constraint.a.a.d r10 = r9.f1064a
            android.support.constraint.a.a.d$b r10 = r10.f938g
            r9.f1067d = r10
            android.support.constraint.a.a.d r10 = r9.f1064a
            int r10 = r10.f940i
            r9.f1068e = r10
            goto L_0x0085
        L_0x007a:
            r10 = 0
            r9.f1065b = r10
            r9.f1066c = r4
            android.support.constraint.a.a.d$b r10 = android.support.constraint.p020a.p021a.C0328d.C0331b.STRONG
            r9.f1067d = r10
            r9.f1068e = r4
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x0047
        L_0x0088:
            int r0 = r1.f1021ar
            r1.f958L = r0
            int r0 = r1.f1022as
            r1.f959M = r0
            r21.mo742u()
            android.support.constraint.a.e r0 = r1.f1030b
            android.support.constraint.a.c r0 = r0.f1086g
            r1.mo715a(r0)
            goto L_0x009f
        L_0x009b:
            r1.f958L = r4
            r1.f959M = r4
        L_0x009f:
            int r0 = r1.f1029az
            r7 = 8
            r8 = 1
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r1.mo747f(r7)
            if (r0 != 0) goto L_0x00af
            r21.mo750z()
        L_0x00af:
            boolean r0 = r1.mo747f(r7)
            if (r0 != 0) goto L_0x00ba
            int r0 = r1.f1029az
            r1.mo699a(r0)
        L_0x00ba:
            r21.mo749y()
            android.support.constraint.a.e r0 = r1.f1030b
            r0.f1083d = r8
            goto L_0x00c6
        L_0x00c2:
            android.support.constraint.a.e r0 = r1.f1030b
            r0.f1083d = r4
        L_0x00c6:
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            r9 = r0[r8]
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            r10 = r0[r4]
            r1.f1025av = r4
            r1.f1026aw = r4
            java.util.ArrayList r0 = r1.f1069aD
            int r11 = r0.size()
            r0 = 0
        L_0x00d9:
            if (r0 >= r11) goto L_0x00ef
            java.util.ArrayList r12 = r1.f1069aD
            java.lang.Object r12 = r12.get(r0)
            android.support.constraint.a.a.e r12 = (android.support.constraint.p020a.p021a.C0333e) r12
            boolean r13 = r12 instanceof android.support.constraint.p020a.p021a.C0347o
            if (r13 == 0) goto L_0x00ec
            android.support.constraint.a.a.o r12 = (android.support.constraint.p020a.p021a.C0347o) r12
            r12.mo748x()
        L_0x00ec:
            int r0 = r0 + 1
            goto L_0x00d9
        L_0x00ef:
            r0 = 0
            r12 = 1
            r13 = 0
        L_0x00f2:
            if (r12 == 0) goto L_0x033e
            int r14 = r0 + 1
            android.support.constraint.a.e r0 = r1.f1030b     // Catch:{ Exception -> 0x01ea }
            r0.mo796b()     // Catch:{ Exception -> 0x01ea }
            android.support.constraint.a.e r0 = r1.f1030b     // Catch:{ Exception -> 0x01ea }
            r1.mo719b(r0)     // Catch:{ Exception -> 0x01ea }
            r0 = 0
        L_0x0101:
            if (r0 >= r11) goto L_0x0119
            java.util.ArrayList r15 = r1.f1069aD     // Catch:{ Exception -> 0x0115 }
            java.lang.Object r15 = r15.get(r0)     // Catch:{ Exception -> 0x0115 }
            android.support.constraint.a.a.e r15 = (android.support.constraint.p020a.p021a.C0333e) r15     // Catch:{ Exception -> 0x0115 }
            android.support.constraint.a.e r7 = r1.f1030b     // Catch:{ Exception -> 0x0115 }
            r15.mo719b(r7)     // Catch:{ Exception -> 0x0115 }
            int r0 = r0 + 1
            r7 = 8
            goto L_0x0101
        L_0x0115:
            r0 = move-exception
            r8 = r12
            goto L_0x01ef
        L_0x0119:
            android.support.constraint.a.e r0 = r1.f1030b     // Catch:{ Exception -> 0x01ea }
            r1.mo700a(r0)     // Catch:{ Exception -> 0x01ea }
            java.util.ArrayList r7 = r1.f1069aD     // Catch:{ Exception -> 0x01ea }
            int r7 = r7.size()     // Catch:{ Exception -> 0x01ea }
            r15 = 0
        L_0x0125:
            if (r15 >= r7) goto L_0x017a
            java.util.ArrayList r8 = r1.f1069aD     // Catch:{ Exception -> 0x01ea }
            java.lang.Object r8 = r8.get(r15)     // Catch:{ Exception -> 0x01ea }
            android.support.constraint.a.a.e r8 = (android.support.constraint.p020a.p021a.C0333e) r8     // Catch:{ Exception -> 0x01ea }
            boolean r4 = r8 instanceof android.support.constraint.p020a.p021a.C0336f     // Catch:{ Exception -> 0x01ea }
            if (r4 == 0) goto L_0x0167
            android.support.constraint.a.a.e$a[] r4 = r8.f952F     // Catch:{ Exception -> 0x01ea }
            r18 = 0
            r4 = r4[r18]     // Catch:{ Exception -> 0x01ea }
            r19 = r7
            android.support.constraint.a.a.e$a[] r7 = r8.f952F     // Catch:{ Exception -> 0x01ea }
            r17 = 1
            r7 = r7[r17]     // Catch:{ Exception -> 0x01ea }
            r20 = r12
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT     // Catch:{ Exception -> 0x01e8 }
            if (r4 != r12) goto L_0x014c
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED     // Catch:{ Exception -> 0x01e8 }
            r8.mo714a(r12)     // Catch:{ Exception -> 0x01e8 }
        L_0x014c:
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT     // Catch:{ Exception -> 0x01e8 }
            if (r7 != r12) goto L_0x0155
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED     // Catch:{ Exception -> 0x01e8 }
            r8.mo718b(r12)     // Catch:{ Exception -> 0x01e8 }
        L_0x0155:
            r8.mo700a(r0)     // Catch:{ Exception -> 0x01e8 }
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT     // Catch:{ Exception -> 0x01e8 }
            if (r4 != r12) goto L_0x015f
            r8.mo714a(r4)     // Catch:{ Exception -> 0x01e8 }
        L_0x015f:
            android.support.constraint.a.a.e$a r4 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT     // Catch:{ Exception -> 0x01e8 }
            if (r7 != r4) goto L_0x0171
            r8.mo718b(r7)     // Catch:{ Exception -> 0x01e8 }
            goto L_0x0171
        L_0x0167:
            r19 = r7
            r20 = r12
            android.support.constraint.p020a.p021a.C0340i.m798a(r1, r0, r8)     // Catch:{ Exception -> 0x01e8 }
            r8.mo700a(r0)     // Catch:{ Exception -> 0x01e8 }
        L_0x0171:
            int r15 = r15 + 1
            r7 = r19
            r12 = r20
            r4 = 0
            r8 = 1
            goto L_0x0125
        L_0x017a:
            r20 = r12
            int r4 = r1.f1025av     // Catch:{ Exception -> 0x01e8 }
            if (r4 <= 0) goto L_0x0184
            r4 = 0
            android.support.constraint.p020a.p021a.C0326b.m729a(r1, r0, r4)     // Catch:{ Exception -> 0x01e8 }
        L_0x0184:
            int r4 = r1.f1026aw     // Catch:{ Exception -> 0x01e8 }
            if (r4 <= 0) goto L_0x018c
            r4 = 1
            android.support.constraint.p020a.p021a.C0326b.m729a(r1, r0, r4)     // Catch:{ Exception -> 0x01e8 }
        L_0x018c:
            android.support.constraint.a.e r0 = r1.f1030b     // Catch:{ Exception -> 0x01e5 }
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            if (r4 == 0) goto L_0x019d
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            long r7 = r4.f1104e     // Catch:{ Exception -> 0x01e5 }
            r12 = 0
            r19 = 1
            long r7 = r7 + r19
            r4.f1104e = r7     // Catch:{ Exception -> 0x01e5 }
        L_0x019d:
            boolean r4 = r0.f1083d     // Catch:{ Exception -> 0x01e5 }
            if (r4 == 0) goto L_0x01de
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            if (r4 == 0) goto L_0x01b0
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            long r7 = r4.f1117r     // Catch:{ Exception -> 0x01e5 }
            r12 = 0
            r19 = 1
            long r7 = r7 + r19
            r4.f1117r = r7     // Catch:{ Exception -> 0x01e5 }
        L_0x01b0:
            r4 = 0
        L_0x01b1:
            int r7 = r0.f1085f     // Catch:{ Exception -> 0x01e5 }
            if (r4 >= r7) goto L_0x01c2
            android.support.constraint.a.b[] r7 = r0.f1082c     // Catch:{ Exception -> 0x01e5 }
            r7 = r7[r4]     // Catch:{ Exception -> 0x01e5 }
            boolean r7 = r7.f1074e     // Catch:{ Exception -> 0x01e5 }
            if (r7 != 0) goto L_0x01bf
            r4 = 0
            goto L_0x01c3
        L_0x01bf:
            int r4 = r4 + 1
            goto L_0x01b1
        L_0x01c2:
            r4 = 1
        L_0x01c3:
            if (r4 != 0) goto L_0x01cb
            android.support.constraint.a.e$a r4 = r0.f1081b     // Catch:{ Exception -> 0x01e5 }
            r0.mo791a(r4)     // Catch:{ Exception -> 0x01e5 }
            goto L_0x01e3
        L_0x01cb:
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            if (r4 == 0) goto L_0x01da
            android.support.constraint.a.f r4 = android.support.constraint.p020a.C0351e.f1078h     // Catch:{ Exception -> 0x01e5 }
            long r7 = r4.f1116q     // Catch:{ Exception -> 0x01e5 }
            r12 = 0
            r19 = 1
            long r7 = r7 + r19
            r4.f1116q = r7     // Catch:{ Exception -> 0x01e5 }
        L_0x01da:
            r0.mo801e()     // Catch:{ Exception -> 0x01e5 }
            goto L_0x01e3
        L_0x01de:
            android.support.constraint.a.e$a r4 = r0.f1081b     // Catch:{ Exception -> 0x01e5 }
            r0.mo791a(r4)     // Catch:{ Exception -> 0x01e5 }
        L_0x01e3:
            r8 = 1
            goto L_0x0202
        L_0x01e5:
            r0 = move-exception
            r8 = 1
            goto L_0x01ef
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r20 = r12
        L_0x01ed:
            r8 = r20
        L_0x01ef:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r12 = "EXCEPTION : "
            r7.<init>(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r4.println(r0)
        L_0x0202:
            r0 = 2
            if (r8 == 0) goto L_0x020f
            android.support.constraint.a.e r4 = r1.f1030b
            boolean[] r7 = android.support.constraint.p020a.p021a.C0340i.f1042a
            r1.m777a(r4, r7)
        L_0x020c:
            r4 = 8
            goto L_0x024f
        L_0x020f:
            android.support.constraint.a.e r4 = r1.f1030b
            r1.mo721c(r4)
            r4 = 0
        L_0x0215:
            if (r4 >= r11) goto L_0x020c
            java.util.ArrayList r7 = r1.f1069aD
            java.lang.Object r7 = r7.get(r4)
            android.support.constraint.a.a.e r7 = (android.support.constraint.p020a.p021a.C0333e) r7
            android.support.constraint.a.a.e$a[] r8 = r7.f952F
            r12 = 0
            r8 = r8[r12]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r8 != r12) goto L_0x0236
            int r8 = r7.mo730j()
            int r12 = r7.f969W
            if (r8 >= r12) goto L_0x0236
            boolean[] r4 = android.support.constraint.p020a.p021a.C0340i.f1042a
            r8 = 1
            r4[r0] = r8
            goto L_0x020c
        L_0x0236:
            r8 = 1
            android.support.constraint.a.a.e$a[] r12 = r7.f952F
            r12 = r12[r8]
            android.support.constraint.a.a.e$a r15 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r12 != r15) goto L_0x024c
            int r12 = r7.mo731k()
            int r7 = r7.f970X
            if (r12 >= r7) goto L_0x024c
            boolean[] r4 = android.support.constraint.p020a.p021a.C0340i.f1042a
            r4[r0] = r8
            goto L_0x020c
        L_0x024c:
            int r4 = r4 + 1
            goto L_0x0215
        L_0x024f:
            if (r14 >= r4) goto L_0x02bb
            boolean[] r7 = android.support.constraint.p020a.p021a.C0340i.f1042a
            boolean r0 = r7[r0]
            if (r0 == 0) goto L_0x02bb
            r0 = 0
            r7 = 0
            r8 = 0
        L_0x025a:
            if (r0 >= r11) goto L_0x027e
            java.util.ArrayList r12 = r1.f1069aD
            java.lang.Object r12 = r12.get(r0)
            android.support.constraint.a.a.e r12 = (android.support.constraint.p020a.p021a.C0333e) r12
            int r15 = r12.f958L
            int r16 = r12.mo730j()
            int r15 = r15 + r16
            int r7 = java.lang.Math.max(r7, r15)
            int r15 = r12.f959M
            int r12 = r12.mo731k()
            int r15 = r15 + r12
            int r8 = java.lang.Math.max(r8, r15)
            int r0 = r0 + 1
            goto L_0x025a
        L_0x027e:
            int r0 = r1.f967U
            int r0 = java.lang.Math.max(r0, r7)
            int r7 = r1.f968V
            int r7 = java.lang.Math.max(r7, r8)
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r10 != r8) goto L_0x02a1
            int r8 = r21.mo730j()
            if (r8 >= r0) goto L_0x02a1
            r1.mo717b(r0)
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            r12 = 0
            r0[r12] = r8
            r0 = 1
            r13 = 1
            goto L_0x02a2
        L_0x02a1:
            r0 = 0
        L_0x02a2:
            android.support.constraint.a.a.e$a r8 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r9 != r8) goto L_0x02b9
            int r8 = r21.mo731k()
            if (r8 >= r7) goto L_0x02b9
            r1.mo720c(r7)
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            r8 = 1
            r0[r8] = r7
            r0 = 1
            r8 = 1
            goto L_0x02bd
        L_0x02b9:
            r8 = r13
            goto L_0x02bd
        L_0x02bb:
            r8 = r13
            r0 = 0
        L_0x02bd:
            int r7 = r1.f967U
            int r12 = r21.mo730j()
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r21.mo730j()
            if (r7 <= r12) goto L_0x02d9
            r1.mo717b(r7)
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r8 = 0
            r0[r8] = r7
            r0 = 1
            r8 = 1
        L_0x02d9:
            int r7 = r1.f968V
            int r12 = r21.mo731k()
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r21.mo731k()
            if (r7 <= r12) goto L_0x02f6
            r1.mo720c(r7)
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r12 = 1
            r0[r12] = r7
            r0 = 1
            r8 = 1
            goto L_0x02f7
        L_0x02f6:
            r12 = 1
        L_0x02f7:
            if (r8 != 0) goto L_0x0335
            android.support.constraint.a.a.e$a[] r7 = r1.f952F
            r13 = 0
            r7 = r7[r13]
            android.support.constraint.a.a.e$a r15 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r7 != r15) goto L_0x0317
            if (r5 <= 0) goto L_0x0317
            int r7 = r21.mo730j()
            if (r7 <= r5) goto L_0x0317
            r1.f1017aA = r12
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r0[r13] = r7
            r1.mo717b(r5)
            r0 = 1
            r8 = 1
        L_0x0317:
            android.support.constraint.a.a.e$a[] r7 = r1.f952F
            r7 = r7[r12]
            android.support.constraint.a.a.e$a r13 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r7 != r13) goto L_0x0335
            if (r6 <= 0) goto L_0x0335
            int r7 = r21.mo731k()
            if (r7 <= r6) goto L_0x0335
            r1.f1018aB = r12
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.FIXED
            r0[r12] = r7
            r1.mo720c(r6)
            r12 = 1
            r13 = 1
            goto L_0x0337
        L_0x0335:
            r12 = r0
            r13 = r8
        L_0x0337:
            r0 = r14
            r4 = 0
            r7 = 8
            r8 = 1
            goto L_0x00f2
        L_0x033e:
            android.support.constraint.a.a.e r0 = r1.f953G
            if (r0 == 0) goto L_0x036e
            int r0 = r1.f967U
            int r2 = r21.mo730j()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.f968V
            int r3 = r21.mo731k()
            int r2 = java.lang.Math.max(r2, r3)
            android.support.constraint.a.a.n r3 = r1.f1020aE
            r3.mo770a(r1)
            int r3 = r1.f1021ar
            int r0 = r0 + r3
            int r3 = r1.f1023at
            int r0 = r0 + r3
            r1.mo717b(r0)
            int r0 = r1.f1022as
            int r2 = r2 + r0
            int r0 = r1.f1024au
            int r2 = r2 + r0
            r1.mo720c(r2)
            goto L_0x0372
        L_0x036e:
            r1.f958L = r2
            r1.f959M = r3
        L_0x0372:
            if (r13 == 0) goto L_0x037e
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            r2 = 0
            r0[r2] = r10
            android.support.constraint.a.a.e$a[] r0 = r1.f952F
            r2 = 1
            r0[r2] = r9
        L_0x037e:
            android.support.constraint.a.e r0 = r1.f1030b
            android.support.constraint.a.c r0 = r0.f1086g
            r1.mo715a(r0)
            android.support.constraint.a.a.f r0 = r21.mo771A()
            if (r1 != r0) goto L_0x038e
            r21.mo740t()
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0336f.mo748x():void");
    }

    /* renamed from: f */
    public final boolean mo747f(int i) {
        if ((this.f1029az & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo699a(int i) {
        super.mo699a(i);
        int size = this.f1069aD.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0333e) this.f1069aD.get(i2)).mo699a(i);
        }
    }

    /* renamed from: b */
    private void m778b(C0333e eVar) {
        if (this.f1025av + 1 >= this.f1028ay.length) {
            this.f1028ay = (C0327c[]) Arrays.copyOf(this.f1028ay, this.f1028ay.length * 2);
        }
        this.f1028ay[this.f1025av] = new C0327c(eVar, 0, this.f1016a);
        this.f1025av++;
    }

    /* renamed from: c */
    private void m779c(C0333e eVar) {
        if (this.f1026aw + 1 >= this.f1027ax.length) {
            this.f1027ax = (C0327c[]) Arrays.copyOf(this.f1027ax, this.f1027ax.length * 2);
        }
        this.f1027ax[this.f1026aw] = new C0327c(eVar, 1, this.f1016a);
        this.f1026aw++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo745a(C0333e eVar, int i) {
        if (i == 0) {
            m778b(eVar);
            return;
        }
        if (i == 1) {
            m779c(eVar);
        }
    }

    /* renamed from: a */
    private void m777a(C0351e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo721c(eVar);
        int size = this.f1069aD.size();
        for (int i = 0; i < size; i++) {
            C0333e eVar2 = (C0333e) this.f1069aD.get(i);
            eVar2.mo721c(eVar);
            if (eVar2.f952F[0] == C0335a.MATCH_CONSTRAINT && eVar2.mo730j() < eVar2.f969W) {
                zArr[2] = true;
            }
            if (eVar2.f952F[1] == C0335a.MATCH_CONSTRAINT && eVar2.mo731k() < eVar2.f970X) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo746b(int i, int i2) {
        if (!(this.f952F[0] == C0335a.WRAP_CONTENT || this.f991e == null)) {
            this.f991e.mo764a(i);
        }
        if (this.f952F[1] != C0335a.WRAP_CONTENT && this.f992f != null) {
            this.f992f.mo764a(i2);
        }
    }
}
