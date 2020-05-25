package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;

class TypeAdapters$35 implements C18097x {

    /* renamed from: a */
    final /* synthetic */ Class f49995a;

    /* renamed from: b */
    final /* synthetic */ C18095w f49996b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
        sb.append(this.f49995a.getName());
        sb.append(",adapter=");
        sb.append(this.f49996b);
        sb.append("]");
        return sb.toString();
    }

    TypeAdapters$35(Class cls, C18095w wVar) {
        this.f49995a = cls;
        this.f49996b = wVar;
    }

    public final <T2> C18095w<T2> create(C17971f fVar, C17956a<T2> aVar) {
        final Class<? super T> cls = aVar.f49842b;
        if (!this.f49995a.isAssignableFrom(cls)) {
            return null;
        }
        return new C18095w<T1>() {
            public final T1 read(C17958a aVar) throws IOException {
                T1 read = TypeAdapters$35.this.f49996b.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                StringBuilder sb = new StringBuilder("Expected a ");
                sb.append(cls.getName());
                sb.append(" but was ");
                sb.append(read.getClass().getName());
                throw new C18091u(sb.toString());
            }

            public final void write(C17961c cVar, T1 t1) throws IOException {
                TypeAdapters$35.this.f49996b.write(cVar, t1);
            }
        };
    }
}
