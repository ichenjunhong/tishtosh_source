package com.p683ss.android.ugc.gamora.editor.p2460b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9432q;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45376ac;
import com.p683ss.android.ugc.gamora.editor.C49413cy;
import com.p683ss.android.ugc.gamora.editor.EditGestureViewModel;
import com.p683ss.android.ugc.gamora.editor.EditGestureViewModel.C48946a;
import com.p683ss.android.ugc.gamora.editor.EditGestureViewModel.C48949d;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel.C48950a;
import com.p683ss.android.ugc.gamora.editor.EditInfoStickerViewModel.C48954e;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel.C48983a;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel.C48988f;
import com.p683ss.android.ugc.gamora.editor.EditStickerViewModel.C48989g;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEListener.C50552p;
import com.p683ss.android.vesdk.VESize;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52908ad;
import dmt.p2652av.video.C52953d;
import dmt.p2652av.video.C52970h;
import dmt.p2652av.video.C52977l;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.C53029x;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.C53031z;
import dmt.p2652av.video.VEEditorAutoStartStopArbiter;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEPreviewParams;
import dmt.p2652av.video.p2653a.C52885a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.gamora.editor.b.a */
public final class C49231a extends C12924i {

    /* renamed from: i */
    public LiveData<C53031z> f123643i;

    /* renamed from: j */
    public LiveData<C52904aa> f123644j;

    /* renamed from: k */
    C52908ad f123645k = new C52908ad(0);

    /* renamed from: l */
    public C49242b f123646l;

    /* renamed from: m */
    public SurfaceView f123647m;

    /* renamed from: n */
    public ImageView f123648n;

    /* renamed from: o */
    public C49413cy f123649o;

    /* renamed from: p */
    float f123650p;

    /* renamed from: q */
    private int f123651q;

    /* renamed from: r */
    private boolean f123652r;

    /* renamed from: s */
    private C49241a f123653s;

    /* renamed from: t */
    private EditStickerViewModel f123654t;

    /* renamed from: u */
    private EditInfoStickerViewModel f123655u;

    /* renamed from: v */
    private EditGestureViewModel f123656v;

    /* renamed from: w */
    private int f123657w = Integer.MAX_VALUE;

    /* renamed from: com.ss.android.ugc.gamora.editor.b.a$a */
    public interface C49241a {
        /* renamed from: e */
        boolean mo88092e();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.b.a$b */
    public interface C49242b {
        /* renamed from: a */
        void mo97160a(C52904aa aaVar);

        /* renamed from: a */
        void mo97161a(C53031z zVar);
    }

    /* renamed from: a */
    public final void mo97209a(C52970h<C52977l> hVar) {
        this.f123645k.f131264j = hVar;
    }

    /* renamed from: a */
    public final void mo97210a(ArrayList<EffectPointModel> arrayList) {
        this.f123645k.mo110525a(arrayList);
    }

