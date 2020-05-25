package com.google.p1057b.p1064g;

import com.google.p1057b.p1058a.C17421k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.b.g.e */
public abstract class C17751e<T> extends C17750d<T> {

    /* renamed from: a */
    final TypeVariable<?> f49483a;

    public final int hashCode() {
        return this.f49483a.hashCode();
    }

    public String toString() {
        return this.f49483a.toString();
    }

    protected C17751e() {
        Type a = mo34533a();
        C17421k.m42664a(a instanceof TypeVariable, "%s should be a type variable.", (Object) a);
        this.f49483a = (TypeVariable) a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17751e)) {
            return false;
        }
        return this.f49483a.equals(((C17751e) obj).f49483a);
    }
}
