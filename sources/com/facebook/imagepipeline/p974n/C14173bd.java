package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13713k;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p927k.C13729e;
import com.facebook.imagepipeline.nativecode.C14226e;
import com.facebook.imagepipeline.nativecode.C14227f;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;
import com.facebook.p955h.C13902d;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.bd */
public final class C14173bd implements C14139am<C14044e> {

    /* renamed from: a */
    final Executor f36996a;

    /* renamed from: b */
    public final C13711i f36997b;

    /* renamed from: c */
    private final C14139am<C14044e> f36998c;

    /* renamed from: com.facebook.imagepipeline.n.bd$a */
    class C14175a extends C14196n<C14044e, C14044e> {

        /* renamed from: b */
        private final C14140an f37002b;

        /* renamed from: c */
        private C13729e f37003c = C13729e.UNSET;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo26241a(Object obj, int i) {
            C13729e eVar;
            C14044e eVar2 = (C14044e) obj;
            if (this.f37003c == C13729e.UNSET && eVar2 != null) {
                C13689i.m27652a(eVar2);
                C13900c a = C13902d.m28314a(eVar2.mo26265c());
                if (C13899b.m28309b(a)) {
                    C14226e a2 = C14227f.m29167a();
                    if (a2 != null) {
                        eVar = C13729e.valueOf(!a2.isWebpNativelySupported(a));
                        this.f37003c = eVar;
                    }
                } else if (a == C13900c.f36275a) {
                    eVar = C13729e.UNSET;
                    this.f37003c = eVar;
                }
                eVar = C13729e.NO;
                this.f37003c = eVar;
            }
            if (this.f37003c != C13729e.NO) {
                if (m29025a(i)) {
                    if (this.f37003c == C13729e.YES && eVar2 != null) {
                        C14173bd bdVar = C14173bd.this;
                        C14188k<O> kVar = this.f37059e;
                        C14140an anVar = this.f37002b;
                        C13689i.m27652a(eVar2);
                        C14173bd bdVar2 = bdVar;
                        C141741 r2 = new C14152au<C14044e>(kVar, anVar.mo26387c(), "WebpTranscodeProducer", anVar.mo26386b(), C14044e.m28703a(eVar2)) {

                            /* renamed from: b */
                            final /* synthetic */ C14044e f36999b;

                            /* renamed from: b */
                            public final void mo25573b() {
                                C14044e.m28705d(this.f36999b);
                                super.mo25573b();
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: d */
                            public C14044e mo25575c() throws Exception {
                                C13715a a;
                                C13713k a2 = C14173bd.this.f36997b.mo25616a();
                                try {
                                    C14044e eVar = this.f36999b;
                                    InputStream c = eVar.mo26265c();
                                    C13900c a3 = C13902d.m28314a(c);
                                    if (a3 != C13899b.f36268f) {
                                        if (a3 != C13899b.f36270h) {
                                            if (a3 != C13899b.f36269g) {
                                                if (a3 != C13899b.f36271i) {
                                                    throw new IllegalArgumentException("Wrong image format");
                                                }
                                            }
                                            C14227f.m29167a().transcodeWebpToPng(c, a2);
                                            eVar.f36702c = C13899b.f36264b;
                                            a = C13715a.m27746a(a2.mo25626a());
                                            C14044e eVar2 = new C14044e(a);
                                            eVar2.mo26264b(this.f36999b);
                                            C13715a.m27752c(a);
                                            a2.close();
                                            return eVar2;
                                        }
                                    }
                                    C14227f.m29167a().transcodeWebpToJpeg(c, a2, 80);
                                    eVar.f36702c = C13899b.f36263a;
                                    a = C13715a.m27746a(a2.mo25626a());
                                    C14044e eVar22 = new C14044e(a);
                                    eVar22.mo26264b(this.f36999b);
                                    C13715a.m27752c(a);
                                    a2.close();
                                    return eVar22;
                                } catch (Throwable th) {
                                    a2.close();
                                    throw th;
                                }
                            }

                            /* renamed from: b */
                            public final /* synthetic */ void mo25574b(Object obj) {
                                C14044e.m28705d((C14044e) obj);
                            }

                            /* renamed from: a */
                            public final void mo25571a(Exception exc) {
                                C14044e.m28705d(this.f36999b);
                                super.mo25571a(exc);
                            }

                            /* renamed from: a */
                            public final /* synthetic */ void mo25572a(Object obj) {
                                C14044e eVar = (C14044e) obj;
                                C14044e.m28705d(this.f36999b);
                                super.mo25572a(eVar);
                            }

                            {
                                this.f36999b = r6;
                            }
                        };
                        bdVar.f36996a.execute(r2);
                        return;
                    }
                }
            }
            this.f37059e.mo26404b(eVar2, i);
        }

        public C14175a(C14188k<C14044e> kVar, C14140an anVar) {
            super(kVar);
            this.f37002b = anVar;
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<C14044e> kVar, C14140an anVar) {
        this.f36998c.mo26346a(new C14175a(kVar, anVar), anVar);
    }

    public C14173bd(Executor executor, C13711i iVar, C14139am<C14044e> amVar) {
        this.f36996a = (Executor) C13689i.m27652a(executor);
        this.f36997b = (C13711i) C13689i.m27652a(iVar);
        this.f36998c = (C14139am) C13689i.m27652a(amVar);
    }
}
