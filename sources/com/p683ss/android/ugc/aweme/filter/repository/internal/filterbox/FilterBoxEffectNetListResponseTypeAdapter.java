package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter */
public final class FilterBoxEffectNetListResponseTypeAdapter implements C18097x {

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter$a */
    public static final class C31570a extends C18095w<T> {

        /* renamed from: a */
        final /* synthetic */ C18095w f82557a;

        C31570a(C18095w wVar) {
            this.f82557a = wVar;
        }

        public final T read(C17958a aVar) {
            return this.f82557a.read(aVar);
        }

        public final void write(C17961c cVar, T t) {
            C18095w wVar = this.f82557a;
            if (t != null) {
                wVar.write(cVar, (C31588h) t);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponse2");
        }
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        C52711k.m112240b(aVar, "type");
        if (!C52711k.m112239a((Object) aVar.f49842b, (Object) C31587g.class)) {
            return null;
        }
        return new C31570a<>(new C17978g().mo34894a((C18097x) new FilterEffectTypeAdapterFactory()).mo34900d().mo34879a(C31588h.class));
    }
}
