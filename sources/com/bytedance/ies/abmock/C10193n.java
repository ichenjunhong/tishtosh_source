package com.bytedance.ies.abmock;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.abmock.n */
public final class C10193n {

    /* renamed from: a */
    private static C10193n f27522a;

    /* renamed from: b */
    private List<Object> f27523b = new ArrayList();

    /* renamed from: c */
    public static C10196q m20609c() {
        return C10181b.m20511a().f27515d;
    }

    /* renamed from: a */
    public static synchronized C10193n m20607a() {
        C10193n nVar;
        synchronized (C10193n.class) {
            if (f27522a == null) {
                f27522a = new C10193n();
            }
            nVar = f27522a;
        }
        return nVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object[] mo18205b() {
        Object[] objArr;
        synchronized (this.f27523b) {
            if (this.f27523b.size() > 0) {
                objArr = this.f27523b.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> T m20608a(String str) {
        if (C10181b.m20511a().mo18174b() && C10195p.f27525a.mo18196b()) {
            T a = C10195p.f27525a.mo18193a(str);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" 正在使用 mock 的数据!!");
                C10177a.m20507a(sb.toString());
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo18200a(Class cls, String str, Integer num, int i) {
        Integer num2 = (Integer) m20608a(str);
        if (num2 != null) {
            return num2.intValue();
        }
        if (m20609c().mo18216a()) {
            num = Integer.valueOf(m20609c().mo18219b(str, i));
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final long mo18201a(Class cls, String str, Long l, long j) {
        Long l2 = (Long) m20608a(str);
        if (l2 != null) {
            return l2.longValue();
        }
        if (m20609c().mo18216a()) {
            l = Long.valueOf(m20609c().mo18220b(str, j));
        }
        return l.longValue();
    }

    /* renamed from: a */
    public final String mo18203a(Class cls, String str, String str2, String str3) {
        String str4 = (String) m20608a(str);
        if (str4 != null) {
            return str4;
        }
        if (m20609c().mo18216a()) {
            str2 = m20609c().mo18224c(str, str3);
        }
        return str2;
    }

    /* renamed from: a */
    public final boolean mo18204a(Class cls, String str, Boolean bool, boolean z) {
        Boolean bool2 = (Boolean) m20608a(str);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (m20609c().mo18216a()) {
            bool = Boolean.valueOf(m20609c().mo18222b(str, z));
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [T, long[]] */
    /* JADX WARNING: type inference failed for: r4v18, types: [T, boolean[]] */
    /* JADX WARNING: type inference failed for: r4v22, types: [T, double[]] */
    /* JADX WARNING: type inference failed for: r4v26, types: [float[], T] */
    /* JADX WARNING: type inference failed for: r4v30, types: [T, int[]] */
    /* JADX WARNING: type inference failed for: r4v34, types: [T, java.lang.String[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean[], code=null, for r4v18, types: [T, boolean[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v14, types: [T, long[]]
      assigns: [long[]]
      uses: [?[], T, ?[long, double][]]
      mth insns count: 135
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo18202a(java.lang.Class r4, java.lang.String r5, java.lang.Object r6, java.lang.String r7, java.lang.Class r8) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.Object r4 = m20608a(r5)
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r7 = 0
            if (r8 != r4) goto L_0x0036
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            int r8 = r4.length
        L_0x0015:
            if (r7 >= r8) goto L_0x0022
            java.lang.Object r0 = r6.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r4[r7] = r0
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0022:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x0035
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.String[] r4 = r4.mo18223b(r5)
            return r4
        L_0x0035:
            return r4
        L_0x0036:
            java.lang.Class<int[]> r4 = int[].class
            if (r8 != r4) goto L_0x0068
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            int[] r4 = new int[r4]
            int r0 = r4.length
        L_0x0043:
            if (r7 >= r0) goto L_0x0054
            java.lang.Object r1 = r6.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4[r7] = r1
            int r7 = r7 + 1
            goto L_0x0043
        L_0x0054:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x0067
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x0067:
            return r4
        L_0x0068:
            java.lang.Class<float[]> r4 = float[].class
            if (r8 != r4) goto L_0x009a
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            float[] r4 = new float[r4]
            int r0 = r4.length
        L_0x0075:
            if (r7 >= r0) goto L_0x0086
            java.lang.Object r1 = r6.get(r7)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r4[r7] = r1
            int r7 = r7 + 1
            goto L_0x0075
        L_0x0086:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x0099
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x0099:
            return r4
        L_0x009a:
            java.lang.Class<double[]> r4 = double[].class
            if (r8 != r4) goto L_0x00cc
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            double[] r4 = new double[r4]
            int r0 = r4.length
        L_0x00a7:
            if (r7 >= r0) goto L_0x00b8
            java.lang.Object r1 = r6.get(r7)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r4[r7] = r1
            int r7 = r7 + 1
            goto L_0x00a7
        L_0x00b8:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x00cb
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x00cb:
            return r4
        L_0x00cc:
            java.lang.Class<boolean[]> r4 = boolean[].class
            if (r8 != r4) goto L_0x00fe
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            boolean[] r4 = new boolean[r4]
            int r0 = r4.length
        L_0x00d9:
            if (r7 >= r0) goto L_0x00ea
            java.lang.Object r1 = r6.get(r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r4[r7] = r1
            int r7 = r7 + 1
            goto L_0x00d9
        L_0x00ea:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x00fd
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x00fd:
            return r4
        L_0x00fe:
            java.lang.Class<long[]> r4 = long[].class
            if (r8 != r4) goto L_0x0130
            java.util.List r6 = (java.util.List) r6
            int r4 = r6.size()
            long[] r4 = new long[r4]
            int r0 = r4.length
        L_0x010b:
            if (r7 >= r0) goto L_0x011c
            java.lang.Object r1 = r6.get(r7)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4[r7] = r1
            int r7 = r7 + 1
            goto L_0x010b
        L_0x011c:
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x012f
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x012f:
            return r4
        L_0x0130:
            com.google.gson.f r4 = com.bytedance.ies.abmock.C10188i.m20580a()
            java.lang.String r4 = r4.mo34889b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "正在使用 Gson 转换对象 : "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.bytedance.ies.abmock.C10177a.m20507a(r6)
            java.lang.String r6 = "json"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            com.google.gson.f r6 = com.bytedance.ies.abmock.C10188i.m20580a()
            java.lang.Object r4 = r6.mo34884a(r4, r8)
            com.bytedance.ies.abmock.q r6 = m20609c()
            boolean r6 = r6.mo18216a()
            if (r6 == 0) goto L_0x0169
            com.bytedance.ies.abmock.q r4 = m20609c()
            java.lang.Object r4 = r4.mo18207a(r5, r8)
            return r4
        L_0x0169:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.C10193n.mo18202a(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String, java.lang.Class):java.lang.Object");
    }
}
