package com.facebook.imagepipeline.p974n;

import com.C2240a;
import com.facebook.common.p920d.C13683f;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p955h.C13900c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.facebook.imagepipeline.n.aj */
public final class C14125aj implements C14139am<C14044e> {

    /* renamed from: a */
    private final C13962e f36876a;

    /* renamed from: b */
    private final C13969f f36877b;

    /* renamed from: c */
    private final C13711i f36878c;

    /* renamed from: d */
    private final C13702a f36879d;

    /* renamed from: e */
    private final C14139am<C14044e> f36880e;

    /* renamed from: com.facebook.imagepipeline.n.aj$a */
    static class C14128a extends C14196n<C14044e, C14044e> {

        /* renamed from: a */
        private final C13962e f36889a;

        /* renamed from: b */
        private final C13619c f36890b;

        /* renamed from: c */
        private final C13711i f36891c;

        /* renamed from: d */
        private final C13702a f36892d;

        /* renamed from: f */
        private final C14044e f36893f;

        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar;
            Throwable th;
            C14044e eVar2 = (C14044e) obj;
            if (!m29027b(i)) {
                if (this.f36893f == null || eVar2.f36709j == null) {
                    if (m29026a(i, 8) && m29025a(i) && eVar2.mo26267d() != C13900c.f36275a) {
                        this.f36889a.mo26133a(this.f36890b, eVar2);
                    }
                    this.f37059e.mo26404b(eVar2, i);
                } else {
                    try {
                        C14044e eVar3 = this.f36893f;
                        C13713k a = this.f36891c.mo25617a(eVar2.mo26272i() + eVar2.f36709j.f36383a);
                        m28948a(eVar3.mo26265c(), a, eVar2.f36709j.f36383a);
                        m28948a(eVar2.mo26265c(), a, eVar2.mo26272i());
                        C13715a a2 = C13715a.m27746a(a.mo25626a());
                        try {
                            eVar = new C14044e(a2);
                            try {
                                eVar.mo26273j();
                                this.f37059e.mo26404b(eVar, 1);
                                C14044e.m28705d(eVar);
                                C13715a.m27752c(a2);
                                eVar2.close();
                                this.f36893f.close();
                                this.f36889a.mo26138g(this.f36890b);
                            } catch (Throwable th2) {
                                th = th2;
                                C14044e.m28705d(eVar);
                                C13715a.m27752c(a2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            Throwable th4 = th3;
                            eVar = null;
                            th = th4;
                            C14044e.m28705d(eVar);
                            C13715a.m27752c(a2);
                            throw th;
                        }
                    } catch (IOException e) {
                        C13697a.m27696c("PartialDiskCacheProducer", "Error while merging image data", (Throwable) e);
                        this.f37059e.mo26405b((Throwable) e);
                    } catch (Throwable th5) {
                        eVar2.close();
                        this.f36893f.close();
                        throw th5;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m28948a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f36892d.mo25599a(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f36892d.mo25600a(bArr);
                    throw th;
                }
            }
            this.f36892d.mo25600a(bArr);
            if (i2 > 0) {
                throw new IOException(C2240a.m6773a(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        private C14128a(C14188k<C14044e> kVar, C13962e eVar, C13619c cVar, C13711i iVar, C13702a aVar, C14044e eVar2) {
            super(kVar);
            this.f36889a = eVar;
            this.f36890b = cVar;
            this.f36891c = iVar;
            this.f36892d = aVar;
            this.f36893f = eVar2;
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        C14229b a = anVar.mo26384a();
        if (!a.mIsDiskCacheEnabled) {
            this.f36880e.mo26346a(kVar, anVar);
            return;
        }
        anVar.mo26387c().onProducerStart(anVar.mo26386b(), "PartialDiskCacheProducer");
        final C13619c a2 = this.f36877b.mo26144a(a, a.mSourceUri.buildUpon().appendQueryParameter("fresco_partial", "true").build(), anVar.mo26388d());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C0013i a3 = this.f36876a.mo25528a(a2, atomicBoolean);
        final String b = anVar.mo26386b();
        final C14142ap c = anVar.mo26387c();
        final C14188k<C14044e> kVar2 = kVar;
        final C14140an anVar2 = anVar;
        C141261 r4 = new C0011g<C14044e, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4 = false;
                if (iVar.mo31c() || (iVar.mo33d() && (iVar.mo35f() instanceof CancellationException))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c.onProducerFinishWithCancellation(b, "PartialDiskCacheProducer", null);
                    kVar2.mo26402b();
                } else if (iVar.mo33d()) {
                    c.onProducerFinishWithFailure(b, "PartialDiskCacheProducer", iVar.mo35f(), null);
                    C14125aj.this.mo26375a(kVar2, anVar2, a2, (C14044e) null);
                } else {
                    C14044e eVar = (C14044e) iVar.mo34e();
                    if (eVar != null) {
                        c.onProducerFinishWithSuccess(b, "PartialDiskCacheProducer", C14125aj.m28944a(c, b, true, eVar.mo26272i()));
                        int i = eVar.mo26272i() - 1;
                        if (i > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C13689i.m27655a(z2);
                        C13949a aVar = new C13949a(0, i);
                        eVar.f36709j = aVar;
                        int i2 = eVar.mo26272i();
                        C14229b a = anVar2.mo26384a();
                        C13949a aVar2 = a.mBytesRange;
                        if (aVar2 == null || aVar.f36383a > aVar2.f36383a || aVar.f36384b < aVar2.f36384b) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            c.onUltimateProducerReached(b, "PartialDiskCacheProducer", true);
                            kVar2.mo26404b(eVar, 9);
                        } else {
                            kVar2.mo26404b(eVar, 8);
                            C14232c a2 = C14232c.m29170a(a);
                            int i3 = i2 - 1;
                            if (i3 >= 0) {
                                z4 = true;
                            }
                            C13689i.m27655a(z4);
                            C14125aj.this.mo26375a(kVar2, (C14140an) new C14151at(a2.mo26450a(new C13949a(i3, Integer.MAX_VALUE)).mo26449a(), anVar2), a2, eVar);
                        }
                    } else {
                        c.onProducerFinishWithSuccess(b, "PartialDiskCacheProducer", C14125aj.m28944a(c, b, false, 0));
                        C14125aj.this.mo26375a(kVar2, anVar2, a2, eVar);
                    }
                }
                return null;
            }
        };
        a3.mo19a((C0011g<TResult, TContinuationResult>) r4);
        anVar.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                atomicBoolean.set(true);
            }
        });
    }

    /* renamed from: a */
    public final void mo26375a(C14188k<C14044e> kVar, C14140an anVar, C13619c cVar, C14044e eVar) {
        C14128a aVar = new C14128a(kVar, this.f36876a, cVar, this.f36878c, this.f36879d, eVar);
        this.f36880e.mo26346a(aVar, anVar);
    }

    /* renamed from: a */
    static Map<String, String> m28944a(C14142ap apVar, String str, boolean z, int i) {
        if (!apVar.requiresExtraMap(str)) {
            return null;
        }
        if (z) {
            return C13683f.m27638of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C13683f.m27637of("cached_value_found", String.valueOf(z));
    }

    public C14125aj(C13962e eVar, C13969f fVar, C13711i iVar, C13702a aVar, C14139am<C14044e> amVar) {
        this.f36876a = eVar;
        this.f36877b = fVar;
        this.f36878c = iVar;
        this.f36879d = aVar;
        this.f36880e = amVar;
    }
}
