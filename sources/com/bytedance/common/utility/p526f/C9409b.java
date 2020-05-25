package com.bytedance.common.utility.p526f;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.bytedance.common.utility.f.b */
public final class C9409b {

    /* renamed from: a */
    public final Object f25654a;

    /* renamed from: b */
    private final boolean f25655b;

    /* renamed from: com.bytedance.common.utility.f.b$a */
    public static class C9410a {
    }

    /* renamed from: a */
    public final C9409b mo17050a(String str, Object obj) throws C9411c {
        try {
            Field b = mo17055b(str, new Class[0]);
            Object obj2 = this.f25654a;
            if (obj instanceof C9409b) {
                obj = ((C9409b) obj).f25654a;
            }
            b.set(obj2, obj);
            return this;
        } catch (Exception e) {
            throw new C9411c((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C9409b mo17051a(String str, Class<?>... clsArr) throws C9411c {
        try {
            return m18609a(mo17055b(str, clsArr).get(this.f25654a));
        } catch (Exception e) {
            throw new C9411c((Throwable) e);
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.utility.f.c.<init>(java.lang.Throwable):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r1 = r0.getDeclaredMethods();
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r4 < r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r5 = r1[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (m18615a(r5, r8, r9) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return m18612a(r5, r7.f25654a, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = r0.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0 = new java.lang.StringBuilder("No similar method ");
        r0.append(r8);
        r0.append(" with params ");
        r0.append(java.util.Arrays.toString(r9));
        r0.append(" could be found on type ");
        r0.append(m18613a());
        r0.append(com.taobao.android.dexposed.ClassUtils.PACKAGE_SEPARATOR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        throw new java.lang.NoSuchMethodException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        throw new com.bytedance.common.utility.p526f.C9411c((java.lang.Throwable) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = m18613a();
        r1 = r0.getMethods();
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4 < r2) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r5 = r1[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (m18615a(r5, r8, r9) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.common.utility.p526f.C9409b mo17052a(java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Object... r10) throws com.bytedance.common.utility.p526f.C9411c {
        /*
            r7 = this;
            java.lang.reflect.Method r0 = r7.m18618b(r8, r9, r10)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r7.f25654a     // Catch:{ NoSuchMethodException -> 0x000b }
            com.bytedance.common.utility.f.b r0 = m18612a(r0, r1, r10)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r0
        L_0x000b:
            java.lang.Class r0 = r7.m18613a()     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.reflect.Method[] r1 = r0.getMethods()     // Catch:{ NoSuchMethodException -> 0x0076 }
            int r2 = r1.length     // Catch:{ NoSuchMethodException -> 0x0076 }
            r3 = 0
            r4 = 0
        L_0x0016:
            if (r4 >= r2) goto L_0x0024
            r5 = r1[r4]     // Catch:{ NoSuchMethodException -> 0x0076 }
            boolean r6 = r7.m18615a(r5, r8, (java.lang.Class<?>[]) r9)     // Catch:{ NoSuchMethodException -> 0x0076 }
            if (r6 == 0) goto L_0x0021
            goto L_0x0034
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0024:
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()     // Catch:{ NoSuchMethodException -> 0x0076 }
            int r2 = r1.length     // Catch:{ NoSuchMethodException -> 0x0076 }
            r4 = 0
        L_0x002a:
            if (r4 >= r2) goto L_0x003e
            r5 = r1[r4]     // Catch:{ NoSuchMethodException -> 0x0076 }
            boolean r6 = r7.m18615a(r5, r8, (java.lang.Class<?>[]) r9)     // Catch:{ NoSuchMethodException -> 0x0076 }
            if (r6 == 0) goto L_0x003b
        L_0x0034:
            java.lang.Object r8 = r7.f25654a     // Catch:{ NoSuchMethodException -> 0x0076 }
            com.bytedance.common.utility.f.b r8 = m18612a(r5, r8, r10)     // Catch:{ NoSuchMethodException -> 0x0076 }
            return r8
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003e:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x0076 }
            if (r0 == 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r1 = "No similar method "
            r0.<init>(r1)     // Catch:{ NoSuchMethodException -> 0x0076 }
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r8 = " with params "
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r8 = java.util.Arrays.toString(r9)     // Catch:{ NoSuchMethodException -> 0x0076 }
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r8 = " could be found on type "
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.Class r8 = r7.m18613a()     // Catch:{ NoSuchMethodException -> 0x0076 }
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r8 = "."
            r0.append(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            java.lang.String r8 = r0.toString()     // Catch:{ NoSuchMethodException -> 0x0076 }
            r10.<init>(r8)     // Catch:{ NoSuchMethodException -> 0x0076 }
            throw r10     // Catch:{ NoSuchMethodException -> 0x0076 }
        L_0x0076:
            r8 = move-exception
            com.bytedance.common.utility.f.c r9 = new com.bytedance.common.utility.f.c
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p526f.C9409b.mo17052a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.bytedance.common.utility.f.b");
    }

    /* renamed from: a */
    public final C9409b mo17053a(Object... objArr) throws C9411c {
        Class[] clsArr;
        Constructor[] declaredConstructors;
        Class<C9410a> cls;
        if (objArr == null) {
            clsArr = new Class[0];
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    cls = C9410a.class;
                } else {
                    cls = obj.getClass();
                }
                clsArr[i] = cls;
            }
        }
        try {
            return m18611a(m18613a().getDeclaredConstructor(clsArr), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor constructor : m18613a().getDeclaredConstructors()) {
                if (m18616a((Class<?>[]) constructor.getParameterTypes(), (Class<?>[]) clsArr)) {
                    return m18611a(constructor, objArr);
                }
            }
            throw new C9411c((Throwable) e);
        }
    }

    public final int hashCode() {
        return this.f25654a.hashCode();
    }

    public final String toString() {
        return this.f25654a.toString();
    }

    /* renamed from: a */
    private Class<?> m18613a() {
        if (this.f25655b) {
            return (Class) this.f25654a;
        }
        return this.f25654a.getClass();
    }

    private C9409b(Object obj) {
        this.f25654a = obj;
    }

    /* renamed from: a */
    public static C9409b m18608a(Class<?> cls) {
        return new C9409b(cls);
    }

    private C9409b(Class<?> cls) {
        this.f25654a = cls;
        this.f25655b = true;
    }

    /* renamed from: a */
    public static C9409b m18609a(Object obj) {
        return new C9409b(obj);
    }

    /* renamed from: c */
    private static Class<?> m18619c(String str) throws C9411c {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new C9411c((Throwable) e);
        }
    }

    /* renamed from: b */
    public final C9409b mo17054b(String str) throws C9411c {
        return mo17052a(str, (Class<?>[]) null, new Object[0]);
    }

    /* renamed from: a */
    public static C9409b m18610a(String str) throws C9411c {
        return m18608a(m18619c(str));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9409b) {
            return this.f25654a.equals(((C9409b) obj).f25654a);
        }
        return false;
    }

    /* renamed from: b */
    public static Class<?> m18617b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
        }
        return cls;
    }

    /* renamed from: a */
    private static <T extends AccessibleObject> T m18614a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* renamed from: a */
    private static C9409b m18611a(Constructor<?> constructor, Object... objArr) throws C9411c {
        try {
            return m18609a(((Constructor) m18614a((T) constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new C9411c((Throwable) e);
        }
    }

    /* renamed from: b */
    public Field mo17055b(String str, Class<?>... clsArr) throws C9411c {
        Field[] declaredFields;
        Class a = m18613a();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return a.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) m18614a((T) a.getDeclaredField(str));
                    } catch (NoSuchFieldException unused) {
                        a = a.getSuperclass();
                        if (a != null) {
                            throw new C9411c((Throwable) e);
                        }
                    }
                } while (a != null);
                throw new C9411c((Throwable) e);
            }
        } else {
            do {
                try {
                    for (Field field : a.getDeclaredFields()) {
                        Class type = field.getType();
                        if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) m18614a((T) field);
                        }
                    }
                } catch (Exception unused2) {
                }
                a = a.getSuperclass();
            } while (a != null);
            throw new C9411c("NoSuchFieldException");
        }
    }

    /* renamed from: a */
    private static boolean m18616a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C9410a.class && !m18617b(clsArr[i]).isAssignableFrom(m18617b(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r8 = m18613a().getMethods();
        r0 = r8.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 < r0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r8[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r6.equals(r2.getName()) != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3 = r2.getParameterTypes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return r8.getDeclaredMethod(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r8 = r8.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r8 != null) goto L_0x0009;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method m18618b(java.lang.String r6, java.lang.Class<?>[] r7, java.lang.Object... r8) throws java.lang.NoSuchMethodException {
        /*
            r5 = this;
            java.lang.Class r8 = r5.m18613a()
            java.lang.reflect.Method r0 = r8.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x000e }
            return r0
        L_0x000e:
            java.lang.Class r8 = r8.getSuperclass()
            if (r8 != 0) goto L_0x0009
            java.lang.Class r8 = r5.m18613a()
            java.lang.reflect.Method[] r8 = r8.getMethods()
            int r0 = r8.length
            r1 = 0
        L_0x001e:
            if (r1 >= r0) goto L_0x003a
            r2 = r8[r1]
            java.lang.String r3 = r2.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0037
            java.lang.Class[] r3 = r2.getParameterTypes()
            if (r3 == 0) goto L_0x0037
            int r3 = r3.length
            int r4 = r7.length
            if (r3 != r4) goto L_0x0037
            return r2
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x003a:
            java.lang.NoSuchMethodException r6 = new java.lang.NoSuchMethodException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.p526f.C9409b.m18618b(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static C9409b m18612a(Method method, Object obj, Object... objArr) throws C9411c {
        try {
            m18614a((T) method);
            if (method.getReturnType() != Void.TYPE) {
                return m18609a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m18609a(obj);
        } catch (Exception e) {
            throw new C9411c((Throwable) e);
        }
    }

    /* renamed from: a */
    private boolean m18615a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !m18616a((Class<?>[]) method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }
}
