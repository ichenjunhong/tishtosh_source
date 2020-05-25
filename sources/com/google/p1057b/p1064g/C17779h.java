package com.google.p1057b.p1064g;

import com.google.p1057b.p1060c.C17658bm;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* renamed from: com.google.b.g.h */
abstract class C17779h {

    /* renamed from: a */
    private final Set<Type> f49521a = C17658bm.m43406a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34540a(Class<?> cls) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34541a(GenericArrayType genericArrayType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34542a(ParameterizedType parameterizedType) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34543a(TypeVariable<?> typeVariable) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34544a(WildcardType wildcardType) {
    }

    C17779h() {
    }

    /* renamed from: a */
    public final void mo34590a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f49521a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo34543a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo34544a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo34542a((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo34540a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo34541a((GenericArrayType) type);
                    } else {
                        StringBuilder sb = new StringBuilder("Unknown type: ");
                        sb.append(type);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.f49521a.remove(type);
                    throw th;
                }
            }
        }
    }
}
