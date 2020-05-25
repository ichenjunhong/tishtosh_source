package com.p683ss.android.ugc.network.observer.p2491b;

import java.util.concurrent.TimeUnit;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.network.observer.b.b */
public final class C50090b {

    /* renamed from: a */
    public C1690c f125462a;

    /* renamed from: com.ss.android.ugc.network.observer.b.b$a */
    public static final class C50091a implements C1674ab<Long> {

        /* renamed from: a */
        final /* synthetic */ C50090b f125463a;

        /* renamed from: b */
        final /* synthetic */ C52671b f125464b;

        public final void onComplete() {
            this.f125463a.mo97854a();
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f125463a.mo97854a();
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.f125464b.invoke(Long.valueOf(((Number) obj).longValue()));
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "disposable");
            this.f125463a.f125462a = cVar;
        }

        C50091a(C50090b bVar, C52671b bVar2) {
            this.f125463a = bVar;
            this.f125464b = bVar2;
        }
    }

    /* renamed from: a */
    public final void mo97854a() {
        if (this.f125462a != null) {
            C1690c cVar = this.f125462a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (!cVar.isDisposed()) {
                C1690c cVar2 = this.f125462a;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                cVar2.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo97855a(long j, C52671b<? super Long, C52860x> bVar) {
        C52711k.m112240b(bVar, "rxAction");
        C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6314a((C1674ab<? super T>) new C50091a<Object>(this, bVar));
    }
}
