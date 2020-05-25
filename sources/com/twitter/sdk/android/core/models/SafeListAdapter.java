package com.twitter.sdk.android.core.models;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class SafeListAdapter implements C18097x {
    public <T> C18095w<T> create(C17971f fVar, final C17956a<T> aVar) {
        final C18095w a = fVar.mo34878a((C18097x) this, aVar);
        return new C18095w<T>() {
            public final T read(C17958a aVar) throws IOException {
                T read = a.read(aVar);
                if (!List.class.isAssignableFrom(aVar.f49842b)) {
                    return read;
                }
                if (read == null) {
                    return Collections.EMPTY_LIST;
                }
                return Collections.unmodifiableList((List) read);
            }

            public final void write(C17961c cVar, T t) throws IOException {
                a.write(cVar, t);
            }
        };
    }
}
