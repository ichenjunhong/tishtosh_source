package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17421k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.b.g.d */
abstract class C17750d<T> {
    C17750d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Type mo34533a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C17421k.m42664a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", (Object) genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
