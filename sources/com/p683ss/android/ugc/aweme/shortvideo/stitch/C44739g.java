package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10664d;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42629f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42655m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42588e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42589f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42590g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42762ai;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42837b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42858bh;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42873bn;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42874bo;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44404b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48924a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g */
public final class C44739g extends C48924a implements C42655m, C42873bn, C49548a {

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f113257o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44739g.class), "previewScene", "getPreviewScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoPreviewScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44739g.class), "titleBarScene", "getTitleBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoTitleBarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44739g.class), "bottomScene", "getBottomScene()Lcom/ss/android/ugc/aweme/shortvideo/stitch/StitchTrimmingBottomScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44739g.class), "introduceScene", "getIntroduceScene()Lcom/ss/android/ugc/aweme/shortvideo/stitch/StitchIntroducingScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44739g.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;"))};

    /* renamed from: A */
    private CutVideoBottomBarViewModel f113258A;

    /* renamed from: B */
    private final C52668f f113259B = C52732g.m112285a(new C44757o(this));

    /* renamed from: C */
    private final C52668f f113260C = C52732g.m112285a(new C44759q(this));

    /* renamed from: D */
    private final C52668f f113261D = C52732g.m112285a(new C44740a(this));

    /* renamed from: E */
    private final C52668f f113262E = C52732g.m112285a(new C44755m(this));

    /* renamed from: F */
    private final C52668f f113263F = C52732g.m112285a(new C44756n(this));

    /* renamed from: p */
    CutVideoViewModel f113264p;

    /* renamed from: q */
    CutVideoPreviewViewModel f113265q;

    /* renamed from: r */
    VideoEditViewModel f113266r;

    /* renamed from: s */
    public StitchIntroduceViewModel f113267s;

    /* renamed from: t */
    public VEVideoCutterViewModel f113268t;

    /* renamed from: u */
    public String f113269u;

    /* renamed from: v */
    public C45547d f113270v;

    /* renamed from: w */
    public boolean f113271w;

    /* renamed from: x */
    C10660a f113272x;

    /* renamed from: y */
    private CutMultiVideoViewModel f113273y;

    /* renamed from: z */
    private CutVideoTitleBarViewModel f113274z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$a */
    static final class C44740a extends C52712l implements C52670a<C44735f> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113275a;

        C44740a(C44739g gVar) {
            this.f113275a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44735f fVar = new C44735f();
            VECutVideoPresenter L = this.f113275a.mo90839L();
            C52711k.m112240b(L, "<set-?>");
            fVar.f113247p = L;
            C42873bn bnVar = this.f113275a;
            C52711k.m112240b(bnVar, "<set-?>");
            fVar.f113248q = bnVar;
            this.f113275a.mo24389a((int) R.id.ey_, (C12924i) fVar, "CutVideoSingleBottomScene");
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$b */
    public static final class C44741b implements C42837b {

        /* renamed from: a */
        final /* synthetic */ C44739g f113276a;

        /* renamed from: b */
        final /* synthetic */ C52727e f113277b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f113278c;

        public final void onCompileDone() {
            boolean z;
            File c = ((Workspace) this.f113277b.element).mo86455c();
            C52711k.m112236a((Object) c, "workspace.concatVideoFile");
            String path = c.getPath();
            C52711k.m112236a((Object) path, "workspace.concatVideoFile.path");
            File d = ((Workspace) this.f113277b.element).mo86456d();
            C52711k.m112236a((Object) d, "workspace.concatAudioFile");
            String path2 = d.getPath();
            File c2 = ((Workspace) this.f113277b.element).mo86455c();
            C52711k.m112236a((Object) c2, "workspace.concatVideoFile");
            this.f113278c.setVideoSegment(new EditVideoSegment(path, path2, C43668b.m95933a(c2.getPath())));
            StitchParams stitchParams = this.f113278c;
            File c3 = ((Workspace) this.f113277b.element).mo86455c();
            C52711k.m112236a((Object) c3, "workspace.concatVideoFile");
            stitchParams.setDuration(C43668b.m95933a(c3.getPath()).getDuration());
            if (this.f113278c.isPGCMusic()) {
                CharSequence musicPath = this.f113278c.getMusicPath();
                if (musicPath == null || musicPath.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C44739g gVar = this.f113276a;
                    StitchParams stitchParams2 = this.f113278c;
                    String musicPath2 = stitchParams2.getMusicPath();
                    if (musicPath2 != null) {
                        EditVideoSegment videoSegment = stitchParams2.getVideoSegment();
                        if (videoSegment != null) {
                            String audioPath = videoSegment.getAudioPath();
                            if (audioPath != null) {
                                gVar.mo90839L();
                                C42629f cVar = new C44742c(gVar, stitchParams2);
                                C52711k.m112240b(musicPath2, "originAudioPath");
                                C52711k.m112240b(audioPath, "segmentAudioPath");
                                C52711k.m112240b(cVar, "callback");
                                C42588e eVar = new C42588e(cVar, musicPath2, 0, audioPath, 0, -1);
                                C2201v.m6601a((C2205y<T>) eVar).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C42589f<Object>(cVar), (C1710e<? super Throwable>) new C42590g<Object>(cVar));
                                return;
                            }
                        }
                    }
                }
            }
            this.f113278c.setMusic(null);
            this.f113276a.mo90841N();
        }

        public final void onCompileProgress(float f) {
            C45547d dVar = this.f113276a.f113270v;
            if (dVar != null) {
                if (!dVar.isShowing()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.setProgress((int) (f * 100.0f));
                }
            }
        }

        /* renamed from: a */
        public final void mo86846a(boolean z) {
            this.f113276a.f113271w = z;
            if (!z) {
                this.f113276a.f113270v = C45547d.m99208b(this.f113276a.f33840g_, this.f113276a.mo24478w().getString(R.string.dj9));
                C45547d dVar = this.f113276a.f113270v;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
            }
        }

        C44741b(C44739g gVar, C52727e eVar, StitchParams stitchParams) {
            this.f113276a = gVar;
            this.f113277b = eVar;
            this.f113278c = stitchParams;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            Context context = this.f113276a.f33840g_;
            StringBuilder sb = new StringBuilder("合成失败 ");
            sb.append(i);
            C10691a.m21545b(context, sb.toString()).mo19066a();
            this.f113276a.mo90840M();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$c */
    public static final class C44742c implements C42629f {

        /* renamed from: a */
        final /* synthetic */ C44739g f113279a;

        /* renamed from: b */
        final /* synthetic */ StitchParams f113280b;

        /* renamed from: a */
        public final void mo86893a(int i) {
            boolean z;
            this.f113280b.setMusicStart(i);
            StitchParams stitchParams = this.f113280b;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            stitchParams.setMuted(z);
            if (i < 0) {
                this.f113280b.setMusic(null);
            }
            this.f113279a.mo90841N();
        }

        /* renamed from: a */
        public final void mo86894a(Exception exc) {
            C52711k.m112240b(exc, "exception");
            C10691a.m21542b((Context) this.f113279a.f33840g_, (int) R.string.ah1).mo19066a();
            this.f113279a.mo90840M();
        }

        C44742c(C44739g gVar, StitchParams stitchParams) {
            this.f113279a = gVar;
            this.f113280b = stitchParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$d */
    static final class C44743d extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113281a;

        C44743d(C44739g gVar) {
            this.f113281a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f113281a.f33834b.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44743d f113282a;

                {
                    this.f113282a = r1;
                }

                public final void run() {
                    C44739g gVar = this.f113282a.f113281a;
                    View j_ = gVar.mo24467j_(R.id.dos);
                    C52711k.m112236a((Object) j_, "requireViewById(R.id.videoEditView)");
                    AbstractVideoEditView abstractVideoEditView = (AbstractVideoEditView) j_;
                    Activity activity = gVar.f33840g_;
                    if (activity != null) {
                        C10661a a = new C10661a((FragmentActivity) activity).mo19015b((int) R.string.g1r).mo19010a(5000).mo19013a(true);
                        C10664d pVar = new C44758p(gVar);
                        C52711k.m112240b(pVar, "listener");
                        a.f28418w = pVar;
                        gVar.f113272x = a.mo19014a();
                        C10660a aVar = gVar.f113272x;
                        if (aVar != null) {
                            aVar.mo18999a(abstractVideoEditView, 48, true);
                            return;
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$e */
    static final class C44745e extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113283a;

        C44745e(C44739g gVar) {
            this.f113283a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f113283a.f33834b.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44745e f113284a;

                {
                    this.f113284a = r1;
                }

                public final void run() {
                    C44739g gVar = this.f113284a.f113283a;
                    View j_ = gVar.mo24467j_(R.id.d6b);
                    C52711k.m112236a((Object) j_, "requireViewById(R.id.tvNext)");
                    TextView textView = (TextView) j_;
                    Rect rect = new Rect();
                    Paint paint = new Paint();
                    String string = gVar.mo24478w().getString(R.string.g1q);
                    paint.setTextSize(C9432q.m18687b((Context) gVar.f33840g_, 13.0f));
                    paint.getTextBounds(string, 0, string.length(), rect);
                    int width = (int) ((((((float) rect.width()) + C9432q.m18687b((Context) gVar.f33840g_, 12.0f)) + C9432q.m18687b((Context) gVar.f33840g_, 12.0f)) - ((float) textView.getWidth())) / 2.0f);
                    int i = -width;
                    if (C47842ed.m103485a(gVar.mo86847a())) {
                        width = i;
                    }
                    Activity activity = gVar.f33840g_;
                    if (activity != null) {
                        C10661a a = new C10661a((FragmentActivity) activity).mo19015b((int) R.string.g1q).mo19010a(5000);
                        a.f28404i = i;
                        a.f28397b = (float) width;
                        a.mo19013a(true).mo19014a().mo18999a(textView, 80, true);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$f */
    static final class C44747f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113285a;

        C44747f(C44739g gVar) {
            this.f113285a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f113285a.f33834b.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44747f f113286a;

                {
                    this.f113286a = r1;
                }

                public final void run() {
                    Activity activity = this.f113286a.f113285a.f33840g_;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$g */
    static final class C44749g<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113287a;

        C44749g(C44739g gVar) {
            this.f113287a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            String str = this.f113287a.f113269u;
            if (str == null) {
                str = "";
            }
            C44726a.m97839a(str, this.f113287a.mo90837J().mo90836L().getRightSeekingValue() - this.f113287a.mo90837J().mo90836L().getLeftSeekingValue(), this.f113287a.mo90837J().mo90836L().getLeftSeekingValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$h */
    static final class C44750h<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113288a;

        C44750h(C44739g gVar) {
            this.f113288a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            String str = this.f113288a.f113269u;
            if (str == null) {
                str = "";
            }
            C44726a.m97839a(str, this.f113288a.mo90837J().mo90836L().getRightSeekingValue() - this.f113288a.mo90837J().mo90836L().getLeftSeekingValue(), this.f113288a.mo90837J().mo90836L().getLeftSeekingValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$i */
    static final class C44751i extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113289a;

        C44751i(C44739g gVar) {
            this.f113289a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            Activity activity = this.f113289a.f33840g_;
            if (activity != null) {
                activity.finish();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$j */
    static final class C44752j extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113290a;

        C44752j(C44739g gVar) {
            this.f113290a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C44739g gVar = this.f113290a;
            Activity activity = gVar.f33840g_;
            if (activity == null || !activity.isFinishing()) {
                CutVideoViewModel cutVideoViewModel = gVar.f113264p;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                StitchParams stitchParams = cutVideoViewModel.mo87177f().f108079v;
                if (stitchParams == null) {
                    stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 32767, null);
                }
                C52727e eVar = new C52727e();
                CutVideoViewModel cutVideoViewModel2 = gVar.f113264p;
                if (cutVideoViewModel2 == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                eVar.element = cutVideoViewModel2.mo87177f().f108068k;
                if (((Workspace) eVar.element) == null) {
                    eVar.element = Workspace.m93091a();
                    CutVideoViewModel cutVideoViewModel3 = gVar.f113264p;
                    if (cutVideoViewModel3 == null) {
                        C52711k.m112237a("cutVideoViewModel");
                    }
                    cutVideoViewModel3.mo87177f().f108068k = (Workspace) eVar.element;
                }
                String musicPath = stitchParams.getMusicPath();
                if (musicPath != null && C48016e.m103944b(musicPath)) {
                    Workspace workspace = (Workspace) eVar.element;
                    if (workspace != null) {
                        workspace.mo86453a(new File(musicPath));
                    }
                }
                VECutVideoPresenter L = gVar.mo90839L();
                Workspace workspace2 = (Workspace) eVar.element;
                if (workspace2 == null) {
                    C52711k.m112234a();
                }
                L.mo86814a(workspace2, false, false, new C44741b(gVar, eVar, stitchParams), true);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$k */
    static final class C44753k extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113291a;

        C44753k(C44739g gVar) {
            this.f113291a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            if (!this.f113291a.mo90838K().mo24445C()) {
                C44739g.m97900a(this.f113291a).mo87731a(new C43168a(2, false));
                this.f113291a.mo24409d((C12924i) this.f113291a.mo90838K());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$l */
    static final class C44754l extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113292a;

        C44754l(C44739g gVar) {
            this.f113292a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f113292a.mo90839L().f107704r = true;
            C44739g.m97900a(this.f113292a).mo87731a(new C43168a(1, false));
            this.f113292a.mo24404c((C12924i) this.f113292a.mo90838K());
            C44739g.m97901b(this.f113292a).mo90764e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$m */
    static final class C44755m extends C52712l implements C52670a<C44727b> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113293a;

        C44755m(C44739g gVar) {
            this.f113293a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44727b bVar = new C44727b();
            this.f113293a.mo24389a((int) R.id.ey_, (C12924i) bVar, "StitchIntroducingScene");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$n */
    static final class C44756n extends C52712l implements C52670a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113294a;

        C44756n(C44739g gVar) {
            this.f113294a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String b = Workspace.m93095b();
            C52711k.m112236a((Object) b, "Workspace.getImportDir()");
            return new VECutVideoPresenter(b, this.f113294a, C44730c.m97858a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$o */
    static final class C44757o extends C52712l implements C52670a<C42762ai> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113295a;

        C44757o(C44739g gVar) {
            this.f113295a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42762ai aiVar = new C42762ai();
            aiVar.mo87233a(this.f113295a.mo90839L());
            this.f113295a.mo24389a((int) R.id.ey_, (C12924i) aiVar, "CutVideoPreviewScene");
            return aiVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$p */
    public static final class C44758p implements C10664d {

        /* renamed from: a */
        final /* synthetic */ C44739g f113296a;

        /* renamed from: a */
        public final void mo19019a() {
            StitchIntroduceViewModel b = C44739g.m97901b(this.f113296a);
            C44730c.f113238a.edit().putBoolean("stitch_trimming_next_guide", true).apply();
            b.mo22530c(C44721c.f113209a);
        }

        C44758p(C44739g gVar) {
            this.f113296a = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.g$q */
    static final class C44759q extends C52712l implements C52670a<C42858bh> {

        /* renamed from: a */
        final /* synthetic */ C44739g f113297a;

        C44759q(C44739g gVar) {
            this.f113297a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42858bh bhVar = new C42858bh();
            this.f113297a.mo24389a((int) R.id.ey_, (C12924i) bhVar, "CutVideoTitleBarScene");
            return bhVar;
        }
    }

    /* renamed from: S */
    private final C42762ai m97899S() {
        return (C42762ai) this.f113259B.getValue();
    }

    /* renamed from: J */
    public final C44735f mo90837J() {
        return (C44735f) this.f113261D.getValue();
    }

    /* renamed from: K */
    public final C44727b mo90838K() {
        return (C44727b) this.f113262E.getValue();
    }

    /* renamed from: L */
    public final VECutVideoPresenter mo90839L() {
        return (VECutVideoPresenter) this.f113263F.getValue();
    }

    /* renamed from: a */
    public final void mo86848a(C20347c cVar) {
    }

    public final C0184k bP_() {
        return this;
    }

    public final int bT_() {
        return 0;
    }

    public final void bV_() {
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
            this.f113264p = (CutVideoViewModel) a;
            mo24409d((C12924i) m97899S());
            mo24409d((C12924i) (C42858bh) this.f113260C.getValue());
            mo24409d((C12924i) mo90837J());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo87247a(C42874bo boVar) {
        C52711k.m112240b(boVar, "controller");
        m97899S().f108146i = boVar;
    }

    /* renamed from: c */
    public final C11910j mo86790c() {
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

    /* renamed from: O */
    public final int mo87242O() {
        return m97899S().mo87230H();
    }

    /* renamed from: P */
    public final int mo87243P() {
        return m97899S().mo87231I();
    }

    /* renamed from: Q */
    public final int mo87244Q() {
        return m97899S().mo87232J();
    }

    /* renamed from: R */
    public final C43120d mo87245R() {
        return mo90837J().mo90836L();
    }

    public final long bQ_() {
        return mo90837J().mo90836L().getMaxCutDuration();
    }

    public final void bS_() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            activity.finish();
        }
    }

    public final SurfaceView bU_() {
        return m97899S().mo87229G();
    }

    public final void bW_() {
        mo90837J().mo90835K().mo87346H();
    }

    public final void bX_() {
        mo90837J().mo90836L().mo87554b();
    }

    /* renamed from: M */
    public final void mo90840M() {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f113274z;
        if (cutVideoTitleBarViewModel == null) {
            C52711k.m112237a("titleBarViewModel");
        }
        cutVideoTitleBarViewModel.mo87173d(true);
        C47700ay.m103236b(this.f113270v);
    }

    /* renamed from: a */
    public final Context mo86847a() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            return (FragmentActivity) activity;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final C0794k<Long, Long> bR_() {
        C0794k<Long, Long> playBoundary = mo90837J().mo90836L().getPlayBoundary();
        C52711k.m112236a((Object) playBoundary, "bottomScene.getVideoEditView().playBoundary");
        return playBoundary;
    }

    /* renamed from: o */
    public final void mo24468o() {
        super.mo24468o();
        VECutVideoPresenter L = mo90839L();
        Activity v = mo24477v();
        if (v != null) {
            L.mo86812a((FragmentActivity) v);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        if (C44730c.m97858a()) {
            StitchIntroduceViewModel stitchIntroduceViewModel = this.f113267s;
            if (stitchIntroduceViewModel == null) {
                C52711k.m112237a("stitchViewModel");
            }
            stitchIntroduceViewModel.mo90764e();
            return;
        }
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f113267s;
        if (stitchIntroduceViewModel2 == null) {
            C52711k.m112237a("stitchViewModel");
        }
        stitchIntroduceViewModel2.mo22530c(C44720b.f113208a);
    }

    /* renamed from: N */
    public final void mo90841N() {
        String str;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f113274z;
        if (cutVideoTitleBarViewModel == null) {
            C52711k.m112237a("titleBarViewModel");
        }
        boolean z = true;
        cutVideoTitleBarViewModel.mo87173d(true);
        C47700ay.m103236b(this.f113270v);
        Intent intent = new Intent();
        intent.putExtra("shoot_mode", 12);
        CutVideoViewModel cutVideoViewModel = this.f113264p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        StitchParams stitchParams = cutVideoViewModel.mo87177f().f108079v;
        if (stitchParams == null) {
            stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 32767, null);
        }
        if (stitchParams.isPGCMusic()) {
            String str2 = this.f113269u;
            if (str2 == null) {
                str2 = "";
            }
            long duration = stitchParams.getDuration();
            long leftSeekingValue = mo90837J().mo90836L().getLeftSeekingValue();
            if (stitchParams.getMusicStart() < 0) {
                z = false;
            }
            C52711k.m112240b(str2, "creationId");
            String str3 = "stitch_next";
            C23089d a = C23089d.m56640a().mo47829a("shoot_way", "stitch").mo47829a("enter_from", "video_stitch_page").mo47829a("creation_id", str2).mo47829a("content_source", "shoot").mo47829a("content_type", "video");
            String str4 = "pgc_stitched";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).mo47827a("duration", duration).mo47827a("duration_begin_at", leftSeekingValue).f61491a);
        } else {
            String str5 = this.f113269u;
            if (str5 == null) {
                str5 = "";
            }
            long duration2 = stitchParams.getDuration();
            long leftSeekingValue2 = mo90837J().mo90836L().getLeftSeekingValue();
            C52711k.m112240b(str5, "creationId");
            C26890h.m65011a("stitch_next", C23089d.m56640a().mo47829a("shoot_way", "stitch").mo47829a("enter_from", "video_stitch_page").mo47829a("creation_id", str5).mo47829a("content_source", "shoot").mo47829a("content_type", "video").mo47827a("duration", duration2).mo47827a("duration_begin_at", leftSeekingValue2).f61491a);
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            C43214dh.m94817a().mo50200a((C42482c) null);
        }
        intent.putExtra("enter_from", "video_stitch_page");
        intent.putExtra("music_origin", "stitch");
        intent.putExtra("creation_id", this.f113269u);
        intent.putExtra("shoot_way", "stitch");
        intent.putExtra("content_type", "video");
        intent.putExtra("content_source", "shoot");
        String str6 = "stitch_params";
        if (stitchParams != null) {
            intent.putExtra(str6, stitchParams);
            Activity activity = this.f33840g_;
            if (activity != null) {
                C44404b a2 = C44403a.m97196a();
                C52711k.m112236a((Object) activity, "it");
                a2.mo48305b(activity, intent, (int) BaseNotice.CHECK_PROFILE);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m97900a(C44739g gVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = gVar.f113268t;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ StitchIntroduceViewModel m97901b(C44739g gVar) {
        StitchIntroduceViewModel stitchIntroduceViewModel = gVar.f113267s;
        if (stitchIntroduceViewModel == null) {
            C52711k.m112237a("stitchViewModel");
        }
        return stitchIntroduceViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(CutMultiVideoViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f113273y = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoPreviewViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f113265q = (CutVideoPreviewViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoTitleBarViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…BarViewModel::class.java)");
                    this.f113274z = (CutVideoTitleBarViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoBottomBarViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…BarViewModel::class.java)");
                        this.f113258A = (CutVideoBottomBarViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            C0209x a5 = C0214z.m440a((FragmentActivity) activity5).mo359a(VideoEditViewModel.class);
                            C52711k.m112236a((Object) a5, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                            this.f113266r = (VideoEditViewModel) a5;
                            VideoEditViewModel videoEditViewModel = this.f113266r;
                            if (videoEditViewModel == null) {
                                C52711k.m112237a("videoEditViewModel");
                            }
                            videoEditViewModel.f108906a = true;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(StitchIntroduceViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…uceViewModel::class.java)");
                                this.f113267s = (StitchIntroduceViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    C0209x a7 = C0214z.m440a((FragmentActivity) activity7).mo359a(VEVideoCutterViewModel.class);
                                    C52711k.m112236a((Object) a7, "ViewModelProviders.of(ac…terViewModel::class.java]");
                                    this.f113268t = (VEVideoCutterViewModel) a7;
                                    CutVideoViewModel cutVideoViewModel = this.f113264p;
                                    if (cutVideoViewModel == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    mo49444c(cutVideoViewModel, C44760h.f113298a, new C11934u(), new C44751i(this));
                                    CutVideoViewModel cutVideoViewModel2 = this.f113264p;
                                    if (cutVideoViewModel2 == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    mo49444c(cutVideoViewModel2, C44763k.f113301a, new C11934u(), new C44752j(this));
                                    StitchIntroduceViewModel stitchIntroduceViewModel = this.f113267s;
                                    if (stitchIntroduceViewModel == null) {
                                        C52711k.m112237a("stitchViewModel");
                                    }
                                    mo49444c(stitchIntroduceViewModel, C44764l.f113302a, new C11934u(), new C44753k(this));
                                    StitchIntroduceViewModel stitchIntroduceViewModel2 = this.f113267s;
                                    if (stitchIntroduceViewModel2 == null) {
                                        C52711k.m112237a("stitchViewModel");
                                    }
                                    mo49444c(stitchIntroduceViewModel2, C44765m.f113303a, new C11934u(), new C44754l(this));
                                    StitchIntroduceViewModel stitchIntroduceViewModel3 = this.f113267s;
                                    if (stitchIntroduceViewModel3 == null) {
                                        C52711k.m112237a("stitchViewModel");
                                    }
                                    mo49444c(stitchIntroduceViewModel3, C44766n.f113304a, new C11934u(), new C44743d(this));
                                    StitchIntroduceViewModel stitchIntroduceViewModel4 = this.f113267s;
                                    if (stitchIntroduceViewModel4 == null) {
                                        C52711k.m112237a("stitchViewModel");
                                    }
                                    mo49444c(stitchIntroduceViewModel4, C44761i.f113299a, new C11934u(), new C44745e(this));
                                    StitchIntroduceViewModel stitchIntroduceViewModel5 = this.f113267s;
                                    if (stitchIntroduceViewModel5 == null) {
                                        C52711k.m112237a("stitchViewModel");
                                    }
                                    mo49444c(stitchIntroduceViewModel5, C44762j.f113300a, new C11934u(), new C44747f(this));
                                    VideoEditViewModel videoEditViewModel2 = this.f113266r;
                                    if (videoEditViewModel2 == null) {
                                        C52711k.m112237a("videoEditViewModel");
                                    }
                                    C0184k kVar = this;
                                    videoEditViewModel2.f108913h.observe(kVar, new C44749g(this));
                                    VideoEditViewModel videoEditViewModel3 = this.f113266r;
                                    if (videoEditViewModel3 == null) {
                                        C52711k.m112237a("videoEditViewModel");
                                    }
                                    videoEditViewModel3.f108916k.observe(kVar, new C44750h(this));
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
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brl, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
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
