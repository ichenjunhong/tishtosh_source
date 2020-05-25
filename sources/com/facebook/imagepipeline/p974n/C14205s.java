package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p964d.C13986p;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p914c.p915a.C13619c;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.s */
public final class C14205s implements C14139am<C14044e> {

    /* renamed from: a */
    private final C13986p<C13619c, C13709h> f37080a;

    /* renamed from: b */
    private final C13969f f37081b;

    /* renamed from: c */
    private final C14139am<C14044e> f37082c;

    /* renamed from: com.facebook.imagepipeline.n.s$a */
    static class C14206a extends C14196n<C14044e, C14044e> {

        /* renamed from: a */
        private final C13986p<C13619c, C13709h> f37083a;

        /* renamed from: b */
        private final C13619c f37084b;

        /* renamed from: c */
        private final boolean f37085c;

        /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x0081=Splitter:B:51:0x0081, B:20:0x0039=Splitter:B:20:0x0039} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo26241a(java.lang.Object r4, int r5) {
            /*
                r3 = this;
                com.facebook.imagepipeline.j.e r4 = (com.facebook.imagepipeline.p970j.C14044e) r4
                boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x000d
                java.lang.String r0 = "EncodedMemoryCacheProducer#onNewResultImpl"
                com.facebook.imagepipeline.p976p.C14237b.m29186a(r0)     // Catch:{ all -> 0x0090 }
            L_0x000d:
                boolean r0 = m29027b(r5)     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x0081
                if (r4 == 0) goto L_0x0081
                r0 = 10
                boolean r0 = m29028b(r5, r0)     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x0081
                com.facebook.h.c r0 = r4.mo26267d()     // Catch:{ all -> 0x0090 }
                com.facebook.h.c r1 = com.facebook.p955h.C13900c.f36275a     // Catch:{ all -> 0x0090 }
                if (r0 != r1) goto L_0x0026
                goto L_0x0081
            L_0x0026:
                com.facebook.common.h.a r0 = r4.mo26263b()     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x0071
                r1 = 0
                boolean r2 = r3.f37085c     // Catch:{ all -> 0x006c }
                if (r2 == 0) goto L_0x0039
                com.facebook.imagepipeline.d.p<com.facebook.c.a.c, com.facebook.common.g.h> r1 = r3.f37083a     // Catch:{ all -> 0x006c }
                com.facebook.c.a.c r2 = r3.f37084b     // Catch:{ all -> 0x006c }
                com.facebook.common.h.a r1 = r1.mo26160a(r2, r0)     // Catch:{ all -> 0x006c }
            L_0x0039:
                com.facebook.common.p924h.C13715a.m27752c(r0)     // Catch:{ all -> 0x0090 }
                if (r1 == 0) goto L_0x0071
                com.facebook.imagepipeline.j.e r0 = new com.facebook.imagepipeline.j.e     // Catch:{ all -> 0x0067 }
                r0.<init>(r1)     // Catch:{ all -> 0x0067 }
                r0.mo26264b(r4)     // Catch:{ all -> 0x0067 }
                com.facebook.common.p924h.C13715a.m27752c(r1)     // Catch:{ all -> 0x0090 }
                com.facebook.imagepipeline.n.k<O> r4 = r3.f37059e     // Catch:{ all -> 0x0062 }
                r1 = 1065353216(0x3f800000, float:1.0)
                r4.mo26403b(r1)     // Catch:{ all -> 0x0062 }
                com.facebook.imagepipeline.n.k<O> r4 = r3.f37059e     // Catch:{ all -> 0x0062 }
                r4.mo26404b(r0, r5)     // Catch:{ all -> 0x0062 }
                com.facebook.imagepipeline.p970j.C14044e.m28705d(r0)     // Catch:{ all -> 0x0090 }
                boolean r4 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                if (r4 == 0) goto L_0x0061
                com.facebook.imagepipeline.p976p.C14237b.m29185a()
            L_0x0061:
                return
            L_0x0062:
                r4 = move-exception
                com.facebook.imagepipeline.p970j.C14044e.m28705d(r0)     // Catch:{ all -> 0x0090 }
                throw r4     // Catch:{ all -> 0x0090 }
            L_0x0067:
                r4 = move-exception
                com.facebook.common.p924h.C13715a.m27752c(r1)     // Catch:{ all -> 0x0090 }
                throw r4     // Catch:{ all -> 0x0090 }
            L_0x006c:
                r4 = move-exception
                com.facebook.common.p924h.C13715a.m27752c(r0)     // Catch:{ all -> 0x0090 }
                throw r4     // Catch:{ all -> 0x0090 }
            L_0x0071:
                com.facebook.imagepipeline.n.k<O> r0 = r3.f37059e     // Catch:{ all -> 0x0090 }
                r0.mo26404b(r4, r5)     // Catch:{ all -> 0x0090 }
                boolean r4 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                if (r4 == 0) goto L_0x0080
                com.facebook.imagepipeline.p976p.C14237b.m29185a()
                return
            L_0x0080:
                return
            L_0x0081:
                com.facebook.imagepipeline.n.k<O> r0 = r3.f37059e     // Catch:{ all -> 0x0090 }
                r0.mo26404b(r4, r5)     // Catch:{ all -> 0x0090 }
                boolean r4 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                if (r4 == 0) goto L_0x008f
                com.facebook.imagepipeline.p976p.C14237b.m29185a()
            L_0x008f:
                return
            L_0x0090:
                r4 = move-exception
                boolean r5 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
                if (r5 == 0) goto L_0x009a
                com.facebook.imagepipeline.p976p.C14237b.m29185a()
            L_0x009a:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14205s.C14206a.mo26241a(java.lang.Object, int):void");
        }

        public C14206a(C14188k<C14044e> kVar, C13986p<C13619c, C13709h> pVar, C13619c cVar, boolean z) {
            super(kVar);
            this.f37083a = pVar;
            this.f37084b = cVar;
            this.f37085c = z;
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        Map map;
        C14044e eVar;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("EncodedMemoryCacheProducer#produceResults");
            }
            String b = anVar.mo26386b();
            C14142ap c = anVar.mo26387c();
            c.onProducerStart(b, "EncodedMemoryCacheProducer");
            C13619c c2 = this.f37081b.mo26147c(anVar.mo26384a(), anVar.mo26388d());
            C13715a a = this.f37080a.mo26159a(c2);
            Map map2 = null;
            if (a != null) {
                try {
                    eVar = new C14044e(a);
                    String str = "EncodedMemoryCacheProducer";
                    if (c.requiresExtraMap(b)) {
                        map2 = C13683f.m27637of("cached_value_found", "true");
                    }
                    c.onProducerFinishWithSuccess(b, str, map2);
                    c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", true);
                    kVar.mo26403b(1.0f);
                    kVar.mo26404b(eVar, 1);
                    C14044e.m28705d(eVar);
                    C13715a.m27752c(a);
                } catch (Throwable th) {
                    C13715a.m27752c(a);
                    throw th;
                }
            } else if (anVar.mo26389e().getValue() >= C14231b.ENCODED_MEMORY_CACHE.getValue()) {
                String str2 = "EncodedMemoryCacheProducer";
                if (c.requiresExtraMap(b)) {
                    map = C13683f.m27637of("cached_value_found", "false");
                } else {
                    map = null;
                }
                c.onProducerFinishWithSuccess(b, str2, map);
                c.onUltimateProducerReached(b, "EncodedMemoryCacheProducer", false);
                kVar.mo26404b(null, 1);
                C13715a.m27752c(a);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            } else {
                C14206a aVar = new C14206a(kVar, this.f37080a, c2, anVar.mo26384a().mIsMemoryCacheEnabled);
                String str3 = "EncodedMemoryCacheProducer";
                if (c.requiresExtraMap(b)) {
                    map2 = C13683f.m27637of("cached_value_found", "false");
                }
                c.onProducerFinishWithSuccess(b, str3, map2);
                this.f37082c.mo26346a(aVar, anVar);
                C13715a.m27752c(a);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    public C14205s(C13986p<C13619c, C13709h> pVar, C13969f fVar, C14139am<C14044e> amVar) {
        this.f37080a = pVar;
        this.f37081b = fVar;
        this.f37082c = amVar;
    }
}
