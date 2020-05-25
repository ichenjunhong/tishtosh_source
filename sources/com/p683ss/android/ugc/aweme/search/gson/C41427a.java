package com.p683ss.android.ugc.aweme.search.gson;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C17993a;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.ss.android.ugc.aweme.search.gson.a */
final class C41427a<T> extends C18095w<T> {

    /* renamed from: a */
    private final C17971f f104997a;

    /* renamed from: b */
    private final C18095w<T> f104998b;

    /* renamed from: c */
    private final Type f104999c;

    public final T read(C17958a aVar) throws IOException {
        return this.f104998b.read(aVar);
    }

    public final void write(C17961c cVar, T t) throws IOException {
        C18095w<T> wVar = this.f104998b;
        Type type = this.f104999c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f104999c) {
            wVar = this.f104997a.mo34877a(C17956a.m44007a(type));
            if ((wVar instanceof C17993a) && !(this.f104998b instanceof C17993a)) {
                wVar = this.f104998b;
            }
        }
        wVar.write(cVar, t);
    }

    C41427a(C17971f fVar, C18095w<T> wVar, Type type) {
        this.f104997a = fVar;
        this.f104998b = wVar;
        this.f104999c = type;
    }
}
