package com.google.p1057b.p1060c;

import java.lang.reflect.Array;

/* renamed from: com.google.b.c.bc */
final class C17639bc {
    /* renamed from: a */
    static <T> T[] m43365a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
