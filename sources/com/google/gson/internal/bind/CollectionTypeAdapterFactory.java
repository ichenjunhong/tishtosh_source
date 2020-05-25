package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C17986b;
import com.google.gson.internal.C18043c;
import com.google.gson.internal.C18069h;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C18097x {

    /* renamed from: a */
    private final C18043c f49943a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    static final class C17990a<E> extends C18095w<Collection<E>> {

        /* renamed from: a */
        private final C18095w<E> f49944a;

        /* renamed from: b */
        private final C18069h<? extends Collection<E>> f49945b;

        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            Collection collection = (Collection) this.f49945b.mo34956a();
            aVar.mo34837a();
            while (aVar.mo34842e()) {
                collection.add(this.f49944a.read(aVar));
            }
            aVar.mo34838b();
            return collection;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo34870f();
                return;
            }
            cVar.mo34863b();
            for (Object write : collection) {
                this.f49944a.write(cVar, write);
            }
            cVar.mo34865c();
        }

        public C17990a(C17971f fVar, Type type, C18095w<E> wVar, C18069h<? extends Collection<E>> hVar) {
            this.f49944a = new C18011i(fVar, wVar, type);
            this.f49945b = hVar;
        }
    }

    public CollectionTypeAdapterFactory(C18043c cVar) {
        this.f49943a = cVar;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Type type = aVar.f49843c;
        Class<? super T> cls = aVar.f49842b;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C17986b.m44144a(type, cls);
        return new C17990a(fVar, a, fVar.mo34877a(C17956a.m44007a(a)), this.f49943a.mo34954a(aVar));
    }
}
