package dmt.p2652av.video;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.view.SurfaceView;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43443c;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import com.p683ss.android.ugc.aweme.shortvideo.p2178c.C42484b;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.VEListener.C50552p;
import dmt.p2652av.video.p2653a.C52885a;
import dmt.p2652av.video.p2653a.C52895j;
import dmt.p2652av.video.p2653a.C52896k;
import dmt.p2652av.video.p2653a.C52898l;
import dmt.p2652av.video.p2653a.C52899m;
import dmt.p2652av.video.p2653a.C52901o;
import dmt.p2652av.video.p2653a.C52902p;
import dmt.p2652av.video.p2653a.C52903q;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: dmt.av.video.ad */
public final class C52908ad {

    /* renamed from: A */
    C50711k f131246A;

    /* renamed from: B */
    public C0198r<Boolean> f131247B = new C0198r<>();

    /* renamed from: C */
    boolean f131248C = false;

    /* renamed from: D */
    boolean f131249D = false;

    /* renamed from: E */
    boolean f131250E = false;

    /* renamed from: F */
    volatile boolean f131251F = false;

    /* renamed from: G */
    public C52885a f131252G;

    /* renamed from: H */
    public boolean f131253H = false;

    /* renamed from: I */
    public C0198r<C20347c> f131254I;

    /* renamed from: a */
    Context f131255a;

    /* renamed from: b */
    C0184k f131256b;

    /* renamed from: c */
    SurfaceView f131257c;

    /* renamed from: d */
    public LiveData<VEPreviewParams> f131258d;

    /* renamed from: e */
    public LiveData<VEPreviewMusicParams> f131259e;

    /* renamed from: f */
    public LiveData<C31427a> f131260f;

    /* renamed from: g */
    public LiveData<C53030y> f131261g;

    /* renamed from: h */
    public LiveData<C53026u> f131262h;

    /* renamed from: i */
    public C52970h<C52906ab> f131263i;

    /* renamed from: j */
    public C52970h<C52977l> f131264j;

    /* renamed from: k */
    public C0198r<AudioRecorderParam> f131265k;

    /* renamed from: l */
    public LiveData<VEVolumeChangeOp> f131266l;

    /* renamed from: m */
    public LiveData<C53029x> f131267m;

    /* renamed from: n */
    public C0198r<InfoStickerModel> f131268n;

    /* renamed from: o */
    public C0198r<InfoStickerModel> f131269o;

    /* renamed from: p */
    public C0198r<Boolean> f131270p;

    /* renamed from: q */
    public LiveData<C43442b> f131271q;

    /* renamed from: r */
    public C0198r<C43954a> f131272r;

    /* renamed from: s */
    public VideoPublishEditModel f131273s;

    /* renamed from: t */
    public VEEditorAutoStartStopArbiter f131274t;

    /* renamed from: u */
    public C42484b f131275u;

    /* renamed from: v */
    public C0198r<Integer> f131276v = new C0198r<>();

    /* renamed from: w */
    public C50711k f131277w;

    /* renamed from: x */
    public C50552p f131278x;

    /* renamed from: y */
    public C0198r<Void> f131279y = new C0198r<>();

    /* renamed from: z */
    public C0198r<Void> f131280z = new C0198r<>();

    /* renamed from: a */
    public final void mo110528a(boolean z, boolean z2) {
        if (!this.f131249D) {
            this.f131249D = true;
            this.f131247B.postValue(Boolean.valueOf(z));
            this.f131275u.mo43048c(this.f131246A);
            C32458a.m75144a(z2 ? "receive dld done event" : "not receive dld done event");
        }
    }

    /* renamed from: b */
    public final C52970h<C52977l> mo110529b() {
        if (this.f131264j == null) {
            return new C52970h<>();
        }
        return this.f131264j;
    }

    /* renamed from: a */
    public final void mo110520a() {
        if (this.f131254I != null) {
            this.f131254I.setValue(null);
        }
        if (this.f131275u != null) {
            this.f131275u.mo43082p();
        }
    }

