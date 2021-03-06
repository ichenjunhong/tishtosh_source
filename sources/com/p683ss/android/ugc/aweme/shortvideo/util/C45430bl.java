package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bl */
public final class C45430bl {
    /* renamed from: a */
    public static void m99001a(View view, float f) {
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
        animatorSet.start();
    }
}
