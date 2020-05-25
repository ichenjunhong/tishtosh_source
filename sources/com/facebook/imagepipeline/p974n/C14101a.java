package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.n.a */
public final class C14101a implements C14139am<C14044e> {

    /* renamed from: a */
    private final C14139am<C14044e> f36827a;

    /* renamed from: com.facebook.imagepipeline.n.a$a */
    static class C14103a extends C14196n<C14044e, C14044e> {
        private C14103a(C14188k<C14044e> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            if (eVar == null) {
                this.f37059e.mo26404b(null, i);
                return;
            }
            if (!C14044e.m28704c(eVar)) {
                eVar.mo26273j();
            }
            this.f37059e.mo26404b(eVar, i);
        }
    }

    public C14101a(C14139am<C14044e> amVar) {
        this.f36827a = amVar;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        this.f36827a.mo26346a(new C14103a(kVar), anVar);
    }
}
