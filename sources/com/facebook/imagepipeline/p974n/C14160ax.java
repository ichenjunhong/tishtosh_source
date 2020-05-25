package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.imagepipeline.n.ax */
public final class C14160ax<T> implements C14139am<T> {

    /* renamed from: a */
    public final C14139am<T> f36970a;

    /* renamed from: b */
    public final C14163ay f36971b;

    public C14160ax(C14139am<T> amVar, C14163ay ayVar) {
        this.f36970a = (C14139am) C13689i.m27652a(amVar);
        this.f36971b = ayVar;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<T> kVar, C14140an anVar) {
        final C14142ap c = anVar.mo26387c();
        final String b = anVar.mo26386b();
        final C14188k<T> kVar2 = kVar;
        final C14140an anVar2 = anVar;
        final C141611 r0 = new C14152au<T>(kVar, c, "BackgroundThreadHandoffProducer", b) {
            /* renamed from: b */
            public final void mo25574b(T t) {
            }

            /* renamed from: c */
            public final T mo25575c() throws Exception {
                return null;
            }

            /* renamed from: a */
            public final void mo25572a(T t) {
                c.onProducerFinishWithSuccess(b, "BackgroundThreadHandoffProducer", null);
                C14160ax.this.f36970a.mo26346a(kVar2, anVar2);
            }
        };
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                r0.mo25570a();
                C14160ax.this.f36971b.mo26398b(r0);
            }
        });
        this.f36971b.mo26396a(r0);
    }
}
