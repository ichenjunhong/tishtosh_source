package com.bytedance.android.livesdk.gift.effect.normal.p373e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.e.a */
public final class C7423a {

    /* renamed from: a */
    private static final Interpolator f20337a = new Interpolator() {

        /* renamed from: a */
        private final float f20338a = 2.0f;

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 3.0f) + 2.0f)) + 1.0f;
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.e.a$a */
    public static class C7426a implements AnimatorListener {

        /* renamed from: a */
        private C7428c f20340a;

        /* renamed from: b */
        private C7427b f20341b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f20340a != null) {
                switch (this.f20341b) {
                    case entry:
                        this.f20340a.mo13718a();
                        return;
                    case comb:
                        this.f20340a.mo13719b();
                        return;
                    case show:
                        this.f20340a.mo13720c();
                        return;
                    default:
                        this.f20340a.mo13721d();
                        this.f20340a = null;
                        return;
                }
            }
        }

        public C7426a(C7427b bVar, C7428c cVar) {
            this.f20340a = cVar;
            this.f20341b = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.e.a$b */
    public enum C7427b {
        entry,
        comb,
        show,
        exit
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.e.a$c */
    public interface C7428c {
        /* renamed from: a */
        void mo13718a();

        /* renamed from: b */
        void mo13719b();

        /* renamed from: c */
        void mo13720c();

        /* renamed from: d */
        void mo13721d();
    }

    /* renamed from: a */
    public static AnimatorSet m15310a(View view, C7428c cVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", new float[]{4.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{4.0f, 1.0f}).setDuration(300);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 1.5f}).setDuration(100);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 1.5f}).setDuration(100);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.5f, 1.0f}).setDuration(100);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.5f, 1.0f}).setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{duration4, duration5});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{duration6, duration7});
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(new Animator[]{animatorSet, animatorSet2, animatorSet3});
        animatorSet4.addListener(new C7426a(C7427b.comb, cVar));
        return animatorSet4;
    }

    /* renamed from: a */
    public static AnimatorSet m15311a(View view, boolean z, C7428c cVar) {
        int i;
        float x = view.getX();
        view.getY();
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        float f = (float) i;
        float f2 = 100.0f * f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{x * f, f2}).setDuration(500);
        float f3 = f * 25.0f;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f2, f3}).setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f3, f3}).setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C7426a(C7427b.entry, cVar));
        return animatorSet;
    }
}
