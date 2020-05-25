package com.bytedance.android.livesdk.gift.effect.entry.p368f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.gift.effect.entry.p363a.C7372a;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.f.a */
public final class C7397a {
    /* renamed from: a */
    public static AnimatorSet m15266a(View view, C7372a aVar) {
        return m15269a(view, aVar, -1);
    }

    /* renamed from: b */
    public static AnimatorSet m15270b(View view, C7372a aVar) {
        return m15268a(view, aVar, 0.0f, 0.0f, 2000);
    }

    /* renamed from: c */
    public static AnimatorSet m15272c(View view, C7372a aVar) {
        return m15271b(view, aVar, -1);
    }

    /* renamed from: a */
    public static AnimatorSet m15269a(View view, C7372a aVar, int i) {
        return m15268a(view, aVar, 80.0f, 40.0f, i);
    }

    /* renamed from: b */
    public static AnimatorSet m15271b(View view, final C7372a aVar, int i) {
        long j;
        float x = view.getX();
        view.getY();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{750.0f, 50.0f}).setDuration(666);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{50.0f, 0.0f});
        if (i > 0) {
            j = (long) i;
        } else {
            j = 1334;
        }
        ObjectAnimator duration2 = ofFloat.setDuration(j);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, -x}).setDuration(333);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.0f}).setDuration(200);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(666);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (aVar != null) {
                    aVar.mo13644a(animator);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{duration4, duration5});
        animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(new Animator[]{animatorSet2, animatorSet3});
        animatorSet.addListener(aVar);
        return animatorSet;
    }

    /* renamed from: a */
    public static AnimatorSet m15267a(View view, C7372a aVar, float f, float f2) {
        return m15268a(view, aVar, 40.0f, -40.0f, -1);
    }

    /* renamed from: a */
    private static AnimatorSet m15268a(View view, final C7372a aVar, float f, float f2, int i) {
        float x = view.getX();
        view.getY();
        long j = 500;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{x, f}).setDuration(500);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", new float[]{f, f2}).setDuration(2000);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f2, -x});
        if (i > 0) {
            j = (long) i;
        }
        ObjectAnimator duration3 = ofFloat.setDuration(j);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (aVar != null) {
                    aVar.mo13644a(animator);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(aVar);
        return animatorSet;
    }
}