    /* renamed from: a */
    public final void mo110522a(C0198r<Boolean> rVar) {
        this.f131252G.f131172a = rVar;
    }

    /* renamed from: b */
    public final void mo110531b(C0198r<AudioEffectParam> rVar) {
        this.f131252G.f131173b = rVar;
    }

    /* renamed from: a */
    public final void mo110521a(int i) {
        if (this.f131252G != null) {
            this.f131252G.f131187p = i;
        }
    }

    /* renamed from: b */
    public final void mo110530b(int i) {
        if (this.f131252G != null) {
            this.f131252G.f131188s = i;
        }
    }

    public C52908ad(int i) {
        C52885a aVar;
        if (i == 2) {
            aVar = new C52899m();
        } else if (i == 3) {
            aVar = new C52898l();
        } else if (i == 4) {
            aVar = new C52902p();
        } else if (i == 5) {
            aVar = new C52901o();
        } else if (i == 6) {
            aVar = new C52896k();
        } else if (i == 7) {
            aVar = new C52903q();
        } else {
            aVar = new C52895j();
        }
        this.f131252G = aVar;
        if (i == 6) {
            this.f131250E = true;
        }
        this.f131252G.f131185n = C31475n.m73310a(VEVideoPublishEditActivity.f109536b);
    }

    /* renamed from: a */
    public final void mo110525a(ArrayList<EffectPointModel> arrayList) {
        this.f131252G.f131174c = arrayList;
    }

    /* renamed from: a */
    public final void mo110526a(HashMap<Integer, StickerItemModel> hashMap) {
        this.f131252G.mo110493a((InfoStickerModel) this.f131268n.getValue(), hashMap);
    }

    /* renamed from: a */
    public final void mo110527a(boolean z) {
        this.f131252G.f131186o = false;
    }

