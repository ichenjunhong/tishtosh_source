package com.bytedance.p558e;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.e.d */
public final class C9741d {

    /* renamed from: a */
    public static C9749j f26521a;

    /* renamed from: b */
    public static volatile C9737b f26522b;

    /* renamed from: c */
    public static volatile Future f26523c;

    /* renamed from: d */
    private static final Map<String, Object> f26524d = new ConcurrentHashMap();

    /* renamed from: e */
    private static boolean f26525e = false;

    /* renamed from: f */
    private static final Map<String, String> f26526f = new ConcurrentHashMap();

    /* renamed from: b */
    public static void m19513b() {
        m19514c();
        f26522b.mo17566b();
    }

    /* renamed from: a */
    public static boolean m19512a() {
        m19514c();
        return f26522b.mo17567c();
    }

    /* renamed from: c */
    private static void m19514c() {
        if (f26523c != null) {
            try {
                f26523c.get();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("ExperimentManager has not been init (obtain)");
        }
    }

    /* renamed from: a */
    public static <T> T m19510a(String str, Type type, T t, boolean z, boolean z2) {
        return m19511a(str, type, t, z, z2, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0135 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m19511a(java.lang.String r18, java.lang.reflect.Type r19, T r20, boolean r21, boolean r22, com.bytedance.p558e.p559a.C9735a<T> r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r23
            m19514c()
            if (r21 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r6 = f26524d
            boolean r6 = r6.containsKey(r0)
            if (r6 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r6 = f26524d
            java.lang.Object r6 = r6.get(r0)
            java.lang.Class r6 = r6.getClass()
            if (r6 != r1) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.String> r6 = f26526f     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = "sticky"
            r6.put(r0, r7)     // Catch:{ Exception -> 0x0031 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = f26524d     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x0031 }
            return r6
        L_0x0031:
        L_0x0032:
            com.bytedance.e.e$a r6 = com.bytedance.p558e.C9743e.f26534a
            r7 = 0
            if (r6 != 0) goto L_0x0039
            r6 = r7
            goto L_0x003f
        L_0x0039:
            com.bytedance.e.e$a r6 = com.bytedance.p558e.C9743e.f26534a
            java.lang.Object r6 = r6.mo17571a(r0, r1)
        L_0x003f:
            if (r6 == 0) goto L_0x0050
            if (r21 == 0) goto L_0x0048
            java.util.Map<java.lang.String, java.lang.Object> r1 = f26524d
            r1.put(r0, r6)
        L_0x0048:
            java.util.Map<java.lang.String, java.lang.String> r1 = f26526f
            java.lang.String r2 = "panel"
            r1.put(r0, r2)
            return r6
        L_0x0050:
            boolean r6 = f26525e
            if (r6 == 0) goto L_0x006b
            com.bytedance.e.b r6 = f26522b
            java.lang.Object r6 = r6.mo17564a(r0, r1, r7, r4)
            if (r6 == 0) goto L_0x006b
            if (r21 == 0) goto L_0x0063
            java.util.Map<java.lang.String, java.lang.Object> r1 = f26524d
            r1.put(r0, r6)
        L_0x0063:
            java.util.Map<java.lang.String, java.lang.String> r1 = f26526f
            java.lang.String r2 = "libra"
            r1.put(r0, r2)
            return r6
        L_0x006b:
            com.bytedance.e.j r6 = f26521a
            if (r6 == 0) goto L_0x0086
            com.bytedance.e.j r6 = f26521a
            java.lang.Object r6 = r6.mo17578a(r0, r1, r7)
            if (r6 == 0) goto L_0x0086
            if (r21 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r1 = f26524d
            r1.put(r0, r6)
        L_0x007e:
            java.util.Map<java.lang.String, java.lang.String> r1 = f26526f
            java.lang.String r2 = "setting"
            r1.put(r0, r2)
            return r6
        L_0x0086:
            boolean r6 = f26525e
            if (r6 != 0) goto L_0x00a1
            com.bytedance.e.b r6 = f26522b
            java.lang.Object r1 = r6.mo17564a(r0, r1, r7, r4)
            if (r1 == 0) goto L_0x00a1
            if (r21 == 0) goto L_0x0099
            java.util.Map<java.lang.String, java.lang.Object> r2 = f26524d
            r2.put(r0, r1)
        L_0x0099:
            java.util.Map<java.lang.String, java.lang.String> r2 = f26526f
            java.lang.String r3 = "libra"
            r2.put(r0, r3)
            return r1
        L_0x00a1:
            com.bytedance.e.b r1 = f26522b
            if (r5 == 0) goto L_0x0123
            java.lang.String r6 = r5.f26501a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0123
            com.bytedance.e.a.b<T>[] r6 = r5.f26503c
            if (r6 == 0) goto L_0x0123
            com.bytedance.e.a.b<T>[] r6 = r5.f26503c
            int r6 = r6.length
            if (r6 != 0) goto L_0x00b8
            goto L_0x0123
        L_0x00b8:
            java.lang.String r6 = r5.f26501a
            android.content.SharedPreferences r8 = r1.f26509a
            boolean r8 = r8.contains(r6)
            r9 = 0
            if (r8 == 0) goto L_0x00ca
            android.content.SharedPreferences r8 = r1.f26509a
            int r6 = r8.getInt(r6, r9)
            goto L_0x00e3
        L_0x00ca:
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            r10 = 1000(0x3e8, float:1.401E-42)
            int r8 = r8.nextInt(r10)
            android.content.SharedPreferences r10 = r1.f26509a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r6 = r10.putInt(r6, r8)
            r6.apply()
            r6 = r8
        L_0x00e3:
            double r10 = r5.f26502b
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 * r12
            int r8 = (int) r10
            if (r6 < r8) goto L_0x0123
            com.bytedance.e.a.b<T>[] r10 = r5.f26503c
            int r11 = r10.length
        L_0x00f2:
            if (r9 >= r11) goto L_0x0123
            r14 = r10[r9]
            if (r14 == 0) goto L_0x0117
            double r7 = (double) r8
            r16 = r10
            r17 = r11
            double r10 = r14.f26507b
            double r10 = r10 * r12
            java.lang.Double.isNaN(r7)
            double r7 = r7 + r10
            int r7 = (int) r7
            if (r6 >= r7) goto L_0x0115
            if (r4 == 0) goto L_0x0111
            com.bytedance.e.f r1 = r1.f26510b
            java.lang.String r4 = r14.f26506a
            r1.mo17573a(r0, r5, r4)
        L_0x0111:
            T r7 = r14.f26508c
            r15 = r7
            goto L_0x0124
        L_0x0115:
            r8 = r7
            goto L_0x011b
        L_0x0117:
            r16 = r10
            r17 = r11
        L_0x011b:
            int r9 = r9 + 1
            r10 = r16
            r11 = r17
            r7 = 0
            goto L_0x00f2
        L_0x0123:
            r15 = 0
        L_0x0124:
            if (r15 == 0) goto L_0x0135
            if (r21 == 0) goto L_0x012d
            java.util.Map<java.lang.String, java.lang.Object> r1 = f26524d
            r1.put(r0, r15)
        L_0x012d:
            java.util.Map<java.lang.String, java.lang.String> r1 = f26526f
            java.lang.String r2 = "client"
            r1.put(r0, r2)
            return r15
        L_0x0135:
            if (r21 == 0) goto L_0x013e
            if (r2 == 0) goto L_0x013e
            java.util.Map<java.lang.String, java.lang.Object> r1 = f26524d
            r1.put(r0, r2)
        L_0x013e:
            java.util.Map<java.lang.String, java.lang.String> r1 = f26526f
            java.lang.String r3 = "default"
            r1.put(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p558e.C9741d.m19511a(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean, boolean, com.bytedance.e.a.a):java.lang.Object");
    }
}
