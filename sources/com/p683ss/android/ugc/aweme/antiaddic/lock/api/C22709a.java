package com.p683ss.android.ugc.aweme.antiaddic.lock.api;

import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52635g;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.a */
public final class C22709a {

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.a$a */
    public static final class C22710a implements C17824h<T> {

        /* renamed from: a */
        final /* synthetic */ C52625c f60913a;

        C22710a(C52625c cVar) {
            this.f60913a = cVar;
        }

        public final void onSuccess(T t) {
            if (t != null) {
                this.f60913a.resumeWith(C52848o.m114620constructorimpl(t));
            }
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            this.f60913a.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
        }
    }

    /* renamed from: a */
    public static final <T> Object m55931a(C17832m<T> mVar, C52625c<? super T> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C17825i.m43739a(mVar, new C22710a(gVar));
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }
}
