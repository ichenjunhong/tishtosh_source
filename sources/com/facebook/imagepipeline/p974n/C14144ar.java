package com.facebook.imagepipeline.p974n;

import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.n.ar */
public final class C14144ar implements C14139am<C13715a<C13709h>> {

    /* renamed from: a */
    private final C14139am<C14044e> f36923a;

    /* renamed from: com.facebook.imagepipeline.n.ar$a */
    class C14146a extends C14196n<C14044e, C13715a<C13709h>> {
        private C14146a(C14188k<C13715a<C13709h>> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            C13715a aVar = null;
            try {
                if (C14044e.m28706e(eVar)) {
                    aVar = eVar.mo26263b();
                }
                this.f37059e.mo26404b(aVar, i);
            } finally {
                C13715a.m27752c(aVar);
            }
        }
    }

    public C14144ar(C14139am<C14044e> amVar) {
        this.f36923a = amVar;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C13715a<C13709h>> kVar, C14140an anVar) {
        this.f36923a.mo26346a(new C14146a(kVar), anVar);
    }
}
