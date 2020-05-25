package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14047h;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p914c.p915a.C13619c;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.h */
public class C14181h implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    public final C13986p<C13619c, C14042c> f37015a;

    /* renamed from: b */
    private final C13969f f37016b;

    /* renamed from: c */
    private final C14139am<C13715a<C14042c>> f37017c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26412a() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C13715a<C14042c>> kVar, C14140an anVar) {
        Map map;
        Map map2;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("BitmapMemoryCacheProducer#produceResults");
            }
            C14142ap c = anVar.mo26387c();
            String b = anVar.mo26386b();
            c.onProducerStart(b, mo26412a());
            C13619c a = this.f37016b.mo26145a(anVar.mo26384a(), anVar.mo26388d());
            C13715a a2 = this.f37015a.mo26159a(a);
            Map map3 = null;
            if (a2 != null) {
                boolean c2 = ((C14042c) a2.mo25630a()).mo26258e().mo26276c();
                if (c2) {
                    String a3 = mo26412a();
                    if (c.requiresExtraMap(b)) {
                        map2 = C13683f.m27637of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    c.onProducerFinishWithSuccess(b, a3, map2);
                    c.onUltimateProducerReached(b, mo26412a(), true);
                    kVar.mo26403b(1.0f);
                }
                kVar.mo26404b(a2, c2 ? 1 : 0);
                a2.close();
                if (c2) {
                    return;
                }
            }
            if (anVar.mo26389e().getValue() >= C14231b.BITMAP_MEMORY_CACHE.getValue()) {
                String a4 = mo26412a();
                if (c.requiresExtraMap(b)) {
                    map = C13683f.m27637of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, a4, map);
                c.onUltimateProducerReached(b, mo26412a(), false);
                kVar.mo26404b(null, 1);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return;
            }
            C14188k a5 = mo26411a(kVar, a, anVar.mo26384a().mIsMemoryCacheEnabled);
            String a6 = mo26412a();
            if (c.requiresExtraMap(b)) {
                map3 = C13683f.m27637of("cached_value_found", "false");
            }
            c.onProducerFinishWithSuccess(b, a6, map3);
            if (C14237b.m29187b()) {
                C14237b.m29186a("mInputProducer.produceResult");
            }
            this.f37017c.mo26346a(a5, anVar);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14188k<C13715a<C14042c>> mo26411a(C14188k<C13715a<C14042c>> kVar, final C13619c cVar, final boolean z) {
        return new C14196n<C13715a<C14042c>, C13715a<C14042c>>(kVar) {
            /* renamed from: a */
            public final /* synthetic */ void mo26241a(Object obj, int i) {
                C13715a aVar;
                C13715a a;
                C13715a aVar2 = (C13715a) obj;
                try {
                    if (C14237b.m29187b()) {
                        C14237b.m29186a("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean a2 = m29025a(i);
                    aVar = null;
                    if (aVar2 == null) {
                        if (a2) {
                            this.f37059e.mo26404b(null, i);
                        }
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                        return;
                    }
                    if (!((C14042c) aVar2.mo25630a()).mo26252c()) {
                        if (!m29026a(i, 8)) {
                            if (!a2) {
                                a = C14181h.this.f37015a.mo26159a(cVar);
                                if (a != null) {
                                    C14047h e = ((C14042c) aVar2.mo25630a()).mo26258e();
                                    C14047h e2 = ((C14042c) a.mo25630a()).mo26258e();
                                    if (e2.mo26276c() || e2.mo26274a() >= e.mo26274a()) {
                                        this.f37059e.mo26404b(a, i);
                                        C13715a.m27752c(a);
                                        if (C14237b.m29187b()) {
                                            C14237b.m29185a();
                                        }
                                        return;
                                    }
                                    C13715a.m27752c(a);
                                }
                            }
                            if (z) {
                                aVar = C14181h.this.f37015a.mo26160a(cVar, aVar2);
                            }
                            if (a2) {
                                this.f37059e.mo26403b(1.0f);
                            }
                            C14188k<O> kVar = this.f37059e;
                            if (aVar != null) {
                                aVar2 = aVar;
                            }
                            kVar.mo26404b(aVar2, i);
                            C13715a.m27752c(aVar);
                            if (C14237b.m29187b()) {
                                C14237b.m29185a();
                                return;
                            }
                            return;
                        }
                    }
                    this.f37059e.mo26404b(aVar2, i);
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                } catch (Throwable th) {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    throw th;
                }
            }
        };
    }

    public C14181h(C13986p<C13619c, C14042c> pVar, C13969f fVar, C14139am<C13715a<C14042c>> amVar) {
        this.f37015a = pVar;
        this.f37016b = fVar;
        this.f37017c = amVar;
    }
}
