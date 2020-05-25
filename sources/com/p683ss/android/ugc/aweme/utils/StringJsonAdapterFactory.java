package com.p683ss.android.ugc.aweme.utils;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory */
public class StringJsonAdapterFactory implements C18097x {

    /* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory$a */
    public static class C47651a<T> extends C18095w<T> {

        /* renamed from: a */
        private final C17971f f120122a;

        /* renamed from: b */
        private final C17956a<T> f120123b;

        public final T read(C17958a aVar) throws IOException {
            switch (aVar.mo34843f()) {
                case NULL:
                    aVar.mo34847k();
                    return null;
                case STRING:
                    return this.f120122a.mo34885a(aVar.mo34845i(), this.f120123b.f49843c);
                default:
                    return this.f120122a.mo34880a(aVar, this.f120123b.f49843c);
            }
        }

        public C47651a(C17971f fVar, C17956a<T> aVar) {
            this.f120122a = fVar;
            this.f120123b = aVar;
        }

        public final void write(C17961c cVar, T t) throws IOException {
            cVar.mo34864b(this.f120122a.mo34889b(t));
        }
    }

    public <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        return new C47651a(fVar, aVar);
    }
}
