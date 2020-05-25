package com.bytedance.ies.uikit.p698b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.bytedance.ies.uikit.b.e */
public final class C11076e {
    /* renamed from: a */
    public static AnimatorSet m22421a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }

    /* renamed from: b */
    public static AnimatorSet m22422b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(300);
        return animatorSet;
    }
}
