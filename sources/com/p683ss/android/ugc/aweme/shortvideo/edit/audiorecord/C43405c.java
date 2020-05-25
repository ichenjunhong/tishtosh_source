package com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.audiorecord.Point;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton.C43396a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43402b.C43403a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44001a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44002b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44009g;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.gamora.editor.EditAudioRecordModel;
import com.p683ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VEAudioEncodeSettings;
import com.p683ss.android.vesdk.VEAudioEncodeSettings.C50523a;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c */
public final class C43405c extends C12924i implements C9382a {

    /* renamed from: Q */
    public static final C43406a f109736Q = new C43406a(null);

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f109737i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43405c.class), "processTimeLiveData", "getProcessTimeLiveData()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43405c.class), "needOriginalSoundLiveData", "getNeedOriginalSoundLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: A */
    public ViewGroup f109738A;

    /* renamed from: B */
    public AudioRecordStartButton f109739B;

    /* renamed from: C */
    public boolean f109740C;

    /* renamed from: D */
    public boolean f109741D;

    /* renamed from: E */
    public View f109742E;

    /* renamed from: F */
    public AVDmtTextView f109743F;

    /* renamed from: G */
    public CheckBox f109744G;

    /* renamed from: H */
    public C43429e f109745H;

    /* renamed from: I */
    public AudioRecorderParam f109746I;

    /* renamed from: J */
    public volatile boolean f109747J;

    /* renamed from: K */
    public final C9381g f109748K;

    /* renamed from: L */
    public final int f109749L;

    /* renamed from: M */
    public final int f109750M;

    /* renamed from: N */
    public final int f109751N;

    /* renamed from: O */
    public final C43421p f109752O;

    /* renamed from: P */
    public final C43417l f109753P;

    /* renamed from: R */
    private final float f109754R = 16.0f;

    /* renamed from: S */
    private final C52668f f109755S = C52732g.m112285a(C43422q.f109806a);

    /* renamed from: T */
    private final C52668f f109756T = C52732g.m112285a(C43418m.f109802a);

    /* renamed from: U */
    private int f109757U = -1;

    /* renamed from: V */
    private EditAudioRecordModel f109758V;

    /* renamed from: W */
    private EditPreviewViewModel f109759W;

    /* renamed from: X */
    private View f109760X;

    /* renamed from: Y */
    private DmtStatusView f109761Y;

    /* renamed from: Z */
    private View f109762Z;

    /* renamed from: aa */
    private EditViewModel f109763aa;

    /* renamed from: ab */
    private FrameLayout f109764ab;

    /* renamed from: ac */
    private ChooseVideoCoverView f109765ac;

    /* renamed from: ad */
    private View f109766ad;

    /* renamed from: ae */
    private LottieAnimationView f109767ae;

    /* renamed from: af */
    private VEVideoCoverGeneratorImpl f109768af;

    /* renamed from: ag */
    private C45617m f109769ag;

    /* renamed from: ah */
    private C0198r<Bitmap> f109770ah;

    /* renamed from: ai */
    private C0198r<Boolean> f109771ai;

    /* renamed from: aj */
    private final C43409d f109772aj;

    /* renamed from: j */
    public final float f109773j = 52.0f;

    /* renamed from: k */
    public final float f109774k = 224.0f;

    /* renamed from: l */
    public C20347c f109775l;

    /* renamed from: m */
    public int f109776m = 1;

    /* renamed from: n */
    public float f109777n;

    /* renamed from: o */
    public C23441t f109778o;

    /* renamed from: p */
    public final ValueAnimator f109779p;

    /* renamed from: q */
    public boolean f109780q;

    /* renamed from: r */
    public boolean f109781r;

    /* renamed from: s */
    public Point f109782s;

    /* renamed from: t */
    public VideoPublishEditModel f109783t;

    /* renamed from: u */
    public VEVideoPublishEditViewModel f109784u;

    /* renamed from: v */
    public C0198r<C53030y> f109785v;

    /* renamed from: w */
    public View f109786w;

    /* renamed from: x */
    public View f109787x;

    /* renamed from: y */
    public View f109788y;

    /* renamed from: z */
    public C43402b f109789z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$a */
    public static final class C43406a {
        private C43406a() {
        }

        public /* synthetic */ C43406a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$b */
    static final class C43407b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Runnable f109790a;

        C43407b(Runnable runnable) {
            this.f109790a = runnable;
        }

        public final /* synthetic */ Object call() {
            this.f109790a.run();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$c */
    static final class C43408c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43405c f109791a;

        /* renamed from: b */
        final /* synthetic */ String f109792b;

        C43408c(C43405c cVar, String str) {
            this.f109791a = cVar;
            this.f109792b = str;
        }

        public final void run() {
            this.f109791a.f109747J = false;
            this.f109791a.f109748K.sendEmptyMessage(this.f109791a.f109749L);
            if (!C52830p.m112413c(this.f109792b, "df", false, 2, null)) {
                C48016e.m103947c(this.f109792b);
            }
            this.f109791a.f109748K.sendEmptyMessage(this.f109791a.f109751N);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$d */
    public static final class C43409d extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C43405c f109793a;

        C43409d(C43405c cVar) {
            this.f109793a = cVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            if (this.f109793a.f109747J) {
                int id = view.getId();
                Point point = null;
                if (id == R.id.d7g) {
                    C43405c cVar = this.f109793a;
                    if (cVar.f109780q || cVar.f109781r) {
                        C43405c.m95171a(cVar, false, 0, 3, null);
                    }
                    C26890h.m65011a("cancel_dub", cVar.mo88358i().f61491a);
                    cVar.mo88356f();
                    AudioRecorderParam audioRecorderParam = cVar.f109746I;
                    VideoPublishEditModel videoPublishEditModel = cVar.f109783t;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    if (audioRecorderParam.hasChange(videoPublishEditModel.veAudioRecorderParam)) {
                        C10643a aVar = new C10643a(cVar.f33840g_);
                        aVar.mo18885a((int) R.string.akt).mo18900b((int) R.string.akx, (OnClickListener) C43425t.f109809a).mo18886a((int) R.string.akw, (OnClickListener) new C43426u(cVar));
                        aVar.mo18897a().mo18882b();
                    } else {
                        VideoPublishEditModel videoPublishEditModel2 = cVar.f109783t;
                        if (videoPublishEditModel2 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        float f = videoPublishEditModel2.musicVolume;
                        VideoPublishEditModel videoPublishEditModel3 = cVar.f109783t;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        cVar.mo88348a(f, videoPublishEditModel3.voiceVolume);
                        cVar.mo88349a(cVar.f109746I.getAudioUrl());
                    }
                } else if (id == R.id.df8) {
                    C43405c cVar2 = this.f109793a;
                    if (cVar2.f109780q || cVar2.f109781r) {
                        C43405c.m95171a(cVar2, false, 0, 3, null);
                    }
                    String str = "";
                    cVar2.mo88356f();
                    if (cVar2.f109745H != null) {
                        VideoPublishEditModel videoPublishEditModel4 = cVar2.f109783t;
                        if (videoPublishEditModel4 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        float f2 = videoPublishEditModel4.musicVolume;
                        VideoPublishEditModel videoPublishEditModel5 = cVar2.f109783t;
                        if (videoPublishEditModel5 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        cVar2.mo88348a(f2, videoPublishEditModel5.voiceVolume);
                        if (cVar2.f109746I.getAudioRecordIndex() < 0 && cVar2.f109746I.hasRecord()) {
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = cVar2.f109784u;
                            if (vEVideoPublishEditViewModel == null) {
                                C52711k.m112237a("mVEVideoPublishEditViewModel");
                            }
                            C0198r b = vEVideoPublishEditViewModel.mo110457b();
                            C52711k.m112236a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                            b.setValue(cVar2.f109746I);
                        }
                    }
                    VideoPublishEditModel videoPublishEditModel6 = cVar2.f109783t;
                    if (videoPublishEditModel6 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    if (videoPublishEditModel6.veAudioRecorderParam == null) {
                        VideoPublishEditModel videoPublishEditModel7 = cVar2.f109783t;
                        if (videoPublishEditModel7 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        videoPublishEditModel7.veAudioRecorderParam = new AudioRecorderParam();
                    } else {
                        VideoPublishEditModel videoPublishEditModel8 = cVar2.f109783t;
                        if (videoPublishEditModel8 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        str = videoPublishEditModel8.veAudioRecorderParam.getAudioUrl();
                    }
                    VideoPublishEditModel videoPublishEditModel9 = cVar2.f109783t;
                    if (videoPublishEditModel9 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    videoPublishEditModel9.veAudioRecorderParam.copyFrom(cVar2.f109746I);
                    if (C52830p.m112413c(str, "df", false, 2, null)) {
                        VideoPublishEditModel videoPublishEditModel10 = cVar2.f109783t;
                        if (videoPublishEditModel10 == null) {
                            C52711k.m112237a("mVideoPublishEditModel");
                        }
                        videoPublishEditModel10.veAudioRecorderParam.setExtraUrl(str);
                        str = "";
                    }
                    String str2 = "save_dub";
                    C26890h.m65011a(str2, cVar2.mo88358i().mo47826a("original_sound", cVar2.f109746I.getNeedOriginalSound() ? 1 : 0).f61491a);
                    cVar2.mo88349a(str);
                } else if (id == R.id.dql) {
                    C43405c.m95171a(this.f109793a, false, 0, 3, null);
                } else if (id == R.id.iy) {
                    C43405c cVar3 = this.f109793a;
                    if (cVar3.f109780q || cVar3.f109781r) {
                        C43405c.m95171a(cVar3, false, 0, 3, null);
                    }
                    C26890h.m65011a("delete_dub", cVar3.mo88358i().f61491a);
                    cVar3.f109746I.setNeedDel(true);
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = cVar3.f109784u;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    C0198r b2 = vEVideoPublishEditViewModel2.mo110457b();
                    C52711k.m112236a((Object) b2, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                    b2.setValue(cVar3.f109746I);
                    C43402b bVar = cVar3.f109789z;
                    if (bVar == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    if (!bVar.f109721b.getMStack().empty()) {
                        point = (Point) bVar.f109721b.getMStack().pop();
                        bVar.mo88343b();
                    }
                    if (point != null) {
                        float x = ((float) point.getX()) / ((float) cVar3.f109776m);
                        point.setY(point.getY() + 100);
                        if (point.getY() > cVar3.f109776m) {
                            point.setY(cVar3.f109776m);
                        }
                        C43429e eVar = cVar3.f109745H;
                        if (eVar != null) {
                            eVar.f109813a.mo98465a(point.getX(), point.getY());
                        }
                        cVar3.f109752O.mo88366a(x, true);
                        C43402b bVar2 = cVar3.f109789z;
                        if (bVar2 == null) {
                            C52711k.m112237a("audioRecordSeekBar");
                        }
                        bVar2.mo88339a(x);
                        AudioRecorderParam audioRecorderParam2 = cVar3.f109746I;
                        C43402b bVar3 = cVar3.f109789z;
                        if (bVar3 == null) {
                            C52711k.m112237a("audioRecordSeekBar");
                        }
                        audioRecorderParam2.setMStack(bVar3.getStack());
                        if (cVar3.f109746I.getMStack().isEmpty()) {
                            View view2 = cVar3.f109742E;
                            if (view2 == null) {
                                C52711k.m112237a("backView");
                            }
                            view2.setVisibility(8);
                        }
                    }
                } else if (id == R.id.b37) {
                    this.f109793a.mo88350a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$e */
    public static final class C43410e extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C43405c f109794a;

        C43410e(C43405c cVar) {
            this.f109794a = cVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            if (this.f109794a.f109741D) {
                this.f109794a.f109741D = false;
                C43405c.m95173b(this.f109794a).mo88319b();
                C43405c.m95171a(this.f109794a, false, 0, 3, null);
                this.f109794a.mo88354c("click");
                return;
            }
            this.f109794a.f109741D = true;
            C43396a aVar = C43405c.m95173b(this.f109794a).f109701b;
            if (aVar == null) {
                C52711k.m112237a("centerView");
            }
            aVar.f109705b.end();
            aVar.f109706c.start();
            this.f109794a.mo88350a(true);
            this.f109794a.mo88352b("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$f */
    public static final class C43411f implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C43405c f109795a;

        C43411f(C43405c cVar) {
            this.f109795a = cVar;
        }

        public final boolean onLongClick(View view) {
            this.f109795a.f109740C = true;
            AudioRecordStartButton b = C43405c.m95173b(this.f109795a);
            b.f109703d.end();
            b.f109702c.start();
            this.f109795a.mo88350a(true);
            this.f109795a.mo88352b("long_press");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$g */
    public static final class C43412g implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C43405c f109796a;

        C43412g(C43405c cVar) {
            this.f109796a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (((motionEvent != null && motionEvent.getAction() == 3) || (motionEvent != null && motionEvent.getAction() == 1)) && this.f109796a.f109740C) {
                this.f109796a.f109740C = false;
                C43405c.m95173b(this.f109796a).mo88318a();
                C43405c.m95171a(this.f109796a, false, 0, 3, null);
                this.f109796a.mo88354c("long_press");
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$h */
    static final class C43413h implements C44009g {

        /* renamed from: a */
        final /* synthetic */ C44001a f109797a;

        C43413h(C44001a aVar) {
            this.f109797a = aVar;
        }

        /* renamed from: a */
        public final void mo59016a(List<Bitmap> list) {
            this.f109797a.mo89830a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$i */
    static final class C43414i<T> implements C0199s<Long> {

        /* renamed from: a */
        final /* synthetic */ C43405c f109798a;

        C43414i(C43405c cVar) {
            this.f109798a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                C43402b a = C43405c.m95170a(this.f109798a);
                int longValue = (int) l.longValue();
                if (longValue < a.f109727h - 1) {
                    Iterator it = a.f109721b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            longValue = -1;
                            break;
                        }
                        Point point = (Point) it.next();
                        if (longValue >= point.getX() && longValue < point.getY()) {
                            longValue = point.getX();
                            break;
                        }
                    }
                }
                if (-1 == longValue) {
                    AudioRecordStartButton b = C43405c.m95173b(this.f109798a);
                    b.setAlpha(1.0f);
                    b.setEnabled(true);
                    C43405c.m95174c(this.f109798a).setText(R.string.alh);
                    return;
                }
                if (!this.f109798a.f109780q) {
                    AudioRecordStartButton b2 = C43405c.m95173b(this.f109798a);
                    b2.setAlpha(0.5f);
                    b2.setEnabled(false);
                    C43405c.m95174c(this.f109798a).setText(R.string.aks);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$j */
    static final class C43415j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43405c f109799a;

        C43415j(C43405c cVar) {
            this.f109799a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    C43405c.m95175d(this.f109799a).voiceVolume = this.f109799a.f109746I.getVoiceVolume();
                } else {
                    C43405c.m95175d(this.f109799a).voiceVolume = 0.0f;
                }
                this.f109799a.f109746I.setNeedOriginalSound(bool.booleanValue());
                if (this.f109799a.f109781r && !this.f109799a.f109780q) {
                    this.f109799a.mo88348a(-1.0f, C43405c.m95175d(this.f109799a).voiceVolume);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$k */
    static final class C43416k implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43405c f109800a;

        C43416k(C43405c cVar) {
            this.f109800a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i;
            int i2;
            C20347c cVar = this.f109800a.f109775l;
            if (cVar != null) {
                this.f109800a.mo88353c().setValue(Long.valueOf((long) cVar.mo43073l()));
                C43405c.m95170a(this.f109800a).mo88339a(((float) cVar.mo43073l()) / ((float) cVar.mo43071k()));
                if (this.f109800a.f109780q) {
                    C43402b a = C43405c.m95170a(this.f109800a);
                    int l = cVar.mo43073l();
                    Point point = this.f109800a.f109782s;
                    if (point != null) {
                        i = point.getX();
                    } else {
                        i = l;
                    }
                    Iterator it = a.f109721b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        Point point2 = (Point) it.next();
                        if (point2.getX() >= i && l >= point2.getX() && l <= point2.getY() && (!C52711k.m112239a((Object) point2, (Object) point))) {
                            i2 = point2.getX();
                            break;
                        }
                    }
                    C43405c.m95170a(this.f109800a).mo88343b();
                    if (i2 == -1) {
                        Point point3 = this.f109800a.f109782s;
                        if (point3 != null) {
                            point3.setY(cVar.mo43073l());
                        }
                        C43405c.m95170a(this.f109800a).mo88343b();
                    } else {
                        Point point4 = this.f109800a.f109782s;
                        if (point4 != null) {
                            point4.setY(i2);
                        }
                        C43405c.m95170a(this.f109800a).mo88343b();
                        this.f109800a.mo88351a(false, i2);
                    }
                } else {
                    this.f109800a.f109782s = null;
                }
                if (cVar.mo43073l() >= this.f109800a.f109776m) {
                    if (this.f109800a.f109780q) {
                        C43405c.m95171a(this.f109800a, true, 0, 2, null);
                        return;
                    }
                    this.f109800a.f109779p.cancel();
                    this.f109800a.f109752O.mo88366a(0.0f, true);
                    C43405c.m95170a(this.f109800a).mo88339a(0.0f);
                    this.f109800a.f109746I.setMStack(C43405c.m95170a(this.f109800a).getStack());
                    if (this.f109800a.f109746I.getMStack().isEmpty()) {
                        C43405c.m95176e(this.f109800a).setVisibility(8);
                        return;
                    }
                    C43405c.m95176e(this.f109800a).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$l */
    public static final class C43417l implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C43405c f109801a;

        C43417l(C43405c cVar) {
            this.f109801a = cVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f109801a.mo24445C()) {
                return false;
            }
            View f = C43405c.m95177f(this.f109801a);
            if (f != null) {
                f.performClick();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$m */
    static final class C43418m extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C43418m f109802a = new C43418m();

        C43418m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$n */
    static final class C43419n implements View.OnClickListener {

        /* renamed from: a */
        public static final C43419n f109803a = new C43419n();

        C43419n() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$o */
    static final class C43420o implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C43405c f109804a;

        C43420o(C43405c cVar) {
            this.f109804a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f109804a.mo88355d().setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$p */
    public static final class C43421p implements C43428d {

        /* renamed from: a */
        final /* synthetic */ C43405c f109805a;

        C43421p(C43405c cVar) {
            this.f109805a = cVar;
        }

        /* renamed from: a */
        public final void mo88366a(float f, boolean z) {
            int i;
            long j;
            long j2 = (long) (((float) this.f109805a.f109776m) * f);
            C20347c cVar = this.f109805a.f109775l;
            if (cVar != null) {
                i = cVar.mo42966A();
            } else {
                i = 0;
            }
            int i2 = (int) (((float) i) * f);
            C20347c cVar2 = this.f109805a.f109775l;
            if (cVar2 != null) {
                j = (long) cVar2.mo43088s(i2);
            } else {
                j = 0;
            }
            this.f109805a.f109777n = f;
            if (z) {
                this.f109805a.f109782s = null;
                C43405c.m95178g(this.f109805a).setValue(C53030y.m112775b(j));
                C43405c.m95179h(this.f109805a).setVisibility(0);
            } else {
                C43405c.m95178g(this.f109805a).setValue(C53030y.m112773a(j));
                C43405c.m95179h(this.f109805a).setVisibility(4);
            }
            this.f109805a.mo88353c().setValue(Long.valueOf(j2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$q */
    static final class C43422q extends C52712l implements C52670a<C0198r<Long>> {

        /* renamed from: a */
        public static final C43422q f109806a = new C43422q();

        C43422q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$r */
    public static final class C43423r<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Runnable f109807a;

        public C43423r(Runnable runnable) {
            this.f109807a = runnable;
        }

        public final /* synthetic */ Object call() {
            this.f109807a.run();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$s */
    public static final class C43424s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43405c f109808a;

        public C43424s(C43405c cVar) {
            this.f109808a = cVar;
        }

        public final void run() {
            this.f109808a.f109748K.sendEmptyMessage(this.f109808a.f109749L);
            new File(C43308eb.f109501n).mkdirs();
            StringBuilder sb = new StringBuilder();
            sb.append(C43308eb.f109501n);
            sb.append(System.currentTimeMillis());
            sb.append(".wav");
            String sb2 = sb.toString();
            String str = C43308eb.f109501n;
            C52711k.m112236a((Object) str, "ShortVideoConfig2.sAudioRecordWorkSpace");
            C43405c.m95172a(str, this.f109808a.f109746I.getAudioUrl());
            if (this.f109808a.f109746I.hasRecord()) {
                C48016e.m103948c(this.f109808a.f109746I.getAudioUrl(), sb2);
                C43429e eVar = this.f109808a.f109745H;
                if (eVar != null) {
                    VEAudioEncodeSettings a = new C50523a().mo98461a();
                    C52711k.m112236a((Object) a, "VEAudioEncodeSettings.Builder().Build()");
                    C52711k.m112240b(sb2, "url");
                    C52711k.m112240b(a, "settings");
                    eVar.f109813a.mo98466a(sb2, a);
                }
                AudioRecorderParam audioRecorderParam = this.f109808a.f109746I;
                C43429e eVar2 = this.f109808a.f109745H;
                if (eVar2 == null) {
                    C52711k.m112234a();
                }
                audioRecorderParam.setAudioUrl(eVar2.mo88372b());
            } else {
                C20347c cVar = this.f109808a.f109775l;
                if (cVar != null) {
                    new File(C43308eb.f109501n).mkdirs();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C43308eb.f109501n);
                    sb3.append(System.currentTimeMillis());
                    sb3.append(".wav");
                    String sb4 = sb3.toString();
                    C43429e eVar3 = this.f109808a.f109745H;
                    if (eVar3 != null) {
                        int k = cVar.mo43071k();
                        VEAudioEncodeSettings a2 = new C50523a().mo98461a();
                        C52711k.m112236a((Object) a2, "VEAudioEncodeSettings.Builder().Build()");
                        C52711k.m112240b(sb4, "wavPath");
                        C52711k.m112240b(a2, "settings");
                        eVar3.f109813a.mo98467a(sb4, a2, k);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f109808a.f109746I;
                    C43429e eVar4 = this.f109808a.f109745H;
                    if (eVar4 == null) {
                        C52711k.m112234a();
                    }
                    audioRecorderParam2.setAudioUrl(eVar4.mo88372b());
                }
            }
            this.f109808a.f109748K.sendEmptyMessage(this.f109808a.f109750M);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$t */
    static final class C43425t implements OnClickListener {

        /* renamed from: a */
        public static final C43425t f109809a = new C43425t();

        C43425t() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$u */
    static final class C43426u implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43405c f109810a;

        C43426u(C43405c cVar) {
            this.f109810a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C43405c cVar = this.f109810a;
            VideoPublishEditModel videoPublishEditModel = cVar.f109783t;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("mVideoPublishEditModel");
            }
            AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
            if (cVar.f109746I.getAudioRecordIndex() >= 0 && cVar.f109746I.hasRecord()) {
                cVar.f109746I.setNeedDel(true);
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = cVar.f109784u;
                if (vEVideoPublishEditViewModel == null) {
                    C52711k.m112237a("mVEVideoPublishEditViewModel");
                }
                C0198r b = vEVideoPublishEditViewModel.mo110457b();
                C52711k.m112236a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                b.setValue(cVar.f109746I);
            }
            if (audioRecorderParam != null) {
                if (audioRecorderParam.getAudioRecordIndex() < 0 && cVar.f109746I.hasRecord()) {
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = cVar.f109784u;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    C0198r b2 = vEVideoPublishEditViewModel2.mo110457b();
                    C52711k.m112236a((Object) b2, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                    b2.setValue(audioRecorderParam);
                }
                if (audioRecorderParam.getNeedOriginalSound()) {
                    VideoPublishEditModel videoPublishEditModel2 = cVar.f109783t;
                    if (videoPublishEditModel2 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    videoPublishEditModel2.voiceVolume = audioRecorderParam.getVoiceVolume();
                } else {
                    VideoPublishEditModel videoPublishEditModel3 = cVar.f109783t;
                    if (videoPublishEditModel3 == null) {
                        C52711k.m112237a("mVideoPublishEditModel");
                    }
                    videoPublishEditModel3.voiceVolume = 0.0f;
                }
            } else {
                VideoPublishEditModel videoPublishEditModel4 = cVar.f109783t;
                if (videoPublishEditModel4 == null) {
                    C52711k.m112237a("mVideoPublishEditModel");
                }
                videoPublishEditModel4.voiceVolume = cVar.f109746I.getVoiceVolume();
            }
            VideoPublishEditModel videoPublishEditModel5 = cVar.f109783t;
            if (videoPublishEditModel5 == null) {
                C52711k.m112237a("mVideoPublishEditModel");
            }
            float f = videoPublishEditModel5.musicVolume;
            VideoPublishEditModel videoPublishEditModel6 = cVar.f109783t;
            if (videoPublishEditModel6 == null) {
                C52711k.m112237a("mVideoPublishEditModel");
            }
            cVar.mo88348a(f, videoPublishEditModel6.voiceVolume);
            cVar.mo88349a(cVar.f109746I.getAudioUrl());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$v */
    public static final class C43427v<T> implements C0781c<Void> {

        /* renamed from: a */
        final /* synthetic */ C43405c f109811a;

        /* renamed from: b */
        final /* synthetic */ boolean f109812b;

        public C43427v(C43405c cVar, boolean z) {
            this.f109811a = cVar;
            this.f109812b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Void voidR = (Void) obj;
            if (this.f109812b) {
                View view = this.f109811a.f109786w;
                if (view == null) {
                    C52711k.m112237a("mSaveView");
                }
                view.setVisibility(0);
                C43405c.m95177f(this.f109811a).setVisibility(0);
            }
        }
    }

    /* renamed from: c */
    public final C0198r<Long> mo88353c() {
        return (C0198r) this.f109755S.getValue();
    }

    /* renamed from: d */
    public final C0198r<Boolean> mo88355d() {
        return (C0198r) this.f109756T.getValue();
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        if (this.f109780q) {
            m95171a(this, false, 0, 3, null);
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        this.f109779p.cancel();
        this.f109748K.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo88356f() {
        AudioRecorderParam audioRecorderParam = this.f109746I;
        C43402b bVar = this.f109789z;
        if (bVar == null) {
            C52711k.m112237a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        if (mo88355d().getValue() != null) {
            AudioRecorderParam audioRecorderParam2 = this.f109746I;
            Object value = mo88355d().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            audioRecorderParam2.setNeedOriginalSound(((Boolean) value).booleanValue());
        }
    }

    /* renamed from: h */
    public final int mo88357h() {
        return ((C43303dy.m94974e(this.f33840g_) - ((int) C9432q.m18687b((Context) this.f33840g_, this.f109773j + this.f109774k))) - C43303dy.m94972c(this.f33840g_)) - C43303dy.m94973d(this.f33840g_);
    }

    public C43405c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
        C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(1, 10)");
        this.f109779p = ofInt;
        this.f109746I = new AudioRecorderParam();
        this.f109747J = true;
        this.f109748K = new C9381g(this);
        this.f109749L = 1;
        this.f109750M = 2;
        this.f109751N = 4;
        this.f109752O = new C43421p(this);
        this.f109753P = new C43417l(this);
        this.f109772aj = new C43409d(this);
    }

    /* renamed from: i */
    public final C23089d mo88358i() {
        C23089d dVar = new C23089d();
        String str = "content_source";
        VideoPublishEditModel videoPublishEditModel = this.f109783t;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mVideoPublishEditModel");
        }
        C23089d a = dVar.mo47829a(str, C43434az.m95207b(videoPublishEditModel)).mo47829a("enter_from", "video_edit_page");
        String str2 = "shoot_way";
        VideoPublishEditModel videoPublishEditModel2 = this.f109783t;
        if (videoPublishEditModel2 == null) {
            C52711k.m112237a("mVideoPublishEditModel");
        }
        C23089d a2 = a.mo47829a(str2, videoPublishEditModel2.mShootWay);
        String str3 = "creation_id";
        VideoPublishEditModel videoPublishEditModel3 = this.f109783t;
        if (videoPublishEditModel3 == null) {
            C52711k.m112237a("mVideoPublishEditModel");
        }
        C23089d a3 = a2.mo47829a(str3, videoPublishEditModel3.creationId).mo47829a("content_type", "video");
        C52711k.m112236a((Object) a3, "EventMapBuilder()\n      …YPE, AVMob.Content.VIDEO)");
        return a3;
    }

    /* renamed from: a */
    public static final /* synthetic */ C43402b m95170a(C43405c cVar) {
        C43402b bVar = cVar.f109789z;
        if (bVar == null) {
            C52711k.m112237a("audioRecordSeekBar");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AudioRecordStartButton m95173b(C43405c cVar) {
        AudioRecordStartButton audioRecordStartButton = cVar.f109739B;
        if (audioRecordStartButton == null) {
            C52711k.m112237a("audioRecordStartButton");
        }
        return audioRecordStartButton;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m95174c(C43405c cVar) {
        AVDmtTextView aVDmtTextView = cVar.f109743F;
        if (aVDmtTextView == null) {
            C52711k.m112237a("tvMsg");
        }
        return aVDmtTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoPublishEditModel m95175d(C43405c cVar) {
        VideoPublishEditModel videoPublishEditModel = cVar.f109783t;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mVideoPublishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m95176e(C43405c cVar) {
        View view = cVar.f109742E;
        if (view == null) {
            C52711k.m112237a("backView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m95177f(C43405c cVar) {
        View view = cVar.f109787x;
        if (view == null) {
            C52711k.m112237a("mCancelView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ C0198r m95178g(C43405c cVar) {
        C0198r<C53030y> rVar = cVar.f109785v;
        if (rVar == null) {
            C52711k.m112237a("mPreviewControlOpLiveData");
        }
        return rVar;
    }

    /* renamed from: h */
    public static final /* synthetic */ View m95179h(C43405c cVar) {
        View view = cVar.f109788y;
        if (view == null) {
            C52711k.m112237a("mPlayView");
        }
        return view;
    }

    /* renamed from: b */
    public final void mo88352b(String str) {
        C26890h.m65011a("record_dub_start", mo88358i().mo47829a("enter_method", str).f61491a);
    }

    /* renamed from: c */
    public final void mo88354c(String str) {
        C26890h.m65011a("record_dub_end", mo88358i().mo47829a("enter_method", str).f61491a);
    }

    public final void handleMsg(Message message) {
        C52711k.m112240b(message, "msg");
        int i = message.what;
        if (i == this.f109749L) {
            this.f109747J = false;
            View view = this.f109762Z;
            if (view == null) {
                C52711k.m112237a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f109761Y;
            if (dmtStatusView == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView.setBuilder(C10719a.m21676a((Context) this.f33840g_).mo19233c(1));
            DmtStatusView dmtStatusView2 = this.f109761Y;
            if (dmtStatusView2 == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView2.mo19212f();
        } else if (i == this.f109750M) {
            this.f109747J = true;
            DmtStatusView dmtStatusView3 = this.f109761Y;
            if (dmtStatusView3 == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView3.mo19208c(true);
            View view2 = this.f109762Z;
            if (view2 == null) {
                C52711k.m112237a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else {
            if (i == this.f109751N) {
                this.f109747J = true;
                DmtStatusView dmtStatusView4 = this.f109761Y;
                if (dmtStatusView4 == null) {
                    C52711k.m112237a("mLoadingStatusView");
                }
                dmtStatusView4.mo19208c(true);
                View view3 = this.f109762Z;
                if (view3 == null) {
                    C52711k.m112237a("mLoadingStatusViewLayout");
                }
                view3.setVisibility(8);
                EditViewModel editViewModel = this.f109763aa;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                editViewModel.mo97044n().setValue(Boolean.valueOf(false));
                C0198r<C53030y> rVar = this.f109785v;
                if (rVar == null) {
                    C52711k.m112237a("mPreviewControlOpLiveData");
                }
                rVar.setValue(C53030y.m112772a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88349a(String str) {
        C43429e eVar = this.f109745H;
        if (eVar != null) {
            eVar.f109813a.destory();
        }
        C0013i.m18a((Callable<TResult>) new C43407b<TResult>(new C43408c(this, str)), (Executor) C24076h.m58902c());
    }

    /* renamed from: a */
    public final void mo88350a(boolean z) {
        float f;
        C20347c cVar = this.f109775l;
        if (cVar != null) {
            View view = this.f109788y;
            if (view == null) {
                C52711k.m112237a("mPlayView");
            }
            view.setVisibility(4);
            float f2 = 0.0f;
            if (z) {
                this.f109746I.setNeedDel(true);
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f109784u;
                if (vEVideoPublishEditViewModel == null) {
                    C52711k.m112237a("mVEVideoPublishEditViewModel");
                }
                C0198r b = vEVideoPublishEditViewModel.mo110457b();
                C52711k.m112236a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                b.setValue(this.f109746I);
                AVDmtTextView aVDmtTextView = this.f109743F;
                if (aVDmtTextView == null) {
                    C52711k.m112237a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.f109742E;
                if (view2 == null) {
                    C52711k.m112237a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.f109767ae;
                if (lottieAnimationView == null) {
                    C52711k.m112237a("lottieAnimationView");
                }
                lottieAnimationView.mo6654b();
                LottieAnimationView lottieAnimationView2 = this.f109767ae;
                if (lottieAnimationView2 == null) {
                    C52711k.m112237a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f = 0.0f;
            } else {
                this.f109781r = true;
                AudioRecorderParam audioRecorderParam = this.f109746I;
                C43402b bVar = this.f109789z;
                if (bVar == null) {
                    C52711k.m112237a("audioRecordSeekBar");
                }
                audioRecorderParam.setMStack(bVar.getStack());
                if ((!this.f109746I.getMStack().isEmpty()) && this.f109745H != null && this.f109746I.getAudioRecordIndex() < 0) {
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f109784u;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("mVEVideoPublishEditViewModel");
                    }
                    C0198r b2 = vEVideoPublishEditViewModel2.mo110457b();
                    C52711k.m112236a((Object) b2, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                    b2.setValue(this.f109746I);
                }
                VideoPublishEditModel videoPublishEditModel = this.f109783t;
                if (videoPublishEditModel == null) {
                    C52711k.m112237a("mVideoPublishEditModel");
                }
                f2 = videoPublishEditModel.voiceVolume;
                VideoPublishEditModel videoPublishEditModel2 = this.f109783t;
                if (videoPublishEditModel2 == null) {
                    C52711k.m112237a("mVideoPublishEditModel");
                }
                f = videoPublishEditModel2.musicVolume;
            }
            mo88348a(f, f2);
            if (z) {
                if (this.f109782s != null) {
                    C0198r<C53030y> rVar = this.f109785v;
                    if (rVar == null) {
                        C52711k.m112237a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f109782s;
                    if (point == null) {
                        C52711k.m112234a();
                    }
                    rVar.setValue(C53030y.m112775b((long) point.getY()));
                    C43402b bVar2 = this.f109789z;
                    if (bVar2 == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    Point point2 = this.f109782s;
                    if (point2 == null) {
                        C52711k.m112234a();
                    }
                    this.f109782s = bVar2.mo88342b(point2.getY());
                } else {
                    int l = cVar.mo43073l();
                    if (l < 50) {
                        l = 0;
                    }
                    C43402b bVar3 = this.f109789z;
                    if (bVar3 == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    this.f109782s = bVar3.mo88342b(l);
                }
                this.f109780q = true;
                C43429e eVar = this.f109745H;
                if (eVar != null) {
                    eVar.f109813a.mo98464a(1.0f, cVar.mo43073l() + 50, this.f109776m);
                }
            }
            C0198r<C53030y> rVar2 = this.f109785v;
            if (rVar2 == null) {
                C52711k.m112237a("mPreviewControlOpLiveData");
            }
            rVar2.setValue(C53030y.m112772a());
            this.f109779p.start();
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f109763aa = (EditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VEVideoPublishEditViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                this.f109784u = (VEVideoPublishEditViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditAudioRecordModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…oRecordModel::class.java)");
                    this.f109758V = (EditAudioRecordModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditPreviewViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…iewViewModel::class.java)");
                        this.f109759W = (EditPreviewViewModel) a4;
                        EditViewModel editViewModel = this.f109763aa;
                        if (editViewModel == null) {
                            C52711k.m112237a("editViewModel");
                        }
                        this.f109783t = editViewModel.mo97035e();
                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f109784u;
                        if (vEVideoPublishEditViewModel == null) {
                            C52711k.m112237a("mVEVideoPublishEditViewModel");
                        }
                        C0198r<C53030y> k = vEVideoPublishEditViewModel.mo110466k();
                        C52711k.m112236a((Object) k, "mVEVideoPublishEditViewM…el.previewControlLiveData");
                        this.f109785v = k;
                        EditViewModel editViewModel2 = this.f109763aa;
                        if (editViewModel2 == null) {
                            C52711k.m112237a("editViewModel");
                        }
                        this.f109775l = (C20347c) editViewModel2.mo97038h().getValue();
                        if (this.f109775l != null) {
                            C20347c cVar = this.f109775l;
                            if (cVar == null) {
                                C52711k.m112234a();
                            }
                            this.f109776m = cVar.mo43071k();
                        }
                        View b = mo24464b((int) R.id.df8);
                        if (b == null) {
                            C52711k.m112234a();
                        }
                        this.f109786w = b;
                        View b2 = mo24464b((int) R.id.d7g);
                        if (b2 == null) {
                            C52711k.m112234a();
                        }
                        this.f109787x = b2;
                        View b3 = mo24464b((int) R.id.b37);
                        if (b3 == null) {
                            C52711k.m112234a();
                        }
                        this.f109788y = b3;
                        View b4 = mo24464b((int) R.id.cka);
                        if (b4 == null) {
                            C52711k.m112234a();
                        }
                        this.f109764ab = (FrameLayout) b4;
                        View b5 = mo24464b((int) R.id.dql);
                        if (b5 == null) {
                            C52711k.m112234a();
                        }
                        this.f109766ad = b5;
                        View b6 = mo24464b((int) R.id.zr);
                        if (b6 == null) {
                            C52711k.m112234a();
                        }
                        this.f109738A = (ViewGroup) b6;
                        View b7 = mo24464b((int) R.id.cs_);
                        if (b7 == null) {
                            C52711k.m112234a();
                        }
                        this.f109739B = (AudioRecordStartButton) b7;
                        View b8 = mo24464b((int) R.id.iy);
                        if (b8 == null) {
                            C52711k.m112234a();
                        }
                        this.f109742E = b8;
                        View b9 = mo24464b((int) R.id.dc5);
                        if (b9 == null) {
                            C52711k.m112234a();
                        }
                        this.f109743F = (AVDmtTextView) b9;
                        AVDmtTextView aVDmtTextView = this.f109743F;
                        if (aVDmtTextView == null) {
                            C52711k.m112237a("tvMsg");
                        }
                        aVDmtTextView.mo93998b();
                        View b10 = mo24464b((int) R.id.r5);
                        if (b10 == null) {
                            C52711k.m112234a();
                        }
                        this.f109744G = (CheckBox) b10;
                        CheckBox checkBox = this.f109744G;
                        if (checkBox == null) {
                            C52711k.m112237a("checkBox");
                        }
                        StringBuilder sb = new StringBuilder("  ");
                        sb.append(mo24461a((int) R.string.aku));
                        checkBox.setText(sb.toString());
                        View b11 = mo24464b((int) R.id.bhp);
                        if (b11 == null) {
                            C52711k.m112234a();
                        }
                        this.f109761Y = (DmtStatusView) b11;
                        View b12 = mo24464b((int) R.id.bhq);
                        if (b12 == null) {
                            C52711k.m112234a();
                        }
                        this.f109762Z = b12;
                        View view = this.f109762Z;
                        if (view == null) {
                            C52711k.m112237a("mLoadingStatusViewLayout");
                        }
                        view.setOnClickListener(C43419n.f109803a);
                        View b13 = mo24464b((int) R.id.bjo);
                        if (b13 == null) {
                            C52711k.m112234a();
                        }
                        this.f109767ae = (LottieAnimationView) b13;
                        LottieAnimationView lottieAnimationView = this.f109767ae;
                        if (lottieAnimationView == null) {
                            C52711k.m112237a("lottieAnimationView");
                        }
                        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
                        LottieAnimationView lottieAnimationView2 = this.f109767ae;
                        if (lottieAnimationView2 == null) {
                            C52711k.m112237a("lottieAnimationView");
                        }
                        lottieAnimationView2.setRepeatCount(-1);
                        C12924i iVar = this;
                        C52711k.m112240b(iVar, "scene");
                        View b14 = iVar.mo24464b((int) R.id.a92);
                        if (b14 == null) {
                            C52711k.m112234a();
                        }
                        b14.setVisibility(8);
                        View view2 = this.f109742E;
                        if (view2 == null) {
                            C52711k.m112237a("backView");
                        }
                        view2.setBackgroundResource(R.drawable.cw);
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            this.f109789z = new C43402b((FragmentActivity) activity5, this);
                            C43402b bVar = this.f109789z;
                            if (bVar == null) {
                                C52711k.m112237a("audioRecordSeekBar");
                            }
                            int b15 = (int) C9432q.m18687b((Context) this.f33840g_, this.f109754R);
                            int b16 = (int) C9432q.m18687b((Context) this.f33840g_, 6.0f);
                            int b17 = (int) C9432q.m18687b((Context) this.f33840g_, 4.0f);
                            int i = this.f109776m;
                            C43428d dVar = this.f109752O;
                            bVar.f109722c = b15;
                            bVar.f109723d = b16;
                            bVar.f109724e = b17 * 5;
                            bVar.f109727h = i;
                            bVar.f109728i = dVar;
                            LayoutParams layoutParams = new LayoutParams(-1, -1);
                            layoutParams.bottomMargin = b16;
                            layoutParams.topMargin = b16;
                            layoutParams.rightMargin = b15;
                            layoutParams.leftMargin = b15;
                            C43401a aVar = bVar.f109721b;
                            aVar.f109715b = Color.parseColor("#ccfe2c55");
                            aVar.f109716c.setColor(aVar.f109715b);
                            aVar.f109716c.setStyle(Style.FILL);
                            aVar.f109717d = i;
                            aVar.f109718e = C9432q.m18687b(aVar.getContext(), aVar.f109714a);
                            bVar.addView(bVar.f109721b, layoutParams);
                            LayoutParams layoutParams2 = new LayoutParams(bVar.f109724e, -1);
                            if (C47918gj.m103682a(bVar.getContext())) {
                                layoutParams2.addRule(21);
                                layoutParams2.setMarginEnd(b15 - (bVar.f109724e / 2));
                            } else {
                                layoutParams2.leftMargin = b15 - (bVar.f109724e / 2);
                            }
                            bVar.f109720a.setImageDrawable(C42430at.m93196a(0, -1, 1, (int) C9432q.m18687b(bVar.getContext(), 2.0f)));
                            bVar.f109720a.setPadding((int) (((float) bVar.f109724e) * 0.4f), 0, (int) (((float) bVar.f109724e) * 0.4f), 0);
                            bVar.addView(bVar.f109720a, layoutParams2);
                            bVar.f109720a.setOnTouchListener(new C43403a(bVar));
                            FrameLayout frameLayout = this.f109764ab;
                            if (frameLayout == null) {
                                C52711k.m112237a("seekLayout");
                            }
                            C43402b bVar2 = this.f109789z;
                            if (bVar2 == null) {
                                C52711k.m112237a("audioRecordSeekBar");
                            }
                            frameLayout.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
                            View b18 = mo24464b((int) R.id.tc);
                            if (b18 == null) {
                                C52711k.m112234a();
                            }
                            this.f109765ac = (ChooseVideoCoverView) b18;
                            if (this.f33840g_ instanceof C23441t) {
                                Activity activity6 = this.f33840g_;
                                if (activity6 != null) {
                                    this.f109778o = (C23441t) activity6;
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
                                }
                            }
                            EditPreviewViewModel editPreviewViewModel = this.f109759W;
                            if (editPreviewViewModel == null) {
                                C52711k.m112237a("mEditPreviewViewModel");
                            }
                            this.f109771ai = editPreviewViewModel.mo96925f();
                            EditPreviewViewModel editPreviewViewModel2 = this.f109759W;
                            if (editPreviewViewModel2 == null) {
                                C52711k.m112237a("mEditPreviewViewModel");
                            }
                            this.f109770ah = editPreviewViewModel2.mo96926g();
                            this.f109779p.setDuration(1000);
                            this.f109779p.setRepeatCount(-1);
                            this.f109779p.addUpdateListener(new C43416k(this));
                            View view3 = this.f109786w;
                            if (view3 == null) {
                                C52711k.m112237a("mSaveView");
                            }
                            view3.setOnClickListener(this.f109772aj);
                            View view4 = this.f109787x;
                            if (view4 == null) {
                                C52711k.m112237a("mCancelView");
                            }
                            view4.setOnClickListener(this.f109772aj);
                            View view5 = this.f109788y;
                            if (view5 == null) {
                                C52711k.m112237a("mPlayView");
                            }
                            view5.setOnClickListener(this.f109772aj);
                            View view6 = this.f109766ad;
                            if (view6 == null) {
                                C52711k.m112237a("videoLayout");
                            }
                            view6.setOnClickListener(this.f109772aj);
                            View view7 = this.f109742E;
                            if (view7 == null) {
                                C52711k.m112237a("backView");
                            }
                            view7.setOnClickListener(this.f109772aj);
                            AudioRecordStartButton audioRecordStartButton = this.f109739B;
                            if (audioRecordStartButton == null) {
                                C52711k.m112237a("audioRecordStartButton");
                            }
                            audioRecordStartButton.setOnClickListener(new C43410e(this));
                            AudioRecordStartButton audioRecordStartButton2 = this.f109739B;
                            if (audioRecordStartButton2 == null) {
                                C52711k.m112237a("audioRecordStartButton");
                            }
                            audioRecordStartButton2.setOnLongClickListener(new C43411f(this));
                            AudioRecordStartButton audioRecordStartButton3 = this.f109739B;
                            if (audioRecordStartButton3 == null) {
                                C52711k.m112237a("audioRecordStartButton");
                            }
                            audioRecordStartButton3.setOnTouchListener(new C43412g(this));
                            C0184k kVar = this;
                            mo88353c().observe(kVar, new C43414i(this));
                            mo88355d().observe(kVar, new C43415j(this));
                            CheckBox checkBox2 = this.f109744G;
                            if (checkBox2 == null) {
                                C52711k.m112237a("checkBox");
                            }
                            checkBox2.setOnCheckedChangeListener(new C43420o(this));
                            EditViewModel editViewModel3 = this.f109763aa;
                            if (editViewModel3 == null) {
                                C52711k.m112237a("editViewModel");
                            }
                            if (editViewModel3 != null && (editViewModel3.mo97049t() || editViewModel3.mo97053x() || editViewModel3.mo97050u() || editViewModel3.mo97054y() || editViewModel3.mo97055z() || editViewModel3.mo97052w())) {
                                CheckBox checkBox3 = this.f109744G;
                                if (checkBox3 == null) {
                                    C52711k.m112237a("checkBox");
                                }
                                checkBox3.setVisibility(8);
                            }
                            C20347c cVar2 = this.f109775l;
                            if (cVar2 != null) {
                                ChooseVideoCoverView chooseVideoCoverView = this.f109765ac;
                                if (chooseVideoCoverView == null) {
                                    C52711k.m112237a("mChooseVideoCoverView");
                                }
                                chooseVideoCoverView.mo91846a(false);
                                ChooseVideoCoverView chooseVideoCoverView2 = this.f109765ac;
                                if (chooseVideoCoverView2 == null) {
                                    C52711k.m112237a("mChooseVideoCoverView");
                                }
                                chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager(this.f33840g_, 0, false));
                                ChooseVideoCoverView chooseVideoCoverView3 = this.f109765ac;
                                if (chooseVideoCoverView3 == null) {
                                    C52711k.m112237a("mChooseVideoCoverView");
                                }
                                int frameHeight = chooseVideoCoverView3.getFrameHeight();
                                ChooseVideoCoverView chooseVideoCoverView4 = this.f109765ac;
                                if (chooseVideoCoverView4 == null) {
                                    C52711k.m112237a("mChooseVideoCoverView");
                                }
                                int frameWidth = chooseVideoCoverView4.getFrameWidth();
                                int ceil = (int) Math.ceil((double) (((float) (C9432q.m18670a((Context) this.f33840g_) - (Math.round(C9432q.m18687b((Context) this.f33840g_, this.f109754R)) * 2))) / (((float) frameWidth) * 1.0f)));
                                ChooseVideoCoverView chooseVideoCoverView5 = this.f109765ac;
                                if (chooseVideoCoverView5 == null) {
                                    C52711k.m112237a("mChooseVideoCoverView");
                                }
                                chooseVideoCoverView5.setCoverSize(ceil);
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    C0184k kVar2 = (FragmentActivity) activity7;
                                    ChooseVideoCoverView chooseVideoCoverView6 = this.f109765ac;
                                    if (chooseVideoCoverView6 == null) {
                                        C52711k.m112237a("mChooseVideoCoverView");
                                    }
                                    this.f109768af = new VEVideoCoverGeneratorImpl(cVar2, kVar2, chooseVideoCoverView6.getCoverSize(), "ai_music");
                                    VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f109768af;
                                    if (vEVideoCoverGeneratorImpl == null) {
                                        C52711k.m112237a("mEffectVideoCoverGenerator");
                                    }
                                    this.f109769ag = new C45617m(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                                    VideoPublishEditModel videoPublishEditModel = this.f109783t;
                                    if (videoPublishEditModel == null) {
                                        C52711k.m112237a("mVideoPublishEditModel");
                                    }
                                    if (videoPublishEditModel.isMvThemeVideoType()) {
                                        C44001a aVar2 = new C44001a(frameWidth, frameHeight);
                                        ChooseVideoCoverView chooseVideoCoverView7 = this.f109765ac;
                                        if (chooseVideoCoverView7 == null) {
                                            C52711k.m112237a("mChooseVideoCoverView");
                                        }
                                        C1322a aVar3 = aVar2;
                                        chooseVideoCoverView7.setAdapter(aVar3);
                                        C44002b bVar3 = new C44002b();
                                        C0198r<Boolean> rVar = this.f109771ai;
                                        if (rVar == null) {
                                            C52711k.m112237a("firstFrameVisible");
                                        }
                                        C44002b b19 = bVar3.mo89835b(rVar);
                                        C0198r<Bitmap> rVar2 = this.f109770ah;
                                        if (rVar2 == null) {
                                            C52711k.m112237a("firstFrameBitmap");
                                        }
                                        b19.mo89833a(rVar2).mo89832a(frameWidth, frameHeight).mo89834a(this.f33840g_, this.f109775l, ceil, new C43413h(aVar2));
                                        ChooseVideoCoverView chooseVideoCoverView8 = this.f109765ac;
                                        if (chooseVideoCoverView8 == null) {
                                            C52711k.m112237a("mChooseVideoCoverView");
                                        }
                                        chooseVideoCoverView8.setAdapter(aVar3);
                                        return;
                                    }
                                    C45617m mVar = this.f109769ag;
                                    if (mVar == null) {
                                        C52711k.m112237a("mSharedVideoCoverDataSource");
                                    }
                                    C45564a aVar4 = new C45564a(mVar, frameWidth, frameHeight);
                                    ChooseVideoCoverView chooseVideoCoverView9 = this.f109765ac;
                                    if (chooseVideoCoverView9 == null) {
                                        C52711k.m112237a("mChooseVideoCoverView");
                                    }
                                    chooseVideoCoverView9.setAdapter(aVar4);
                                    return;
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
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

    /* renamed from: a */
    public static void m95172a(String str, String str2) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    C52711k.m112236a((Object) file2, "child");
                    String path = file2.getPath();
                    C52711k.m112236a((Object) path, "s");
                    if (!C52830p.m112413c(path, "df", false, 2, null) && !path.equals(str2)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (r0.hasOriginalSound() != false) goto L_0x0067;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88348a(float r4, float r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            boolean r0 = r0.isStitchMode()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0018:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x0033
            r5 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0026:
            dmt.av.video.VEVideoPublishEditViewModel r1 = r3.f109784u
            if (r1 != 0) goto L_0x002f
            java.lang.String r2 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x002f:
            com.p683ss.android.ugc.gamora.editor.p2461c.C49339a.m106426a(r5, r4, r0, r1)
            return
        L_0x0033:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x003c:
            dmt.av.video.VEVideoPublishEditViewModel r1 = r3.f109784u
            if (r1 != 0) goto L_0x0045
            java.lang.String r2 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0045:
            com.p683ss.android.ugc.gamora.editor.p2461c.C49339a.m106426a(r5, r4, r0, r1)
            return
        L_0x0049:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0052
            java.lang.String r1 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0052:
            boolean r0 = r0.isFastImport
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x0067
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0061
            java.lang.String r2 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0061:
            boolean r0 = r0.hasOriginalSound()
            if (r0 == 0) goto L_0x0074
        L_0x0067:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f109783t
            if (r0 != 0) goto L_0x0070
            java.lang.String r2 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0070:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x008d
        L_0x0074:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x00d4
            dmt.av.video.VEVideoPublishEditViewModel r5 = r3.f109784u
            if (r5 != 0) goto L_0x0081
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0081:
            android.arch.lifecycle.r r5 = r5.mo110468m()
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r4 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r4)
            r5.setValue(r4)
            return
        L_0x008d:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            dmt.av.video.VEVideoPublishEditViewModel r0 = r3.f109784u
            if (r0 != 0) goto L_0x009a
            java.lang.String r2 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x009a:
            android.arch.lifecycle.r r0 = r0.mo110468m()
            java.lang.String r2 = "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r5 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofVoice(r5)
            r0.setValue(r5)
        L_0x00aa:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r3.f109783t
            if (r5 != 0) goto L_0x00b3
            java.lang.String r0 = "mVideoPublishEditModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00b3:
            java.lang.String r5 = r5.mMusicPath
            if (r5 == 0) goto L_0x00d4
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x00d4
            dmt.av.video.VEVideoPublishEditViewModel r5 = r3.f109784u
            if (r5 != 0) goto L_0x00c4
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c4:
            android.arch.lifecycle.r r5 = r5.mo110468m()
            java.lang.String r0 = "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r4 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r4)
            r5.setValue(r4)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord.C43405c.mo88348a(float, float):void");
    }

    /* renamed from: a */
    public final void mo88351a(boolean z, int i) {
        C0198r<C53030y> rVar = this.f109785v;
        if (rVar == null) {
            C52711k.m112237a("mPreviewControlOpLiveData");
        }
        rVar.setValue(C53030y.m112774b());
        C20347c cVar = this.f109775l;
        if (cVar != null) {
            cVar.mo43089t();
            mo88353c().setValue(Long.valueOf((long) cVar.mo43073l()));
        }
        this.f109779p.cancel();
        View view = this.f109788y;
        if (view == null) {
            C52711k.m112237a("mPlayView");
        }
        view.setVisibility(0);
        if (this.f109740C) {
            this.f109740C = false;
            AudioRecordStartButton audioRecordStartButton = this.f109739B;
            if (audioRecordStartButton == null) {
                C52711k.m112237a("audioRecordStartButton");
            }
            audioRecordStartButton.mo88318a();
        }
        if (this.f109741D) {
            this.f109741D = false;
            AudioRecordStartButton audioRecordStartButton2 = this.f109739B;
            if (audioRecordStartButton2 == null) {
                C52711k.m112237a("audioRecordStartButton");
            }
            audioRecordStartButton2.mo88319b();
        }
        if (this.f109780q) {
            C43429e eVar = this.f109745H;
            if (eVar != null) {
                if (z) {
                    Point point = this.f109782s;
                    if (point != null) {
                        point.setY(this.f109776m);
                    }
                    eVar.mo88371a();
                } else {
                    int a = (int) eVar.mo88371a();
                    if (i != -1) {
                        a = i;
                    }
                    Point point2 = this.f109782s;
                    if (point2 != null) {
                        point2.setY(a);
                    }
                    C0198r<C53030y> rVar2 = this.f109785v;
                    if (rVar2 == null) {
                        C52711k.m112237a("mPreviewControlOpLiveData");
                    }
                    rVar2.setValue(C53030y.m112775b((long) a));
                    C43402b bVar = this.f109789z;
                    if (bVar == null) {
                        C52711k.m112237a("audioRecordSeekBar");
                    }
                    bVar.mo88339a(((float) a) / ((float) this.f109776m));
                }
                C43402b bVar2 = this.f109789z;
                if (bVar2 == null) {
                    C52711k.m112237a("audioRecordSeekBar");
                }
                bVar2.mo88343b();
            }
            this.f109780q = false;
            Point point3 = this.f109782s;
            if (point3 != null) {
                mo88353c().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f109781r = false;
        AudioRecorderParam audioRecorderParam = this.f109746I;
        C43402b bVar3 = this.f109789z;
        if (bVar3 == null) {
            C52711k.m112237a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.f109746I.getMStack().isEmpty()) {
            View view2 = this.f109742E;
            if (view2 == null) {
                C52711k.m112237a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.f109742E;
            if (view3 == null) {
                C52711k.m112237a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.f109743F;
        if (aVDmtTextView == null) {
            C52711k.m112237a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.f109767ae;
        if (lottieAnimationView == null) {
            C52711k.m112237a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.f109767ae;
        if (lottieAnimationView2 == null) {
            C52711k.m112237a("lottieAnimationView");
        }
        lottieAnimationView2.mo6661f();
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.adx, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…record, container, false)");
        this.f109760X = inflate;
        View view = this.f109760X;
        if (view == null) {
            C52711k.m112237a("parentLayout");
        }
        return view;
    }

    /* renamed from: a */
    static /* synthetic */ void m95171a(C43405c cVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        cVar.mo88351a(z, i);
    }
}
