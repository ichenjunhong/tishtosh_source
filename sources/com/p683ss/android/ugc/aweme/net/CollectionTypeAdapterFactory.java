package com.p683ss.android.ugc.aweme.net;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory */
public final class CollectionTypeAdapterFactory implements C18097x {
    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (!Collection.class.isAssignableFrom(aVar.f49842b)) {
            return null;
        }
        final C18095w a = fVar.mo34878a((C18097x) this, aVar);
        return new C18095w<T>() {
            public final T read(C17958a aVar) throws IOException {
                if (aVar.mo34843f() == C17960b.NULL) {
                    aVar.mo34847k();
                    return null;
                }
                T t = (Collection) a.read(aVar);
                if (t instanceof ArrayList) {
                    T t2 = (ArrayList) t;
                    for (int size = t2.size() - 1; size >= 0; size--) {
                        if (t2.get(size) == null) {
                            t2.remove(size);
                        }
                    }
                    return t2;
                }
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        it.remove();
                    }
                }
                return t;
            }

            public final void write(C17961c cVar, T t) throws IOException {
                if (t == null) {
                    cVar.mo34870f();
                } else {
                    a.write(cVar, t);
                }
            }
        };
    }
}
