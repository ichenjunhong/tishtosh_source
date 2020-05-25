package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C17993a;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.i */
final class C18011i<T> extends C18095w<T> {

    /* renamed from: a */
    private final C17971f f50023a;

    /* renamed from: b */
    private final C18095w<T> f50024b;

    /* renamed from: c */
    private final Type f50025c;

    public final T read(C17958a aVar) throws IOException {
        return this.f50024b.read(aVar);
    }

    public final void write(C17961c cVar, T t) throws IOException {
        C18095w<T> wVar = this.f50024b;
        Type type = this.f50025c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f50025c) {
            wVar = this.f50023a.mo34877a(C17956a.m44007a(type));
            if ((wVar instanceof C17993a) && !(this.f50024b instanceof C17993a)) {
                wVar = this.f50024b;
            }
        }
        wVar.write(cVar, t);
    }

    C18011i(C17971f fVar, C18095w<T> wVar, Type type) {
        this.f50023a = fVar;
        this.f50024b = wVar;
        this.f50025c = type;
    }
}
