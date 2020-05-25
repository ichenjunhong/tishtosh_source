package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1896a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.a.b */
public final class C35383b {

    /* renamed from: a */
    public static final C35383b f90914a = new C35383b();

    private C35383b() {
    }

    /* renamed from: a */
    public static void m80019a(View view) {
        C52711k.m112240b(view, "targetView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(700);
        animatorSet.setInterpolator(new C35382a());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }
}
