package com.bytedance.p785o.p786a.p796d;

/* renamed from: com.bytedance.o.a.d.a */
public final class C12426a {

    /* renamed from: a */
    public static final Object[] f32675a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f32676b = new Class[0];

    /* renamed from: c */
    private static final String f32677c = "a";

    private C12426a() {
    }

    /* renamed from: b */
    public static Object[] m25018b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f32675a;
        }
        return objArr;
    }

    /* renamed from: a */
    public static Class<?>[] m25017a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f32676b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                cls = null;
            } else {
                cls = objArr[i].getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }
}
