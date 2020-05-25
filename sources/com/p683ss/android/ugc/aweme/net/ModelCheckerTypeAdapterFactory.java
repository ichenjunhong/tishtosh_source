package com.p683ss.android.ugc.aweme.net;

import com.google.gson.C17971f;
import com.google.gson.C18086p;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory */
public final class ModelCheckerTypeAdapterFactory implements C18097x {
    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (!C23453a.class.isAssignableFrom(aVar.f49842b)) {
            return null;
        }
        C23453a.initRequiredFieldMap(aVar.f49842b);
        final C18095w a = fVar.mo34878a((C18097x) this, aVar);
        return new C18095w<T>() {
            public final T read(C17958a aVar) throws IOException {
                if (aVar.mo34843f() == C17960b.NULL) {
                    aVar.mo34847k();
                    return null;
                }
                T t = (C23453a) a.read(aVar);
                try {
                    t.checkValid();
                    return t;
                } catch (C18086p e) {
                    throw e;
                } catch (Throwable th) {
                    throw new C18091u(th);
                }
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
