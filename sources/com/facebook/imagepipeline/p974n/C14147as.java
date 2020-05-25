package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14212w.C14216a;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p977q.C14242a;
import com.facebook.imagepipeline.p977q.C14243b;
import com.facebook.imagepipeline.p977q.C14244c;
import com.facebook.p955h.C13899b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.as */
public final class C14147as implements C14139am<C14044e> {

    /* renamed from: a */
    public final Executor f36925a;

    /* renamed from: b */
    public final C13711i f36926b;

    /* renamed from: c */
    private final C14139am<C14044e> f36927c;

    /* renamed from: d */
    private final boolean f36928d;

    /* renamed from: e */
    private final C14244c f36929e;

    /* renamed from: com.facebook.imagepipeline.n.as$a */
    class C14148a extends C14196n<C14044e, C14044e> {

        /* renamed from: a */
        public final boolean f36930a;

        /* renamed from: b */
        public final C14244c f36931b;

        /* renamed from: c */
        public final C14140an f36932c;

        /* renamed from: d */
        public boolean f36933d;

        /* renamed from: f */
        public final C14212w f36934f;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
            if (r5 != false) goto L_0x0072;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo26241a(java.lang.Object r8, int r9) {
            /*
                r7 = this;
                com.facebook.imagepipeline.j.e r8 = (com.facebook.imagepipeline.p970j.C14044e) r8
                boolean r0 = r7.f36933d
                if (r0 != 0) goto L_0x00d4
                boolean r0 = m29025a(r9)
                r1 = 1
                if (r8 != 0) goto L_0x0016
                if (r0 == 0) goto L_0x0015
                com.facebook.imagepipeline.n.k<O> r8 = r7.f37059e
                r9 = 0
                r8.mo26404b(r9, r1)
            L_0x0015:
                return
            L_0x0016:
                com.facebook.imagepipeline.n.an r2 = r7.f36932c
                com.facebook.imagepipeline.o.b r2 = r2.mo26384a()
                com.facebook.imagepipeline.q.c r3 = r7.f36931b
                com.facebook.h.c r4 = r8.mo26267d()
                boolean r5 = r7.f36930a
                com.facebook.imagepipeline.q.b r3 = r3.mo26440a(r4, r5)
                java.lang.Object r3 = com.facebook.common.p920d.C13689i.m27652a(r3)
                com.facebook.imagepipeline.q.b r3 = (com.facebook.imagepipeline.p977q.C14243b) r3
                r4 = 0
                if (r8 == 0) goto L_0x0088
                com.facebook.h.c r5 = r8.mo26267d()
                com.facebook.h.c r6 = com.facebook.p955h.C13900c.f36275a
                if (r5 != r6) goto L_0x003a
                goto L_0x0088
            L_0x003a:
                com.facebook.h.c r5 = r8.mo26267d()
                boolean r5 = r3.canTranscode(r5)
                if (r5 != 0) goto L_0x0047
                com.facebook.common.k.e r1 = com.facebook.common.p927k.C13729e.NO
                goto L_0x008a
            L_0x0047:
                com.facebook.imagepipeline.common.e r5 = r2.mRotationOptions
                boolean r6 = r5.f36405a
                if (r6 != 0) goto L_0x0074
                int r6 = com.facebook.imagepipeline.p977q.C14245d.m29193a(r5, r8)
                if (r6 != 0) goto L_0x0072
                boolean r6 = r5.mo26126e()
                if (r6 == 0) goto L_0x006d
                boolean r5 = r5.f36405a
                if (r5 == 0) goto L_0x005e
                goto L_0x006d
            L_0x005e:
                com.facebook.common.d.e<java.lang.Integer> r5 = com.facebook.imagepipeline.p977q.C14245d.f37148a
                int r6 = r8.mo26269f()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r5 = r5.contains(r6)
                goto L_0x0070
            L_0x006d:
                r8.f36704e = r4
                r5 = 0
            L_0x0070:
                if (r5 == 0) goto L_0x0074
            L_0x0072:
                r5 = 1
                goto L_0x0075
            L_0x0074:
                r5 = 0
            L_0x0075:
                if (r5 != 0) goto L_0x0083
                com.facebook.imagepipeline.common.e r5 = r2.mRotationOptions
                com.facebook.imagepipeline.common.d r2 = r2.mResizeOptions
                boolean r2 = r3.canResize(r8, r5, r2)
                if (r2 == 0) goto L_0x0082
                goto L_0x0083
            L_0x0082:
                r1 = 0
            L_0x0083:
                com.facebook.common.k.e r1 = com.facebook.common.p927k.C13729e.valueOf(r1)
                goto L_0x008a
            L_0x0088:
                com.facebook.common.k.e r1 = com.facebook.common.p927k.C13729e.UNSET
            L_0x008a:
                if (r0 != 0) goto L_0x0090
                com.facebook.common.k.e r2 = com.facebook.common.p927k.C13729e.UNSET
                if (r1 == r2) goto L_0x00d4
            L_0x0090:
                com.facebook.common.k.e r2 = com.facebook.common.p927k.C13729e.YES
                if (r1 == r2) goto L_0x00bd
                com.facebook.imagepipeline.n.an r0 = r7.f36932c
                com.facebook.imagepipeline.o.b r0 = r0.mo26384a()
                com.facebook.imagepipeline.common.e r0 = r0.mRotationOptions
                boolean r0 = r0.f36405a
                if (r0 != 0) goto L_0x00b7
                int r0 = r8.mo26268e()
                if (r0 == 0) goto L_0x00b7
                int r0 = r8.mo26268e()
                r1 = -1
                if (r0 == r1) goto L_0x00b7
                com.facebook.imagepipeline.j.e r0 = com.facebook.imagepipeline.p970j.C14044e.m28703a(r8)
                r8.close()
                r0.f36703d = r4
                r8 = r0
            L_0x00b7:
                com.facebook.imagepipeline.n.k<O> r0 = r7.f37059e
                r0.mo26404b(r8, r9)
                return
            L_0x00bd:
                com.facebook.imagepipeline.n.w r1 = r7.f36934f
                boolean r8 = r1.mo26425a(r8, r9)
                if (r8 == 0) goto L_0x00d4
                if (r0 != 0) goto L_0x00cf
                com.facebook.imagepipeline.n.an r8 = r7.f36932c
                boolean r8 = r8.mo26392h()
                if (r8 == 0) goto L_0x00d4
            L_0x00cf:
                com.facebook.imagepipeline.n.w r8 = r7.f36934f
                r8.mo26426b()
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14147as.C14148a.mo26241a(java.lang.Object, int):void");
        }

        C14148a(final C14188k<C14044e> kVar, C14140an anVar, boolean z, C14244c cVar) {
            super(kVar);
            this.f36932c = anVar;
            this.f36930a = z;
            this.f36931b = cVar;
            this.f36934f = new C14212w(C14147as.this.f36925a, new C14216a(C14147as.this) {
                /* renamed from: a */
                public final void mo26393a(C14044e eVar, int i) {
                    C14044e eVar2;
                    String str;
                    C14148a aVar = C14148a.this;
                    C14243b bVar = (C14243b) C13689i.m27652a(C14148a.this.f36931b.mo26440a(eVar.mo26267d(), C14148a.this.f36930a));
                    aVar.f36932c.mo26387c().onProducerStart(aVar.f36932c.mo26386b(), "ResizeAndRotateProducer");
                    C14229b a = aVar.f36932c.mo26384a();
                    C13713k a2 = C14147as.this.f36926b.mo25616a();
                    Map map = null;
                    try {
                        C14242a transcode = bVar.transcode(eVar, a2, a.mRotationOptions, a.mResizeOptions, null, Integer.valueOf(85));
                        if (transcode.f37147a != 2) {
                            C13952d dVar = a.mResizeOptions;
                            String identifier = bVar.getIdentifier();
                            if (aVar.f36932c.mo26387c().requiresExtraMap(aVar.f36932c.mo26386b())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(eVar.mo26270g());
                                sb.append("x");
                                sb.append(eVar.mo26271h());
                                String sb2 = sb.toString();
                                if (dVar != null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(dVar.f36398a);
                                    sb3.append("x");
                                    sb3.append(dVar.f36399b);
                                    str = sb3.toString();
                                } else {
                                    str = "Unspecified";
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("Image format", String.valueOf(eVar.mo26267d()));
                                hashMap.put("Original size", sb2);
                                hashMap.put("Requested size", str);
                                hashMap.put("queueTime", String.valueOf(aVar.f36934f.mo26428d()));
                                hashMap.put("Transcoder id", identifier);
                                hashMap.put("Transcoding result", String.valueOf(transcode));
                                map = C13683f.copyOf(hashMap);
                            }
                            C13715a a3 = C13715a.m27746a(a2.mo25626a());
                            try {
                                eVar2 = new C14044e(a3);
                                eVar2.f36702c = C13899b.f36263a;
                                eVar2.mo26273j();
                                aVar.f36932c.mo26387c().onProducerFinishWithSuccess(aVar.f36932c.mo26386b(), "ResizeAndRotateProducer", map);
                                if (transcode.f37147a != 1) {
                                    i |= 16;
                                }
                                aVar.f37059e.mo26404b(eVar2, i);
                                C14044e.m28705d(eVar2);
                                C13715a.m27752c(a3);
                                a2.close();
                            } catch (Throwable th) {
                                C13715a.m27752c(a3);
                                throw th;
                            }
                        } else {
                            throw new RuntimeException("Error while transcoding the image");
                        }
                    } catch (Exception e) {
                        try {
                            aVar.f36932c.mo26387c().onProducerFinishWithFailure(aVar.f36932c.mo26386b(), "ResizeAndRotateProducer", e, map);
                            if (C14148a.m29025a(i)) {
                                aVar.f37059e.mo26405b((Throwable) e);
                            }
                        } finally {
                            a2.close();
                        }
                    }
                }
            }, 100);
            this.f36932c.mo26385a(new C14178e(C14147as.this) {
                /* renamed from: a */
                public final void mo23173a() {
                    C14148a.this.f36934f.mo26424a();
                    C14148a.this.f36933d = true;
                    kVar.mo26402b();
                }

                /* renamed from: c */
                public final void mo26367c() {
                    if (C14148a.this.f36932c.mo26392h()) {
                        C14148a.this.f36934f.mo26426b();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        C14139am<C14044e> amVar = this.f36927c;
        C14148a aVar = new C14148a(kVar, anVar, this.f36928d, this.f36929e);
        amVar.mo26346a(aVar, anVar);
    }

    public C14147as(Executor executor, C13711i iVar, C14139am<C14044e> amVar, boolean z, C14244c cVar) {
        this.f36925a = (Executor) C13689i.m27652a(executor);
        this.f36926b = (C13711i) C13689i.m27652a(iVar);
        this.f36927c = (C14139am) C13689i.m27652a(amVar);
        this.f36929e = (C14244c) C13689i.m27652a(cVar);
        this.f36928d = z;
    }
}
