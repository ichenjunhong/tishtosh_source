package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.imagepipeline.p975o.C14235e;
import com.facebook.p914c.p915a.C13619c;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.ak */
public final class C14129ak implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    private final C13986p<C13619c, C14042c> f36894a;

    /* renamed from: b */
    private final C13969f f36895b;

    /* renamed from: c */
    private final C14139am<C13715a<C14042c>> f36896c;

    /* renamed from: com.facebook.imagepipeline.n.ak$a */
    public static class C14130a extends C14196n<C13715a<C14042c>, C13715a<C14042c>> {

        /* renamed from: a */
        private final C13619c f36897a;

        /* renamed from: b */
        private final boolean f36898b;

        /* renamed from: c */
        private final C13986p<C13619c, C14042c> f36899c;

        /* renamed from: d */
        private final boolean f36900d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C13715a aVar = (C13715a) obj;
            C13715a aVar2 = null;
            if (aVar == null) {
                if (m29025a(i)) {
                    this.f37059e.mo26404b(aVar2, i);
                }
            } else if (!m29027b(i) || this.f36898b) {
                if (this.f36900d) {
                    aVar2 = this.f36899c.mo26160a(this.f36897a, aVar);
                }
                try {
                    this.f37059e.mo26403b(1.0f);
                    C14188k<O> kVar = this.f37059e;
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    kVar.mo26404b(aVar, i);
                } finally {
                    C13715a.m27752c(aVar2);
                }
            }
        }

        public C14130a(C14188k<C13715a<C14042c>> kVar, C13619c cVar, boolean z, C13986p<C13619c, C14042c> pVar, boolean z2) {
            super(kVar);
            this.f36897a = cVar;
            this.f36898b = z;
            this.f36899c = pVar;
            this.f36900d = z2;
        }
    }

    /* renamed from: a */
    private static String m28950a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C13715a<C14042c>> kVar, C14140an anVar) {
        C14142ap c = anVar.mo26387c();
        String b = anVar.mo26386b();
        C14229b a = anVar.mo26384a();
        Object d = anVar.mo26388d();
        C14234d dVar = a.mPostprocessor;
        if (dVar == null || dVar.getPostprocessorCacheKey() == null) {
            this.f36896c.mo26346a(kVar, anVar);
            return;
        }
        c.onProducerStart(b, m28950a());
        C13619c b2 = this.f36895b.mo26146b(a, d);
        C13715a a2 = this.f36894a.mo26159a(b2);
        Map map = null;
        if (a2 != null) {
            String a3 = m28950a();
            if (c.requiresExtraMap(b)) {
                map = C13683f.m27637of("cached_value_found", "true");
            }
            c.onProducerFinishWithSuccess(b, a3, map);
            c.onUltimateProducerReached(b, "PostprocessedBitmapMemoryCacheProducer", true);
            kVar.mo26403b(1.0f);
            kVar.mo26404b(a2, 1);
            a2.close();
            return;
        }
        C14188k<C13715a<C14042c>> kVar2 = kVar;
        C14130a aVar = new C14130a(kVar2, b2, dVar instanceof C14235e, this.f36894a, anVar.mo26384a().mIsMemoryCacheEnabled);
        String a4 = m28950a();
        if (c.requiresExtraMap(b)) {
            map = C13683f.m27637of("cached_value_found", "false");
        }
        c.onProducerFinishWithSuccess(b, a4, map);
        this.f36896c.mo26346a(aVar, anVar);
    }

    public C14129ak(C13986p<C13619c, C14042c> pVar, C13969f fVar, C14139am<C13715a<C14042c>> amVar) {
        this.f36894a = pVar;
        this.f36895b = fVar;
        this.f36896c = amVar;
    }
}
