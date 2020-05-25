package com.bytedance.jedi.p725a.p743m;

import com.p1081h.p1082a.C18112a;
import com.p1081h.p1082a.C18114c;
import com.p1081h.p1082a.C18115d;

/* renamed from: com.bytedance.jedi.a.m.e */
public final class C11747e implements C18112a {

    /* renamed from: a */
    private final C18114c f31204a;

    /* renamed from: b */
    private final String f31205b;

    /* renamed from: com.bytedance.jedi.a.m.e$a */
    public static class C11749a {

        /* renamed from: a */
        C18114c f31206a;

        /* renamed from: b */
        String f31207b;

        private C11749a() {
            this.f31207b = "PRETTY_LOGGER";
        }

        /* renamed from: a */
        public final C11747e mo22501a() {
            if (this.f31206a == null) {
                this.f31206a = new C18115d();
            }
            return new C11747e(this);
        }

        /* renamed from: a */
        public final C11749a mo22500a(String str) {
            this.f31207b = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C11749a m24070a() {
        return new C11749a();
    }

    private C11747e(C11749a aVar) {
        m24071a(aVar);
        this.f31204a = aVar.f31206a;
        this.f31205b = aVar.f31207b;
    }

    /* renamed from: a */
    private static <T> T m24071a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private void m24072a(int i, String str) {
        m24074c(i, str, "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    /* renamed from: c */
    private void m24074c(int i, String str, String str2) {
        m24071a(str2);
        this.f31204a.mo22497a(i, str, str2);
    }

    /* renamed from: b */
    private void m24073b(int i, String str, String str2) {
        String[] split;
        m24071a(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            StringBuilder sb = new StringBuilder("│ ");
            sb.append(str3);
            m24074c(i, str, sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[LOOP:1: B:31:0x0074->B:32:0x0076, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:28:0x006b, B:32:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22499a(int r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            m24071a(r10)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x0010
            int r2 = r9.length()
            if (r2 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = r7.f31205b
            if (r2 != r9) goto L_0x0018
            goto L_0x0044
        L_0x0018:
            if (r2 == 0) goto L_0x0043
            if (r9 == 0) goto L_0x0043
            int r3 = r2.length()
            int r4 = r9.length()
            if (r3 != r4) goto L_0x0043
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L_0x0033
            boolean r4 = r9 instanceof java.lang.String
            if (r4 == 0) goto L_0x0033
            boolean r1 = r2.equals(r9)
            goto L_0x0044
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 >= r3) goto L_0x0044
            char r5 = r2.charAt(r4)
            char r6 = r9.charAt(r4)
            if (r5 != r6) goto L_0x0043
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 != 0) goto L_0x005d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.f31205b
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            goto L_0x005f
        L_0x005d:
            java.lang.String r9 = r7.f31205b
        L_0x005f:
            java.lang.String r1 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r7.m24074c(r8, r9, r1)
            byte[] r1 = r10.getBytes()
            int r2 = r1.length
            r3 = 4000(0xfa0, float:5.605E-42)
            if (r2 > r3) goto L_0x0074
            r7.m24073b(r8, r9, r10)
            r7.m24072a(r8, r9)
            return
        L_0x0074:
            if (r0 >= r2) goto L_0x0087
            int r10 = r2 - r0
            int r10 = java.lang.Math.min(r10, r3)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r0, r10)
            r7.m24073b(r8, r9, r4)
            int r0 = r0 + 4000
            goto L_0x0074
        L_0x0087:
            r7.m24072a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p743m.C11747e.mo22499a(int, java.lang.String, java.lang.String):void");
    }
}
