package com.p683ss.android.ugc.aweme.net;

import com.google.gson.C17971f;
import com.google.gson.C18086p;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory */
public class BaseResponseObjectTypeAdapterFactory implements C18097x {
    public <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (!BaseResponse.class.isAssignableFrom(aVar.f49842b)) {
            return null;
        }
        final C18095w a = fVar.mo34878a((C18097x) this, aVar);
        return new C18095w<T>() {
            public final T read(C17958a aVar) throws IOException {
                if (aVar.mo34843f() == C17960b.NULL) {
                    aVar.mo34847k();
                    return null;
                }
                try {
                    T t = (BaseResponse) a.read(aVar);
                    if (t.extra != null && t.extra.now > 0) {
                        C37814w.f96279a = t.extra.now;
                    }
                    return t;
                } catch (C18086p e) {
                    if (e.getCause() instanceof C23459a) {
                        throw ((C23459a) e.getCause());
                    }
                    throw e;
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
