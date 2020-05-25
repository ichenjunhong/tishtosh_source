package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43192a;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C43173a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VEListener.C50549m;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52855s;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.al */
public final class C49099al extends C12924i implements OnTouchListener, C49548a {

    /* renamed from: H */
    public static final C49100a f123374H = new C49100a(null);

    /* renamed from: A */
    public VEVideoPublishEditViewModel f123375A;

    /* renamed from: B */
    EditMusicCutViewModel f123376B;

    /* renamed from: C */
    public EditPreviewViewModel f123377C;

    /* renamed from: D */
    EditMusicViewModel f123378D;

    /* renamed from: E */
    public final C50549m f123379E = new C49114n(this);

    /* renamed from: F */
    final C49111k f123380F = new C49111k(this);

    /* renamed from: G */
    public boolean f123381G;

    /* renamed from: I */
    private ImageView f123382I;

    /* renamed from: J */
    private FrameLayout f123383J;

    /* renamed from: K */
    private View f123384K;

    /* renamed from: L */
    private float f123385L;

    /* renamed from: M */
    private float f123386M;

    /* renamed from: N */
    private C49101b f123387N;

    /* renamed from: O */
    private final C49112l f123388O = new C49112l(this);

    /* renamed from: i */
    public ImageView f123389i;

    /* renamed from: j */
    public KTVView f123390j;

    /* renamed from: k */
    TextView f123391k;

    /* renamed from: l */
    TextView f123392l;

    /* renamed from: m */
    public DmtCutMusicLayout f123393m;

    /* renamed from: n */
    public RelativeLayout f123394n;

    /* renamed from: o */
    public C49098ak f123395o;

    /* renamed from: p */
    int f123396p;

    /* renamed from: q */
    public int f123397q;

    /* renamed from: r */
    int f123398r;

    /* renamed from: s */
    public int f123399s;

    /* renamed from: t */
    public int f123400t;

    /* renamed from: u */
    public final Handler f123401u = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    C23441t f123402v;

    /* renamed from: w */
    public C49102c f123403w;

    /* renamed from: x */
    public boolean f123404x;

    /* renamed from: y */
    public EditViewModel f123405y;

    /* renamed from: z */
    public EditStickerViewModel f123406z;

    /* renamed from: com.ss.android.ugc.gamora.editor.al$a */
    public static final class C49100a {
        private C49100a() {
        }

        public /* synthetic */ C49100a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$b */
    public interface C49101b {
        /* renamed from: a */
        void mo97130a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$c */
    public interface C49102c {
        /* renamed from: a */
        void mo97131a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$d */
    static final class C49103d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49099al f123407a;

        C49103d(C49099al alVar) {
            this.f123407a = alVar;
        }

