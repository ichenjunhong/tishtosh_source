package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;

class TypeAdapters$30 implements C18097x {
    TypeAdapters$30() {
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Class<? super T> cls = aVar.f49842b;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new C18042a(cls);
    }
}
