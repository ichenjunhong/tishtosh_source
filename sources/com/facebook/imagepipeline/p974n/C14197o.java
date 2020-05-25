package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.p914c.p915a.C13619c;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.facebook.imagepipeline.n.o */
public class C14197o implements C14139am<C14044e> {

    /* renamed from: a */
    public final C14139am<C14044e> f37060a;

    /* renamed from: b */
    private final C13962e f37061b;

    /* renamed from: c */
    private final C13962e f37062c;

    /* renamed from: d */
    private final C13969f f37063d;

    /* renamed from: a */
    public void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        C13962e eVar;
        C14229b a = anVar.mo26384a();
        boolean z = true;
        if (a.mIsDiskCacheEnabled) {
            anVar.mo26387c().onProducerStart(anVar.mo26386b(), "DiskCacheProducer");
            C13619c c = this.f37063d.mo26147c(a, anVar.mo26388d());
            if (a.mCacheChoice != C14230a.SMALL) {
                z = false;
            }
            if (z) {
                eVar = this.f37062c;
            } else {
                eVar = this.f37061b;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C0013i a2 = eVar.mo25528a(c, atomicBoolean);
            final String b = anVar.mo26386b();
            final C14142ap c2 = anVar.mo26387c();
            final C14188k<C14044e> kVar2 = kVar;
            final C14140an anVar2 = anVar;
            C141981 r3 = new C0011g<C14044e, Void>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    boolean z;
                    if (iVar.mo31c() || (iVar.mo33d() && (iVar.mo35f() instanceof CancellationException))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c2.onProducerFinishWithCancellation(b, "DiskCacheProducer", null);
                        kVar2.mo26402b();
                    } else if (iVar.mo33d()) {
                        c2.onProducerFinishWithFailure(b, "DiskCacheProducer", iVar.mo35f(), null);
                        C14197o.this.f37060a.mo26346a(kVar2, anVar2);
                    } else {
                        C14044e eVar = (C14044e) iVar.mo34e();
                        if (eVar != null) {
                            c2.onProducerFinishWithSuccess(b, "DiskCacheProducer", C14197o.m29121a(c2, b, true, eVar.mo26272i()));
                            c2.onUltimateProducerReached(b, "DiskCacheProducer", true);
                            kVar2.mo26403b(1.0f);
                            kVar2.mo26404b(eVar, 1);
                            eVar.close();
                        } else {
                            c2.onProducerFinishWithSuccess(b, "DiskCacheProducer", C14197o.m29121a(c2, b, false, 0));
                            C14197o.this.f37060a.mo26346a(kVar2, anVar2);
                        }
                    }
                    return null;
                }
            };
            a2.mo19a((C0011g<TResult, TContinuationResult>) r3);
            anVar.mo26385a(new C14178e() {
                /* renamed from: a */
                public final void mo23173a() {
                    atomicBoolean.set(true);
                }
            });
        } else if (anVar.mo26389e().getValue() >= C14231b.DISK_CACHE.getValue()) {
            kVar.mo26404b(null, 1);
        } else {
            this.f37060a.mo26346a(kVar, anVar);
        }
    }

    public C14197o(C13962e eVar, C13962e eVar2, C13969f fVar, C14139am<C14044e> amVar) {
        this.f37061b = eVar;
        this.f37062c = eVar2;
        this.f37063d = fVar;
        this.f37060a = amVar;
    }

    /* renamed from: a */
    static Map<String, String> m29121a(C14142ap apVar, String str, boolean z, int i) {
        if (!apVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return C13683f.m27638of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13683f.m27637of("cached_value_found", String.valueOf(z));
    }
}
