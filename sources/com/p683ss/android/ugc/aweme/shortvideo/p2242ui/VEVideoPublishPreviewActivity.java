package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0198r;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.view.C1056u;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.p1484bx.C24446a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52908ad;
import dmt.p2652av.video.C52967f;
import dmt.p2652av.video.C52970h;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C53027v;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity */
public class VEVideoPublishPreviewActivity extends AmeSSActivity {

    /* renamed from: a */
    ImageView f113695a;

    /* renamed from: b */
    VideoPublishEditModel f113696b;

    /* renamed from: c */
    C52908ad f113697c;

    /* renamed from: d */
    public SurfaceView f113698d;

    /* renamed from: e */
    C0185l f113699e = new C0185l(this);

    /* renamed from: f */
    HashMap<Integer, StickerItemModel> f113700f;

    /* renamed from: g */
    private int f113701g;

    /* renamed from: h */
    private int f113702h;

    public C0176h getLifecycle() {
        return this.f113699e;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        this.f113699e.mo333a(C0178b.DESTROYED);
        this.f113697c.mo110520a();
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
        VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.c4f);
        if (votingStickerView != null) {
            votingStickerView.setVisibility(8);
            if (this.f113698d != null) {
                this.f113698d.setVisibility(8);
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            findViewById(R.id.c4f).setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo91144a() {
        if (!(this.f113696b == null || this.f113696b.getMainBusinessContext() == null)) {
            List a = C43577d.m95726a(this.f113696b.getMainBusinessContext(), 1, C43596f.TRACK_PAGE_EDIT);
            if (!(a == null || a.isEmpty() || ((InteractStickerStruct) a.get(0)).getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.c4f);
                View findViewById = findViewById(R.id.dr8);
                if (votingStickerView != null) {
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    int height = ((LayoutParams) this.f113698d.getLayoutParams()).topMargin + ((this.f113698d.getHeight() - this.f113697c.f131275u.mo43037b().height) / 2);
                    if (height > 0) {
                        layoutParams.height = height;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                        findViewById.bringToFront();
                    }
                    votingStickerView.mo88954a(((InteractStickerStruct) a.get(0)).getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.mo88956b();
                    votingStickerView.setEditEnable(false);
                    votingStickerView.post(new C44998aw(this, a, votingStickerView, findViewById));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView((int) R.layout.ep);
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        this.f113695a = (ImageView) findViewById(R.id.dpy);
        if (VideoCoverBitmapHolder.f113618a != null) {
            this.f113695a.setImageBitmap(VideoCoverBitmapHolder.f113618a);
        }
        C1056u.m3036a((View) this.f113695a, "transition_view_v1");
        C1056u.m3036a(findViewById(R.id.ewe), "transition_view_v2");
        this.f113698d = (SurfaceView) findViewById(R.id.c4a);
        this.f113698d.setVisibility(4);
        this.f113698d.setOnClickListener(new C44997av(this));
        this.f113696b = (VideoPublishEditModel) getIntent().getSerializableExtra("args");
        this.f113697c = new C52908ad(this.f113696b.videoEditorType);
        if (this.f113696b.mVideoCanvasWidth <= 0 || this.f113696b.mVideoCanvasHeight <= 0) {
            this.f113701g = this.f113696b.videoWidth();
            this.f113702h = this.f113696b.videoHeight();
            if (this.f113702h == 0 || this.f113701g == 0) {
                if (this.f113696b.getOriginal() == 0) {
                    iVideoConfigService = C39618d.f101177r;
                } else {
                    iVideoConfigService = C39618d.f101176q;
                }
                this.f113701g = iVideoConfigService.getVideoWidth();
                if (this.f113696b.getOriginal() == 0) {
                    iVideoConfigService2 = C39618d.f101177r;
                } else {
                    iVideoConfigService2 = C39618d.f101176q;
                }
                this.f113702h = iVideoConfigService2.getVideoHeight();
            }
        } else {
            this.f113701g = this.f113696b.mVideoCanvasWidth;
            this.f113702h = this.f113696b.mVideoCanvasHeight;
        }
        VEPreviewParams a = C43668b.m95935a(this.f113696b, 2, 30);
        C0198r rVar = new C0198r();
        rVar.setValue(a);
        C0198r rVar2 = new C0198r();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f131142i = this.f113696b.isFastImport;
        vEPreviewMusicParams.f131141h = 2;
        vEPreviewMusicParams.f131134a = this.f113696b.mMusicPath;
        vEPreviewMusicParams.f131135b = this.f113696b.mMusicStart;
        vEPreviewMusicParams.f131136c = C47807de.m103443a(this.f113696b.mMusicPath, C47807de.m103445a(this.f113696b));
        if (C43214dh.m94817a().mo50201b() == null || Math.abs(vEPreviewMusicParams.f131136c - C43214dh.m94817a().mo50201b().getShootDuration()) < 1000) {
            vEPreviewMusicParams.f131137d = vEPreviewMusicParams.f131136c;
        } else {
            vEPreviewMusicParams.f131137d = C43214dh.m94817a().mo50201b().getShootDuration();
        }
        vEPreviewMusicParams.f131138e = this.f113696b.musicVolume;
        vEPreviewMusicParams.f131139f = this.f113696b.musicId;
        vEPreviewMusicParams.f131140g = this.f113696b.previewStartTime;
        if (this.f113696b.getStitchParams() != null) {
            long duration = this.f113696b.getStitchParams().getDuration();
            vEPreviewMusicParams.f131143j = 0;
            vEPreviewMusicParams.f131144k = (int) duration;
        }
        rVar2.setValue(vEPreviewMusicParams);
        C52967f fVar = new C52967f();
        if (this.f113696b.mEffectList != null) {
            C53027v.m112770a(this.f113696b.mEffectList, fVar);
        }
        C0198r<InfoStickerModel> rVar3 = new C0198r<>();
        rVar3.setValue(this.f113696b.infoStickerModel);
        C52970h<C52906ab> hVar = new C52970h<>();
        this.f113697c.f131252G.mo110481a();
        C52906ab a2 = C29164a.m68668a(0, this.f113696b);
        if (a2 != null) {
            hVar.setValue(a2);
        }
        this.f113697c.f131258d = rVar;
        this.f113697c.f131259e = rVar2;
        this.f113697c.f131262h = fVar;
        this.f113697c.f131260f = new C0198r();
        this.f113697c.f131261g = new C0198r();
        this.f113697c.mo110525a(new ArrayList<>());
        this.f113697c.f131263i = hVar;
        C52970h<C52977l> hVar2 = new C52970h<>();
        this.f113697c.f131264j = hVar2;
        this.f113697c.f131266l = new C0198r();
        this.f113697c.f131267m = new C0198r();
        this.f113697c.mo110522a(new C0198r<>());
        this.f113697c.f131268n = rVar3;
        C0198r<AudioRecorderParam> rVar4 = new C0198r<>();
        this.f113697c.f131265k = rVar4;
        C0198r rVar5 = new C0198r();
        rVar5.setValue(new C43442b(this.f113696b.autoEnhanceOn, this.f113696b.autoEnhanceType, true));
        this.f113697c.f131271q = rVar5;
        this.f113697c.f131279y.observe(this, new C44996au(this));
        this.f113699e.mo333a(C0178b.STARTED);
        this.f113697c.mo110523a(this, this, this.f113698d);
        if (this.f113696b.mTimeEffect == null || !this.f113696b.mTimeEffect.getKey().equals("1")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f113696b.isFastImport) {
                this.f113697c.f131275u.mo43010a(this.f113696b.getPreviewInfo().getReverseVideoArray(), this.f113696b.getPreviewInfo().getReverseAudioArray());
                this.f113697c.f131275u.mo43020a(this.f113696b.getPreviewInfo().getTempVideoArray());
            } else {
                this.f113697c.f131275u.mo43036b(this.f113696b.getPreviewInfo().getReverseVideoArray());
            }
            this.f113697c.f131275u.mo43043c(true);
            if (this.f113696b.isFastImport) {
                this.f113697c.f131275u.mo43021a(this.f113697c.f131275u.mo43013a().f127518i, this.f113697c.f131275u.mo43013a().f127519j, a.mVolume);
            }
        }
        if (this.f113696b.veAudioRecorderParam != null) {
            rVar4.setValue(this.f113696b.veAudioRecorderParam);
        }
        if (this.f113696b.veAudioEffectParam != null) {
            this.f113696b.veAudioEffectParam.setShowErrorToast(false);
            this.f113696b.veAudioEffectParam.setPreprocessResult(null);
            hVar2.setValue(C52977l.m112704a(true, this.f113696b.isReviewVideo(), this.f113696b.veAudioEffectParam));
        }
        if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
            C31459g b = C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f113696b.mSelectedId);
            float f = this.f113696b.mSelectedFilterIntensity;
            if (f == -1.0f) {
                f = 0.8f;
            }
            this.f113697c.f131275u.mo43033b(C31460h.m73281a(b), f);
        } else {
            this.f113697c.f131275u.mo42997a(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f113696b.mSelectedId)), 1.0f);
        }
        C43302dx.m94965a(this.f113698d, this.f113701g, this.f113702h);
        C43302dx.m94965a(this.f113695a, this.f113701g, this.f113702h);
        if (VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            autoTransition.addListener(new C24446a() {
                public final void onTransitionStart(Transition transition) {
                }

                public final void onTransitionEnd(Transition transition) {
                    VEVideoPublishPreviewActivity.this.f113698d.setVisibility(0);
                    VEVideoPublishPreviewActivity.this.f113698d.bringToFront();
                    VEVideoPublishPreviewActivity.this.mo91144a();
                }
            });
            getWindow().setReturnTransition(new AutoTransition());
        } else {
            this.f113698d.setVisibility(0);
            this.f113698d.bringToFront();
            mo91144a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", false);
    }
}