        public final void run() {
            C49099al alVar = this.f123407a;
            double d = (double) alVar.f123397q;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            KTVView kTVView = alVar.f123390j;
            if (kTVView == null) {
                C52711k.m112237a("mKTVView");
            }
            double width = (double) kTVView.getWidth();
            Double.isNaN(width);
            double d3 = d2 * width;
            double d4 = (double) alVar.f123399s;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            ImageView imageView = alVar.f123389i;
            if (imageView == null) {
                C52711k.m112237a("mSlide");
            }
            KTVView kTVView2 = alVar.f123390j;
            if (kTVView2 == null) {
                C52711k.m112237a("mKTVView");
            }
            float x = kTVView2.getX() + ((float) i);
            ImageView imageView2 = alVar.f123389i;
            if (imageView2 == null) {
                C52711k.m112237a("mSlide");
            }
            imageView.setX(x - ((float) (imageView2.getWidth() / 2)));
            KTVView kTVView3 = alVar.f123390j;
            if (kTVView3 == null) {
                C52711k.m112237a("mKTVView");
            }
            kTVView3.setStart(i);
            KTVView kTVView4 = alVar.f123390j;
            if (kTVView4 == null) {
                C52711k.m112237a("mKTVView");
            }
            kTVView4.setLength(alVar.mo97125F());
            TextView textView = alVar.f123391k;
            if (textView == null) {
                C52711k.m112237a("mTextViewTimeStart");
            }
            textView.setText(C47902fv.m103621a(alVar.f123397q));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$e */
    static final class C49104e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49099al f123408a;

        C49104e(C49099al alVar) {
            this.f123408a = alVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f123408a.f123394n;
            if (relativeLayout == null) {
                C52711k.m112237a("slideContainer");
            }
            relativeLayout.addView(C49099al.m105974b(this.f123408a));
            C49099al.m105974b(this.f123408a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49104e f123409a;

                {
                    this.f123409a = r1;
                }

                public final void run() {
                    if (this.f123409a.f123408a.f123397q == 0) {
                        C49099al.m105974b(this.f123409a.f123408a).setX(C49099al.m105976c(this.f123409a.f123408a).getX() - ((float) (C49099al.m105974b(this.f123409a.f123408a).getWidth() / 2)));
                    } else {
                        double d = (double) this.f123409a.f123408a.f123397q;
                        Double.isNaN(d);
                        double d2 = d * 1.0d;
                        double width = (double) C49099al.m105976c(this.f123409a.f123408a).getWidth();
                        Double.isNaN(width);
                        double d3 = d2 * width;
                        double d4 = (double) this.f123409a.f123408a.f123399s;
                        Double.isNaN(d4);
                        C49099al.m105974b(this.f123409a.f123408a).setX((C49099al.m105976c(this.f123409a.f123408a).getX() + ((float) ((int) (d3 / d4)))) - ((float) (C49099al.m105974b(this.f123409a.f123408a).getWidth() / 2)));
                    }
                    C49099al.m105976c(this.f123409a.f123408a).setLength(this.f123409a.f123408a.mo97125F());
                    C49099al.m105974b(this.f123409a.f123408a).setOnTouchListener(this.f123409a.f123408a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$f */
    public static final class C49106f implements C43173a {

        /* renamed from: a */
        final /* synthetic */ C49099al f123410a;

        C49106f(C49099al alVar) {
            this.f123410a = alVar;
        }

        /* renamed from: a */
        public final void mo87768a(float f) {
            this.f123410a.f123397q = (int) (f * ((float) this.f123410a.f123399s));
            C49102c cVar = this.f123410a.f123403w;
            if (cVar != null) {
                cVar.mo97131a(this.f123410a.f123404x);
            }
        }

        /* renamed from: b */
        public final void mo87769b(float f) {
            C49099al.m105977d(this.f123410a).setTimeBubble((int) (f * ((float) this.f123410a.f123399s)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$g */
    public static final class C49107g implements C49101b {

        /* renamed from: a */
        final /* synthetic */ C49099al f123411a;

        C49107g(C49099al alVar) {
            this.f123411a = alVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo97130a(boolean r10) {
            /*
                r9 = this;
                com.ss.android.ugc.gamora.editor.al r0 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
                com.ss.android.ugc.gamora.editor.al r1 = r9.f123411a
                int r1 = r1.f123397q
                r0.mMusicStart = r1
                java.lang.String r1 = r0.mMusicPath
                boolean r2 = com.p683ss.android.ugc.aweme.utils.C47807de.m103445a(r0)
                int r1 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r1, r2)
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                if (r2 == 0) goto L_0x0064
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                if (r2 != 0) goto L_0x0031
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0031:
                int r2 = r2.getShootDuration()
                if (r2 <= 0) goto L_0x0064
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                if (r2 != 0) goto L_0x0044
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0044:
                int r2 = r2.getShootDuration()
                int r2 = r1 - r2
                int r2 = java.lang.Math.abs(r2)
                r3 = 1000(0x3e8, float:1.401E-42)
                if (r2 < r3) goto L_0x0083
                com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo50201b()
                if (r1 != 0) goto L_0x005f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x005f:
                int r1 = r1.getShootDuration()
                goto L_0x0083
            L_0x0064:
                com.ss.android.ugc.gamora.editor.al r1 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r1)
                android.arch.lifecycle.r r1 = r1.mo97038h()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0077
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0077:
                com.ss.android.ugc.asve.c.c r1 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r1
                int r1 = r1.mo43071k()
                r2 = 15000(0x3a98, float:2.102E-41)
                int r1 = java.lang.Math.min(r2, r1)
            L_0x0083:
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r2)
                android.arch.lifecycle.r r2 = r2.mo97038h()
                java.lang.Object r2 = r2.getValue()
                if (r2 != 0) goto L_0x0096
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0096:
                com.ss.android.ugc.asve.c.c r2 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r2
                int r2 = r2.mo43071k()
                int r1 = java.lang.Math.min(r1, r2)
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                int r2 = r2.f123397q
                int r2 = r2 + r1
                r0.mMusicEnd = r2
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r2)
                boolean r2 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
                if (r2 == 0) goto L_0x00c3
                if (r10 != 0) goto L_0x00c3
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r2)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 0
                r3.mo97033a(r4, r5, r4)
                goto L_0x00d1
            L_0x00c3:
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r2)
                r4 = 1
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 0
                r3.mo97033a(r4, r5, r4)
            L_0x00d1:
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                r3 = 0
                r2.mo97128a(r3)
                if (r10 != 0) goto L_0x00fb
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.bytedance.scene.i r2 = r2.f33835c
                if (r2 == 0) goto L_0x00f3
                com.bytedance.scene.group.b r2 = (com.bytedance.scene.group.C12896b) r2
                java.lang.String r4 = "MusicScene"
                com.bytedance.scene.i r2 = r2.mo24388a(r4)
                com.ss.android.ugc.gamora.editor.am r2 = (com.p683ss.android.ugc.gamora.editor.C49115am) r2
                if (r2 == 0) goto L_0x00fb
                com.ss.android.ugc.aweme.shortvideo.p.a r2 = r2.mo97138G()
                r2.mo90208b()
                goto L_0x00fb
            L_0x00f3:
                d.u r10 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene"
                r10.<init>(r0)
                throw r10
            L_0x00fb:
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditStickerViewModel r2 = r2.f123406z
                if (r2 != 0) goto L_0x0106
                java.lang.String r4 = "stickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0106:
                android.arch.lifecycle.r r2 = r2.mo96968g()
                r4 = 1
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r2.setValue(r5)
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditPreviewViewModel r2 = r2.f123377C
                if (r2 != 0) goto L_0x011d
                java.lang.String r5 = "previewViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x011d:
                r2.mo96923a(r3)
                com.ss.android.ugc.gamora.editor.al r2 = r9.f123411a
                dmt.av.video.VEVideoPublishEditViewModel r2 = com.p683ss.android.ugc.gamora.editor.C49099al.m105978e(r2)
                android.arch.lifecycle.r r2 = r2.mo110469n()
                java.lang.String r3 = "publishEditViewModel.musicStartChangeOpLiveData"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                int r3 = r0.mMusicStart
                dmt.av.video.x r1 = dmt.p2652av.video.C53029x.m112771a(r3, r1)
                r2.setValue(r1)
                boolean r1 = r0.hasOriginalSound()
                if (r1 == 0) goto L_0x0156
                com.ss.android.ugc.gamora.editor.al r1 = r9.f123411a
                dmt.av.video.VEVideoPublishEditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49099al.m105978e(r1)
                android.arch.lifecycle.r r1 = r1.mo110468m()
                java.lang.String r2 = "publishEditViewModel.volumeChangeOpLiveData"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                float r2 = r0.voiceVolume
                com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r2 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofVoice(r2)
                r1.setValue(r2)
            L_0x0156:
                com.ss.android.ugc.gamora.editor.al r1 = r9.f123411a
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = r1.f123405y
                if (r2 != 0) goto L_0x0161
                java.lang.String r3 = "mEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0161:
                int r2 = r2.mo97026H()
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r1.f123405y
                if (r3 != 0) goto L_0x016e
                java.lang.String r5 = "mEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x016e:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                int r3 = r3.mCurMusicLength
                if (r2 > r3) goto L_0x01ac
                com.ss.android.ugc.gamora.editor.EditMusicViewModel r2 = r1.f123378D
                if (r2 != 0) goto L_0x017f
                java.lang.String r3 = "musicViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x017f:
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r1.f123405y
                if (r3 != 0) goto L_0x0188
                java.lang.String r5 = "mEditViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x0188:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                int r3 = r3.mMusicStart
                com.ss.android.ugc.gamora.editor.EditMusicViewModel$c r5 = new com.ss.android.ugc.gamora.editor.EditMusicViewModel$c
                r5.<init>(r3)
                d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5
                r2.mo22530c(r5)
                com.ss.android.ugc.gamora.editor.EditStickerViewModel r1 = r1.f123406z
                if (r1 != 0) goto L_0x01a1
                java.lang.String r2 = "stickerViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x01a1:
                android.arch.lifecycle.r r1 = r1.mo96968g()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
                r1.setValue(r2)
            L_0x01ac:
                boolean r1 = r0.isMvThemeVideoType()
                if (r1 == 0) goto L_0x01d3
                com.ss.android.ugc.aweme.at.b r1 = r0.mvCreateVideoData
                int r1 = r1.mvType
                if (r1 != r4) goto L_0x01d3
                com.ss.android.ugc.gamora.editor.al r1 = r9.f123411a
                com.ss.android.ugc.gamora.editor.ak r2 = r1.f123395o
                if (r2 != 0) goto L_0x01c3
                java.lang.String r1 = "musicCallback"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x01c3:
                java.lang.String r3 = r0.mMusicPath
                java.lang.String r1 = "mModel.mMusicPath"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)
                int r4 = r0.mMusicStart
                int r5 = r0.mMusicEnd
                r6 = -1
                r7 = 0
                r2.mo97124a(r3, r4, r5, r6, r7)
            L_0x01d3:
                if (r10 == 0) goto L_0x0205
                java.lang.String r10 = "select_lyricsticker_clip_complete"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r0.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                java.lang.String r0 = r0.mShootWay
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
                java.lang.String r1 = "music_id"
                com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                if (r2 != 0) goto L_0x01fa
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01fa:
                java.lang.String r2 = r2.mid
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r0)
            L_0x0205:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49099al.C49107g.mo97130a(boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$h */
    public static final class C49108h implements C49102c {

        /* renamed from: a */
        final /* synthetic */ C49099al f123412a;

        C49108h(C49099al alVar) {
            this.f123412a = alVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b5, code lost:
            if (r0 == null) goto L_0x00b7;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo97131a(boolean r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
                com.ss.android.ugc.gamora.editor.al r1 = r5.f123412a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r1)
                android.arch.lifecycle.r r1 = r1.mo97038h()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.asve.c.c r1 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r1
                if (r1 != 0) goto L_0x001b
                return
            L_0x001b:
                java.lang.String r2 = "mEditViewModel.veEditor.value ?: return"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                if (r0 == 0) goto L_0x0043
                int r2 = r0.getShootDuration()
                if (r2 <= 0) goto L_0x0043
                int r2 = r1.mo43071k()
                int r3 = r0.getShootDuration()
                int r2 = r2 - r3
                int r2 = java.lang.Math.abs(r2)
                r3 = 1000(0x3e8, float:1.401E-42)
                if (r2 < r3) goto L_0x003e
                int r2 = r0.getShootDuration()
                goto L_0x004d
            L_0x003e:
                int r2 = r1.mo43071k()
                goto L_0x004d
            L_0x0043:
                int r2 = r1.mo43071k()
                r3 = 15000(0x3a98, float:2.102E-41)
                int r2 = java.lang.Math.min(r3, r2)
            L_0x004d:
                int r3 = r1.mo43071k()
                int r2 = java.lang.Math.min(r2, r3)
                com.ss.android.ugc.gamora.editor.al r3 = r5.f123412a
                dmt.av.video.VEVideoPublishEditViewModel r3 = com.p683ss.android.ugc.gamora.editor.C49099al.m105978e(r3)
                android.arch.lifecycle.r r3 = r3.mo110469n()
                java.lang.String r4 = "publishEditViewModel.musicStartChangeOpLiveData"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                com.ss.android.ugc.gamora.editor.al r4 = r5.f123412a
                int r4 = r4.f123397q
                dmt.av.video.x r2 = dmt.p2652av.video.C53029x.m112771a(r4, r2)
                r3.setValue(r2)
                r2 = 0
                com.ss.android.vesdk.o$d r3 = com.p683ss.android.vesdk.C50720o.C50743d.EDITOR_SEEK_FLAG_LastSeek
                com.ss.android.ugc.gamora.editor.al r4 = r5.f123412a
                com.ss.android.vesdk.VEListener$m r4 = r4.f123379E
                int r1 = r1.mo42984a(r2, r3, r4)
                if (r1 == 0) goto L_0x008d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "onPlayMusic seek error: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r1)
            L_0x008d:
                com.ss.android.ugc.gamora.editor.al r1 = r5.f123412a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p683ss.android.ugc.gamora.editor.C49099al.m105973a(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                if (r6 == 0) goto L_0x00c2
                java.lang.String r6 = "lyricsticker_clip_adjust"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "creation_id"
                java.lang.String r4 = r1.creationId
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "shoot_way"
                java.lang.String r1 = r1.mShootWay
                com.ss.android.ugc.aweme.app.f.d r1 = r2.mo47829a(r3, r1)
                java.lang.String r2 = "music_id"
                if (r0 == 0) goto L_0x00b7
                java.lang.String r0 = r0.mid
                if (r0 != 0) goto L_0x00b9
            L_0x00b7:
                java.lang.String r0 = ""
            L_0x00b9:
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49099al.C49108h.mo97131a(boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$i */
    public static final class C49109i implements C43192a {

        /* renamed from: a */
        final /* synthetic */ C49099al f123413a;

        /* renamed from: b */
        final /* synthetic */ C42482c f123414b;

        /* renamed from: a */
        public final void mo86593a(C43203d dVar) {
            this.f123413a.f123381G = false;
            this.f123413a.mo97128a(true);
            this.f123413a.mo97127a(dVar, this.f123414b.getDuration(), C49099al.m105973a(this.f123413a).mo97035e().mMusicStart);
        }

        C49109i(C49099al alVar, C42482c cVar) {
            this.f123413a = alVar;
            this.f123414b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$j */
    static final class C49110j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49099al f123415a;

        C49110j(C49099al alVar) {
            this.f123415a = alVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f123415a.mo97126G();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$k */
    public static final class C49111k implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C49099al f123416a;

        C49111k(C49099al alVar) {
            this.f123416a = alVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C49099al alVar = this.f123416a;
            alVar.f123397q = alVar.f123398r;
            DmtCutMusicLayout dmtCutMusicLayout = alVar.f123393m;
            if (dmtCutMusicLayout == null) {
                C52711k.m112237a("cutMusicLayout");
            }
            dmtCutMusicLayout.mo87754a((((float) alVar.f123397q) * 1.0f) / ((float) alVar.f123399s));
            DmtCutMusicLayout dmtCutMusicLayout2 = alVar.f123393m;
            if (dmtCutMusicLayout2 == null) {
                C52711k.m112237a("cutMusicLayout");
            }
            dmtCutMusicLayout2.setTimeBubble(alVar.f123397q);
            alVar.mo97126G();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$l */
    public static final class C49112l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49099al f123417a;

        public final void run() {
            C20347c cVar = (C20347c) C49099al.m105973a(this.f123417a).mo97038h().getValue();
            if (cVar != null) {
                int l = cVar.mo43073l();
                if (l < this.f123417a.f123400t) {
                    C49099al.m105977d(this.f123417a).mo87755a((((float) l) * 1.0f) / ((float) this.f123417a.f123400t), true);
                }
                this.f123417a.f123401u.post(this);
            }
        }

        C49112l(C49099al alVar) {
            this.f123417a = alVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$m */
    static final class C49113m extends C52712l implements C52682m<C11866f, EditMusicCutState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49099al f123418a;

        C49113m(C49099al alVar) {
            this.f123418a = alVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            EditMusicCutState editMusicCutState = (EditMusicCutState) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(editMusicCutState, "it");
            Integer videoLength = editMusicCutState.getVideoLength();
            if (videoLength != null) {
                int intValue = videoLength.intValue();
                C49099al alVar = this.f123418a;
                alVar.f123396p = intValue;
                C43193b.m94753a().f109222e = alVar.f123396p;
            }
            C52855s musicWaveData = editMusicCutState.getMusicWaveData();
            if (musicWaveData != null) {
                this.f123418a.mo97127a((C43203d) musicWaveData.getFirst(), ((Number) musicWaveData.getSecond()).intValue(), ((Number) musicWaveData.getThird()).intValue());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.al$n */
    static final class C49114n implements C50549m {

        /* renamed from: a */
        final /* synthetic */ C49099al f123419a;

        C49114n(C49099al alVar) {
            this.f123419a = alVar;
        }

        /* renamed from: a */
        public final void mo88399a(int i) {
            C20347c cVar = (C20347c) C49099al.m105973a(this.f123419a).mo97038h().getValue();
            if (cVar != null) {
                cVar.mo43085r();
            }
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        LayoutInflater from = LayoutInflater.from(this.f33840g_);
        FrameLayout frameLayout = this.f123383J;
        if (frameLayout == null) {
            C52711k.m112237a("mParentLayout");
        }
        View inflate = from.inflate(R.layout.ag6, frameLayout, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(acti…fs, mParentLayout, false)");
        this.f123384K = inflate;
        FrameLayout frameLayout2 = this.f123383J;
        if (frameLayout2 == null) {
            C52711k.m112237a("mParentLayout");
        }
        View view2 = this.f123384K;
        if (view2 == null) {
            C52711k.m112237a("mDragLayout");
        }
        frameLayout2.addView(view2);
    }

    /* renamed from: a */
    public final void mo97128a(boolean z) {
        if (z) {
            View view = this.f123384K;
            if (view == null) {
                C52711k.m112237a("mDragLayout");
            }
            if (view.getVisibility() != 0) {
                View view2 = this.f123384K;
                if (view2 == null) {
                    C52711k.m112237a("mDragLayout");
                }
                view2.setVisibility(0);
                View view3 = this.f123384K;
                if (view3 == null) {
                    C52711k.m112237a("mDragLayout");
                }
                view3.setAlpha(0.0f);
                View view4 = this.f123384K;
                if (view4 == null) {
                    C52711k.m112237a("mDragLayout");
                }
                view4.animate().alpha(1.0f).setDuration(200).start();
                this.f123401u.post(this.f123388O);
                return;
            }
            return;
        }
        View view5 = this.f123384K;
        if (view5 == null) {
            C52711k.m112237a("mDragLayout");
        }
        if (view5.getVisibility() != 4) {
            View view6 = this.f123384K;
            if (view6 == null) {
                C52711k.m112237a("mDragLayout");
            }
            view6.setVisibility(4);
            this.f123401u.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo97127a(C43203d dVar, int i, int i2) {
        this.f123400t = i;
        m105975b(true);
        if (dVar == null || !C43193b.m94756a(dVar.getMusicWavePointArray())) {
            m105975b(true);
            return;
        }
        C43191e.m94745b(dVar);
        C43193b.m94753a().mo87799a(dVar, (long) this.f123396p, (long) i);
        m105975b(false);
        if (i2 == 0) {
            DmtCutMusicLayout dmtCutMusicLayout = this.f123393m;
            if (dmtCutMusicLayout == null) {
                C52711k.m112237a("cutMusicLayout");
            }
            dmtCutMusicLayout.mo87753a();
        } else {
            DmtCutMusicLayout dmtCutMusicLayout2 = this.f123393m;
            if (dmtCutMusicLayout2 == null) {
                C52711k.m112237a("cutMusicLayout");
            }
            dmtCutMusicLayout2.mo87754a((((float) i2) * 1.0f) / ((float) i));
            DmtCutMusicLayout dmtCutMusicLayout3 = this.f123393m;
            if (dmtCutMusicLayout3 == null) {
                C52711k.m112237a("cutMusicLayout");
            }
            dmtCutMusicLayout3.setTimeBubble(i2);
        }
        DmtCutMusicLayout dmtCutMusicLayout4 = this.f123393m;
        if (dmtCutMusicLayout4 == null) {
            C52711k.m112237a("cutMusicLayout");
        }
        dmtCutMusicLayout4.setAudioWaveViewData(dVar);
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: G */
    public final void mo97126G() {
        C49101b bVar = this.f123387N;
        if (bVar != null) {
            bVar.mo97130a(this.f123404x);
        }
        C23441t tVar = this.f123402v;
        if (tVar != null) {
            tVar.mo48606b(this.f123380F);
        }
    }

    /* renamed from: F */
    public final int mo97125F() {
        if (this.f123396p >= this.f123399s) {
            KTVView kTVView = this.f123390j;
            if (kTVView == null) {
                C52711k.m112237a("mKTVView");
            }
            return kTVView.getWidth();
        }
        KTVView kTVView2 = this.f123390j;
        if (kTVView2 == null) {
            C52711k.m112237a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f123396p;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f123399s;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: H */
    private final int m105972H() {
        if (this.f123396p >= this.f123399s) {
            KTVView kTVView = this.f123390j;
            if (kTVView == null) {
                C52711k.m112237a("mKTVView");
            }
            return (int) (((((float) kTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f123399s));
        }
        KTVView kTVView2 = this.f123390j;
        if (kTVView2 == null) {
            C52711k.m112237a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f123396p;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f123399s;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m105973a(C49099al alVar) {
        EditViewModel editViewModel = alVar.f123405y;
        if (editViewModel == null) {
            C52711k.m112237a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m105974b(C49099al alVar) {
        ImageView imageView = alVar.f123389i;
        if (imageView == null) {
            C52711k.m112237a("mSlide");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ KTVView m105976c(C49099al alVar) {
        KTVView kTVView = alVar.f123390j;
        if (kTVView == null) {
            C52711k.m112237a("mKTVView");
        }
        return kTVView;
    }

    /* renamed from: d */
    public static final /* synthetic */ DmtCutMusicLayout m105977d(C49099al alVar) {
        DmtCutMusicLayout dmtCutMusicLayout = alVar.f123393m;
        if (dmtCutMusicLayout == null) {
            C52711k.m112237a("cutMusicLayout");
        }
        return dmtCutMusicLayout;
    }

    /* renamed from: e */
    public static final /* synthetic */ VEVideoPublishEditViewModel m105978e(C49099al alVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = alVar.f123375A;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: b */
    private final void m105975b(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        KTVView kTVView = this.f123390j;
        if (kTVView == null) {
            C52711k.m112237a("mKTVView");
        }
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        kTVView.setVisibility(i);
        TextView textView = this.f123391k;
        if (textView == null) {
            C52711k.m112237a("mTextViewTimeStart");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f123392l;
        if (textView2 == null) {
            C52711k.m112237a("mTextViewTotalTime");
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        DmtCutMusicLayout dmtCutMusicLayout = this.f123393m;
        if (dmtCutMusicLayout == null) {
            C52711k.m112237a("cutMusicLayout");
        }
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        dmtCutMusicLayout.setVisibility(i4);
        ImageView imageView = this.f123389i;
        if (imageView == null) {
            C52711k.m112237a("mSlide");
        }
        if (z) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        boolean z;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (!(activity instanceof C23441t)) {
            activity = null;
        }
        this.f123402v = (C23441t) activity;
        Activity activity2 = this.f33840g_;
        if (activity2 != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f123405y = (EditViewModel) a;
            Activity activity3 = this.f33840g_;
            if (activity3 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f123406z = (EditStickerViewModel) a2;
                Activity activity4 = this.f33840g_;
                if (activity4 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditMusicCutViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…CutViewModel::class.java)");
                    this.f123376B = (EditMusicCutViewModel) a3;
                    Activity activity5 = this.f33840g_;
                    if (activity5 != null) {
                        C0209x a4 = C0214z.m440a((FragmentActivity) activity5).mo359a(VEVideoPublishEditViewModel.class);
                        C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f123375A = (VEVideoPublishEditViewModel) a4;
                        Activity activity6 = this.f33840g_;
                        if (activity6 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditPreviewViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…iewViewModel::class.java)");
                            this.f123377C = (EditPreviewViewModel) a5;
                            Activity activity7 = this.f33840g_;
                            if (activity7 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditMusicViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…sicViewModel::class.java)");
                                this.f123378D = (EditMusicViewModel) a6;
                                EditViewModel editViewModel = this.f123405y;
                                if (editViewModel == null) {
                                    C52711k.m112237a("mEditViewModel");
                                }
                                Object value = editViewModel.mo97038h().getValue();
                                if (value == null) {
                                    C52711k.m112234a();
                                }
                                this.f123396p = ((C20347c) value).mo43071k();
                                View view = this.f123384K;
                                if (view == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById = view.findViewById(R.id.b69);
                                C52711k.m112236a((Object) findViewById, "mDragLayout.findViewById(R.id.ktvView)");
                                this.f123390j = (KTVView) findViewById;
                                View view2 = this.f123384K;
                                if (view2 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById2 = view2.findViewById(R.id.dga);
                                C52711k.m112236a((Object) findViewById2, "mDragLayout.findViewById(R.id.tv_start)");
                                this.f123391k = (TextView) findViewById2;
                                View view3 = this.f123384K;
                                if (view3 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById3 = view3.findViewById(R.id.d9w);
                                C52711k.m112236a((Object) findViewById3, "mDragLayout.findViewById(R.id.tv_end)");
                                this.f123392l = (TextView) findViewById3;
                                View view4 = this.f123384K;
                                if (view4 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById4 = view4.findViewById(R.id.a31);
                                C52711k.m112236a((Object) findViewById4, "mDragLayout.findViewById(R.id.cutmusic_view)");
                                this.f123393m = (DmtCutMusicLayout) findViewById4;
                                View view5 = this.f123384K;
                                if (view5 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById5 = view5.findViewById(R.id.cp7);
                                C52711k.m112236a((Object) findViewById5, "mDragLayout.findViewById(R.id.slide_container)");
                                this.f123394n = (RelativeLayout) findViewById5;
                                View view6 = this.f123384K;
                                if (view6 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                View findViewById6 = view6.findViewById(R.id.azt);
                                C52711k.m112236a((Object) findViewById6, "mDragLayout.findViewById(R.id.iv_cut_music_next)");
                                this.f123382I = (ImageView) findViewById6;
                                ImageView imageView = this.f123382I;
                                if (imageView == null) {
                                    C52711k.m112237a("mCutMusicNext");
                                }
                                imageView.setOnClickListener(new C49110j(this));
                                TextView textView = this.f123392l;
                                if (textView == null) {
                                    C52711k.m112237a("mTextViewTotalTime");
                                }
                                textView.setText(C47902fv.m103621a(this.f123399s));
                                TextView textView2 = this.f123391k;
                                if (textView2 == null) {
                                    C52711k.m112237a("mTextViewTimeStart");
                                }
                                View view7 = this.f123384K;
                                if (view7 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                textView2.setText(view7.getContext().getString(R.string.e1k));
                                View view8 = this.f123384K;
                                if (view8 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                this.f123389i = new ImageView(view8.getContext());
                                ImageView imageView2 = this.f123389i;
                                if (imageView2 == null) {
                                    C52711k.m112237a("mSlide");
                                }
                                imageView2.setImageResource(R.drawable.a1n);
                                ImageView imageView3 = this.f123389i;
                                if (imageView3 == null) {
                                    C52711k.m112237a("mSlide");
                                }
                                imageView3.setScaleType(ScaleType.FIT_XY);
                                View view9 = this.f123384K;
                                if (view9 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                view9.postDelayed(new C49104e(this), 10);
                                DmtCutMusicLayout dmtCutMusicLayout = this.f123393m;
                                if (dmtCutMusicLayout == null) {
                                    C52711k.m112237a("cutMusicLayout");
                                }
                                DmtCutMusicLayout dmtCutMusicLayout2 = this.f123393m;
                                if (dmtCutMusicLayout2 == null) {
                                    C52711k.m112237a("cutMusicLayout");
                                }
                                dmtCutMusicLayout.setBubbleTextViewAttrite(C43193b.m94752a(dmtCutMusicLayout2.getContext()));
                                DmtCutMusicLayout dmtCutMusicLayout3 = this.f123393m;
                                if (dmtCutMusicLayout3 == null) {
                                    C52711k.m112237a("cutMusicLayout");
                                }
                                dmtCutMusicLayout3.setScrollListener(new C49106f(this));
                                DmtCutMusicLayout dmtCutMusicLayout4 = this.f123393m;
                                if (dmtCutMusicLayout4 == null) {
                                    C52711k.m112237a("cutMusicLayout");
                                }
                                dmtCutMusicLayout4.mo87754a((((float) this.f123397q) * 1.0f) / ((float) this.f123399s));
                                DmtCutMusicLayout dmtCutMusicLayout5 = this.f123393m;
                                if (dmtCutMusicLayout5 == null) {
                                    C52711k.m112237a("cutMusicLayout");
                                }
                                dmtCutMusicLayout5.setTimeBubble(this.f123397q);
                                View view10 = this.f123384K;
                                if (view10 == null) {
                                    C52711k.m112237a("mDragLayout");
                                }
                                view10.bringToFront();
                                this.f123401u.post(this.f123388O);
                                boolean z2 = false;
                                mo97128a(false);
                                C43191e a7 = C43193b.m94753a();
                                Activity v = mo24477v();
                                C52711k.m112236a((Object) v, "requireActivity()");
                                a7.mo87798a((Context) v);
                                C43193b.m94753a().f109222e = this.f123396p;
                                C42482c b = C43214dh.m94817a().mo50201b();
                                StringBuilder sb = new StringBuilder("OLD_DRAFT avMusicIsNull:");
                                if (b == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb.append(z);
                                C45407ay.m98968a(sb.toString());
                                if (b != null) {
                                    C39529ab b2 = C39630m.m88234a().mo58604b();
                                    Activity v2 = mo24477v();
                                    C52711k.m112236a((Object) v2, "requireActivity()");
                                    C43203d a8 = b2.mo80568a(v2.getIntent().getSerializableExtra("music_wave_data"));
                                    StringBuilder sb2 = new StringBuilder("OLD_DRAFT musicWaveBeanIsNull:");
                                    if (a8 == null) {
                                        z2 = true;
                                    }
                                    sb2.append(z2);
                                    C45407ay.m98968a(sb2.toString());
                                    if (a8 != null) {
                                        int duration = b.getDuration();
                                        EditViewModel editViewModel2 = this.f123405y;
                                        if (editViewModel2 == null) {
                                            C52711k.m112237a("mEditViewModel");
                                        }
                                        mo97127a(a8, duration, editViewModel2.mo97035e().mMusicStart);
                                    } else {
                                        String str = b.path;
                                        if (!C48016e.m103944b(str)) {
                                            EditViewModel editViewModel3 = this.f123405y;
                                            if (editViewModel3 == null) {
                                                C52711k.m112237a("mEditViewModel");
                                            }
                                            str = editViewModel3.mo97035e().mMusicPath;
                                        }
                                        this.f123381G = true;
                                        C43193b.m94753a().mo87800a(str, (C43192a) new C49109i(this, b));
                                    }
                                }
                                this.f123387N = new C49107g(this);
                                this.f123403w = new C49108h(this);
                                EditMusicCutViewModel editMusicCutViewModel = this.f123376B;
                                if (editMusicCutViewModel == null) {
                                    C52711k.m112237a("musicCutViewModel");
                                }
                                mo22546a(editMusicCutViewModel, C11896i.m24255a(), new C49113m(this));
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C52711k.m112240b(view, "v");
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                this.f123385L = motionEvent.getRawX();
                ImageView imageView = this.f123389i;
                if (imageView == null) {
                    C52711k.m112237a("mSlide");
                }
                this.f123386M = imageView.getX();
                break;
            case 1:
                ImageView imageView2 = this.f123389i;
                if (imageView2 == null) {
                    C52711k.m112237a("mSlide");
                }
                float x = imageView2.getX();
                KTVView kTVView = this.f123390j;
                if (kTVView == null) {
                    C52711k.m112237a("mKTVView");
                }
                float x2 = x - kTVView.getX();
                ImageView imageView3 = this.f123389i;
                if (imageView3 == null) {
                    C52711k.m112237a("mSlide");
                }
                int width = (int) (x2 + ((float) (imageView3.getWidth() / 2)));
                if (width < 0) {
                    width = 0;
                }
                double d = (double) width;
                Double.isNaN(d);
                double d2 = d * 1.0d;
                KTVView kTVView2 = this.f123390j;
                if (kTVView2 == null) {
                    C52711k.m112237a("mKTVView");
                }
                double width2 = (double) kTVView2.getWidth();
                Double.isNaN(width2);
                double d3 = d2 / width2;
                double d4 = (double) this.f123399s;
                Double.isNaN(d4);
                this.f123397q = (int) (d3 * d4);
                C49102c cVar = this.f123403w;
                if (cVar != null) {
                    cVar.mo97131a(this.f123404x);
                    break;
                }
                break;
            case 2:
                float rawX = this.f123386M + (motionEvent.getRawX() - this.f123385L);
                KTVView kTVView3 = this.f123390j;
                if (kTVView3 == null) {
                    C52711k.m112237a("mKTVView");
                }
                float x3 = kTVView3.getX();
                ImageView imageView4 = this.f123389i;
                if (imageView4 == null) {
                    C52711k.m112237a("mSlide");
                }
                if (rawX < x3 - ((float) (imageView4.getWidth() / 2))) {
                    KTVView kTVView4 = this.f123390j;
                    if (kTVView4 == null) {
                        C52711k.m112237a("mKTVView");
                    }
                    float x4 = kTVView4.getX();
                    ImageView imageView5 = this.f123389i;
                    if (imageView5 == null) {
                        C52711k.m112237a("mSlide");
                    }
                    rawX = x4 - ((float) (imageView5.getWidth() / 2));
                }
                KTVView kTVView5 = this.f123390j;
                if (kTVView5 == null) {
                    C52711k.m112237a("mKTVView");
                }
                float x5 = rawX - kTVView5.getX();
                ImageView imageView6 = this.f123389i;
                if (imageView6 == null) {
                    C52711k.m112237a("mSlide");
                }
                float width3 = x5 + ((float) (imageView6.getWidth() / 2));
                KTVView kTVView6 = this.f123390j;
                if (kTVView6 == null) {
                    C52711k.m112237a("mKTVView");
                }
                if (width3 >= ((float) (kTVView6.getWidth() - m105972H()))) {
                    KTVView kTVView7 = this.f123390j;
                    if (kTVView7 == null) {
                        C52711k.m112237a("mKTVView");
                    }
                    float x6 = kTVView7.getX();
                    ImageView imageView7 = this.f123389i;
                    if (imageView7 == null) {
                        C52711k.m112237a("mSlide");
                    }
                    float width4 = x6 - ((float) (imageView7.getWidth() / 2));
                    KTVView kTVView8 = this.f123390j;
                    if (kTVView8 == null) {
                        C52711k.m112237a("mKTVView");
                    }
                    rawX = (width4 + ((float) kTVView8.getWidth())) - ((float) m105972H());
                }
                float f = 0.0f;
                if (rawX >= 0.0f) {
                    f = rawX;
                }
                ImageView imageView8 = this.f123389i;
                if (imageView8 == null) {
                    C52711k.m112237a("mSlide");
                }
                imageView8.animate().x(f).setDuration(0).start();
                ImageView imageView9 = this.f123389i;
                if (imageView9 == null) {
                    C52711k.m112237a("mSlide");
                }
                float x7 = imageView9.getX();
                ImageView imageView10 = this.f123389i;
                if (imageView10 == null) {
                    C52711k.m112237a("mSlide");
                }
                float width5 = x7 + ((float) (imageView10.getWidth() / 2));
                KTVView kTVView9 = this.f123390j;
                if (kTVView9 == null) {
                    C52711k.m112237a("mKTVView");
                }
                int x8 = (int) (width5 - kTVView9.getX());
                KTVView kTVView10 = this.f123390j;
                if (kTVView10 == null) {
                    C52711k.m112237a("mKTVView");
                }
                kTVView10.setStart(x8);
                KTVView kTVView11 = this.f123390j;
                if (kTVView11 == null) {
                    C52711k.m112237a("mKTVView");
                }
                kTVView11.setLength(mo97125F());
                TextView textView = this.f123391k;
                if (textView == null) {
                    C52711k.m112237a("mTextViewTimeStart");
                }
                ImageView imageView11 = this.f123389i;
                if (imageView11 == null) {
                    C52711k.m112237a("mSlide");
                }
                double x9 = (double) imageView11.getX();
                Double.isNaN(x9);
                double d5 = x9 * 1.0d;
                KTVView kTVView12 = this.f123390j;
                if (kTVView12 == null) {
                    C52711k.m112237a("mKTVView");
                }
                double x10 = (double) kTVView12.getX();
                Double.isNaN(x10);
                double d6 = d5 - x10;
                ImageView imageView12 = this.f123389i;
                if (imageView12 == null) {
                    C52711k.m112237a("mSlide");
                }
                double width6 = (double) (imageView12.getWidth() / 2);
                Double.isNaN(width6);
                double d7 = d6 + width6;
                KTVView kTVView13 = this.f123390j;
                if (kTVView13 == null) {
                    C52711k.m112237a("mKTVView");
                }
                double width7 = (double) kTVView13.getWidth();
                Double.isNaN(width7);
                double d8 = d7 / width7;
                double d9 = (double) this.f123399s;
                Double.isNaN(d9);
                int i = (int) (d8 * d9);
                if (i < 0) {
                    i = 0;
                }
                if (i > this.f123399s) {
                    i = 0;
                }
                textView.setText(C47902fv.m103621a(i));
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae6, viewGroup, false);
        if (inflate != null) {
            this.f123383J = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f123383J;
            if (frameLayout == null) {
                C52711k.m112237a("mParentLayout");
            }
            return frameLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
