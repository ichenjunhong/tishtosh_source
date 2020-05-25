package com.p683ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42545e;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42545e.C42549a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52908ad;
import dmt.p2652av.video.C52967f;
import dmt.p2652av.video.C52970h;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C53027v;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEEditorAutoStartStopArbiter.C52881a;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import dmt.p2652av.video.p2653a.C52885a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity */
public class ChooseCoverActivity extends AmeSSActivity implements C42549a, C52881a {

    /* renamed from: a */
    public VideoPublishEditModel f114908a;

    /* renamed from: b */
    public C52908ad f114909b;

    /* renamed from: c */
    public C42545e f114910c;

    /* renamed from: d */
    public SurfaceView f114911d;

    /* renamed from: e */
    public ImageView f114912e;

    /* renamed from: f */
    HashMap<Integer, StickerItemModel> f114913f;

    /* renamed from: g */
    private C0185l f114914g = new C0185l(this);

    /* renamed from: h */
    private C0198r<Bitmap> f114915h = new C0198r<>();

    /* renamed from: i */
    private C0198r<Boolean> f114916i = new C0198r<>();

    /* renamed from: j */
    private C0198r<C53030y> f114917j = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$a */
    class C45480a extends C0655a {
        C45480a() {
        }

        public final void onFragmentDetached(C0654k kVar, Fragment fragment) {
            super.onFragmentDetached(kVar, fragment);
            if (fragment instanceof C42545e) {
                Intent intent = new Intent();
                intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", ChooseCoverActivity.this.f114908a);
                ChooseCoverActivity.this.setResult(-1, intent);
                ChooseCoverActivity.this.finish();
            }
        }

        public final void onFragmentActivityCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
            super.onFragmentActivityCreated(kVar, fragment, bundle);
            if (fragment instanceof C42545e) {
                C42545e eVar = (C42545e) fragment;
                if (ChooseCoverActivity.this.f114909b.f131274t != null) {
                    ChooseCoverActivity.this.f114909b.f131274t.mo110432a(true);
                }
                eVar.getView().postDelayed(new C45486e(this, eVar), 300);
            }
        }

        /* renamed from: a */
        public final void mo91760a(int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) ChooseCoverActivity.this.f114912e.getLayoutParams();
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            ChooseCoverActivity.this.f114912e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final C0198r<C53030y> mo86773b() {
        return this.f114917j;
    }

    /* renamed from: c */
    public final VideoPublishEditModel mo86774c() {
        return this.f114908a;
    }

    public C0176h getLifecycle() {
        return this.f114914g;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final C20347c mo86772a() {
        return this.f114909b.f131275u;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.q, R.anim.r);
    }

