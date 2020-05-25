package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p955h.C13900c;

/* renamed from: com.facebook.imagepipeline.n.p */
public final class C14200p implements C14139am<C14044e> {

    /* renamed from: a */
    private final C13962e f37071a;

    /* renamed from: b */
    private final C13962e f37072b;

    /* renamed from: c */
    private final C13969f f37073c;

    /* renamed from: d */
    private final C14139am<C14044e> f37074d;

    /* renamed from: com.facebook.imagepipeline.n.p$a */
    static class C14202a extends C14196n<C14044e, C14044e> {

        /* renamed from: a */
        private final C14140an f37075a;

        /* renamed from: b */
        private final C13962e f37076b;

        /* renamed from: c */
        private final C13962e f37077c;

        /* renamed from: d */
        private final C13969f f37078d;

        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            if (m29027b(i) || eVar == null || m29028b(i, 10) || eVar.mo26267d() == C13900c.f36275a) {
                this.f37059e.mo26404b(eVar, i);
                return;
            }
            C14229b a = this.f37075a.mo26384a();
            C13619c c = this.f37078d.mo26147c(a, this.f37075a.mo26388d());
            if (a.mCacheChoice == C14230a.SMALL) {
                this.f37077c.mo26133a(c, eVar);
            } else {
                this.f37076b.mo26133a(c, eVar);
            }
            this.f37059e.mo26404b(eVar, i);
        }

        private C14202a(C14188k<C14044e> kVar, C14140an anVar, C13962e eVar, C13962e eVar2, C13969f fVar) {
            super(kVar);
            this.f37075a = anVar;
            this.f37076b = eVar;
            this.f37077c = eVar2;
            this.f37078d = fVar;
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.facebook.imagepipeline.n.k] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26346a(com.facebook.imagepipeline.p974n.C14188k<com.facebook.imagepipeline.p970j.C14044e> r9, com.facebook.imagepipeline.p974n.C14140an r10) {
        /*
            r8 = this;
            com.facebook.imagepipeline.o.b$b r0 = r10.mo26389e()
            int r0 = r0.getValue()
            com.facebook.imagepipeline.o.b$b r1 = com.facebook.imagepipeline.p975o.C14229b.C14231b.DISK_CACHE
            int r1 = r1.getValue()
            if (r0 < r1) goto L_0x0016
            r10 = 0
            r0 = 1
            r9.mo26404b(r10, r0)
            return
        L_0x0016:
            com.facebook.imagepipeline.o.b r0 = r10.mo26384a()
            boolean r0 = r0.mIsDiskCacheEnabled
            if (r0 == 0) goto L_0x002e
            com.facebook.imagepipeline.n.p$a r0 = new com.facebook.imagepipeline.n.p$a
            com.facebook.imagepipeline.d.e r4 = r8.f37071a
            com.facebook.imagepipeline.d.e r5 = r8.f37072b
            com.facebook.imagepipeline.d.f r6 = r8.f37073c
            r7 = 0
            r1 = r0
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r0
        L_0x002e:
            com.facebook.imagepipeline.n.am<com.facebook.imagepipeline.j.e> r0 = r8.f37074d
            r0.mo26346a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14200p.mo26346a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.an):void");
    }

    public C14200p(C13962e eVar, C13962e eVar2, C13969f fVar, C14139am<C14044e> amVar) {
        this.f37071a = eVar;
        this.f37072b = eVar2;
        this.f37073c = fVar;
        this.f37074d = amVar;
    }
}
