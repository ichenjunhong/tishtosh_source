package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView.C23615b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController */
public final class VolumeController implements C0183j, C23422a {

    /* renamed from: a */
    AnimatorSet f93133a;

    /* renamed from: b */
    public final FragmentActivity f93134b;

    /* renamed from: c */
    public final AudioControlView f93135c;

    /* renamed from: d */
    private AnimatorSet f93136d;

    /* renamed from: e */
    private AnimatorSet f93137e;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController$a */
    public static final class C36376a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f93139a;

        C36376a(VolumeController volumeController) {
            this.f93139a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f93139a.f93135c.mo48943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.VolumeController$b */
    public static final class C36377b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VolumeController f93140a;

        C36377b(VolumeController volumeController) {
            this.f93140a = volumeController;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f93140a.f93135c.mo48942b();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        AnimatorSet animatorSet = this.f93136d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f93137e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f93133a;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    public VolumeController(FragmentActivity fragmentActivity, AudioControlView audioControlView) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f93134b = fragmentActivity;
        this.f93135c = audioControlView;
        this.f93134b.getLifecycle().mo324a(this);
        AudioControlView audioControlView2 = this.f93135c;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new C23615b(this) {

                /* renamed from: a */
                final /* synthetic */ VolumeController f93138a;

                /* renamed from: b */
                public final void mo48962b() {
                    VolumeController volumeController = this.f93138a;
                    AnimatorSet animatorSet = volumeController.f93133a;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AudioControlView audioControlView = volumeController.f93135c;
                    if (audioControlView != null) {
                        audioControlView.setAlpha(1.0f);
                    }
                }

                /* renamed from: a */
                public final void mo48961a() {
                    VolumeController volumeController = this.f93138a;
                    if (volumeController.f93135c != null) {
                        volumeController.f93133a = new AnimatorSet();
                        AnimatorSet animatorSet = volumeController.f93133a;
                        if (animatorSet != null) {
                            animatorSet.play(volumeController.f93135c.getHideVolumeAnim());
                            animatorSet.start();
                        }
                    }
                }

                {
                    this.f93138a = r1;
                }
            });
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                if (this.f93135c != null) {
                    this.f93137e = new AnimatorSet();
                    AnimatorSet animatorSet = this.f93137e;
                    if (animatorSet != null) {
                        animatorSet.play(this.f93135c.getShowVolumeAnim());
                        animatorSet.addListener(new C36376a(this));
                        animatorSet.start();
                    }
                }
                return true;
            case 25:
                if (this.f93135c != null) {
                    this.f93136d = new AnimatorSet();
                    AnimatorSet animatorSet2 = this.f93136d;
                    if (animatorSet2 != null) {
                        animatorSet2.play(this.f93135c.getShowVolumeAnim());
                        animatorSet2.addListener(new C36377b(this));
                        animatorSet2.start();
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
