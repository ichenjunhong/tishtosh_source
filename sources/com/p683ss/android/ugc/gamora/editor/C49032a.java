package com.p683ss.android.ugc.gamora.editor;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43449bd;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43451be;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultStatus;
import com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.VEListener.C50545i;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52775l;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52726d;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.gamora.editor.a */
public final class C49032a {

    /* renamed from: c */
    public static final C49033a f123271c = new C49033a(null);

    /* renamed from: a */
    public CompileProbeConfig f123272a;

    /* renamed from: b */
    public C49048d f123273b;

    /* renamed from: com.ss.android.ugc.gamora.editor.a$a */
    public static final class C49033a {
        private C49033a() {
        }

        public /* synthetic */ C49033a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m105870a(String str) {
            StringBuilder sb = new StringBuilder("CompileProbe + ");
            sb.append(str);
            C50203g.m108358a(sb.toString());
        }

        /* renamed from: a */
        public static void m105871a(String str, boolean z) {
            if (z) {
                StringBuilder sb = new StringBuilder("CompileProbe + ");
                sb.append(str);
                C50203g.m108358a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$b */
    static final class C49034b extends RuntimeException {

        /* renamed from: a */
        final C49037b f123274a;

        public C49034b(C49037b bVar) {
            C52711k.m112240b(bVar, "failed");
            this.f123274a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$c */
    public static abstract class C49035c {

        /* renamed from: a */
        public static final C49036a f123275a = new C49036a(null);

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$a */
        public static final class C49036a {
            private C49036a() {
            }

            public /* synthetic */ C49036a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b */
        public static abstract class C49037b extends C49035c {

            /* renamed from: b */
            public final int f123276b;

            /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a */
            public static abstract class C49038a extends C49037b {

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a$a */
                public static final class C49039a extends C49038a {
                    public C49039a(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a$b */
                public static final class C49040b extends C49038a {

                    /* renamed from: c */
                    public static final C49040b f123277c = new C49040b();

                    private C49040b() {
                        super(-234, null);
                    }
                }

                private C49038a(int i) {
                    super(i, null);
                }

                public /* synthetic */ C49038a(int i, C52707g gVar) {
                    this(i);
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b */
            public static abstract class C49041b extends C49037b {

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$a */
                public static final class C49042a extends C49041b {
                    public C49042a(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$b */
                public static final class C49043b extends C49041b {
                    public C49043b(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$c */
                public static final class C49044c extends C49041b {

                    /* renamed from: c */
                    public final String f123278c;

                    public C49044c(String str) {
                        C52711k.m112240b(str, "msg");
                        super(-233, null);
                        this.f123278c = str;
                    }
                }

                private C49041b(int i) {
                    super(i, null);
                }

                public /* synthetic */ C49041b(int i, C52707g gVar) {
                    this(i);
                }
            }

            private C49037b(int i) {
                super(null);
                this.f123276b = i;
            }

            public /* synthetic */ C49037b(int i, C52707g gVar) {
                this(i);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$c */
        public static final class C49045c extends C49035c {

            /* renamed from: b */
            public static final C49045c f123279b = new C49045c();

            private C49045c() {
                super(null);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$d */
        public static final class C49046d extends C49035c {

            /* renamed from: b */
            public static final C49046d f123280b = new C49046d();

            private C49046d() {
                super(null);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$e */
        public static final class C49047e extends C49035c {

            /* renamed from: b */
            public static final C49047e f123281b = new C49047e();

            private C49047e() {
                super(null);
            }
        }

        private C49035c() {
        }

        public /* synthetic */ C49035c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$d */
    static final class C49048d {

        /* renamed from: a */
        public C49035c f123282a = C49045c.f123279b;

        /* renamed from: b */
        final C52670a<C52860x> f123283b;

        /* renamed from: c */
        final C52671b<CompileProbeResult, C52860x> f123284c;

        /* renamed from: d */
        private final C52670a<C52860x> f123285d;

        /* renamed from: a */
        public final void mo97082a() {
            if (C52711k.m112239a((Object) this.f123282a, (Object) C49046d.f123280b)) {
                C49040b bVar = C49040b.f123277c;
                this.f123282a = bVar;
                this.f123285d.invoke();
                this.f123284c.invoke(new CompileProbeResult(new ResultStatus(State.CANCEL, bVar.f123276b, bVar.f123276b, "OuterCancel"), null, 2, null));
            }
        }

        /* renamed from: b */
        public final void mo97084b() {
            C49035c cVar = this.f123282a;
            if (C52711k.m112239a((Object) cVar, (Object) C49045c.f123279b) || C52711k.m112239a((Object) cVar, (Object) C49047e.f123281b) || (cVar instanceof C49037b)) {
                this.f123282a = C49045c.f123279b;
                return;
            }
            if (C52711k.m112239a((Object) cVar, (Object) C49046d.f123280b)) {
                C49033a.m105870a("clear on running");
            }
        }

        /* renamed from: a */
        public final void mo97083a(C49037b bVar) {
            CompileProbeResult compileProbeResult;
            C52711k.m112240b(bVar, "failed");
            if (C52711k.m112239a((Object) this.f123282a, (Object) C49046d.f123280b)) {
                this.f123282a = bVar;
                C52671b<CompileProbeResult, C52860x> bVar2 = this.f123284c;
                if ((bVar instanceof C49042a) || (bVar instanceof C49043b)) {
                    ResultStatus resultStatus = new ResultStatus(State.ERROR, bVar.f123276b, 0, null, 12, null);
                    compileProbeResult = new CompileProbeResult(resultStatus, null, 2, null);
                } else if (bVar instanceof C49044c) {
                    compileProbeResult = new CompileProbeResult(new ResultStatus(State.ERROR, bVar.f123276b, bVar.f123276b, ((C49044c) bVar).f123278c), null, 2, null);
                } else if (bVar instanceof C49039a) {
                    ResultStatus resultStatus2 = new ResultStatus(State.CANCEL, bVar.f123276b, 0, null, 12, null);
                    compileProbeResult = new CompileProbeResult(resultStatus2, null, 2, null);
                } else if (C52711k.m112239a((Object) bVar, (Object) C49040b.f123277c)) {
                    C49033a.m105870a("OuterCancel on inner Failed");
                    compileProbeResult = new CompileProbeResult(new ResultStatus(State.CANCEL, bVar.f123276b, bVar.f123276b, "OuterCancel"), null, 2, null);
                } else {
                    throw new C52775l();
                }
                bVar2.invoke(compileProbeResult);
                return;
            }
            C49033a.m105870a("Failed on not running");
        }

        public C49048d(C52670a<C52860x> aVar, C52670a<C52860x> aVar2, C52671b<? super CompileProbeResult, C52860x> bVar) {
            C52711k.m112240b(aVar, "realStart");
            C52711k.m112240b(aVar2, "manualCancel");
            C52711k.m112240b(bVar, "onResult");
            this.f123283b = aVar;
            this.f123285d = aVar2;
            this.f123284c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$e */
    static final class C49049e extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f123286a;

        C49049e(VideoPublishEditModel videoPublishEditModel) {
            this.f123286a = videoPublishEditModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo97085a());
        }

        /* renamed from: a */
        public final boolean mo97085a() {
            boolean z;
            C49033a aVar = C49032a.f123271c;
            StringBuilder sb = new StringBuilder("isSingleSegmentVideo: ");
            sb.append(this.f123286a.mIsMultiVideo);
            sb.append(' ');
            sb.append(this.f123286a.mFromCut);
            sb.append(' ');
            sb.append(this.f123286a.mVideoSegmentsDesc);
            C49033a.m105871a(sb.toString(), false);
            if (this.f123286a.mIsMultiVideo) {
                return false;
            }
            if (this.f123286a.mFromCut) {
                return true;
            }
            CharSequence charSequence = this.f123286a.mVideoSegmentsDesc;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || ShortVideoContext.m93017a(this.f123286a.mVideoSegmentsDesc).size() != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$f */
    static final class C49050f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49032a f123287a;

        C49050f(C49032a aVar) {
            this.f123287a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97086a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97086a() {
            boolean z;
            String e = C39629l.m88232a().mo58583n().mo83107e(C40790a.CompileProbeConfig);
            CharSequence charSequence = e;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    this.f123287a.f123272a = (CompileProbeConfig) C39629l.m88232a().mo58566D().mo34884a(e, CompileProbeConfig.class);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("solveCompileProbeConfig failed: ");
                    sb.append(e);
                    C49033a.m105870a(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("solveCompileProbeConfig config: ");
                sb2.append(this.f123287a.f123272a);
                C49033a.m105871a(sb2.toString(), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$g */
    static final class C49051g extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f123288a;

        C49051g(VideoPublishEditModel videoPublishEditModel) {
            this.f123288a = videoPublishEditModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo97087a());
        }

        /* renamed from: a */
        public final boolean mo97087a() {
            C43449bd a = C43451be.m95243a(this.f123288a, false);
            if (this.f123288a.videoWidth() + this.f123288a.videoHeight() == a.mo88381c() + a.mo88382d()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$h */
    static final class C49052h extends C52712l implements C52670a<C1680ad<CompileProbeResult>> {

        /* renamed from: a */
        final /* synthetic */ C49032a f123289a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f123290b;

        C49052h(C49032a aVar, VideoPublishEditModel videoPublishEditModel) {
            this.f123289a = aVar;
            this.f123290b = videoPublishEditModel;
            super(0);
        }

        /* renamed from: a */
        public final C1680ad<CompileProbeResult> invoke() {
            final C52726d dVar = new C52726d();
            dVar.element = 0;
            final C490542 r1 = new C52670a<Integer>() {
                /* renamed from: a */
                public final int mo97089a() {
                    return (int) (System.currentTimeMillis() - dVar.element);
                }

                public final /* synthetic */ Object invoke() {
                    return Integer.valueOf(mo97089a());
                }
            };
            C1680ad<CompileProbeResult> a = C1680ad.m5958a((C1684ah<T>) new C1684ah<T>(this) {

                /* renamed from: a */
                final /* synthetic */ C49052h f123293a;

                /* renamed from: com.ss.android.ugc.gamora.editor.a$h$3$a */
                static final class C49056a implements C50545i {

                    /* renamed from: a */
                    final /* synthetic */ C490553 f123296a;

                    /* renamed from: b */
                    final /* synthetic */ C1682af f123297b;

                    C49056a(C490553 r1, C1682af afVar) {
                        this.f123296a = r1;
                        this.f123297b = afVar;
                    }

                    /* renamed from: a */
                    public final void mo97090a(int i, int i2, float f) {
                        if (i == -10000) {
                            this.f123297b.mo6166b(new C49034b(new C49039a(i)));
                        } else if (i != 0) {
                            this.f123297b.mo6166b(new C49034b(new C49043b(i)));
                        } else {
                            C1682af afVar = this.f123297b;
                            ResultStatus resultStatus = new ResultStatus(State.SUCCESS, i, 0, null, 12, null);
                            afVar.mo6164a(new CompileProbeResult(resultStatus, new ResultData(i2, f, r1.mo97089a())));
                        }
                    }
                }

                {
                    this.f123293a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
                    if (r1 == null) goto L_0x0037;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo6171a(p064c.p065a.C1682af<com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult> r13) {
                    /*
                        r12 = this;
                        java.lang.String r0 = "it"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                        com.p683ss.android.vesdk.C50720o.m109694z()
                        com.ss.android.ugc.gamora.editor.a$h r0 = r12.f123293a
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.f123290b
                        r1 = 0
                        com.ss.android.ugc.aweme.shortvideo.edit.bd r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43451be.m95243a(r0, r1)
                        d.f.b.v$d r2 = r0
                        long r3 = java.lang.System.currentTimeMillis()
                        r2.element = r3
                        com.ss.android.ugc.gamora.editor.a$h r2 = r12.f123293a
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.f123290b
                        com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = r2.getPreviewInfo()
                        if (r2 == 0) goto L_0x0037
                        java.util.List r2 = r2.getVideoList()
                        if (r2 == 0) goto L_0x0037
                        java.lang.Object r1 = r2.get(r1)
                        com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r1
                        if (r1 == 0) goto L_0x0037
                        java.lang.String r1 = r1.getVideoPath()
                        if (r1 != 0) goto L_0x0039
                    L_0x0037:
                        java.lang.String r1 = ""
                    L_0x0039:
                        r2 = r1
                        java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43761q.C43762a.m96176b()
                        int r4 = r0.mo88381c()
                        int r5 = r0.mo88382d()
                        com.ss.android.ugc.gamora.editor.a$h r0 = r12.f123293a
                        com.ss.android.ugc.gamora.editor.a r0 = r0.f123289a
                        com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig r0 = r0.f123272a
                        if (r0 != 0) goto L_0x0051
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0051:
                        long r6 = r0.getStartPointMs()
                        com.ss.android.ugc.gamora.editor.a$h r0 = r12.f123293a
                        com.ss.android.ugc.gamora.editor.a r0 = r0.f123289a
                        com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig r0 = r0.f123272a
                        if (r0 != 0) goto L_0x0060
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0060:
                        long r8 = r0.getEndPointMs()
                        java.lang.String r10 = com.p683ss.android.ugc.gamora.editor.C49032a.C49052h.C490531.m105879a()
                        com.ss.android.ugc.gamora.editor.a$h$3$a r0 = new com.ss.android.ugc.gamora.editor.a$h$3$a
                        r0.<init>(r12, r13)
                        r11 = r0
                        com.ss.android.vesdk.VEListener$i r11 = (com.p683ss.android.vesdk.VEListener.C50545i) r11
                        int r0 = com.p683ss.android.vesdk.C50720o.m109673a(r2, r3, r4, r5, r6, r8, r10, r11)
                        if (r0 == 0) goto L_0x0087
                        com.ss.android.ugc.gamora.editor.a$b r1 = new com.ss.android.ugc.gamora.editor.a$b
                        com.ss.android.ugc.gamora.editor.a$c$b$b$a r2 = new com.ss.android.ugc.gamora.editor.a$c$b$b$a
                        r2.<init>(r0)
                        com.ss.android.ugc.gamora.editor.a$c$b r2 = (com.p683ss.android.ugc.gamora.editor.C49032a.C49035c.C49037b) r2
                        r1.<init>(r2)
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        r13.mo6166b(r1)
                    L_0x0087:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49032a.C49052h.C490553.mo6171a(c.a.af):void");
                }
            });
            C52711k.m112236a((Object) a, "create {\n               …          }\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$i */
    static final class C49057i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49032a f123298a;

        /* renamed from: b */
        final /* synthetic */ C52727e f123299b;

        /* renamed from: c */
        final /* synthetic */ C49052h f123300c;

        C49057i(C49032a aVar, C52727e eVar, C49052h hVar) {
            this.f123298a = aVar;
            this.f123299b = eVar;
            this.f123300c = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97091a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97091a() {
            C49033a.m105871a("Start", true);
            this.f123299b.element = this.f123300c.invoke().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C1710e<CompileProbeResult>(this) {

                /* renamed from: a */
                final /* synthetic */ C49057i f123301a;

                {
                    this.f123301a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                    C49048d dVar = this.f123301a.f123298a.f123273b;
                    if (dVar != null) {
                        C52711k.m112236a((Object) compileProbeResult, "it");
                        C52711k.m112240b(compileProbeResult, "result");
                        if (C52711k.m112239a((Object) dVar.f123282a, (Object) C49046d.f123280b)) {
                            dVar.f123282a = C49047e.f123281b;
                            dVar.f123284c.invoke(compileProbeResult);
                        } else {
                            C49033a.m105870a("Success on not running");
                        }
                    }
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C49057i f123302a;

                {
                    this.f123302a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th instanceof C49034b) {
                        C49048d dVar = this.f123302a.f123298a.f123273b;
                        if (dVar != null) {
                            dVar.mo97083a(((C49034b) th).f123274a);
                        }
                    } else {
                        C49048d dVar2 = this.f123302a.f123298a.f123273b;
                        if (dVar2 != null) {
                            String message = th.getMessage();
                            if (message == null) {
                                message = "FailedNoMessage";
                            }
                            dVar2.mo97083a(new C49044c(message));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$j */
    static final class C49060j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52727e f123303a;

        C49060j(C52727e eVar) {
            this.f123303a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97092a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97092a() {
            C49033a.m105871a("ManualCancel", true);
            C1690c cVar = (C1690c) this.f123303a.element;
            if (cVar != null) {
                cVar.dispose();
            }
            C50720o.m109694z();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$k */
    static final class C49061k extends C52712l implements C52671b<CompileProbeResult, C52860x> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f123304a;

        C49061k(VideoPublishEditModel videoPublishEditModel) {
            this.f123304a = videoPublishEditModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo97093a((CompileProbeResult) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97093a(CompileProbeResult compileProbeResult) {
            C52711k.m112240b(compileProbeResult, "result");
            StringBuilder sb = new StringBuilder("onResult: ");
            sb.append(compileProbeResult);
            C49033a.m105871a(sb.toString(), true);
            this.f123304a.compileProbeResult = compileProbeResult;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$l */
    static final class C49062l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49032a f123305a;

        /* renamed from: b */
        final /* synthetic */ C49057i f123306b;

        /* renamed from: c */
        final /* synthetic */ C49060j f123307c;

        /* renamed from: d */
        final /* synthetic */ C49061k f123308d;

        C49062l(C49032a aVar, C49057i iVar, C49060j jVar, C49061k kVar) {
            this.f123305a = aVar;
            this.f123306b = iVar;
            this.f123307c = jVar;
            this.f123308d = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97094a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97094a() {
            if (this.f123305a.f123273b == null) {
                this.f123305a.f123273b = new C49048d(new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49062l f123309a;

                    {
                        this.f123309a = r1;
                    }

                    public final String getName() {
                        return "realStart";
                    }

                    public final C52761d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f123309a.f123306b.mo97091a();
                        return C52860x.f131107a;
                    }
                }, new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49062l f123310a;

                    {
                        this.f123310a = r1;
                    }

                    public final String getName() {
                        return "manualCancel";
                    }

                    public final C52761d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        this.f123310a.f123307c.mo97092a();
                        return C52860x.f131107a;
                    }
                }, new C52671b<CompileProbeResult, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49062l f123311a;

                    {
                        this.f123311a = r1;
                    }

                    public final String getName() {
                        return "onResult";
                    }

                    public final C52761d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke(Lcom/ss/android/ugc/aweme/shortvideo/edit/CompileProbeResult;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
                        C52711k.m112240b(compileProbeResult, "p1");
                        this.f123311a.f123308d.mo97093a(compileProbeResult);
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo97080a() {
        C49048d dVar = this.f123273b;
        if (dVar != null) {
            dVar.mo97082a();
        }
        C49048d dVar2 = this.f123273b;
        if (dVar2 != null) {
            dVar2.mo97084b();
        }
    }

    /* renamed from: a */
    public final void mo97081a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C52711k.m112240b(videoPublishEditModel, "videoModel");
        C49049e eVar = new C49049e(videoPublishEditModel);
        C49050f fVar = new C49050f(this);
        C49051g gVar = new C49051g(videoPublishEditModel);
        fVar.mo97086a();
        if (this.f123272a == null || !eVar.mo97085a() || !gVar.mo97087a()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C49033a.m105871a("Need not start", true);
            return;
        }
        C52727e eVar2 = new C52727e();
        eVar2.element = null;
        new C49062l(this, new C49057i(this, eVar2, new C49052h(this, videoPublishEditModel)), new C49060j(eVar2), new C49061k(videoPublishEditModel)).mo97094a();
        C49048d dVar = this.f123273b;
        if (dVar != null && C52711k.m112239a((Object) dVar.f123282a, (Object) C49045c.f123279b)) {
            dVar.f123282a = C49046d.f123280b;
            dVar.f123283b.invoke();
        }
    }
}
