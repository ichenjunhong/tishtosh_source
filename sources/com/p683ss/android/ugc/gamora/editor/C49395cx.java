package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.p038f.C0781c;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.effect.C29218v;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.photo.C38681j;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.C46073p;
import com.p683ss.android.ugc.aweme.sticker.C46409q;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.aweme.utils.C47900ft;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49917c;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49917c.C49919b;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49923d;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49925e;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49937f;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52904aa.C52905a;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.cx */
public final class C49395cx extends C12924i {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123973i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49395cx.class), "handlerThread", "getHandlerThread()Landroid/os/HandlerThread;"))};

    /* renamed from: w */
    public static final C49396a f123974w = new C49396a(null);

    /* renamed from: A */
    private C29252f f123975A;

    /* renamed from: B */
    private final List<Integer> f123976B = C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(R.string.g07), Integer.valueOf(R.string.g08), Integer.valueOf(R.string.g09)});

    /* renamed from: C */
    private final C52668f f123977C = C52732g.m112285a(C49401e.f124002a);

    /* renamed from: D */
    private final C23422a f123978D = new C49407k(this);

    /* renamed from: j */
    public C49397b f123979j;

    /* renamed from: k */
    public C49925e f123980k;

    /* renamed from: l */
    public VEVideoPublishEditViewModel f123981l;

    /* renamed from: m */
    public EditViewModel f123982m;

    /* renamed from: n */
    public StatusViewModel f123983n;

    /* renamed from: o */
    public C20347c f123984o;

    /* renamed from: p */
    int f123985p;

    /* renamed from: q */
    public C49923d f123986q;

    /* renamed from: r */
    public C49923d f123987r;

    /* renamed from: s */
    public long f123988s;

    /* renamed from: t */
    public String f123989t;

    /* renamed from: u */
    public boolean f123990u;

    /* renamed from: v */
    C49398c f123991v = new C49398c(this, m106555c().getLooper());

    /* renamed from: x */
    private ViewGroup f123992x;

    /* renamed from: y */
    private View f123993y;

    /* renamed from: z */
    private AVDmtTabLayout f123994z;

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$a */
    public static final class C49396a {
        private C49396a() {
        }

        public /* synthetic */ C49396a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$b */
    public interface C49397b {
        /* renamed from: a */
        void mo97199a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$c */
    public static final class C49398c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C49395cx f123995a;

        /* renamed from: com.ss.android.ugc.gamora.editor.cx$c$a */
        static final class C49399a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C20347c f123996a;

            /* renamed from: b */
            final /* synthetic */ C49398c f123997b;

            /* renamed from: c */
            final /* synthetic */ C52727e f123998c;

            /* renamed from: d */
            final /* synthetic */ C52727e f123999d;

            C49399a(C20347c cVar, C49398c cVar2, C52727e eVar, C52727e eVar2) {
                this.f123996a = cVar;
                this.f123997b = cVar2;
                this.f123998c = eVar;
                this.f123999d = eVar2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Integer num;
                C49395cx.m106556c(this.f123997b.f123995a).f123270c.setValue(Boolean.valueOf(false));
                String str = this.f123997b.f123995a.f123989t;
                if (str != null) {
                    num = Integer.valueOf(this.f123996a.mo43007a(str, (String[]) this.f123998c.element, (String[]) this.f123999d.element));
                } else {
                    num = null;
                }
                C49395cx.m106556c(this.f123997b.f123995a).f123270c.setValue(Boolean.valueOf(true));
                if (num != null && num.intValue() == 0) {
                    C0198r m = C49395cx.m106558d(this.f123997b.f123995a).mo110468m();
                    C52711k.m112236a((Object) m, "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData");
                    VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) m.getValue();
                    C0198r e = C49395cx.m106558d(this.f123997b.f123995a).mo110460e();
                    C52711k.m112236a((Object) e, "mVEVideoPublishEditViewModel.previewMusicParams");
                    VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) e.getValue();
                    if (vEPreviewMusicParams != null) {
                        vEPreviewMusicParams.f131135b = C49395cx.m106553b(this.f123997b.f123995a).mo97035e().mMusicStart;
                        C0198r e2 = C49395cx.m106558d(this.f123997b.f123995a).mo110460e();
                        C52711k.m112236a((Object) e2, "mVEVideoPublishEditViewModel.previewMusicParams");
                        e2.setValue(vEPreviewMusicParams);
                    }
                    if (vEVolumeChangeOp == null) {
                        vEVolumeChangeOp = VEVolumeChangeOp.ofMusic(0.5f);
                    }
                    C0198r m2 = C49395cx.m106558d(this.f123997b.f123995a).mo110468m();
                    C52711k.m112236a((Object) m2, "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData");
                    m2.setValue(vEVolumeChangeOp);
                    this.f123996a.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                    this.f123996a.mo43085r();
                }
                return C52860x.f131107a;
            }
        }

        /* JADX WARNING: type inference failed for: r14v10, types: [T, java.lang.String[]] */
        /* JADX WARNING: type inference failed for: r14v11, types: [T, java.lang.String[]] */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f6, code lost:
            if (r6.mo97739a(r14, new java.io.File(r7), 100, android.graphics.Bitmap.CompressFormat.PNG) != false) goto L_0x00fa;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v10, types: [T, java.lang.String[]]
          assigns: [java.lang.String[]]
          uses: [?[OBJECT, ARRAY][], T]
          mth insns count: 117
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                d.f.b.v$e r0 = new d.f.b.v$e
                r0.<init>()
                r1 = 0
                java.lang.String[] r2 = new java.lang.String[r1]
                r0.element = r2
                d.f.b.v$e r2 = new d.f.b.v$e
                r2.<init>()
                java.lang.String[] r3 = new java.lang.String[r1]
                r2.element = r3
                r3 = 0
                r4 = 1
                if (r14 == 0) goto L_0x0127
                int r5 = r14.arg1
                if (r5 != r4) goto L_0x0127
                java.lang.Object r5 = r14.obj
                if (r5 == 0) goto L_0x011f
                java.lang.String r5 = (java.lang.String) r5
                int r14 = r14.arg2
                if (r14 != r4) goto L_0x00fd
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                int r6 = r14.f123985p
                if (r6 > 0) goto L_0x003e
                com.ss.android.ugc.gamora.editor.EditViewModel r6 = r14.f123982m
                if (r6 != 0) goto L_0x0034
                java.lang.String r7 = "mEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r7)
            L_0x0034:
                com.ss.android.ugc.aweme.shortvideo.edit.bd r6 = r6.mo97036f()
                int r6 = r6.mo88381c()
                r14.f123985p = r6
            L_0x003e:
                int r14 = r14.f123985p
                com.ss.android.ugc.gamora.recorder.o.g r6 = com.p683ss.android.ugc.gamora.recorder.p2481o.C49939g.f125127a
                java.lang.String r7 = "srcPath"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
                boolean r7 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r5)
                if (r7 == 0) goto L_0x00f9
                int r7 = com.p683ss.android.ugc.gamora.recorder.p2481o.C49939g.m107757a(r5)
                android.graphics.Bitmap r14 = r6.mo97738a(r5, r14, r7)
                if (r14 != 0) goto L_0x0059
                goto L_0x00f9
            L_0x0059:
                java.io.File r7 = new java.io.File
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                android.app.Application r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()
                java.lang.String r10 = "CameraClient.getApplication()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                java.io.File r9 = r9.getFilesDir()
                java.lang.String r10 = "CameraClient.getApplication().filesDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
                java.lang.String r9 = r9.getAbsolutePath()
                r8.append(r9)
                java.lang.String r9 = java.io.File.separator
                r8.append(r9)
                java.lang.String r9 = "status"
                r8.append(r9)
                java.lang.String r9 = java.io.File.separator
                r8.append(r9)
                java.lang.String r9 = "resizeImage"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.io.File r9 = new java.io.File
                r9.<init>(r8)
                boolean r9 = r9.exists()
                if (r9 != 0) goto L_0x00a4
                java.io.File r9 = new java.io.File
                r9.<init>(r8)
                r9.mkdirs()
            L_0x00a4:
                java.io.File r9 = new java.io.File
                r9.<init>(r8)
                java.lang.String r8 = ".bmp"
                java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat
                java.lang.String r11 = "yyyy-MM-dd-HHmmssSSS"
                java.util.Locale r12 = java.util.Locale.US
                r10.<init>(r11, r12)
                java.lang.String r11 = "GMT+8"
                java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r11)
                java.util.Calendar r11 = java.util.Calendar.getInstance(r11)
                java.lang.String r12 = "calendar"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
                java.util.Date r11 = r11.getTime()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r10 = r10.format(r11)
                r12.append(r10)
                r12.append(r8)
                java.lang.String r8 = r12.toString()
                r7.<init>(r9, r8)
                java.lang.String r7 = r7.getPath()
                java.io.File r8 = new java.io.File
                r8.<init>(r7)
                r8.createNewFile()
                java.io.File r8 = new java.io.File
                r8.<init>(r7)
                r9 = 100
                android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG
                boolean r14 = r6.mo97739a(r14, r8, r9, r10)
                if (r14 == 0) goto L_0x00f9
                goto L_0x00fa
            L_0x00f9:
                r7 = r3
            L_0x00fa:
                if (r7 == 0) goto L_0x00fd
                r5 = r7
            L_0x00fd:
                java.lang.String[] r14 = new java.lang.String[r4]
                r14[r1] = r5
                r0.element = r14
                java.lang.String[] r14 = new java.lang.String[r4]
                java.lang.String r6 = "bgimg"
                r14[r1] = r6
                r2.element = r14
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = com.p683ss.android.ugc.gamora.editor.C49395cx.m106553b(r14)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r14.mo97035e()
                com.ss.android.ugc.aweme.status.StatusCreateVideoData r14 = r14.statusCreateVideoData
                r14.setBgPath(r5)
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                r14.f123990u = r4
                goto L_0x013c
            L_0x011f:
                d.u r14 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                r14.<init>(r0)
                throw r14
            L_0x0127:
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = com.p683ss.android.ugc.gamora.editor.C49395cx.m106553b(r14)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r14.mo97035e()
                com.ss.android.ugc.aweme.status.StatusCreateVideoData r14 = r14.statusCreateVideoData
                java.lang.String r5 = ""
                r14.setBgPath(r5)
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                r14.f123990u = r1
            L_0x013c:
                com.ss.android.ugc.gamora.editor.cx r14 = r13.f123995a
                com.ss.android.ugc.asve.c.c r14 = r14.f123984o
                if (r14 == 0) goto L_0x014f
                r5 = 0
                com.ss.android.ugc.gamora.editor.cx$c$a r1 = new com.ss.android.ugc.gamora.editor.cx$c$a
                r1.<init>(r14, r13, r0, r2)
                d.f.a.a r1 = (p2628d.p2639f.p2640a.C52670a) r1
                com.p683ss.android.ugc.aweme.utils.C47900ft.m103619a(0, r1)
                return
            L_0x014f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49395cx.C49398c.handleMessage(android.os.Message):void");
        }

        C49398c(C49395cx cxVar, Looper looper) {
            this.f123995a = cxVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$d */
    public static final class C49400d implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124000a;

        /* renamed from: b */
        final /* synthetic */ C49923d f124001b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            String str;
            Effect effect = (Effect) obj;
            if (effect != null) {
                str = effect.getUnzipPath();
            } else {
                str = null;
            }
            if (str != null) {
                String a = C49937f.m107756a(str);
                if (a != null) {
                    this.f124001b.f125095a = a;
                    this.f124000a.mo97334a(this.f124001b);
                }
            }
            C49395cx.m106552a(true, this.f124001b.f125096b, (Exception) null);
        }

        C49400d(C49395cx cxVar, C49923d dVar) {
            this.f124000a = cxVar;
            this.f124001b = dVar;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C49395cx.m106552a(false, this.f124001b.f125096b, dVar.f122281c);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$e */
    static final class C49401e extends C52712l implements C52670a<HandlerThread> {

        /* renamed from: a */
        public static final C49401e f124002a = new C49401e();

        C49401e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            HandlerThread handlerThread = new HandlerThread("status_change_background");
            handlerThread.start();
            return handlerThread;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$f */
    public static final class C49402f implements C44704c {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124003a;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        C49402f(C49395cx cxVar) {
            this.f124003a = cxVar;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            Integer num;
            if (fVar != null) {
                C49395cx.m106551a(this.f124003a).mo97730a(fVar.f113161e);
            }
            String str = "enter_background_tab";
            C42438az a = C42438az.m93209a().mo86526a("enter_from", "video_edit_page").mo86526a("shoot_way", C49395cx.m106553b(this.f124003a).mo97035e().mShootWay).mo86526a("creation_id", C49395cx.m106553b(this.f124003a).mo97035e().creationId).mo86526a("content_type", "status");
            String str2 = "tab_name";
            if (fVar != null) {
                num = Integer.valueOf(fVar.f113161e);
            } else {
                num = null;
            }
            if (num == null) {
                C52711k.m112234a();
            }
            C26890h.m65011a(str, a.mo86526a(str2, C49395cx.m106559d(num.intValue())).f107329a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$g */
    static final class C49403g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124004a;

        C49403g(C49395cx cxVar) {
            this.f124004a = cxVar;
        }

        public final void onClick(View view) {
            Integer num;
            ClickInstrumentation.onClick(view);
            this.f124004a.mo97335a(false);
            if (!C52711k.m112239a((Object) this.f124004a.f123987r, (Object) this.f124004a.f123986q)) {
                if (this.f124004a.f123986q == null) {
                    C49395cx cxVar = this.f124004a;
                    Message message = new Message();
                    message.what = 1;
                    message.arg1 = 0;
                    cxVar.f123991v.removeMessages(1);
                    cxVar.f123991v.sendMessage(message);
                    C49925e a = C49395cx.m106551a(this.f124004a);
                    C52847n<Integer, Integer> nVar = a.f125110n;
                    if (nVar != null) {
                        num = (Integer) nVar.getFirst();
                    } else {
                        num = null;
                    }
                    if (num != null && num.intValue() == 0) {
                        C49917c cVar = a.f125102f;
                        if (cVar != null) {
                            cVar.mo97726b();
                        }
                    } else if (num != null && num.intValue() == 1) {
                        C49917c cVar2 = a.f125103g;
                        if (cVar2 != null) {
                            cVar2.mo97726b();
                        }
                    } else if (num != null && num.intValue() == 2) {
                        C49917c cVar3 = a.f125104h;
                        if (cVar3 != null) {
                            cVar3.mo97726b();
                        }
                    }
                    return;
                }
                C49923d dVar = this.f124004a.f123986q;
                if (dVar != null) {
                    this.f124004a.mo97334a(dVar);
                    C49925e a2 = C49395cx.m106551a(this.f124004a);
                    C52847n<Integer, Integer> nVar2 = a2.f125109m;
                    if (nVar2 != null) {
                        int intValue = ((Number) nVar2.getFirst()).intValue();
                        int intValue2 = ((Number) nVar2.getSecond()).intValue();
                        switch (intValue) {
                            case 0:
                                C49917c cVar4 = a2.f125102f;
                                if (cVar4 != null) {
                                    cVar4.mo97725a(intValue2);
                                    break;
                                }
                                break;
                            case 1:
                                C49917c cVar5 = a2.f125103g;
                                if (cVar5 != null) {
                                    cVar5.mo97725a(intValue2);
                                    break;
                                }
                                break;
                            case 2:
                                C49917c cVar6 = a2.f125104h;
                                if (cVar6 != null) {
                                    cVar6.mo97725a(intValue2);
                                    break;
                                }
                                break;
                        }
                    }
                    a2.f125110n = a2.f125109m;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$h */
    static final class C49404h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124005a;

        C49404h(C49395cx cxVar) {
            this.f124005a = cxVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f124005a.mo97335a(false);
            C49925e a = C49395cx.m106551a(this.f124005a);
            a.f125109m = a.f125110n;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$i */
    static final class C49405i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124006a;

        C49405i(C49395cx cxVar) {
            this.f124006a = cxVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C49395cx cxVar = this.f124006a;
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            bundle.putInt("key_support_flag", 1);
            C46409q a = C46073p.m100128a();
            Activity activity = cxVar.f33840g_;
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            a.mo48310a(activity, bundle, C46476a.m100890a(), C46476a.m100890a());
            C26890h.m65011a("click_upload_background", C42438az.m93209a().mo86526a("enter_from", "video_edit_page").mo86526a("shoot_way", C49395cx.m106553b(this.f124006a).mo97035e().mShootWay).mo86526a("creation_id", C49395cx.m106553b(this.f124006a).mo97035e().creationId).mo86526a("content_type", "status").f107329a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$j */
    public static final class C49406j implements C49919b {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124007a;

        C49406j(C49395cx cxVar) {
            this.f124007a = cxVar;
        }

        /* renamed from: a */
        public final void mo97340a(C49923d dVar, int i) {
            C52711k.m112240b(dVar, "model");
            this.f124007a.mo97334a(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$k */
    static final class C49407k implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124008a;

        C49407k(C49395cx cxVar) {
            this.f124008a = cxVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f124008a.mo97335a(false);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$l */
    static final class C49408l implements C50711k {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124009a;

        C49408l(C49395cx cxVar) {
            this.f124009a = cxVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                C49395cx cxVar = this.f124009a;
                boolean z = true;
                if (!cxVar.f123991v.hasMessages(1)) {
                    Effect effect = null;
                    C47900ft.m103619a(0, new C49411o(cxVar));
                    C49923d dVar = cxVar.f123987r;
                    if (dVar != null) {
                        effect = dVar.f125096b;
                    }
                    if (effect != null) {
                        z = false;
                    }
                    if (z) {
                        EditViewModel editViewModel = cxVar.f123982m;
                        if (editViewModel == null) {
                            C52711k.m112237a("mEditViewModel");
                        }
                        StatusCreateVideoData statusCreateVideoData = editViewModel.mo97035e().statusCreateVideoData;
                        String str2 = "upload_background_end";
                        C42438az a = C42438az.m93209a().mo86526a("enter_from", "video_edit_page");
                        String str3 = "shoot_way";
                        EditViewModel editViewModel2 = cxVar.f123982m;
                        if (editViewModel2 == null) {
                            C52711k.m112237a("mEditViewModel");
                        }
                        C42438az a2 = a.mo86526a(str3, editViewModel2.mo97035e().mShootWay);
                        String str4 = "creation_id";
                        EditViewModel editViewModel3 = cxVar.f123982m;
                        if (editViewModel3 == null) {
                            C52711k.m112237a("mEditViewModel");
                        }
                        C26890h.m65011a(str2, a2.mo86526a(str4, editViewModel3.mo97035e().creationId).mo86526a("content_type", "status").mo86524a("upload_duration", System.currentTimeMillis() - cxVar.f123988s).mo86523a("size", statusCreateVideoData.getBgSize()).mo86523a("width", statusCreateVideoData.getBgWidth()).mo86523a("height", statusCreateVideoData.getBgHeight()).f107329a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$m */
    static final class C49409m<T> implements C0781c<Void> {

        /* renamed from: a */
        public static final C49409m f124010a = new C49409m();

        C49409m() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$n */
    static final class C49410n<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124011a;

        /* renamed from: b */
        final /* synthetic */ C49923d f124012b;

        C49410n(C49395cx cxVar, C49923d dVar) {
            this.f124011a = cxVar;
            this.f124012b = dVar;
        }

        public final /* synthetic */ Object call() {
            int[] a = C38681j.m86037a(this.f124012b.f125095a);
            long length = new File(this.f124012b.f125095a).length();
            StatusCreateVideoData statusCreateVideoData = C49395cx.m106553b(this.f124011a).mo97035e().statusCreateVideoData;
            statusCreateVideoData.setBgSize((int) length);
            statusCreateVideoData.setBgWidth(a[0]);
            statusCreateVideoData.setBgHeight(a[1]);
            String str = this.f124012b.f125095a;
            if (str != null) {
                statusCreateVideoData.setBgSrcImage(str);
            }
            C26890h.m65011a("upload_background_start", C42438az.m93209a().mo86526a("enter_from", "video_edit_page").mo86526a("shoot_way", C49395cx.m106553b(this.f124011a).mo97035e().mShootWay).mo86526a("creation_id", C49395cx.m106553b(this.f124011a).mo97035e().creationId).mo86526a("content_type", "status").mo86524a("size", new File(this.f124012b.f125095a).length()).mo86523a("width", a[0]).mo86523a("height", a[1]).f107329a);
            this.f124011a.f123988s = System.currentTimeMillis();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cx$o */
    static final class C49411o extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49395cx f124013a;

        C49411o(C49395cx cxVar) {
            this.f124013a = cxVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            C12932b.m25978a(this.f124013a, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49411o f124014a;

                {
                    this.f124014a = r1;
                }

                public final void run() {
                    C49395cx.m106556c(this.f124014a.f124013a).f123269b.setValue(Boolean.valueOf(false));
                }
            }, 200);
            C49925e a = C49395cx.m106551a(this.f124013a);
            C52847n<Integer, Integer> nVar = a.f125110n;
            if (nVar != null) {
                num = (Integer) nVar.getFirst();
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C49917c cVar = a.f125102f;
                if (cVar != null) {
                    cVar.mo97724a();
                }
            } else if (num != null && num.intValue() == 1) {
                C49917c cVar2 = a.f125103g;
                if (cVar2 != null) {
                    cVar2.mo97724a();
                }
            } else if (num != null && num.intValue() == 2) {
                C49917c cVar3 = a.f125104h;
                if (cVar3 != null) {
                    cVar3.mo97724a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    private final HandlerThread m106555c() {
        return (HandlerThread) this.f123977C.getValue();
    }

    /* renamed from: d */
    public static String m106559d(int i) {
        switch (i) {
            case 0:
                return "album";
            case 1:
                return "template";
            case 2:
                return "wallpaper";
            default:
                return "unknown";
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        if (VERSION.SDK_INT >= 18) {
            m106555c().quitSafely();
        } else {
            m106555c().quit();
        }
    }

    /* renamed from: d */
    private final int m106557d() {
        return ((C43303dy.m94974e(this.f33840g_) - ((int) C9432q.m18687b((Context) this.f33840g_, 200.0f))) - C43303dy.m94972c(this.f33840g_)) - C43303dy.m94973d(this.f33840g_);
    }

    /* renamed from: a */
    public static final /* synthetic */ C49925e m106551a(C49395cx cxVar) {
        C49925e eVar = cxVar.f123980k;
        if (eVar == null) {
            C52711k.m112237a("panelManager");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m106553b(C49395cx cxVar) {
        EditViewModel editViewModel = cxVar.f123982m;
        if (editViewModel == null) {
            C52711k.m112237a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VEVideoPublishEditViewModel m106558d(C49395cx cxVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = cxVar.f123981l;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("mVEVideoPublishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: b */
    private final void m106554b(C49923d dVar) {
        C29252f fVar = this.f123975A;
        if (fVar == null) {
            C52711k.m112237a("mEffectPlatform");
        }
        fVar.mo59123a(dVar.f125096b, (C48705j) new C49400d(this, dVar));
    }

    /* renamed from: c */
    public static final /* synthetic */ StatusViewModel m106556c(C49395cx cxVar) {
        StatusViewModel statusViewModel = cxVar.f123983n;
        if (statusViewModel == null) {
            C52711k.m112237a("mStatusViewModel");
        }
        return statusViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97334a(com.p683ss.android.ugc.gamora.recorder.p2481o.C49923d r6) {
        /*
            r5 = this;
            r5.f123987r = r6
            java.lang.String r0 = r6.f125095a
            if (r0 != 0) goto L_0x000a
            r5.m106554b(r6)
            return
        L_0x000a:
            com.ss.android.ugc.gamora.editor.StatusViewModel r0 = r5.f123983n
            if (r0 != 0) goto L_0x0013
            java.lang.String r1 = "mStatusViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0013:
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f123269b
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r2)
            java.lang.String r0 = r6.f125095a
            if (r0 == 0) goto L_0x0038
            android.os.Message r2 = new android.os.Message
            r2.<init>()
            r2.what = r1
            r2.arg1 = r1
            r2.arg2 = r1
            r2.obj = r0
            com.ss.android.ugc.gamora.editor.cx$c r0 = r5.f123991v
            r0.removeMessages(r1)
            com.ss.android.ugc.gamora.editor.cx$c r0 = r5.f123991v
            r0.sendMessage(r2)
        L_0x0038:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.f125096b
            if (r0 == 0) goto L_0x00dd
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f123982m
            if (r0 != 0) goto L_0x0045
            java.lang.String r2 = "mEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r0.statusCreateVideoData
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r6.f125096b
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r2.getEffectId()
            if (r2 != 0) goto L_0x0057
        L_0x0055:
            java.lang.String r2 = ""
        L_0x0057:
            r0.setBgId(r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r5.f123994z
            if (r2 != 0) goto L_0x0063
            java.lang.String r3 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0063:
            int r2 = r2.getSelectedTabPosition()
            if (r2 != r1) goto L_0x006c
            java.lang.String r1 = "template_pic"
            goto L_0x006e
        L_0x006c:
            java.lang.String r1 = "wallpaper"
        L_0x006e:
            r0.setBgFrom(r1)
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f125096b
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = "select_background"
            com.ss.android.ugc.aweme.shortvideo.az r1 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f123982m
            if (r3 != 0) goto L_0x008e
            java.lang.String r4 = "mEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r3)
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f123982m
            if (r3 != 0) goto L_0x00a3
            java.lang.String r4 = "mEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00a3:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r3)
            java.lang.String r2 = "content_type"
            java.lang.String r3 = "status"
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r3)
            java.lang.String r2 = "tab_name"
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r3 = r5.f123994z
            if (r3 != 0) goto L_0x00c0
            java.lang.String r4 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00c0:
            int r3 = r3.getSelectedTabPosition()
            java.lang.String r3 = m106559d(r3)
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r2, r3)
            java.lang.String r2 = "background_id"
            java.lang.String r6 = r6.getEffectId()
            com.ss.android.ugc.aweme.shortvideo.az r6 = r1.mo86526a(r2, r6)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f107329a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r6)
            goto L_0x0100
        L_0x00dc:
            return
        L_0x00dd:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f123982m
            if (r0 != 0) goto L_0x00e6
            java.lang.String r1 = "mEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00e6:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r0.statusCreateVideoData
            java.lang.String r1 = ""
            r0.setBgId(r1)
            java.lang.String r1 = "upload"
            r0.setBgFrom(r1)
            com.ss.android.ugc.gamora.editor.cx$n r0 = new com.ss.android.ugc.gamora.editor.cx$n
            r0.<init>(r5, r6)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            p001a.C0013i.m16a(r0)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49395cx.mo97334a(com.ss.android.ugc.gamora.recorder.o.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r5) {
        /*
            r4 = this;
            super.mo24448e(r5)
            r5 = 2132018277(0x7f140465, float:1.9674856E38)
            android.view.View r5 = r4.mo24464b(r5)
            if (r5 != 0) goto L_0x000f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000f:
            r4.f123993y = r5
            r5 = 2132023227(0x7f1417bb, float:1.9684896E38)
            android.view.View r5 = r4.mo24464b(r5)
            if (r5 != 0) goto L_0x001d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001d:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout) r5
            r4.f123994z = r5
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r4.f123994z
            if (r5 != 0) goto L_0x002a
            java.lang.String r0 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x002a:
            java.util.List<java.lang.Integer> r0 = r4.f123976B
            int r0 = r0.size()
            r5.setMaxTabModeForCount(r0)
            java.util.List<java.lang.Integer> r5 = r4.f123976B
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x003b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.app.Activity r1 = r4.f33840g_
            android.content.Context r1 = (android.content.Context) r1
            r2 = 1
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a.m101615a(r1, r2)
            r1.setText(r0)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r4.f123994z
            if (r0 != 0) goto L_0x0060
            java.lang.String r2 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0060:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r4.f123994z
            if (r2 != 0) goto L_0x0069
            java.lang.String r3 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0069:
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r2 = r2.mo90678a()
            android.view.View r1 = (android.view.View) r1
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r1 = r2.mo90742a(r1)
            r0.mo90684a(r1)
            goto L_0x003b
        L_0x0077:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r4.f123994z
            if (r5 != 0) goto L_0x0080
            java.lang.String r0 = "mTabLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0080:
            com.ss.android.ugc.gamora.editor.cx$f r0 = new com.ss.android.ugc.gamora.editor.cx$f
            r0.<init>(r4)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c r0 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c) r0
            r5.mo90683a(r0)
            r5 = 2132019953(0x7f140af1, float:1.9678255E38)
            android.view.View r5 = r4.mo24464b(r5)
            if (r5 == 0) goto L_0x009d
            com.ss.android.ugc.gamora.editor.cx$g r0 = new com.ss.android.ugc.gamora.editor.cx$g
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x009d:
            r5 = 2132020234(0x7f140c0a, float:1.9678825E38)
            android.view.View r5 = r4.mo24464b(r5)
            if (r5 == 0) goto L_0x00b0
            com.ss.android.ugc.gamora.editor.cx$h r0 = new com.ss.android.ugc.gamora.editor.cx$h
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
        L_0x00b0:
            com.ss.android.ugc.gamora.recorder.o.e r5 = new com.ss.android.ugc.gamora.recorder.o.e
            r0 = 2132020451(0x7f140ce3, float:1.9679266E38)
            android.view.View r0 = r4.mo24464b(r0)
            if (r0 != 0) goto L_0x00be
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00be:
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.<init>(r0)
            r4.f123980k = r5
            com.ss.android.ugc.gamora.recorder.o.e r5 = r4.f123980k
            if (r5 != 0) goto L_0x00ce
            java.lang.String r0 = "panelManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00ce:
            com.ss.android.ugc.gamora.editor.cx$i r0 = new com.ss.android.ugc.gamora.editor.cx$i
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.f125101e = r0
            com.ss.android.ugc.gamora.recorder.o.e r5 = r4.f123980k
            if (r5 != 0) goto L_0x00e0
            java.lang.String r0 = "panelManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00e0:
            com.ss.android.ugc.gamora.editor.cx$j r0 = new com.ss.android.ugc.gamora.editor.cx$j
            r0.<init>(r4)
            com.ss.android.ugc.gamora.recorder.o.c$b r0 = (com.p683ss.android.ugc.gamora.recorder.p2481o.C49917c.C49919b) r0
            r5.f125108l = r0
            com.ss.android.ugc.gamora.recorder.o.e r5 = r4.f123980k
            if (r5 != 0) goto L_0x00f2
            java.lang.String r0 = "panelManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00f2:
            r0 = 0
            r5.mo97730a(r0)
            android.app.Activity r5 = r4.f33840g_
            if (r5 == 0) goto L_0x01eb
            android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
            android.arch.lifecycle.y r5 = android.arch.lifecycle.C0214z.m440a(r5)
            java.lang.Class<dmt.av.video.VEVideoPublishEditViewModel> r0 = dmt.p2652av.video.VEVideoPublishEditViewModel.class
            android.arch.lifecycle.x r5 = r5.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…ditViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            dmt.av.video.VEVideoPublishEditViewModel r5 = (dmt.p2652av.video.VEVideoPublishEditViewModel) r5
            r4.f123981l = r5
            android.app.Activity r5 = r4.f33840g_
            if (r5 == 0) goto L_0x01e3
            android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
            com.ss.android.ugc.gamora.b.c r5 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r5)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditViewModel> r0 = com.p683ss.android.ugc.gamora.editor.EditViewModel.class
            com.bytedance.jedi.arch.JediViewModel r5 = r5.mo96760a(r0)
            java.lang.String r0 = "JediViewModelProviders.o…ditViewModel::class.java]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = (com.p683ss.android.ugc.gamora.editor.EditViewModel) r5
            r4.f123982m = r5
            android.app.Activity r5 = r4.f33840g_
            if (r5 == 0) goto L_0x01db
            android.support.v4.app.FragmentActivity r5 = (android.support.p030v4.app.FragmentActivity) r5
            android.arch.lifecycle.y r5 = android.arch.lifecycle.C0214z.m440a(r5)
            java.lang.Class<com.ss.android.ugc.gamora.editor.StatusViewModel> r0 = com.p683ss.android.ugc.gamora.editor.StatusViewModel.class
            android.arch.lifecycle.x r5 = r5.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…tusViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.gamora.editor.StatusViewModel r5 = (com.p683ss.android.ugc.gamora.editor.StatusViewModel) r5
            r4.f123983n = r5
            android.app.Activity r5 = r4.f33840g_
            if (r5 == 0) goto L_0x01d3
            android.content.Context r5 = (android.content.Context) r5
            r0 = 2
            r1 = 0
            com.ss.android.ugc.aweme.effectplatform.f r5 = com.p683ss.android.ugc.aweme.effectplatform.C29242c.m68869a(r5, null)
            r4.f123975A = r5
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r4.f123982m
            if (r5 != 0) goto L_0x0158
            java.lang.String r0 = "mEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0158:
            android.arch.lifecycle.r r5 = r5.mo97038h()
            java.lang.Object r5 = r5.getValue()
            com.ss.android.ugc.asve.c.c r5 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r5
            r4.f123984o = r5
            dmt.av.video.VEVideoPublishEditViewModel r5 = r4.f123981l
            if (r5 != 0) goto L_0x016d
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x016d:
            android.arch.lifecycle.r r5 = r5.mo110455a()
            java.lang.String r0 = "mVEVideoPublishEditViewModel.previewParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            java.lang.Object r5 = r5.getValue()
            dmt.av.video.VEPreviewParams r5 = (dmt.p2652av.video.VEPreviewParams) r5
            if (r5 == 0) goto L_0x0187
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r5 = r5.statusCreateVideoData
            if (r5 == 0) goto L_0x0187
            java.lang.String r5 = r5.getEffectPath()
            goto L_0x0188
        L_0x0187:
            r5 = r1
        L_0x0188:
            r4.f123989t = r5
            com.ss.android.ugc.asve.c.c r5 = r4.f123984o
            if (r5 == 0) goto L_0x0198
            com.ss.android.ugc.gamora.editor.cx$l r0 = new com.ss.android.ugc.gamora.editor.cx$l
            r0.<init>(r4)
            com.ss.android.vesdk.k r0 = (com.p683ss.android.vesdk.C50711k) r0
            r5.mo43039b(r0)
        L_0x0198:
            dmt.av.video.VEVideoPublishEditViewModel r5 = r4.f123981l
            if (r5 != 0) goto L_0x01a1
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01a1:
            android.arch.lifecycle.r r5 = r5.mo110455a()
            java.lang.String r0 = "mVEVideoPublishEditViewModel.previewParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            java.lang.Object r5 = r5.getValue()
            dmt.av.video.VEPreviewParams r5 = (dmt.p2652av.video.VEPreviewParams) r5
            if (r5 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r5 = r5.statusCreateVideoData
            if (r5 == 0) goto L_0x01bb
            java.lang.String r5 = r5.getBgPath()
            goto L_0x01bc
        L_0x01bb:
            r5 = r1
        L_0x01bc:
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01d2
            if (r5 == 0) goto L_0x01cc
            com.ss.android.ugc.gamora.recorder.o.d r1 = new com.ss.android.ugc.gamora.recorder.o.d
            r1.<init>(r5)
        L_0x01cc:
            r4.f123986q = r1
            com.ss.android.ugc.gamora.recorder.o.d r5 = r4.f123986q
            r4.f123987r = r5
        L_0x01d2:
            return
        L_0x01d3:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Context"
            r5.<init>(r0)
            throw r5
        L_0x01db:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r5.<init>(r0)
            throw r5
        L_0x01e3:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r5.<init>(r0)
            throw r5
        L_0x01eb:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49395cx.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo97335a(boolean z) {
        boolean z2 = z;
        View view = this.f123993y;
        if (view == null) {
            C52711k.m112237a("mView");
        }
        C29218v.m68806a(view, z, (int) C9432q.m18687b((Context) this.f33840g_, 198.0f), this.f123992x, 200, C49409m.f124010a);
        if (z2) {
            AVDmtTabLayout aVDmtTabLayout = this.f123994z;
            if (aVDmtTabLayout == null) {
                C52711k.m112237a("mTabLayout");
            }
            AVDmtTabLayout aVDmtTabLayout2 = this.f123994z;
            if (aVDmtTabLayout2 == null) {
                C52711k.m112237a("mTabLayout");
            }
            aVDmtTabLayout.mo90693b(aVDmtTabLayout2.mo90679a(0));
            this.f123986q = this.f123987r;
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123981l;
            if (vEVideoPublishEditViewModel == null) {
                C52711k.m112237a("mVEVideoPublishEditViewModel");
            }
            C0198r g = vEVideoPublishEditViewModel.mo110462g();
            C52711k.m112236a((Object) g, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
            g.setValue(C52905a.m112589a(C52904aa.f131229l, C46788b.f118235d.mo94007a(true, false, false, false, false), ((int) C9432q.m18687b((Context) this.f33840g_, 0.0f)) + C43303dy.m94972c(this.f33840g_), (int) C9432q.m18687b((Context) this.f33840g_, 198.0f), m106557d(), C22452a.m55498d(), 0, false, true, false, false, 768, null));
            String str = "click_background_entrance";
            C42438az a = C42438az.m93209a().mo86526a("enter_from", "video_edit_page");
            String str2 = "shoot_way";
            EditViewModel editViewModel = this.f123982m;
            if (editViewModel == null) {
                C52711k.m112237a("mEditViewModel");
            }
            C42438az a2 = a.mo86526a(str2, editViewModel.mo97035e().mShootWay);
            String str3 = "creation_id";
            EditViewModel editViewModel2 = this.f123982m;
            if (editViewModel2 == null) {
                C52711k.m112237a("mEditViewModel");
            }
            C26890h.m65011a(str, a2.mo86526a(str3, editViewModel2.mo97035e().creationId).mo86526a("content_source", "upload").mo86526a("content_type", "status").f107329a);
        } else {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123981l;
            if (vEVideoPublishEditViewModel2 == null) {
                C52711k.m112237a("mVEVideoPublishEditViewModel");
            }
            C0198r g2 = vEVideoPublishEditViewModel2.mo110462g();
            C52711k.m112236a((Object) g2, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
            g2.setValue(C52905a.m112586a(mo24478w().getColor(R.color.ip), ((int) C9432q.m18687b((Context) this.f33840g_, 0.0f)) + C43303dy.m94972c(this.f33840g_), (int) C9432q.m18687b((Context) this.f33840g_, 198.0f), m106557d(), C22452a.m55498d(), 0));
        }
        C49397b bVar = this.f123979j;
        if (bVar != null) {
            bVar.mo97199a(z2);
        }
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.br_, viewGroup, false);
        if (inflate != null) {
            this.f123992x = (ViewGroup) inflate;
            ViewGroup viewGroup2 = this.f123992x;
            if (viewGroup2 == null) {
                C52711k.m112234a();
            }
            return viewGroup2;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106552a(boolean r6, com.p683ss.android.ugc.effectmanager.effect.model.Effect r7, java.lang.Exception r8) {
        /*
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x000a
            java.lang.String r6 = "status_bg_download_error_state"
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r6, r0, r1)
            return
        L_0x000a:
            java.lang.String r6 = "status_bg_download_error_state"
            r2 = 1
            com.ss.android.ugc.aweme.app.f.c r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r4 = "url"
            if (r7 == 0) goto L_0x0028
            com.ss.android.ugc.effectmanager.common.model.UrlModel r5 = r7.getFileUrl()
            if (r5 == 0) goto L_0x0028
            java.util.List r5 = r5.getUrlList()
            if (r5 == 0) goto L_0x0028
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            com.ss.android.ugc.aweme.app.f.c r0 = r3.mo47824a(r4, r0)
            java.lang.String r3 = "mv_res_id"
            if (r7 == 0) goto L_0x0035
            java.lang.String r1 = r7.getEffectId()
        L_0x0035:
            com.ss.android.ugc.aweme.app.f.c r7 = r0.mo47824a(r3, r1)
            java.lang.String r0 = "exception"
            if (r8 != 0) goto L_0x0040
            java.lang.String r8 = ""
            goto L_0x0046
        L_0x0040:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.String r8 = com.facebook.common.p920d.C13696m.m27668c(r8)
        L_0x0046:
            com.ss.android.ugc.aweme.app.f.c r7 = r7.mo47824a(r0, r8)
            org.json.JSONObject r7 = r7.mo47825b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49395cx.m106552a(boolean, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Exception):void");
    }
}
