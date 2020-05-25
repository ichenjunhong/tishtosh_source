package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory */
public final class FilterEffectTypeAdapterFactory implements C18097x {

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory$a */
    public static final class C31571a extends C18095w<T> {

        /* renamed from: a */
        final /* synthetic */ C18095w f82558a;

        C31571a(C18095w wVar) {
            this.f82558a = wVar;
        }

        public final T read(C17958a aVar) {
            return this.f82558a.read(aVar);
        }

        public final void write(C17961c cVar, T t) {
            C18095w wVar = this.f82558a;
            if (t != null) {
                wVar.write(cVar, (FilterEffect) t);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
        }
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        C52711k.m112240b(fVar, "gson");
        C52711k.m112240b(aVar, "type");
        if (!C52711k.m112239a((Object) aVar.f49842b, (Object) Effect.class)) {
            return null;
        }
        return new C31571a<>(fVar.mo34878a((C18097x) this, C17956a.m44006a(FilterEffect.class)));
    }
}