    /* renamed from: a */
    public final void mo97211a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        int i7;
        int i8;
        int i9;
        boolean z3 = z;
        final int i10 = i;
        int i11 = i4;
        if (!z3) {
            this.f123645k.f131274t.mo110432a(true);
            this.f123645k.f131275u.mo43038b(i10);
            if (this.f33840g_ instanceof VEVideoPublishEditActivity) {
                ((VEVideoPublishEditActivity) this.f33840g_).mo88076a(i10);
            }
        } else if (this.f33840g_ instanceof VEVideoPublishEditActivity) {
            ((VEVideoPublishEditActivity) this.f33840g_).mo88076a(mo24478w().getColor(R.color.dj));
        }
        C43303dy.m94974e(this.f33840g_);
        int width = this.f33834b.getWidth();
        C43303dy.m94972c(this.f33840g_);
        VESize b = this.f123645k.f131275u.mo43037b();
        int i12 = b.height;
        int i13 = b.width;
        float f = (float) i12;
        float f2 = ((float) i13) / f;
        int i14 = 0;
        if (i11 > i12) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f33834b.getLayoutParams();
            if (z3) {
                i14 = (((((C43303dy.m94974e(mo24477v()) - i2) - i3) - i12) / 2) + i2) - marginLayoutParams.topMargin;
                i9 = 0;
            } else {
                i9 = (((((C43303dy.m94974e(mo24477v()) - i2) - i3) - i12) / 2) + i2) - marginLayoutParams.topMargin;
            }
            m106232a(z3, i10, i14, i9);
            m106231a((float) i9);
        } else {
            float f3 = z3 ? (float) i11 : f;
            if (!z3) {
                f = (float) i11;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            C49244c cVar = r0;
            C49244c cVar2 = new C49244c(this, z, i12, i13, f2, width, i2);
            ofFloat.addUpdateListener(cVar);
            if (z3) {
                final boolean z4 = z2;
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C49231a.this.f123645k.f131275u.mo43038b(i10);
                        C49231a.this.f123645k.f131274t.mo110433a(false, z4);
                    }
                });
            }
            ofFloat.start();
            if (!m106233a(i12, i13)) {
                if (!z3) {
                    this.f123651q = ((MarginLayoutParams) this.f33834b.getLayoutParams()).topMargin - i2;
                }
                if (z3) {
                    i7 = -this.f123651q;
                    i8 = 0;
                } else {
                    i8 = -this.f123651q;
                    i7 = 0;
                }
                m106232a(z3, i10, i7, i8);
            }
        }
        this.f123645k.f131275u.mo43019a(z3);
    }

    /* renamed from: c */
    public final C52885a mo97215c() {
        return this.f123645k.f131252G;
    }

    /* renamed from: d */
    public final VEEditorAutoStartStopArbiter mo97218d() {
        return this.f123645k.f131274t;
    }

    /* renamed from: f */
    public final C0198r<Void> mo97223f() {
        return this.f123645k.f131279y;
    }

    /* renamed from: h */
    public final C0198r<Void> mo97227h() {
        return this.f123645k.f131280z;
    }

    /* renamed from: i */
    public final C0198r<Boolean> mo97229i() {
        return this.f123645k.f131247B;
    }

    /* renamed from: F */
    private C20347c m106229F() {
        if (this.f123645k == null) {
            return null;
        }
        return this.f123645k.f131275u;
    }

    /* renamed from: o */
    public final void mo24468o() {
        super.mo24468o();
        if (this.f33840g_ instanceof C49241a) {
            this.f123653s = (C49241a) this.f33840g_;
        }
    }

    /* renamed from: q */
    public final void mo24470q() {
        this.f123645k.mo110520a();
        super.mo24470q();
    }

    /* renamed from: y */
    public final void mo24480y() {
        super.mo24480y();
        if (this.f123652r) {
            m106229F().mo43077n();
            this.f123652r = false;
            C50203g.m108363d("VEVideoPublishEditFragment prepare");
        }
    }

    /* renamed from: B */
    public final void mo24458B() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableEditPageMemoryOpt) && this.f123653s != null && this.f123653s.mo88092e() && m106229F() != null) {
            m106229F().mo43080o();
            this.f123652r = true;
            C50203g.m108363d("VEVideoPublishEditFragment releaseEngine");
        }
        super.mo24458B();
    }

    /* renamed from: b */
    public final void mo97212b(LiveData<VEPreviewMusicParams> liveData) {
        this.f123645k.f131259e = liveData;
    }

    /* renamed from: e */
    public final void mo97221e(LiveData<C53026u> liveData) {
        this.f123645k.f131262h = liveData;
    }

    /* renamed from: g */
    public final void mo97226g(C0198r<InfoStickerModel> rVar) {
        this.f123645k.f131268n = rVar;
    }

    /* renamed from: b */
    public final void mo97213b(C0198r<AudioEffectParam> rVar) {
        if (rVar != null) {
            this.f123645k.mo110531b(rVar);
        }
    }

    /* renamed from: c */
    public final void mo97216c(LiveData<C31427a> liveData) {
        this.f123645k.f131260f = liveData;
    }

    /* renamed from: d */
    public final void mo97219d(LiveData<C53030y> liveData) {
        this.f123645k.f131261g = liveData;
    }

    /* renamed from: e */
    public final void mo97222e(C0198r<VEVolumeChangeOp> rVar) {
        this.f123645k.f131266l = rVar;
    }

    /* renamed from: f */
    public final void mo97224f(LiveData<C53029x> liveData) {
        this.f123645k.f131267m = liveData;
    }

    /* renamed from: h */
    public final void mo97228h(C0198r<Boolean> rVar) {
        this.f123645k.f131270p = rVar;
    }

    /* renamed from: i */
    public final void mo97230i(C0198r<C43954a> rVar) {
        this.f123645k.f131272r = rVar;
    }

    /* renamed from: a */
    public static C49231a m106230a(VEPreviewParams vEPreviewParams) {
        C49231a aVar = new C49231a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", null);
        aVar.f33839g = bundle;
        return aVar;
    }

    /* renamed from: b */
    public final void mo97214b(C52970h<C52906ab> hVar) {
        this.f123645k.f131263i = hVar;
    }

    /* renamed from: c */
    public final void mo97217c(C0198r<C43442b> rVar) {
        if (rVar != null) {
            this.f123645k.f131271q = rVar;
        }
    }

    /* renamed from: d */
    public final void mo97220d(C0198r<AudioRecorderParam> rVar) {
        this.f123645k.f131265k = rVar;
    }

    /* renamed from: f */
    public final void mo97225f(C0198r<Boolean> rVar) {
        this.f123645k.mo110522a(rVar);
    }

    /* renamed from: a */
    private void m106231a(float f) {
        this.f123654t.mo22530c(new C48983a(f, 300));
        this.f123656v.mo22530c(new C48946a(f, 300));
        this.f123655u.mo22530c(new C48950a(f, 300));
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        this.f123645k.mo110524a(mo24477v(), this.f123649o, this.f123647m, C43441a.m95214a());
        this.f123654t = (EditStickerViewModel) C48927d.m105736a((FragmentActivity) mo24477v()).mo96760a(EditStickerViewModel.class);
        this.f123655u = (EditInfoStickerViewModel) C48927d.m105736a((FragmentActivity) mo24477v()).mo96760a(EditInfoStickerViewModel.class);
        this.f123656v = (EditGestureViewModel) C48927d.m105736a((FragmentActivity) mo24477v()).mo96760a(EditGestureViewModel.class);
        this.f123643i.observe(this, new C0199s<C53031z>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C53031z zVar = (C53031z) obj;
                if (zVar.f131509a == 1) {
                    C49231a aVar = C49231a.this;
                    int i = zVar.f131510b;
                    aVar.f123645k.f131274t.mo110432a(true);
                    aVar.f123645k.f131275u.mo43038b(i);
                    Context context = aVar.f33834b.getContext();
                    int height = aVar.f33834b.getHeight();
                    int width = aVar.f33834b.getWidth();
                    int e = (int) (((float) C43303dy.m94974e(context)) - C9432q.m18687b(context, 250.0f));
                    float b = C9432q.m18687b(context, 50.0f);
                    float b2 = C9432q.m18687b(context, 250.0f);
                    VESize b3 = aVar.f123645k.f131275u.mo43037b();
                    int i2 = b3.height;
                    int i3 = b3.width;
                    if (i2 > i3) {
                        int i4 = ((width / 2) * i2) / i3;
                        if (i4 >= e) {
                            i4 = e;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i2, (float) i4});
                        ofFloat.setDuration(300);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        C492398 r11 = new AnimatorUpdateListener(i3, i2, width, height, b2) {

                            /* renamed from: a */
                            final /* synthetic */ int f123681a;

                            /* renamed from: b */
                            final /* synthetic */ int f123682b;

                            /* renamed from: c */
                            final /* synthetic */ int f123683c;

                            /* renamed from: d */
                            final /* synthetic */ int f123684d;

                            /* renamed from: e */
                            final /* synthetic */ float f123685e;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                float f = (((float) this.f123681a) * floatValue) / ((float) this.f123682b);
                                int i = (int) ((((float) this.f123683c) - f) / 2.0f);
                                int i2 = (int) (((((float) this.f123684d) - (this.f123685e * animatedFraction)) - floatValue) / 2.0f);
                                int i3 = (int) f;
                                int i4 = (int) floatValue;
                                C49231a.this.f123645k.f131275u.mo43015a(i, i2, i3, i4);
                                C49231a.this.mo97205a(i, i2, i3, i4);
                                C49231a.this.mo97204a((floatValue * 1.0f) / ((float) this.f123682b), i, i2);
                            }

                            {
                                this.f123681a = r2;
                                this.f123682b = r3;
                                this.f123683c = r4;
                                this.f123684d = r5;
                                this.f123685e = r6;
                            }
                        };
                        ofFloat.addUpdateListener(r11);
                        ofFloat.start();
                    } else {
                        int i5 = height;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, ((float) e) / ((float) i5)});
                        ofFloat2.setDuration(300);
                        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                        C492409 r112 = new AnimatorUpdateListener(width, i2, i3, i5, b2, b) {

                            /* renamed from: a */
                            final /* synthetic */ int f123687a;

                            /* renamed from: b */
                            final /* synthetic */ int f123688b;

                            /* renamed from: c */
                            final /* synthetic */ int f123689c;

                            /* renamed from: d */
                            final /* synthetic */ int f123690d;

                            /* renamed from: e */
                            final /* synthetic */ float f123691e;

                            /* renamed from: f */
                            final /* synthetic */ float f123692f;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                float f = floatValue * ((float) this.f123687a);
                                float f2 = (((float) this.f123688b) * f) / ((float) this.f123689c);
                                int i = (int) ((((float) this.f123687a) - f) / 2.0f);
                                int animatedFraction = (int) (((((float) this.f123690d) - ((this.f123691e - this.f123692f) * valueAnimator.getAnimatedFraction())) - f2) / 2.0f);
                                int i2 = (int) f;
                                int i3 = (int) f2;
                                C49231a.this.f123645k.f131275u.mo43015a(i, animatedFraction, i2, i3);
                                C49231a.this.mo97205a(i, animatedFraction, i2, i3);
                                C49231a.this.mo97204a((f2 * 1.0f) / ((float) this.f123688b), i, animatedFraction);
                            }

                            {
                                this.f123687a = r2;
                                this.f123688b = r3;
                                this.f123689c = r4;
                                this.f123690d = r5;
                                this.f123691e = r6;
                                this.f123692f = r7;
                            }
                        };
                        ofFloat2.addUpdateListener(r112);
                        ofFloat2.start();
                    }
                    aVar.f123645k.f131275u.mo43019a(false);
                } else if (zVar.f131509a == 0) {
                    C49231a aVar2 = C49231a.this;
                    int i6 = zVar.f131510b;
                    Context context2 = aVar2.f33834b.getContext();
                    int height2 = aVar2.f33834b.getHeight();
                    int width2 = aVar2.f33834b.getWidth();
                    int e2 = (int) (((float) C43303dy.m94974e(context2)) - C9432q.m18687b(context2, 250.0f));
                    float b4 = C9432q.m18687b(context2, 50.0f);
                    float b5 = C9432q.m18687b(context2, 250.0f);
                    VESize b6 = aVar2.f123645k.f131275u.mo43037b();
                    int i7 = b6.height;
                    int i8 = b6.width;
                    if (i7 > i8) {
                        int i9 = width2 / 2;
                        if ((i9 * height2) / width2 < e2) {
                            e2 = (i9 * i7) / i8;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{(float) e2, (float) i7});
                        ofFloat3.setDuration(300);
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        int i10 = i6;
                        C492332 r113 = new AnimatorUpdateListener(i8, i7, width2, height2, b5) {

                            /* renamed from: a */
                            final /* synthetic */ int f123659a;

                            /* renamed from: b */
                            final /* synthetic */ int f123660b;

                            /* renamed from: c */
                            final /* synthetic */ int f123661c;

                            /* renamed from: d */
                            final /* synthetic */ int f123662d;

                            /* renamed from: e */
                            final /* synthetic */ float f123663e;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                float f = (((float) this.f123659a) * floatValue) / ((float) this.f123660b);
                                int i = (int) ((((float) this.f123661c) - f) / 2.0f);
                                int i2 = (int) (((((float) this.f123662d) - (this.f123663e * (1.0f - animatedFraction))) - floatValue) / 2.0f);
                                int i3 = (int) f;
                                int i4 = (int) floatValue;
                                C49231a.this.f123645k.f131275u.mo43015a(i, i2, i3, i4);
                                C49231a.this.mo97205a(i, i2, i3, i4);
                                C49231a.this.mo97204a((floatValue * 1.0f) / ((float) this.f123660b), i, i2);
                            }

                            {
                                this.f123659a = r2;
                                this.f123660b = r3;
                                this.f123661c = r4;
                                this.f123662d = r5;
                                this.f123663e = r6;
                            }
                        };
                        ofFloat3.addUpdateListener(r113);
                        ofFloat3.addListener(new AnimatorListenerAdapter(i10) {

                            /* renamed from: a */
                            final /* synthetic */ int f123665a;

                            public final void onAnimationEnd(Animator animator) {
                                C49231a.this.f123645k.f131275u.mo43038b(this.f123665a);
                                C49231a.this.f123645k.f131274t.mo110432a(false);
                            }

                            {
                                this.f123665a = r2;
                            }
                        });
                        ofFloat3.start();
                    } else {
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{((float) e2) / ((float) height2), 1.0f});
                        ofFloat4.setDuration(300);
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        int i11 = height2;
                        int i12 = i7;
                        int i13 = i6;
                        C492354 r114 = new AnimatorUpdateListener(width2, i12, i8, i11, b5, b4) {

                            /* renamed from: a */
                            final /* synthetic */ int f123667a;

                            /* renamed from: b */
                            final /* synthetic */ int f123668b;

                            /* renamed from: c */
                            final /* synthetic */ int f123669c;

                            /* renamed from: d */
                            final /* synthetic */ int f123670d;

                            /* renamed from: e */
                            final /* synthetic */ float f123671e;

                            /* renamed from: f */
                            final /* synthetic */ float f123672f;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                float f = floatValue * ((float) this.f123667a);
                                float f2 = (((float) this.f123668b) * f) / ((float) this.f123669c);
                                int i = (int) ((((float) this.f123667a) - f) / 2.0f);
                                int animatedFraction = (int) (((((float) this.f123670d) - ((this.f123671e - this.f123672f) * (1.0f - valueAnimator.getAnimatedFraction()))) - f2) / 2.0f);
                                int i2 = (int) f;
                                int i3 = (int) f2;
                                C49231a.this.f123645k.f131275u.mo43015a(i, animatedFraction, i2, i3);
                                C49231a.this.mo97205a(i, animatedFraction, i2, i3);
                                C49231a.this.mo97204a((f2 * 1.0f) / ((float) this.f123668b), i, animatedFraction);
                            }

                            {
                                this.f123667a = r2;
                                this.f123668b = r3;
                                this.f123669c = r4;
                                this.f123670d = r5;
                                this.f123671e = r6;
                                this.f123672f = r7;
                            }
                        };
                        ofFloat4.addUpdateListener(r114);
                        ofFloat4.addListener(new AnimatorListenerAdapter(i13) {

                            /* renamed from: a */
                            final /* synthetic */ int f123674a;

                            public final void onAnimationEnd(Animator animator) {
                                C49231a.this.f123645k.f131275u.mo43038b(this.f123674a);
                                C49231a.this.f123645k.f131274t.mo110432a(false);
                            }

                            {
                                this.f123674a = r2;
                            }
                        });
                        ofFloat4.start();
                    }
                    aVar2.f123645k.f131275u.mo43019a(true);
                }
                if (C49231a.this.f123646l != null) {
                    C49231a.this.f123646l.mo97161a(zVar);
                }
            }
        });
        this.f123643i.observe(this, new C52953d());
        this.f123644j.observe(this, new C49243b(this));
        this.f123644j.observe(this, new C52953d());
    }

    /* renamed from: a */
    public final void mo97207a(LiveData<VEPreviewParams> liveData) {
        this.f123645k.f131258d = liveData;
    }

    /* renamed from: a */
    public final void mo97208a(C0198r<C20347c> rVar) {
        if (this.f123645k != null) {
            this.f123645k.f131254I = rVar;
        }
    }

    /* renamed from: a */
    static boolean m106233a(int i, int i2) {
        return C43302dx.m94966a(i2, i);
    }

    /* renamed from: a */
    public final void mo97206a(int i, C50552p pVar) {
        this.f123645k = new C52908ad(i);
        this.f123645k.f131278x = pVar;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity v = mo24477v();
        FrameLayout frameLayout = new FrameLayout(v);
        this.f123647m = new SurfaceView(v);
        this.f123647m.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f123647m);
        this.f123648n = new ImageView(v);
        this.f123648n.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f123648n);
        this.f123648n.setScaleType(ScaleType.FIT_XY);
        return frameLayout;
    }

    /* renamed from: a */
    public final void mo97204a(float f, int i, int i2) {
        if (this.f123657w == Integer.MAX_VALUE && C45376ac.m98926a(f, 1.0f, 1.0E-5f)) {
            this.f123657w = i2;
        }
        float f2 = (float) i;
        this.f123654t.mo22530c(new C48988f(f, f2, ((float) (i2 - this.f123657w)) + this.f123650p));
        this.f123654t.mo22530c(new C48989g(f, f2, ((float) (i2 - this.f123657w)) + this.f123650p));
        this.f123655u.mo22530c(new C48954e(f, f2, ((float) (i2 - this.f123657w)) + this.f123650p));
        this.f123656v.mo22530c(new C48949d(f, f2, ((float) (i2 - this.f123657w)) + this.f123650p));
    }

    /* renamed from: a */
    private void m106232a(boolean z, final int i, int i2, int i3) {
        float f = (float) i2;
        float f2 = (float) i3;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        if (z) {
            translateAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C49231a.this.f123645k.f131275u.mo43038b(i);
                    C49231a.this.f123645k.f131274t.mo110432a(false);
                }
            });
        }
        this.f33834b.startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C49245d(this));
        ofFloat.start();
    }

    /* renamed from: a */
    public final void mo97205a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) this.f123648n.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.f123648n.setLayoutParams(layoutParams);
    }
}
