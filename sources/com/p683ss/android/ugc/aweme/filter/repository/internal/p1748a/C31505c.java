package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.bytedance.jedi.p725a.p738h.C11680e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.c */
public final class C31505c extends C11680e<C31502a> implements C31592h {

    /* renamed from: a */
    private final C31592h f82421a;

    /* renamed from: b */
    private final C31592h f82422b;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.c$a */
    static final class C31506a<T, R> implements C1711f<Throwable, C2206z<? extends C31502a>> {

        /* renamed from: a */
        public static final C31506a f82423a = new C31506a();

        C31506a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "<anonymous parameter 0>");
            return C2201v.m6614b(new C31502a(C31483a.m73315a(), true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.c$b */
    static final class C31507b<T, R> implements C1711f<Throwable, C2206z<? extends C31502a>> {

        /* renamed from: a */
        public static final C31507b f82424a = new C31507b();

        C31507b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "<anonymous parameter 0>");
            return C2201v.m6610b();
        }
    }

    /* renamed from: b */
    public final C2201v<C31502a> mo22471b() {
        C2201v<C31502a> a = C2201v.m6608a((C2206z<? extends T>[]) new C2206z[]{this.f82421a.mo22470a().mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) C31506a.f82423a), this.f82422b.mo22470a().mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) C31507b.f82424a)});
        C52711k.m112236a((Object) a, "Observable.concatArray(\n…()\n                    })");
        return a;
    }

    public C31505c(C31592h hVar, C31592h hVar2) {
        C52711k.m112240b(hVar, "localFetcher");
        C52711k.m112240b(hVar2, "remoteFetcher");
        this.f82421a = hVar;
        this.f82422b = hVar2;
    }
}
