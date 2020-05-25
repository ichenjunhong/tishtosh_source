package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13683f;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.imagepipeline.p975o.C14235e;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.al */
public final class C14131al implements C14139am<C13715a<C14042c>> {

    /* renamed from: a */
    public final C13946f f36901a;

    /* renamed from: b */
    public final Executor f36902b;

    /* renamed from: c */
    private final C14139am<C13715a<C14042c>> f36903c;

    /* renamed from: com.facebook.imagepipeline.n.al$a */
    class C14133a extends C14196n<C13715a<C14042c>, C13715a<C14042c>> {

        /* renamed from: a */
        final C14142ap f36904a;

        /* renamed from: b */
        final String f36905b;

        /* renamed from: c */
        final C14234d f36906c;

        /* renamed from: d */
        public C13715a<C14042c> f36907d;

        /* renamed from: f */
        public int f36908f;

        /* renamed from: g */
        public boolean f36909g;

        /* renamed from: h */
        boolean f36910h;

        /* renamed from: j */
        private boolean f36912j;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26239a() {
            mo26381e();
        }

        /* renamed from: f */
        private synchronized boolean m28955f() {
            return this.f36912j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo26378c() {
            C14131al.this.f36902b.execute(new Runnable() {
                public final void run() {
                    C13715a<C14042c> aVar;
                    int i;
                    C13715a aVar2;
                    boolean d;
                    C14133a aVar3;
                    synchronized (C14133a.this) {
                        aVar = C14133a.this.f36907d;
                        i = C14133a.this.f36908f;
                        aVar2 = null;
                        C14133a.this.f36907d = null;
                        C14133a.this.f36909g = false;
                    }
                    if (C13715a.m27750a(aVar)) {
                        try {
                            aVar3 = C14133a.this;
                            C13689i.m27655a(C13715a.m27750a(aVar));
                            if (!(((C14042c) aVar.mo25630a()) instanceof C14043d)) {
                                aVar3.mo26377a(aVar, i);
                            } else {
                                aVar3.f36904a.onProducerStart(aVar3.f36905b, "PostprocessorProducer");
                                C13715a a = aVar3.mo26376a((C14042c) aVar.mo25630a());
                                try {
                                    aVar3.f36904a.onProducerFinishWithSuccess(aVar3.f36905b, "PostprocessorProducer", C14133a.m28954a(aVar3.f36904a, aVar3.f36905b, aVar3.f36906c));
                                    aVar3.mo26377a(a, i);
                                    C13715a.m27752c(a);
                                } catch (Throwable th) {
                                    th = th;
                                    aVar2 = a;
                                    C13715a.m27752c(aVar2);
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            aVar3.f36904a.onProducerFinishWithFailure(aVar3.f36905b, "PostprocessorProducer", e, C14133a.m28954a(aVar3.f36904a, aVar3.f36905b, aVar3.f36906c));
                            aVar3.mo26379c(e);
                            C13715a.m27752c(null);
                        } catch (Throwable th2) {
                            C13715a.m27752c(aVar);
                            throw th2;
                        }
                        C13715a.m27752c(aVar);
                    }
                    C14133a aVar4 = C14133a.this;
                    synchronized (aVar4) {
                        aVar4.f36910h = false;
                        d = aVar4.mo26380d();
                    }
                    if (d) {
                        aVar4.mo26378c();
                    }
                }
            });
        }

        /* renamed from: e */
        public final void mo26381e() {
            if (m28956g()) {
                this.f37059e.mo26402b();
            }
        }

        /* renamed from: g */
        private boolean m28956g() {
            synchronized (this) {
                if (this.f36912j) {
                    return false;
                }
                C13715a<C14042c> aVar = this.f36907d;
                this.f36907d = null;
                this.f36912j = true;
                C13715a.m27752c(aVar);
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public synchronized boolean mo26380d() {
            if (this.f36912j || !this.f36909g || this.f36910h || !C13715a.m27750a(this.f36907d)) {
                return false;
            }
            this.f36910h = true;
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            mo26379c(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo26379c(Throwable th) {
            if (m28956g()) {
                this.f37059e.mo26405b(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13715a<C14042c> mo26376a(C14042c cVar) {
            C14043d dVar = (C14043d) cVar;
            C13715a process = this.f36906c.process(dVar.mo26257d(), C14131al.this.f36901a);
            try {
                return C13715a.m27746a(new C14043d(process, cVar.mo26258e(), dVar.f36695a, dVar.f36696b));
            } finally {
                C13715a.m27752c(process);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26377a(C13715a<C14042c> aVar, int i) {
            boolean a = m29025a(i);
            if ((!a && !m28955f()) || (a && m28956g())) {
                this.f37059e.mo26404b(aVar, i);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
            com.facebook.common.p924h.C13715a.m27752c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
            if (r2 == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            mo26378c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo26241a(java.lang.Object r2, int r3) {
            /*
                r1 = this;
                com.facebook.common.h.a r2 = (com.facebook.common.p924h.C13715a) r2
                boolean r0 = com.facebook.common.p924h.C13715a.m27750a(r2)
                if (r0 != 0) goto L_0x0013
                boolean r2 = m29025a(r3)
                if (r2 == 0) goto L_0x0012
                r2 = 0
                r1.mo26377a(r2, r3)
            L_0x0012:
                return
            L_0x0013:
                monitor-enter(r1)
                boolean r0 = r1.f36912j     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                return
            L_0x001a:
                com.facebook.common.h.a<com.facebook.imagepipeline.j.c> r0 = r1.f36907d     // Catch:{ all -> 0x0035 }
                com.facebook.common.h.a r2 = com.facebook.common.p924h.C13715a.m27751b(r2)     // Catch:{ all -> 0x0035 }
                r1.f36907d = r2     // Catch:{ all -> 0x0035 }
                r1.f36908f = r3     // Catch:{ all -> 0x0035 }
                r2 = 1
                r1.f36909g = r2     // Catch:{ all -> 0x0035 }
                boolean r2 = r1.mo26380d()     // Catch:{ all -> 0x0035 }
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                com.facebook.common.p924h.C13715a.m27752c(r0)
                if (r2 == 0) goto L_0x0034
                r1.mo26378c()
            L_0x0034:
                return
            L_0x0035:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0035 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14131al.C14133a.mo26241a(java.lang.Object, int):void");
        }

        /* renamed from: a */
        static Map<String, String> m28954a(C14142ap apVar, String str, C14234d dVar) {
            if (!apVar.requiresExtraMap(str)) {
                return null;
            }
            return C13683f.m27637of("Postprocessor", dVar.getName());
        }

        public C14133a(C14188k<C13715a<C14042c>> kVar, C14142ap apVar, String str, C14234d dVar, C14140an anVar) {
            super(kVar);
            this.f36904a = apVar;
            this.f36905b = str;
            this.f36906c = dVar;
            anVar.mo26385a(new C14178e(C14131al.this) {
                /* renamed from: a */
                public final void mo23173a() {
                    C14133a.this.mo26381e();
                }
            });
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.al$b */
    class C14136b extends C14196n<C13715a<C14042c>, C13715a<C14042c>> {

        /* renamed from: b */
        private boolean f36917b;

        /* renamed from: c */
        private C13715a<C14042c> f36918c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26239a() {
            if (mo26383c()) {
                this.f37059e.mo26402b();
            }
        }

        /* renamed from: c */
        public final boolean mo26383c() {
            synchronized (this) {
                if (this.f36917b) {
                    return false;
                }
                C13715a<C14042c> aVar = this.f36918c;
                this.f36918c = null;
                this.f36917b = true;
                C13715a.m27752c(aVar);
                return true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            if (mo26383c()) {
                this.f37059e.mo26405b(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C13715a aVar = (C13715a) obj;
            if (!m29027b(i)) {
                synchronized (this) {
                    if (!this.f36917b) {
                        C13715a<C14042c> aVar2 = this.f36918c;
                        this.f36918c = C13715a.m27751b(aVar);
                        C13715a.m27752c(aVar2);
                    }
                }
                synchronized (this) {
                    if (!this.f36917b) {
                        C13715a b = C13715a.m27751b(this.f36918c);
                        try {
                            this.f37059e.mo26404b(b, 0);
                        } finally {
                            C13715a.m27752c(b);
                        }
                    }
                }
            }
        }

        private C14136b(C14133a aVar, C14235e eVar, C14140an anVar) {
            super(aVar);
            anVar.mo26385a(new C14178e(C14131al.this) {
                /* renamed from: a */
                public final void mo23173a() {
                    if (C14136b.this.mo26383c()) {
                        C14136b.this.f37059e.mo26402b();
                    }
                }
            });
        }
    }

    /* renamed from: com.facebook.imagepipeline.n.al$c */
    class C14138c extends C14196n<C13715a<C14042c>, C13715a<C14042c>> {
        private C14138c(C14133a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C13715a aVar = (C13715a) obj;
            if (!m29027b(i)) {
                this.f37059e.mo26404b(aVar, i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.facebook.imagepipeline.n.k] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.facebook.imagepipeline.n.al$c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26346a(com.facebook.imagepipeline.p974n.C14188k<com.facebook.common.p924h.C13715a<com.facebook.imagepipeline.p970j.C14042c>> r10, com.facebook.imagepipeline.p974n.C14140an r11) {
        /*
            r9 = this;
            com.facebook.imagepipeline.n.ap r3 = r11.mo26387c()
            com.facebook.imagepipeline.o.b r0 = r11.mo26384a()
            com.facebook.imagepipeline.o.d r7 = r0.mPostprocessor
            com.facebook.imagepipeline.n.al$a r8 = new com.facebook.imagepipeline.n.al$a
            java.lang.String r4 = r11.mo26386b()
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r7
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof com.facebook.imagepipeline.p975o.C14235e
            if (r0 == 0) goto L_0x002a
            com.facebook.imagepipeline.n.al$b r6 = new com.facebook.imagepipeline.n.al$b
            r3 = r7
            com.facebook.imagepipeline.o.e r3 = (com.facebook.imagepipeline.p975o.C14235e) r3
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>(r2, r3, r4)
            goto L_0x0030
        L_0x002a:
            com.facebook.imagepipeline.n.al$c r6 = new com.facebook.imagepipeline.n.al$c
            r0 = 0
            r6.<init>(r8)
        L_0x0030:
            com.facebook.imagepipeline.n.am<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r0 = r9.f36903c
            r0.mo26346a(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14131al.mo26346a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.an):void");
    }

    public C14131al(C14139am<C13715a<C14042c>> amVar, C13946f fVar, Executor executor) {
        this.f36903c = (C14139am) C13689i.m27652a(amVar);
        this.f36901a = fVar;
        this.f36902b = (Executor) C13689i.m27652a(executor);
    }
}
