package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p916b.C13653k;
import com.facebook.p914c.p916b.C13656m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.facebook.imagepipeline.n.aw */
public final class C14155aw extends C14197o {

    /* renamed from: b */
    public final C13962e f36947b;

    /* renamed from: c */
    public final C13962e f36948c;

    /* renamed from: d */
    public final boolean f36949d;

    /* renamed from: e */
    public final int f36950e;

    /* renamed from: f */
    private final C13969f f36951f;

    /* renamed from: g */
    private final C14139am<C14044e> f36952g;

    /* renamed from: com.facebook.imagepipeline.n.aw$a */
    public class C14159a extends C14196n<C14044e, C14044e> {

        /* renamed from: a */
        public C14044e f36966a;

        /* renamed from: c */
        private final C13962e f36968c;

        /* renamed from: d */
        private final C13619c f36969d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            if (eVar != null && m29025a(i) && !(eVar instanceof C13656m)) {
                if (C14155aw.this.f36949d) {
                    int i2 = eVar.mo26272i();
                    if (i2 <= 0 || i2 >= C14155aw.this.f36950e) {
                        C14155aw.this.f36947b.mo26133a(this.f36969d, eVar);
                    } else {
                        C14155aw.this.f36948c.mo26133a(this.f36969d, eVar);
                    }
                } else {
                    this.f36968c.mo26133a(this.f36969d, eVar);
                }
            }
            this.f37059e.mo26404b(eVar, i);
        }

        private C14159a(C14188k<C14044e> kVar, C13962e eVar, C13619c cVar, C14044e eVar2) {
            super(kVar);
            this.f36968c = eVar;
            this.f36969d = cVar;
            this.f36966a = eVar2;
        }
    }

    /* renamed from: a */
    public static boolean m29003a(C0013i<?> iVar) {
        if (iVar.mo31c() || (iVar.mo33d() && (iVar.mo35f() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        boolean z;
        C13962e eVar;
        C0013i iVar;
        final C13962e eVar2;
        C13962e eVar3;
        C0013i iVar2;
        C14229b a = anVar.mo26384a();
        if (!a.mIsDiskCacheEnabled) {
            mo26394a(kVar, kVar, anVar);
            return;
        }
        anVar.mo26387c().onProducerStart(anVar.mo26386b(), "DiskCacheProducer");
        final C13619c c = this.f36951f.mo26147c(a, anVar.mo26388d());
        if (a.mCacheChoice == C14230a.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = this.f36948c;
        } else {
            eVar = this.f36947b;
        }
        final C13962e eVar4 = eVar;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (this.f36949d) {
            boolean c2 = this.f36948c.mo26134c(c);
            boolean c3 = this.f36947b.mo26134c(c);
            if (c2 || !c3) {
                eVar3 = this.f36948c;
                eVar2 = this.f36947b;
            } else {
                eVar3 = this.f36947b;
                eVar2 = this.f36948c;
            }
            if (eVar3 instanceof C13653k) {
                iVar2 = ((C13653k) eVar3).mo25529a(c, atomicBoolean, false);
            } else {
                iVar2 = eVar3.mo25528a(c, atomicBoolean);
            }
            iVar = iVar2.mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<C14044e, C0013i<C14044e>>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    if (C14155aw.m29003a(iVar) || (!iVar.mo33d() && iVar.mo34e() != null)) {
                        return iVar;
                    }
                    if (eVar2 instanceof C13653k) {
                        return ((C13653k) eVar2).mo25529a(c, atomicBoolean, false);
                    }
                    return eVar2.mo25528a(c, atomicBoolean);
                }
            });
        } else if (eVar4 instanceof C13653k) {
            iVar = ((C13653k) eVar4).mo25529a(c, atomicBoolean, false);
        } else {
            iVar = eVar4.mo25528a(c, atomicBoolean);
        }
        final String b = anVar.mo26386b();
        final C14142ap c4 = anVar.mo26387c();
        final C14188k<C14044e> kVar2 = kVar;
        final C14140an anVar2 = anVar;
        C141572 r3 = new C0011g<C14044e, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (C14155aw.m29003a(iVar)) {
                    c4.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                    kVar2.mo26402b();
                } else if (iVar.mo33d()) {
                    c4.onProducerFinishWithFailure(b, "DiskCacheProducer", iVar.mo35f(), null);
                    C14155aw awVar = C14155aw.this;
                    C14188k kVar = kVar2;
                    C14159a aVar = new C14159a(kVar2, eVar4, c, null);
                    awVar.mo26394a(kVar, aVar, anVar2);
                } else {
                    C14044e eVar = (C14044e) iVar.mo34e();
                    if (eVar == null || (eVar instanceof C13656m)) {
                        c4.onProducerFinishWithSuccess(b, "DiskCacheProducer", C14197o.m29121a(c4, b, false, eVar.mo26272i()));
                        C14155aw awVar2 = C14155aw.this;
                        C14188k kVar2 = kVar2;
                        C14159a aVar2 = new C14159a(kVar2, eVar4, c, eVar);
                        awVar2.mo26394a(kVar2, aVar2, anVar2);
                    } else {
                        c4.onProducerFinishWithSuccess(b, "DiskCacheProducer", C14197o.m29121a(c4, b, true, eVar.mo26272i()));
                        kVar2.mo26403b(1.0f);
                        kVar2.mo26404b(eVar, 1);
                        eVar.close();
                    }
                }
                return null;
            }
        };
        iVar.mo19a((C0011g<TResult, TContinuationResult>) r3);
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo26394a(C14188k<C14044e> kVar, C14188k<C14044e> kVar2, C14140an anVar) {
        if (anVar.mo26389e().getValue() >= C14231b.DISK_CACHE.getValue()) {
            kVar.mo26404b(null, 1);
        } else {
            this.f36952g.mo26346a(kVar2, anVar);
        }
    }
}
