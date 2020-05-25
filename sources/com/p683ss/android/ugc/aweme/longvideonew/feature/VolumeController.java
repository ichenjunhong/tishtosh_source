package com.p683ss.android.ugc.aweme.longvideonew.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.C0183j;
import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView.C23615b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController */
public final class VolumeController implements C0183j, C23422a {

    /* renamed from: a */
    public AnimatorSet f93290a;

    /* renamed from: b */
    public AnimatorSet f93291b;

    /* renamed from: c */
    public AnimatorSet f93292c;

    /* renamed from: d */
    public final AudioControlView f93293d;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController$a */
    public static final class C36422a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f93295a;

        C36422a(VolumeController volumeController) {
            this.f93295a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f93295a.f93293d.mo48943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.VolumeController$b */
    public static final class C36423b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f93296a;

        C36423b(VolumeController volumeController) {
            this.f93296a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f93296a.f93293d.mo48942b();
        }
    }

    public VolumeController(AudioControlView audioControlView) {
        this.f93293d = audioControlView;
        AudioControlView audioControlView2 = this.f93293d;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new C23615b(this) {

                /* renamed from: a */
                final /* synthetic */ VolumeController f93294a;

                /* renamed from: b */
                public final void mo48962b() {
                    VolumeController volumeController = this.f93294a;
                    AnimatorSet animatorSet = volumeController.f93292c;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AudioControlView audioControlView = volumeController.f93293d;
                    if (audioControlView != null) {
                        audioControlView.setAlpha(1.0f);
                    }
                }

                /* renamed from: a */
                public final void mo48961a() {
                    VolumeController volumeController = this.f93294a;
                    if (volumeController.f93293d != null) {
                        volumeController.f93292c = new AnimatorSet();
                        AnimatorSet animatorSet = volumeController.f93292c;
                        if (animatorSet != null) {
                            animatorSet.play(volumeController.f93293d.getHideVolumeAnim());
                            animatorSet.start();
                        }
                    }
                }

                {
                    this.f93294a = r1;
                }
            });
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                if (this.f93293d != null) {
                    this.f93291b = new AnimatorSet();
                    AnimatorSet animatorSet = this.f93291b;
                    if (animatorSet != null) {
                        animatorSet.play(this.f93293d.getShowVolumeAnim());
                        animatorSet.addListener(new C36422a(this));
                        animatorSet.start();
                    }
                }
                return true;
            case 25:
                if (this.f93293d != null) {
                    this.f93290a = new AnimatorSet();
                    AnimatorSet animatorSet2 = this.f93290a;
                    if (animatorSet2 != null) {
                        animatorSet2.play(this.f93293d.getShowVolumeAnim());
                        animatorSet2.addListener(new C36423b(this));
                        animatorSet2.start();
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
