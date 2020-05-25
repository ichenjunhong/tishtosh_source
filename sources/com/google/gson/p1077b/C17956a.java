package com.google.gson.p1077b;

import com.google.gson.internal.C17982a;
import com.google.gson.internal.C17986b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.b.a */
public class C17956a<T> {

    /* renamed from: b */
    public final Class<? super T> f49842b;

    /* renamed from: c */
    public final Type f49843c;

    /* renamed from: d */
    final int f49844d;

    public final int hashCode() {
        return this.f49844d;
    }

    public final String toString() {
        return C17986b.m44151c(this.f49843c);
    }

    protected C17956a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.f49843c = C17986b.m44143a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f49842b = C17986b.m44149b(this.f49843c);
            this.f49844d = this.f49843c.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public static <T> C17956a<T> m44006a(Class<T> cls) {
        return new C17956a<>(cls);
    }

    /* renamed from: a */
    public static C17956a<?> m44007a(Type type) {
        return new C17956a<>(type);
    }

    private C17956a(Type type) {
        this.f49843c = C17986b.m44143a((Type) C17982a.m44133a(type));
        this.f49842b = C17986b.m44149b(this.f49843c);
        this.f49844d = this.f49843c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17956a) || !C17986b.m44148a(this.f49843c, ((C17956a) obj).f49843c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C17956a<?> m44008a(Type type, Type... typeArr) {
        return new C17956a<>(C17986b.m44142a((Type) null, type, typeArr));
    }
}