    public void onBackPressed() {
        if (this.f114910c != null && !this.f114910c.mo86767a()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        this.f114914g.mo333a(C0178b.DESTROYED);
        mo86772a().mo43092v();
        this.f114909b.mo110520a();
        super.onDestroy();
    }

    /* renamed from: d */
    public final void mo91758d() {
        if (this.f114910c != null) {
            C42545e eVar = this.f114910c;
            if (eVar.f107605k) {
                Bitmap c = eVar.f107603i.mo86772a().mo43045c();
                if (c != null) {
                    eVar.f107604j = (float) eVar.f107603i.mo86772a().mo43073l();
                    eVar.f107595a.setVideoCoverFrameView(c);
                    c.recycle();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        boolean z;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        boolean z2 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView((int) R.layout.eo);
        if (!C23059a.m56592a(this)) {
            C23729p.m58254a((Activity) this);
        }
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        this.f114912e = (ImageView) findViewById(R.id.dpy);
        this.f114911d = (SurfaceView) findViewById(R.id.c4a);
        this.f114908a = (VideoPublishEditModel) getIntent().getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        this.f114909b = new C52908ad(this.f114908a.videoEditorType);
        this.f114909b.mo110521a(C52885a.f131170r);
        if (this.f114908a.mVideoCanvasWidth <= 0 || this.f114908a.mVideoCanvasHeight <= 0) {
            i2 = this.f114908a.videoWidth();
            i = this.f114908a.videoHeight();
            if (i == 0 || i2 == 0) {
                if (this.f114908a.getOriginal() == 0) {
                    iVideoConfigService = C39618d.f101177r;
                } else {
                    iVideoConfigService = C39618d.f101176q;
                }
                i2 = iVideoConfigService.getVideoWidth();
                if (this.f114908a.getOriginal() == 0) {
                    iVideoConfigService2 = C39618d.f101177r;
                } else {
                    iVideoConfigService2 = C39618d.f101176q;
                }
                i = iVideoConfigService2.getVideoHeight();
            }
        } else {
            i2 = this.f114908a.mVideoCanvasWidth;
            i = this.f114908a.mVideoCanvasHeight;
        }
        VEPreviewParams a = C43668b.m95935a(this.f114908a, 2, 30);
        C0198r rVar = new C0198r();
        rVar.setValue(a);
        C0198r rVar2 = new C0198r();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f131142i = this.f114908a.isFastImport;
        vEPreviewMusicParams.f131134a = this.f114908a.mMusicPath;
        vEPreviewMusicParams.f131135b = this.f114908a.mMusicStart;
        vEPreviewMusicParams.f131136c = C47807de.m103443a(this.f114908a.mMusicPath, C47807de.m103445a(this.f114908a));
        if (C43214dh.m94817a().mo50201b() == null || C43214dh.m94817a().mo50201b().getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f131136c - C43214dh.m94817a().mo50201b().getShootDuration()) < 1000) {
            vEPreviewMusicParams.f131137d = vEPreviewMusicParams.f131136c;
        } else {
            vEPreviewMusicParams.f131137d = C43214dh.m94817a().mo50201b().getShootDuration();
        }
        vEPreviewMusicParams.f131138e = this.f114908a.musicVolume;
        vEPreviewMusicParams.f131139f = this.f114908a.musicId;
        vEPreviewMusicParams.f131140g = this.f114908a.previewStartTime;
        if (this.f114908a.getStitchParams() != null) {
            long duration = this.f114908a.getStitchParams().getDuration();
            vEPreviewMusicParams.f131143j = 0;
            vEPreviewMusicParams.f131144k = (int) duration;
        }
        rVar2.setValue(vEPreviewMusicParams);
        C52967f fVar = new C52967f();
        if (this.f114908a.mEffectList != null) {
            C53027v.m112770a(this.f114908a.mEffectList, fVar);
        }
        C0198r<InfoStickerModel> rVar3 = new C0198r<>();
        rVar3.setValue(this.f114908a.infoStickerModel);
        C52970h<C52906ab> hVar = new C52970h<>();
        this.f114909b.f131252G.mo110481a();
        C52906ab a2 = C29164a.m68668a(0, this.f114908a);
        if (a2 != null) {
            hVar.setValue(a2);
        }
        this.f114909b.f131258d = rVar;
        this.f114909b.f131259e = rVar2;
        this.f114909b.f131262h = fVar;
        this.f114909b.f131260f = new C0198r();
        this.f114909b.f131261g = this.f114917j;
        this.f114909b.mo110525a(new ArrayList<>());
        this.f114909b.f131263i = hVar;
        C52970h<C52977l> hVar2 = new C52970h<>();
        C0198r<AudioRecorderParam> rVar4 = new C0198r<>();
        this.f114909b.f131265k = rVar4;
        this.f114909b.f131264j = hVar2;
        this.f114909b.f131266l = new C0198r();
        this.f114909b.f131267m = new C0198r();
        this.f114909b.mo110522a(new C0198r<>());
        this.f114909b.f131268n = rVar3;
        C0198r rVar5 = new C0198r();
        rVar5.setValue(new C43442b(this.f114908a.autoEnhanceOn, this.f114908a.autoEnhanceType, true));
        this.f114909b.f131271q = rVar5;
        this.f114909b.f131279y.observe(this, new C45482a(this));
        this.f114914g.mo333a(C0178b.STARTED);
        this.f114909b.mo110523a(this, this, this.f114911d);
        if (this.f114908a.mTimeEffect == null || !this.f114908a.mTimeEffect.getKey().equals("1")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f114908a.isFastImport) {
                this.f114909b.f131275u.mo43010a(this.f114908a.getPreviewInfo().getReverseVideoArray(), this.f114908a.getPreviewInfo().getReverseAudioArray());
                this.f114909b.f131275u.mo43020a(this.f114908a.getPreviewInfo().getTempVideoArray());
            } else {
                this.f114909b.f131275u.mo43036b(this.f114908a.getPreviewInfo().getReverseVideoArray());
            }
            this.f114909b.f131275u.mo43043c(true);
            if (this.f114908a.isFastImport) {
                this.f114909b.f131275u.mo43021a(this.f114909b.f131275u.mo43013a().f127518i, this.f114909b.f131275u.mo43013a().f127519j, a.mVolume);
            }
        }
        if (this.f114908a.veAudioRecorderParam != null) {
            rVar4.setValue(this.f114908a.veAudioRecorderParam);
        }
        if (this.f114908a.veAudioEffectParam != null) {
            this.f114908a.veAudioEffectParam.setShowErrorToast(false);
            this.f114908a.veAudioEffectParam.setPreprocessResult(null);
            hVar2.setValue(C52977l.m112704a(true, this.f114908a.isReviewVideo(), this.f114908a.veAudioEffectParam));
        }
        if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
            C31459g b = C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f114908a.mSelectedId);
            float f = this.f114908a.mSelectedFilterIntensity;
            if (f == -1.0f) {
                f = 0.8f;
            }
            this.f114909b.f131275u.mo43033b(C31460h.m73281a(b), f);
        } else {
            this.f114909b.f131275u.mo42997a(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f114908a.mSelectedId)), 1.0f);
        }
        SurfaceView surfaceView = this.f114911d;
        Context context = surfaceView.getContext();
        int e = C43303dy.m94974e(context);
        int b2 = C43303dy.m94971b(context);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (e * 9 < b2 * 16 || i2 >= i) {
            layoutParams.width = b2;
            layoutParams.height = e;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i2 * e) / i;
            layoutParams.height = e;
            layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        surfaceView.setLayoutParams(layoutParams);
        if (bundle != null && (getSupportFragmentManager().mo2224a("cover") instanceof C42545e)) {
            z2 = false;
        }
        if (z2) {
            this.f114910c = new C42545e();
            getSupportFragmentManager().mo2225a().mo2176a(R.id.b_7, this.f114910c, "cover").mo2195c();
        } else {
            this.f114910c = (C42545e) getSupportFragmentManager().mo2224a("cover");
        }
        this.f114916i.observe(this, new C45483b(this));
        this.f114915h.observe(this, new C45484c(this));
        this.f114910c.f107608n = this.f114916i;
        this.f114910c.f107607m = this.f114915h;
        getSupportFragmentManager().mo2229a((C0655a) new C45480a(), false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo91757a(int i, int i2, int i3, int i4) {
        if (!(this.f114908a == null || this.f114908a.getMainBusinessContext() == null)) {
            List a = C43577d.m95726a(this.f114908a.getMainBusinessContext(), 1, C43596f.TRACK_PAGE_EDIT);
            if (!(a == null || a.isEmpty() || ((InteractStickerStruct) a.get(0)).getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.c4f);
                View findViewById = findViewById(R.id.dr8);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(-1);
                }
                if (votingStickerView != null) {
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    int top = this.f114911d.getTop() + i2;
                    if (top > 0) {
                        layoutParams.height = top;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                    }
                    int i5 = this.f114909b.f131275u.mo43037b().width;
                    int i6 = this.f114909b.f131275u.mo43037b().height;
                    float min = Math.min(((float) i3) / ((float) i5), ((float) i4) / ((float) i6));
                    votingStickerView.mo88954a(((InteractStickerStruct) a.get(0)).getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.mo88956b();
                    votingStickerView.setEditEnable(false);
                    C45485d dVar = new C45485d(this, a, i5, min, i6, votingStickerView, i, i2);
                    votingStickerView.post(dVar);
                }
            }
        }
    }
}