    /* renamed from: a */
    public final float mo110519a(float f, int i) {
        boolean z;
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioDuetChangeLayout) || this.f131273s == null || !this.f131273s.successEnableAEC || ((!this.f131273s.isDuet() || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableEchoCancellation)) && !this.f131273s.isReaction())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return f;
        }
        if (i == 0) {
            return f * this.f131273s.suggestHumanVolume;
        }
        if (i == 1) {
            return f * this.f131273s.suggestVideoVolume;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo110523a(Context context, C0184k kVar, SurfaceView surfaceView) {
        mo110524a(context, kVar, surfaceView, false);
    }

    /* renamed from: a */
    public final void mo110524a(Context context, C0184k kVar, final SurfaceView surfaceView, boolean z) {
        this.f131248C = z;
        this.f131255a = context;
        this.f131256b = kVar;
        this.f131257c = surfaceView;
        if (context instanceof VEVideoPublishEditActivity) {
            this.f131273s = ((EditViewModel) C48927d.m105736a((VEVideoPublishEditActivity) context).mo96760a(EditViewModel.class)).f123232e;
        }
        this.f131258d.observe(this.f131256b, new C0199s<VEPreviewParams>() {
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x024e, code lost:
                if (r1.veAudioEffectParam != null) goto L_0x0253;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(java.lang.Object r20) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r20
                    dmt.av.video.VEPreviewParams r1 = (dmt.p2652av.video.VEPreviewParams) r1
                    com.ss.android.ugc.aweme.shortvideo.util.b r2 = com.p683ss.android.ugc.aweme.shortvideo.util.C45412b.m98979a()
                    java.lang.String r3 = "av_video_edit"
                    java.lang.String r4 = "VEEditor init start"
                    r2.step(r3, r4)
                    if (r1 == 0) goto L_0x001b
                    int r2 = r1.canvasWidth
                    com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43739b.f110735e = r2
                    int r2 = r1.canvasHeight
                    com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43739b.f110736f = r2
                L_0x001b:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r2 = r2.f131257c
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0030
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = new com.ss.android.ugc.aweme.shortvideo.c.b
                    java.lang.String r6 = r1.mWorkspace
                    r5.<init>(r6)
                    r2.f131275u = r5
                    goto L_0x00b4
                L_0x0030:
                    long r5 = r1.editorHandler
                    r7 = 0
                    int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0058
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = new com.ss.android.ugc.aweme.shortvideo.c.b
                    java.lang.String r6 = r1.mWorkspace
                    dmt.av.video.ad r7 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r7 = r7.f131257c
                    long r8 = r1.editorHandler
                    r5.<init>(r6, r7, r8)
                    r2.f131275u = r5
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    r2.mo43040b(r3)
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    r2.mo43046c(r3)
                    goto L_0x0067
                L_0x0058:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = new com.ss.android.ugc.aweme.shortvideo.c.b
                    java.lang.String r6 = r1.mWorkspace
                    dmt.av.video.ad r7 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r7 = r7.f131257c
                    r5.<init>(r6, r7)
                    r2.f131275u = r5
                L_0x0067:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.VEEditorAutoStartStopArbiter r5 = new dmt.av.video.VEEditorAutoStartStopArbiter
                    dmt.av.video.ad r6 = dmt.p2652av.video.C52908ad.this
                    android.content.Context r6 = r6.f131255a
                    dmt.av.video.ad r7 = dmt.p2652av.video.C52908ad.this
                    android.arch.lifecycle.k r7 = r7.f131256b
                    dmt.av.video.ad r8 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r8 = r8.f131275u
                    dmt.av.video.ad r9 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r9 = r9.f131257c
                    r5.<init>(r6, r7, r8, r9)
                    r2.f131274t = r5
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.VEEditorAutoStartStopArbiter r5 = r5.f131274t
                    r2.f131175d = r5
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    android.view.SurfaceView r5 = r3
                    r2.mo110486a(r5)
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r2 = r1.recordData
                    if (r2 == 0) goto L_0x00a3
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r2 = r1.recordData
                    boolean r2 = r2.isMultiEditRetake
                    if (r2 == 0) goto L_0x00a3
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.VEEditorAutoStartStopArbiter r2 = r2.f131274t
                    r2.f131123b = r4
                L_0x00a3:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.vesdk.VEListener$p r2 = r2.f131278x
                    if (r2 == 0) goto L_0x00b4
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.vesdk.VEListener$p r5 = r5.f131278x
                    r2.mo43016a(r5)
                L_0x00b4:
                    java.lang.String r2 = "yarkey mVEEditor create"
                    com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                    com.ss.android.ugc.aweme.property.h r5 = r5.mo58583n()
                    com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.VeEditorANRDestroy
                    boolean r5 = r5.mo83103a(r6)
                    r5 = r5 ^ r4
                    com.ss.android.vesdk.o r2 = r2.f55837d
                    r2.mo99316a(r5)
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.aj r5 = new dmt.av.video.aj
                    r5.<init>(r0)
                    r2.f131277w = r5
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.vesdk.k r5 = r5.f131277w
                    r2.mo43039b(r5)
                    com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                    com.ss.android.ugc.aweme.property.h r2 = r2.mo58583n()
                    com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSubtitleRecognition
                    boolean r2 = r2.mo83103a(r5)
                    if (r2 == 0) goto L_0x0101
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    dmt.av.video.ak r5 = new dmt.av.video.ak
                    r5.<init>(r0)
                    r2.mo43039b(r5)
                L_0x0101:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    int r5 = r1.mFps
                    r2.mo43067i(r5)
                    int r2 = r1.previewHeight
                    if (r2 <= 0) goto L_0x011d
                    int r2 = r1.previewWidth
                    if (r2 <= 0) goto L_0x011d
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    int r5 = r1.previewWidth
                    int r6 = r1.previewHeight
                    r2.mo43052d(r5, r6)
                L_0x011d:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                    com.ss.android.ugc.aweme.property.h r5 = r5.mo58583n()
                    com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableEffectNewEngineEdit
                    boolean r5 = r5.mo83103a(r6)
                    com.ss.android.vesdk.o r2 = r2.f55837d
                    r2.mo99355c(r5)
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    android.content.Context r5 = r5.f131255a
                    dmt.av.video.ad r6 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r6 = r6.f131275u
                    int r2 = r2.mo110482a(r5, r6, r1)
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r5 = r5.f131257c
                    if (r5 == 0) goto L_0x0166
                    int r5 = r1.canvasWidth
                    if (r5 <= 0) goto L_0x0166
                    int r5 = r1.canvasHeight
                    if (r5 <= 0) goto L_0x0166
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = r5.f131275u
                    com.ss.android.vesdk.o$c r6 = com.p683ss.android.vesdk.C50720o.C50742c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE
                    r5.mo42995a(r6)
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = r5.f131275u
                    int r6 = r1.canvasWidth
                    int r7 = r1.canvasHeight
                    r5.mo43047c(r6, r7)
                L_0x0166:
                    com.ss.android.vesdk.VECherEffectParam r5 = r1.veCherEffectParam
                    if (r5 == 0) goto L_0x01e6
                    com.ss.android.vesdk.VECherEffectParam r5 = r1.veCherEffectParam
                    java.lang.String[] r5 = r5.getMatrix()
                    if (r5 == 0) goto L_0x01e6
                    dmt.av.video.ad r5 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r5 = r5.f131275u
                    com.ss.android.vesdk.VECherEffectParam r6 = r1.veCherEffectParam
                    java.lang.String r7 = "param"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
                    com.ss.android.vesdk.o r5 = r5.f55837d
                    java.lang.String[] r7 = r6.getMatrix()
                    int r7 = r7.length
                    int[] r9 = new int[r7]
                    int[] r13 = new int[r7]
                    int[] r14 = new int[r7]
                    java.lang.String[] r10 = new java.lang.String[r7]
                    int[] r11 = new int[r7]
                    int[] r12 = new int[r7]
                    r8 = 0
                L_0x0191:
                    if (r8 >= r7) goto L_0x01c1
                    r9[r8] = r3
                    r13[r8] = r4
                    java.lang.String r15 = "audio chereffect"
                    r10[r8] = r15
                    r14[r8] = r4
                    double[] r15 = r6.getDuration()
                    int r16 = r8 * 2
                    r3 = r15[r16]
                    int r3 = (int) r3
                    r11[r8] = r3
                    double[] r3 = r6.getDuration()
                    r4 = 1
                    int r16 = r16 + 1
                    r17 = r1
                    r18 = r2
                    r1 = r3[r16]
                    int r1 = (int) r1
                    r12[r8] = r1
                    int r8 = r8 + 1
                    r1 = r17
                    r2 = r18
                    r3 = 0
                    r4 = 1
                    goto L_0x0191
                L_0x01c1:
                    r17 = r1
                    r18 = r2
                    com.ss.android.ttve.nativePort.TEInterface r8 = r5.f127379s
                    int[] r1 = r8.addFilters(r9, r10, r11, r12, r13, r14)
                    r2 = 0
                L_0x01cc:
                    if (r2 >= r7) goto L_0x01e0
                    com.ss.android.ttve.nativePort.TEInterface r3 = r5.f127379s
                    r4 = r1[r2]
                    java.lang.String r8 = "cher_matrix"
                    java.lang.String[] r9 = r6.getMatrix()
                    r9 = r9[r2]
                    r3.setFilterParam(r4, r8, r9)
                    int r2 = r2 + 1
                    goto L_0x01cc
                L_0x01e0:
                    java.lang.String r2 = "editor.addCherEffect(trackIndex, trackType, param)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    goto L_0x01ea
                L_0x01e6:
                    r17 = r1
                    r18 = r2
                L_0x01ea:
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    boolean r2 = r1.f131248C
                    if (r2 == 0) goto L_0x023c
                    dmt.av.video.ai r2 = new dmt.av.video.ai
                    r2.<init>(r1)
                    r1.f131246A = r2
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r1.f131275u
                    com.ss.android.vesdk.k r3 = r1.f131246A
                    r2.mo43039b(r3)
                    com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
                    java.lang.String r3 = "SettingsReader.get()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                    java.lang.Integer r2 = r2.getLightEnhanceThreshold()
                    java.lang.String r3 = "SettingsReader.get().lightEnhanceThreshold"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                    int r2 = r2.intValue()
                    com.ss.android.ugc.aweme.shortvideo.c.b r3 = r1.f131275u
                    com.ss.android.vesdk.o r3 = r3.f55837d
                    com.ss.android.ttve.nativePort.TEInterface r3 = r3.f127379s
                    r3.setDldThrVal(r2)
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r1.f131275u
                    com.ss.android.vesdk.o r2 = r2.f55837d
                    com.ss.android.ttve.nativePort.TEInterface r2 = r2.f127379s
                    r3 = 1
                    r2.setDldEnabled(r3)
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    dmt.av.video.ad$4 r3 = new dmt.av.video.ad$4
                    r3.<init>()
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                    r4 = 2
                    long r4 = r1.toMillis(r4)
                    r2.schedule(r3, r4)
                L_0x023c:
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r1 = r1.f131275u
                    r2 = 1
                    r1.mo43019a(r2)
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    android.view.SurfaceView r1 = r1.f131257c
                    if (r1 != 0) goto L_0x0251
                    r1 = r17
                    com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r1.veAudioEffectParam
                    if (r2 == 0) goto L_0x0266
                    goto L_0x0253
                L_0x0251:
                    r1 = r17
                L_0x0253:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    boolean r2 = r2.f131250E
                    if (r2 == 0) goto L_0x025f
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r2 = r1.recordData
                    boolean r2 = r2.isMultiEditRetake
                    if (r2 != 0) goto L_0x0266
                L_0x025f:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    r2.mo43077n()
                L_0x0266:
                    com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r2 = r1.veAudioRecordParam
                    if (r2 == 0) goto L_0x027f
                    com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r2 = r1.veAudioRecordParam
                    java.lang.String r2 = r2.getAudioUrl()
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 != 0) goto L_0x027f
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    android.arch.lifecycle.r<com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam> r2 = r2.f131265k
                    com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r3 = r1.veAudioRecordParam
                    r2.setValue(r3)
                L_0x027f:
                    com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r1.veAudioEffectParam
                    if (r2 == 0) goto L_0x029d
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.h r2 = r2.mo110529b()
                    if (r2 == 0) goto L_0x029d
                    boolean r2 = r1.fromPublishVideo
                    com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r3 = r1.veAudioEffectParam
                    r4 = 1
                    dmt.av.video.l r2 = dmt.p2652av.video.C52977l.m112704a(r4, r2, r3)
                    dmt.av.video.ad r3 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.h r3 = r3.mo110529b()
                    r3.setValue(r2)
                L_0x029d:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    boolean r2 = r2 instanceof dmt.p2652av.video.p2653a.C52898l
                    if (r2 == 0) goto L_0x02b1
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    float r3 = r1.mMusicVolume
                    r4 = 1
                    r5 = 0
                    r2.mo43021a(r5, r4, r3)
                    goto L_0x02fb
                L_0x02b1:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    boolean r2 = r2 instanceof dmt.p2652av.video.p2653a.C52899m
                    if (r2 != 0) goto L_0x02f0
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    boolean r2 = r2 instanceof dmt.p2652av.video.p2653a.C52901o
                    if (r2 == 0) goto L_0x02c2
                    goto L_0x02f0
                L_0x02c2:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    dmt.av.video.a.a r2 = r2.f131252G
                    boolean r2 = r2 instanceof dmt.p2652av.video.p2653a.C52896k
                    if (r2 == 0) goto L_0x02d5
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    float r3 = r1.mVolume
                    r4 = 0
                    r2.mo43021a(r4, r4, r3)
                    goto L_0x02fb
                L_0x02d5:
                    r4 = 0
                    java.lang.String[] r2 = r1.mAudioPaths
                    if (r2 == 0) goto L_0x02fb
                    java.lang.String[] r2 = r1.mAudioPaths
                    int r2 = r2.length
                    r3 = 1
                    if (r2 != r3) goto L_0x02fb
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    dmt.av.video.ad r3 = dmt.p2652av.video.C52908ad.this
                    float r5 = r1.mVolume
                    float r3 = r3.mo110519a(r5, r4)
                    r2.mo43021a(r4, r4, r3)
                    goto L_0x02fb
                L_0x02f0:
                    r4 = 0
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    float r3 = r1.mMusicVolume
                    r5 = 1
                    r2.mo43021a(r4, r5, r3)
                L_0x02fb:
                    boolean r2 = r1.isFastImport
                    if (r2 != 0) goto L_0x0303
                    boolean r2 = r1.isCutSameType
                    if (r2 == 0) goto L_0x0320
                L_0x0303:
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    dmt.av.video.ad r3 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r3 = r3.f131275u
                    com.ss.android.vesdk.runtime.b r3 = r3.mo43013a()
                    int r3 = r3.f127518i
                    dmt.av.video.ad r4 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r4 = r4.f131275u
                    com.ss.android.vesdk.runtime.b r4 = r4.mo43013a()
                    int r4 = r4.f127519j
                    float r1 = r1.mVolume
                    r2.mo43021a(r3, r4, r1)
                L_0x0320:
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    android.arch.lifecycle.r<java.lang.Integer> r1 = r1.f131276v
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
                    r1.setValue(r2)
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    android.arch.lifecycle.r<com.ss.android.ugc.asve.c.c> r1 = r1.f131254I
                    if (r1 == 0) goto L_0x033c
                    dmt.av.video.ad r1 = dmt.p2652av.video.C52908ad.this
                    android.arch.lifecycle.r<com.ss.android.ugc.asve.c.c> r1 = r1.f131254I
                    dmt.av.video.ad r2 = dmt.p2652av.video.C52908ad.this
                    com.ss.android.ugc.aweme.shortvideo.c.b r2 = r2.f131275u
                    r1.setValue(r2)
                L_0x033c:
                    com.ss.android.ugc.aweme.shortvideo.util.b r1 = com.p683ss.android.ugc.aweme.shortvideo.util.C45412b.m98979a()
                    java.lang.String r2 = "av_video_edit"
                    java.lang.String r3 = "VEEditor init end"
                    r1.step(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.C52908ad.C529091.onChanged(java.lang.Object):void");
            }
        });
        this.f131258d.observe(this.f131256b, new C52953d());
        this.f131259e.observe(this.f131256b, new C0199s<VEPreviewMusicParams>() {
            public final /* synthetic */ void onChanged(Object obj) {
                VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) obj;
                if (vEPreviewMusicParams != null) {
                    vEPreviewMusicParams.f131138e = C52908ad.this.mo110519a(vEPreviewMusicParams.f131138e, 1);
                }
                C52908ad.this.f131252G.mo110495a(vEPreviewMusicParams);
            }
        });
        this.f131259e.observe(this.f131256b, new C52953d());
        this.f131260f.observe(this.f131256b, new C0199s<C31427a>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C31427a aVar = (C31427a) obj;
                if (aVar != null) {
                    C52908ad.this.f131252G.mo110491a(aVar.f82286b);
                }
            }
        });
        this.f131260f.observe(this.f131256b, new C52953d());
        this.f131261g.observe(this.f131256b, new C0199s<C53030y>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C52908ad.this.f131252G.mo110499a((C53030y) obj);
            }
        });
        this.f131261g.observe(this.f131256b, new C52953d());
        this.f131262h.observe(this.f131256b, new C0199s<C53026u>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C52908ad.this.f131252G.mo110497a((C53026u) obj);
            }
        });
        this.f131262h.observe(this.f131256b, new C52953d());
        this.f131263i.mo110542a(this.f131256b, new C52942c<C52906ab>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo110532a(Object obj, Object obj2) {
                C52908ad.this.f131252G.mo110496a((C52906ab) obj, (C52906ab) obj2);
            }
        });
        this.f131263i.observe(this.f131256b, new C52953d());
        if (this.f131265k != null) {
            this.f131265k.observe(this.f131256b, new C52921ae(this));
        }
        mo110529b().mo110542a(this.f131256b, new C52942c<C52977l>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo110532a(Object obj, Object obj2) {
                C52908ad.this.f131252G.mo110488a((C52977l) obj, (C52977l) obj2);
            }
        });
        this.f131266l.observe(this.f131256b, new C0199s<VEVolumeChangeOp>() {
            public final /* synthetic */ void onChanged(Object obj) {
                VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) obj;
                if (vEVolumeChangeOp == null || C52908ad.this.f131273s == null || !C52908ad.this.f131273s.isStitchMode()) {
                    if (vEVolumeChangeOp == null) {
                        vEVolumeChangeOp = null;
                    } else if (vEVolumeChangeOp.mType == 0) {
                        vEVolumeChangeOp = VEVolumeChangeOp.ofVoice(C52908ad.this.mo110519a(vEVolumeChangeOp.mVolume, 0));
                    } else if (vEVolumeChangeOp.mType == 1) {
                        vEVolumeChangeOp = VEVolumeChangeOp.ofMusic(C52908ad.this.mo110519a(vEVolumeChangeOp.mVolume, 1));
                    }
                    C52908ad.this.f131252G.mo110494a(vEVolumeChangeOp);
                    return;
                }
                C52908ad.this.f131252G.mo110494a(vEVolumeChangeOp);
            }
        });
        this.f131266l.observe(this.f131256b, new C52953d());
        this.f131267m.observe(this.f131256b, new C0199s<C53029x>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C52908ad.this.f131252G.mo110498a((C53029x) obj);
            }
        });
        this.f131267m.observe(this.f131256b, new C52953d());
        if (this.f131272r != null) {
            this.f131272r.observe(this.f131256b, new C0199s<C43954a>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    C52908ad.this.f131252G.mo110487a((C43954a) obj);
                }
            });
            this.f131272r.observe(this.f131256b, new C52953d());
        }
        if (this.f131268n != null) {
            this.f131268n.observe(this.f131256b, new C52922af(this));
            this.f131268n.observe(this.f131256b, new C52953d());
        }
        if (this.f131270p != null) {
            this.f131270p.observe(this.f131256b, new C52923ag(this));
        }
        if (this.f131269o != null) {
            this.f131269o.observe(this.f131256b, new C52924ah(this));
            this.f131269o.observe(this.f131256b, new C52953d());
        }
        if (this.f131271q != null) {
            this.f131271q.observe(this.f131256b, new C52953d<C43442b>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    String str;
                    String str2;
                    C43442b bVar = (C43442b) obj;
                    C52885a aVar = C52908ad.this.f131252G;
                    if (bVar != null) {
                        String str3 = "";
                        switch (bVar.f109830b) {
                            case 0:
                                str3 = "apply nothing";
                                break;
                            case 1:
                                aVar.mo110490a(bVar.f109829a, bVar.f109831c);
                                StringBuilder sb = new StringBuilder("apply light enhance, ");
                                if (bVar.f109829a) {
                                    str = "on ";
                                } else {
                                    str = "off";
                                }
                                sb.append(str);
                                str3 = sb.toString();
                                break;
                            case 2:
                                aVar.mo110489a(bVar.f109829a);
                                StringBuilder sb2 = new StringBuilder("apply hdr enhance, ");
                                if (bVar.f109829a) {
                                    str2 = "on ";
                                } else {
                                    str2 = "off";
                                }
                                sb2.append(str2);
                                str3 = sb2.toString();
                                break;
                        }
                        C43443c.m95217a(aVar.f131176e, str3);
                    }
                }
            });
        }
    }
}
