package com.bytedance.p785o.p786a.p796d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.o.a.d.b */
public final class C12427b {

    /* renamed from: a */
    private static Map<String, Method> f32678a = new HashMap();

    /* renamed from: b */
    private static final HashMap<Class<?>, Class<?>> f32679b;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f32679b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        f32679b.put(Byte.TYPE, Byte.class);
        f32679b.put(Character.TYPE, Character.class);
        f32679b.put(Short.TYPE, Short.class);
        f32679b.put(Integer.TYPE, Integer.class);
        f32679b.put(Long.TYPE, Long.class);
        f32679b.put(Double.TYPE, Double.class);
        f32679b.put(Float.TYPE, Float.class);
        f32679b.put(Void.TYPE, Void.class);
    }

    /* renamed from: a */
    public static Object m25019a(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b = C12426a.m25018b(objArr);
        return m25020a(cls, str, b, C12426a.m25017a(b));
    }

    /* renamed from: a */
    private static String m25021a(Class<?> cls, String str, Class... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c1 A[LOOP:0: B:15:0x002c->B:73:0x00c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00a3 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m25022b(java.lang.Class<?> r17, java.lang.String r18, java.lang.Class... r19) {
        /*
            r0 = r18
            r2 = r19
            if (r17 == 0) goto L_0x00d4
            boolean r3 = android.text.TextUtils.isEmpty(r18)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00cc
            java.lang.String r3 = m25021a(r17, r18, r19)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r5 = f32678a
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r6 = f32678a     // Catch:{ all -> 0x00c9 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x00c9 }
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x00c9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x002a
            boolean r0 = r6.isAccessible()
            if (r0 != 0) goto L_0x0029
            r6.setAccessible(r4)
        L_0x0029:
            return r6
        L_0x002a:
            r1 = r17
        L_0x002c:
            if (r1 == 0) goto L_0x00c7
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r5 = r6
        L_0x0034:
            if (r5 != 0) goto L_0x00ae
            java.lang.reflect.Method[] r6 = r1.getDeclaredMethods()
            if (r6 == 0) goto L_0x00ae
            int r7 = r6.length
            r9 = r5
            r5 = 0
        L_0x003f:
            if (r5 >= r7) goto L_0x00ac
            r10 = r6[r5]
            if (r10 == 0) goto L_0x00a9
            java.lang.String r11 = r10.getName()
            boolean r11 = android.text.TextUtils.equals(r11, r0)
            if (r11 == 0) goto L_0x00a9
            java.lang.Class[] r11 = r10.getParameterTypes()
            if (r2 == 0) goto L_0x00a9
            if (r11 == 0) goto L_0x00a9
            int r12 = r2.length
            int r13 = r11.length
            if (r12 != r13) goto L_0x00a9
            r12 = 0
            r13 = 1
        L_0x005d:
            int r14 = r2.length
            if (r12 >= r14) goto L_0x00a6
            r14 = r2[r12]
            r15 = r11[r12]
            if (r15 != 0) goto L_0x0068
        L_0x0066:
            r8 = 0
            goto L_0x00a0
        L_0x0068:
            if (r14 != 0) goto L_0x0072
            boolean r14 = r15.isPrimitive()
            if (r14 != 0) goto L_0x0066
            r8 = 1
            goto L_0x00a0
        L_0x0072:
            boolean r16 = r14.isPrimitive()
            if (r16 == 0) goto L_0x0087
            boolean r16 = r15.isPrimitive()
            if (r16 != 0) goto L_0x0087
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r8 = f32679b
            java.lang.Object r8 = r8.get(r14)
            r14 = r8
            java.lang.Class r14 = (java.lang.Class) r14
        L_0x0087:
            boolean r8 = r15.isPrimitive()
            if (r8 == 0) goto L_0x009c
            boolean r8 = r14.isPrimitive()
            if (r8 != 0) goto L_0x009c
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r8 = f32679b
            java.lang.Object r8 = r8.get(r15)
            r15 = r8
            java.lang.Class r15 = (java.lang.Class) r15
        L_0x009c:
            boolean r8 = r15.isAssignableFrom(r14)
        L_0x00a0:
            if (r8 != 0) goto L_0x00a3
            r13 = 0
        L_0x00a3:
            int r12 = r12 + 1
            goto L_0x005d
        L_0x00a6:
            if (r13 == 0) goto L_0x00a9
            r9 = r10
        L_0x00a9:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x00ac:
            r6 = r9
            goto L_0x00af
        L_0x00ae:
            r6 = r5
        L_0x00af:
            if (r6 == 0) goto L_0x00c1
            r6.setAccessible(r4)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r5 = f32678a
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r0 = f32678a     // Catch:{ all -> 0x00be }
            r0.put(r3, r6)     // Catch:{ all -> 0x00be }
            monitor-exit(r5)     // Catch:{ all -> 0x00be }
            return r6
        L_0x00be:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x002c
        L_0x00c7:
            r0 = 0
            return r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c9 }
            throw r0
        L_0x00cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The method name must not be blank"
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The class must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p785o.p786a.p796d.C12427b.m25022b(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m25020a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null || clsArr.length == 0) {
            clsArr = C12426a.f32676b;
        }
        Object[] b = C12426a.m25018b(objArr);
        Method b2 = m25022b(cls, str, clsArr);
        if (b2 != null) {
            return b2.invoke(null, b);
        }
        return null;
    }
}
