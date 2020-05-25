package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C17986b;
import com.google.gson.p1077b.C17956a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

class ArrayTypeAdapter$1 implements C18097x {
    ArrayTypeAdapter$1() {
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Type type;
        Type type2 = aVar.f49843c;
        boolean z = type2 instanceof GenericArrayType;
        if (!z && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
            return null;
        }
        if (z) {
            type = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            type = ((Class) type2).getComponentType();
        }
        return new C17999a(fVar, fVar.mo34877a(C17956a.m44007a(type)), C17986b.m44149b(type));
    }
}
