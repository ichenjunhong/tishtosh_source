package com.facebook.imagepipeline.p974n;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13683f;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p927k.C13725a;
import com.facebook.common.p927k.C13731f;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p967g.C14032e;
import com.facebook.imagepipeline.p967g.C14033f;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p970j.C14047h;
import com.facebook.imagepipeline.p974n.C14212w.C14216a;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p976p.C14237b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.m */
public final class C14190m implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    public final Executor f37031a;

    /* renamed from: b */
    public final C14030c f37032b;

    /* renamed from: c */
    public final boolean f37033c;

    /* renamed from: d */
    public final boolean f37034d;

    /* renamed from: e */
    private final C13702a f37035e;

    /* renamed from: f */
    private final C14032e f37036f;

    /* renamed from: g */
    private final C14139am<C14044e> f37037g;

    /* renamed from: h */
    private final boolean f37038h;

    /* renamed from: i */
    private final int f37039i;

    /* renamed from: com.facebook.imagepipeline.n.m$a */
    class C14191a extends C14193c {
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final C14047h mo26415c() {
            return C14046g.m28725a(0, false, false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo26413a(C14044e eVar) {
            return eVar.mo26272i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final synchronized boolean mo26414a(C14044e eVar, int i) {
            if (m29027b(i)) {
                return false;
            }
            return super.mo26414a(eVar, i);
        }

        public C14191a(C14188k<C13715a<C14042c>> kVar, C14140an anVar, boolean z, int i) {
            super(kVar, anVar, z, i);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.m$b */
    class C14192b extends C14193c {

        /* renamed from: f */
        private final C14033f f37042f;

        /* renamed from: g */
        private final C14032e f37043g;

        /* renamed from: h */
        private int f37044h = 0;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final C14047h mo26415c() {
            return this.f37043g.mo26247b(this.f37042f.f36684a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo26413a(C14044e eVar) {
            return this.f37042f.f36685b;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            return r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo26414a(com.facebook.imagepipeline.p970j.C14044e r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo26414a(r4, r5)     // Catch:{ all -> 0x0053 }
                boolean r1 = m29027b(r5)     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = m29026a(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
            L_0x0013:
                r1 = 4
                boolean r5 = m29026a(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r5 != 0) goto L_0x0051
                boolean r5 = com.facebook.imagepipeline.p970j.C14044e.m28706e(r4)     // Catch:{ all -> 0x0053 }
                if (r5 == 0) goto L_0x0051
                com.facebook.h.c r5 = r4.mo26267d()     // Catch:{ all -> 0x0053 }
                com.facebook.h.c r1 = com.facebook.p955h.C13899b.f36263a     // Catch:{ all -> 0x0053 }
                if (r5 != r1) goto L_0x0051
                com.facebook.imagepipeline.g.f r5 = r3.f37042f     // Catch:{ all -> 0x0053 }
                boolean r4 = r5.mo26248a(r4)     // Catch:{ all -> 0x0053 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                com.facebook.imagepipeline.g.f r4 = r3.f37042f     // Catch:{ all -> 0x0053 }
                int r4 = r4.f36684a     // Catch:{ all -> 0x0053 }
                int r1 = r3.f37044h     // Catch:{ all -> 0x0053 }
                if (r4 > r1) goto L_0x003d
                monitor-exit(r3)
                return r5
            L_0x003d:
                com.facebook.imagepipeline.g.e r1 = r3.f37043g     // Catch:{ all -> 0x0053 }
                int r2 = r3.f37044h     // Catch:{ all -> 0x0053 }
                int r1 = r1.mo26246a(r2)     // Catch:{ all -> 0x0053 }
                if (r4 >= r1) goto L_0x004f
                com.facebook.imagepipeline.g.f r1 = r3.f37042f     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.f36686c     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x004f
                monitor-exit(r3)
                return r5
            L_0x004f:
                r3.f37044h = r4     // Catch:{ all -> 0x0053 }
            L_0x0051:
                monitor-exit(r3)
                return r0
            L_0x0053:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14190m.C14192b.mo26414a(com.facebook.imagepipeline.j.e, int):boolean");
        }

        public C14192b(C14188k<C13715a<C14042c>> kVar, C14140an anVar, C14033f fVar, C14032e eVar, boolean z, int i) {
            super(kVar, anVar, z, i);
            this.f37042f = (C14033f) C13689i.m27652a(fVar);
            this.f37043g = (C14032e) C13689i.m27652a(eVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.m$c */
    abstract class C14193c extends C14196n<C14044e, C13715a<C14042c>> {

        /* renamed from: a */
        private final String f37045a = "ProgressiveDecoder";

        /* renamed from: b */
        public final C14140an f37046b;

        /* renamed from: c */
        public final C14212w f37047c;

        /* renamed from: f */
        private final C14142ap f37049f;

        /* renamed from: g */
        private final C13950b f37050g;

        /* renamed from: h */
        private boolean f37051h;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo26413a(C14044e eVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract C14047h mo26415c();

        /* renamed from: e */
        private synchronized boolean m29105e() {
            return this.f37051h;
        }

        /* renamed from: a */
        public final void mo26239a() {
            mo26417d();
        }

        /* renamed from: d */
        public final void mo26417d() {
            m29103a(true);
            this.f37059e.mo26402b();
        }

        /* renamed from: c */
        private void m29104c(Throwable th) {
            m29103a(true);
            this.f37059e.mo26405b(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26240a(float f) {
            super.mo26240a(f * 0.99f);
        }

        /* renamed from: a */
        private void m29103a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f37051h) {
                        this.f37059e.mo26403b(1.0f);
                        this.f37051h = true;
                        this.f37047c.mo26424a();
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            m29104c(th);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C14044e eVar = (C14044e) obj;
            try {
                if (C14237b.m29187b()) {
                    C14237b.m29186a("DecodeProducer#onNewResultImpl");
                }
                boolean a = m29025a(i);
                if (a && !C14044e.m28706e(eVar)) {
                    m29104c(new C13725a("Encoded image is not valid."));
                } else if (!mo26414a(eVar, i)) {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                } else {
                    boolean a2 = m29026a(i, 4);
                    if (a || a2 || this.f37046b.mo26392h()) {
                        this.f37047c.mo26426b();
                    }
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

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo26414a(C14044e eVar, int i) {
            return this.f37047c.mo26425a(eVar, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[Catch:{ all -> 0x0109, all -> 0x0161 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo26416b(com.facebook.imagepipeline.p970j.C14044e r19, int r20) {
            /*
                r18 = this;
                r11 = r18
                r12 = r19
                r0 = r20
                com.facebook.h.c r1 = r19.mo26267d()
                com.facebook.h.c r2 = com.facebook.p955h.C13899b.f36263a
                if (r1 == r2) goto L_0x0015
                boolean r1 = m29027b(r20)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r18.m29105e()
                if (r1 != 0) goto L_0x0166
                boolean r1 = com.facebook.imagepipeline.p970j.C14044e.m28706e(r19)
                if (r1 != 0) goto L_0x0023
                goto L_0x0166
            L_0x0023:
                com.facebook.h.c r1 = r19.mo26267d()
                if (r1 == 0) goto L_0x002d
                java.lang.String r1 = r1.f36277c
            L_0x002b:
                r7 = r1
                goto L_0x0030
            L_0x002d:
                java.lang.String r1 = "unknown"
                goto L_0x002b
            L_0x0030:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r19.mo26270g()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r2 = r19.mo26271h()
                r1.append(r2)
                java.lang.String r8 = r1.toString()
                int r1 = r12.f36707h
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = m29025a(r20)
                if (r6 == 0) goto L_0x0062
                r3 = 8
                boolean r3 = m29026a(r0, r3)
                if (r3 != 0) goto L_0x0062
                r3 = 1
                goto L_0x0063
            L_0x0062:
                r3 = 0
            L_0x0063:
                r4 = 4
                boolean r5 = m29026a(r0, r4)
                com.facebook.imagepipeline.n.an r9 = r11.f37046b
                com.facebook.imagepipeline.o.b r9 = r9.mo26384a()
                com.facebook.imagepipeline.common.d r9 = r9.mResizeOptions
                if (r9 == 0) goto L_0x008b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r14 = r9.f36398a
                r13.append(r14)
                java.lang.String r14 = "x"
                r13.append(r14)
                int r9 = r9.f36399b
                r13.append(r9)
                java.lang.String r9 = r13.toString()
                goto L_0x008d
            L_0x008b:
                java.lang.String r9 = "unknown"
            L_0x008d:
                com.facebook.imagepipeline.n.w r13 = r11.f37047c     // Catch:{ all -> 0x0161 }
                long r13 = r13.mo26428d()     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.an r15 = r11.f37046b     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.o.b r15 = r15.mo26384a()     // Catch:{ all -> 0x0161 }
                android.net.Uri r15 = r15.mSourceUri     // Catch:{ all -> 0x0161 }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0161 }
                if (r3 != 0) goto L_0x00ab
                if (r5 == 0) goto L_0x00a4
                goto L_0x00ab
            L_0x00a4:
                int r16 = r18.mo26413a(r19)     // Catch:{ all -> 0x0161 }
            L_0x00a8:
                r1 = r16
                goto L_0x00b0
            L_0x00ab:
                int r16 = r19.mo26272i()     // Catch:{ all -> 0x0161 }
                goto L_0x00a8
            L_0x00b0:
                if (r3 != 0) goto L_0x00bb
                if (r5 == 0) goto L_0x00b5
                goto L_0x00bb
            L_0x00b5:
                com.facebook.imagepipeline.j.h r3 = r18.mo26415c()     // Catch:{ all -> 0x0161 }
            L_0x00b9:
                r5 = r3
                goto L_0x00be
            L_0x00bb:
                com.facebook.imagepipeline.j.h r3 = com.facebook.imagepipeline.p970j.C14046g.f36711a     // Catch:{ all -> 0x0161 }
                goto L_0x00b9
            L_0x00be:
                com.facebook.imagepipeline.n.ap r3 = r11.f37049f     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.an r4 = r11.f37046b     // Catch:{ all -> 0x0161 }
                java.lang.String r4 = r4.mo26386b()     // Catch:{ all -> 0x0161 }
                java.lang.String r2 = "DecodeProducer"
                r3.onProducerStart(r4, r2)     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.m r3 = com.facebook.imagepipeline.p974n.C14190m.this     // Catch:{ a -> 0x0115 }
                com.facebook.imagepipeline.g.c r3 = r3.f37032b     // Catch:{ a -> 0x0115 }
                com.facebook.imagepipeline.common.b r4 = r11.f37050g     // Catch:{ a -> 0x0115 }
                com.facebook.imagepipeline.j.c r16 = r3.mo26049a(r12, r1, r5, r4)     // Catch:{ a -> 0x0115 }
                int r1 = r12.f36707h     // Catch:{ Exception -> 0x010e }
                r2 = 1
                if (r1 == r2) goto L_0x00dc
                r0 = r0 | 16
            L_0x00dc:
                r1 = r18
                r2 = r16
                r3 = r13
                java.util.Map r1 = r1.m29102a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.ap r2 = r11.f37049f     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.an r3 = r11.f37046b     // Catch:{ all -> 0x0161 }
                java.lang.String r3 = r3.mo26386b()     // Catch:{ all -> 0x0161 }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithSuccess(r3, r4, r1)     // Catch:{ all -> 0x0161 }
                com.facebook.common.h.a r1 = com.facebook.common.p924h.C13715a.m27746a(r16)     // Catch:{ all -> 0x0161 }
                boolean r2 = m29025a(r0)     // Catch:{ all -> 0x0109 }
                r11.m29103a(r2)     // Catch:{ all -> 0x0109 }
                com.facebook.imagepipeline.n.k<O> r2 = r11.f37059e     // Catch:{ all -> 0x0109 }
                r2.mo26404b(r1, r0)     // Catch:{ all -> 0x0109 }
                com.facebook.common.p924h.C13715a.m27752c(r1)     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.p970j.C14044e.m28705d(r19)
                return
            L_0x0109:
                r0 = move-exception
                com.facebook.common.p924h.C13715a.m27752c(r1)     // Catch:{ all -> 0x0161 }
                throw r0     // Catch:{ all -> 0x0161 }
            L_0x010e:
                r0 = move-exception
                r2 = r16
                goto L_0x0146
            L_0x0112:
                r0 = move-exception
                r2 = 0
                goto L_0x0146
            L_0x0115:
                r0 = move-exception
                com.facebook.imagepipeline.j.e r1 = r0.getEncodedImage()     // Catch:{ Exception -> 0x0112 }
                java.lang.String r3 = "ProgressiveDecoder"
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0112 }
                java.lang.String r16 = r0.getMessage()     // Catch:{ Exception -> 0x0112 }
                r17 = 0
                r2[r17] = r16     // Catch:{ Exception -> 0x0112 }
                r16 = 1
                r2[r16] = r15     // Catch:{ Exception -> 0x0112 }
                r15 = 10
                java.lang.String r15 = r1.mo26261a(r15)     // Catch:{ Exception -> 0x0112 }
                r16 = 2
                r2[r16] = r15     // Catch:{ Exception -> 0x0112 }
                r15 = 3
                int r1 = r1.mo26272i()     // Catch:{ Exception -> 0x0112 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0112 }
                r2[r15] = r1     // Catch:{ Exception -> 0x0112 }
                com.facebook.common.p921e.C13697a.m27691b(r3, r4, r2)     // Catch:{ Exception -> 0x0112 }
                throw r0     // Catch:{ Exception -> 0x0112 }
            L_0x0146:
                r1 = r18
                r3 = r13
                java.util.Map r1 = r1.m29102a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.ap r2 = r11.f37049f     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.n.an r3 = r11.f37046b     // Catch:{ all -> 0x0161 }
                java.lang.String r3 = r3.mo26386b()     // Catch:{ all -> 0x0161 }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithFailure(r3, r4, r0, r1)     // Catch:{ all -> 0x0161 }
                r11.m29104c(r0)     // Catch:{ all -> 0x0161 }
                com.facebook.imagepipeline.p970j.C14044e.m28705d(r19)
                return
            L_0x0161:
                r0 = move-exception
                com.facebook.imagepipeline.p970j.C14044e.m28705d(r19)
                throw r0
            L_0x0166:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14190m.C14193c.mo26416b(com.facebook.imagepipeline.j.e, int):void");
        }

        public C14193c(C14188k<C13715a<C14042c>> kVar, final C14140an anVar, final boolean z, final int i) {
            super(kVar);
            this.f37046b = anVar;
            this.f37049f = anVar.mo26387c();
            this.f37050g = anVar.mo26384a().mImageDecodeOptions;
            this.f37051h = false;
            this.f37047c = new C14212w(C14190m.this.f37031a, new C14216a(C14190m.this) {
                /* renamed from: a */
                public final void mo26393a(C14044e eVar, int i) {
                    if (eVar != null) {
                        if (C14190m.this.f37033c || !C14168b.m29026a(i, 16)) {
                            C14229b a = anVar.mo26384a();
                            if (C14190m.this.f37034d || !C13731f.m27778b(a.mSourceUri)) {
                                eVar.f36707h = C14203q.m29128a(a.mRotationOptions, a.mResizeOptions, eVar, i);
                            }
                        }
                        C14193c.this.mo26416b(eVar, i);
                    }
                }
            }, this.f37050g.f36386a);
            this.f37046b.mo26385a(new C14178e(C14190m.this) {
                /* renamed from: a */
                public final void mo23173a() {
                    if (z) {
                        C14193c.this.mo26417d();
                    }
                }

                /* renamed from: c */
                public final void mo26367c() {
                    if (C14193c.this.f37046b.mo26392h()) {
                        C14193c.this.f37047c.mo26426b();
                    }
                }
            });
        }

        /* renamed from: a */
        private Map<String, String> m29102a(C14042c cVar, long j, C14047h hVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f37049f.requiresExtraMap(this.f37046b.mo26386b())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(hVar.mo26275b());
            String valueOf3 = String.valueOf(z);
            if (cVar instanceof C14043d) {
                Bitmap d = ((C14043d) cVar).mo26257d();
                StringBuilder sb = new StringBuilder();
                sb.append(d.getWidth());
                sb.append("x");
                sb.append(d.getHeight());
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", sb2);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return C13683f.copyOf(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return C13683f.copyOf(hashMap2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.facebook.imagepipeline.n.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26346a(com.facebook.imagepipeline.p974n.C14188k<com.facebook.common.p924h.C13715a<com.facebook.imagepipeline.p970j.C14042c>> r10, com.facebook.imagepipeline.p974n.C14140an r11) {
        /*
            r9 = this;
            boolean r0 = com.facebook.imagepipeline.p976p.C14237b.m29187b()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "DecodeProducer#produceResults"
            com.facebook.imagepipeline.p976p.C14237b.m29186a(r0)     // Catch:{ all -> 0x004c }
        L_0x000b:
            com.facebook.imagepipeline.o.b r0 = r11.mo26384a()     // Catch:{ all -> 0x004c }
            android.net.Uri r0 = r0.mSourceUri     // Catch:{ all -> 0x004c }
            boolean r0 = com.facebook.common.p927k.C13731f.m27778b(r0)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0025
            com.facebook.imagepipeline.n.m$a r0 = new com.facebook.imagepipeline.n.m$a     // Catch:{ all -> 0x004c }
            boolean r5 = r9.f37038h     // Catch:{ all -> 0x004c }
            int r6 = r9.f37039i     // Catch:{ all -> 0x004c }
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004c }
            goto L_0x003c
        L_0x0025:
            com.facebook.imagepipeline.g.f r4 = new com.facebook.imagepipeline.g.f     // Catch:{ all -> 0x004c }
            com.facebook.common.g.a r0 = r9.f37035e     // Catch:{ all -> 0x004c }
            r4.<init>(r0)     // Catch:{ all -> 0x004c }
            com.facebook.imagepipeline.n.m$b r8 = new com.facebook.imagepipeline.n.m$b     // Catch:{ all -> 0x004c }
            com.facebook.imagepipeline.g.e r5 = r9.f37036f     // Catch:{ all -> 0x004c }
            boolean r6 = r9.f37038h     // Catch:{ all -> 0x004c }
            int r7 = r9.f37039i     // Catch:{ all -> 0x004c }
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004c }
            r0 = r8
        L_0x003c:
            com.facebook.imagepipeline.n.am<com.facebook.imagepipeline.j.e> r10 = r9.f37037g     // Catch:{ all -> 0x004c }
            r10.mo26346a(r0, r11)     // Catch:{ all -> 0x004c }
            boolean r10 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r10 == 0) goto L_0x004b
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
            return
        L_0x004b:
            return
        L_0x004c:
            r10 = move-exception
            boolean r11 = com.facebook.imagepipeline.p976p.C14237b.m29187b()
            if (r11 == 0) goto L_0x0056
            com.facebook.imagepipeline.p976p.C14237b.m29185a()
        L_0x0056:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14190m.mo26346a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.an):void");
    }

    public C14190m(C13702a aVar, Executor executor, C14030c cVar, C14032e eVar, boolean z, boolean z2, boolean z3, C14139am<C14044e> amVar, int i) {
        this.f37035e = (C13702a) C13689i.m27652a(aVar);
        this.f37031a = (Executor) C13689i.m27652a(executor);
        this.f37032b = (C14030c) C13689i.m27652a(cVar);
        this.f37036f = (C14032e) C13689i.m27652a(eVar);
        this.f37033c = z;
        this.f37034d = z2;
        this.f37037g = (C14139am) C13689i.m27652a(amVar);
        this.f37038h = z3;
        this.f37039i = i;
    }
}
