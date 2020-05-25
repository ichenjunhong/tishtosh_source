package com.p683ss.android.ugc.aweme.profile;

import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.d */
public final class C39830d {

    /* renamed from: com.ss.android.ugc.aweme.profile.d$a */
    static final class C39831a extends C52712l implements C52671b<T, R> {

        /* renamed from: a */
        final /* synthetic */ C52671b f101640a;

        C39831a(C52671b bVar) {
            this.f101640a = bVar;
            super(1);
        }

        public final R invoke(T t) {
            return this.f101640a.invoke(t);
        }
    }

    /* renamed from: a */
    public static final <T> T m88579a(T t) {
        return t;
    }

    /* renamed from: a */
    public static final <T, R> C52671b<T, R> m88578a(C52671b<? super T, ? extends R> bVar) {
        C52711k.m112240b(bVar, "f");
        return new C39831a<>(bVar);
    }
}
