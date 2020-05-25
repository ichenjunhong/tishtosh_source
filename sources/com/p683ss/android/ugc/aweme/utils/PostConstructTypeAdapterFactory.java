package com.p683ss.android.ugc.aweme.utils;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory */
public class PostConstructTypeAdapterFactory implements C18097x {

    /* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory$a */
    static class C47649a<T> extends C18095w<T> {

        /* renamed from: a */
        private final C18095w<T> f120120a;

        C47649a(C18095w<T> wVar) {
            this.f120120a = wVar;
        }

        public final T read(C17958a aVar) throws IOException {
            return this.f120120a.read(aVar);
        }

        public final void write(C17961c cVar, T t) throws IOException {
            this.f120120a.write(cVar, t);
        }
    }

    public <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        return new C47649a(fVar.mo34878a((C18097x) this, aVar));
    }
}
