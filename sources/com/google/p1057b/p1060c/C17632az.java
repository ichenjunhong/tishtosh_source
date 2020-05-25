package com.google.p1057b.p1060c;

/* renamed from: com.google.b.c.az */
public final class C17632az {
    /* renamed from: a */
    static Object[] m43332a(Object... objArr) {
        return m43334b(objArr, objArr.length);
    }

    /* renamed from: a */
    public static <T> T[] m43333a(T[] tArr, int i) {
        return C17639bc.m43365a(tArr, i);
    }

    /* renamed from: b */
    static Object[] m43334b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m43331a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m43331a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
